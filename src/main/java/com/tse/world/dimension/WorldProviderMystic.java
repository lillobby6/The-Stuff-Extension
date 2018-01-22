package com.tse.world.dimension;

import com.tse.world.biome.BiomeManager;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderMystic extends WorldProvider{

	@Override
	public void init()
	{
		biomeProvider = new BiomeProviderSingle(BiomeManager.mysticPlains);
		setDimension(TSEDimensionManager.dim);
	}
	
	@Override
	public IChunkGenerator createChunkGenerator()
	{
		return new ChunkProviderMystic(world, world.getSeed());
	}
	
	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks)
	{
		return 0;
	}
	
	@Override
	public boolean canRespawnHere()
	{
		return false;
	}
	
	@Override
	public String getSaveFolder()
	{
		return "Mystic";
	}
	
	@Override
	public DimensionType getDimensionType() {
		return TSEDimensionManager.mysticWorld;
	}
	
}
