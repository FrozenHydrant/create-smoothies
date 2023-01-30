package betathunder.createsmoothies.common.item;

import java.util.function.Supplier;

import betathunder.createsmoothies.CreateSmoothies;
import betathunder.createsmoothies.common.fluid.ModFluids;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			CreateSmoothies.MOD_ID);

	public static final RegistryObject<Item> BEETROOT_SMOOTHIE_BUCKET = registerItem("beetroot_smoothie_bucket",
			() -> new BucketItem(() -> ModFluids.BEETROOT_SMOOTHIE_FLUID.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC)));

	public static final RegistryObject<Item> BEET_JUICE_BUCKET = registerItem("beet_juice_bucket",
			() -> new BucketItem(() -> ModFluids.BEET_JUICE_FLUID.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> SWEET_BEET_BERRY_SHAKE_BUCKET = registerItem("sweet_beet_berry_shake_bucket",
			() -> new BucketItem(() -> ModFluids.SWEET_BEET_BERRY_SHAKE_FLUID.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> PICKLE_JUICE_BUCKET = registerItem("pickle_juice_bucket",
			() -> new BucketItem(() -> ModFluids.PICKLE_JUICE_FLUID.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC)));

	public static final RegistryObject<Item> APPLE_JUICE_BUCKET = registerItem("apple_juice_bucket",
			() -> new BucketItem(() -> ModFluids.APPLE_JUICE_FLUID.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> LIQUID_MELODY_BUCKET = registerItem("liquid_melody_bucket",
			() -> new BucketItem(() -> ModFluids.LIQUID_MELODY_FLUID.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> LIQUID_HARMONY_BUCKET = registerItem("liquid_harmony_bucket",
			() -> new BucketItem(() -> ModFluids.LIQUID_HARMONY_FLUID.get(),
					new Item.Properties().tab(ItemGroup.TAB_MISC)));

	public static final RegistryObject<Item> BEETROOT_SMOOTHIE = registerItem("beetroot_smoothie",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(7).saturationMod(0.5f).build())));

	public static final RegistryObject<Item> SWEET_BEET_BERRY_SHAKE = registerItem("sweet_beet_berry_shake",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(11).saturationMod(0.3f).build())));
	public static final RegistryObject<Item> HONEY_PICKLE_SHAKE = registerItem("honey_pickle_shake",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));
	
	public static final RegistryObject<Item> MINTY_TWIST = registerItem("minty_twist",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));

	public static final RegistryObject<Item> IMILK = registerItem("i_milk",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));

	public static final RegistryObject<Item> APPLE_SMOOTHIE = registerItem("apple_smoothie",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));

	public static final RegistryObject<Item> APPLEWOOD_SMOKED_BACON_BITS = registerItem("applewood_smoked_bacon_bits",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));

		/*
	public static final RegistryObject<Item> BEET_JUICE = registerItem("beet_juice",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(3).saturationMod(0.7f).build())));

	 */

	/*
	public static final RegistryObject<Item> PICKLE_JUICE = registerItem("pickle_juice",
			() -> new HoneyBottleItem(new Item.Properties().tab(ItemGroup.TAB_FOOD)
					.food(new Food.Builder().nutrition(1).saturationMod(0.5f).build())));
		*/
	public static RegistryObject<Item> registerItem(String name, Supplier<Item> item) {
		return ITEMS.register(name, item);
	}

	public static void registerItems(IEventBus ie) {
		ITEMS.register(ie);
	}
}
