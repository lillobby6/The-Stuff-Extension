package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class TSEPickaxe extends ItemPickaxe{

	public TSEPickaxe(ToolMaterial material, String unlocalizedName, CreativeTabs tab, int harvestLevel) {
		super(material);
		setCreativeTab(tab);
		setHarvestLevel("pickaxe", harvestLevel);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
		ItemManager.registerItem(this);
	}
}
