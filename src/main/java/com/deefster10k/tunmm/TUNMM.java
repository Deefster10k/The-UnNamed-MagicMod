package com.deefster10k.tunmm;

import com.deefster10k.tunmm.handler.ConfigurationHandler;
import com.deefster10k.tunmm.init.ModBlocks;
import com.deefster10k.tunmm.init.ModItems;
import com.deefster10k.tunmm.init.TUNMMWorldGen;
import com.deefster10k.tunmm.init.recipes.Recipes;
import com.deefster10k.tunmm.proxy.IProxy;
import com.deefster10k.tunmm.reference.Reference;
import com.deefster10k.tunmm.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MODID, name= Reference.NAME, version=Reference.VERSION, guiFactory = Reference.GuiFactoryClass)

public class TUNMM
{
    @Mod.Instance("TUNMM")
    public static TUNMM instance;

    @SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();
        TUNMMWorldGen.init();

        LogHelper.info("Pre Initialisation Complete");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();

        LogHelper.info("Initialisation Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialisation Complete");
    }
}
