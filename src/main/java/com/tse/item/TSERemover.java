package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;

import com.tse.item.types.ItemRemover;

public class TSERemover extends ItemRemover{

	protected TSERemover(ToolMaterial material, CreativeTabs tab, String unlocalizedName, int harvestLevel, float attackSpeed)
	{
		super(attackSpeed, material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("Remover", harvestLevel);
	}

}
