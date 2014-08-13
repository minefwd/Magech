package net.minefwd.magech.init;

import net.minefwd.magech.item.MagechSword;
import net.minefwd.magech.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class MItems
{
    public static final MagechSword magechSword = new MagechSword();

    public static void init()
    {
        GameRegistry.registerItem(magechSword, "magechSword");
    }
}