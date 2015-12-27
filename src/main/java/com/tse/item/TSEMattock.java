package com.tse.item;

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.item.types.ItemMattock;

import net.minecraft.creativetab.CreativeTabs;

public class TSEMattock extends ItemMattock{

	protected TSEMattock(ToolMaterial material, int harvestLevel, String unlocalizedName, CreativeTabs tab) {
		super(material);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
	}
	
	protected TSEMattock(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setHarvestLevel("pickaxe", 2);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabTools);
	}
	
	protected TSEMattock(String unlocalizedName) {
		super(ToolMaterial.IRON);
		this.setHarvestLevel("pickaxe", 2);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabTools);
	}

}
