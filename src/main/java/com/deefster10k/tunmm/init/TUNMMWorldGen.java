package com.deefster10k.tunmm.init;

import com.deefster10k.tunmm.worldgen.WorldGen;
import cpw.mods.fml.common.registry.GameRegistry;


public class TUNMMWorldGen
{
    public static final WorldGen eventWorldGen = new WorldGen();

    public static void init()
    {
        GameRegistry.registerWorldGenerator(eventWorldGen, 0);
    }
}
