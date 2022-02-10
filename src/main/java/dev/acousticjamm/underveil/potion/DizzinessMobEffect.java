
package dev.acousticjamm.underveil.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import dev.acousticjamm.underveil.procedures.DizzinessOnEffectActiveTickProcedure;
import dev.acousticjamm.underveil.procedures.DizzinessEffectStartedappliedProcedure;

public class DizzinessMobEffect extends MobEffect {
	public DizzinessMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
		setRegistryName("dizziness");
	}

	@Override
	public String getDescriptionId() {
		return "effect.underveil.dizziness";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DizzinessEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DizzinessOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
