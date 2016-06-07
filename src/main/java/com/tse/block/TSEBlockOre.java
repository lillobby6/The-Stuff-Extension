package com.tse.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import com.tse.creativetabs.TSECreativeTabs;



public class TSEBlockOre extends Block{
	
	private int meta;
	
	protected TSEBlockOre(String unlocalizedName, Material mat, int harvestLevel, String toolType, float hardness, float resistance, CreativeTabs tab, int meta) {
        super(mat);
        this.meta = meta;
        this.setHarvestLevel(toolType, harvestLevel);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(tab);
    }
	
	protected TSEBlockOre(String unlocalizedName, Material mat) {
	    this(unlocalizedName, mat, 1, "pickaxe", 10.0F, 15.0F, TSECreativeTabs.tabBlocks, 0);
	}
	
	@Override
	public int damageDropped(IBlockState blockstate)
	{
		return this.meta;
	}
	
	
	
}
