
package dev.acousticjamm.underveil.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import dev.acousticjamm.underveil.procedures.DecayingFleshFoodEatenProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;

public class DecayingFleshItem extends Item {
	public DecayingFleshItem() {
		super(new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(0f)

						.meat().build()));
		setRegistryName("decaying_flesh");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DecayingFleshFoodEatenProcedure.execute(entity);
		return retval;
	}
}
