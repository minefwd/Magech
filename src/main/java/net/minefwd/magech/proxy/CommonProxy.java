package net.minefwd.magech.proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minefwd.magech.tileentity.TileEntityAltar;
import net.minefwd.magech.tileentity.TileEntityVat;

public abstract class CommonProxy implements IProxy
{
    public void registerEventHandlers()
    {

    }

    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityAltar.class, "tileentityaltar");
        GameRegistry.registerTileEntity(TileEntityVat.class, "tileentityvat");
    }
}