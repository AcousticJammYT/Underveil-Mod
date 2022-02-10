package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class DeadwalkerNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (ResourceKey.create(Registry.DIMENSION_REGISTRY,
				new ResourceLocation("underveil:underveil_dimension")))) {
			if (world.getMaxLocalRawBrightness(new BlockPos((int) x, (int) y, (int) z)) <= 7) {
				return true;
			}
			return false;
		}
		return false;
	}
}
