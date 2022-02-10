package dev.acousticjamm.underveil.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import dev.acousticjamm.underveil.entity.VeilCastleSpawn1Entity;

public class VeilCastleSpawn1Renderer extends HumanoidMobRenderer<VeilCastleSpawn1Entity, HumanoidModel<VeilCastleSpawn1Entity>> {
	public VeilCastleSpawn1Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(VeilCastleSpawn1Entity entity) {
		return new ResourceLocation("underveil:textures/arrow.png");
	}
}
