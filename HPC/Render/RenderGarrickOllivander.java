package HPC.Render;

import HPC.modHPC;
import HPC.Entity.EntityGarrickOllivander;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;


public class RenderGarrickOllivander extends RenderLiving
{

    public RenderGarrickOllivander(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityGarrickOllivander entityGarrickOllivander, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityGarrickOllivander, d, d1, d2, f, f1);
        this.renderLivingLabel(entityGarrickOllivander, entityGarrickOllivander.Name, d, d1, d2, 64);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityGarrickOllivander)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityGarrickOllivander)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		// TODO Auto-generated method stub
		return modHPC.GarrickOllivanderTex;
	}
}