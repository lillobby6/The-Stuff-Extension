package com.tse.block;

import com.tse.creativetabs.TSECreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockManager {
	
	public static Block exaltedDiamondOre;
	public static Block bloodDiamondOre;
	public static Block terraDiamondOre;
	public static Block copperOre;
	
	public static Block moonStone;
	public static Block moonSand;
	public static Block moonTeleporter;	
	
	public static Block copperBlock;
	public static Block steelBlock;
	public static Block terraDiamondBlock;
	public static Block exaltedDiamondBlock;
	
	public static Block storeBox;
	public static Block superStoreBox;
	public static Block mysteriousBox;
	public static Block diamondStoreBox;
	

	
	private static Block registerBlock(String registerName, ItemBlock itemBlock, Block block) {
        block.setRegistryName(registerName);
        block.setUnlocalizedName(registerName);

        GameRegistry.register(block);

        itemBlock.setRegistryName(registerName);
        itemBlock.setUnlocalizedName(registerName);
        GameRegistry.register(itemBlock);

        return block;
    }
	
	public static Block registerBlockNormal(String registerName, float hardness,  float resistance) {
		final Block block = new TSEBlock(registerName, hardness, resistance);
        final ItemBlock itemBlock = new ItemBlock(block);
        block.setCreativeTab(TSECreativeTabs.tabBlocks);
        return registerBlock(registerName, itemBlock, block);
    }
	
	private static Block registerOre(String registerName, Material mat, int harvestLevel, String toolType, float hardness, float resistance, CreativeTabs tab) {
        final Block ore = new TSEBlockOre(registerName, mat, harvestLevel, toolType, hardness, resistance, tab, 1);
        final ItemBlock itemBlock = new ItemBlock(ore);

        return registerBlock(registerName, itemBlock, ore);
    }
	
	private static Block registerStoreBox(String registryName)
	{
		final Block block = new StoreBox(registryName);
		final ItemBlock itemBlock = new ItemBlock(block);
		
		return registerBlock(registryName, itemBlock, block);
	}
	
	private static Block registerSSBox(String registryName)
	{
		final Block block = new SuperStoreBox(registryName);
		final ItemBlock itemBlock = new ItemBlock(block);
		
		return registerBlock(registryName, itemBlock, block);
	}
	
	private static Block registerMBox(String registryName)
	{
		final Block block = new MysteriousBox(registryName);
		final ItemBlock itemBlock = new ItemBlock(block);
		
		return registerBlock(registryName, itemBlock, block);
	}
	
	private static Block registerDSBox(String registryName)
	{
		final Block block = new DiamondStoreBox(registryName);
		final ItemBlock itemBlock = new ItemBlock(block);
		
		return registerBlock(registryName, itemBlock, block);
	}
	
	public static void createBlocks()
	{
		exaltedDiamondOre = registerOre("exalted_diamond_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F, TSECreativeTabs.tabOres);
		bloodDiamondOre = registerOre("blood_diamond_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F, TSECreativeTabs.tabOres);
		terraDiamondOre = registerOre("terra_diamond_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F, TSECreativeTabs.tabOres);
		copperOre = registerOre("copper_ore", Material.ROCK, 1, "pickaxe", 5.0F, 5.0F, TSECreativeTabs.tabOres);
			
		moonStone = registerBlockNormal("moon_stone", 5.0F, 5.0F);
		moonSand = registerBlockNormal("moon_sand", 2.0F, 2.0F);
		moonTeleporter = registerBlockNormal("moon_teleporter", 5.0F, 5.0F);
		
		copperBlock = registerBlockNormal("copper_block", 5.0F, 5.0F);
		steelBlock = registerBlockNormal("steel_block", 5.0F, 5.0F);
		terraDiamondBlock = registerBlockNormal("terra_diamond_block", 5.0F, 5.0F);
		exaltedDiamondBlock = registerBlockNormal("exalted_diamond_block", 5.0F, 5.0F);
		
		storeBox = registerStoreBox("store_box");
		mysteriousBox = registerMBox("mysterious_box");
		superStoreBox = registerSSBox("super_store_box");
		//diamondStoreBox = registerDSBox("diamond_store_box");
		
		/*GameRegistry.registerBlock(exaltedDiamondOre = new TSEBlockOre("exalted_diamond_ore", Material.ROCK, ItemManager.exaltedDiamond, 1, 3), "exalted_diamond_ore");
		GameRegistry.registerBlock(bloodDiamondOre = new TSEBlockOre("blood_diamond_ore", Material.ROCK, ItemManager.bloodDiamond, 1, 3), "blood_diamond_ore");
		GameRegistry.registerBlock(terraDiamondOre = new TSEBlockOre("terra_diamond_ore", Material.ROCK, ItemManager.terraDiamond, 1, 3), "terra_diamond_ore");
		GameRegistry.registerBlock(moonStone = new TSEBlock("moon_stone"), "moon_stone");
		GameRegistry.registerBlock(moonSand = new TSEBlock("moon_sand"), "moon_sand");
		GameRegistry.registerBlock(moonTeleporter = new MoonTeleporter(), "moon_teleporter");
		GameRegistry.registerBlock(copperBlock = new TSEBlock("copper_block"), "copper_block");
		//GameRegistry.registerBlock(copperOre = new TSEBlockOre("copper_ore", Material.ROCK, 1, "pickaxe", 5F, 10F, TSECreativeTabs.tabOres, Item.getItemFromBlock(BlockManager.copperOre), 0, 1, 1), "copper_ore");
		GameRegistry.registerBlock(storeBox = new StoreBox("store_box"), "store_box");
		GameRegistry.registerBlock(superStoreBox = new SuperStoreBox("super_store_box"), "super_store_box");
		GameRegistry.registerBlock(mysteriousBox = new MysteriousBox("mysterious_box"), "mysterious_box");
		GameRegistry.registerBlock(steelBlock = new TSEBlock("steel_block"), "steel_block");*/
	}
	
}
