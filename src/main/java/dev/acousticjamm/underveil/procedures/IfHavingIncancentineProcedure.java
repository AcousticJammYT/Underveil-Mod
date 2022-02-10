package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import dev.acousticjamm.underveil.init.UnderveilModItems;

public class IfHavingIncancentineProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == UnderveilModItems.INCANCENTINE_ARMOR_BOOTS) {
			return true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
				.getItem() == UnderveilModItems.INCANCENTINE_ARMOR_LEGGINGS) {
			return true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
				.getItem() == UnderveilModItems.INCANCENTINE_ARMOR_CHESTPLATE) {
			return true;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == UnderveilModItems.INCANCENTINE_ARMOR_HELMET) {
			return true;
		}
		if (ItemTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:incancentine"))
				.contains((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem())) {
			return true;
		}
		if (ItemTags.getAllTags().getTagOrEmpty(new ResourceLocation("forge:incancentine"))
				.contains((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem())) {
			return true;
		}
		return false;
	}
}
