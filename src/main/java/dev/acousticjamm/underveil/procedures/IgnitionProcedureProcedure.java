package dev.acousticjamm.underveil.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import java.util.Map;

import dev.acousticjamm.underveil.init.UnderveilModEnchantments;
import dev.acousticjamm.underveil.init.UnderveilModBlocks;

@Mod.EventBusSubscriber
public class IgnitionProcedureProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		Entity entity = event.getEntity();
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), entity);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack ItemInHamd = ItemStack.EMPTY;
		ItemStack ItemInHamd2 = ItemStack.EMPTY;
		ItemInHamd = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		ItemInHamd2 = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
		if ((ItemInHamd).getItem() == Blocks.TNT.asItem()
				&& EnchantmentHelper.getItemEnchantmentLevel(UnderveilModEnchantments.IGNITION, (ItemInHamd)) > 0) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			((ItemInHamd)).shrink(1);
		} else if ((ItemInHamd2).getItem() == Blocks.TNT.asItem()
				&& EnchantmentHelper.getItemEnchantmentLevel(UnderveilModEnchantments.IGNITION, (ItemInHamd)) > 0) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new PrimedTnt(EntityType.TNT, _level);
				entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			((ItemInHamd2)).shrink(1);
		}
		if ((ItemInHamd).getItem() == UnderveilModBlocks.FORCE_TNT.asItem()
				&& EnchantmentHelper.getItemEnchantmentLevel(UnderveilModEnchantments.IGNITION, (ItemInHamd)) > 0) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = Blocks.AIR.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 6, Explosion.BlockInteraction.BREAK);
			((ItemInHamd)).shrink(1);
		} else if ((ItemInHamd2).getItem() == UnderveilModBlocks.FORCE_TNT.asItem()
				&& EnchantmentHelper.getItemEnchantmentLevel(UnderveilModEnchantments.IGNITION, (ItemInHamd)) > 0) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = Blocks.AIR.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 6, Explosion.BlockInteraction.BREAK);
			((ItemInHamd2)).shrink(1);
		}
	}
}
