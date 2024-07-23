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
    
    public static final RegistryObject<Item> IMPURE_IRON_ORE = 
            ITEMS.register("impure_iron_ore",
                    () -> new Item(new Item.Properties()));
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
