package HPC.Render;

import HPC.modHPC;
import HPC.Entity.EntityMonsterBook;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import net.minecraft.util.ResourceLocation;


public class RenderMonsterBook extends RenderLiving
{

    public RenderMonsterBook(ModelBase modelbase, float f)
    {
        super(modelbase, f); 
    }

    public void func_177_a(EntityMonsterBook entityMonsterBook, double d, double d1, double d2, 
            float f, float f1)
    {
        super.doRenderLiving(entityMonsterBook, d, d1, d2, f, f1);
    }

    public void doRenderLiving(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityMonsterBook)entityliving, d, d1, d2, f, f1);
    }

    public void doRender(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
    	func_177_a((EntityMonsterBook)entity, d, d1, d2, f, f1);
    }

	@Override
	protected ResourceLocation func_110775_a(Entity entity) {
		// TODO Auto-generated method stub
		return modHPC.MonsterBookTex;
	}
}