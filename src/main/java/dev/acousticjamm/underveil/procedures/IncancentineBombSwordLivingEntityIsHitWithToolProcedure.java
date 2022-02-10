package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

public class IncancentineBombSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.1) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), (float) 1.5, Explosion.BlockInteraction.NONE);
		}
	}
}
