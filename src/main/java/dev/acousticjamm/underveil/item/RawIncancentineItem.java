
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import dev.acousticjamm.underveil.init.UnderveilModTabs;

public class RawIncancentineItem extends Item {
	public RawIncancentineItem() {
		super(new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("raw_incancentine");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
