package dev.acousticjamm.underveil.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import dev.acousticjamm.underveil.entity.PrincessOfTheVeilEntity;

public class PrincessOfTheVeilRenderer extends HumanoidMobRenderer<PrincessOfTheVeilEntity, HumanoidModel<PrincessOfTheVeilEntity>> {
	public PrincessOfTheVeilRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(PrincessOfTheVeilEntity entity) {
		return new ResourceLocation("underveil:textures/princess.png");
	}
}
