package com.tse.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tse.block.BlockManager;
import com.tse.item.ItemManager;

public class Crafting {
	public static void initCrafting() {
		smelting();
		craftingShaped();
		craftingShapeless();
	}

	public static void smelting() {
		GameRegistry.addSmelting(
				Item.getItemFromBlock(BlockManager.exaltedDiamondOre),
				new ItemStack(ItemManager.exaltedDiamond), 0.1F);
		
		GameRegistry.addSmelting(
				Item.getItemFromBlock(BlockManager.bloodDiamondOre),
				new ItemStack(ItemManager.bloodDiamond), 0.1F);
		
		GameRegistry.addSmelting(
				Item.getItemFromBlock(BlockManager.terraDiamondOre),
				new ItemStack(ItemManager.terraDiamond), 0.1F);
		
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.copperOre),
				new ItemStack(ItemManager.copperIngot), 0.1F);
		
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(
				ItemManager.steelIngot), 0.1F);
		
		GameRegistry.addSmelting(Item.getItemFromBlock(Blocks.IRON_BLOCK),
				new ItemStack(Item.getItemFromBlock(BlockManager.steelBlock)),
				0.9F);
		
		GameRegistry.addSmelting(Items.GOLD_INGOT, new ItemStack(ItemManager.reforgedGoldIngot), 0.1F);
		
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.whiteStone), new ItemStack(Item.getItemFromBlock(BlockManager.whiteCobblestone)), 0.1F);
	}

	public static void craftingShapeless() {
		GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.copperBlock,
				1), ItemManager.copperIngot, ItemManager.copperIngot,
				ItemManager.copperIngot, ItemManager.copperIngot,
				ItemManager.copperIngot, ItemManager.copperIngot,
				ItemManager.copperIngot, ItemManager.copperIngot,
				ItemManager.copperIngot);

		GameRegistry.addShapelessRecipe(new ItemStack(BlockManager.steelBlock,
				1), ItemManager.steelIngot, ItemManager.steelIngot,
				ItemManager.steelIngot, ItemManager.steelIngot,
				ItemManager.steelIngot, ItemManager.steelIngot,
				ItemManager.steelIngot, ItemManager.steelIngot,
				ItemManager.steelIngot);

		GameRegistry.addShapelessRecipe(new ItemStack(
				BlockManager.terraDiamondBlock, 1), ItemManager.terraDiamond,
				ItemManager.terraDiamond, ItemManager.terraDiamond,
				ItemManager.terraDiamond, ItemManager.terraDiamond,
				ItemManager.terraDiamond, ItemManager.terraDiamond,
				ItemManager.terraDiamond, ItemManager.terraDiamond);

		GameRegistry.addShapelessRecipe(new ItemStack(
				BlockManager.exaltedDiamondBlock, 1),
				ItemManager.exaltedDiamond, ItemManager.exaltedDiamond,
				ItemManager.exaltedDiamond, ItemManager.exaltedDiamond,
				ItemManager.exaltedDiamond, ItemManager.exaltedDiamond,
				ItemManager.exaltedDiamond, ItemManager.exaltedDiamond,
				ItemManager.exaltedDiamond);

		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.copperIngot,
				9), BlockManager.copperBlock);

		GameRegistry.addShapelessRecipe(
				new ItemStack(ItemManager.steelIngot, 9),
				BlockManager.steelBlock);

		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.terraDiamond,
				9), BlockManager.terraDiamondBlock);

		GameRegistry.addShapelessRecipe(new ItemStack(
				ItemManager.exaltedDiamond, 9),
				BlockManager.exaltedDiamondBlock);

		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.bronzeIngot,
				1), ItemManager.copperIngot, ItemManager.copperIngot,
				ItemManager.copperIngot, ItemManager.tinIngot);

		GameRegistry.addShapelessRecipe(new ItemStack(
				ItemManager.tyionetiumIngot, 1), ItemManager.bronzeIngot,
				ItemManager.exaltedDiamond);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.magicIngot),
				ItemManager.magicNugget,
				ItemManager.magicNugget,
				ItemManager.magicNugget,
				ItemManager.magicNugget,
				ItemManager.magicNugget,
				ItemManager.magicNugget,
				ItemManager.magicNugget,
				ItemManager.magicNugget);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.magicNugget, 9),
				ItemManager.magicIngot);		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.mysticIngot),
				ItemManager.mysticNugget,
				ItemManager.mysticNugget,
				ItemManager.mysticNugget,
				ItemManager.mysticNugget,
				ItemManager.mysticNugget,
				ItemManager.mysticNugget,
				ItemManager.mysticNugget,
				ItemManager.mysticNugget,
				ItemManager.mysticNugget);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.mysticNugget, 9),
				ItemManager.mysticIngot);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.mysteriousIngot),
				ItemManager.mysteriousNugget,
				ItemManager.mysteriousNugget,
				ItemManager.mysteriousNugget,
				ItemManager.mysteriousNugget,
				ItemManager.mysteriousNugget,
				ItemManager.mysteriousNugget,
				ItemManager.mysteriousNugget,
				ItemManager.mysteriousNugget,
				ItemManager.mysteriousNugget);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.mysteriousNugget, 9),
				ItemManager.mysteriousIngot);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.brightflameIngot),
				ItemManager.brightflameNugget,
				ItemManager.brightflameNugget,
				ItemManager.brightflameNugget,
				ItemManager.brightflameNugget,
				ItemManager.brightflameNugget,
				ItemManager.brightflameNugget,
				ItemManager.brightflameNugget,
				ItemManager.brightflameNugget,
				ItemManager.brightflameNugget);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.brightflameNugget, 9),
				ItemManager.brightflameIngot);
	}

	public static void craftingShaped() {

		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.storeBox),
				"xyx", "xax", "xxx", 'y', BlockManager.copperBlock, 'x',
				Blocks.PLANKS, 'a', Blocks.CHEST);

		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.superStoreBox),
				"xxx", "xax", "xxx", 'x', BlockManager.copperBlock, 'a',
				BlockManager.storeBox);

		// start Copper Tools
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperAxe),
				"xx ", "xy ", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperAxe),
				" xx", " yx", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperHoe),
				"xx ", " y ", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperHoe),
				" xx", " y ", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperPickaxe),
				"xxx", " y ", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperShovel),
				" x ", " y ", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperMattock),
				"xxx", " yx", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperMattock),
				"xxx", "xy ", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperSword),
				" x ", " x ", " y ", 'x', ItemManager.copperIngot, 'y',
				Items.STICK);
		// end Copper Tools

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.tyionetiumAxe),
				"xx ", "xy ", " y ", 'x', ItemManager.tyionetiumIngot, 'y',
				Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.tyionetiumAxe),
				" xx", " yx", " y ", 'x', ItemManager.tyionetiumIngot, 'y',
				Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.tyionetiumHoe),
				"xx ", " y ", " y ", 'x', ItemManager.tyionetiumIngot, 'y',
				Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.tyionetiumHoe),
				" xx", " y ", " y ", 'x', ItemManager.tyionetiumIngot, 'y',
				Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(
				ItemManager.tyionetiumPickaxe), "xxx", " y ", " y ", 'x',
				ItemManager.tyionetiumIngot, 'y', Items.STICK);

		GameRegistry.addShapedRecipe(
				new ItemStack(ItemManager.tyionetiumShovel), " x ", " y ",
				" y ", 'x', ItemManager.tyionetiumIngot, 'y', Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(
				ItemManager.tyionetiumMattock), "xxx", " yx", " y ", 'x',
				ItemManager.tyionetiumIngot, 'y', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(
				ItemManager.tyionetiumMattock), "xxx", "xy ", " y ", 'x',
				ItemManager.tyionetiumIngot, 'y', Items.STICK);

		GameRegistry.addShapedRecipe(
				new ItemStack(ItemManager.tyionetiumSword), " x ", " x ",
				" y ", 'x', ItemManager.tyionetiumIngot, 'y', Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.woodMattock),
				"xxx", " yx", " y ", 'x', Item.getItemFromBlock(Blocks.PLANKS),
				'y', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.woodMattock),
				"xxx", "xy ", " y ", 'x', Item.getItemFromBlock(Blocks.PLANKS),
				'y', Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.stoneMattock),
				"xxx", " yx", " y ", 'x',
				Item.getItemFromBlock(Blocks.COBBLESTONE), 'y', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.stoneMattock),
				"xxx", "xy ", " y ", 'x',
				Item.getItemFromBlock(Blocks.COBBLESTONE), 'y', Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.ironMattock),
				"xxx", " yx", " y ", 'x', Items.IRON_INGOT, 'y', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.ironMattock),
				"xxx", "xy ", " y ", 'x', Items.IRON_INGOT, 'y', Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.diamondMattock),
				"xxx", " yx", " y ", 'x', Items.DIAMOND, 'y', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.diamondMattock),
				"xxx", "xy ", " y ", 'x', Items.DIAMOND, 'y', Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.goldMattock),
				"xxx", " yx", " y ", 'x', Items.GOLD_INGOT, 'y', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.goldMattock),
				"xxx", "xy ", " y ", 'x', Items.GOLD_INGOT, 'y', Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperHelmet),
				"xxx", "x x", 'x', ItemManager.copperIngot);

		GameRegistry.addShapedRecipe(
				new ItemStack(ItemManager.copperChestplate), "x x", "xxx",
				"xxx", 'x', ItemManager.copperIngot);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperLeggings),
				"xxx", "x x", "x x", 'x', ItemManager.copperIngot);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.copperBoots),
				"x x", "x x", 'x', ItemManager.copperIngot);

		GameRegistry.addShapedRecipe(new ItemStack(
				ItemManager.terraDiamondHelmet), "xxx", "x x", 'x',
				ItemManager.terraDiamond);

		GameRegistry.addShapedRecipe(new ItemStack(
				ItemManager.terraDiamondChestplate), "x x", "xxx", "xxx", 'x',
				ItemManager.terraDiamond);

		GameRegistry.addShapedRecipe(new ItemStack(
				ItemManager.terraDiamondLeggings), "xxx", "x x", "x x", 'x',
				ItemManager.terraDiamond);

		GameRegistry.addShapedRecipe(new ItemStack(
				ItemManager.terraDiamondBoots), "x x", "x x", 'x',
				ItemManager.terraDiamond);

		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.lapisRemover),
				" xx", " yx", "y  ", 'x',
				Item.getItemFromBlock(Blocks.LAPIS_BLOCK), 'y', Items.STICK);

		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.mysteriousBox),
				"xyx", "yzy", "xxx", 'x',
				Item.getItemFromBlock(Blocks.LAPIS_BLOCK), 'y',
				Items.IRON_INGOT, 'z', Item.getItemFromBlock(Blocks.CHEST));
	}
}
