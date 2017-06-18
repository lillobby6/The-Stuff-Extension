package com.tse.recipe;

import com.tse.block.BlockManager;
import com.tse.item.ItemManager;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Smelting {
	public static void smelting() {
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.exaltedDiamondOre), new ItemStack(ItemManager.exaltedDiamond), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.bloodDiamondOre), new ItemStack(ItemManager.bloodDiamond), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.terraDiamondOre), new ItemStack(ItemManager.terraDiamond), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.copperOre), new ItemStack(ItemManager.copperIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.tinOre), new ItemStack(ItemManager.tinIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.mortiumOre), new ItemStack(ItemManager.mortiumIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.toslotriumOre), new ItemStack(ItemManager.toslotriumIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.vividiumOre), new ItemStack(ItemManager.vividiumIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.skyIronOre), new ItemStack(ItemManager.skyIronIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.terriumOre), new ItemStack(ItemManager.terriumIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.toslotriumOre), new ItemStack(ItemManager.toslotriumIngot), 0.1F);
		
		GameRegistry.addSmelting(Items.DIAMOND, new ItemStack(ItemManager.diamondIngot), 0.1F);
		
		GameRegistry.addSmelting(ItemManager.mixedIngot, new ItemStack(ItemManager.mithrilIngot), 0.1F);
		GameRegistry.addSmelting(ItemManager.diamondToslotriumMixedIngot, new ItemStack(ItemManager.mysticIngot), 0.1F);
		
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.moonIronOre), new ItemStack(Items.IRON_INGOT), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.lunaDiamondOre), new ItemStack(ItemManager.lunaDiamond), 0.1F);
		
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ItemManager.steelIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(Blocks.IRON_BLOCK), new ItemStack(Item.getItemFromBlock(BlockManager.steelBlock)), 0.9F);
		
		GameRegistry.addSmelting(Items.GOLD_INGOT, new ItemStack(ItemManager.reforgedGoldIngot), 0.1F);
		GameRegistry.addSmelting(Item.getItemFromBlock(Blocks.GOLD_BLOCK), new ItemStack(Item.getItemFromBlock(BlockManager.reforgedGoldBlock)), 0.1F);
		
		GameRegistry.addSmelting(Item.getItemFromBlock(BlockManager.whiteCobblestone), new ItemStack(Item.getItemFromBlock(BlockManager.whiteStone)), 0.1F);
	}	
	/**All shaped and shapeless recipes moved into JSONs.*/
}
