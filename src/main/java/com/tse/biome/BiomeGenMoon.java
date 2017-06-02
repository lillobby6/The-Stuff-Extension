package com.tse.biome;

import com.tse.block.BlockManager;

import net.minecraft.world.biome.Biome;

public class BiomeGenMoon extends Biome{

	public BiomeGenMoon(Biome.BiomeProperties properties) {
		super(properties);
		this.topBlock = BlockManager.moonSand.getDefaultState();
		this.fillerBlock = BlockManager.moonStone.getDefaultState();
		this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
	}

}
