package net.cowardlycamper32.techent.item;

import com.google.common.util.concurrent.ClosingFuture;
import net.cowardlycamper32.techent.TechnologicalEntanglement;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModCustomCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TechnologicalEntanglement.MODID);
    public static final RegistryObject<CreativeModeTab> TECCHNOLOGICAL_ENTANGLEMENT = 
            CREATIVE_MODE_TABS.register("tech_ent",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IMPURE_RAW_IRON.get()))
                            .title(Component.translatable("creativetab.tech_ent")).displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.IMPURE_RAW_IRON.get());
                                output.accept(ModItems.IMPURE_RAW_COPPER.get());
                                output.accept(ModItems.IMPURE_RAW_GOLD.get());
                                output.accept(ModItems.REFINED_RAW_COPPER.get());
                                output.accept(ModItems.REFINED_RAW_GOLD.get());
                                output.accept(ModItems.REFINED_RAW_IRON.get());
                            }).build());
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}