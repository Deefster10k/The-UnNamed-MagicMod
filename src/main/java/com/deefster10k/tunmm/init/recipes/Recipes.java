package com.deefster10k.tunmm.init.recipes;


import com.deefster10k.tunmm.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotInfusedIron, 4), ModItems.ingotResonant, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot);
    }
}
