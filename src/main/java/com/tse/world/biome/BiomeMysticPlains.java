package com.tse.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeMysticPlains extends Biome{

	public BiomeMysticPlains() {
		super(new BiomeProperties("Mystic Plains").setHeightVariation(0.6F));
		setRegistryName("mystic_plains");
	}
	
	public void setSpawnLists()
	{
		spawnableCreatureList.clear();
		spawnableWaterCreatureList.clear();
	}
}
