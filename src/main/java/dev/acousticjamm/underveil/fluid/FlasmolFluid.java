
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import dev.acousticjamm.underveil.init.UnderveilModItems;
import dev.acousticjamm.underveil.init.UnderveilModFluids;
import dev.acousticjamm.underveil.init.UnderveilModBlocks;

public abstract class FlasmolFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> UnderveilModFluids.FLASMOL,
			() -> UnderveilModFluids.FLOWING_FLASMOL,
			FluidAttributes.builder(new ResourceLocation("underveil:blocks/flasmol_still"), new ResourceLocation("underveil:blocks/flasmol_flow"))
					.luminosity(8)

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava")))).explosionResistance(100f)

							.bucket(() -> UnderveilModItems.FLASMOL_BUCKET).block(() -> (LiquidBlock) UnderveilModBlocks.FLASMOL);

	private FlasmolFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(0.6);
	}

	public static class Source extends FlasmolFluid {
		public Source() {
			super();
			setRegistryName("flasmol");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends FlasmolFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_flasmol");
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
