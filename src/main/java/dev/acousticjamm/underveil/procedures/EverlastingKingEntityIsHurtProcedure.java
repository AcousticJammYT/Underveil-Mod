package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.init.UnderveilModEntities;
import dev.acousticjamm.underveil.entity.LastingKingEntity;

public class EverlastingKingEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 30) {
			{
				List<? extends Player> _players = new ArrayList<>(world.players());
				for (Entity entityiterator : _players) {
					if (!entity.level.isClientSide())
						entity.discard();
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LastingKingEntity(UnderveilModEntities.LASTING_KING, _level);
						entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent(
								"<Veil King> I am dying... I have failed to survive you... You're a lot stronger than I thought. However, no matter. I may have failed to protect my own life, but I'll be DAMNED if I don't take you straight to Hell with me."),
								(false));
				}
			}
		}
	}
}
