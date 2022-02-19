package betathunder.createsmoothies.common.fluid;

import betathunder.createsmoothies.CreateSmoothies;
import betathunder.createsmoothies.common.block.ModBlocks;
import betathunder.createsmoothies.common.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFluids {
	public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
	public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
	public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");

	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
			CreateSmoothies.MOD_ID);

	
	public static final RegistryObject<FlowingFluid> BEETROOT_SMOOTHIE_FLUID = FLUIDS.register(
			"beetroot_smoothie_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.BEETROOT_SMOOTHIE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> BEETROOT_SMOOTHIE_FLOWING = FLUIDS.register(
			"beetroot_smoothie_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.BEETROOT_SMOOTHIE_PROPERTIES));
	public static final ForgeFlowingFluid.Properties BEETROOT_SMOOTHIE_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> BEETROOT_SMOOTHIE_FLUID.get(), () -> BEETROOT_SMOOTHIE_FLOWING.get(),
			FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).sound(SoundEvents.GENERIC_SWIM)
					.overlay(WATER_OVERLAY_RL).color(0xde843131)).slopeFindDistance(4).levelDecreasePerBlock(3)
							.block(() -> ModFluids.BEETROOT_SMOOTHIE_BLOCK.get())
							.bucket(() -> ModItems.BEETROOT_SMOOTHIE_BUCKET.get());
	public static final RegistryObject<FlowingFluidBlock> BEETROOT_SMOOTHIE_BLOCK = ModBlocks.BLOCKS
			.register("beetroot_smoothie_block", () -> new FlowingFluidBlock(() -> BEETROOT_SMOOTHIE_FLUID.get(),
					AbstractBlock.Properties.of(Material.WATER).noDrops().strength(100.0f, 100.0f)));

	
	public static final RegistryObject<FlowingFluid> BEET_JUICE_FLUID = FLUIDS.register("beet_juice_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.BEET_JUICE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> BEET_JUICE_FLOWING = FLUIDS.register("beet_juice_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.BEET_JUICE_PROPERTIES));
	public static final ForgeFlowingFluid.Properties BEET_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> BEET_JUICE_FLUID.get(), () -> BEET_JUICE_FLOWING.get(),
			FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).sound(SoundEvents.GENERIC_SWIM)
					.overlay(WATER_OVERLAY_RL).color(0x80a4272c)).slopeFindDistance(4).levelDecreasePerBlock(3)
							.block(() -> ModFluids.BEET_JUICE_BLOCK.get())
							.bucket(() -> ModItems.BEET_JUICE_BUCKET.get());
	public static final RegistryObject<FlowingFluidBlock> BEET_JUICE_BLOCK = ModBlocks.BLOCKS
			.register("beet_juice_block", () -> new FlowingFluidBlock(() -> BEET_JUICE_FLUID.get(),
					AbstractBlock.Properties.of(Material.WATER).noDrops().strength(100.0f, 100.0f)));
	
	
	public static final RegistryObject<FlowingFluid> SWEET_BEET_BERRY_SHAKE_FLUID = FLUIDS.register("sweet_beet_berry_juice_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.SWEET_BEET_BERRY_SHAKE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> SWEET_BEET_BERRY_SHAKE_FLOWING = FLUIDS.register("sweet_beet_berry_juice_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.SWEET_BEET_BERRY_SHAKE_PROPERTIES));
	public static final ForgeFlowingFluid.Properties SWEET_BEET_BERRY_SHAKE_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> SWEET_BEET_BERRY_SHAKE_FLUID.get(), () -> SWEET_BEET_BERRY_SHAKE_FLOWING.get(),
			FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).sound(SoundEvents.GENERIC_SWIM)
					.overlay(WATER_OVERLAY_RL).color(0x80a50700)).slopeFindDistance(4).levelDecreasePerBlock(3)
							.block(() -> ModFluids.SWEET_BEET_BERRY_SHAKE_BLOCK.get())
							.bucket(() -> ModItems.SWEET_BEET_BERRY_SHAKE_BUCKET.get());
	public static final RegistryObject<FlowingFluidBlock> SWEET_BEET_BERRY_SHAKE_BLOCK = ModBlocks.BLOCKS
			.register("sweet_beet_berry_juice_block", () -> new FlowingFluidBlock(() -> SWEET_BEET_BERRY_SHAKE_FLUID.get(),
					AbstractBlock.Properties.of(Material.WATER).noDrops().strength(100.0f, 100.0f)));

	
	public static final RegistryObject<FlowingFluid> PICKLE_JUICE_FLUID = FLUIDS.register("pickle_juice_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.PICKLE_JUICE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> PICKLE_JUICE_FLOWING = FLUIDS.register("pickle_juice_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.PICKLE_JUICE_PROPERTIES));
	public static final ForgeFlowingFluid.Properties PICKLE_JUICE_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> PICKLE_JUICE_FLUID.get(), () -> PICKLE_JUICE_FLOWING.get(),
			FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).sound(SoundEvents.GENERIC_SWIM)
					.overlay(WATER_OVERLAY_RL).color(0x80c5f4c2)).slopeFindDistance(4).levelDecreasePerBlock(3)
							.block(() -> ModFluids.PICKLE_JUICE_BLOCK.get())
							.bucket(() -> ModItems.PICKLE_JUICE_BUCKET.get());
	public static final RegistryObject<FlowingFluidBlock> PICKLE_JUICE_BLOCK = ModBlocks.BLOCKS
			.register("pickle_juice_block", () -> new FlowingFluidBlock(() -> PICKLE_JUICE_FLUID.get(),
					AbstractBlock.Properties.of(Material.WATER).noDrops().strength(100.0f, 100.0f)));
	
	
	public static final RegistryObject<FlowingFluid> LIQUID_MELODY_FLUID = FLUIDS.register("liquid_melody_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_MELODY_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_MELODY_FLOWING = FLUIDS.register("liquid_melody_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_MELODY_PROPERTIES));
	public static final ForgeFlowingFluid.Properties LIQUID_MELODY_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> LIQUID_MELODY_FLUID.get(), () -> LIQUID_MELODY_FLOWING.get(),
			FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).sound(SoundEvents.GENERIC_SWIM)
					.overlay(WATER_OVERLAY_RL).color(0x80ba9bba)).slopeFindDistance(4).levelDecreasePerBlock(3)
							.block(() -> ModFluids.LIQUID_MELODY_BLOCK.get())
							.bucket(() -> ModItems.LIQUID_MELODY_BUCKET.get());
	public static final RegistryObject<FlowingFluidBlock> LIQUID_MELODY_BLOCK = ModBlocks.BLOCKS
			.register("liquid_melody_block", () -> new FlowingFluidBlock(() -> LIQUID_MELODY_FLUID.get(),
					AbstractBlock.Properties.of(Material.WATER).noDrops().strength(100.0f, 100.0f)));
	
	
	public static final RegistryObject<FlowingFluid> LIQUID_HARMONY_FLUID = FLUIDS.register("liquid_harmony_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_HARMONY_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_HARMONY_FLOWING = FLUIDS.register("liquid_harmony_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_HARMONY_PROPERTIES));
	public static final ForgeFlowingFluid.Properties LIQUID_HARMONY_PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> LIQUID_HARMONY_FLUID.get(), () -> LIQUID_HARMONY_FLOWING.get(),
			FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).sound(SoundEvents.GENERIC_SWIM)
					.overlay(WATER_OVERLAY_RL).color(0x80105e51)).slopeFindDistance(4).levelDecreasePerBlock(3)
							.block(() -> ModFluids.LIQUID_HARMONY_BLOCK.get())
							.bucket(() -> ModItems.LIQUID_HARMONY_BUCKET.get());
	public static final RegistryObject<FlowingFluidBlock> LIQUID_HARMONY_BLOCK = ModBlocks.BLOCKS
			.register("liquid_harmony_block", () -> new FlowingFluidBlock(() -> LIQUID_HARMONY_FLUID.get(),
					AbstractBlock.Properties.of(Material.WATER).noDrops().strength(100.0f, 100.0f)));
	
	public static void registerFluids(IEventBus ie) {
		FLUIDS.register(ie);
	}
}
