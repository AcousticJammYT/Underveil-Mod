package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.resources.ResourceLocation;

public class ToxmolMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:human")).contains(entity.getType())) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 0, (false), (false)));
		}
		if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:boat_tag")).contains(entity.getType())) {
			entity.setDeltaMovement((entity.getDeltaMovement().x()), (-0.25), (entity.getDeltaMovement().z()));
		}
	}
}
