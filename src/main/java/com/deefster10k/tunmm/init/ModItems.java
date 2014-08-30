package com.deefster10k.tunmm.init;

import com.deefster10k.tunmm.item.IngotInfusedIron;
import com.deefster10k.tunmm.item.IngotResonium;
import com.deefster10k.tunmm.item.ItemTUNMM;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemTUNMM ingotResonium = new IngotResonium();
    public static final ItemTUNMM ingotInfusedIron = new IngotInfusedIron();
    public static void init()
    {
        GameRegistry.registerItem(ingotResonium, "ingotResonium");
        GameRegistry.registerItem(ingotInfusedIron, "ingotInfusedIron");
    }
}
