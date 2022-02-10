
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.acousticjamm.underveil.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.ArrayList;

import dev.acousticjamm.underveil.entity.WalkerEntity;
import dev.acousticjamm.underveil.entity.VeilstoneWolfEntity;
import dev.acousticjamm.underveil.entity.VeilKingEntity;
import dev.acousticjamm.underveil.entity.VeilCastleSpawn1Entity;
import dev.acousticjamm.underveil.entity.UnstabliteSnowballEntity;
import dev.acousticjamm.underveil.entity.ThiefEntity;
import dev.acousticjamm.underveil.entity.SwordswomanDwellerEntity;
import dev.acousticjamm.underveil.entity.SoulBurstEntity;
import dev.acousticjamm.underveil.entity.RoyalBlastEntity;
import dev.acousticjamm.underveil.entity.PrincessOfTheVeilEntity;
import dev.acousticjamm.underveil.entity.PrinceOfTheVeilEntity;
import dev.acousticjamm.underveil.entity.LastingKingEntity;
import dev.acousticjamm.underveil.entity.IceballEntity;
import dev.acousticjamm.underveil.entity.FrostEntity;
import dev.acousticjamm.underveil.entity.EverlastingKingEntity;
import dev.acousticjamm.underveil.entity.EtherPearlEntity;
import dev.acousticjamm.underveil.entity.EtherGolemEntity;
import dev.acousticjamm.underveil.entity.DustCreeperEntity;
import dev.acousticjamm.underveil.entity.DarkenedSwordswomanEntity;
import dev.acousticjamm.underveil.entity.DarkenedSwordsmanEntity;
import dev.acousticjamm.underveil.entity.ArcherDwellerEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnderveilModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<UnstabliteSnowballEntity> UNSTABLITE_SNOWBALL = register("entitybulletunstablite_snowball",
			EntityType.Builder.<UnstabliteSnowballEntity>of(UnstabliteSnowballEntity::new, MobCategory.MISC)
					.setCustomClientFactory(UnstabliteSnowballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<EtherPearlEntity> ETHER_PEARL = register("entitybulletether_pearl",
			EntityType.Builder.<EtherPearlEntity>of(EtherPearlEntity::new, MobCategory.MISC).setCustomClientFactory(EtherPearlEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<DustCreeperEntity> DUST_CREEPER = register("dust_creeper",
			EntityType.Builder.<DustCreeperEntity>of(DustCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DustCreeperEntity::new).sized(0.6f, 1.7f));
	public static final EntityType<WalkerEntity> WALKER = register("walker",
			EntityType.Builder.<WalkerEntity>of(WalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WalkerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<ThiefEntity> THIEF = register("thief",
			EntityType.Builder.<ThiefEntity>of(ThiefEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ThiefEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<ArcherDwellerEntity> ARCHER_DWELLER = register("archer_dweller",
			EntityType.Builder.<ArcherDwellerEntity>of(ArcherDwellerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArcherDwellerEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<SwordswomanDwellerEntity> SWORDSWOMAN_DWELLER = register("swordswoman_dweller",
			EntityType.Builder.<SwordswomanDwellerEntity>of(SwordswomanDwellerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwordswomanDwellerEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<DarkenedSwordsmanEntity> DARKENED_SWORDSMAN = register("darkened_swordsman",
			EntityType.Builder.<DarkenedSwordsmanEntity>of(DarkenedSwordsmanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkenedSwordsmanEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<DarkenedSwordswomanEntity> DARKENED_SWORDSWOMAN = register("darkened_swordswoman",
			EntityType.Builder.<DarkenedSwordswomanEntity>of(DarkenedSwordswomanEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(DarkenedSwordswomanEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<VeilstoneWolfEntity> VEILSTONE_WOLF = register("veilstone_wolf",
			EntityType.Builder.<VeilstoneWolfEntity>of(VeilstoneWolfEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VeilstoneWolfEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<FrostEntity> FROST = register("frost",
			EntityType.Builder.<FrostEntity>of(FrostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(8)
					.setUpdateInterval(3).setCustomClientFactory(FrostEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<EtherGolemEntity> ETHER_GOLEM = register("ether_golem",
			EntityType.Builder.<EtherGolemEntity>of(EtherGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EtherGolemEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<IceballEntity> ICEBALL = register("entitybulleticeball",
			EntityType.Builder.<IceballEntity>of(IceballEntity::new, MobCategory.MISC).setCustomClientFactory(IceballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<VeilKingEntity> VEIL_KING = register("veil_king",
			EntityType.Builder.<VeilKingEntity>of(VeilKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(VeilKingEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<EverlastingKingEntity> EVERLASTING_KING = register("everlasting_king",
			EntityType.Builder.<EverlastingKingEntity>of(EverlastingKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EverlastingKingEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<LastingKingEntity> LASTING_KING = register("lasting_king",
			EntityType.Builder.<LastingKingEntity>of(LastingKingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LastingKingEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<SoulBurstEntity> SOUL_BURST = register("entitybulletsoul_burst",
			EntityType.Builder.<SoulBurstEntity>of(SoulBurstEntity::new, MobCategory.MISC).setCustomClientFactory(SoulBurstEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PrinceOfTheVeilEntity> PRINCE_OF_THE_VEIL = register("prince_of_the_veil",
			EntityType.Builder.<PrinceOfTheVeilEntity>of(PrinceOfTheVeilEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrinceOfTheVeilEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<PrincessOfTheVeilEntity> PRINCESS_OF_THE_VEIL = register("princess_of_the_veil",
			EntityType.Builder.<PrincessOfTheVeilEntity>of(PrincessOfTheVeilEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrincessOfTheVeilEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<RoyalBlastEntity> ROYAL_BLAST = register("entitybulletroyal_blast",
			EntityType.Builder.<RoyalBlastEntity>of(RoyalBlastEntity::new, MobCategory.MISC).setCustomClientFactory(RoyalBlastEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<VeilCastleSpawn1Entity> VEIL_CASTLE_SPAWN_1 = register("veil_castle_spawn_1",
			EntityType.Builder.<VeilCastleSpawn1Entity>of(VeilCastleSpawn1Entity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VeilCastleSpawn1Entity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DustCreeperEntity.init();
			WalkerEntity.init();
			ThiefEntity.init();
			ArcherDwellerEntity.init();
			SwordswomanDwellerEntity.init();
			DarkenedSwordsmanEntity.init();
			DarkenedSwordswomanEntity.init();
			VeilstoneWolfEntity.init();
			FrostEntity.init();
			EtherGolemEntity.init();
			VeilKingEntity.init();
			EverlastingKingEntity.init();
			LastingKingEntity.init();
			PrinceOfTheVeilEntity.init();
			PrincessOfTheVeilEntity.init();
			VeilCastleSpawn1Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DUST_CREEPER, DustCreeperEntity.createAttributes().build());
		event.put(WALKER, WalkerEntity.createAttributes().build());
		event.put(THIEF, ThiefEntity.createAttributes().build());
		event.put(ARCHER_DWELLER, ArcherDwellerEntity.createAttributes().build());
		event.put(SWORDSWOMAN_DWELLER, SwordswomanDwellerEntity.createAttributes().build());
		event.put(DARKENED_SWORDSMAN, DarkenedSwordsmanEntity.createAttributes().build());
		event.put(DARKENED_SWORDSWOMAN, DarkenedSwordswomanEntity.createAttributes().build());
		event.put(VEILSTONE_WOLF, VeilstoneWolfEntity.createAttributes().build());
		event.put(FROST, FrostEntity.createAttributes().build());
		event.put(ETHER_GOLEM, EtherGolemEntity.createAttributes().build());
		event.put(VEIL_KING, VeilKingEntity.createAttributes().build());
		event.put(EVERLASTING_KING, EverlastingKingEntity.createAttributes().build());
		event.put(LASTING_KING, LastingKingEntity.createAttributes().build());
		event.put(PRINCE_OF_THE_VEIL, PrinceOfTheVeilEntity.createAttributes().build());
		event.put(PRINCESS_OF_THE_VEIL, PrincessOfTheVeilEntity.createAttributes().build());
		event.put(VEIL_CASTLE_SPAWN_1, VeilCastleSpawn1Entity.createAttributes().build());
	}
}
