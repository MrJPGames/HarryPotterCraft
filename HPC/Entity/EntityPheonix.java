package HPC.Entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityPheonix extends EntityMob{

	public EntityPheonix(World par1World) {
		super(par1World);
	}

	@Override
	public int getMaxHealth() {
		return 10;
	}
	
}
