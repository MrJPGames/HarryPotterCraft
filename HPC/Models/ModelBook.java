

package HPC.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.src.ModLoader;
import net.minecraft.util.MathHelper;

public class ModelBook extends ModelBase
{
  //fields
    ModelRenderer BookDown;
    ModelRenderer BookUp;
    ModelRenderer BookSide;
  
  public ModelBook()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      BookDown = new ModelRenderer(this, 0, 0);
      BookDown.addBox(0F, 0F, 0F, 6, 1, 12);
      BookDown.setRotationPoint(-3F, 23F, -6F);
      BookDown.setTextureSize(64, 32);
      BookDown.mirror = true;
      setRotation(BookDown, 0F, 0F, 0F);
      BookUp = new ModelRenderer(this, 26, 17);
      BookUp.addBox(0F, 0F, 0F, 6, 1, 12);
      BookUp.setRotationPoint(-3F, 22F, -6F);
      BookUp.setTextureSize(64, 32);
      BookUp.mirror = true;
      setRotation(BookUp, 0F, 0F, 0F);
      BookSide = new ModelRenderer(this, 0, 18);
      BookSide.addBox(0F, 0F, 0F, 1, 2, 12);
      BookSide.setRotationPoint(-4F, 22F, -6F);
      BookSide.setTextureSize(64, 32);
      BookSide.mirror = true;
      setRotation(BookSide, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    BookDown.render(f5);
    BookUp.render(f5);
    BookSide.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    float cos = MathHelper.cos(-f);
   
    if (cos <= 0F)
    {
    	this.BookUp.rotateAngleZ = MathHelper.cos(f);
        this.BookUp.rotateAngleX = 0.0F;

    }
    else
    {
    	f=-1F;
    	this.BookUp.rotateAngleZ = 0F;
        this.BookUp.rotateAngleX = 0.0F;
       
    }
    
    
  }

}
