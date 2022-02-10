
package dev.acousticjamm.underveil.world.dimension;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import java.util.Set;
import java.util.HashSet;

import dev.acousticjamm.underveil.procedures.UnderveilGenerateProcedure;
import dev.acousticjamm.underveil.init.UnderveilModBlocks;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber
public class UnderveilDimensionDimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {
		@SubscribeEvent
		public static void registerFillerBlocks(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(UnderveilModBlocks.VEILSTONE);
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:slidesand_desert")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:slidesand_desert")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:highlands")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:highlands")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:slowgrass_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:slowgrass_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:poigrass_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:poigrass_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:flismol_ocean")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:flismol_ocean")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:slipgrass_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:slipgrass_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:flisgrass_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:flisgrass_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:withergrass_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:withergrass_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:dustsand_desert")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:dustsand_desert")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:jumpgrass_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:jumpgrass_mountains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:ashgravel_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getTopMaterial().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("underveil:ashgravel_plains")).getGenerationSettings()
					.getSurfaceBuilder().get().config().getUnderMaterial().getBlock());
			event.enqueueWork(() -> {
				WorldCarver.CAVE.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CAVE.replaceableBlocks)
						.addAll(replaceableBlocks).build();
				WorldCarver.CANYON.replaceableBlocks = new ImmutableSet.Builder<Block>().addAll(WorldCarver.CANYON.replaceableBlocks)
						.addAll(replaceableBlocks).build();
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.4, 0.4, 0.4);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}
			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("underveil:underveil_dimension"), customEffect));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (event.getTo() == ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("underveil:underveil_dimension"))) {

			UnderveilGenerateProcedure.execute(entity);
		}
	}
}
