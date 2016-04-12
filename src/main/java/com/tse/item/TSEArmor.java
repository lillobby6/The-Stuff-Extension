package com.tse.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import com.tse.creativetabs.TSECreativeTabs;

public class TSEArmor extends ItemArmor{

	public TSEArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType)
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabWeapons);
	}

}
