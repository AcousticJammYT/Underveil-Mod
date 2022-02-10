
package dev.acousticjamm.underveil.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import dev.acousticjamm.underveil.procedures.FlismolMobplayerCollidesBlockProcedure;
import dev.acousticjamm.underveil.init.UnderveilModFluids;

public class FlismolBlock extends LiquidBlock {
	public FlismolBlock() {
		super(UnderveilModFluids.FLISMOL, BlockBehaviour.Properties.of(Material.WATER, MaterialColor.STONE).strength(100f)

		);
		setRegistryName("flismol");
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		FlismolMobplayerCollidesBlockProcedure.execute(entity);
	}
}
