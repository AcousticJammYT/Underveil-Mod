
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModItems;

public class BloodstoneShovelItem extends ShovelItem {
	public BloodstoneShovelItem() {
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
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UnderveilModItems.BLOODSTONE_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).fireResistant());
		setRegistryName("bloodstone_shovel");
	}
}
