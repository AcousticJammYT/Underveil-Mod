package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;

import dev.acousticjamm.underveil.network.UnderveilModVariables;

public class VeilCastleSpawn1NaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double y) {
		if (y >= 64 && UnderveilModVariables.MapVariables.get(world).firstLoad == false) {
			return true;
		}
		return false;
	}
}
