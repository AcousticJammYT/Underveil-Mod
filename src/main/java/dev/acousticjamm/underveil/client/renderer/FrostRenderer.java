package dev.acousticjamm.underveil.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import dev.acousticjamm.underveil.entity.FrostEntity;
import dev.acousticjamm.underveil.client.model.Modelfrostmodel;

public class FrostRenderer extends MobRenderer<FrostEntity, Modelfrostmodel<FrostEntity>> {
	public FrostRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfrostmodel(context.bakeLayer(Modelfrostmodel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FrostEntity entity) {
		return new ResourceLocation("underveil:textures/frostmodel.png");
	}
}
