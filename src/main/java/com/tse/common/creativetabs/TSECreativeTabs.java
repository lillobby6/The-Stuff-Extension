package com.tse.common.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.tse.world.block.BlockManager;
import com.tse.world.item.ItemManager;

public class TSECreativeTabs {

	public static final CreativeTabs tabStorage = new CreativeTabs("tabStorage") {
	    @Override public ItemStack getTabIconItem() {
	        return new ItemStack(Item.getItemFromBlock(BlockManager.superStoreBox));
	    }
	};
	
	public static final CreativeTabs tabTools = new CreativeTabs("tabTools") {
	    @Override public ItemStack getTabIconItem() {
	        return new ItemStack(ItemManager.copperPickaxe);
	    }
	};
	 
	public static final CreativeTabs tabWeapons = new CreativeTabs("tabWeapons")
	{
		@Override public ItemStack getTabIconItem()
		{
			return new ItemStack(ItemManager.copperSword);
		}
	};
	
	public static final CreativeTabs tabMaterials = new CreativeTabs("tabMaterials")
	{
		@Override public ItemStack getTabIconItem()
		{
			return new ItemStack(ItemManager.copperIngot);
		}
	};
	
	public static final CreativeTabs tabBlocks = new CreativeTabs("tabBlocks")
	{
		@Override public ItemStack getTabIconItem()
		{
			return new ItemStack(Item.getItemFromBlock(BlockManager.copperBlock));
		}
	};
	
	public static final CreativeTabs tabOres = new CreativeTabs("tabOres")
	{
		@Override public ItemStack getTabIconItem()
		{
			return new ItemStack(Item.getItemFromBlock(BlockManager.copperOre));
		}
	};
	
	/**public static final CreativeTabs tabMachines = new CreativeTabs("tabMachines")
	{
		@Override public ItemStack getTabIconItem()
		{
			return new ItemStack(Item.getItemFromBlock(BlockManager.brightflameBlock));
		}
	};*/
}
