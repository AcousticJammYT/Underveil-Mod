package dev.acousticjamm.underveil.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

import dev.acousticjamm.underveil.init.UnderveilModGameRules;

@Mod.EventBusSubscriber
public class ThiefStealingProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			execute(event, entity.level, entity, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack entityItem = ItemStack.EMPTY;
		ItemStack entityItemCopy = ItemStack.EMPTY;
		ItemStack entityItem2 = ItemStack.EMPTY;
		if (Math.random() <= 0.2) {
			if (world.getLevelData().getGameRules().getBoolean(UnderveilModGameRules.THIEVERY)) {
				if (EntityTypeTags.getAllTags().getTagOrEmpty(new ResourceLocation("underveil:thief_tag")).contains(sourceentity.getType())) {
					entityItem = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					entityItem2 = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
					if (!((entityItem).getItem() == Blocks.AIR.asItem()
							|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, (entityItem)) != 0)) {
						if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(0, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 0;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 1;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 2;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(3, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 3;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(4, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 4;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(5, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 5;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(6, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 6;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(7, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 7;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(8, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 8;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(9, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 9;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(10, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 10;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(11, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 11;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(12, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 12;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(13, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 13;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(14, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 14;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(15, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 15;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(16, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 16;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(17, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 16;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						}
					} else if (!((entityItem2).getItem() == Blocks.AIR.asItem()
							|| EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, (entityItem)) != 0)) {
						if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(0, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 0;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 1;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 2;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(3, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 3;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(4, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 4;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(5, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 5;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(6, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 6;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(7, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 7;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(8, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 8;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(9, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 9;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(10, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 10;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(11, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 11;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(12, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 12;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(13, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 13;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(14, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 14;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(15, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 15;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(16, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 16;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(17, sourceentity)).getItem() == Blocks.AIR.asItem()) {
							entityItemCopy = ((entityItem2).copy());
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(Blocks.AIR);
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
								if (_entity instanceof ServerPlayer _serverPlayer)
									_serverPlayer.getInventory().setChanged();
							}
							{
								final ItemStack _setstack = (entityItemCopy);
								final int _sltid = 16;
								_setstack.setCount(((entityItemCopy)).getCount());
								sourceentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable _modHandler)
										_modHandler.setStackInSlot(_sltid, _setstack);
								});
							}
						}
					}
				}
			}
		}
	}
}
