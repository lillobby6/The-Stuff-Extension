package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class TSESpade extends ItemSpade{

	public TSESpade(ToolMaterial material, String unlocalizedName, CreativeTabs tab, int harvestLevel) {
		super(material);
		this.setCreativeTab(tab);
		this.setHarvestLevel("shovel", harvestLevel);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		ItemManager.registerItem(this);
	}

}
