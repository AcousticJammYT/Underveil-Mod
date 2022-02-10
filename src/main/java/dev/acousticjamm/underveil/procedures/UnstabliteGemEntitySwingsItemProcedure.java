package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import dev.acousticjamm.underveil.init.UnderveilModItems;

public class UnstabliteGemEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double HoldenBerries = 0;
		if (Math.random() <= 0.2) {
			HoldenBerries = (itemstack).getCount();
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(UnderveilModItems.UNSTABLITE_GEM);
				_setstack.setCount((int) (HoldenBerries - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.BREAK);
		}
	}
}
