package betathunder.createsmoothies.common.fluid;

import betathunder.createsmoothies.CreateSmoothies;
import betathunder.createsmoothies.common.block.ModBlocks;
import betathunder.createsmoothies.common.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
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
	public static final AbstractBlock.Properties NORMAL_LIQUID_PROPERTIES = AbstractBlock.Properties.of(Material.WATER).noDrops().strength(100.0f, 100.0f);
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS,
			CreateSmoothies.MOD_ID);
	/*
	 Provides access to relevant information about a fluid
	 I guess it's an alternative to using FLUIDS.getEntries();
	 */
	//public static final LinkedList<FluidRecord> ALL_FLUID_RECORDS = new LinkedList<>();

	/*
	Liquid Beetroot Smoothie
	 */
	public static final RegistryObject<FlowingFluid> BEETROOT_SMOOTHIE_FLUID = FLUIDS.register(
			"beetroot_smoothie_fluid", () -> new ForgeFlowingFluid.Source(ModFluids.BEETROOT_SMOOTHIE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> BEETROOT_SMOOTHIE_FLOWING = FLUIDS.register(
			"beetroot_smoothie_flowing", () -> new ForgeFlowingFluid.Flowing(ModFluids.BEETROOT_SMOOTHIE_PROPERTIES));
	public static final RegistryObject<FlowingFluidBlock> BEETROOT_SMOOTHIE_BLOCK = registerFlowingFluidBlock("beetroot_smoothie_block", BEETROOT_SMOOTHIE_FLUID);
	public static final ForgeFlowingFluid.Properties BEETROOT_SMOOTHIE_PROPERTIES = getJuiceProperties(BEETROOT_SMOOTHIE_FLUID, BEETROOT_SMOOTHIE_FLOWING, BEETROOT_SMOOTHIE_BLOCK, ModItems.BEETROOT_SMOOTHIE_BUCKET, 0xde843131);

	/*
	Liquid Beet Juice
	 */
	public static final RegistryObject<FlowingFluid> BEET_JUICE_FLUID = FLUIDS.register("beet_juice_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.BEET_JUICE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> BEET_JUICE_FLOWING = FLUIDS.register("beet_juice_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.BEET_JUICE_PROPERTIES));
	public static final RegistryObject<FlowingFluidBlock> BEET_JUICE_BLOCK = registerFlowingFluidBlock("beet_juice_block", BEET_JUICE_FLUID);
	public static final ForgeFlowingFluid.Properties BEET_JUICE_PROPERTIES =
			getJuiceProperties(BEET_JUICE_FLUID, BEET_JUICE_FLOWING, BEET_JUICE_BLOCK, ModItems.BEET_JUICE_BUCKET, 0x80a4272c);


	/*
	Liquid Sweet Beet Berry Shake
	 */
	public static final RegistryObject<FlowingFluid> SWEET_BEET_BERRY_SHAKE_FLUID = FLUIDS.register("sweet_beet_berry_juice_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.SWEET_BEET_BERRY_SHAKE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> SWEET_BEET_BERRY_SHAKE_FLOWING = FLUIDS.register("sweet_beet_berry_juice_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.SWEET_BEET_BERRY_SHAKE_PROPERTIES));
	public static final RegistryObject<FlowingFluidBlock> SWEET_BEET_BERRY_SHAKE_BLOCK = registerFlowingFluidBlock("sweet_beet_berry_shake_block", SWEET_BEET_BERRY_SHAKE_FLUID);
	public static final ForgeFlowingFluid.Properties SWEET_BEET_BERRY_SHAKE_PROPERTIES =
			getJuiceProperties(SWEET_BEET_BERRY_SHAKE_FLUID, SWEET_BEET_BERRY_SHAKE_FLOWING, SWEET_BEET_BERRY_SHAKE_BLOCK, ModItems.SWEET_BEET_BERRY_SHAKE_BUCKET, 0x80a50700);


	/*
	Liquid Pickle Juice
	 */
	public static final RegistryObject<FlowingFluid> PICKLE_JUICE_FLUID = FLUIDS.register("pickle_juice_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.PICKLE_JUICE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> PICKLE_JUICE_FLOWING = FLUIDS.register("pickle_juice_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.PICKLE_JUICE_PROPERTIES));
	public static final RegistryObject<FlowingFluidBlock> PICKLE_JUICE_BLOCK = registerFlowingFluidBlock("pickle_juice_block", PICKLE_JUICE_FLUID);
	public static final ForgeFlowingFluid.Properties PICKLE_JUICE_PROPERTIES =
			getJuiceProperties(PICKLE_JUICE_FLUID, PICKLE_JUICE_FLOWING, PICKLE_JUICE_BLOCK, ModItems.PICKLE_JUICE_BUCKET, 0x80c5f4c2);

	/*
	Liquid Apple Juice
	 */
	public static final RegistryObject<FlowingFluid> APPLE_JUICE_FLUID = FLUIDS.register("apple_juice_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.APPLE_JUICE_PROPERTIES));
	public static final RegistryObject<FlowingFluid> APPLE_JUICE_FLOWING = FLUIDS.register("apple_juice_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.APPLE_JUICE_PROPERTIES));
	public static final RegistryObject<FlowingFluidBlock> APPLE_JUICE_BLOCK = registerFlowingFluidBlock("apple_juice_block", APPLE_JUICE_FLUID);
	public static final ForgeFlowingFluid.Properties APPLE_JUICE_PROPERTIES =
			getJuiceProperties(APPLE_JUICE_FLUID, APPLE_JUICE_FLOWING, APPLE_JUICE_BLOCK, ModItems.APPLE_JUICE_BUCKET, 0x00);


	/*
	Liquid Melody
	 */
	public static final RegistryObject<FlowingFluid> LIQUID_MELODY_FLUID = FLUIDS.register("liquid_melody_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_MELODY_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_MELODY_FLOWING = FLUIDS.register("liquid_melody_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_MELODY_PROPERTIES));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_MELODY_BLOCK = registerFlowingFluidBlock("liquid_melody_block", LIQUID_MELODY_FLUID);
	public static final ForgeFlowingFluid.Properties LIQUID_MELODY_PROPERTIES =
			getJuiceProperties(LIQUID_MELODY_FLUID, LIQUID_MELODY_FLOWING, LIQUID_MELODY_BLOCK, ModItems.LIQUID_MELODY_BUCKET, 0x80ba9bba);

	
	/*
	Liquid Harmony
	 */
	public static final RegistryObject<FlowingFluid> LIQUID_HARMONY_FLUID = FLUIDS.register("liquid_harmony_fluid",
			() -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_HARMONY_PROPERTIES));
	public static final RegistryObject<FlowingFluid> LIQUID_HARMONY_FLOWING = FLUIDS.register("liquid_harmony_flowing",
			() -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_HARMONY_PROPERTIES));
	public static final RegistryObject<FlowingFluidBlock> LIQUID_HARMONY_BLOCK = registerFlowingFluidBlock("liquid_harmony_block", LIQUID_HARMONY_FLUID);
	public static final ForgeFlowingFluid.Properties LIQUID_HARMONY_PROPERTIES =
			getJuiceProperties(LIQUID_HARMONY_FLUID, LIQUID_HARMONY_FLOWING, LIQUID_HARMONY_BLOCK, ModItems.LIQUID_HARMONY_BUCKET, 0x80105e51);



	/*
	 Creates generic liquid properties for a fluid.
	*/
	public static ForgeFlowingFluid.Properties getJuiceProperties(RegistryObject<FlowingFluid> fluidStill, RegistryObject<FlowingFluid> flowingFluid, RegistryObject<FlowingFluidBlock> flowingFluidBlock, RegistryObject<Item> bucketItem, int color) {
		final FluidAttributes.Builder fluidAttributesBuild = FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL).sound(SoundEvents.GENERIC_SWIM)
				.overlay(WATER_OVERLAY_RL).color(color);
		return new ForgeFlowingFluid.Properties(() -> fluidStill.get(), () -> flowingFluid.get(), fluidAttributesBuild)
				.slopeFindDistance(4)
				.levelDecreasePerBlock(3)
				.block(() -> flowingFluidBlock.get())
				.bucket(() -> bucketItem.get());
	}

	/*
	 Register a flowing fluid block.
	*/
	public static RegistryObject<FlowingFluidBlock> registerFlowingFluidBlock(String name, RegistryObject<FlowingFluid> flowingFluid) {
		return ModBlocks.BLOCKS.register(name, () -> new FlowingFluidBlock(() -> flowingFluid.get(), NORMAL_LIQUID_PROPERTIES));
	}

	/*
	 Register all fluids to the bus.
	*/
	public static void registerFluids(IEventBus ie) {
		FLUIDS.register(ie);
	}
}
