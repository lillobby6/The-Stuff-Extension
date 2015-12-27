package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.tse.creativetabs.TSECreativeTabs;

public class TSEAxe extends ItemAxe{

	public TSEAxe(ToolMaterial material, CreativeTabs tab, int level, String unlocalizedName) {
		super(material);
		this.setCreativeTab(tab);
		this.setHarvestLevel("axe", level);
		this.setUnlocalizedName(unlocalizedName);
	}
	public TSEAxe(ToolMaterial material, String unlocalizedName)
	{
		super(material);
		this.setCreativeTab(TSECreativeTabs.tabTools);
		this.setHarvestLevel("axe", 2);
		this.setUnlocalizedName(unlocalizedName);
	}

}
