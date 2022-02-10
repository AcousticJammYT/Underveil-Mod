
package dev.acousticjamm.underveil.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import dev.acousticjamm.underveil.procedures.MindControlEffectStartedappliedProcedure;

public class MindControlMobEffect extends MobEffect {
	public MindControlMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10092442);
		setRegistryName("mind_control");
	}

	@Override
	public String getDescriptionId() {
		return "effect.underveil.mind_control";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MindControlEffectStartedappliedProcedure.execute(world, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
