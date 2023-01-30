package betathunder.createsmoothies;

import betathunder.createsmoothies.common.block.ModBlocks;
import betathunder.createsmoothies.common.fluid.ModFluids;
import betathunder.createsmoothies.common.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.fluid.Fluid;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("createsmoothies")
public class CreateSmoothies
{
    // Directly reference a log4j logger.
    //private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "createsmoothies";
    public CreateSmoothies() {
        // Register the setup method for modloading
    	
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.registerItems(modEventBus);
        ModFluids.registerFluids(modEventBus);
        ModBlocks.registerBlocks(modEventBus);
		modEventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        modEventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        modEventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        modEventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        for (RegistryObject<Fluid> fluid: ModFluids.FLUIDS.getEntries()) {
            RenderTypeLookup.setRenderLayer(fluid.get(), RenderType.translucent());
        }

        /*
         This mod doesn't add any blocks other than fluid blocks, so they can all be translucent
         */
        for (RegistryObject<Block> fluidBlock: ModBlocks.BLOCKS.getEntries()) {
            RenderTypeLookup.setRenderLayer(fluidBlock.get(), RenderType.translucent());
        }
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
    }

    private void processIMC(final InterModProcessEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {

        }
    }
}
