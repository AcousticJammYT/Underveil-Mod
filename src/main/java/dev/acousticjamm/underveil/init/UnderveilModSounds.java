
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("underveil", "diary2"), new SoundEvent(new ResourceLocation("underveil", "diary2")));
		REGISTRY.put(new ResourceLocation("underveil", "diary3"), new SoundEvent(new ResourceLocation("underveil", "diary3")));
		REGISTRY.put(new ResourceLocation("underveil", "diary6"), new SoundEvent(new ResourceLocation("underveil", "diary6")));
		REGISTRY.put(new ResourceLocation("underveil", "diary1"), new SoundEvent(new ResourceLocation("underveil", "diary1")));
		REGISTRY.put(new ResourceLocation("underveil", "diary4"), new SoundEvent(new ResourceLocation("underveil", "diary4")));
		REGISTRY.put(new ResourceLocation("underveil", "diary5"), new SoundEvent(new ResourceLocation("underveil", "diary5")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
