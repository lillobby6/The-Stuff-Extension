package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class TSEAxe extends ItemAxe{

	public TSEAxe(ToolMaterial material, String unlocalizedName, CreativeTabs tab, int level, float damage, float speed) {
		super(material, damage, speed);
		this.setCreativeTab(tab);
		this.setHarvestLevel("axe", level);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		ItemManager.registerItem(this);
	}

}
