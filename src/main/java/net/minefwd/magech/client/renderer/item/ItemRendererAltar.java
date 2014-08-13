package net.minefwd.magech.client.renderer.item;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minefwd.magech.client.renderer.model.ModelAltar;
import org.lwjgl.opengl.GL11;

public class ItemRendererAltar implements IItemRenderer
{

    private final ModelAltar modelAltar;

    public ItemRendererAltar()
    {
        modelAltar = new ModelAltar();
    }

    @Override
    public boolean handleRenderType(ItemStack itemStack, ItemRenderType itemRenderType)
    {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType itemRenderType, ItemStack itemStack, ItemRendererHelper itemRendererHelper)
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType itemRenderType, ItemStack itemStack, Object... data)
    {
        switch (itemRenderType)
        {
            case ENTITY:
            {
                renderAltar(0.0F, -2F, 0.0F, 90F, 0F, 1F, 0F);
                return;
            }
            case EQUIPPED:
            {
                renderAltar(0F, -2F, 0F, 0F, 0F, 0F, 0F);
                return;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                renderAltar(0.0F, -2F, 0.0F, 90F, 0F, 1F, 0F);
                return;
            }
            case INVENTORY:
            {
                renderAltar(0.0F, -0.9F, 0.0F, 0F, 0F, 0F, 0F);
                return;
            }
            default:
            {
            }
        }
    }

    private void renderAltar(float tX, float tY, float tZ, float sD, float sX, float sY, float sZ)
    {
        GL11.glPushMatrix();

        // Scale, Translate, Rotate
        GL11.glScalef(0.8F, 0.8F, 0.8F);

        GL11.glRotatef(180F, 1F, 0F, 0F);
        GL11.glRotatef(sD, sX, sY, sZ);

        GL11.glTranslatef(tX, tY, tZ);

        // Bind texture
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("magech:textures/models/altar.png"));

        // Render
        modelAltar.simpleRender(0.0625F);

        GL11.glPopMatrix();
    }
}