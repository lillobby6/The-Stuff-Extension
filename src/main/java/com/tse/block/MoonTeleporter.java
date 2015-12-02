package com.tse.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class MoonTeleporter extends Block{

	protected MoonTeleporter(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("moon_teleporter");
		this.setHardness(10.0F);
		this.setResistance(100.0F);
	}
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        if (entityIn.ridingEntity == null && entityIn.riddenByEntity == null && !worldIn.isRemote)
        {
            entityIn.travelToDimension(1);
        }
    }

}
