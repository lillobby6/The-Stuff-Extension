package com.tse.item;

import net.minecraft.item.Item;

import com.tse.creativetabs.TSECreativeTabs;

public class TSEItem extends Item
{
	public TSEItem(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabMaterials);
	}
}
