package net.minefwd.magech.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init() {

        initModRecipes();

    }

    public static void initModRecipes() {

        GameRegistry.addShapedRecipe(new ItemStack(MItems.magechSword, 1, 0), " e ", " e ", " s ", 'e', Blocks.emerald_block, 's', Items.stick);

    }

}
