package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class TSEHoe extends ItemHoe{

	public TSEHoe(ToolMaterial material, CreativeTabs tab, int harvestLevel, String unlocalizedName) 
	{
		super(material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("hoe", harvestLevel);
	}
	
	public TSEHoe(ToolMaterial material, CreativeTabs tab, String unlocalizedName) 
	{
		super(material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("hoe", 2);
	}
	
	public TSEHoe(ToolMaterial material, String unlocalizedName) 
	{
		super(material);
		this.setCreativeTab(TSECreativeTabs.tabTools);
		this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("hoe", 2);
	}

}
