package com.tse.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.item.ItemManager;

public class BlockManager {
	
	public static Block exaltedDiamondOre;
	public static Block bloodDiamondOre;
	public static Block terraDiamondOre;
	public static Block moonStone;
	public static Block moonSand;
	public static Block moonTeleporter;	
	public static Block copperBlock;
	public static Block copperOre;
	public static Block storeBox;
	public static Block superStoreBox;
	public static Block mysteriousBox;
	public static Block steelBlock;
	
	public static void createBlocks()
	{
		GameRegistry.registerBlock(exaltedDiamondOre = new TSEBlockOre("exalted_diamond_ore", Material.rock, ItemManager.exaltedDiamond, 1, 3), "exalted_diamond_ore");
		GameRegistry.registerBlock(bloodDiamondOre = new TSEBlockOre("blood_diamond_ore", Material.rock, ItemManager.bloodDiamond, 1, 3), "blood_diamond_ore");
		GameRegistry.registerBlock(terraDiamondOre = new TSEBlockOre("terra_diamond_ore", Material.rock, ItemManager.terraDiamond, 1, 3), "terra_diamond_ore");
		GameRegistry.registerBlock(moonStone = new TSEBlock("moon_stone"), "moon_stone");
		GameRegistry.registerBlock(moonSand = new TSEBlock("moon_sand"), "moon_sand");
		GameRegistry.registerBlock(moonTeleporter = new MoonTeleporter(), "moon_teleporter");
		GameRegistry.registerBlock(copperBlock = new TSEBlock("copper_block"), "copper_block");
		GameRegistry.registerBlock(copperOre = new TSEBlockOre("copper_ore", Material.rock, 1, "pickaxe", 5F, 10F, TSECreativeTabs.tabOres, Item.getItemFromBlock(BlockManager.copperOre), 0, 1, 1), "copper_ore");
		GameRegistry.registerBlock(storeBox = new StoreBox("store_box"), "store_box");
		GameRegistry.registerBlock(superStoreBox = new SuperStoreBox("super_store_box"), "super_store_box");
		GameRegistry.registerBlock(mysteriousBox = new MysteriousBox("mysterious_box"), "mysterious_box");
		GameRegistry.registerBlock(steelBlock = new TSEBlock("steel_block"), "steel_block");
		}
	
}
