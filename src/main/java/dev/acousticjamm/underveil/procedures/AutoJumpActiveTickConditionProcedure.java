package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.Entity;

public class AutoJumpActiveTickConditionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnGround()) {
			entity.setDeltaMovement((entity.getDeltaMovement().x()), 0.5, (entity.getDeltaMovement().z()));
		}
	}
}
