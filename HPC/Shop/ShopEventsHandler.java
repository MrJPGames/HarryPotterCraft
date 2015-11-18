package HPC.Shop;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import HPC.modHPC;
import cpw.mods.fml.client.FMLClientHandler;

public class ShopEventsHandler 
{
	//handels basic speach (via text)
	//Only for buying text all other things are build into actions.
	public static void speach(String item, boolean suc, String own)
	{
		if (suc == true)
		{
			FMLClientHandler.instance().getClient().thePlayer.addChatMessage(own +": There You go one " + item);
		}
		else
		{
			FMLClientHandler.instance().getClient().thePlayer.addChatMessage(own + ": Sorry we do sell " + item + " for free please come back later if you have money");
		}
	}
	//tests for item you need to buy somthing if present it will say "Onwsers Name: There you go one ItemName"
	//Also contains basic "error/no money" messages
	public static void sell(String own, Item pay, Item get)
	{
		boolean var1 = FMLClientHandler.instance().getClient().thePlayer.inventory.consumeInventoryItem(pay.itemID);
		if (var1 == true)
		{
			speach("Coins", true, own);
			FMLClientHandler.instance().getClient().thePlayer.inventory.addItemStackToInventory(new ItemStack(get));
		}
		else if(pay == Item.diamond)
		{
			FMLClientHandler.instance().getClient().thePlayer.addChatMessage(own + ": You don't have any diamonds left so we can't give you coins");
		}
		else
		{
			FMLClientHandler.instance().getClient().thePlayer.addChatMessage(own + ": You don't have any ingots left so we can't give you coins");
		}
	}
	//Probably unused right now was for trading items for coins
	public static void Trade(String own, String CoinType, int diamondamount)
	{
		boolean var1 = FMLClientHandler.instance().getClient().thePlayer.inventory.consumeInventoryItem(Item.ingotIron.itemID);
		if (var1 == true)
		{
			speach("coin", true, own);
			FMLClientHandler.instance().getClient().thePlayer.inventory.addItemStackToInventory(new ItemStack(modHPC.coiniron));
		}
		else
		{
			FMLClientHandler.instance().getClient().thePlayer.addChatMessage(own + ": You don't have any ingots left so we can't give you coins");
		}
	}
	//This handles buys for players
	public static void HandleBuy(int item, int costs, String own, Item pay, Item get, String itemstring)
	{
		boolean var1 = FMLClientHandler.instance().getClient().thePlayer.inventory.consumeInventoryItem(pay.itemID);
		if (var1 == true)
		{
			speach(itemstring, true, own);
			FMLClientHandler.instance().getClient().thePlayer.inventory.addItemStackToInventory(new ItemStack(get));
		}
		else
		{
			speach(itemstring, false, own);
		}
	}
	

}
