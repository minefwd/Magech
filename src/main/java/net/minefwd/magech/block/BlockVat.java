package net.minefwd.magech.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minefwd.magech.Magech;
import net.minefwd.magech.reference.GuiId;
import net.minefwd.magech.reference.Names;
import net.minefwd.magech.reference.RenderID;
import net.minefwd.magech.tileentity.TileEntityVat;


public class BlockVat extends MagechBlock implements ITileEntityProvider {

    public BlockVat(Material material) {
        super(Material.iron);
        this.setBlockName(Names.Blocks.VAT);
        this.setStepSound(soundTypeWood);
        this.setBlockBounds(1F/16F*1.5F, 0.0F, 1F/16F*1.5F, 1F-1F/16F*1.5F, 1.512F, 1F-1F/16F*1.5F);
        this.setHardness(2.0F);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEntityVat();
    }

    public int getRenderType() {
        return RenderID.VAT;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public void onBlockPlacedBy() {

    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
        if (player.isSneaking())
        {
            return false;
        }
        else
        {
            if (!world.isRemote)
            {
                if (world.getTileEntity(x, y, z) instanceof TileEntityVat)
                {
                    System.out.println("GUI coming soon to Magech versions near you!");
                    player.openGui(Magech.instance, GuiId.VAT.ordinal(), world, x, y, z);
                }
            }

            return true;
        }
    }
}
