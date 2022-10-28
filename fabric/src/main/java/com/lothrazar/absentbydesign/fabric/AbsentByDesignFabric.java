package com.lothrazar.absentbydesign.fabric;

import com.lothrazar.absentbydesign.AbsentByDesign;
import net.fabricmc.api.ModInitializer;

public class AbsentByDesignFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AbsentByDesign.init();
    }
}