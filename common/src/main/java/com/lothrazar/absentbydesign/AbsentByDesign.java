package com.lothrazar.absentbydesign;

import com.lothrazar.absentbydesign.registry.AbsentRegistry;

public class AbsentByDesign {
    public static final String MOD_ID = "absentbydesign";

    public static void init() {
        AbsentRegistry.registerBlocks();
        AbsentRegistry.setupClient();
    }
}