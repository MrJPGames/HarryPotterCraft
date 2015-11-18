package HPC.Shop;

import org.lwjgl.opengl.GL11;

import HPC.modHPC;
import HPC.Entity.EntityWeaslyGeorge;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class GuiShopBuyScreen extends GuiScreen{
	//initilize variables
	String item;
	int iitem;
	int cost;
	String own;
	Item get;
	//basic setup
	public GuiShopBuyScreen(String items, Item iitem, int costs, String owner)
	{
		item = items;
		cost = costs;
		own = owner;
		get = iitem;
	}
	ItemStack itemstack;
	EntityWeaslyGeorge WG;
	//Draw GUI
	@Override
	public void initGui()
	{
		ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		width = sr.getScaledWidth();
		height = sr.getScaledHeight();
		int sizex = 40;
		int sizey = 100;
		int posx = (width-sizex)/2;
		int posy = (height-sizey)/2;
		buttonList.clear();
		buttonList.add(new GuiButton(0, posx - 40, posy, 40, 20, "Yes"));
		buttonList.add(new GuiButton(1 , posx + 40, posy, 40, 20, "No"));
		
	}
	@Override
	public void drawScreen(int i, int j, float f)
	{
		String gold = "";
		this.drawDefaultBackground();
	
		if (cost == 0)	
		{
			gold = " iron coin";
		}
		if (cost == 1)	
		{
			gold = " gold coin";
		}
		if (cost == 2)	
		{
			gold = " diamond coin";
		}
		
		String text = "Do you want to buy " + item + ". This will cost you 1 " + gold;
		this.drawCenteredString(this.fontRenderer, text, this.width / 2, 40, 16777215);
		super.drawScreen(i, j, f);
	}
	
	EntityPlayer player;
	//actions when buttons in GUI are pressed
	@Override
	public void actionPerformed(GuiButton guibutton)
	{
		Item pay = null;
		if (cost == 0)	
		{
			pay = modHPC.coiniron;
		}
		if (cost == 1)	
		{
			pay = modHPC.coingold;
		}
		if (cost == 2)	
		{
			pay = modHPC.coindiamond;
		}
		if (guibutton.id == 0)
		{
			ShopEventsHandler.HandleBuy(iitem, cost, own, pay, get, item);
		}
		if (guibutton.id == 1)
		{
			if (own == "Ollivander")
			{
				mc.displayGuiScreen(new GuiShopSpellBooksMenu(own));
			}
			else
			{
				mc.displayGuiScreen(new GuiShopMenu(own));
			}
		}
	}
	


}
