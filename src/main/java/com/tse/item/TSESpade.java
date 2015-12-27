package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.tse.creativetabs.TSECreativeTabs;

public class TSESpade extends ItemSpade{

	public TSESpade(ToolMaterial material, int harvestLevel, CreativeTabs tab, String unlocalizedName) {
		super(material);
		this.setCreativeTab(tab);
		this.setHarvestLevel("shovel", harvestLevel);
		this.setUnlocalizedName(unlocalizedName);
	}
	
	public TSESpade(ToolMaterial material, CreativeTabs tab, String unlocalizedName)
	{
		super(material);
		this.setCreativeTab(tab);
		this.setHarvestLevel("shovel", 1);
		this.setUnlocalizedName(unlocalizedName);
	}
	
	public TSESpade(ToolMaterial material, String unlocalizedName)
	{
		super(material);
		this.setCreativeTab(TSECreativeTabs.tabTools);
		this.setHarvestLevel("shovel", 1);
		this.setUnlocalizedName(unlocalizedName);
	}

}
