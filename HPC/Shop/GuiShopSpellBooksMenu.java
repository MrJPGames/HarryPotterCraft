package HPC.Shop;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.server.FMLServerHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.*;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.*;
import net.minecraft.src.ModLoader;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import HPC.*;
import HPC.Entity.*;

public class GuiShopSpellBooksMenu extends GuiScreen
{
	String own;
	//sets basic info (Owner name carried around every single GUI screen!)
	public GuiShopSpellBooksMenu(String owner)
	{
		own = owner;
	}
	//draw gui
	@Override
	public void initGui()
	{
		ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		width = sr.getScaledWidth();
		height = sr.getScaledHeight();
		int posx = width/2;
		int posy = height/2;
		buttonList.clear();
		buttonList.add(new GuiButton(-1, posx - 140, posy + 80, 80 , 20, "Exit Shop"));
		
		buttonList.add(new GuiButton(0, posx - 140 , posy - 80, 140, 20, "Flipendo"));
		buttonList.add(new GuiButton(1, posx       , posy - 80, 140, 20, "Lumos"));
		buttonList.add(new GuiButton(2, posx - 140 , posy - 60, 140, 20, "Confringo"));
	}
	@Override
	public void drawScreen(int i, int j, float f)
	{
		super.drawDefaultBackground();
		this.drawCenteredString(this.fontRenderer, own + "'s shop! (Spellbooks)", this.width / 2, 10, 16777215);
		super.drawScreen(i, j, f);
	}
	EntityPlayer player;
	ShopEventsHandler sh;
	
	//button press event
	@Override
	public void actionPerformed(GuiButton guibutton)
	{

		if (guibutton.id == -1)
		{
			mc.thePlayer.addChatMessage(own +": Thanks for visiting my shop!");
			mc.thePlayer.closeScreen();
		}
		if (guibutton.id == 0)
		{
			mc.displayGuiScreen(new GuiShopBuyScreen("Spellbook: Flipendo", modHPC.spellbookFlipendo, 1, own));
		}
		if (guibutton.id == 1)
		{
			mc.displayGuiScreen(new GuiShopBuyScreen("Spellbook: Lumos", modHPC.spellbookLumos, 1, own));
		}	
		if (guibutton.id == 2)
		{
			mc.displayGuiScreen(new GuiShopBuyScreen("Spellbook: Confringo", modHPC.spellbookConfringo, 0, own));
		}	
		
}
	
	
	
	
}
