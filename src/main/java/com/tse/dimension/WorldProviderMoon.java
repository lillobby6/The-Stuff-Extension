package com.tse.dimension;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderMoon extends WorldProviderSurface{

	
	public void registerWorldChunkManager()
	{

	}
	
	public IChunkGenerator createChunkGenerator()
    {
        return null;
    }

	@Override
	public DimensionType getDimensionType() {
		// TODO Auto-generated method stub
		return null;
	}

}
