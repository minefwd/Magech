
package net.minefwd.magech.init;

import net.minecraft.block.material.Material;
import net.minefwd.magech.block.BlockAltar;
import net.minefwd.magech.block.BlockVat;
import net.minefwd.magech.block.MagechBlock;
import net.minefwd.magech.reference.Names;
import net.minefwd.magech.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class MBlocks
{

    public static final MagechBlock blockAltar = new BlockAltar(Material.rock);

    public static final MagechBlock blockVat = new BlockVat(Material.iron);


    public static void init() {

        GameRegistry.registerBlock(blockAltar, Names.Blocks.ALTAR);

        GameRegistry.registerBlock(blockVat, Names.Blocks.VAT);


    }

}