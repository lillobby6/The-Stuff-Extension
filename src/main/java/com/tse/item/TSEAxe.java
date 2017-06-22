package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.tse.creativetabs.TSECreativeTabs;

public class TSEAxe extends ItemAxe{

	public TSEAxe(ToolMaterial material, float damage, float speed, CreativeTabs tab, int level, String unlocalizedName) {
		super(material, damage, speed);
		this.setCreativeTab(tab);
		this.setHarvestLevel("axe", level);
		this.setUnlocalizedName(unlocalizedName);
	}
	public TSEAxe(ToolMaterial material, String unlocalizedName, float damage, float speed)
	{
		super(material, damage, speed);
		this.setCreativeTab(TSECreativeTabs.tabTools);
		this.setHarvestLevel("axe", 2);
		this.setUnlocalizedName(unlocalizedName);
	}

}
