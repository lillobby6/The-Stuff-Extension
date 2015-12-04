package com.tse.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.tse.block.BlockManager;

public class TSECreativeTabs {
	
	public static final CreativeTabs tabStorage = new CreativeTabs("tabStorage") {
	    @Override public Item getTabIconItem() {
	        return Item.getItemFromBlock(BlockManager.storeBox);
	    }
	};
}
