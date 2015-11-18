package HPC;

import java.util.Map;

import HPC.Entity.EntityElf;
import HPC.Items.ItemHPCArmor;
import HPC.Models.ModelElf;
import HPC.Render.RenderElf;

import cpw.mods.fml.common.*;
import net.minecraft.item.*;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderFireball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.src.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.*;
import net.minecraft.world.biome.BiomeGenBase;
import HPC.Items.*;
import HPC.Models.*;
import HPC.Other.HPCTab;
import HPC.Entity.*;
import HPC.Render.*;

public class mod_HPC extends BaseMod{

	
	
	@Override
	public String getVersion() 
	{
		return "Minecraft 1.4.6 Mod 1.0 (Mobs)";
	}
	
	@Override
	public void load() 
	{
		//names
		

		
		//Elf
		int redColor = (255 << 16);
	    int orangeColor = (255 << 16)+ (200 << 8);
	    ModLoader.registerEntityID(EntityMonsterBook.class, "Monster Book", ModLoader.getUniqueEntityId(), redColor+orangeColor, orangeColor-redColor);
	    ModLoader.registerEntityID(EntityGarrickOllivander.class, "Garrick Ollivander", ModLoader.getUniqueEntityId(), redColor-orangeColor*redColor, redColor*redColor*orangeColor-10+redColor);
	    ModLoader.registerEntityID(EntityPheonix.class, "Pheonix", ModLoader.getUniqueEntityId(), redColor*redColor-redColor*redColor*redColor, orangeColor/redColor*orangeColor/redColor);
	    //Register Elf
	    ModLoader.registerEntityID(EntityElf.class, "Elf" ,ModLoader.getUniqueEntityId(), redColor,orangeColor);
			// spawn
			ModLoader.addSpawn(EntityElf.class, 3, 100, 200, EnumCreatureType.creature, 
				new BiomeGenBase[]
				{
				BiomeGenBase.forest,
				BiomeGenBase.forestHills,
				BiomeGenBase.jungle,
				BiomeGenBase.jungleHills
				}
			);
		//Acromantula
			//Register Acromantula
		    ModLoader.registerEntityID(EntityAcromantula.class, "Acromantula" ,ModLoader.getUniqueEntityId(), orangeColor - redColor,redColor - orangeColor);
				// spawn
				ModLoader.addSpawn(EntityAcromantula.class, 3, 100, 200, EnumCreatureType.monster
				);
				
		//Werewolf
				ModLoader.registerEntityID(EntityWerewolf.class, "Werewolf" ,ModLoader.getUniqueEntityId(), orangeColor,redColor);
				ModLoader.registerEntityID(EntityWeaslyGeorge.class, "WeaslyGeorge" ,ModLoader.getUniqueEntityId(), orangeColor - redColor,redColor);
				ModLoader.registerEntityID(EntityWeaslyFred.class, "WeaslyFred" ,ModLoader.getUniqueEntityId(), orangeColor,redColor - orangeColor);
			
	}
	public void addRenderer(Map map)
	{
		map.put(HPC.Entity.EntityElf.class, new RenderElf(new ModelElf(), 0.5F));
		map.put(EntityAcromantula.class, new RenderAcromantula(new ModelAcromantula(), 0.5F));
		map.put(EntityWerewolf.class, new net.minecraft.client.renderer.entity.RenderBiped(new net.minecraft.client.model.ModelBiped(), 0.5F));
		map.put(EntityWeaslyFred.class, new RenderFred(new net.minecraft.client.model.ModelBiped(), 0.5F));
		map.put(EntityWeaslyGeorge.class, new RenderGeorge(new net.minecraft.client.model.ModelBiped(), 0.5F));
		map.put(EntityMonsterBook.class, new RenderMonsterBook(new ModelBook(), 0.5F));
		map.put(EntitySpellConfringo.class, new RenderSpell(0.5F));
		map.put(EntityGarrickOllivander.class, new RenderGarrickOllivander(new net.minecraft.client.model.ModelBiped(), 0.5F));
		map.put(EntityPheonix.class, new RenderPheonix(new ModelPheonix(), 0.5F));
	}
	
}
