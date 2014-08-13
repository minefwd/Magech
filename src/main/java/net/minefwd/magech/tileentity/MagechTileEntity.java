package net.minefwd.magech.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import net.minefwd.magech.network.PacketHandler;
import net.minefwd.magech.network.message.TileEntityMessageMagech;
import net.minefwd.magech.reference.Names;

public class MagechTileEntity extends TileEntity
{
    protected ForgeDirection orientation;


    public MagechTileEntity()
    {
        orientation = ForgeDirection.SOUTH;
    }

    public ForgeDirection getOrientation()
    {
        return orientation;
    }

    public void setOrientation(int orientation)
    {
        this.orientation = ForgeDirection.getOrientation(orientation);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbtTagCompound) {
        super.readFromNBT(nbtTagCompound);

        if (nbtTagCompound.hasKey(Names.NBT.DIRECTION)) {
            this.orientation = ForgeDirection.getOrientation(nbtTagCompound.getByte(Names.NBT.DIRECTION));
        }
    }

    @Override
    public Packet getDescriptionPacket()
    {
        return PacketHandler.INSTANCE.getPacketFrom(new TileEntityMessageMagech(this));
    }

}