
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> MINDCONTROLSET = GameRules.register("mindControlSet", GameRules.Category.MOBS,
			GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> THIEVERY = GameRules.register("thievery", GameRules.Category.MOBS,
			GameRules.BooleanValue.create(true));
}
