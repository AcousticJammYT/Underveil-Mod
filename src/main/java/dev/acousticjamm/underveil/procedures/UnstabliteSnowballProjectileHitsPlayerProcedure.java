package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.Entity;

public class UnstabliteSnowballProjectileHitsPlayerProcedure {
	public static void execute(Entity imediatesourceentity) {
		if (imediatesourceentity == null)
			return;
		if (!imediatesourceentity.level.isClientSide())
			imediatesourceentity.discard();
	}
}
