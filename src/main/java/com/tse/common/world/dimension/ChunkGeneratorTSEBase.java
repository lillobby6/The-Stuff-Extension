package com.tse.common.world.dimension;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.storage.ExtendedBlockStorage;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraftforge.event.ForgeEventFactory;

public abstract class ChunkGeneratorTSEBase implements IChunkGenerator{
	protected final Random rand;

	private final NoiseGeneratorOctaves minLimitPerlinNoise;
	private final NoiseGeneratorOctaves maxLimitPerlinNoise;
	private final NoiseGeneratorOctaves mainPerlinNoise;
	private final NoiseGeneratorPerlin surfaceNoise;
	private final NoiseGeneratorOctaves depthNoise;

	protected final World world;
	protected final WorldType terrainType;

	private double[] mainNoiseRegion;
	private double[] minLimitRegion;
	private double[] maxLimitRegion;
	private double[] depthRegion;

	protected double[] depthBuffer = new double[256];
	protected Biome[] biomesForGeneration;

	private final double[] heightMap;
	private final float[] biomeWeights;

	private final boolean shouldGenerateBedrock;

	protected static long getSeed(int x, int z) {
		return x * 0x4f9939f508L + z * 0x1ef1565bd5L;
	}

	// same as ChunkPrimer
	protected static int getIndex(int x, int y, int z) {
		return x << 12 | z << 8 | y;
	}

	public ChunkGeneratorTSEBase(World world, long seed, boolean enableFeatures, boolean shouldGenerateBedrock) {

		this.world = world;
		this.terrainType = world.getWorldInfo().getTerrainType();
		this.rand = new Random(seed);
		this.shouldGenerateBedrock = shouldGenerateBedrock;

		this.minLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
		this.maxLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
		this.mainPerlinNoise = new NoiseGeneratorOctaves(this.rand, 8);
		this.surfaceNoise = new NoiseGeneratorPerlin(this.rand, 4);
		this.depthNoise = new NoiseGeneratorOctaves(rand, 16);

		this.heightMap = new double[825];
		this.biomeWeights = new float[25];

		for (int j = -2; j <= 2; ++j) {
			for (int k = -2; k <= 2; ++k) {
				float f = 10.0F / MathHelper.sqrt((float) (j * j + k * k) + 0.2F);
				this.biomeWeights[j + 2 + (k + 2) * 5] = f;
			}
		}
	}

	protected final Chunk makeChunk(int x, int z, ChunkPrimer primer) {

		Chunk chunk = new Chunk(world, x, z);

		fillChunk(chunk, primer);

		// load in biomes, to prevent striping?!
		byte[] chunkBiomes = chunk.getBiomeArray();
		for (int i = 0; i < chunkBiomes.length; ++i) {
			chunkBiomes[i] = (byte) Biome.getIdForBiome(this.biomesForGeneration[i]);
		}

		chunk.generateSkylightMap();

		return chunk;
	}

	// [VanillaCopy] Extended Chunk constructor, material check replaced with block check
	private void fillChunk(Chunk chunk, ChunkPrimer primer) {

		int i = 256;
		boolean flag = world.provider.hasSkyLight();
		ExtendedBlockStorage[] storageArrays = chunk.getBlockStorageArray();

		for (int j = 0; j < 16; ++j) {
			for (int k = 0; k < 16; ++k) {
				for (int l = 0; l < 256; ++l) {

					IBlockState iblockstate = primer.getBlockState(j, l, k);

					if (iblockstate.getBlock() != Blocks.AIR) {

						int i1 = l >> 4;

						if (storageArrays[i1] == Chunk.NULL_BLOCK_STORAGE) {
							storageArrays[i1] = new ExtendedBlockStorage(i1 << 4, flag);
						}

						storageArrays[i1].set(j, l & 15, k, iblockstate);
					}
				}
			}
		}
	}

	// note: ChunkPrimer changed to a BitSet marking 'solid' blocks
	// this allows for some post-processing before populating the primer
	protected final void setBlocksInChunk(int x, int z, ChunkBitArray data) {

		byte seaLevel = 63;
		this.biomesForGeneration = this.world.getBiomeProvider().getBiomesForGeneration(this.biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
		this.generateHeightmap(x * 4, 0, z * 4);

		for (int k = 0; k < 4; ++k) {
			int l = k * 5;
			int i1 = (k + 1) * 5;

			for (int j1 = 0; j1 < 4; ++j1) {
				int k1 = (l + j1) * 33;
				int l1 = (l + j1 + 1) * 33;
				int i2 = (i1 + j1) * 33;
				int j2 = (i1 + j1 + 1) * 33;

				for (int k2 = 0; k2 < 32; ++k2) {
					double d0 = 0.125D;
					double d1 = this.heightMap[k1 + k2];
					double d2 = this.heightMap[l1 + k2];
					double d3 = this.heightMap[i2 + k2];
					double d4 = this.heightMap[j2 + k2];
					double d5 = (this.heightMap[k1 + k2 + 1] - d1) * d0;
					double d6 = (this.heightMap[l1 + k2 + 1] - d2) * d0;
					double d7 = (this.heightMap[i2 + k2 + 1] - d3) * d0;
					double d8 = (this.heightMap[j2 + k2 + 1] - d4) * d0;

					for (int l2 = 0; l2 < 8; ++l2) {
						double d9 = 0.25D;
						double d10 = d1;
						double d11 = d2;
						double d12 = (d3 - d1) * d9;
						double d13 = (d4 - d2) * d9;

						for (int i3 = 0; i3 < 4; ++i3) {
							double d14 = 0.25D;
							double d16 = (d11 - d10) * d14;
							double d15 = d10 - d16;

							for (int k3 = 0; k3 < 4; ++k3) {
								if ((d15 += d16) > 0.0D) {
									// stone here
									data.set(getIndex(k * 4 + i3, k2 * 8 + l2, j1 * 4 + k3));
								} /* else if (k2 * 8 + l2 < seaLevel) */ {
									// water below sea level left until later
								}
							}

							d10 += d12;
							d11 += d13;
						}

						d1 += d5;
						d2 += d6;
						d3 += d7;
						d4 += d8;
					}
				}
			}
		}
	}

	private void generateHeightmap(int x, int zero, int z) {

		this.depthRegion = this.depthNoise.generateNoiseOctaves(this.depthRegion, x, z, 5, 5, 200.0D, 200.0D, 0.5D);
		this.mainNoiseRegion = this.mainPerlinNoise.generateNoiseOctaves(this.mainNoiseRegion, x, zero, z, 5, 33, 5, 8.555150000000001D, 4.277575000000001D, 8.555150000000001D);
		this.minLimitRegion = this.minLimitPerlinNoise.generateNoiseOctaves(this.minLimitRegion, x, zero, z, 5, 33, 5, 684.412D, 684.412D, 684.412D);
		this.maxLimitRegion = this.maxLimitPerlinNoise.generateNoiseOctaves(this.maxLimitRegion, x, zero, z, 5, 33, 5, 684.412D, 684.412D, 684.412D);
		int terrainIndex = 0;
		int noiseIndex = 0;

		for (int ax = 0; ax < 5; ++ax) {
			for (int az = 0; az < 5; ++az) {
				float totalVariation = 0.0F;
				float totalHeight = 0.0F;
				float totalFactor = 0.0F;
				byte two = 2;
				Biome biome = this.biomesForGeneration[ax + 2 + (az + 2) * 10];

				for (int ox = -two; ox <= two; ++ox) {
					for (int oz = -two; oz <= two; ++oz) {
						Biome biome1 = this.biomesForGeneration[ax + ox + 2 + (az + oz + 2) * 10];
						float rootHeight = biome1.getBaseHeight();
						float heightVariation = biome1.getHeightVariation();

						if (this.terrainType == WorldType.AMPLIFIED && rootHeight > 0.0F) {
							rootHeight = 1.0F + rootHeight * 2.0F;
							heightVariation = 1.0F + heightVariation * 4.0F;
						}

						float heightFactor = this.biomeWeights[ox + 2 + (oz + 2) * 5] / (rootHeight + 2.0F);

						if (biome1.getBaseHeight() > biome.getBaseHeight()) {
							heightFactor /= 2.0F;
						}

						totalVariation += heightVariation * heightFactor;
						totalHeight += rootHeight * heightFactor;
						totalFactor += heightFactor;
					}
				}

				totalVariation /= totalFactor;
				totalHeight /= totalFactor;
				totalVariation = totalVariation * 0.9F + 0.1F;
				totalHeight = (totalHeight * 4.0F - 1.0F) / 8.0F;
				double terrainNoise = this.depthRegion[noiseIndex] / 8000.0D;

				if (terrainNoise < 0.0D) {
					terrainNoise = -terrainNoise * 0.3D;
				}

				terrainNoise = terrainNoise * 3.0D - 2.0D;

				if (terrainNoise < 0.0D) {
					terrainNoise /= 2.0D;

					if (terrainNoise < -1.0D) {
						terrainNoise = -1.0D;
					}

					terrainNoise /= 1.4D;
					terrainNoise /= 2.0D;
				} else {
					if (terrainNoise > 1.0D) {
						terrainNoise = 1.0D;
					}

					terrainNoise /= 8.0D;
				}

				++noiseIndex;
				double heightCalc = (double) totalHeight;
				double variationCalc = (double) totalVariation;
				heightCalc += terrainNoise * 0.2D;
				heightCalc = heightCalc * 8.5D / 8.0D;
				double d5 = 8.5D + heightCalc * 4.0D;

				for (int ay = 0; ay < 33; ++ay) {
					double d6 = ((double) ay - d5) * 12.0D * 128.0D / 256.0D / variationCalc;

					if (d6 < 0.0D) {
						d6 *= 4.0D;
					}

					double d7 = this.minLimitRegion[terrainIndex] / 512.0D;
					double d8 = this.maxLimitRegion[terrainIndex] / 512.0D;
					double d9 = (this.mainNoiseRegion[terrainIndex] / 10.0D + 1.0D) / 2.0D;
					double terrainCalc = MathHelper.clampedLerp(d7, d8, d9) - d6;

					if (ay > 29) {
						double d11 = (double) ((float) (ay - 29) / 3.0F);
						terrainCalc = terrainCalc * (1.0D - d11) + -10.0D * d11;
					}

					this.heightMap[terrainIndex] = terrainCalc;
					++terrainIndex;
				}
			}
		}
	}

	/**
	 * Crush the terrain to half the height
	 */
	protected final void squishTerrain(ChunkBitArray data) {
		int squishHeight = MysticWorld.MAXHEIGHT / 2;
		for (int x = 0; x < 16; x++) {
			for (int z = 0; z < 16; z++) {
				for (int y = 0; y < squishHeight; y++) {
					data.set(getIndex(x, y, z), data.get(getIndex(x, y * 2 + 1, z)));
				}
				for (int y = squishHeight; y < MysticWorld.CHUNKHEIGHT; y++) {
					data.clear(getIndex(x, y, z));
				}
			}
		}
	}

	protected abstract void initPrimer(ChunkPrimer primer, ChunkBitArray data);

	// [VanillaCopy] Exact, ChunkGeneratorOverworld.replaceBiomeBlocks
	public void replaceBiomeBlocks(int x, int z, ChunkPrimer primer, Biome[] biomesIn) {

		if (!ForgeEventFactory.onReplaceBiomeBlocks(this, x, z, primer, this.world)) return;
		double d0 = 0.03125D;
		this.depthBuffer = this.surfaceNoise.getRegion(this.depthBuffer, (double)(x * 16), (double)(z * 16), 16, 16, 0.0625D, 0.0625D, 1.0D);

		for (int i = 0; i < 16; ++i) {
			for (int j = 0; j < 16; ++j) {
				Biome biome = biomesIn[j + i * 16];
				biome.genTerrainBlocks(this.world, this.rand, primer, x * 16 + i, z * 16 + j, this.depthBuffer[j + i * 16]);
			}
		}
	}

	public final boolean shouldGenerateBedrock() {
		return shouldGenerateBedrock;
	}

	@Override
	public boolean generateStructures(Chunk chunk, int x, int z) {
		return false;
	}

	/**
	 * Returns a list of creatures of the specified type that can spawn at the
	 * given location.
	 * <p>
	 * Twilight Forest variant! First check features, then only if we're not in
	 * a feature, check the biome.
	 */
	@Override
	public List<SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {

		Biome biome = world.getBiome(pos);

		return biome.getSpawnableList(creatureType);
	}

	@Nullable
	@Override
	public BlockPos getNearestStructurePos(World world, String structureName, BlockPos position, boolean findUnexplored) {
		return null;
	}

	@Override
	public void recreateStructures(Chunk chunk, int x, int z) {	}

	@Override
	public boolean isInsideStructure(World world, String structureName, BlockPos pos) {
		return false;
	}
}
