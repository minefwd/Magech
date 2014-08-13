package net.minefwd.magech.network.message;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minefwd.magech.tileentity.MagechTileEntity;

public class TileEntityMessageMagech implements IMessage, IMessageHandler<TileEntityMessageMagech, IMessage>
{
    public int x, y, z;
    public byte orientation;
    public TileEntityMessageMagech()
    {
    }

    public TileEntityMessageMagech(MagechTileEntity magechTileEntity)
    {
        this.x = magechTileEntity.xCoord;
        this.y = magechTileEntity.yCoord;
        this.z = magechTileEntity.zCoord;
        this.orientation = (byte) magechTileEntity.getOrientation().ordinal();

    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.x = buf.readInt();
        this.y = buf.readInt();
        this.z = buf.readInt();
        this.orientation = buf.readByte();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
        buf.writeByte(orientation);
    }

    @Override
    public IMessage onMessage(TileEntityMessageMagech message, MessageContext ctx)
    {
        TileEntity tileEntity = FMLClientHandler.instance().getClient().theWorld.getTileEntity(message.x, message.y, message.z);

        if (tileEntity instanceof MagechTileEntity)
        {
            ((MagechTileEntity) tileEntity).setOrientation(message.orientation);
        }

        return null;
    }

    @Override
    public String toString()
    {
        return String.format("TileEntityMessageMagech - x:%s, y:%s, z:%s, orientation:%s, state:%s, customName:%s, owner:%s", x, y, z, orientation);
    }
}