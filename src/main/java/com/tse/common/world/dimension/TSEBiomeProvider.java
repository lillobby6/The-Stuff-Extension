package com.tse.common.world.dimension;

import java.util.Arrays;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;

public class TSEBiomeProvider extends BiomeProvider	{
	
	private final TSEBiomeCache mapCache;
	
	public TSEBiomeProvider()
	{
		getBiomesToSpawnIn().clear();
		getBiomesToSpawnIn().add(Biomes.MUSHROOM_ISLAND);
		getBiomesToSpawnIn().add(Biomes.FOREST);
		
		mapCache = new TSEBiomeCache(this, 512, true);
	}
	
	@Override
	public Biome[] getBiomesForGeneration(Biome[] biomes, int x, int z, int width, int height) {
		return getBiomesForGeneration(biomes, x, z, width, height, true);
	}

	public Biome[] getBiomesForGeneration(Biome[] biomes, int x, int z, int width, int height, boolean useCache) {
		// for grid-centred magic maps, get from map cache
		if (useCache && mapCache.isGridAligned(x, z, width, height)) {
			Biome[] cached = mapCache.getBiomes(x, z);
			return Arrays.copyOf(cached, cached.length);
		}
		return super.getBiomesForGeneration(biomes, x, z, width, height);
	}
	
	@Override
	public void cleanupCache() {
		mapCache.cleanup();
		super.cleanupCache();
	}
	
}
