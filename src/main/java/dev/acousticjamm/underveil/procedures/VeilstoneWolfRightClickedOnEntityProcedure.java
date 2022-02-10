package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import dev.acousticjamm.underveil.init.UnderveilModBlocks;

public class VeilstoneWolfRightClickedOnEntityProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == UnderveilModBlocks.VEILSTONE.asItem() && (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity instanceof LivingEntity _livEnt
						? _livEnt.getMaxHealth()
						: -1)) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 5));
			(itemstack).shrink(1);
		}
	}
}
