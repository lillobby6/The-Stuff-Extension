package com.tse.common.world.gen;

import java.util.Random;

import com.google.common.base.Predicate;
import com.tse.common.config.Config;
import com.tse.common.world.block.BlockManager;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator{	
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
		if(Config.spawnWhiteStone)
			addGen(BlockManager.whiteStone, world, random, chunkX, chunkZ, 20, 30, Config.freqWhiteStone, 0, 255);
		if(Config.spawnTitanium)
			addGen(BlockManager.titaniumOre, world, random, chunkX, chunkZ, 1, 8, Config.freqTitanium, 0, 30);
		if(Config.spawnPlatinum)
			addGen(BlockManager.platinumOre, world, random, chunkX, chunkZ, 1, 4, Config.freqPlatinum, 0, 40);
		if(Config.spawnGalena)
			addGen(BlockManager.galenaOre, world, random, chunkX, chunkZ, 1, 12, Config.freqGalena, 0, 32);
		if(Config.spawnSilver)
			addGen(BlockManager.silverOre, world, random, chunkX, chunkZ, 1, 8, Config.freqSilver, 0, 32);
		if(Config.spawnPentlandite)
			addGen(BlockManager.pentlanditeOre, world, random, chunkX, chunkZ, 4, 16, Config.freqPentlandite, 0, 64);
		if(Config.spawnAluminum)
			addGen(BlockManager.aluminumOre, world, random, chunkX, chunkZ, 4, 20, Config.freqAluminum, 0, 64);
		if(Config.spawnToslotrium)
			addGen(BlockManager.toslotriumOre, world, random, chunkX, chunkZ, 8, 16, Config.freqToslotrium, 16, 128);
		if(Config.spawnSphalerite)
			addGen(BlockManager.sphaleriteOre, world, random, chunkX, chunkZ, 4, 8, Config.freqSphalerite, 0, 128);
		if(Config.spawnExaltedDiamond)
			addGen(BlockManager.exaltedDiamondOre, world, random, chunkX, chunkZ, 2, 6, Config.freqExaltedDiamond, 0, 16);
		if(Config.spawnBloodDiamond)
			addGen(BlockManager.bloodDiamondOre, world, random, chunkX, chunkZ, 1, 6, Config.freqBloodDiamond, 0, 16);
		if(Config.spawnTerraDiamond)
			addGen(BlockManager.terraDiamondOre, world, random, chunkX, chunkZ, 1, 6, Config.freqTerraDiamond, 0, 16);
		if(Config.spawnSkyIron)
			addGen(BlockManager.skyIronOre, world, random, chunkX, chunkZ, 2, 12, Config.freqSkyIron, 0, 64);
		if(Config.spawnCopper)
			addGen(BlockManager.copperOre, world, random, chunkX, chunkZ, 4, 16, Config.freqCopper, 0, 64);
		if(Config.spawnTin)
			addGen(BlockManager.tinOre, world, random, chunkX, chunkZ, 4, 16, Config.freqTin, 0, 64);
		if(Config.spawnMortium)
			addGen(BlockManager.mortiumOre, world, random, chunkX, chunkZ, 1, 5, Config.freqMortium, 0, 10);
		if(Config.spawnVividium)
			addGen(BlockManager.vividiumOre, world, random, chunkX, chunkZ, 1, 5, Config.freqVividium, 0, 10);
		if(Config.spawnTerrium)
			addGen(BlockManager.terriumOre, world, random, chunkX, chunkZ, 1, 1, Config.freqTerrium, 0, 5);
		if(Config.spawnMeteors)
			addGen(BlockManager.meteor, world, random, chunkX, chunkZ, 0, 30, Config.freqMeteors, 50, 64);
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