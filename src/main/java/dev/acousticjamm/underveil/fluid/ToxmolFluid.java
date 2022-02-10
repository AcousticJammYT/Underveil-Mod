
package dev.acousticjamm.underveil.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import dev.acousticjamm.underveil.init.UnderveilModItems;
import dev.acousticjamm.underveil.init.UnderveilModFluids;
import dev.acousticjamm.underveil.init.UnderveilModBlocks;

public abstract class ToxmolFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> UnderveilModFluids.TOXMOL,
			() -> UnderveilModFluids.FLOWING_TOXMOL,
			FluidAttributes.builder(new ResourceLocation("underveil:blocks/toxmol_still"), new ResourceLocation("underveil:blocks/toxmol_flow"))

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
							.explosionResistance(100f)

							.tickRate(7)

							.bucket(() -> UnderveilModItems.TOXMOL_BUCKET).block(() -> (LiquidBlock) UnderveilModBlocks.TOXMOL);

	private ToxmolFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(2);
	}

	public static class Source extends ToxmolFluid {
		public Source() {
			super();
			setRegistryName("toxmol");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ToxmolFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_toxmol");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
