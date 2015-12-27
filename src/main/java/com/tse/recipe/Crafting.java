package com.tse.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tse.block.BlockManager;
import com.tse.item.ItemManager;

public class Crafting {
	public static void initCrafting()
	{
		smelting();
		crafting();
	}
	public static void smelting()
	{
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.exaltedDiamondOre),new ItemStack( ItemManager.exaltedDiamond), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.bloodDiamondOre), new ItemStack(ItemManager.bloodDiamond), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.terraDiamondOre), new ItemStack(ItemManager.terraDiamond), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.copperOre), new ItemStack(ItemManager.copperIngot), 0.1F);
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(ItemManager.steelIngot), 0.1F);
	}
	public static void crafting()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.copperBlock),
    	ItemManager.copperIngot,
    	ItemManager.copperIngot,
    	ItemManager.copperIngot,
    	ItemManager.copperIngot,
    	ItemManager.copperIngot,
    	ItemManager.copperIngot,
    	ItemManager.copperIngot,
    	ItemManager.copperIngot,
    	ItemManager.copperIngot);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.copperIngot, 9),
		BlockManager.copperBlock);
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.storeBox),
		"xyx",
		"xax",
		"xxx",
		'y', BlockManager.copperBlock, 'x', Blocks.planks, 'a', Blocks.chest);
		
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.superStoreBox),
		"xxx",
		"xax",
		"xxx",
		'x', BlockManager.copperBlock, 'a', BlockManager.storeBox);
		
		//start Copper Tools
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperAxe),
		"xx ",
		"xy ",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperAxe),
		" xx",
		" yx",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperHoe),
		"xx ",
		" y ",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperHoe),
		" xx",
		" y ",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperPickaxe),
		"xxx",
		" y ",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperShovel),
		" x ",
		" y ",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperMattock),
		"xxx",
		" yx",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperMattock),
		"xxx",
		"xy ",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperSword),
		" x ",
		" x ",
		" y ",
		'x', ItemManager.copperIngot, 'y', Items.stick);
		//end Copper Tools
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.woodMattock),
		"xxx",
		" yx",
		" y ",
		'x', Item.getItemFromBlock(Blocks.planks), 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.woodMattock),
		"xxx",
		"xy ",
		" y ",
		'x', Item.getItemFromBlock(Blocks.planks), 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.stoneMattock),
		"xxx",
		" yx",
		" y ",
		'x', Item.getItemFromBlock(Blocks.cobblestone), 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.stoneMattock),
		"xxx",
		"xy ",
		" y ",
		'x', Item.getItemFromBlock(Blocks.cobblestone), 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.ironMattock),
		"xxx",
		" yx",
		" y ",
		'x', Items.iron_ingot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.ironMattock),
		"xxx",
		"xy ",
		" y ",
		'x', Items.iron_ingot, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.diamondMattock),
		"xxx",
		" yx",
		" y ",
		'x', Items.diamond, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.diamondMattock),
		"xxx",
		"xy ",
		" y ",
		'x', Items.diamond, 'y', Items.stick);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.goldMattock),
		"xxx",
		" yx",
		" y ",
		'x', Items.gold_ingot, 'y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.goldMattock),
		"xxx",
		"xy ",
		" y ",
		'x', Items.gold_ingot, 'y', Items.stick);
		
		//start copper armor
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperHelmet),
		"xxx",
		"x x",
		'x', ItemManager.copperIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperChestplate),
		"x x",
		"xxx",
		"xxx",
		'x', ItemManager.copperIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperChestplate),
		"xxx",
		"x x",
		"x x",
		'x', ItemManager.copperIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperChestplate),
		"x x",
		"x x",
		'x', ItemManager.copperIngot);
		//end copper armor
	}
}
