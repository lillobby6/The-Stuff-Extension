package com.tse.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemManager {
	
	public static Item exaltedDiamond;
	public static Item bloodDiamond;
	public static Item terraDiamond;
	public static Item lunaDiamond;
	public static Item copperIngot;
	public static Item copperPickaxe;
	public static Item copperAxe;

	public static void createItems()
	{
		GameRegistry.registerItem(exaltedDiamond = new TSEItem("exalted_diamond"), "exalted_diamond");
		GameRegistry.registerItem(bloodDiamond = new TSEItem("blood_diamond"), "blood_diamond");
		GameRegistry.registerItem(terraDiamond = new TSEItem("terra_diamond"), "terra_diamond");
		GameRegistry.registerItem(lunaDiamond = new TSEItem("luna_diamond"), "luna_diamond");
		GameRegistry.registerItem(copperIngot = new TSEItem("copper_ingot"), "copper_ingot");
		GameRegistry.registerItem(copperPickaxe = new TSEPickaxe(ToolMaterial.IRON, "copper_pickaxe"), "copper_pickaxe");
		GameRegistry.registerItem(copperAxe = new TSEAxe(ToolMaterial.IRON, "copper_axe"), "copper_axe");
	}
}
