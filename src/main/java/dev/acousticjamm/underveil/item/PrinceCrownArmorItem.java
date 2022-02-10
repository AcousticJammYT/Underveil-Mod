
package dev.acousticjamm.underveil.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import dev.acousticjamm.underveil.procedures.PrinceCrownArmorHelmetTickEventProcedure;
import dev.acousticjamm.underveil.procedures.PrinceCrownArmorBootsTickEventProcedure;
import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModItems;

public abstract class PrinceCrownArmorItem extends ArmorItem {
	public PrinceCrownArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 200;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UnderveilModItems.DARKITE_INGOT), new ItemStack(UnderveilModItems.VENOMITE_GEM));
			}

			@Override
			public String getName() {
				return "prince_crown_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PrinceCrownArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).fireResistant());
			setRegistryName("prince_crown_armor_helmet");
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("A one-of-a-kind item stolen from the Veil Prince."));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "underveil:textures/models/armor/princecrown__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PrinceCrownArmorHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends PrinceCrownArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL));
			setRegistryName("prince_crown_armor_boots");
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("A one-of-a-kind item stolen from the Veil Princess."));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "underveil:textures/models/armor/princecrown__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PrinceCrownArmorBootsTickEventProcedure.execute(entity);
		}
	}
}
