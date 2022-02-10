package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class ThiefOnEntityTickUpdateProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (world.canSeeSkyFromBelowWater(new BlockPos((int) (entity.getX()), (int) (entity.getY()), (int) (entity.getZ())))
				&& (world instanceof Level _lvl ? _lvl.isDay() : false)) {
			return false;
		}
		return true;
	}
}
