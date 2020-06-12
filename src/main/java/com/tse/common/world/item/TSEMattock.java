package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.tooltype.ItemMattock;

import net.minecraft.creativetab.CreativeTabs;

public class TSEMattock extends ItemMattock{

	protected TSEMattock(float attackSpeed, ToolMaterial material, int harvestLevel, String unlocalizedName, CreativeTabs tab) {
		super(attackSpeed, material);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
	}
	
	protected TSEMattock(float attackSpeed, int maxDamage, ToolMaterial material, String unlocalizedName) {
		super(attackSpeed, material);
		this.setHarvestLevel("pickaxe", 2);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabTools);
	}
	
	protected TSEMattock(int maxDamage, String unlocalizedName) {
		super(1.0F, ToolMaterial.IRON);
		this.setHarvestLevel("pickaxe", 2);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabTools);
	}

}
