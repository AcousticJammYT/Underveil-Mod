package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class JumpPadEntityCollidesInTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos((int) x, (int) y, (int) z)) : false) {
			entity.setDeltaMovement((entity.getDeltaMovement().x()), 1, (entity.getDeltaMovement().z()));
		}
	}
}
