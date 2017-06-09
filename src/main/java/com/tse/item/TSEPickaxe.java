package com.tse.item;

import com.tse.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class TSEPickaxe extends ItemPickaxe{

	public TSEPickaxe(ToolMaterial material, CreativeTabs tab, int harvestLevel, String unlocalizedName) {
		super(material);
		setCreativeTab(tab);
		setHarvestLevel("pickaxe", harvestLevel);
		setUnlocalizedName(unlocalizedName);
	}
	public TSEPickaxe(ToolMaterial material, String unlocalizedName)
	{
		super(material);
		setCreativeTab(TSECreativeTabs.tabTools);
		setHarvestLevel("pickaxe", 2);
		setUnlocalizedName(unlocalizedName);
	}
	
	

}
