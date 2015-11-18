package HPC.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import HPC.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HPCItem extends Item{
	boolean Special;
	public HPCItem(int par1, int par2, boolean special) 
	{
		super(par1);
		this.setCreativeTab(modHPC.HarryPotterCT);
		Special=special;
	}
	public String getTextureFile()
	{
		return "/HPC/Textures/items.png";
	}
	@Override
	public boolean hasEffect(ItemStack itemstack)
	{
		return Special;
		
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
	         this.itemIcon = iconRegister.registerIcon("hpcraft:" + (this.getUnlocalizedName().substring(5)));
	}
}
