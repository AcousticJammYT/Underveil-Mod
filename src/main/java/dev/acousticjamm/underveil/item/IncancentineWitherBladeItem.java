
package dev.acousticjamm.underveil.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import dev.acousticjamm.underveil.procedures.IncancentineWitherBladeLivingEntityIsHitWithToolProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModItems;

public class IncancentineWitherBladeItem extends SwordItem {
	public IncancentineWitherBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 2061;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UnderveilModItems.INCANCENTINE_INGOT), new ItemStack(UnderveilModItems.VENOMITE_GEM),
						new ItemStack(UnderveilModItems.ETHER_FRAGMENT));
			}
		}, 3, -2.4f, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL));
		setRegistryName("incancentine_wither_blade");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		IncancentineWitherBladeLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}
}
