
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import dev.acousticjamm.underveil.init.UnderveilModTabs;

public class EtherSoulItem extends Item {
	public EtherSoulItem() {
		super(new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("ether_soul");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
