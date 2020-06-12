package com.tse.common.world.dimension;

import java.util.List;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.WorldGenBush;

public class ChunkProviderMystic implements IChunkGenerator{

	protected static final IBlockState AIR = Blocks.AIR.getDefaultState();
	protected static final IBlockState STONE = Blocks.STONE.getDefaultState();
	protected static final IBlockState BEDROCK = Blocks.BEDROCK.getDefaultState();
	protected static final IBlockState LAVA = Blocks.LAVA.getDefaultState();
	protected static final IBlockState GRAVEL = Blocks.GRAVEL.getDefaultState();
	private final World world;
	private final Random rand;
	/** Holds the noise used to determine whether slowsand can be generated at a location */
	private double[] slowsandNoise = new double[256];
	private double[] gravelNoise = new double[256];
	private double[] depthBuffer = new double[256];
	private double[] buffer;
	private NoiseGeneratorOctaves lperlinNoise1;
	private NoiseGeneratorOctaves lperlinNoise2;
	private NoiseGeneratorOctaves perlinNoise1;
	/** Determines whether slowsand or gravel can be generated at a location */
	private NoiseGeneratorOctaves slowsandGravelNoiseGen;
	/** Determines whether something other than nettherack can be generated at a location */
	private NoiseGeneratorOctaves netherrackExculsivityNoiseGen;
	public NoiseGeneratorOctaves scaleNoise;
	public NoiseGeneratorOctaves depthNoise;
	private final WorldGenBush brownMushroomFeature = new WorldGenBush(Blocks.BROWN_MUSHROOM);
	private final WorldGenBush redMushroomFeature = new WorldGenBush(Blocks.RED_MUSHROOM);
	double[] noiseData1;
	double[] noiseData2;
	double[] noiseData3;
	double[] noiseData4;
	double[] noiseData5;
	
	public ChunkProviderMystic(World worldIn, long seed)
	{
		world = worldIn;
		rand = new Random(seed);
		lperlinNoise1 = new NoiseGeneratorOctaves(rand, 16);
		lperlinNoise2 = new NoiseGeneratorOctaves(rand, 16);
		perlinNoise1 = new NoiseGeneratorOctaves(rand, 16);
		slowsandGravelNoiseGen = new NoiseGeneratorOctaves(rand, 4);
		netherrackExculsivityNoiseGen = new NoiseGeneratorOctaves(rand, 4);
		scaleNoise = new NoiseGeneratorOctaves(rand, 16);
		depthNoise = new NoiseGeneratorOctaves(rand, 16);
		worldIn.setSeaLevel(63);

		net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextHell ctx =
				new net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextHell(lperlinNoise1, lperlinNoise2, perlinNoise1, slowsandGravelNoiseGen, netherrackExculsivityNoiseGen, scaleNoise, depthNoise);
		ctx = net.minecraftforge.event.terraingen.TerrainGen.getModdedNoiseGenerators(worldIn, rand, ctx);
		lperlinNoise1 = ctx.getLPerlin1();
		lperlinNoise2 = ctx.getLPerlin2();
		perlinNoise1 = ctx.getPerlin();
		slowsandGravelNoiseGen = ctx.getPerlin2();
		netherrackExculsivityNoiseGen = ctx.getPerlin3();
		scaleNoise = ctx.getScale();
		depthNoise = ctx.getDepth();
	}
	
	@Override
	public Chunk generateChunk(int x, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void populate(int x, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean generateStructures(Chunk chunkIn, int x, int z) {
		return false;
	}

	@Override
	public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position,
			boolean findUnexplored) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recreateStructures(Chunk chunkIn, int x, int z) {}

	@Override
	public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
		// TODO Auto-generated method stub
		return false;
	}

}
