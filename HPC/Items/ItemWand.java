package HPC.Items;

import java.util.List;

import HPC.modHPC;
import HPC.Entity.EntitySpellConfringo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.*;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemWand extends Item
{
int SpellID;
public ItemWand(int par1, int par2, int Spell)
{
	super (par1);
	SpellID = Spell;
	this.setCreativeTab(modHPC.HarryPotterCT);
}
@Override
 public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
 {         if (!world.isRemote)
         {
                 Vec3 look = entityplayer.getLookVec();
                 EntitySpellConfringo fireball2 = new EntitySpellConfringo(world, 1, 1, 1);
                 fireball2.setPosition(
                                 entityplayer.posX + look.xCoord * 5,
                                 entityplayer.posY + look.yCoord * 5,
                                 entityplayer.posZ + look.zCoord * 5);
                 fireball2.motionX = look.xCoord * 0.1;
                 fireball2.motionY = look.yCoord * 0.1;
                 fireball2.motionZ = look.zCoord * 0.1;
                 world.spawnEntityInWorld(fireball2);
         }
         return itemstack;
 }
public void registerIcons(IconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("hpcraft:" + (this.getUnlocalizedName().substring(5)));
}
}