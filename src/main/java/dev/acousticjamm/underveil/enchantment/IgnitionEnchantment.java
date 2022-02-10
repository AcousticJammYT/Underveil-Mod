
package dev.acousticjamm.underveil.enchantment;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import dev.acousticjamm.underveil.init.UnderveilModBlocks;

public class IgnitionEnchantment extends Enchantment {
	public IgnitionEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == UnderveilModBlocks.FORCE_TNT.asItem())
			return true;
		if (stack.getItem() == Blocks.TNT.asItem())
			return true;
		return false;
	}
}
