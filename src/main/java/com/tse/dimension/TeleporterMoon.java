package com.tse.dimension;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;
import com.tse.block.BlockManager;

import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class TeleporterMoon extends Teleporter{

	private final WorldServer worldServerInstance;
	private final Random random;
	private final LongHashMap destinationCoordinateCache = new LongHashMap();
	private final List destinationCoordinateKeys = Lists.newArrayList();
	private static final String __OBFID = "CL_00000153";
	
	public TeleporterMoon(WorldServer worldIn) {
		super(worldIn);
		this.worldServerInstance = worldIn;
		this.random = new Random(worldIn.getSeed());
	}
	


    private boolean func_180265_a(BlockPos p_180265_1_)
    {
        return !this.worldServerInstance.isAirBlock(p_180265_1_) || !this.worldServerInstance.isAirBlock(p_180265_1_.up());
    }


    /**
     * called periodically to remove out-of-date portal locations from the cache list. Argument par1 is a
     * WorldServer.getTotalWorldTime() value.
     */
    public void removeStalePortalLocations(long p_85189_1_)
    {
        if (p_85189_1_ % 100L == 0L)
        {
            Iterator iterator = this.destinationCoordinateKeys.iterator();
            long j = p_85189_1_ - 600L;

            while (iterator.hasNext())
            {
                Long olong = (Long)iterator.next();
                Teleporter.PortalPosition portalposition = (Teleporter.PortalPosition)this.destinationCoordinateCache.getValueByKey(olong.longValue());

                if (portalposition == null || portalposition.lastUpdateTime < j)
                {
                    iterator.remove();
                    this.destinationCoordinateCache.remove(olong.longValue());
                }
            }
        }
    }

    public class PortalPosition extends BlockPos
    {
        /** The worldtime at which this PortalPosition was last verified */
        public long lastUpdateTime;
        private static final String __OBFID = "CL_00000154";

        public PortalPosition(BlockPos pos, long p_i45747_3_)
        {
            super(pos.getX(), pos.getY(), pos.getZ());
            this.lastUpdateTime = p_i45747_3_;
        }
    }
}


