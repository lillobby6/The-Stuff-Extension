package com.tse.common.world.block;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;

public class TSEStairs extends BlockStairs
{
	protected TSEStairs(IBlockState modelState, String name) {
		super(modelState);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(HALF, BlockStairs.EnumHalf.BOTTOM).withProperty(SHAPE, BlockStairs.EnumShape.STRAIGHT));
        this.setHardness(10.0F);
        this.setResistance(3.0F);
        this.setLightOpacity(255);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        BlockManager.registerBlock(this);
	}
    
}