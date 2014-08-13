package net.minefwd.magech.client.renderer.item;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minefwd.magech.client.renderer.model.ModelVat;
import org.lwjgl.opengl.GL11;

public class ItemRendererVat implements IItemRenderer
{

    private ModelVat modelVat;


    public ItemRendererVat()
    {
        modelVat = new ModelVat();
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
                renderVat(0.0F, -2F, 0.0F, 90F, 0F, 1F, 0F);
                return;
            }
            case EQUIPPED:
            {
                renderVat(0F, -2F, 0F, 0F, 0F, 0F, 0F);
                return;
            }
            case EQUIPPED_FIRST_PERSON:
            {
                renderVat(0.0F, -2F, 0.0F, 90F, 0F, 1F, 0F);
                return;
            }
            case INVENTORY:
            {
                renderVat(0.0F, -0.9F, 0.0F, 0F, 0F, 0F, 0F);
                return;
            }
            default:
            {
            }
        }
    }

    private void renderVat(float tX, float tY, float tZ, float sD, float sX, float sY, float sZ)
    {
        GL11.glPushMatrix();

        // Scale, Translate, Rotate
        GL11.glScalef(0.8F, 0.8F, 0.8F);

        GL11.glRotatef(180F, 1F, 0F, 0F);
        GL11.glRotatef(sD, sX, sY, sZ);

        GL11.glTranslatef(tX, tY, tZ);

        // Bind texture
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("magech:textures/models/vat.png"));

        // Render
        modelVat.simpleRender(0.0625F);

        GL11.glPopMatrix();
    }
}