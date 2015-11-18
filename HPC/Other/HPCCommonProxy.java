package HPC.Other;

import java.util.Map;

import net.minecraft.src.ModLoader;
import HPC.*;

public class HPCCommonProxy {

	
	public void Names()
	{
		ModLoader.addLocalization("entity.Elf.name", "en_US", "Celtic Pixie");
	    ModLoader.addLocalization("entity.Elf.name", "nl_NL", "Keltisch Aardmannetje");
	    ModLoader.addLocalization("entity.Acromantula.name", "en_US", "Baby Acromantula");
	    ModLoader.addLocalization("entity.Acromantula.name", "nl_NL", "Baby Acromantula");
	    ModLoader.addLocalization("entity.Werewolf.name", "en_US", "Werewolf");
	    ModLoader.addLocalization("entity.Werewolf.name", "nl_NL", "Weerwolf");
	    ModLoader.addLocalization("entity.WeaslyFred.name", "en_US", "Fred");
	    ModLoader.addLocalization("entity.WeaslyFred.name", "nl_NL", "Fred");
	    ModLoader.addLocalization("entity.WeaslyGeorge.name", "en_US", "George");
	    ModLoader.addLocalization("entity.WeaslyGeorge.name", "nl_NL", "George");
	    
	    ModLoader.addName(modHPC.spellbookFlipendo, "Spellbook: Flipendo");
	    ModLoader.addName(modHPC.spellbookLumos, "Spellbook: Lumos");
	    ModLoader.addName(modHPC.spellbookConfringo, "Spellbook: Confringo");
	    
	    ModLoader.addName(modHPC.glasses, "Glasses");
	    ModLoader.addName(modHPC.schooluniformshirtG, "School uniform (Gryfindor)");
	    ModLoader.addName(modHPC.schooluniformpantsG, "School uniform (Gryfindor)");
	    
	    ModLoader.addName(modHPC.schooluniformshirtH, "School uniform (Huffelpuff)");
	    ModLoader.addName(modHPC.schooluniformshirtR, "School uniform (Revenclaw)");
	    ModLoader.addName(modHPC.schooluniformshirtS, "School uniform (Slytherin)");
	    ModLoader.addName(modHPC.shirt1, "Shirt (Freedom Sock)");
	    ModLoader.addName(modHPC.shirt2, "Shirt (Deathly Hallows)");
	    
	    ModLoader.addName(modHPC.shoes, "Shoes");
	    
	    ModLoader.addName(modHPC.coingold, "Golden Coin");
	    ModLoader.addName(modHPC.coiniron, "Iron Coin");
	    ModLoader.addName(modHPC.coindiamond, "Diamont Coin");
	}

}
