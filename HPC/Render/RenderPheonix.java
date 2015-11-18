package HPC.Render;

import HPC.modHPC;
import HPC.Entity.EntityPheonix;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;


public class RenderPheonix extends RenderLiving
{

    public RenderPheonix(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityPheonix entityPheonix, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityPheonix, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityPheonix)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityPheonix)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		// TODO Auto-generated method stub
		return modHPC.PhoenixTex;
	}
}