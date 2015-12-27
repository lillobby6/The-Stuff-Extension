package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tse.item.materials.TSEArmorMaterials;

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
	
	public static Item mysteriousRemover;
	
	public static Item copperHelmet;
	public static Item copperChestplate;
	public static Item copperLeggings;
	public static Item copperBoots;

	public static void createItems()
	{
		GameRegistry.registerItem(exaltedDiamond = new TSEItem("exalted_diamond"), "exalted_diamond");
		GameRegistry.registerItem(bloodDiamond = new TSEItem("blood_diamond"), "blood_diamond");
		GameRegistry.registerItem(terraDiamond = new TSEItem("terra_diamond"), "terra_diamond");
		GameRegistry.registerItem(lunaDiamond = new TSEItem("luna_diamond"), "luna_diamond");
		
		GameRegistry.registerItem(copperIngot = new TSEItem("copper_ingot"), "copper_ingot");
		GameRegistry.registerItem(steelIngot = new TSEItem("steel_ingot"), "steel_ingot");
		
		GameRegistry.registerItem(copperPickaxe = new TSEPickaxe(ToolMaterial.IRON, "copper_pickaxe"), "copper_pickaxe");
		GameRegistry.registerItem(copperAxe = new TSEAxe(ToolMaterial.IRON, "copper_axe"), "copper_axe");
		GameRegistry.registerItem(copperShovel = new TSESpade(ToolMaterial.IRON, "copper_shovel"), "copper_shovel");
		GameRegistry.registerItem(copperHoe = new TSEHoe(ToolMaterial.IRON, "copper_hoe"), "copper_hoe");
		GameRegistry.registerItem(copperMattock = new TSEMattock(ToolMaterial.IRON, "copper_mattock"), "copper_mattock");
		GameRegistry.registerItem(copperSword = new TSESword("copper_sword"), "copper_sword");
		
		GameRegistry.registerItem(woodMattock = new TSEMattock(ToolMaterial.WOOD, 0, "wood_mattock", CreativeTabs.tabTools), "wood_mattock");
		GameRegistry.registerItem(stoneMattock = new TSEMattock(ToolMaterial.STONE, 1, "stone_mattock", CreativeTabs.tabTools), "stone_mattock");
		GameRegistry.registerItem(ironMattock = new TSEMattock(ToolMaterial.IRON, 2, "iron_mattock", CreativeTabs.tabTools), "iron_mattock");
		GameRegistry.registerItem(diamondMattock = new TSEMattock(ToolMaterial.EMERALD, 3, "diamond_mattock", CreativeTabs.tabTools), "diamond_mattock");
		GameRegistry.registerItem(goldMattock = new TSEMattock(ToolMaterial.GOLD, 0, "gold_mattock", CreativeTabs.tabTools), "gold_mattock");

		GameRegistry.registerItem(copperHelmet = new TSEArmor("copper_helmet", TSEArmorMaterials.COPPER, 1, 0), "copper_helmet");
		GameRegistry.registerItem(copperChestplate = new TSEArmor("copper_chestplate", TSEArmorMaterials.COPPER, 1, 1), "copper_chestplate");
		GameRegistry.registerItem(copperLeggings = new TSEArmor("copper_leggings", TSEArmorMaterials.COPPER, 1, 2), "copper_leggings");
		GameRegistry.registerItem(copperBoots = new TSEArmor("copper_boots", TSEArmorMaterials.COPPER, 1, 3), "copper_boots");
		
		GameRegistry.registerItem(mysteriousRemover = new MysteriousRemover(), "mysterious_remover");

		
	}
}
