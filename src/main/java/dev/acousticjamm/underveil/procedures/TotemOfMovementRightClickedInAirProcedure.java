package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import java.util.Random;
import java.util.Collections;

import dev.acousticjamm.underveil.init.UnderveilModItems;

public class TotemOfMovementRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double XFactor = 0;
		double ZFactor = 0;
		double XNeg = 0;
		double ZNeg = 0;
		entity.hurt(DamageSource.GENERIC, (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 2));
		if (Math.random() < 0.5) {
			XNeg = -1;
		} else {
			XNeg = 1;
		}
		if (Math.random() < 0.5) {
			ZNeg = -1;
		} else {
			ZNeg = 1;
		}
		XFactor = Math.random() * 10 * XNeg;
		ZFactor = Math.random() * 10 * ZNeg;
		{
			Entity _ent = entity;
			_ent.teleportTo((entity.getX() + XFactor),
					(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (entity.getX() + XFactor), (int) (entity.getZ() + ZFactor))),
					(entity.getZ() + ZFactor));
			if (_ent instanceof ServerPlayer _serverPlayer) {
				_serverPlayer.connection
						.teleport((entity.getX() + XFactor),
								(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (entity.getX() + XFactor),
										(int) (entity.getZ() + ZFactor))),
								(entity.getZ() + ZFactor), _ent.getYRot(), _ent.getXRot(), Collections.emptySet());
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == UnderveilModItems.TOTEM_OF_MOVEMENT) {
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == UnderveilModItems.TOTEM_OF_MOVEMENT) {
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
	}
}
