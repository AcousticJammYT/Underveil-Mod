
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModItems;

public class BloodstoneSwordItem extends SwordItem {
	public BloodstoneSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 230;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 4f;
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
		}, 3, -3f, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).fireResistant());
		setRegistryName("bloodstone_sword");
	}
}
