
package dev.acousticjamm.underveil.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

import dev.acousticjamm.underveil.procedures.WithergrassEntityWalksOnTheBlockProcedure;
import dev.acousticjamm.underveil.init.UnderveilModBlocks;

public class WithergrassBlock extends Block {
	public WithergrassBlock() {
		super(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRAVEL).strength(1f, 10f));
		setRegistryName("withergrass");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(UnderveilModBlocks.POIDIRT));
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		WithergrassEntityWalksOnTheBlockProcedure.execute(entity);
	}
}
