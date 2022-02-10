
package dev.acousticjamm.underveil.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import dev.acousticjamm.underveil.procedures.IncancentineSlowingSwordToolInHandTickProcedure;
import dev.acousticjamm.underveil.procedures.IncancentineSlowingSwordLivingEntityIsHitWithToolProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;

public class IncancentineSlowingSwordItem extends SwordItem {
	public IncancentineSlowingSwordItem() {
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
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL));
		setRegistryName("incancentine_slowing_sword");
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		Level world = entity.level;

		IncancentineSlowingSwordLivingEntityIsHitWithToolProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			IncancentineSlowingSwordToolInHandTickProcedure.execute(entity);
	}
}
