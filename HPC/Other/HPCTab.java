package HPC.Other;

import HPC.modHPC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public final class HPCTab extends CreativeTabs
{
        public HPCTab(int par1, String par2Str)
        {
                super(par1, par2Str);
        }
        
        //sets the image for the creative tab
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
           
                return modHPC.glasses.itemID;
        }
   
        //sets the title/name for the creative tab
        public String getTranslatedTabLabel()
        {
         return "Harry Potter";
        }
}