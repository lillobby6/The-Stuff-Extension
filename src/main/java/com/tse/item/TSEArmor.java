package com.tse.item;

import com.tse.creativetabs.TSECreativeTabs;

import net.minecraft.item.ItemArmor;

public class TSEArmor extends ItemArmor{

	public TSEArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType)
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabWeapons);
	}

}
