package net.cowardlycamper32.techent.item;

import net.cowardlycamper32.techent.TechnologicalEntanglement;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, TechnologicalEntanglement.MODID);
    
    public static final RegistryObject<Item> IMPURE_RAW_IRON = 
            ITEMS.register("impure_raw_iron",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_RAW_IRON =
            ITEMS.register("refined_raw_iron",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_RAW_COPPER =
            ITEMS.register("impure_raw_copper",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_RAW_COPPER =
            ITEMS.register("refined_raw_copper",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IMPURE_RAW_GOLD =
            ITEMS.register("impure_raw_gold",
                    () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REFINED_RAW_GOLD =
            ITEMS.register("refined_raw_gold",
                    () -> new Item(new Item.Properties()));
    
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
