package net.minefwd.magech.client.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVat extends ModelBase
{
  //fields
    static ModelRenderer Base;
    static ModelRenderer Leg1;
    static ModelRenderer Leg4;
    static ModelRenderer Leg2;
    static ModelRenderer Leg3;
    static ModelRenderer Wall1;
    static ModelRenderer Wall2;
    static ModelRenderer Wall4;
    static ModelRenderer Wall3;
  
  public ModelVat()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 0, 26);
      Base.addBox(0F, 0F, 0F, 14, 2, 14);
      Base.setRotationPoint(-7F, 18F, -7F);
      Base.setTextureSize(64, 64);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 0);
      Leg1.addBox(-2F, 0F, 0F, 2, 5, 2);
      Leg1.setRotationPoint(-4.51328F, 19.85F, 4.51328F);
      Leg1.setTextureSize(64, 64);
      Leg1.mirror = true;
      setRotation(Leg1, 0.1745329F, 0F, 0.1745329F);
      Leg4 = new ModelRenderer(this, 0, 0);
      Leg4.addBox(0F, 0F, -2F, 2, 5, 2);
      Leg4.setRotationPoint(4.51328F, 19.85F, -4.51328F);
      Leg4.setTextureSize(64, 64);
      Leg4.mirror = true;
      setRotation(Leg4, -0.1745329F, 0F, -0.1745329F);
      Leg2 = new ModelRenderer(this, 0, 0);
      Leg2.addBox(-2F, 0F, -2F, 2, 5, 2);
      Leg2.setRotationPoint(-4.51328F, 19.85F, -4.51326F);
      Leg2.setTextureSize(64, 64);
      Leg2.mirror = true;
      setRotation(Leg2, -0.1745329F, 0F, 0.1745329F);
      Leg3 = new ModelRenderer(this, 0, 0);
      Leg3.addBox(0F, 0F, 0F, 2, 5, 2);
      Leg3.setRotationPoint(4.51328F, 19.85F, 4.51326F);
      Leg3.setTextureSize(64, 64);
      Leg3.mirror = true;
      setRotation(Leg3, 0.1745329F, 0F, -0.1745329F);
      Wall1 = new ModelRenderer(this, 0, 8);
      Wall1.addBox(0F, 0F, 0F, 14, 12, 1);
      Wall1.setRotationPoint(6F, 6F, 7F);
      Wall1.setTextureSize(64, 64);
      Wall1.mirror = true;
      setRotation(Wall1, 0F, 1.570796F, 0F);
      Wall2 = new ModelRenderer(this, 0, 8);
      Wall2.addBox(0F, 0F, 0F, 14, 12, 1);
      Wall2.setRotationPoint(-7F, 6F, 6F);
      Wall2.setTextureSize(64, 64);
      Wall2.mirror = true;
      setRotation(Wall2, 0F, 0F, 0F);
      Wall4 = new ModelRenderer(this, 0, 8);
      Wall4.addBox(0F, 0F, 0F, 14, 12, 1);
      Wall4.setRotationPoint(-7F, 6F, -7F);
      Wall4.setTextureSize(64, 64);
      Wall4.mirror = true;
      setRotation(Wall4, 0F, 0F, 0F);
      Wall3 = new ModelRenderer(this, 0, 8);
      Wall3.addBox(0F, 0F, 0F, 14, 12, 1);
      Wall3.setRotationPoint(-7F, 6F, 7F);
      Wall3.setTextureSize(64, 64);
      Wall3.mirror = true;
      setRotation(Wall3, 0F, 1.58825F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Leg1.render(f5);
    Leg4.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Wall1.render(f5);
    Wall2.render(f5);
    Wall4.render(f5);
    Wall3.render(f5);
  }

  public static void simpleRender(float scale){
      Base.render(scale);
      Leg1.render(scale);
      Leg2.render(scale);
      Leg3.render(scale);
      Leg4.render(scale);
      Wall1.render(scale);
      Wall2.render(scale);
      Wall3.render(scale);
      Wall4.render(scale);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
