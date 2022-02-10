package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.TextComponent;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.init.UnderveilModMobEffects;

public class LastingKingEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		{
			List<? extends Player> _players = new ArrayList<>(world.players());
			for (Entity entityiterator : _players) {
				if (entityiterator instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent(
							"<Veil King> So then... I failed... Why are you so strong...? I guess it shouldn't matter. I will return one day."),
							(false));
				if (entityiterator instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(UnderveilModMobEffects.HERO_OF_THE_VEIL, 48000, 1, (false), (false)));
			}
		}
	}
}
