package net.minefwd.magech.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minefwd.magech.network.message.TileEntityMessageMagech;
import net.minefwd.magech.reference.Reference;

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID.toLowerCase());

    public static void init()
    {
        INSTANCE.registerMessage(TileEntityMessageMagech.class, TileEntityMessageMagech.class, 0, Side.CLIENT);
    }
}