package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TSEItem extends Item
{
	public TSEItem(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		
	}
}
