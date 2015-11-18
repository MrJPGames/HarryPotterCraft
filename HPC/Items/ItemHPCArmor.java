package HPC.Items;

import HPC.modHPC;
import net.minecraftforge.*;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.src.*;
public class ItemHPCArmor extends ItemArmor
{
		EntityPlayer entityplayer;
        public ItemHPCArmor(int i, EnumArmorMaterial enumarmormaterial, int j, int k)
        {
                super(i, enumarmormaterial, j, k);
                this.setCreativeTab(modHPC.HarryPotterCT);
                this.setMaxStackSize(64);
        }
        
        public String getTextureFile()
        {
                return "/HPC/Textures/items.png";
        }
        public String getArmorTextureFile(ItemStack itemstack)
        {
        		//Harry Potter Craft Armor Textures
                if(itemstack.itemID == modHPC.glasses.itemID || itemstack.itemID == modHPC.schooluniformshirtG.itemID || itemstack.itemID == modHPC.shoes.itemID)
                {
                    return "hpcraft:textures/models/armor/HarryCloth_1";
                }
                if(itemstack.itemID == modHPC.schooluniformpantsG.itemID)
                {
                    return "hpcraft:textures/models/armor/HarryCloth_2.png";
                }
                if (itemstack.itemID == modHPC.schooluniformshirtH.itemID)
                {
                	return "hpcraft:textures/models/armor/HCloth.png";
                }
                if (itemstack.itemID == modHPC.schooluniformshirtS.itemID)
                {
                	return "hpcraft:textures/models/armor/SCloth.png";
                }
                if (itemstack.itemID == modHPC.schooluniformshirtR.itemID)
                {
                	return "hpcraft:textures/models/armor/RCloth.png";
                }
                if (itemstack.itemID == modHPC.shirt1.itemID)
                {
                	return "hpcraft:textures/models/armor/FreedomShirt.png";
                }
                if (itemstack.itemID == modHPC.shirt2.itemID)
                {
                	return "hpcraft:textures/models/armor/Shirt.png";
                }
                else return null;
                
                
            
        }
        public void registerIcons(IconRegister iconRegister) {
	         this.itemIcon = iconRegister.registerIcon("hpcraft:" + (this.getUnlocalizedName().substring(5)));
        }


}