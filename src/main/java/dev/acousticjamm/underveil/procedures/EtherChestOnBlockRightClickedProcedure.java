package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import dev.acousticjamm.underveil.init.UnderveilModItems;

public class EtherChestOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == UnderveilModItems.ETHER_KEY) {
			if (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).canOcclude() == true) {
				if (entity instanceof Player _player)
					_player.closeContainer();
			}
		} else {
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("You need an Ether Key to open this container."), (true));
		}
	}
}
