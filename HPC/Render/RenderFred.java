package HPC.Render;

import HPC.modHPC;
import HPC.Entity.EntityWeaslyFred;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;


public class RenderFred extends RenderLiving
{

    public RenderFred(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityWeaslyFred entityWeaslyFred, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityWeaslyFred, d, d1, d2, f, f1);
        this.renderLivingLabel(entityWeaslyFred, entityWeaslyFred.Name, d, d1, d2, 64);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityWeaslyFred)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityWeaslyFred)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		// TODO Auto-generated method stub
		return modHPC.WeaslyFredTex;
	}
}