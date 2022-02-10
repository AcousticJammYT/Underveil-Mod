package dev.acousticjamm.underveil.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.function.Supplier;
import java.util.Map;
import java.util.Iterator;

import dev.acousticjamm.underveil.init.UnderveilModMobEffects;
import dev.acousticjamm.underveil.init.UnderveilModItems;

public class DwellerTradeProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Count = 0;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(UnderveilModMobEffects.HERO_OF_THE_VEIL) : false) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getItem() == UnderveilModItems.VENOMITE_GEM) {
				Count = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get()instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) - 1;
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(UnderveilModItems.VENOMITE_GEM);
					_setstack.setCount((int) Count);
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("underveil:smart_trade"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (Math.random() < 0.9) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
						_setstack.setCount(6);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.5) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.DIAMOND);
						_setstack.setCount(3);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.4) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.SHIELD);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.1) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.INCANCENTINE_INGOT);
						_setstack.setCount(2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.1) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount(2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 3) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
						_setstack.setCount(5);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_APPLE);
						_setstack.setCount(3);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		} else {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getItem() == UnderveilModItems.VENOMITE_GEM) {
				Count = new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get()instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(0) - 1;
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get()instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(UnderveilModItems.VENOMITE_GEM);
					_setstack.setCount((int) Count);
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("underveil:smart_trade"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (Math.random() < 0.9) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
						_setstack.setCount(2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.5) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.DIAMOND);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.4) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.SHIELD);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.1) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.INCANCENTINE_INGOT);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 0.1) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (Math.random() < 3) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
						_setstack.setCount(2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_APPLE);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			} else {
				entity.hurt(DamageSource.GENERIC, 1);
			}
		}
	}
}
