package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class TSEHoe extends ItemHoe{

	public TSEHoe(ToolMaterial material, String unlocalizedName, CreativeTabs tab, int harvestLevel) 
	{
		super(material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("hoe", harvestLevel);
		this.setRegistryName(unlocalizedName);
		ItemManager.registerItem(this);
	}

}
