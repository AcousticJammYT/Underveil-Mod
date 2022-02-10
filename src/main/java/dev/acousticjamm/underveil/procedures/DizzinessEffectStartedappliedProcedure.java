package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.Entity;

import dev.acousticjamm.underveil.network.UnderveilModVariables;

public class DizzinessEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.5) {
			{
				double _setval = 1;
				entity.getCapability(UnderveilModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dizzy_dir = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = -1;
				entity.getCapability(UnderveilModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dizzy_dir = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
