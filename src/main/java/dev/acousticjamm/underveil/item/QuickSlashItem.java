
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModItems;

public class QuickSlashItem extends SwordItem {
	public QuickSlashItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return -0.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UnderveilModItems.DARKITE_INGOT));
			}
		}, 3, 16f, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL));
		setRegistryName("quick_slash");
	}
}
