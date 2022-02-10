package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import dev.acousticjamm.underveil.init.UnderveilModItems;

public class DarkenedSwordsmanOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.1) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(UnderveilModItems.INCANCENTINE_SWORD);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
		}
		if (Math.random() <= 0.1) {
			if (entity instanceof LivingEntity _entity) {
				if (_entity instanceof Player _player)
					_player.getInventory().armor.set(3, new ItemStack(UnderveilModItems.BLOODSTONE_ARMOR_HELMET));
				else
					_entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(UnderveilModItems.BLOODSTONE_ARMOR_HELMET));
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
		}
		if (Math.random() <= 0.1) {
			if (entity instanceof LivingEntity _entity) {
				if (_entity instanceof Player _player)
					_player.getInventory().armor.set(2, new ItemStack(UnderveilModItems.BLOODSTONE_ARMOR_CHESTPLATE));
				else
					_entity.setItemSlot(EquipmentSlot.CHEST, new ItemStack(UnderveilModItems.BLOODSTONE_ARMOR_CHESTPLATE));
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
		}
		if (Math.random() <= 0.1) {
			if (entity instanceof LivingEntity _entity) {
				if (_entity instanceof Player _player)
					_player.getInventory().armor.set(1, new ItemStack(UnderveilModItems.BLOODSTONE_ARMOR_LEGGINGS));
				else
					_entity.setItemSlot(EquipmentSlot.LEGS, new ItemStack(UnderveilModItems.BLOODSTONE_ARMOR_LEGGINGS));
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
		}
		if (Math.random() <= 0.1) {
			if (entity instanceof LivingEntity _entity) {
				if (_entity instanceof Player _player)
					_player.getInventory().armor.set(0, new ItemStack(UnderveilModItems.BLOODSTONE_ARMOR_BOOTS));
				else
					_entity.setItemSlot(EquipmentSlot.FEET, new ItemStack(UnderveilModItems.BLOODSTONE_ARMOR_BOOTS));
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
		}
	}
}
