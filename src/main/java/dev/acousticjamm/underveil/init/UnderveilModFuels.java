
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class UnderveilModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == UnderveilModItems.BURNSTONE_INGOT)
			event.setBurnTime(20000);
		else if (event.getItemStack().getItem() == UnderveilModBlocks.BURNSTONE_BLOCK.asItem())
			event.setBurnTime(80000);
	}
}
