package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.Entity;

public class BurnstoneBlockEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() == false) {
			entity.setSecondsOnFire(15);
		}
	}
}
