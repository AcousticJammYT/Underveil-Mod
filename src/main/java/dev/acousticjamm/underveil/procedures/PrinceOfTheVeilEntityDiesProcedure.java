package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.init.UnderveilModMobEffects;

public class PrinceOfTheVeilEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if (entityiterator instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(UnderveilModMobEffects.HERO_OF_THE_VEIL, 48000, 0, (false), (false)));
			}
		}
	}
}
