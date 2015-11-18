package HPC.Entity;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import HPC.modHPC;
import HPC.Other.*;
import HPC.Shop.*;

public class EntityWeaslyFred extends EntityAnimal{

	public EntityWeaslyFred(World par1World) {
		super(par1World);
		this.setSize(1F, 2F);
		Name="Fred Weasly";
	}
	public String Name;
	@SideOnly(Side.CLIENT)
	public boolean interact(EntityPlayer player)
    {
		Minecraft mc = ModLoader.getMinecraftInstance();
		FMLClientHandler.instance().displayGuiScreen(player, new GuiShopMenu("Fred"));
		return true;
		
    }

	

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		return null;
	}

	@Override
	public int getMaxHealth() {
		return 10;
	}

	
}
