
package dev.acousticjamm.underveil.world.biome;

import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.levelgen.placement.FrequencyWithExtraChanceDecoratorConfiguration;
import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.Features;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import java.util.Map;
import java.util.HashMap;

import dev.acousticjamm.underveil.world.features.treedecorators.FlisgrassPlainsTrunkDecorator;
import dev.acousticjamm.underveil.world.features.treedecorators.FlisgrassPlainsLeaveDecorator;
import dev.acousticjamm.underveil.world.features.treedecorators.FlisgrassPlainsFruitDecorator;
import dev.acousticjamm.underveil.init.UnderveilModEntities;
import dev.acousticjamm.underveil.init.UnderveilModBlocks;
import dev.acousticjamm.underveil.UnderveilMod;

import com.google.common.collect.ImmutableList;

public class FlisgrassPlainsBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.configured(new SurfaceBuilderBaseConfiguration(UnderveilModBlocks.FLISGRASS.defaultBlockState(),
					UnderveilModBlocks.FLISDIRT.defaultBlockState(), UnderveilModBlocks.FLISDIRT.defaultBlockState()));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607)
				.foliageColorOverride(10387789).grassColorOverride(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().surfaceBuilder(SURFACE_BUILDER);
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("trees", Feature.TREE
				.configured(
						(new TreeConfiguration.TreeConfigurationBuilder(new SimpleStateProvider(UnderveilModBlocks.WET_OAK_LOG.defaultBlockState()),
								new StraightTrunkPlacer(4, 2, 0), new SimpleStateProvider(UnderveilModBlocks.WET_OAK_LEAVES.defaultBlockState()),
								new SimpleStateProvider(Blocks.OAK_SAPLING.defaultBlockState()),
								new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
										.decorators(ImmutableList.of(FlisgrassPlainsLeaveDecorator.INSTANCE, FlisgrassPlainsTrunkDecorator.INSTANCE,
												FlisgrassPlainsFruitDecorator.INSTANCE))
										.build())
				.decorated(Features.Decorators.HEIGHTMAP_SQUARE)
				.decorated(FeatureDecorator.COUNT_EXTRA.configured(new FrequencyWithExtraChanceDecoratorConfiguration(3, 0.1F, 1)))));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, register("seagrass", Feature.SEAGRASS
				.configured(new ProbabilityFeatureConfiguration(0.3F)).count(20).decorated(Features.Decorators.TOP_SOLID_HEIGHTMAP_SQUARE)));
		BiomeDefaultFeatures.addDefaultCarvers(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder().setPlayerCanSpawn();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(UnderveilModEntities.WALKER, 20, 1, 3));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).biomeCategory(Biome.BiomeCategory.NONE).depth(0.1f).scale(0.2f)
				.temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build())
				.generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
		Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(UnderveilMod.MODID, "flisgrass_plains"),
				SURFACE_BUILDER);
		CONFIGURED_FEATURES.forEach((resourceLocation, configuredFeature) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, resourceLocation,
				configuredFeature));
	}

	private static final Map<ResourceLocation, ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = new HashMap<>();

	private static ConfiguredFeature<?, ?> register(String name, ConfiguredFeature<?, ?> configuredFeature) {
		CONFIGURED_FEATURES.put(new ResourceLocation(UnderveilMod.MODID, name + "_flisgrass_plains"), configuredFeature);
		return configuredFeature;
	}
}
