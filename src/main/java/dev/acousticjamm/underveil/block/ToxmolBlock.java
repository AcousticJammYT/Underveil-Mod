
package dev.acousticjamm.underveil.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import dev.acousticjamm.underveil.procedures.ToxmolMobplayerCollidesBlockProcedure;
import dev.acousticjamm.underveil.init.UnderveilModFluids;

public class ToxmolBlock extends LiquidBlock {
	public ToxmolBlock() {
		super(UnderveilModFluids.TOXMOL, BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_PURPLE).strength(100f)

		);
		setRegistryName("toxmol");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		ToxmolMobplayerCollidesBlockProcedure.execute(entity);
	}
}
