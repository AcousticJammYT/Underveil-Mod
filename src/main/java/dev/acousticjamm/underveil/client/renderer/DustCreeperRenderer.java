package dev.acousticjamm.underveil.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import dev.acousticjamm.underveil.entity.DustCreeperEntity;

public class DustCreeperRenderer extends MobRenderer<DustCreeperEntity, CreeperModel<DustCreeperEntity>> {
	public DustCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(DustCreeperEntity entity) {
		return new ResourceLocation("underveil:textures/dust_creeper.png");
	}
}
