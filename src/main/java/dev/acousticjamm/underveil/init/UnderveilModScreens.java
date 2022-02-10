
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import dev.acousticjamm.underveil.client.gui.ThiefGuiScreen;
import dev.acousticjamm.underveil.client.gui.ForgingTableGuiScreen;
import dev.acousticjamm.underveil.client.gui.FFGUIScreen;
import dev.acousticjamm.underveil.client.gui.EtherChestGUIScreen;
import dev.acousticjamm.underveil.client.gui.DwellerTradeGUIScreen;
import dev.acousticjamm.underveil.client.gui.CrateGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UnderveilModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(UnderveilModMenus.CRATE_GUI, CrateGUIScreen::new);
			MenuScreens.register(UnderveilModMenus.FFGUI, FFGUIScreen::new);
			MenuScreens.register(UnderveilModMenus.DWELLER_TRADE_GUI, DwellerTradeGUIScreen::new);
			MenuScreens.register(UnderveilModMenus.FORGING_TABLE_GUI, ForgingTableGuiScreen::new);
			MenuScreens.register(UnderveilModMenus.ETHER_CHEST_GUI, EtherChestGUIScreen::new);
			MenuScreens.register(UnderveilModMenus.THIEF_GUI, ThiefGuiScreen::new);
		});
	}
}
