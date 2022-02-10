
package dev.acousticjamm.underveil.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import dev.acousticjamm.underveil.init.UnderveilModTabs;
import dev.acousticjamm.underveil.init.UnderveilModSounds;

public class AudioDiary1Item extends RecordItem {
	public AudioDiary1Item() {
		super(0, UnderveilModSounds.REGISTRY.get(new ResourceLocation("underveil:diary1")),
				new Item.Properties().tab(UnderveilModTabs.TAB_UNDERVEIL).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("audio_diary_1");
	}
}
