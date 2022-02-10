package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class FlammableOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isSprinting() && Math.random() <= 0.01) {
			entity.setSecondsOnFire(15);
		}
		if ((EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT,
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0
				|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS,
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0)
				&& Math.random() <= 0.01) {
			entity.setSecondsOnFire(15);
		}
		if (world.getMaxLocalRawBrightness(new BlockPos((int) (entity.getX()), (int) (entity.getY()), (int) (entity.getZ()))) > 12
				&& Math.random() <= 0.005) {
			entity.setSecondsOnFire(15);
		}
	}
}
