package com.lothrazar.absentbydesign.forge;

import dev.architectury.platform.forge.EventBuses;
import com.lothrazar.absentbydesign.AbsentByDesign;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AbsentByDesign.MOD_ID)
public class AbsentByDesignForge {
    public AbsentByDesignForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AbsentByDesign.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        AbsentByDesign.init();
    }
}