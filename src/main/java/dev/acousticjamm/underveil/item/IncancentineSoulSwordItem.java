
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModItems;

public class IncancentineSoulSwordItem extends SwordItem {
	public IncancentineSoulSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2561;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 9.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UnderveilModItems.INCANCENTINE_INGOT), new ItemStack(UnderveilModItems.ETHER_SOUL),
						new ItemStack(UnderveilModItems.ETHER_FRAGMENT));
			}
		}, 3, -1.5f, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL));
		setRegistryName("incancentine_soul_sword");
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
