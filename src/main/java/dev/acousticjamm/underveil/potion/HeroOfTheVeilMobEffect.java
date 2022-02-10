
package dev.acousticjamm.underveil.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HeroOfTheVeilMobEffect extends MobEffect {
	public HeroOfTheVeilMobEffect() {
		super(MobEffectCategory.BENEFICIAL, 16777215);
		setRegistryName("hero_of_the_veil");
	}

	@Override
	public String getDescriptionId() {
		return "effect.underveil.hero_of_the_veil";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
