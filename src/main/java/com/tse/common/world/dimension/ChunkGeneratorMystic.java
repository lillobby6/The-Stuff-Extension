package com.tse.common.world.dimension;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkGeneratorMystic extends ChunkGeneratorTSEBase {

	private final NoiseGeneratorOctaves noiseGen4;

	public ChunkGeneratorMystic(World world, long seed, boolean enableFeatures) {
		super(world, seed, enableFeatures, true);
		this.noiseGen4 = new NoiseGeneratorOctaves(rand, 4);
	}

	@Override
	public Chunk generateChunk(int x, int z) {
		rand.setSeed(getSeed(x, z));

		ChunkBitArray data = new ChunkBitArray();
		setBlocksInChunk(x, z, data);
		squishTerrain(data);

		ChunkPrimer primer = new DirectChunkPrimer();
		initPrimer(primer, data);

		// now we reload the biome array so that it's scaled 1:1 with blocks on the ground
		this.biomesForGeneration = world.getBiomeProvider().getBiomes(biomesForGeneration, x * 16, z * 16, 16, 16);

		return makeChunk(x, z, primer);
	}

	@Override
	protected void initPrimer(ChunkPrimer primer, ChunkBitArray data) {

		IBlockState water = Blocks.WATER.getDefaultState();
		IBlockState stone = Blocks.STONE.getDefaultState();

		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = 0; y < 256; y++) {
					boolean solid = data.get(getIndex(x, y, z));
					if (y < MysticWorld.SEALEVEL && !solid) {
						primer.setBlockState(x, y, z, water);
					} else if (solid) {
						primer.setBlockState(x, y, z, stone);
					}
				}
			}
		}
	}

	@Override
	public void populate(int x, int z) {

		BlockFalling.fallInstantly = true;

		int i = x * 16;
		int j = z * 16;
		BlockPos blockpos = new BlockPos(i, 0, j);
		Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));
		this.rand.setSeed(this.world.getSeed());
		long k = this.rand.nextLong() / 2L * 2L + 1L;
		long l = this.rand.nextLong() / 2L * 2L + 1L;
		this.rand.setSeed((long)x * k + (long)z * l ^ this.world.getSeed());
		boolean flag = false;
		ChunkPos chunkpos = new ChunkPos(x, z);

		ForgeEventFactory.onChunkPopulate(true, this, this.world, this.rand, x, z, flag);

		if (TerrainGen.populate(this, this.world, this.rand, x, z, flag, PopulateChunkEvent.Populate.EventType.DUNGEON)) {
			for (int k1 = 0; k1 < 8; k1++) {
				int k2 = blockpos.getX() + rand.nextInt(16) + 8;
				int k3 = rand.nextInt(MysticWorld.CHUNKHEIGHT);
				int l3 = blockpos.getZ() + rand.nextInt(16) + 8;
				(new WorldGenDungeons()).generate(world, rand, new BlockPos(k2, k3, l3));
			}
		}

		biome.decorate(this.world, this.rand, new BlockPos(i, 0, j));

		if (TerrainGen.populate(this, this.world, this.rand, x, z, flag, PopulateChunkEvent.Populate.EventType.ANIMALS)) {
			WorldEntitySpawner.performWorldGenSpawning(this.world, biome, i + 8, j + 8, 16, 16, this.rand);
		}

		blockpos = blockpos.add(8, 0, 8);

		if (TerrainGen.populate(this, this.world, this.rand, x, z, flag, PopulateChunkEvent.Populate.EventType.ICE)) {
			for (int k2 = 0; k2 < 16; ++k2) {
				for (int j3 = 0; j3 < 16; ++j3) {

					BlockPos blockpos1 = this.world.getPrecipitationHeight(blockpos.add(k2, 0, j3));
					BlockPos blockpos2 = blockpos1.down();

					if (this.world.canBlockFreezeWater(blockpos2)) {
						this.world.setBlockState(blockpos2, Blocks.ICE.getDefaultState(), 16 | 2);
					}

					if (this.world.canSnowAt(blockpos1, true)) {
						this.world.setBlockState(blockpos1, Blocks.SNOW_LAYER.getDefaultState(), 16 | 2);
					}
				}
			}
		}//Forge: End ICE

		ForgeEventFactory.onChunkPopulate(false, this, this.world, this.rand, x, z, flag);

		BlockFalling.fallInstantly = false;
	}
	
}
