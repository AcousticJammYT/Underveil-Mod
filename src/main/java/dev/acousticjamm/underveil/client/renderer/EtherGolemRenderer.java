package dev.acousticjamm.underveil.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import dev.acousticjamm.underveil.entity.EtherGolemEntity;
import dev.acousticjamm.underveil.client.model.ModelEtherGolemModel;

public class EtherGolemRenderer extends MobRenderer<EtherGolemEntity, ModelEtherGolemModel<EtherGolemEntity>> {
	public EtherGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEtherGolemModel(context.bakeLayer(ModelEtherGolemModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EtherGolemEntity entity) {
		return new ResourceLocation("underveil:textures/ether_golem.png");
	}
}
