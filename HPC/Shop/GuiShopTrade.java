package HPC.Shop;

import javax.swing.text.html.Option;

import HPC.modHPC;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiSlider;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.settings.EnumOptions;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

public class GuiShopTrade extends GuiScreen{
	//Set Variables
	String own;
	GuiButton Iron;
	GuiButton Gold;
	GuiButton Diamond;
	//setup basic (Owner name carried around every GUI screen)
	public GuiShopTrade(String owner){
		own = owner;
	}
	
	//draw GUI
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
		buttonList.add(new GuiButton(-1, posx, posy+60, 40, 20, "Back"));
		buttonList.add(new GuiButton(0 , posx /2, posy-40, 80, 20, "buy iron coin"));
		buttonList.add(new GuiButton(1 , posx /2, posy-20, 80, 20, "buy gold coin"));
		buttonList.add(new GuiButton(2 , posx /2, posy, 80, 20, "buy diamond coin"));
   
        
	}
	@Override
	public void drawScreen(int i, int j, float f)
	{
		super.drawDefaultBackground();
		this.drawCenteredString(this.fontRenderer, "You can trade gold/iron/diamond ingots for gold/iron/diamond coins!", this.width / 2, 10, 16777215);
		this.drawCenteredString(this.fontRenderer, "1 ingot = 1 coin", this.width / 2, 20, 16777215);
		super.drawScreen(i, j, f);
	}
	EntityPlayer player;
	ShopEventsHandler sh;
	//Actions for buttons in GUI
	@Override
	public void actionPerformed(GuiButton guibutton)
	{
		if (guibutton.id == -1)
		{
			mc.displayGuiScreen(new GuiShopMenu(own));
		}
		if (guibutton.id == 0)
		{
			sh.sell(own, Item.ingotIron, modHPC.coiniron);
		}
		if (guibutton.id == 1)
		{
			sh.sell(own, Item.ingotGold, modHPC.coingold);
		}
		if (guibutton.id == 2)
		{
			sh.sell(own, Item.diamond, modHPC.coindiamond);
		}
	}
	
	
	}
