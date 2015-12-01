package com.tse.main.core;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.tse.block.BlockManager;

public class WorldGen implements IWorldGenerator{
	
	private WorldGenerator gen_exalted_diamond_ore;
	private WorldGenerator gen_blood_diamond_ore;
	private WorldGenerator gen_terra_diamond_ore;

	
	@Override
	 public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	 {   
		 switch (world.provider.getDimensionId()) 
		 {
		    case 0: //Overworld
		    	this.runGenerator(this.gen_exalted_diamond_ore, world, random, chunkX, chunkZ, 10, 0, 16);
		    	this.runGenerator(this.gen_blood_diamond_ore, world, random, chunkX, chunkZ, 10, 0, 16);
		    	this.runGenerator(this.gen_terra_diamond_ore, world, random, chunkX, chunkZ, 10, 0, 16);
		        break;
		    case -1: //Nether

		        break;
		    case 1: //End

		        break;
		    }
	 }
	

	public WorldGen() {
	    this.gen_exalted_diamond_ore = new WorldGenMinable(BlockManager.exaltedDiamondOre.getDefaultState(), 8);
	    this.gen_blood_diamond_ore = new WorldGenMinable(BlockManager.bloodDiamondOre.getDefaultState(), 8);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
}
