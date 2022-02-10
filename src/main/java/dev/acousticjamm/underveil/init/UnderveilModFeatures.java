
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

import dev.acousticjamm.underveil.world.features.plants.VeilshroomFeature;
import dev.acousticjamm.underveil.world.features.plants.VeildaisyFeature;
import dev.acousticjamm.underveil.world.features.plants.BerrycaneFeature;
import dev.acousticjamm.underveil.world.features.ores.VenomiteOreFeature;
import dev.acousticjamm.underveil.world.features.ores.VeilrockFeature;
import dev.acousticjamm.underveil.world.features.ores.UnstabliteOreFeature;
import dev.acousticjamm.underveil.world.features.ores.IronVeilstoneFeature;
import dev.acousticjamm.underveil.world.features.ores.IncancentineOreFeature;
import dev.acousticjamm.underveil.world.features.ores.GoldVeilstoneFeature;
import dev.acousticjamm.underveil.world.features.ores.DustquicksandFeature;
import dev.acousticjamm.underveil.world.features.ores.DiamondVeilstoneFeature;
import dev.acousticjamm.underveil.world.features.ores.DeepveilFeature;
import dev.acousticjamm.underveil.world.features.ores.DarkiteOreFeature;
import dev.acousticjamm.underveil.world.features.ores.BurnstoneoreFeature;
import dev.acousticjamm.underveil.world.features.ores.BloodstoneOreFeature;
import dev.acousticjamm.underveil.world.features.lakes.ToxmolFeature;
import dev.acousticjamm.underveil.world.features.lakes.FlismolFeature;
import dev.acousticjamm.underveil.world.features.lakes.FlasmolFeature;
import dev.acousticjamm.underveil.world.features.VeilstoneTowerFeature;
import dev.acousticjamm.underveil.world.features.VeilhomeFeature;
import dev.acousticjamm.underveil.world.features.VeilgatewayFeature;
import dev.acousticjamm.underveil.world.features.VeilTowerTwoFeature;
import dev.acousticjamm.underveil.world.features.VeilTempleFeature;
import dev.acousticjamm.underveil.world.features.VeilSpawnerFeature;
import dev.acousticjamm.underveil.world.features.FlasmolBowlFeature;
import dev.acousticjamm.underveil.world.features.DwellerHutFeature;
import dev.acousticjamm.underveil.world.features.DustsandPitFeature;
import dev.acousticjamm.underveil.world.features.DarkenedOutpostFeature;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(VeilrockFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VeilrockFeature.GENERATE_BIOMES,
				VeilrockFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DeepveilFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepveilFeature.GENERATE_BIOMES,
				DeepveilFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DustquicksandFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DustquicksandFeature.GENERATE_BIOMES, DustquicksandFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BurnstoneoreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BurnstoneoreFeature.GENERATE_BIOMES, BurnstoneoreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VenomiteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				VenomiteOreFeature.GENERATE_BIOMES, VenomiteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IncancentineOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				IncancentineOreFeature.GENERATE_BIOMES, IncancentineOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BloodstoneOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BloodstoneOreFeature.GENERATE_BIOMES, BloodstoneOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DarkiteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DarkiteOreFeature.GENERATE_BIOMES,
				DarkiteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IronVeilstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				IronVeilstoneFeature.GENERATE_BIOMES, IronVeilstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GoldVeilstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				GoldVeilstoneFeature.GENERATE_BIOMES, GoldVeilstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DiamondVeilstoneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				DiamondVeilstoneFeature.GENERATE_BIOMES, DiamondVeilstoneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(UnstabliteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				UnstabliteOreFeature.GENERATE_BIOMES, UnstabliteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FlismolFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, FlismolFeature.GENERATE_BIOMES, FlismolFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ToxmolFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, ToxmolFeature.GENERATE_BIOMES, ToxmolFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FlasmolFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, FlasmolFeature.GENERATE_BIOMES, FlasmolFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BerrycaneFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BerrycaneFeature.GENERATE_BIOMES,
				BerrycaneFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VeilshroomFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
				VeilshroomFeature.GENERATE_BIOMES, VeilshroomFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VeildaisyFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, VeildaisyFeature.GENERATE_BIOMES,
				VeildaisyFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VeilgatewayFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				VeilgatewayFeature.GENERATE_BIOMES, VeilgatewayFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DwellerHutFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				DwellerHutFeature.GENERATE_BIOMES, DwellerHutFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DustsandPitFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				DustsandPitFeature.GENERATE_BIOMES, DustsandPitFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VeilTempleFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				VeilTempleFeature.GENERATE_BIOMES, VeilTempleFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VeilstoneTowerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				VeilstoneTowerFeature.GENERATE_BIOMES, VeilstoneTowerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(DarkenedOutpostFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				DarkenedOutpostFeature.GENERATE_BIOMES, DarkenedOutpostFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VeilSpawnerFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				VeilSpawnerFeature.GENERATE_BIOMES, VeilSpawnerFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VeilTowerTwoFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				VeilTowerTwoFeature.GENERATE_BIOMES, VeilTowerTwoFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FlasmolBowlFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
				FlasmolBowlFeature.GENERATE_BIOMES, FlasmolBowlFeature.CONFIGURED_FEATURE));
		REGISTRY.put(VeilhomeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, VeilhomeFeature.GENERATE_BIOMES,
				VeilhomeFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
