package net.minefwd.magech.client.renderer.tileentity;


import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minefwd.magech.client.renderer.model.ModelAltar;
import net.minefwd.magech.client.renderer.model.ModelVat;
import org.lwjgl.opengl.GL11;

public class TileEntityRendererVat extends TileEntitySpecialRenderer {

    //The model of your block
    private final ModelVat modelVat;

    public TileEntityRendererVat() {
        this.modelVat = new ModelVat();
    }

    ResourceLocation textures = (new ResourceLocation("magech:textures/models/vat.png"));

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
        drawPortalAltar(tileentity, x, y, z, f);
    }


    private void drawPortalAltar(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GL11.glScalef(-0.8F, -1F, 0.8F);

        Minecraft.getMinecraft().renderEngine.bindTexture(textures);
        ModelVat.simpleRender(0.0625F);
        GL11.glPopMatrix();
    }
}