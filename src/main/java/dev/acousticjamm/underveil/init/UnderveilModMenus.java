
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.world.inventory.ThiefGuiMenu;
import dev.acousticjamm.underveil.world.inventory.ForgingTableGuiMenu;
import dev.acousticjamm.underveil.world.inventory.FFGUIMenu;
import dev.acousticjamm.underveil.world.inventory.EtherChestGUIMenu;
import dev.acousticjamm.underveil.world.inventory.DwellerTradeGUIMenu;
import dev.acousticjamm.underveil.world.inventory.CrateGUIMenu;
import dev.acousticjamm.underveil.world.inventory.BackpackGUIMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CrateGUIMenu> CRATE_GUI = register("crate_gui", (id, inv, extraData) -> new CrateGUIMenu(id, inv, extraData));
	public static final MenuType<FFGUIMenu> FFGUI = register("ffgui", (id, inv, extraData) -> new FFGUIMenu(id, inv, extraData));
	public static final MenuType<DwellerTradeGUIMenu> DWELLER_TRADE_GUI = register("dweller_trade_gui",
			(id, inv, extraData) -> new DwellerTradeGUIMenu(id, inv, extraData));
	public static final MenuType<ForgingTableGuiMenu> FORGING_TABLE_GUI = register("forging_table_gui",
			(id, inv, extraData) -> new ForgingTableGuiMenu(id, inv, extraData));
	public static final MenuType<EtherChestGUIMenu> ETHER_CHEST_GUI = register("ether_chest_gui",
			(id, inv, extraData) -> new EtherChestGUIMenu(id, inv, extraData));
	public static final MenuType<ThiefGuiMenu> THIEF_GUI = register("thief_gui", (id, inv, extraData) -> new ThiefGuiMenu(id, inv, extraData));
	public static final MenuType<BackpackGUIMenu> BACKPACK_GUI = register("backpack_gui",
			(id, inv, extraData) -> new BackpackGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
