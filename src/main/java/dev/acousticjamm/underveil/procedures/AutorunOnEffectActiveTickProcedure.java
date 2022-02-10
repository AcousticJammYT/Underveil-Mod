package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import dev.acousticjamm.underveil.init.UnderveilModMobEffects;

public class AutorunOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double speed = 0;
		double yaw = 0;
		speed = 0.2 * ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(UnderveilModMobEffects.AUTORUN)
				? _livEnt.getEffect(UnderveilModMobEffects.AUTORUN).getAmplifier()
				: 0) + 1);
		yaw = entity.getYRot();
		entity.setDeltaMovement((speed * Math.cos((yaw + 90) * Math.PI / 180)), (entity.getDeltaMovement().y()),
				(speed * Math.sin((yaw + 90) * Math.PI / 180)));
	}
}
