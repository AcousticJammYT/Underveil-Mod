
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.fluid.ToxmolFluid;
import dev.acousticjamm.underveil.fluid.FlismolFluid;
import dev.acousticjamm.underveil.fluid.FlasmolFluid;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModFluids {
	private static final List<Fluid> REGISTRY = new ArrayList<>();
	public static final FlowingFluid FLISMOL = register(new FlismolFluid.Source());
	public static final FlowingFluid FLOWING_FLISMOL = register(new FlismolFluid.Flowing());
	public static final FlowingFluid TOXMOL = register(new ToxmolFluid.Source());
	public static final FlowingFluid FLOWING_TOXMOL = register(new ToxmolFluid.Flowing());
	public static final FlowingFluid FLASMOL = register(new FlasmolFluid.Source());
	public static final FlowingFluid FLOWING_FLASMOL = register(new FlasmolFluid.Flowing());

	private static FlowingFluid register(FlowingFluid fluid) {
		REGISTRY.add(fluid);
		return fluid;
	}

	@SubscribeEvent
	public static void registerFluids(RegistryEvent.Register<Fluid> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Fluid[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(FLISMOL, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FLISMOL, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(TOXMOL, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TOXMOL, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLASMOL, renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FLASMOL, renderType -> renderType == RenderType.translucent());
		}
	}
}
