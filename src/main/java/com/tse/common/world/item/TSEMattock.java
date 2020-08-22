package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.tooltype.ItemMattock;

import net.minecraft.creativetab.CreativeTabs;

public class TSEMattock extends ItemMattock{

	protected TSEMattock(float attackSpeed, ToolMaterial material, String unlocalizedName, CreativeTabs tab, int harvestLevel) {
		super(attackSpeed, material);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(tab);
		ItemManager.registerItem(this);
	}

}
