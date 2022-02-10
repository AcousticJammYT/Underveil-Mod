
package dev.acousticjamm.underveil.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import dev.acousticjamm.underveil.procedures.BurnstoneRecipesProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;

public class BurnstoneIngotItem extends Item {
	public BurnstoneIngotItem() {
		super(new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("burnstone_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BurnstoneRecipesProcedure.execute(entity);
	}
}
