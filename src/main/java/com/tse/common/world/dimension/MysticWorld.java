package com.tse.common.world.dimension;

import java.util.function.Predicate;

import javax.annotation.Nullable;

import com.tse.common.core.TheStuffExtension;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;

public class MysticWorld {
	public static final int SEALEVEL = 60;
	public static final int CHUNKHEIGHT = 256;
	public static final int MAXHEIGHT = 256;
	
	@Nullable
	public static ChunkGeneratorTSEBase getChunkGenerator(World world)
	{
		if (world instanceof WorldServer)
		{
			IChunkGenerator chunkGenerator = ((WorldServer) world).getChunkProvider().chunkGenerator;
			return chunkGenerator instanceof ChunkGeneratorTSEBase ? (ChunkGeneratorTSEBase) chunkGenerator : null;
		}
		return null;
	}
	
	public static boolean isMystic(World world)
	{
		return world.provider instanceof WorldProviderMystic;
	}
	
	public static NBTTagCompound getDimensionData(World world)
	{
		return world.getWorldInfo().getDimensionData(TheStuffExtension.dimensionID);
	}
	
	public static void setDimensionData(World world, NBTTagCompound data)
	{
		world.getWorldInfo().setDimensionData(TheStuffExtension.dimensionID, data);
	}
	
	public static int getGroundLevel(World world, int x, int z) {
		return getGroundLevel(world, x, z, block -> false);
	}

	public static int getGroundLevel(World world, int x, int z, Predicate<Block> extraBlocks) {
		// go from sea level up.  If we get grass, return that, otherwise return the last dirt, stone or gravel we got
		Chunk chunk = world.getChunkFromChunkCoords(x >> 4, z >> 4);
		BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();
		int lastDirt = SEALEVEL;
		for (int y = SEALEVEL; y < CHUNKHEIGHT - 1; y++) {
			Block block = chunk.getBlockState(pos.setPos(x, y, z)).getBlock();
			// grass = return immediately
			if (block == Blocks.GRASS) {
				return y + 1;
			} else if (block == Blocks.DIRT || block == Blocks.STONE || block == Blocks.GRAVEL || extraBlocks.test(block)) {
				lastDirt = y + 1;
			}
		}
		return lastDirt;
	}

}
