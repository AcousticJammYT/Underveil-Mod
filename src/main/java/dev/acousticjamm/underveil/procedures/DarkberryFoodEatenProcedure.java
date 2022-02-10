package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class DarkberryFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.2) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 600, 2, (false), (false)));
		}
	}
}
