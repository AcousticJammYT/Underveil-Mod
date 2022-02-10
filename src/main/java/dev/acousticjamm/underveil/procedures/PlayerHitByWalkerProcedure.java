package dev.acousticjamm.underveil.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import dev.acousticjamm.underveil.init.UnderveilModMobEffects;

@Mod.EventBusSubscriber
public class PlayerHitByWalkerProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity, event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("underveil:walk")).contains(sourceentity.getType())) {
			if (Math.random() <= 0.1) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(UnderveilModMobEffects.DIZZINESS, 200, 0, (false), (false)));
			}
			if (Math.random() <= 0.1) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 0, (false), (false)));
			}
		}
	}
}
