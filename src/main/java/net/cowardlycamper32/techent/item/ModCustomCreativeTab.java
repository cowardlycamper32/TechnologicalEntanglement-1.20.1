package net.cowardlycamper32.techent.item;

import com.google.common.util.concurrent.ClosingFuture;
import net.cowardlycamper32.techent.TechnologicalEntanglement;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.awt.event.InputEvent;

public class ModCustomCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TechnologicalEntanglement.MODID);
    
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}