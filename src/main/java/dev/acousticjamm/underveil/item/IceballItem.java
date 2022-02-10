
package dev.acousticjamm.underveil.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import dev.acousticjamm.underveil.procedures.UnstabliteSnowballRangedItemUsedProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.entity.IceballEntity;

public class IceballItem extends Item {
	public IceballItem() {
		super(new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).stacksTo(64));
		setRegistryName("iceball");
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
		Level world = entityLiving.level;
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				IceballEntity entityarrow = IceballEntity.shoot(world, entity, world.getRandom(), 1f, 4, 2);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;

				UnstabliteSnowballRangedItemUsedProcedure.execute(entity, itemstack);
				entity.releaseUsingItem();
			}
		}
	}
}
