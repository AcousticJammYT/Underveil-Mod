
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModItems;

public class BloodstoneHoeItem extends HoeItem {
	public BloodstoneHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 230;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UnderveilModItems.BLOODSTONE_INGOT));
			}
		}, 0, -3f, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).fireResistant());
		setRegistryName("bloodstone_hoe");
	}
}
