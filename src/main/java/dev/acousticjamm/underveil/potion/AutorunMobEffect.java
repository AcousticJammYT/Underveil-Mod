
package dev.acousticjamm.underveil.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import dev.acousticjamm.underveil.procedures.AutorunOnEffectActiveTickProcedure;

public class AutorunMobEffect extends MobEffect {
	public AutorunMobEffect() {
		super(MobEffectCategory.HARMFUL, -6724096);
		setRegistryName("autorun");
	}

	@Override
	public String getDescriptionId() {
		return "effect.underveil.autorun";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AutorunOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
