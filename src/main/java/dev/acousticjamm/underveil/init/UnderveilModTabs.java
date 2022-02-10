
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class UnderveilModTabs {
	public static CreativeModeTab TAB_UNDERVEIL;

	public static void load() {
		TAB_UNDERVEIL = new CreativeModeTab("tabunderveil") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UnderveilModItems.INCANCENTINE_PICKAXE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
