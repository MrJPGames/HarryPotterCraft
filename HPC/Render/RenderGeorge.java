package HPC.Render;

import HPC.modHPC;
import HPC.Entity.EntityWeaslyGeorge;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;


public class RenderGeorge extends RenderLiving
{

    public RenderGeorge(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityWeaslyGeorge entityWeaslyGeorge, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityWeaslyGeorge, d, d1, d2, f, f1);
        this.renderLivingLabel(entityWeaslyGeorge, entityWeaslyGeorge.Name, d, d1, d2, 64);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityWeaslyGeorge)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityWeaslyGeorge)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		// TODO Auto-generated method stub
		return modHPC.WeaslyGeorgeTex;
	}
}