
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import dev.acousticjamm.underveil.client.renderer.WalkerRenderer;
import dev.acousticjamm.underveil.client.renderer.VeilstoneWolfRenderer;
import dev.acousticjamm.underveil.client.renderer.VeilKingRenderer;
import dev.acousticjamm.underveil.client.renderer.VeilCastleSpawn1Renderer;
import dev.acousticjamm.underveil.client.renderer.ThiefRenderer;
import dev.acousticjamm.underveil.client.renderer.SwordswomanDwellerRenderer;
import dev.acousticjamm.underveil.client.renderer.PrincessOfTheVeilRenderer;
import dev.acousticjamm.underveil.client.renderer.PrinceOfTheVeilRenderer;
import dev.acousticjamm.underveil.client.renderer.LastingKingRenderer;
import dev.acousticjamm.underveil.client.renderer.FrostRenderer;
import dev.acousticjamm.underveil.client.renderer.EverlastingKingRenderer;
import dev.acousticjamm.underveil.client.renderer.EtherGolemRenderer;
import dev.acousticjamm.underveil.client.renderer.DustCreeperRenderer;
import dev.acousticjamm.underveil.client.renderer.DarkenedSwordswomanRenderer;
import dev.acousticjamm.underveil.client.renderer.DarkenedSwordsmanRenderer;
import dev.acousticjamm.underveil.client.renderer.ArcherDwellerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UnderveilModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UnderveilModEntities.UNSTABLITE_SNOWBALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.ETHER_PEARL, ThrownItemRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.DUST_CREEPER, DustCreeperRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.WALKER, WalkerRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.THIEF, ThiefRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.ARCHER_DWELLER, ArcherDwellerRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.SWORDSWOMAN_DWELLER, SwordswomanDwellerRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.DARKENED_SWORDSMAN, DarkenedSwordsmanRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.DARKENED_SWORDSWOMAN, DarkenedSwordswomanRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.VEILSTONE_WOLF, VeilstoneWolfRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.FROST, FrostRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.ETHER_GOLEM, EtherGolemRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.ICEBALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.VEIL_KING, VeilKingRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.EVERLASTING_KING, EverlastingKingRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.LASTING_KING, LastingKingRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.SOUL_BURST, ThrownItemRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.PRINCE_OF_THE_VEIL, PrinceOfTheVeilRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.PRINCESS_OF_THE_VEIL, PrincessOfTheVeilRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.ROYAL_BLAST, ThrownItemRenderer::new);
		event.registerEntityRenderer(UnderveilModEntities.VEIL_CASTLE_SPAWN_1, VeilCastleSpawn1Renderer::new);
	}
}
