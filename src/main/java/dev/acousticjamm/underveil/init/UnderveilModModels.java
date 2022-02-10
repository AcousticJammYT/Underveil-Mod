
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import dev.acousticjamm.underveil.client.model.Modelfrostmodel;
import dev.acousticjamm.underveil.client.model.ModelWolf2;
import dev.acousticjamm.underveil.client.model.ModelEtherGolemModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UnderveilModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelEtherGolemModel.LAYER_LOCATION, ModelEtherGolemModel::createBodyLayer);
		event.registerLayerDefinition(Modelfrostmodel.LAYER_LOCATION, Modelfrostmodel::createBodyLayer);
		event.registerLayerDefinition(ModelWolf2.LAYER_LOCATION, ModelWolf2::createBodyLayer);
	}
}
