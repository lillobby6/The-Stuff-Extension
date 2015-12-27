package com.tse.item;

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.item.types.ItemRemover;

public class MysteriousRemover extends ItemRemover{

	protected MysteriousRemover() {
		super(ToolMaterial.EMERALD);
		this.setMaxDamage(-1);
		this.setCreativeTab(TSECreativeTabs.tabTools);
		this.setUnlocalizedName("mysterious_remover");
		this.setHarvestLevel("Remover", 1);
		
	}

}
