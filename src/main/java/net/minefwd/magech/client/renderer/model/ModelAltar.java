package net.minefwd.magech.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAltar extends ModelBase
{
  //fields
    static ModelRenderer PortalAltarMain;
    static ModelRenderer PortalAltarBase;
    static ModelRenderer PortalAltarTop;
    static ModelRenderer PortalAltarFace;
    static ModelRenderer PortalAltarStand;
    static ModelRenderer BannerTop;
    static ModelRenderer BannerMiddle;
    static ModelRenderer BannerBottom;
  
  public ModelAltar()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      PortalAltarMain = new ModelRenderer(this, 0, 0);
      PortalAltarMain.addBox(0F, 0F, 0F, 12, 16, 12);
      PortalAltarMain.setRotationPoint(-6F, 6F, -6F);
      PortalAltarMain.setTextureSize(64, 32);
      PortalAltarMain.mirror = true;
      setRotation(PortalAltarMain, 0F, 0F, 0F);
      PortalAltarBase = new ModelRenderer(this, 49, 0);
      PortalAltarBase.addBox(0F, 0F, 0F, 16, 2, 16);
      PortalAltarBase.setRotationPoint(-8F, 22F, -8F);
      PortalAltarBase.setTextureSize(64, 32);
      PortalAltarBase.mirror = true;
      setRotation(PortalAltarBase, 0F, 0F, 0F);
      PortalAltarTop = new ModelRenderer(this, 0, 35);
      PortalAltarTop.addBox(0F, 0F, 0F, 14, 1, 14);
      PortalAltarTop.setRotationPoint(-7F, 5F, -7F);
      PortalAltarTop.setTextureSize(64, 32);
      PortalAltarTop.mirror = true;
      setRotation(PortalAltarTop, 0F, 0F, 0F);
      PortalAltarFace = new ModelRenderer(this, 49, 19);
      PortalAltarFace.addBox(-6F, 0F, 0F, 12, 1, 11);
      PortalAltarFace.setRotationPoint(0F, 5F, -6F);
      PortalAltarFace.setTextureSize(64, 32);
      PortalAltarFace.mirror = true;
      setRotation(PortalAltarFace, 0.424146F, 0F, 0F);
      PortalAltarStand = new ModelRenderer(this, 96, 19);
      PortalAltarStand.addBox(0F, 0F, 0F, 12, 5, 1);
      PortalAltarStand.setRotationPoint(-6F, 1F, 3.1655F);
      PortalAltarStand.setTextureSize(64, 32);
      PortalAltarStand.mirror = true;
      setRotation(PortalAltarStand, 0.4241499F, 0F, 0F);
      BannerTop = new ModelRenderer(this, 62, 33);
      BannerTop.addBox(0F, 0F, 0F, 6, 6, 1);
      BannerTop.setRotationPoint(-3F, 6F, -6.25F);
      BannerTop.setTextureSize(128, 64);
      BannerTop.mirror = true;
      setRotation(BannerTop, 0F, 0F, 0F);
      BannerMiddle = new ModelRenderer(this, 64, 41);
      BannerMiddle.addBox(0F, 0F, 0F, 4, 1, 1);
      BannerMiddle.setRotationPoint(-2F, 12F, -6.25F);
      BannerMiddle.setTextureSize(128, 64);
      BannerMiddle.mirror = true;
      setRotation(BannerMiddle, 0F, 0F, 0F);
      BannerBottom = new ModelRenderer(this, 66, 44);
      BannerBottom.addBox(0F, 0F, 0F, 2, 1, 1);
      BannerBottom.setRotationPoint(-1F, 13F, -6.25F);
      BannerBottom.setTextureSize(128, 64);
      BannerBottom.mirror = true;
      setRotation(BannerBottom, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    PortalAltarMain.render(f5);
    PortalAltarBase.render(f5);
    PortalAltarTop.render(f5);
    PortalAltarFace.render(f5);
    PortalAltarStand.render(f5);
    BannerTop.render(f5);
    BannerMiddle.render(f5);
    BannerBottom.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

  public static void simpleRender(float scale)
  {
      PortalAltarMain.render(scale);
      PortalAltarBase.render(scale);
      PortalAltarTop.render(scale);
      PortalAltarFace.render(scale);
      PortalAltarStand.render(scale);
      BannerTop.render(scale);
      BannerMiddle.render(scale);
      BannerBottom.render(scale);

  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
