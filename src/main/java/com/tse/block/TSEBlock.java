package com.tse.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import com.tse.creativetabs.TSECreativeTabs;

public class TSEBlock extends Block{

	public TSEBlock(String unlocalizedName, Material material, float hardness, float resistance, CreativeTabs tab) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}
	
	public TSEBlock(String unlocalizedName, float hardness, float resistance)
	{
		this(unlocalizedName, Material.rock, hardness, resistance, TSECreativeTabs.tabBlocks);
	}
	
	public TSEBlock(String unlocalizedName)
	{
		this(unlocalizedName, Material.rock, 2.0f, 10.0f, TSECreativeTabs.tabBlocks);
	}
}
