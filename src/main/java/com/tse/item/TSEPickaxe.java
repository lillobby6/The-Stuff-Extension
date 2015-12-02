package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class TSEPickaxe extends ItemPickaxe{

	public TSEPickaxe(ToolMaterial material, CreativeTabs tab, int harvestLevel, String unlocalizedName) {
		super(material);
		this.setCreativeTab(tab);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setUnlocalizedName(unlocalizedName);
	}
	public TSEPickaxe(ToolMaterial material, String unlocalizedName)
	{
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setHarvestLevel("pickaxe", 1);
		this.setUnlocalizedName(unlocalizedName);
	}
	
	

}
