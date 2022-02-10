package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.Entity;

public class FrostAttackProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (!entity.isOnFire()) {
			return true;
		}
		return false;
	}
}
