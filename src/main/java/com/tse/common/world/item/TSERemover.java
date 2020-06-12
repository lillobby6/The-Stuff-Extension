package com.tse.common.world.item;

import com.tse.common.world.item.tooltype.ItemRemover;

import net.minecraft.creativetab.CreativeTabs;

public class TSERemover extends ItemRemover{

	protected TSERemover(ToolMaterial material, CreativeTabs tab, String unlocalizedName, int harvestLevel, float attackSpeed)
	{
		super(attackSpeed, material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("Remover", harvestLevel);
	}

}
