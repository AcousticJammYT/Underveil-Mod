
package dev.acousticjamm.underveil.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.Ocelot;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Difficulty;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import java.util.Set;
import java.util.List;

import dev.acousticjamm.underveil.procedures.VeilstoneWolfRightClickedOnEntityProcedure;
import dev.acousticjamm.underveil.procedures.CheckIfTamedProcedure;
import dev.acousticjamm.underveil.init.UnderveilModEntities;

@Mod.EventBusSubscriber
public class VeilstoneWolfEntity extends TamableAnimal {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("underveil:highlands"),
			new ResourceLocation("underveil:slowgrass_plains"), new ResourceLocation("underveil:slipgrass_mountains"),
			new ResourceLocation("underveil:flisgrass_plains"), new ResourceLocation("underveil:jumpgrass_mountains"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(UnderveilModEntities.VEILSTONE_WOLF, 5, 4, 4));
	}

	public VeilstoneWolfEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		this(UnderveilModEntities.VEILSTONE_WOLF, world);
	}

	public VeilstoneWolfEntity(EntityType<VeilstoneWolfEntity> type, Level world) {
		super(type, world);
		xpReward = 1;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new OwnerHurtTargetGoal(this));
		this.goalSelector.addGoal(2, new FollowOwnerGoal(this, 1, (float) 10, (float) 2, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, DustCreeperEntity.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, WalkerEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Sheep.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Cow.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Wolf.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, WitherSkeleton.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Skeleton.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, SkeletonHorse.class, false, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, VeilKingEntity.class, false, false));
		this.goalSelector.addGoal(12, new AvoidEntityGoal<>(this, EverlastingKingEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(13, new AvoidEntityGoal<>(this, LastingKingEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(14, new AvoidEntityGoal<>(this, Cat.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(15, new AvoidEntityGoal<>(this, Ocelot.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(16, new MeleeAttackGoal(this, 1.2, false));
		this.goalSelector.addGoal(17, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(18, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = VeilstoneWolfEntity.this.getX();
				double y = VeilstoneWolfEntity.this.getY();
				double z = VeilstoneWolfEntity.this.getZ();
				Entity entity = VeilstoneWolfEntity.this;
				Level world = VeilstoneWolfEntity.this.level;
				return super.canUse() && CheckIfTamedProcedure.execute(entity);
			}
		}.setAlertOthers(this.getClass()));
		this.goalSelector.addGoal(19, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(20, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.ambient"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wolf.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.CACTUS)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level.isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack))
					? InteractionResult.sidedSuccess(this.level.isClientSide())
					: InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal((float) item.getFoodProperties().getNutrition());
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level.broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level.broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.sidedSuccess(this.level.isClientSide());
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		VeilstoneWolfRightClickedOnEntityProcedure.execute(entity, itemstack);
		return retval;
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		VeilstoneWolfEntity retval = UnderveilModEntities.VEILSTONE_WOLF.create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of(Items.BONE).contains(stack);
	}

	public static void init() {
		SpawnPlacements.register(UnderveilModEntities.VEILSTONE_WOLF, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL
						&& Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
		return builder;
	}
}
