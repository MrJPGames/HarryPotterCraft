package HPC.Entity;

import java.util.Random;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySpellConfringo extends EntityThrowable
{
    public EntitySpellConfringo(World par1World)
    {
        super(par1World);
    }

    public EntitySpellConfringo(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }

    public EntitySpellConfringo(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
   
    public void onUpdate()
    {
    	 float f = (float)this.posX + rand.nextFloat() * 0.1F;
         float f1 = (float)this.posY + rand.nextFloat();
         float f2 = (float)this.posZ + rand.nextFloat();
         this.worldObj.spawnParticle("largesmoke", (double)f, (double)f1, (double)f2, 0.0D, 0.0D, 0.0D);
    }
    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (par1MovingObjectPosition.entityHit != null)
        {
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0);
        }

        if (!this.worldObj.isRemote && this.rand.nextInt(8) == 0)
        {
            byte b0 = 1;

            if (this.rand.nextInt(32) == 0)
            {
                b0 = 4;
            }

            for (int i = 0; i < b0; ++i)
            {
                EntityChicken entitychicken = new EntityChicken(this.worldObj);
                entitychicken.setGrowingAge(-24000);
                entitychicken.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
                this.worldObj.spawnEntityInWorld(entitychicken);
            }
        }

        for (int j = 0; j < 8; ++j)
        {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
