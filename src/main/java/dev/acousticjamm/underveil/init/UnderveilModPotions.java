
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion POTION_OF_AUTO_JUMP = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.AUTO_JUMP, 3600, 0, false, true)).setRegistryName("potion_of_auto_jump"));
	public static final Potion POTION_OF_AUTO_JUMP_TIME = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.AUTO_JUMP, 9600, 0, false, true)).setRegistryName("potion_of_auto_jump_time"));
	public static final Potion MIND_CONTROLL = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.MIND_CONTROL, 1, 0, false, true)).setRegistryName("mind_controll"));
	public static final Potion POTION_OF_AUTORUN = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.AUTORUN, 400, 0, false, true)).setRegistryName("potion_of_autorun"));
	public static final Potion AUTORUN_TIME = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.AUTORUN, 1200, 0, false, true)).setRegistryName("autorun_time"));
	public static final Potion AUTORUN_2 = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.AUTORUN, 400, 1, false, true)).setRegistryName("autorun_2"));
	public static final Potion DIZZY = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.DIZZINESS, 1200, 0, false, true)).setRegistryName("dizzy"));
	public static final Potion DIZZINESS_2 = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.DIZZINESS, 3600, 1, false, true)).setRegistryName("dizziness_2"));
	public static final Potion FLAMMABILE = register(
			new Potion(new MobEffectInstance(UnderveilModMobEffects.FLAMMABLE, 3600, 0, false, true)).setRegistryName("flammabile"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
