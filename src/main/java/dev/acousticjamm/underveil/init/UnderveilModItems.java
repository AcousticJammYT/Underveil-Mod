
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.item.VenomiteGemItem;
import dev.acousticjamm.underveil.item.VeilshroomSoupItem;
import dev.acousticjamm.underveil.item.UnstabliteSnowballItem;
import dev.acousticjamm.underveil.item.UnstabliteGemItem;
import dev.acousticjamm.underveil.item.UnderveilDimensionItem;
import dev.acousticjamm.underveil.item.ToxmolItem;
import dev.acousticjamm.underveil.item.TotemOfMovementItem;
import dev.acousticjamm.underveil.item.SoulBurstItem;
import dev.acousticjamm.underveil.item.RoyalBlastItem;
import dev.acousticjamm.underveil.item.RawVenomiteItem;
import dev.acousticjamm.underveil.item.RawIncancentineItem;
import dev.acousticjamm.underveil.item.RawBloodstoneItem;
import dev.acousticjamm.underveil.item.QuickSlashItem;
import dev.acousticjamm.underveil.item.PrinceCrownArmorItem;
import dev.acousticjamm.underveil.item.IncancentineWitherBladeItem;
import dev.acousticjamm.underveil.item.IncancentineSwordItem;
import dev.acousticjamm.underveil.item.IncancentineSoulSwordItem;
import dev.acousticjamm.underveil.item.IncancentineSlowingSwordItem;
import dev.acousticjamm.underveil.item.IncancentineShovelItem;
import dev.acousticjamm.underveil.item.IncancentinePoibladeItem;
import dev.acousticjamm.underveil.item.IncancentinePickaxeItem;
import dev.acousticjamm.underveil.item.IncancentineLifeswordItem;
import dev.acousticjamm.underveil.item.IncancentineIngotItem;
import dev.acousticjamm.underveil.item.IncancentineHoeItem;
import dev.acousticjamm.underveil.item.IncancentineBombSwordItem;
import dev.acousticjamm.underveil.item.IncancentineAxeItem;
import dev.acousticjamm.underveil.item.IncancentineArmorItem;
import dev.acousticjamm.underveil.item.IceballItem;
import dev.acousticjamm.underveil.item.HardenedIncancentineSwordItem;
import dev.acousticjamm.underveil.item.FrostedAppleItem;
import dev.acousticjamm.underveil.item.FlismolItem;
import dev.acousticjamm.underveil.item.FlasmolItem;
import dev.acousticjamm.underveil.item.EtherSoulItem;
import dev.acousticjamm.underveil.item.EtherPearlItem;
import dev.acousticjamm.underveil.item.EtherKeyItem;
import dev.acousticjamm.underveil.item.EtherFragmentItem;
import dev.acousticjamm.underveil.item.DiamondShardItem;
import dev.acousticjamm.underveil.item.DemonicIncancentineSwordItem;
import dev.acousticjamm.underveil.item.DecayingFleshItem;
import dev.acousticjamm.underveil.item.DarkiteIngotItem;
import dev.acousticjamm.underveil.item.DarkberryItem;
import dev.acousticjamm.underveil.item.CerealSomeItem;
import dev.acousticjamm.underveil.item.CerealMostItem;
import dev.acousticjamm.underveil.item.CerealFullItem;
import dev.acousticjamm.underveil.item.BurnstoneIngotItem;
import dev.acousticjamm.underveil.item.BurnstoneAppleItem;
import dev.acousticjamm.underveil.item.BloodstoneSwordItem;
import dev.acousticjamm.underveil.item.BloodstoneShovelItem;
import dev.acousticjamm.underveil.item.BloodstoneQuickSlashItem;
import dev.acousticjamm.underveil.item.BloodstonePickaxeItem;
import dev.acousticjamm.underveil.item.BloodstoneIngotItem;
import dev.acousticjamm.underveil.item.BloodstoneHoeItem;
import dev.acousticjamm.underveil.item.BloodstoneAxeItem;
import dev.acousticjamm.underveil.item.BloodstoneArmorItem;
import dev.acousticjamm.underveil.item.AudioDiary6Item;
import dev.acousticjamm.underveil.item.AudioDiary5Item;
import dev.acousticjamm.underveil.item.AudioDiary4Item;
import dev.acousticjamm.underveil.item.AudioDiary3Item;
import dev.acousticjamm.underveil.item.AudioDiary2Item;
import dev.acousticjamm.underveil.item.AudioDiary1Item;
import dev.acousticjamm.underveil.item.ArmoredBloodstoneArmorItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ASH_WOOD = register(UnderveilModBlocks.ASH_WOOD, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_LOG = register(UnderveilModBlocks.ASH_LOG, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_PLANKS = register(UnderveilModBlocks.ASH_PLANKS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_CRATE = register(UnderveilModBlocks.ASH_CRATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_STAIRS = register(UnderveilModBlocks.ASH_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_SLAB = register(UnderveilModBlocks.ASH_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_FENCE = register(UnderveilModBlocks.ASH_FENCE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_FENCE_GATE = register(UnderveilModBlocks.ASH_FENCE_GATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_PRESSURE_PLATE = register(UnderveilModBlocks.ASH_PRESSURE_PLATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_BUTTON = register(UnderveilModBlocks.ASH_BUTTON, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_DOOR = register(UnderveilModBlocks.ASH_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_TRAPDOOR = register(UnderveilModBlocks.ASH_TRAPDOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_LEAVES = register(UnderveilModBlocks.ASH_LEAVES, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASH_SAPLING = register(UnderveilModBlocks.ASH_SAPLING, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLIPGRASS = register(UnderveilModBlocks.SLIPGRASS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLIP_DIRT = register(UnderveilModBlocks.SLIP_DIRT, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_WOOD = register(UnderveilModBlocks.MOSLIN_WOOD, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_LOG = register(UnderveilModBlocks.MOSLIN_LOG, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_PLANKS = register(UnderveilModBlocks.MOSLIN_PLANKS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_STAIRS = register(UnderveilModBlocks.MOSLIN_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_SLAB = register(UnderveilModBlocks.MOSLIN_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_FENCE = register(UnderveilModBlocks.MOSLIN_FENCE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_FENCE_GATE = register(UnderveilModBlocks.MOSLIN_FENCE_GATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_PRESSURE_PLATE = register(UnderveilModBlocks.MOSLIN_PRESSURE_PLATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_BUTTON = register(UnderveilModBlocks.MOSLIN_BUTTON, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_DOOR = register(UnderveilModBlocks.MOSLIN_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_TRAPDOOR = register(UnderveilModBlocks.MOSLIN_TRAPDOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_LEAVES = register(UnderveilModBlocks.MOSLIN_LEAVES, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item MOSLIN_SAPLING = register(UnderveilModBlocks.MOSLIN_SAPLING, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item JUMPGRASS = register(UnderveilModBlocks.JUMPGRASS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item JUMPDIRT = register(UnderveilModBlocks.JUMPDIRT, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_WOOD = register(UnderveilModBlocks.WET_OAK_WOOD, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_LOG = register(UnderveilModBlocks.WET_OAK_LOG, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_PLANKS = register(UnderveilModBlocks.WET_OAK_PLANKS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_STAIRS = register(UnderveilModBlocks.WET_OAK_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_SLAB = register(UnderveilModBlocks.WET_OAK_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_FENCE = register(UnderveilModBlocks.WET_OAK_FENCE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_FENCE_GATE = register(UnderveilModBlocks.WET_OAK_FENCE_GATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_PRESSURE_PLATE = register(UnderveilModBlocks.WET_OAK_PRESSURE_PLATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_BUTTON = register(UnderveilModBlocks.WET_OAK_BUTTON, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_DOOR = register(UnderveilModBlocks.WET_OAK_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_TRAPDOOR = register(UnderveilModBlocks.WET_OAK_TRAPDOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_LEAVES = register(UnderveilModBlocks.WET_OAK_LEAVES, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WET_OAK_SAPLING = register(UnderveilModBlocks.WET_OAK_SAPLING, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item FLISGRASS = register(UnderveilModBlocks.FLISGRASS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item FLISDIRT = register(UnderveilModBlocks.FLISDIRT, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_WOOD = register(UnderveilModBlocks.REFLEI_WOOD, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_LOG = register(UnderveilModBlocks.REFLEI_LOG, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_PLANKS = register(UnderveilModBlocks.REFLEI_PLANKS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_STAIRS = register(UnderveilModBlocks.REFLEI_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_SLAB = register(UnderveilModBlocks.REFLEI_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_FENCE = register(UnderveilModBlocks.REFLEI_FENCE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_FENCE_GATE = register(UnderveilModBlocks.REFLEI_FENCE_GATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_PRESSURE_PLATE = register(UnderveilModBlocks.REFLEI_PRESSURE_PLATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_BUTTON = register(UnderveilModBlocks.REFLEI_BUTTON, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_DOOR = register(UnderveilModBlocks.REFLEI_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_TRAP_DOOR = register(UnderveilModBlocks.REFLEI_TRAP_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_LEAVES = register(UnderveilModBlocks.REFLEI_LEAVES, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item REFLEI_SAPLING = register(UnderveilModBlocks.REFLEI_SAPLING, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item POIGRASS = register(UnderveilModBlocks.POIGRASS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item WITHERGRASS = register(UnderveilModBlocks.WITHERGRASS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item POIDIRT = register(UnderveilModBlocks.POIDIRT, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_WOOD = register(UnderveilModBlocks.YUKOI_WOOD, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_LOG = register(UnderveilModBlocks.YUKOI_LOG, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_PLANKS = register(UnderveilModBlocks.YUKOI_PLANKS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_STAIRS = register(UnderveilModBlocks.YUKOI_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_SLAB = register(UnderveilModBlocks.YUKOI_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_FENCE = register(UnderveilModBlocks.YUKOI_FENCE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_FENCE_GATE = register(UnderveilModBlocks.YUKOI_FENCE_GATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_PRESSURE_PLATE = register(UnderveilModBlocks.YUKOI_PRESSURE_PLATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_BUTTON = register(UnderveilModBlocks.YUKOI_BUTTON, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_DOOR = register(UnderveilModBlocks.YUKOI_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_TRAP_DOOR = register(UnderveilModBlocks.YUKOI_TRAP_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_LEAVES = register(UnderveilModBlocks.YUKOI_LEAVES, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item YUKOI_SAPLING = register(UnderveilModBlocks.YUKOI_SAPLING, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLOWGRASS = register(UnderveilModBlocks.SLOWGRASS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLOWDIRT = register(UnderveilModBlocks.SLOWDIRT, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILROCK = register(UnderveilModBlocks.VEILROCK, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE = register(UnderveilModBlocks.VEILSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_STAIRS = register(UnderveilModBlocks.VEILSTONE_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_SLAB = register(UnderveilModBlocks.VEILSTONE_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_WALL = register(UnderveilModBlocks.VEILSTONE_WALL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_PRESSURE_PLATE = register(UnderveilModBlocks.VEILSTONE_PRESSURE_PLATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_BUTTON = register(UnderveilModBlocks.VEILSTONE_BUTTON, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DEEPVEIL = register(UnderveilModBlocks.DEEPVEIL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DEEPVEIL_STAIRS = register(UnderveilModBlocks.DEEPVEIL_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DEEPVEIL_SLAB = register(UnderveilModBlocks.DEEPVEIL_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DEEPVEIL_WALL = register(UnderveilModBlocks.DEEPVEIL_WALL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DEEPVEIL_PRESSURE_PLATE = register(UnderveilModBlocks.DEEPVEIL_PRESSURE_PLATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DEEPVEIL_BUTTON = register(UnderveilModBlocks.DEEPVEIL_BUTTON, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ROUGHVEIL = register(UnderveilModBlocks.ROUGHVEIL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_BRICKS = register(UnderveilModBlocks.VEILSTONE_BRICKS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_BRICKS_STAIRS = register(UnderveilModBlocks.VEILSTONE_BRICKS_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_BRICKS_SLAB = register(UnderveilModBlocks.VEILSTONE_BRICKS_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILSTONE_BRICKS_WALL = register(UnderveilModBlocks.VEILSTONE_BRICKS_WALL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DUST_SAND = register(UnderveilModBlocks.DUST_SAND, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DUSTQUICKSAND = register(UnderveilModBlocks.DUSTQUICKSAND, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DUST_SANDSTONE = register(UnderveilModBlocks.DUST_SANDSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item CHISLED_DUSTSANDSTONE = register(UnderveilModBlocks.CHISLED_DUSTSANDSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item CUT_DUSTSANDSTONE = register(UnderveilModBlocks.CUT_DUSTSANDSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SMOOTH_DUSTSANDSTONE = register(UnderveilModBlocks.SMOOTH_DUSTSANDSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DUSTSANDSTONESTAIRS = register(UnderveilModBlocks.DUSTSANDSTONESTAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DUSTSANDSTONESLAB = register(UnderveilModBlocks.DUSTSANDSTONESLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DUSTSANDSTONE_WALL = register(UnderveilModBlocks.DUSTSANDSTONE_WALL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLIDESAND = register(UnderveilModBlocks.SLIDESAND, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLIDESANDSTONE = register(UnderveilModBlocks.SLIDESANDSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLIDESANDSTONE_STAIRS = register(UnderveilModBlocks.SLIDESANDSTONE_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLIDESANDSTONE_SLAB = register(UnderveilModBlocks.SLIDESANDSTONE_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SLIDESANDSTONE_WALL = register(UnderveilModBlocks.SLIDESANDSTONE_WALL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ASHGRAVEL = register(UnderveilModBlocks.ASHGRAVEL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item FORGING_TABLE = register(UnderveilModBlocks.FORGING_TABLE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item FLASH_FURNACE = register(UnderveilModBlocks.FLASH_FURNACE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item BURNSTONE_INGOT = register(new BurnstoneIngotItem());
	public static final Item BURNSTONEORE = register(UnderveilModBlocks.BURNSTONEORE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item BURNSTONE_BLOCK = register(UnderveilModBlocks.BURNSTONE_BLOCK, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VENOMITE_GEM = register(new VenomiteGemItem());
	public static final Item RAW_VENOMITE = register(new RawVenomiteItem());
	public static final Item VENOMITE_ORE = register(UnderveilModBlocks.VENOMITE_ORE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item INCANCENTINE_INGOT = register(new IncancentineIngotItem());
	public static final Item RAW_INCANCENTINE = register(new RawIncancentineItem());
	public static final Item INCANCENTINE_ORE = register(UnderveilModBlocks.INCANCENTINE_ORE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item INCANCENTINE_BLOCK = register(UnderveilModBlocks.INCANCENTINE_BLOCK, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item BLOODSTONE_INGOT = register(new BloodstoneIngotItem());
	public static final Item RAW_BLOODSTONE = register(new RawBloodstoneItem());
	public static final Item BLOODSTONE_ORE = register(UnderveilModBlocks.BLOODSTONE_ORE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item BLOODSTONE_BLOCK = register(UnderveilModBlocks.BLOODSTONE_BLOCK, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item BLOODSTONE_DOOR = register(UnderveilModBlocks.BLOODSTONE_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item BLOODSTONE_TRAPDOOR = register(UnderveilModBlocks.BLOODSTONE_TRAPDOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DARKITE_INGOT = register(new DarkiteIngotItem());
	public static final Item DARKITE_ORE = register(UnderveilModBlocks.DARKITE_ORE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DARKITE_DOOR = register(UnderveilModBlocks.DARKITE_DOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DARKITE_TRAPDOOR = register(UnderveilModBlocks.DARKITE_TRAPDOOR, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item QUICK_SLASH = register(new QuickSlashItem());
	public static final Item IRON_VEILSTONE = register(UnderveilModBlocks.IRON_VEILSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item GOLD_VEILSTONE = register(UnderveilModBlocks.GOLD_VEILSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DIAMOND_VEILSTONE = register(UnderveilModBlocks.DIAMOND_VEILSTONE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DIAMOND_SHARD = register(new DiamondShardItem());
	public static final Item UNSTABLITE_GEM = register(new UnstabliteGemItem());
	public static final Item UNSTABLITE_ORE = register(UnderveilModBlocks.UNSTABLITE_ORE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item UNSTABLITE_BLOCK = register(UnderveilModBlocks.UNSTABLITE_BLOCK, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item UNSTABLITE_SNOWBALL = register(new UnstabliteSnowballItem());
	public static final Item FLISMOL_BUCKET = register(new FlismolItem());
	public static final Item TOXMOL_BUCKET = register(new ToxmolItem());
	public static final Item FLASMOL_BUCKET = register(new FlasmolItem());
	public static final Item INCANCENTINE_ARMOR_HELMET = register(new IncancentineArmorItem.Helmet());
	public static final Item INCANCENTINE_ARMOR_CHESTPLATE = register(new IncancentineArmorItem.Chestplate());
	public static final Item INCANCENTINE_ARMOR_LEGGINGS = register(new IncancentineArmorItem.Leggings());
	public static final Item INCANCENTINE_ARMOR_BOOTS = register(new IncancentineArmorItem.Boots());
	public static final Item INCANCENTINE_HOE = register(new IncancentineHoeItem());
	public static final Item INCANCENTINE_SHOVEL = register(new IncancentineShovelItem());
	public static final Item INCANCENTINE_SWORD = register(new IncancentineSwordItem());
	public static final Item INCANCENTINE_POIBLADE = register(new IncancentinePoibladeItem());
	public static final Item HARDENED_INCANCENTINE_SWORD = register(new HardenedIncancentineSwordItem());
	public static final Item INCANCENTINE_SLOWING_SWORD = register(new IncancentineSlowingSwordItem());
	public static final Item INCANCENTINE_LIFESWORD = register(new IncancentineLifeswordItem());
	public static final Item INCANCENTINE_SOUL_SWORD = register(new IncancentineSoulSwordItem());
	public static final Item INCANCENTINE_WITHER_BLADE = register(new IncancentineWitherBladeItem());
	public static final Item DEMONIC_INCANCENTINE_SWORD = register(new DemonicIncancentineSwordItem());
	public static final Item INCANCENTINE_BOMB_SWORD = register(new IncancentineBombSwordItem());
	public static final Item INCANCENTINE_AXE = register(new IncancentineAxeItem());
	public static final Item INCANCENTINE_PICKAXE = register(new IncancentinePickaxeItem());
	public static final Item BLOODSTONE_ARMOR_HELMET = register(new BloodstoneArmorItem.Helmet());
	public static final Item BLOODSTONE_ARMOR_CHESTPLATE = register(new BloodstoneArmorItem.Chestplate());
	public static final Item BLOODSTONE_ARMOR_LEGGINGS = register(new BloodstoneArmorItem.Leggings());
	public static final Item BLOODSTONE_ARMOR_BOOTS = register(new BloodstoneArmorItem.Boots());
	public static final Item ARMORED_BLOODSTONE_ARMOR_HELMET = register(new ArmoredBloodstoneArmorItem.Helmet());
	public static final Item ARMORED_BLOODSTONE_ARMOR_CHESTPLATE = register(new ArmoredBloodstoneArmorItem.Chestplate());
	public static final Item ARMORED_BLOODSTONE_ARMOR_LEGGINGS = register(new ArmoredBloodstoneArmorItem.Leggings());
	public static final Item ARMORED_BLOODSTONE_ARMOR_BOOTS = register(new ArmoredBloodstoneArmorItem.Boots());
	public static final Item BLOODSTONE_HOE = register(new BloodstoneHoeItem());
	public static final Item BLOODSTONE_SHOVEL = register(new BloodstoneShovelItem());
	public static final Item BLOODSTONE_SWORD = register(new BloodstoneSwordItem());
	public static final Item BLOODSTONE_PICKAXE = register(new BloodstonePickaxeItem());
	public static final Item BLOODSTONE_AXE = register(new BloodstoneAxeItem());
	public static final Item BLOODSTONE_QUICK_SLASH = register(new BloodstoneQuickSlashItem());
	public static final Item PRINCE_CROWN_ARMOR_HELMET = register(new PrinceCrownArmorItem.Helmet());
	public static final Item PRINCE_CROWN_ARMOR_BOOTS = register(new PrinceCrownArmorItem.Boots());
	public static final Item ETHER_CHEST = register(UnderveilModBlocks.ETHER_CHEST, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ETHER_KEY = register(new EtherKeyItem());
	public static final Item UNDERVEIL_DIMENSION = register(new UnderveilDimensionItem());
	public static final Item FORCE_TNT = register(UnderveilModBlocks.FORCE_TNT, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ETHER_FRAGMENT = register(new EtherFragmentItem());
	public static final Item ETHER_BLOCK = register(UnderveilModBlocks.ETHER_BLOCK, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ETHER_SOUL = register(new EtherSoulItem());
	public static final Item ETHER_PEARL = register(new EtherPearlItem());
	public static final Item DUST_CREEPER = register(
			new SpawnEggItem(UnderveilModEntities.DUST_CREEPER, -6710887, -16777216, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL))
					.setRegistryName("dust_creeper_spawn_egg"));
	public static final Item WALKER = register(
			new SpawnEggItem(UnderveilModEntities.WALKER, -13421773, -6750208, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL))
					.setRegistryName("walker_spawn_egg"));
	public static final Item THIEF = register(
			new SpawnEggItem(UnderveilModEntities.THIEF, -3355444, -10066330, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL))
					.setRegistryName("thief_spawn_egg"));
	public static final Item ARCHER_DWELLER = register(
			new SpawnEggItem(UnderveilModEntities.ARCHER_DWELLER, -16776961, -16777216, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL))
					.setRegistryName("archer_dweller_spawn_egg"));
	public static final Item SWORDSWOMAN_DWELLER = register(
			new SpawnEggItem(UnderveilModEntities.SWORDSWOMAN_DWELLER, -65281, -16777216, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL))
					.setRegistryName("swordswoman_dweller_spawn_egg"));
	public static final Item DARKENED_SWORDSMAN = register(
			new SpawnEggItem(UnderveilModEntities.DARKENED_SWORDSMAN, -16777114, -6710887, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL))
					.setRegistryName("darkened_swordsman_spawn_egg"));
	public static final Item DARKENED_SWORDSWOMAN = register(new SpawnEggItem(UnderveilModEntities.DARKENED_SWORDSWOMAN, -10092442, -6710887,
			new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL)).setRegistryName("darkened_swordswoman_spawn_egg"));
	public static final Item VEILSTONE_WOLF = register(
			new SpawnEggItem(UnderveilModEntities.VEILSTONE_WOLF, -3618616, -6710887, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL))
					.setRegistryName("veilstone_wolf_spawn_egg"));
	public static final Item FROST = register(
			new SpawnEggItem(UnderveilModEntities.FROST, -13369345, -13382401, new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL))
					.setRegistryName("frost_spawn_egg"));
	public static final Item DECAYING_FLESH = register(new DecayingFleshItem());
	public static final Item BERRYCANE = register(UnderveilModBlocks.BERRYCANE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item DARKBERRY = register(new DarkberryItem());
	public static final Item BURNSTONE_APPLE = register(new BurnstoneAppleItem());
	public static final Item VEILSHROOM_SOUP = register(new VeilshroomSoupItem());
	public static final Item CEREAL_FULL = register(new CerealFullItem());
	public static final Item CEREAL_MOST = register(new CerealMostItem());
	public static final Item CEREAL_SOME = register(new CerealSomeItem());
	public static final Item TOTEM_OF_MOVEMENT = register(new TotemOfMovementItem());
	public static final Item VEILSHROOM = register(UnderveilModBlocks.VEILSHROOM, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item VEILDAISY = register(UnderveilModBlocks.VEILDAISY, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item FROSTED_APPLE = register(new FrostedAppleItem());
	public static final Item AUDIO_DIARY_1 = register(new AudioDiary1Item());
	public static final Item AUDIO_DIARY_2 = register(new AudioDiary2Item());
	public static final Item AUDIO_DIARY_3 = register(new AudioDiary3Item());
	public static final Item AUDIO_DIARY_4 = register(new AudioDiary4Item());
	public static final Item AUDIO_DIARY_5 = register(new AudioDiary5Item());
	public static final Item AUDIO_DIARY_6 = register(new AudioDiary6Item());
	public static final Item JUMP_PAD = register(UnderveilModBlocks.JUMP_PAD, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item LANDMINE = register(UnderveilModBlocks.LANDMINE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ICEBALL = register(new IceballItem());
	public static final Item ROUGHVEIL_STAIRS = register(UnderveilModBlocks.ROUGHVEIL_STAIRS, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ROUGHVEIL_SLAB = register(UnderveilModBlocks.ROUGHVEIL_SLAB, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ROUGHVEIL_WALL = register(UnderveilModBlocks.ROUGHVEIL_WALL, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ROUGHVEIL_PRESSURE_PLATE = register(UnderveilModBlocks.ROUGHVEIL_PRESSURE_PLATE, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item ROUGHVEIL_BUTTON = register(UnderveilModBlocks.ROUGHVEIL_BUTTON, UnderveilModTabs.TAB_UNDERVEIL);
	public static final Item SOUL_BURST = register(new SoulBurstItem());
	public static final Item PRINCE_OF_THE_VEIL = register(
			new SpawnEggItem(UnderveilModEntities.PRINCE_OF_THE_VEIL, -1, -1, new Item.Properties().tab(null))
					.setRegistryName("prince_of_the_veil_spawn_egg"));
	public static final Item PRINCESS_OF_THE_VEIL = register(
			new SpawnEggItem(UnderveilModEntities.PRINCESS_OF_THE_VEIL, -1, -1, new Item.Properties().tab(null))
					.setRegistryName("princess_of_the_veil_spawn_egg"));
	public static final Item ROYAL_BLAST = register(new RoyalBlastItem());
	public static final Item VEIL_CASTLE_SPAWN_1 = register(
			new SpawnEggItem(UnderveilModEntities.VEIL_CASTLE_SPAWN_1, -1, -1, new Item.Properties().tab(null))
					.setRegistryName("veil_castle_spawn_1_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
