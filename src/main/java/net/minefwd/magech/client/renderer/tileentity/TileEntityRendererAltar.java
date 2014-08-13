package net.minefwd.magech.client.renderer.tileentity;


import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minefwd.magech.client.renderer.model.ModelAltar;
import org.lwjgl.opengl.GL11;

public class TileEntityRendererAltar extends TileEntitySpecialRenderer {

    //The model of your block
    private final ModelAltar modelPortalAltar;

    public TileEntityRendererAltar() {
        this.modelPortalAltar = new ModelAltar();
    }

    ResourceLocation textures = (new ResourceLocation("magech:textures/models/altar.png"));

    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
        drawPortalAltar(tileentity, x, y, z, f);
    }


    private void drawPortalAltar(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
        GL11.glScalef(-0.8F, -1F, 0.8F);

        Minecraft.getMinecraft().renderEngine.bindTexture(textures);
        ModelAltar.simpleRender(0.0625F);
        GL11.glPopMatrix();
    }
}