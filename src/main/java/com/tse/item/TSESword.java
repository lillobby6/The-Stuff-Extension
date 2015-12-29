package com.tse.item;

import com.tse.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class TSESword extends ItemSword{

	public TSESword(ToolMaterial material, CreativeTabs tab, String name) {
		super(material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(name);
	}
	
	public TSESword(ToolMaterial material, String name)
	{
		super(material);
		this.setCreativeTab(TSECreativeTabs.tabWeapons);
		this.setUnlocalizedName(name);
	}
	
	

}
