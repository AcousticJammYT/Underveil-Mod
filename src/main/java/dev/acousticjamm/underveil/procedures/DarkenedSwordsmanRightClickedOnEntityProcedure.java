package dev.acousticjamm.underveil.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import dev.acousticjamm.underveil.init.UnderveilModEntities;
import dev.acousticjamm.underveil.entity.ArcherDwellerEntity;

public class DarkenedSwordsmanRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Items.GOLDEN_APPLE) {
			(itemstack).setCount((int) ((itemstack).getCount() - 1));
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
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ArcherDwellerEntity(UnderveilModEntities.ARCHER_DWELLER, _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 100);
		}
	}
}
