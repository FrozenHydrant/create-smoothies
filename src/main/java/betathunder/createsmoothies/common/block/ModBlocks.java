package betathunder.createsmoothies.common.block;

import java.util.function.Supplier;

import betathunder.createsmoothies.CreateSmoothies;
import betathunder.createsmoothies.common.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			CreateSmoothies.MOD_ID);

	public static RegistryObject<Block> registerBlock(String name, Supplier<Block> b) {
		RegistryObject<Block> tmp = BLOCKS.register(name, b);
		registerBlockItem(name, tmp);
		return tmp;
	}

	public static void registerBlockItem(String name, RegistryObject<Block> b) {

		ModItems.registerItem(name,
				() -> new BlockItem(b.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

	}

	public static void registerBlocks(IEventBus ie) {
		BLOCKS.register(ie);
	}
}
