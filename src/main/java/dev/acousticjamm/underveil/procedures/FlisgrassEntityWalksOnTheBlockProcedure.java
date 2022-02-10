package dev.acousticjamm.underveil.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import dev.acousticjamm.underveil.init.UnderveilModBlocks;

public class FlisgrassEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.02) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = UnderveilModBlocks.FLISMOL.defaultBlockState();
				world.setBlock(_bp, _bs, 3);
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof Level _level)
						_level.updateNeighborsAt(new BlockPos((int) x, (int) y, (int) z),
								_level.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 1);
		}
	}
}
