package com.tse.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.tse.block.BlockManager;
import com.tse.item.ItemManager;

public class TSECreativeTabs {

	public static final CreativeTabs tabStorage = new CreativeTabs("tabStorage") {
	    @Override public Item getTabIconItem() {
	        return Item.getItemFromBlock(BlockManager.superStoreBox);
	    }
	};
	
	public static final CreativeTabs tabTools = new CreativeTabs("tabTools") {
	    @Override public Item getTabIconItem() {
	        return ItemManager.copperPickaxe;
	    }
	};
	 
	public static final CreativeTabs tabWeapons = new CreativeTabs("tabWeapons")
	{
		@Override public Item getTabIconItem()
		{
			return ItemManager.copperSword;
		}
	};
	
	public static final CreativeTabs tabMaterials = new CreativeTabs("tabMaterials")
	{
		@Override public Item getTabIconItem()
		{
			return ItemManager.copperIngot;
		}
	};
	
	public static final CreativeTabs tabBlocks = new CreativeTabs("tabBlocks")
	{
		@Override public Item getTabIconItem()
		{
			return Item.getItemFromBlock(BlockManager.copperBlock);
		}
	};
	
	public static final CreativeTabs tabOres = new CreativeTabs("tabOres")
	{
		@Override public Item getTabIconItem()
		{
			return Item.getItemFromBlock(BlockManager.copperOre);
		}
	};
}
