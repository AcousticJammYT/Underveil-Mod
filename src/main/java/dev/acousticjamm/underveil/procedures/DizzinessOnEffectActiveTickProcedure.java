package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import dev.acousticjamm.underveil.network.UnderveilModVariables;
import dev.acousticjamm.underveil.init.UnderveilModMobEffects;

public class DizzinessOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.setYRot((float) (entity.getYRot() + (entity.getCapability(UnderveilModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UnderveilModVariables.PlayerVariables())).dizzy_dir
					* ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(UnderveilModMobEffects.DIZZINESS)
							? _livEnt.getEffect(UnderveilModMobEffects.DIZZINESS).getAmplifier()
							: 0) + 1)));
			_ent.setXRot(entity.getXRot());
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
	}
}
