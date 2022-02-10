
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModFluids;

public class FlasmolItem extends BucketItem {
	public FlasmolItem() {
		super(() -> UnderveilModFluids.FLASMOL,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(UnderveilModTabs.TAB_UNDERVEIL));
		setRegistryName("flasmol_bucket");
	}
}
