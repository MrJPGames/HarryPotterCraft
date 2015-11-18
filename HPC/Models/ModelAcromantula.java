package HPC.Models;

import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAcromantula extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer RearEnd;
    ModelRenderer Leg8;
    ModelRenderer Leg6;
    ModelRenderer Leg4;
    ModelRenderer Leg2;
    ModelRenderer Leg7;
    ModelRenderer Leg5;
    ModelRenderer Leg3;
    ModelRenderer Leg1;
  
  public ModelAcromantula()
  {
    textureWidth = 128;
    textureHeight = 64;
    
    Head = new ModelRenderer(this, 64, 8);
    Head.addBox(-4F, -4F, -8F, 16, 16, 16);
    Head.setRotationPoint(-4F, 12F, -10F);
    Head.setTextureSize(128, 64);
    Head.mirror = true;
    setRotation(Head, 0F, 0F, 0F);
    Body = new ModelRenderer(this, 0, 0);
    Body.addBox(-3F, -3F, -3F, 12, 12, 12);
    Body.setRotationPoint(-3F, 12F, 0F);
    Body.setTextureSize(128, 64);
    Body.mirror = true;
    setRotation(Body, 0F, 0F, 0F);
    RearEnd = new ModelRenderer(this, 0, 24);
    RearEnd.addBox(-5F, -4F, -6F, 20, 16, 24);
    RearEnd.setRotationPoint(-5F, 11F, 15F);
    RearEnd.setTextureSize(128, 64);
    RearEnd.mirror = true;
    setRotation(RearEnd, 0F, 0F, 0F);
    Leg8 = new ModelRenderer(this, 36, 0);
    Leg8.addBox(-1F, -1F, -1F, 16, 2, 2);
    Leg8.setRotationPoint(4F, 18F, -1F);
    Leg8.setTextureSize(128, 64);
    Leg8.mirror = true;
    setRotation(Leg8, 0F, 0.5759587F, 0.1919862F);
    Leg6 = new ModelRenderer(this, 36, 0);
    Leg6.addBox(-1F, -1F, -1F, 16, 2, 2);
    Leg6.setRotationPoint(4F, 18F, 0F);
    Leg6.setTextureSize(128, 64);
    Leg6.mirror = true;
    setRotation(Leg6, 0F, 0.2792527F, 0.1919862F);
    Leg4 = new ModelRenderer(this, 36, 0);
    Leg4.addBox(-1F, -1F, -1F, 16, 2, 2);
    Leg4.setRotationPoint(4F, 18F, 1F);
    Leg4.setTextureSize(128, 64);
    Leg4.mirror = true;
    setRotation(Leg4, 0F, -0.2792527F, 0.1919862F);
    Leg2 = new ModelRenderer(this, 36, 0);
    Leg2.addBox(-1F, -1F, -1F, 16, 2, 2);
    Leg2.setRotationPoint(4F, 18F, 2F);
    Leg2.setTextureSize(128, 64);
    Leg2.mirror = true;
    setRotation(Leg2, 0F, -0.5759587F, 0.1919862F);
    Leg7 = new ModelRenderer(this, 36, 0);
    Leg7.addBox(-15F, -1F, -1F, 16, 2, 2);
    Leg7.setRotationPoint(-4F, 18F, -1F);
    Leg7.setTextureSize(128, 64);
    Leg7.mirror = true;
    setRotation(Leg7, 0F, -0.5759587F, -0.1919862F);
    Leg5 = new ModelRenderer(this, 36, 0);
    Leg5.addBox(-15F, -1F, -1F, 16, 2, 2);
    Leg5.setRotationPoint(-4F, 18F, 0F);
    Leg5.setTextureSize(128, 64);
    Leg5.mirror = true;
    setRotation(Leg5, 0F, -0.2792527F, -0.1919862F);
    Leg3 = new ModelRenderer(this, 36, 0);
    Leg3.addBox(-15F, -1F, -1F, 16, 2, 2);
    Leg3.setRotationPoint(-4F, 18F, 1F);
    Leg3.setTextureSize(128, 64);
    Leg3.mirror = true;
    setRotation(Leg3, 0F, 0.2792527F, -0.1919862F);
    Leg1 = new ModelRenderer(this, 36, 0);
    Leg1.addBox(-15F, -1F, -1F, 16, 2, 2);
    Leg1.setRotationPoint(-4F, 18F, 2F);
    Leg1.setTextureSize(128, 64);
    Leg1.mirror = true;
    setRotation(Leg1, 0F, 0.5759587F, -0.1919862F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Head.render(f5);
    Body.render(f5);
    RearEnd.render(f5);
    Leg8.render(f5);
    Leg6.render(f5);
    Leg4.render(f5);
    Leg2.render(f5);
    Leg7.render(f5);
    Leg5.render(f5);
    Leg3.render(f5);
    Leg1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
  {
	  this.Head.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.Head.rotateAngleX = par5 / (180F / (float)Math.PI);
      float var8 = ((float)Math.PI / 4F);
      this.Leg1.rotateAngleZ = -var8;
      this.Leg2.rotateAngleZ = var8;
      this.Leg3.rotateAngleZ = -var8 * 0.74F;
      this.Leg4.rotateAngleZ = var8 * 0.74F;
      this.Leg5.rotateAngleZ = -var8 * 0.74F;
      this.Leg6.rotateAngleZ = var8 * 0.74F;
      this.Leg7.rotateAngleZ = -var8;
      this.Leg8.rotateAngleZ = var8;
      float var9 = -0.0F;
      float var10 = 0.3926991F;
      this.Leg1.rotateAngleY = var10 * 2.0F + var9;
      this.Leg2.rotateAngleY = -var10 * 2.0F - var9;
      this.Leg3.rotateAngleY = var10 * 1.0F + var9;
      this.Leg4.rotateAngleY = -var10 * 1.0F - var9;
      this.Leg5.rotateAngleY = -var10 * 1.0F + var9;
      this.Leg6.rotateAngleY = var10 * 1.0F - var9;
      this.Leg7.rotateAngleY = -var10 * 2.0F + var9;
      this.Leg8.rotateAngleY = var10 * 2.0F - var9;
      float var11 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * par2;
      float var12 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * par2;
      float var13 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * par2;
      float var14 = -(MathHelper.cos(par1 * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * par2;
      float var15 = Math.abs(MathHelper.sin(par1 * 0.6662F + 0.0F) * 0.4F) * par2;
      float var16 = Math.abs(MathHelper.sin(par1 * 0.6662F + (float)Math.PI) * 0.4F) * par2;
      float var17 = Math.abs(MathHelper.sin(par1 * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * par2;
      float var18 = Math.abs(MathHelper.sin(par1 * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * par2;
      this.Leg1.rotateAngleY += var11;
      this.Leg2.rotateAngleY += -var11;
      this.Leg3.rotateAngleY += var12;
      this.Leg4.rotateAngleY += -var12;
      this.Leg5.rotateAngleY += var13;
      this.Leg6.rotateAngleY += -var13;
      this.Leg7.rotateAngleY += var14;
      this.Leg8.rotateAngleY += -var14;
      this.Leg1.rotateAngleZ += var15;
      this.Leg2.rotateAngleZ += -var15;
      this.Leg3.rotateAngleZ += var16;
      this.Leg4.rotateAngleZ += -var16;
      this.Leg5.rotateAngleZ += var17;
      this.Leg6.rotateAngleZ += -var17;
      this.Leg7.rotateAngleZ += var18;
      this.Leg8.rotateAngleZ += -var18;
  }

}
