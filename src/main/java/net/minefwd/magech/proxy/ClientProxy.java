package net.minefwd.magech.proxy;

import java.io.File;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minefwd.magech.client.renderer.tileentity.TileEntityRendererAltar;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minefwd.magech.client.renderer.tileentity.TileEntityRendererVat;
import net.minefwd.magech.client.renderer.item.ItemRendererAltar;
import net.minefwd.magech.client.renderer.item.ItemRendererVat;
import net.minefwd.magech.init.MBlocks;
import net.minefwd.magech.reference.RenderID;
import net.minefwd.magech.tileentity.TileEntityAltar;
import net.minefwd.magech.tileentity.TileEntityVat;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerEventHandlers()
    {

    }

    @Override
    public void registerKeybindings()
    {

    }

    @Override
    public void initClientConfiguration(File configFile)
    {

    }

    @Override
    public void initRenderingAndTextures()
    {

        // Altar
        RenderID.ALTAR = RenderingRegistry.getNextAvailableRenderId();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltar.class, new TileEntityRendererAltar());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MBlocks.blockAltar), new ItemRendererAltar());

        // Vat
        RenderID.VAT = RenderingRegistry.getNextAvailableRenderId();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVat.class, new TileEntityRendererVat());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MBlocks.blockVat), new ItemRendererVat());


    }

}