
package dev.acousticjamm.underveil.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import dev.acousticjamm.underveil.procedures.TotemOfMovementRightClickedInAirProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;

public class TotemOfMovementItem extends Item {
	public TotemOfMovementItem() {
		super(new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).durability(5).rarity(Rarity.EPIC));
		setRegistryName("totem_of_movement");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77Right click to teleport somewhere random at a cost."));
		list.add(new TextComponent("\u00A7cUSE AT CAUTION!"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TotemOfMovementRightClickedInAirProcedure.execute(world, entity, itemstack);
		return ar;
	}
}
