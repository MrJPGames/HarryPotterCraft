package HPC;

import net.minecraft.client.audio.SoundManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.src.*;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

import paulscode.sound.Library;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.asm.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import net.minecraftforge.client.*;
import net.minecraftforge.common.*;
import HPC.Entity.EntityAcromantula;
import HPC.Entity.EntityElf;
import HPC.Entity.EntityWeaslyFred;
import HPC.Entity.EntityWeaslyGeorge;
import HPC.Entity.EntityWerewolf;
import HPC.Items.*;
import HPC.Models.ModelAcromantula;
import HPC.Models.ModelElf;
import HPC.Other.*;
import HPC.Render.RenderAcromantula;
import HPC.Render.RenderElf;
import HPC.Shop.*;

@Mod(name="Harry Potter Craft mod",modid="hpcraft",version="MC: 1.4.6 HPC: 1.0 (Mod)")
@NetworkMod(clientSideRequired=true, serverSideRequired=false, 
channels={"HarryPotterCraft"}, packetHandler = HPCPacketHandler.class)

public class modHPC
{
	
	
	
	public static CreativeTabs HarryPotterCT = new HPCTab(CreativeTabs.getNextID(), "HBCTab");
	//Harry outfit
	static EnumArmorMaterial EnumHarryCloth = EnumHelperClient.addArmorMaterial("HarryCloth", 2, new int[]{1, 1, 1, 1}, 2);
	public static final Item glasses = new ItemHPCArmor(1000, EnumHarryCloth, 0, 0).setUnlocalizedName("Glasses");
	public static final Item schooluniformshirtG = new ItemHPCArmor(1001, EnumHarryCloth, 0, 1).setUnlocalizedName("SchoolUniform1G");
	public static final Item schooluniformpantsG = new ItemHPCArmor(1002, EnumHarryCloth, 0, 2).setUnlocalizedName("SchoolUniform2G");
	public static final Item shoes = new ItemHPCArmor(1003, EnumHarryCloth, 0, 3).setUnlocalizedName("Shoes");
	
	public static final Item schooluniformshirtH = new ItemHPCArmor(1004, EnumHarryCloth, 0, 1).setUnlocalizedName("SchoolUniform1H");
	public static final Item schooluniformshirtS = new ItemHPCArmor(1005, EnumHarryCloth, 0, 1).setUnlocalizedName("SchoolUniform1S");
	public static final Item schooluniformshirtR = new ItemHPCArmor(1006, EnumHarryCloth, 0, 1).setUnlocalizedName("SchoolUniform1R");
	
	public static final Item shirt1 = new ItemHPCArmor(1007, EnumHarryCloth, 0, 1).setUnlocalizedName("FanShirt1");
	public static final Item shirt2 = new ItemHPCArmor(1008, EnumHarryCloth, 0, 1).setUnlocalizedName("FanShirt2");
	
	public static final Item coingold = new HPCItem(1009, 8, false).setUnlocalizedName("coingold");
	public static final Item coiniron = new HPCItem(1010, 9, false).setUnlocalizedName("coiniron");
	public static final Item coindiamond = new HPCItem(1011, 10, false).setUnlocalizedName("coindiamond");
	public static final Item ChoclateFrog = new ItemFood(1012, 11, false).setUnlocalizedName("ChoclateFrog");
	public static final Item spellbookFlipendo = new HPCItem(1013, 12, true).setUnlocalizedName("SpellBook1");
	public static final Item spellbookLumos = new HPCItem(1014, 12, true).setUnlocalizedName("SpellBook2");
	public static final Item spellbookConfringo = new HPCItem(1015, 12, true).setUnlocalizedName("SpellBook3");

	public static final Item wandFlipendo = new ItemWand(1016, 12, 1).setUnlocalizedName("Wand1");
	public static final Item wandLumos = new ItemWand(1017, 12, 2).setUnlocalizedName("Wand2");
	public static final Item wandConfringo = new ItemWand(1018, 12, 3).setUnlocalizedName("Wand3");
	
	public static final ResourceLocation AcromantulaTex = new ResourceLocation("hpcraft" ,"textures/entities/Acromantula.png");
	public static final ResourceLocation ElfTex = new ResourceLocation("hpcraft" ,"textures/entities/Elf.png");
	public static final ResourceLocation GarrickOllivanderTex = new ResourceLocation("hpcraft" ,"textures/entities/Ollivander.png");
	public static final ResourceLocation MonsterBookTex = new ResourceLocation("hpcraft" ,"textures/entities/MonsterBook.png");
	public static final ResourceLocation PhoenixTex = new ResourceLocation("hpcraft" ,"textures/entities/Pheonix.png");
	public static final ResourceLocation SpellConfringoTex = new ResourceLocation("hpcraft" ,"");
	public static final ResourceLocation SpellFlipendoTex = new ResourceLocation("hpcraft" ,"");
	public static final ResourceLocation WeaslyFredTex = new ResourceLocation("hpcraft" ,"textures/entities/Fred.png");
	public static final ResourceLocation WeaslyGeorgeTex = new ResourceLocation("hpcraft" ,"textures/entities/George.png");
	public static final ResourceLocation WerewolfTex = new ResourceLocation("hpcraft" ,"");
	
	
	
	public modHPC() {

	}

	Map map;
	@Instance("HPC")
	public static modHPC HPCInstance;
	@Init
	public void load(FMLInitializationEvent evt)
	{
		proxy.Names();
	}

	@SidedProxy(clientSide = "HPC.Other.HPCClientProxy", serverSide = "HPC.Other.HPCCommonProxy")
    public static HPCCommonProxy proxy;
	

}