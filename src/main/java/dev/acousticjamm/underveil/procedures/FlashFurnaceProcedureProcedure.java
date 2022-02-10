package dev.acousticjamm.underveil.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

import dev.acousticjamm.underveil.init.UnderveilModItems;
import dev.acousticjamm.underveil.init.UnderveilModBlocks;

public class FlashFurnaceProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double itemcount = 0;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
				? ((Slot) _slt.get(2)).getItem()
				: ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get()instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY).getItem() == UnderveilModItems.BURNSTONE_INGOT) {
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModBlocks.BURNSTONEORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModBlocks.BURNSTONEORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.BEEF) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_BEEF);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.BEEF);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.CHICKEN) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_CHICKEN);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.CHICKEN);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.COD) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_COD);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COD);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.SALMON) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_SALMON);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.SALMON);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.BAKED_POTATO);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.POTATO);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.MUTTON) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_MUTTON);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.MUTTON);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModBlocks.VENOMITE_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.VENOMITE_GEM);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModBlocks.VENOMITE_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.RABBIT) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_RABBIT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.RABBIT);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModBlocks.INCANCENTINE_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.INCANCENTINE_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModBlocks.INCANCENTINE_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.PORKCHOP) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COOKED_PORKCHOP);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.PORKCHOP);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.KELP.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.DRIED_KELP);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.KELP);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.IRON_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.IRON_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.GOLD_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.GOLD_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.SAND.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.GLASS);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SAND);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.RED_SAND.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.GLASS);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.RED_SAND);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModBlocks.DUST_SAND.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.LIGHT_GRAY_STAINED_GLASS);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModBlocks.DUST_SAND);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.COBBLESTONE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.STONE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.COBBLESTONE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.SANDSTONE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SMOOTH_SANDSTONE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SANDSTONE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.RED_SANDSTONE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SMOOTH_RED_SANDSTONE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.RED_SANDSTONE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.STONE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SMOOTH_STONE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.STONE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.CLAY_BALL) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.BRICK);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.CLAY_BALL);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.CLAY.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.WHITE_TERRACOTTA);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.CLAY);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.NETHERRACK.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.NETHER_BRICK);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.NETHERRACK);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.STONE_BRICKS.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.CRACKED_STONE_BRICKS);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.STONE_BRICKS);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.CACTUS.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.GREEN_DYE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.CACTUS);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModBlocks.ASH_LOG.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.CHARCOAL);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModBlocks.ASH_LOG);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.CHORUS_FRUIT) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.POPPED_CHORUS_FRUIT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.CHORUS_FRUIT);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.WET_SPONGE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SPONGE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.WET_SPONGE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.SEA_PICKLE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.LIME_DYE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.SEA_PICKLE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.DIAMOND_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.DIAMOND);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.LAPIS_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.LAPIS_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.REDSTONE_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.REDSTONE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.REDSTONE_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.COAL_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COAL);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.COAL_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.EMERALD_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.EMERALD);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.EMERALD_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.NETHER_QUARTZ_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.QUARTZ);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.NETHER_QUARTZ_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModBlocks.DUST_SANDSTONE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModBlocks.SMOOTH_DUSTSANDSTONE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModBlocks.DUST_SANDSTONE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModBlocks.DARKITE_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.DARKITE_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModBlocks.DARKITE_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModItems.FROSTED_APPLE) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.APPLE);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.FROSTED_APPLE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModItems.RAW_INCANCENTINE) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.INCANCENTINE_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.RAW_INCANCENTINE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModItems.RAW_VENOMITE) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.VENOMITE_GEM);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.RAW_VENOMITE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == UnderveilModItems.RAW_BLOODSTONE) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BLOODSTONE_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.RAW_BLOODSTONE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.RAW_IRON) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.RAW_IRON);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.RAW_GOLD) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.RAW_GOLD);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.RAW_COPPER) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COPPER_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.RAW_COPPER);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get()instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.COPPER_ORE.asItem()) {
					itemcount = new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get()instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1);
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.COPPER_INGOT);
						_setstack.setCount(1);
						((Slot) _slots.get(2)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.COPPER_ORE);
						_setstack.setCount((int) (itemcount - 1));
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get()instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(UnderveilModItems.BURNSTONE_INGOT);
						_setstack.setCount((int) (new Object() {
							public int getAmount(int sltid) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get()instanceof Map _slots) {
									ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(0) - 1));
						((Slot) _slots.get(0)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			}
		}
	}
}
