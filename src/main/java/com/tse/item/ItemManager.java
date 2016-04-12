package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.item.materials.TSEArmorMaterials;
import com.tse.item.materials.TSEToolMaterials;

public class ItemManager {

	
	public static Item exaltedDiamond;
	public static Item bloodDiamond;
	public static Item terraDiamond;
	public static Item lunaDiamond;
	
	public static Item copperIngot;
	public static Item steelIngot;
	
	public static Item copperPickaxe;
	public static Item copperAxe;
	public static Item copperShovel;
	public static Item copperHoe;
	public static Item copperMattock;
	public static Item copperSword;
	
	public static Item woodMattock;
	public static Item stoneMattock;
	public static Item ironMattock;
	public static Item diamondMattock;
	public static Item goldMattock;
	
	public static Item lapisRemover;
	
	public static Item copperHelmet;
	public static Item copperChestplate;
	public static Item copperLeggings;
	public static Item copperBoots;
	
	public static Item terraDiamondPickaxe;
	public static Item terraDiamondAxe;
	public static Item terraDiamondShovel;
	public static Item terraDiamondHoe;
	public static Item terraDiamondMattock;
	public static Item terraDiamondSword;
	
	public static Item terraDiamondHelmet;
	public static Item terraDiamondChestplate;
	public static Item terraDiamondLeggings;
	public static Item terraDiamondBoots;

	public static void createItems()
	{
		//Start Materials
		GameRegistry.registerItem(exaltedDiamond = new TSEItem("exalted_diamond"), "exalted_diamond");
		GameRegistry.registerItem(bloodDiamond = new TSEItem("blood_diamond"), "blood_diamond");
		GameRegistry.registerItem(terraDiamond = new TSEItem("terra_diamond"), "terra_diamond");
		GameRegistry.registerItem(lunaDiamond = new TSEItem("luna_diamond"), "luna_diamond");
		GameRegistry.registerItem(copperIngot = new TSEItem("copper_ingot"), "copper_ingot");
		GameRegistry.registerItem(steelIngot = new TSEItem("steel_ingot"), "steel_ingot");
		//End Materials
		
		//Start Tools
		//Copper
		GameRegistry.registerItem(copperPickaxe = new TSEPickaxe(TSEToolMaterials.COPPER, "copper_pickaxe"), "copper_pickaxe");
		GameRegistry.registerItem(copperAxe = new TSEAxe(TSEToolMaterials.COPPER, "copper_axe"), "copper_axe");
		GameRegistry.registerItem(copperShovel = new TSESpade(TSEToolMaterials.COPPER, "copper_shovel"), "copper_shovel");
		GameRegistry.registerItem(copperHoe = new TSEHoe(TSEToolMaterials.COPPER, "copper_hoe"), "copper_hoe");
		GameRegistry.registerItem(copperMattock = new TSEMattock(TSEToolMaterials.COPPER, "copper_mattock"), "copper_mattock");
		//Copper
		
		//Terra Diamond
		GameRegistry.registerItem(terraDiamondPickaxe = new TSEPickaxe(TSEToolMaterials.TDIAMOND, TSECreativeTabs.tabTools, 4, "terra_diamond_pickaxe"), "terra_diamond_pickaxe");
		GameRegistry.registerItem(terraDiamondAxe = new TSEAxe(TSEToolMaterials.TDIAMOND, TSECreativeTabs.tabTools, 4, "terra_diamond_axe"), "terra_diamond_axe");
		GameRegistry.registerItem(terraDiamondShovel = new TSESpade(TSEToolMaterials.TDIAMOND, 4, TSECreativeTabs.tabTools, "terra_diamond_shovel"), "terra_diamond_shovel");
		GameRegistry.registerItem(terraDiamondHoe = new TSEHoe(TSEToolMaterials.TDIAMOND, TSECreativeTabs.tabTools, 4, "terra_diamond_hoe"), "terra_diamond_hoe");
		GameRegistry.registerItem(terraDiamondMattock = new TSEMattock(TSEToolMaterials.TDIAMOND, 4, "terra_diamond_mattock", TSECreativeTabs.tabTools), "terra_diamond_mattock");
		//Terra Diamond
		//End Tools
		
		//Start Swords
		GameRegistry.registerItem(copperSword = new TSESword(TSEToolMaterials.COPPER, "copper_sword"), "copper_sword");
		GameRegistry.registerItem(terraDiamondSword = new TSESword(TSEToolMaterials.TDIAMOND, TSECreativeTabs.tabWeapons, "terra_diamond_sword"), "terra_diamond_sword");
		//End Swords
		
		//Start Vanilla Material Tools
		GameRegistry.registerItem(woodMattock = new TSEMattock(ToolMaterial.WOOD, 0, "wood_mattock", CreativeTabs.tabTools), "wood_mattock");
		GameRegistry.registerItem(stoneMattock = new TSEMattock(ToolMaterial.STONE, 1, "stone_mattock", CreativeTabs.tabTools), "stone_mattock");
		GameRegistry.registerItem(ironMattock = new TSEMattock(ToolMaterial.IRON, 2, "iron_mattock", CreativeTabs.tabTools), "iron_mattock");
		GameRegistry.registerItem(diamondMattock = new TSEMattock(ToolMaterial.DIAMOND, 3, "diamond_mattock", CreativeTabs.tabTools), "diamond_mattock");
		GameRegistry.registerItem(goldMattock = new TSEMattock(ToolMaterial.GOLD, 0, "gold_mattock", CreativeTabs.tabTools), "gold_mattock");
		//End Vanilla Material Tools
		
		//Start Armor
		//Copper
		GameRegistry.registerItem(copperHelmet = new TSEArmor("copper_helmet", TSEArmorMaterials.COPPER, 1, 0), "copper_helmet");
		GameRegistry.registerItem(copperChestplate = new TSEArmor("copper_chestplate", TSEArmorMaterials.COPPER, 1, 1), "copper_chestplate");
		GameRegistry.registerItem(copperLeggings = new TSEArmor("copper_leggings", TSEArmorMaterials.COPPER, 1, 2), "copper_leggings");
		GameRegistry.registerItem(copperBoots = new TSEArmor("copper_boots", TSEArmorMaterials.COPPER, 1, 3), "copper_boots");
		//Copper	
		
		//Terra Diamond
		GameRegistry.registerItem(terraDiamondHelmet = new TSEArmor("terra_diamond_helmet", TSEArmorMaterials.TERRADIAMOND, 1, 0), "terra_diamond_helmet");
		GameRegistry.registerItem(terraDiamondChestplate = new TSEArmor("terra_diamond_chestplate", TSEArmorMaterials.TERRADIAMOND, 1, 1), "terra_diamond_chestplate");
		GameRegistry.registerItem(terraDiamondLeggings = new TSEArmor("terra_diamond_leggings", TSEArmorMaterials.TERRADIAMOND, 1, 2), "terra_diamond_leggings");
		GameRegistry.registerItem(terraDiamondBoots = new TSEArmor("terra_diamond_boots", TSEArmorMaterials.TERRADIAMOND, 1, 3), "terra_diamond_boots");
		//Terra Diamond
		
		//End Armor
		
		//Start Misc
		GameRegistry.registerItem(lapisRemover = new TSERemover(TSEToolMaterials.LAPIS, TSECreativeTabs.tabTools, "lapis_remover", 0), "lapis_remover");
		//End Misc
		
	}
}
