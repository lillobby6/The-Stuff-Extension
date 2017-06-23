package com.tse.main.core;

import java.util.Random;

import com.google.common.base.Predicate;
import com.tse.block.BlockManager;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator{
	
	private WorldGenerator gen_exalted_diamond_ore;
	private WorldGenerator gen_blood_diamond_ore;
	private WorldGenerator gen_terra_diamond_ore;
	private WorldGenerator gCopperOre;
	private WorldGenerator gTerriumOre;
	private WorldGenerator gWhiteStone;
	private WorldGenerator gSkyIronOre;
	private WorldGenerator gMortiumOre;
	private WorldGenerator gTinOre;
	private WorldGenerator gSphalerite;

	
	@Override
	 public void generate(Random random, int chunkX, int chunkZ, World world, net.minecraft.world.gen.IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)	 {   
		 switch (world.provider.getDimension()) 
		 {
		    case 0: //Overworld
		    	genOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		    	break;
		    case -1: //Nether
		    	genNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		    	break;
		    case 1: //End
		        break;
		    }
	 }
	
	public WorldGen() {}
	
	public void genOverworld(Random random, int chunkX, int chunkZ, World world, net.minecraft.world.gen.IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		addGen(BlockManager.whiteStone, world, random, chunkX, chunkZ, 20, 30, 80, 0, 255);
		
		addGen(BlockManager.toslotriumOre, world, random, chunkX, chunkZ, 8, 16, 30, 16, 128);
		
		addGen(BlockManager.sphalerite, world, random, chunkX, chunkZ, 4, 8, 20, 0, 128);
		
		addGen(BlockManager.exaltedDiamondOre, world, random, chunkX, chunkZ, 2, 6, 3, 0, 16);
		addGen(BlockManager.bloodDiamondOre, world, random, chunkX, chunkZ, 2, 6, 3, 0, 16);
		addGen(BlockManager.terraDiamondOre, world, random, chunkX, chunkZ, 2, 6, 3, 0, 16);
		
		addGen(BlockManager.skyIronOre, world, random, chunkX, chunkZ, 2, 12, 15, 0, 64);
		
		addGen(BlockManager.copperOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 64);
		addGen(BlockManager.tinOre, world, random, chunkX, chunkZ, 4, 16, 20, 0, 64);
		
		addGen(BlockManager.mortiumOre, world, random, chunkX, chunkZ, 1, 5, 2, 0, 10);
		addGen(BlockManager.vividiumOre, world, random, chunkX, chunkZ, 1, 5, 2, 0, 10);
		
		addGen(BlockManager.terriumOre, world, random, chunkX, chunkZ, 1, 1, 1, 0, 5);
	}
	
	public void genNether(Random random, int chunkX, int chunkZ, World world, net.minecraft.world.gen.IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){}
	
	public void genEnd(Random random, int chunkX, int chunkZ, World world, net.minecraft.world.gen.IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){}
	
	private void addGen(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minHeight, int maxHeight, Predicate<IBlockState> blockReplaced) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize + 1);
	    
	    WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), veinSize, blockReplaced);
	    
	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunkX * 16 + random.nextInt(16);
	        int y = minHeight + random.nextInt(heightDiff);
	        int z = chunkZ * 16 + random.nextInt(16);
	        gen.generate(world, random, new BlockPos(x, y, z));
	    }
	}
	private void addGen(Block block, World world, Random random, int chunkX, int chunkZ, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int veinSize = minVeinSize + random.nextInt(maxVeinSize - minVeinSize + 1);
	    
	    WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), veinSize);
	    
	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunkX * 16 + random.nextInt(16);
	        int y = minHeight + random.nextInt(heightDiff);
	        int z = chunkZ * 16 + random.nextInt(16);
	        gen.generate(world, random, new BlockPos(x, y, z));
	    }
	}
}