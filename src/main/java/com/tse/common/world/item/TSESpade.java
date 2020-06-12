package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

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
