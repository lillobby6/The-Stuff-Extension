package com.tse.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.item.Item;

public class TSEItem extends Item
{
	public TSEItem(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabMaterials);
	}
}
