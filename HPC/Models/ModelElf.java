package HPC.Models;

import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelElf extends ModelBase
{
	ModelRenderer ElfLeg1;
    ModelRenderer ElfLeg2;
    ModelRenderer ElfBody;
    ModelRenderer ElfArm1;
    ModelRenderer ElfArm2;
    ModelRenderer ElfHead;
    ModelRenderer ElfEar1;
    ModelRenderer ElfEar2;
    ModelRenderer ElfWing1;
    ModelRenderer ElfWing2;
	
	public ModelElf()
	{
		textureWidth = 16;
    
		textureHeight = 16;

		  ElfLeg1 = new ModelRenderer(this, 12, 0);
	      ElfLeg1.addBox(0F, 0F, 0F, 1, 2, 1);
	      ElfLeg1.setRotationPoint(0F, 22F, 0F);
	      ElfLeg1.setTextureSize(16, 16);
	      ElfLeg1.mirror = true;
	      setRotation(ElfLeg1, 0F, 0F, 0F);
	      ElfLeg2 = new ModelRenderer(this, 12, 0);
	      ElfLeg2.addBox(0F, 0F, 0F, 1, 2, 1);
	      ElfLeg2.setRotationPoint(-1F, 22F, 0F);
	      ElfLeg2.setTextureSize(16, 16);
	      ElfLeg2.mirror = true;
	      setRotation(ElfLeg2, 0F, 0F, 0F);
	      ElfBody = new ModelRenderer(this, 0, 6);
	      ElfBody.addBox(0F, 0F, 0F, 2, 3, 1);
	      ElfBody.setRotationPoint(-1F, 19F, 0F);
	      ElfBody.setTextureSize(16, 16);
	      ElfBody.mirror = true;
	      setRotation(ElfBody, 0F, 0F, 0F);
	      ElfArm1 = new ModelRenderer(this, 8, 0);
	      ElfArm1.addBox(0F, 0F, 0F, 1, 3, 1);
	      ElfArm1.setRotationPoint(1F, 19F, 0F);
	      ElfArm1.setTextureSize(16, 16);
	      ElfArm1.mirror = true;
	      setRotation(ElfArm1, 0F, 0F, 0F);
	      ElfArm2 = new ModelRenderer(this, 8, 0);
	      ElfArm2.addBox(0F, 0F, 0F, 1, 3, 1);
	      ElfArm2.setRotationPoint(-2F, 19F, 0F);
	      ElfArm2.setTextureSize(16, 16);
	      ElfArm2.mirror = true;
	      setRotation(ElfArm2, 0F, 0F, 0F);
	      ElfHead = new ModelRenderer(this, 0, 0);
	      ElfHead.addBox(0F, 0F, 0F, 2, 2, 2);
	      ElfHead.setRotationPoint(-1F, 17F, -0.5F);
	      ElfHead.setTextureSize(16, 16);
	      ElfHead.mirror = true;
	      setRotation(ElfHead, 0F, 0F, 0F);
	      
	      
	      
	      
	      ElfEar1 = new ModelRenderer(this, 6, 5);
	      ElfEar1.addBox(0F, 0F, 0F, 0, 1, 1);
	      ElfEar1.setRotationPoint(-1F, 16.5F, 0.5F);
	      ElfEar1.setTextureSize(16, 16);
	      ElfEar1.mirror = true;
	      setRotation(ElfEar1, 0.4833166F, -0.2974216F, 0F);
	      ElfEar2 = new ModelRenderer(this, 6, 5);
	      ElfEar2.addBox(0F, 0F, 0F, 0, 1, 1);
	      ElfEar2.setRotationPoint(1F, 16.5F, 0.5F);
	      ElfEar2.setTextureSize(16, 16);
	      ElfEar2.mirror = true;
	      setRotation(ElfEar2, 0.4831619F, 0.2974289F, 0F);
	      ElfWing1 = new ModelRenderer(this, 0, 11);
	      ElfWing1.addBox(0F, 0F, 0F, 5, 3, 0);
	      ElfWing1.setRotationPoint(0F, 17.5F, 1F);
	      ElfWing1.setTextureSize(16, 16);
	      ElfWing1.mirror = true;
	      setRotation(ElfWing1, 0F, -2.621092F, -0.2160892F);
	      ElfWing2 = new ModelRenderer(this, 0, 11);
	      ElfWing2.addBox(0F, 0F, 0F, 5, 3, 0);
	      ElfWing2.setRotationPoint(0F, 17.5F, 1F);
	      ElfWing2.setTextureSize(16, 16);
	      ElfWing2.mirror = true;
	      setRotation(ElfWing2, 0F, -0.5576792F, 0.2160892F);
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5);
	    ElfLeg1.render(f5);
	    ElfLeg2.render(f5);
	    ElfBody.render(f5);
	    ElfArm1.render(f5);
	    ElfArm2.render(f5);
	    ElfHead.render(f5);
	    ElfEar1.render(f5);
	    ElfEar2.render(f5);
	    ElfWing1.render(f5);
	    ElfWing2.render(f5);
	}
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
	  {
	    super.setRotationAngles(par1, par2, par3, par4, par5, par6, null);
	    this.ElfArm1.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
        this.ElfArm2.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
        this.ElfArm1.rotateAngleZ = 0.0F;
        this.ElfArm2.rotateAngleZ = 0.0F;
        this.ElfLeg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
        this.ElfLeg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
        this.ElfLeg1.rotateAngleY = 0.0F;
        this.ElfLeg2.rotateAngleY = 0.0F;
	    this.ElfWing1.rotateAngleZ = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.0F * par2 * 0.5F;
        this.ElfWing2.rotateAngleZ = MathHelper.cos(par1 * 0.6662F) * 1.0F * par2 * 0.5F;
        this.ElfWing1.rotateAngleX = 0.0F;
        this.ElfWing2.rotateAngleX = 0.0F;
	  }
	
}
