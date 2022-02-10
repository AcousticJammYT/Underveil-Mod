
package dev.acousticjamm.underveil.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import dev.acousticjamm.underveil.procedures.EverlastingKingThisEntityKillsAnotherOneProcedure;
import dev.acousticjamm.underveil.procedures.EverlastingKingOnEntityTickUpdateProcedure;
import dev.acousticjamm.underveil.procedures.EverlastingKingEntityIsHurtProcedure;
import dev.acousticjamm.underveil.init.UnderveilModItems;
import dev.acousticjamm.underveil.init.UnderveilModEntities;

public class EverlastingKingEntity extends Monster {
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.WHITE,
			ServerBossEvent.BossBarOverlay.NOTCHED_20);

	public EverlastingKingEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		this(UnderveilModEntities.EVERLASTING_KING, world);
	}

	public EverlastingKingEntity(EntityType<EverlastingKingEntity> type, Level world) {
		super(type, world);
		xpReward = 50;
		setNoAi(false);
		setPersistenceRequired();
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(UnderveilModItems.INCANCENTINE_SWORD));
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new LeapAtTargetGoal(this, (float) 0.5));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, false));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DustCreeperEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ArcherDwellerEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, SwordswomanDwellerEntity.class, false, false));
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		Entity sourceentity = source.getEntity();

		EverlastingKingEntityIsHurtProcedure.execute(world, x, y, z, entity);
		if (source == DamageSource.FALL)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
		super.awardKillScore(entity, score, damageSource);
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity sourceentity = this;
		Level world = this.level;

		EverlastingKingThisEntityKillsAnotherOneProcedure.execute(entity, sourceentity);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		EverlastingKingOnEntityTickUpdateProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 300);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		return builder;
	}
}
