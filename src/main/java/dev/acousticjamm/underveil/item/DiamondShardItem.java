
package dev.acousticjamm.underveil.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import dev.acousticjamm.underveil.procedures.DiamondShardItemInInventoryTickProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;

public class DiamondShardItem extends Item {
	public DiamondShardItem() {
		super(new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("diamond_shard");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		DiamondShardItemInInventoryTickProcedure.execute(entity);
	}
}
