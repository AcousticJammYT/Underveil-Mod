
package dev.acousticjamm.underveil.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import dev.acousticjamm.underveil.procedures.FlammableOnEffectActiveTickProcedure;

public class FlammableMobEffect extends MobEffect {
	public FlammableMobEffect() {
		super(MobEffectCategory.HARMFUL, -39373);
		setRegistryName("flammable");
	}

	@Override
	public String getDescriptionId() {
		return "effect.underveil.flammable";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FlammableOnEffectActiveTickProcedure.execute(world, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
