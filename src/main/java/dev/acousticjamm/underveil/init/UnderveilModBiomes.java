
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.world.biome.WithergrassPlainsBiome;
import dev.acousticjamm.underveil.world.biome.SlowgrassPlainsBiome;
import dev.acousticjamm.underveil.world.biome.SlipgrassMountainsBiome;
import dev.acousticjamm.underveil.world.biome.SlidesandDesertBiome;
import dev.acousticjamm.underveil.world.biome.PoigrassPlainsBiome;
import dev.acousticjamm.underveil.world.biome.JumpgrassMountainsBiome;
import dev.acousticjamm.underveil.world.biome.HighlandsBiome;
import dev.acousticjamm.underveil.world.biome.FlismolOceanBiome;
import dev.acousticjamm.underveil.world.biome.FlisgrassPlainsBiome;
import dev.acousticjamm.underveil.world.biome.DustsandDesertBiome;
import dev.acousticjamm.underveil.world.biome.AshgravelPlainsBiome;
import dev.acousticjamm.underveil.UnderveilMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome HIGHLANDS = register("highlands", HighlandsBiome.createBiome());
	public static Biome DUSTSAND_DESERT = register("dustsand_desert", DustsandDesertBiome.createBiome());
	public static Biome FLISMOL_OCEAN = register("flismol_ocean", FlismolOceanBiome.createBiome());
	public static Biome SLIPGRASS_MOUNTAINS = register("slipgrass_mountains", SlipgrassMountainsBiome.createBiome());
	public static Biome ASHGRAVEL_PLAINS = register("ashgravel_plains", AshgravelPlainsBiome.createBiome());
	public static Biome SLIDESAND_DESERT = register("slidesand_desert", SlidesandDesertBiome.createBiome());
	public static Biome JUMPGRASS_MOUNTAINS = register("jumpgrass_mountains", JumpgrassMountainsBiome.createBiome());
	public static Biome FLISGRASS_PLAINS = register("flisgrass_plains", FlisgrassPlainsBiome.createBiome());
	public static Biome SLOWGRASS_PLAINS = register("slowgrass_plains", SlowgrassPlainsBiome.createBiome());
	public static Biome POIGRASS_PLAINS = register("poigrass_plains", PoigrassPlainsBiome.createBiome());
	public static Biome WITHERGRASS_PLAINS = register("withergrass_plains", WithergrassPlainsBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(UnderveilMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HighlandsBiome.init();
			DustsandDesertBiome.init();
			FlismolOceanBiome.init();
			SlipgrassMountainsBiome.init();
			AshgravelPlainsBiome.init();
			SlidesandDesertBiome.init();
			JumpgrassMountainsBiome.init();
			FlisgrassPlainsBiome.init();
			SlowgrassPlainsBiome.init();
			PoigrassPlainsBiome.init();
			WithergrassPlainsBiome.init();
		});
	}
}
