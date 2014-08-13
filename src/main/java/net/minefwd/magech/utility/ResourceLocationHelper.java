package net.minefwd.magech.utility;

import net.minecraft.util.ResourceLocation;
import net.minefwd.magech.reference.Reference;

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.MODID.toLowerCase(), path);
    }
}