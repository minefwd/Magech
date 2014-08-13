package net.minefwd.magech;

import net.minefwd.magech.handler.ConfigurationHandler;
import net.minefwd.magech.init.MBlocks;
import net.minefwd.magech.init.MItems;
import net.minefwd.magech.init.Recipes;
import net.minefwd.magech.network.PacketHandler;
import net.minefwd.magech.proxy.IProxy;
import net.minefwd.magech.reference.Reference;
import net.minefwd.magech.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Magech

{
    @Mod.Instance("Magech")
    public static Magech instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("PreInitialization of Magech");

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        MItems.init();

        MBlocks.init();

        PacketHandler.init();

        }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization of Magech");

        proxy.registerTileEntities();

        proxy.initRenderingAndTextures();

        proxy.registerEventHandlers();

        Recipes.init();


    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("PostInitialization of Magech");
    }
}
