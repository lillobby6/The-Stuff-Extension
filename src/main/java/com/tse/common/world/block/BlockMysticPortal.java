package com.tse.common.world.block;

import com.tse.common.core.TheStuffExtension;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMysticPortal extends BlockBreakable{

	public BlockMysticPortal(String name) {
		super(Material.PORTAL, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(-1F);
		BlockManager.registerBlock(this);
	}
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		entityIn.changeDimension(TheStuffExtension.dimensionID);
	}

}
