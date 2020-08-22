package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class TSESword extends ItemSword{

	public TSESword(ToolMaterial material, String name, CreativeTabs tab) {
		super(material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		ItemManager.registerItem(this);
	}	

}
