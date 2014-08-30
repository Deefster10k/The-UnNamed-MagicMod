package com.deefster10k.tunmm.init;


import com.deefster10k.tunmm.block.*;
import com.deefster10k.tunmm.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class ModBlocks
{
    public static final BlockTUNMM blockResonium = new BlockResonium();
    public static final BlockTUNMM blockInfusedIron = new BlockInfusedIron();
    public static final BlockTUNMM oreResonium = new OreResonium();
    public static Fluid fluidWaterResonating = new Fluid("fluidWaterResonating").setLuminosity(8).setViscosity(750);







    public static void init()
    {
        GameRegistry.registerBlock(blockResonium, "blockResonium");
        GameRegistry.registerBlock(blockInfusedIron, "blockInfusedIron");
        GameRegistry.registerBlock(oreResonium, "oreResonium");
        FluidRegistry.registerFluid(fluidWaterResonating);
        Block blockFluidResonant = new BlockWaterResonating(fluidWaterResonating, Material.water).setBlockName("tunmm:fluidWaterResonating");
        GameRegistry.registerBlock(blockFluidResonant, blockFluidResonant.getUnlocalizedName().substring(5));
        fluidWaterResonating.setUnlocalizedName(blockFluidResonant.getUnlocalizedName());


    }
}
