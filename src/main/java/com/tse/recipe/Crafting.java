package com.tse.recipe;

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
	}
}
