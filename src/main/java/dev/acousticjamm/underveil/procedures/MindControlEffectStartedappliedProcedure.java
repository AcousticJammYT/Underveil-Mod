package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import dev.acousticjamm.underveil.init.UnderveilModGameRules;
import dev.acousticjamm.underveil.init.UnderveilModEntities;
import dev.acousticjamm.underveil.entity.SwordswomanDwellerEntity;
import dev.acousticjamm.underveil.entity.DarkenedSwordswomanEntity;
import dev.acousticjamm.underveil.entity.DarkenedSwordsmanEntity;
import dev.acousticjamm.underveil.entity.ArcherDwellerEntity;

public class MindControlEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(UnderveilModGameRules.MINDCONTROLSET) == true) {
			if (entity instanceof ArcherDwellerEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new DarkenedSwordsmanEntity(UnderveilModEntities.DARKENED_SWORDSMAN, _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
			if (entity instanceof SwordswomanDwellerEntity) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new DarkenedSwordswomanEntity(UnderveilModEntities.DARKENED_SWORDSWOMAN, _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
