package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class TSEArmor extends ItemArmor{

	public TSEArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType)
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabWeapons);
	}

}
