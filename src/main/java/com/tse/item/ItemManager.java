package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
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
	public static Item tinIngot;
	public static Item tyionetiumIngot;
	public static Item bronzeIngot;
	public static Item brightflameIngot;
	public static Item brightsteelIngot;
	public static Item diamondIngot;
	public static Item reforgedGoldIngot;
	public static Item magicIngot;
	public static Item mithrilIngot;
	public static Item mortiumIngot;
	public static Item mysteriousIngot;
	public static Item mysticIngot;
	public static Item skyIronIngot;
	public static Item terriumIngot;
	public static Item toslotriumIngot;
	public static Item vividiumIngot;
	
	public static Item mixedIngot;
	
	public static Item copperPickaxe;
	public static Item copperAxe;
	public static Item copperShovel;
	public static Item copperHoe;
	public static Item copperMattock;
	public static Item copperSword;
	
	public static Item brightflamePickaxe;
	public static Item brightflameAxe;
	public static Item brightflameShovel;
	public static Item brightflameHoe;
	public static Item brightflameMattock;
	public static Item brightflameSword;
	
	public static Item brightsteelPickaxe;
	public static Item brightsteelAxe;
	public static Item brightsteelShovel;
	public static Item brightsteelHoe;
	public static Item brightsteelMattock;
	public static Item brightsteelSword;
	
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
	
	public static Item tyionetiumPickaxe;
	public static Item tyionetiumAxe;
	public static Item tyionetiumShovel;
	public static Item tyionetiumHoe;
	public static Item tyionetiumMattock;
	public static Item tyionetiumSword;
	
	public static Item exaltedDiamondPickaxe;
	public static Item exaltedDiamondAxe;
	public static Item exaltedDiamondShovel;
	public static Item exaltedDiamondHoe;
	public static Item exaltedDiamondMattock;
	public static Item exaltedDiamondSword;
	
	public static Item terraDiamondHelmet;
	public static Item terraDiamondChestplate;
	public static Item terraDiamondLeggings;
	public static Item terraDiamondBoots;
	

	private static Item registerItem(Item item, String registryName) {
		item.setRegistryName(registryName);
		item.setUnlocalizedName(registryName);

		return GameRegistry.register(item);
	}
	
	public static Item registerMainItem(String registryName, CreativeTabs tab) {
        final Item item = new Item();
        item.setCreativeTab(tab);

        return registerItem(item, registryName);
    }
	public static Item registerSword(ToolMaterial mat, String registryName, CreativeTabs tab)
	{
		final Item item = new TSESword(mat, tab, registryName);
		return registerItem(item, registryName);
	}
	public static Item registerPickaxe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel)
	{
		final Item item = new TSEPickaxe(mat, tab, harvestLevel, registryName);
		return registerItem(item, registryName);
	}
	public static Item registerAxe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel)
	{
		final Item item = new TSEAxe(mat, tab, harvestLevel, registryName);
		return registerItem(item, registryName);
	}
	public static Item registerMattock(float attackSpeed, ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel)
	{
		final Item item = new TSEMattock(attackSpeed, mat, harvestLevel, registryName, tab);
		return registerItem(item, registryName);
	}
	public static Item registerRemover(String registryName, float attackSpeed, ToolMaterial mat, int harvestLevel, CreativeTabs tab)
	{
		final Item item = new TSERemover(mat, tab, registryName, harvestLevel, attackSpeed);
		return registerItem(item, registryName);
	}
	public static Item registerShovel(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel)
	{
		final Item item = new TSESpade(mat, harvestLevel, tab, registryName);
		return registerItem(item, registryName);
	}
	public static Item registerHoe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel)
	{
		final Item item = new TSEHoe(mat, tab, harvestLevel, registryName);
		return registerItem(item, registryName);
	}
	public static Item registerArmor(String registryName, ArmorMaterial mat, int renderIndex, EntityEquipmentSlot equipSlot)
	{
		final Item item = new TSEArmor(registryName, mat, renderIndex, equipSlot);
		return registerItem(item, registryName);
	}

	
	public static void createItems()
	{
		
		//Start Materials
		exaltedDiamond = registerMainItem("exalted_diamond", TSECreativeTabs.tabMaterials);
		bloodDiamond = registerMainItem("blood_diamond", TSECreativeTabs.tabMaterials);
		terraDiamond = registerMainItem("terra_diamond", TSECreativeTabs.tabMaterials);
		lunaDiamond = registerMainItem("luna_diamond", TSECreativeTabs.tabMaterials);
		
		copperIngot = registerMainItem("copper_ingot", TSECreativeTabs.tabMaterials);
		steelIngot = registerMainItem("steel_ingot", TSECreativeTabs.tabMaterials);
		tinIngot = registerMainItem("tin_ingot", TSECreativeTabs.tabMaterials);
		tyionetiumIngot = registerMainItem("tyionetium_ingot", TSECreativeTabs.tabMaterials);
		bronzeIngot = registerMainItem("bronze_ingot", TSECreativeTabs.tabMaterials);
		brightflameIngot = registerMainItem("brightflame_ingot", TSECreativeTabs.tabMaterials);
		brightsteelIngot = registerMainItem("brightsteel_ingot", TSECreativeTabs.tabMaterials);
		diamondIngot = registerMainItem("diamond_ingot", TSECreativeTabs.tabMaterials);
		reforgedGoldIngot = registerMainItem("reforged_gold_ingot", TSECreativeTabs.tabMaterials);
		magicIngot = registerMainItem("magic_ingot", TSECreativeTabs.tabMaterials);
		mithrilIngot = registerMainItem("mithril_ingot", TSECreativeTabs.tabMaterials);
		mortiumIngot = registerMainItem("mortium_ingot", TSECreativeTabs.tabMaterials);
		mysteriousIngot = registerMainItem("mysterious_ingot", TSECreativeTabs.tabMaterials);
		mysticIngot = registerMainItem("mystic_ingot", TSECreativeTabs.tabMaterials);
		skyIronIngot = registerMainItem("sky_iron_ingot", TSECreativeTabs.tabMaterials);
		terriumIngot = registerMainItem("terrium_ingot", TSECreativeTabs.tabMaterials);
		toslotriumIngot = registerMainItem("toslotrium_ingot", TSECreativeTabs.tabMaterials);
		vividiumIngot = registerMainItem("vividium_ingot", TSECreativeTabs.tabMaterials);
		//End Materials
		
		//Start Tools
		//Copper
		copperPickaxe = registerPickaxe(TSEToolMaterials.COPPER, "copper_pickaxe", TSECreativeTabs.tabTools, 1);
		copperAxe = registerAxe(ToolMaterial.IRON, "copper_axe", TSECreativeTabs.tabTools, 1);
		copperMattock = registerMattock(-2.2F, TSEToolMaterials.COPPER, "copper_mattock", TSECreativeTabs.tabTools, 1);
		copperShovel = registerShovel(TSEToolMaterials.COPPER, "copper_shovel", TSECreativeTabs.tabTools, 1);
		copperHoe = registerHoe(TSEToolMaterials.COPPER, "copper_hoe", TSECreativeTabs.tabTools, 1);
		//Copper
		
		//Terra Diamond
		terraDiamondPickaxe = registerPickaxe(TSEToolMaterials.TDIAMOND, "terra_diamond_pickaxe", TSECreativeTabs.tabTools, 4);
		terraDiamondAxe = registerAxe(ToolMaterial.DIAMOND, "terra_diamond_axe", TSECreativeTabs.tabTools, 4);
		terraDiamondShovel = registerShovel(TSEToolMaterials.TDIAMOND, "terra_diamond_shovel", TSECreativeTabs.tabTools, 4);
		terraDiamondHoe = registerHoe(TSEToolMaterials.TDIAMOND, "terra_diamond_hoe", TSECreativeTabs.tabTools, 4);
		terraDiamondMattock = registerMattock(-2.0F, TSEToolMaterials.TDIAMOND, "terra_diamond_mattock", TSECreativeTabs.tabTools, 4);
		//Terra Diamond
		
		tyionetiumPickaxe = registerPickaxe(TSEToolMaterials.TYIONETIUM, "tyionetium_pickaxe", TSECreativeTabs.tabTools, 1);
		tyionetiumAxe = registerAxe(ToolMaterial.IRON, "tyionetium_axe", TSECreativeTabs.tabTools, 1);
		tyionetiumMattock = registerMattock(-2.2F, TSEToolMaterials.TYIONETIUM, "tyionetium_mattock", TSECreativeTabs.tabTools, 1);
		tyionetiumShovel = registerShovel(TSEToolMaterials.TYIONETIUM, "tyionetium_shovel", TSECreativeTabs.tabTools, 1);
		tyionetiumHoe = registerHoe(TSEToolMaterials.TYIONETIUM, "tyionetium_hoe", TSECreativeTabs.tabTools, 1);
		
		brightflamePickaxe = registerPickaxe(TSEToolMaterials.BRIGHTFLAME, "brightflame_pickaxe", TSECreativeTabs.tabTools, 1);
		brightflameAxe = registerAxe(ToolMaterial.DIAMOND, "brightflame_axe", TSECreativeTabs.tabTools, 1);
		brightflameShovel = registerShovel(TSEToolMaterials.BRIGHTFLAME, "brightflame_shovel", TSECreativeTabs.tabTools, 1);
		brightflameMattock = registerMattock(-2.2F, TSEToolMaterials.BRIGHTFLAME, "brightflame_mattock", TSECreativeTabs.tabTools, 1);
		brightflameHoe = registerHoe(TSEToolMaterials.BRIGHTFLAME, "brightflame_hoe", TSECreativeTabs.tabTools, 1);
		
		brightsteelPickaxe = registerPickaxe(TSEToolMaterials.BRIGHTFLAME, "brightsteel_pickaxe", TSECreativeTabs.tabTools, 1);
		brightsteelAxe = registerAxe(ToolMaterial.DIAMOND, "brightsteel_axe", TSECreativeTabs.tabTools, 1);
		brightsteelShovel = registerShovel(TSEToolMaterials.BRIGHTFLAME, "brightsteel_shovel", TSECreativeTabs.tabTools, 1);
		brightsteelMattock = registerMattock(-2.2F, TSEToolMaterials.BRIGHTFLAME, "brightsteel_mattock", TSECreativeTabs.tabTools, 1);
		brightsteelHoe = registerHoe(TSEToolMaterials.BRIGHTFLAME, "brightsteel_hoe", TSECreativeTabs.tabTools, 1);
		
		//Others
		woodMattock = registerMattock(-3.0F, ToolMaterial.WOOD, "wood_mattock", TSECreativeTabs.tabTools, 0);
		stoneMattock = registerMattock(-2.5F, ToolMaterial.STONE, "stone_mattock", TSECreativeTabs.tabTools, 1);
		ironMattock = registerMattock(-2.2F, ToolMaterial.IRON, "iron_mattock", TSECreativeTabs.tabTools, 2);
		diamondMattock = registerMattock(-2.0F, ToolMaterial.DIAMOND, "diamond_mattock", TSECreativeTabs.tabTools, 3);
		goldMattock = registerMattock(1.0F, ToolMaterial.GOLD, "gold_mattock", TSECreativeTabs.tabTools, 0);
		
		lapisRemover = registerRemover("lapis_remover", -5.0F, TSEToolMaterials.LAPIS, 1, TSECreativeTabs.tabTools);
		//Others
		
		//End Tools
		
		//Start Swords
		
		copperSword = registerSword(TSEToolMaterials.COPPER, "copper_sword", TSECreativeTabs.tabWeapons);
		terraDiamondSword = registerSword(TSEToolMaterials.TDIAMOND, "terra_diamond_sword", TSECreativeTabs.tabWeapons);
		tyionetiumSword = registerSword(TSEToolMaterials.TYIONETIUM, "tyionetium_sword", TSECreativeTabs.tabWeapons);
		brightflameSword = registerSword(TSEToolMaterials.BRIGHTFLAME, "brightflame_sword", TSECreativeTabs.tabWeapons);
		brightsteelSword = registerSword(TSEToolMaterials.BRIGHTFLAME, "brightsteel_sword", TSECreativeTabs.tabWeapons);
		
		//End Swords
		
		//Start Armor
		
		//Copper
		copperHelmet = registerArmor("copper_helmet", TSEArmorMaterials.COPPER, 1, EntityEquipmentSlot.HEAD);
		copperChestplate = registerArmor("copper_chestplate", TSEArmorMaterials.COPPER, 1, EntityEquipmentSlot.CHEST);
		copperLeggings = registerArmor("copper_leggings", TSEArmorMaterials.COPPER, 1, EntityEquipmentSlot.LEGS);
		copperBoots = registerArmor("copper_boots", TSEArmorMaterials.COPPER, 1, EntityEquipmentSlot.FEET);
		//Copper
		
		//Terra Diamond
		terraDiamondHelmet = registerArmor("terra_diamond_helmet", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.HEAD);
		terraDiamondChestplate = registerArmor("terra_diamond_chestplate", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.CHEST);
		terraDiamondLeggings = registerArmor("terra_diamond_leggings", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.LEGS);
		terraDiamondBoots = registerArmor("terra_diamond_boots", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.FEET);
		//Terra Diamond
		//End Armor
	}
	
	
}
