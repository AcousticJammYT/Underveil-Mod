package dev.acousticjamm.underveil.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import dev.acousticjamm.underveil.entity.VeilstoneWolfEntity;
import dev.acousticjamm.underveil.client.model.ModelWolf2;

public class VeilstoneWolfRenderer extends MobRenderer<VeilstoneWolfEntity, ModelWolf2<VeilstoneWolfEntity>> {
	public VeilstoneWolfRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWolf2(context.bakeLayer(ModelWolf2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VeilstoneWolfEntity entity) {
		return new ResourceLocation("underveil:textures/veilstone_wolf.png");
	}
}
