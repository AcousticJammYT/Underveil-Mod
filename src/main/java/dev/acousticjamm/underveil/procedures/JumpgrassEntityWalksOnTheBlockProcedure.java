package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.Entity;

public class JumpgrassEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(0, 0.5, 0);
	}
}
