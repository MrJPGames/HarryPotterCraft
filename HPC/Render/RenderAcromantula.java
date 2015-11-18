package HPC.Render;

import HPC.Entity.EntityAcromantula;
import HPC.modHPC;
import HPC.mod_HPC;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;


public class RenderAcromantula extends RenderLiving
{

    public RenderAcromantula(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityAcromantula entityAcromantula, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityAcromantula, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityAcromantula)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityAcromantula)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {

		return modHPC.AcromantulaTex;
	}
}