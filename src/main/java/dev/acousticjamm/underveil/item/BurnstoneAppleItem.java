
package dev.acousticjamm.underveil.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import dev.acousticjamm.underveil.procedures.BurnstoneAppleFoodEatenProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;

public class BurnstoneAppleItem extends Item {
	public BurnstoneAppleItem() {
		super(new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).stacksTo(64).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

						.build()));
		setRegistryName("burnstone_apple");
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		BurnstoneAppleFoodEatenProcedure.execute(entity);
		return retval;
	}
}
