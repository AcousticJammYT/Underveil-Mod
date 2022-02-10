
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.potion.MindControlMobEffect;
import dev.acousticjamm.underveil.potion.HeroOfTheVeilMobEffect;
import dev.acousticjamm.underveil.potion.FlammableMobEffect;
import dev.acousticjamm.underveil.potion.DizzinessMobEffect;
import dev.acousticjamm.underveil.potion.AutorunMobEffect;
import dev.acousticjamm.underveil.potion.AutoJumpMobEffect;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModMobEffects {
	private static final List<MobEffect> REGISTRY = new ArrayList<>();
	public static final MobEffect AUTO_JUMP = register(new AutoJumpMobEffect());
	public static final MobEffect MIND_CONTROL = register(new MindControlMobEffect());
	public static final MobEffect AUTORUN = register(new AutorunMobEffect());
	public static final MobEffect DIZZINESS = register(new DizzinessMobEffect());
	public static final MobEffect FLAMMABLE = register(new FlammableMobEffect());
	public static final MobEffect HERO_OF_THE_VEIL = register(new HeroOfTheVeilMobEffect());

	private static MobEffect register(MobEffect effect) {
		REGISTRY.add(effect);
		return effect;
	}

	@SubscribeEvent
	public static void registerMobEffects(RegistryEvent.Register<MobEffect> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MobEffect[0]));
	}
}
