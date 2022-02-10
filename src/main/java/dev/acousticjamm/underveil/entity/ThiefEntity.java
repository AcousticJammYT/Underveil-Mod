
package dev.acousticjamm.underveil.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.wrapper.EntityHandsInvWrapper;
import net.minecraftforge.items.wrapper.EntityArmorInvWrapper;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import java.util.Set;

import io.netty.buffer.Unpooled;

import dev.acousticjamm.underveil.world.inventory.ThiefGuiMenu;
import dev.acousticjamm.underveil.procedures.ThiefOnEntityTickUpdateProcedure;
import dev.acousticjamm.underveil.procedures.ThiefNaturalEntitySpawningConditionProcedure;
import dev.acousticjamm.underveil.init.UnderveilModItems;
import dev.acousticjamm.underveil.init.UnderveilModEntities;

@Mod.EventBusSubscriber
public class ThiefEntity extends Monster {
	private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("underveil:slidesand_desert"),
			new ResourceLocation("underveil:highlands"), new ResourceLocation("underveil:poigrass_plains"),
			new ResourceLocation("underveil:slowgrass_plains"), new ResourceLocation("underveil:flismol_ocean"),
			new ResourceLocation("underveil:slipgrass_mountains"), new ResourceLocation("underveil:flisgrass_plains"),
			new ResourceLocation("underveil:withergrass_plains"), new ResourceLocation("underveil:dustsand_desert"),
			new ResourceLocation("underveil:jumpgrass_mountains"), new ResourceLocation("underveil:ashgravel_plains"));

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		if (SPAWN_BIOMES.contains(event.getName()))
			event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(UnderveilModEntities.THIEF, 4, 1, 1));
	}

	public ThiefEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		this(UnderveilModEntities.THIEF, world);
	}

	public ThiefEntity(EntityType<ThiefEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(UnderveilModItems.BLOODSTONE_SWORD));
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canContinueToUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ArcherDwellerEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canContinueToUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}
		});
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DarkenedSwordsmanEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canContinueToUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}
		});
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, DarkenedSwordswomanEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canContinueToUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}
		});
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, SwordswomanDwellerEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ThiefEntity.this.getX();
				double y = ThiefEntity.this.getY();
				double z = ThiefEntity.this.getZ();
				Entity entity = ThiefEntity.this;
				Level world = ThiefEntity.this.level;
				return super.canContinueToUse() && ThiefOnEntityTickUpdateProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(9, new AvoidEntityGoal<>(this, VeilKingEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(10, new AvoidEntityGoal<>(this, LastingKingEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(11, new AvoidEntityGoal<>(this, EverlastingKingEntity.class, (float) 6, 1, 1.2));
		this.goalSelector.addGoal(12, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(13, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof ThrownPotion)
			return false;
		return super.hurt(source, amount);
	}

	private final ItemStackHandler inventory = new ItemStackHandler(27) {
		@Override
		public int getSlotLimit(int slot) {
			return 64;
		}
	};
	private final CombinedInvWrapper combined = new CombinedInvWrapper(inventory, new EntityHandsInvWrapper(this), new EntityArmorInvWrapper(this));

	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
		if (this.isAlive() && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && side == null)
			return LazyOptional.of(() -> combined).cast();
		return super.getCapability(capability, side);
	}

	@Override
	protected void dropEquipment() {
		super.dropEquipment();
		for (int i = 0; i < inventory.getSlots(); ++i) {
			ItemStack itemstack = inventory.getStackInSlot(i);
			if (!itemstack.isEmpty() && !EnchantmentHelper.hasVanishingCurse(itemstack)) {
				this.spawnAtLocation(itemstack);
			}
		}
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.put("InventoryCustom", inventory.serializeNBT());
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		Tag inventoryCustom = compound.get("InventoryCustom");
		if (inventoryCustom instanceof CompoundTag inventoryTag)
			inventory.deserializeNBT(inventoryTag);
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		if (sourceentity instanceof ServerPlayer serverPlayer) {
			NetworkHooks.openGui(serverPlayer, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return new TextComponent("Thief");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					FriendlyByteBuf packetBuffer = new FriendlyByteBuf(Unpooled.buffer());
					packetBuffer.writeBlockPos(sourceentity.blockPosition());
					packetBuffer.writeByte(0);
					packetBuffer.writeVarInt(ThiefEntity.this.getId());
					return new ThiefGuiMenu(id, inventory, packetBuffer);
				}
			}, buf -> {
				buf.writeBlockPos(sourceentity.blockPosition());
				buf.writeByte(0);
				buf.writeVarInt(this.getId());
			});
		}
		super.mobInteract(sourceentity, hand);
		return retval;
	}

	public static void init() {
		SpawnPlacements.register(UnderveilModEntities.THIEF, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> {
					int x = pos.getX();
					int y = pos.getY();
					int z = pos.getZ();
					return ThiefNaturalEntitySpawningConditionProcedure.execute(world, x, y, z);
				});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		return builder;
	}
}
