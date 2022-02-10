
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.block.entity.ForgingTableBlockEntity;
import dev.acousticjamm.underveil.block.entity.FlashFurnaceBlockEntity;
import dev.acousticjamm.underveil.block.entity.EtherChestBlockEntity;
import dev.acousticjamm.underveil.block.entity.AshCrateBlockEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> ASH_CRATE = register("underveil:ash_crate", UnderveilModBlocks.ASH_CRATE, AshCrateBlockEntity::new);
	public static final BlockEntityType<?> FORGING_TABLE = register("underveil:forging_table", UnderveilModBlocks.FORGING_TABLE,
			ForgingTableBlockEntity::new);
	public static final BlockEntityType<?> FLASH_FURNACE = register("underveil:flash_furnace", UnderveilModBlocks.FLASH_FURNACE,
			FlashFurnaceBlockEntity::new);
	public static final BlockEntityType<?> ETHER_CHEST = register("underveil:ether_chest", UnderveilModBlocks.ETHER_CHEST,
			EtherChestBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
