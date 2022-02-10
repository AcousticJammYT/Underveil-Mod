
package dev.acousticjamm.underveil.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import dev.acousticjamm.underveil.procedures.AutoJumpActiveTickConditionProcedure;

public class AutoJumpMobEffect extends MobEffect {
	public AutoJumpMobEffect() {
		super(MobEffectCategory.HARMFUL, -3407668);
		setRegistryName("auto_jump");
	}

	@Override
	public String getDescriptionId() {
		return "effect.underveil.auto_jump";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AutoJumpActiveTickConditionProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
