/*package com.tse.dimension;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;

public class WorldProviderMoon extends WorldProvider{

	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.sky, 0.0F);
		this.dimensionId = 63;
		this.hasNoSky = true;
	}
	
	public IChunkGenerator createChunkGenerator()
    {
        return new ChunkProviderEnd(this.worldObj, false, this.worldObj.getSeed());
    }
	
	@Override
	public String getDimensionName() {
		// TODO Auto-generated method stub
		return "Moon";
	}

	@Override
	public String getInternalNameSuffix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DimensionType getDimensionType() {
		// TODO Auto-generated method stub
		return null;
	}

}*/
