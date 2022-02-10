
package dev.acousticjamm.underveil.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import dev.acousticjamm.underveil.init.UnderveilModFluids;

public class FlasmolBlock extends LiquidBlock {
	public FlasmolBlock() {
		super(UnderveilModFluids.FLASMOL, BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

				.lightLevel(s -> 8));
		setRegistryName("flasmol");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
