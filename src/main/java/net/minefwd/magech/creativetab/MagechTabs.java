package net.minefwd.magech.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minefwd.magech.init.MItems;
import net.minefwd.magech.reference.Reference;

public class MagechTabs
{
    public static final CreativeTabs MagechTab = new CreativeTabs(Reference.MODID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() { return MItems.magechSword; }

    };
}