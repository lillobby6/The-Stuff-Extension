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

	
	public static Item goldenStick;
	public static Item diamondStick;
	public static Item mysticStick;
	
	public static Item ironRod;
	public static Item steelRod;
	public static Item bronzeRod;
	public static Item brassRod;
	public static Item titaniumRod;
	
	public static Item exaltedDiamond;
	public static Item bloodDiamond;
	public static Item terraDiamond;
	public static Item lunaDiamond;
	
	public static Item sphaleriteGem;
	
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
	public static Item extranetiumIngot;
	public static Item silverIngot;
	public static Item platinumIngot;
	public static Item titaniumIngot;
	public static Item zincIngot;
	public static Item brassIngot;
	public static Item leadIngot;
	public static Item nickelIngot;
	public static Item pewterIngot;
	public static Item aluminumIngot;
	
	public static Item magicNugget;
	public static Item mysticNugget;
	public static Item mysteriousNugget;
	public static Item brightflameNugget;
	public static Item diamondNugget;
	public static Item bronzeNugget;
	public static Item brassNugget;
	public static Item silverNugget;
	public static Item platinumNugget;
	public static Item titaniumNugget;
	public static Item steelNugget;
	
	public static Item diamondToslotriumMixedIngot;
	
	public static Item tyionetiumMithrilToslotriumMixedIngot;
	
	public static Item mixedIngot;
	
	public static Item justice;
	public static Item corruption;
	
	public static Item bronzePickaxe;
	public static Item bronzeAxe;
	public static Item bronzeMattock;
	public static Item bronzeShovel;
	public static Item bronzeHoe;
	public static Item bronzeSword;
	
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
	
	public static Item magicPickaxe;
	public static Item magicAxe;
	public static Item magicShovel;
	public static Item magicHoe;
	public static Item magicMattock;
	public static Item magicSword;
	
	public static Item mithrilPickaxe;
	public static Item mithrilAxe;
	public static Item mithrilShovel;
	public static Item mithrilHoe;
	public static Item mithrilMattock;
	public static Item mithrilSword;
	
	public static Item extranetiumPickaxe;
	public static Item extranetiumAxe;
	public static Item extranetiumMattock;
	public static Item extranetiumShovel;
	public static Item extranetiumHoe;
	public static Item extranetiumSword;
	
	public static Item mortiumPickaxe;
	public static Item mortiumAxe;
	public static Item mortiumHoe;
	public static Item mortiumShovel;
	public static Item mortiumMattock;
	public static Item mortiumSword;
	
	public static Item mysteriousPickaxe;
	public static Item mysteriousAxe;
	public static Item mysteriousHoe;
	public static Item mysteriousShovel;
	public static Item mysteriousMattock;
	public static Item mysteriousSword;
	
	public static Item mysticPickaxe;
	public static Item mysticAxe;
	public static Item mysticHoe;
	public static Item mysticShovel;
	public static Item mysticMattock;
	public static Item mysticSword;
	
	public static Item skyIronPickaxe;
	public static Item skyIronAxe;
	public static Item skyIronHoe;
	public static Item skyIronShovel;
	public static Item skyIronMattock;
	public static Item skyIronSword;
	
	public static Item terriumPickaxe;
	public static Item terriumAxe;
	public static Item terriumHoe;
	public static Item terriumShovel;
	public static Item terriumMattock;
	public static Item terriumSword;
	
	public static Item vividiumPickaxe;
	public static Item vividiumAxe;
	public static Item vividiumHoe;
	public static Item vividiumShovel;
	public static Item vividiumMattock;
	public static Item vividiumSword;
	
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
	
	public static Item brightflameHelmet;
	public static Item brightflameChestplate;
	public static Item brightflameLeggings;
	public static Item brightflameBoots;
	
	public static Item brightsteelHelmet;
	public static Item brightsteelChestplate;
	public static Item brightsteelLeggings;
	public static Item brightsteelBoots;
	
	public static Item bronzeHelmet;
	public static Item bronzeChestplate;
	public static Item bronzeLeggings;
	public static Item bronzeBoots;

	public static Item tinHelmet;
	public static Item tinChestplate;
	public static Item tinLeggings;
	public static Item tinBoots;
	
	public static Item magicHelmet;
	public static Item magicChestplate;
	public static Item magicLeggings;
	public static Item magicBoots;
	
	public static Item mithrilHelmet;
	public static Item mithrilChestplate;
	public static Item mithrilLeggings;
	public static Item mithrilBoots;
	
	public static Item mortiumHelmet;
	public static Item mortiumChestplate;
	public static Item mortiumLeggings;
	public static Item mortiumBoots;
	
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
	public static Item registerLightSword(ToolMaterial mat, String registryName, CreativeTabs tab, boolean hasFlames)
	{
		final Item item = new LightningSword(mat, tab, registryName, hasFlames);
		return registerItem(item, registryName);
	}
	public static Item registerPickaxe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel)
	{
		final Item item = new TSEPickaxe(mat, tab, harvestLevel, registryName);
		return registerItem(item, registryName);
	}
	public static Item registerAxe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel, float attackSpeed, float damage)
	{
		final Item item = new TSEAxe(mat, attackSpeed, damage, tab, harvestLevel, registryName);
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
		goldenStick = registerMainItem("golden_stick", TSECreativeTabs.tabMaterials);
		diamondStick = registerMainItem("diamond_stick", TSECreativeTabs.tabMaterials);
		mysticStick = registerMainItem("mystic_stick", TSECreativeTabs.tabMaterials);
		
		ironRod = registerMainItem("iron_rod", TSECreativeTabs.tabMaterials);
		steelRod = registerMainItem("steel_rod", TSECreativeTabs.tabMaterials);
		bronzeRod = registerMainItem("bronze_rod", TSECreativeTabs.tabMaterials);
		brassRod = registerMainItem("brass_rod", TSECreativeTabs.tabMaterials);
		titaniumRod = registerMainItem("titanium_rod", TSECreativeTabs.tabMaterials);
		
		exaltedDiamond = registerMainItem("exalted_diamond", TSECreativeTabs.tabMaterials);
		bloodDiamond = registerMainItem("blood_diamond", TSECreativeTabs.tabMaterials);
		terraDiamond = registerMainItem("terra_diamond", TSECreativeTabs.tabMaterials);
		lunaDiamond = registerMainItem("luna_diamond", TSECreativeTabs.tabMaterials);
		
		sphaleriteGem = registerMainItem("sphalerite_gem", TSECreativeTabs.tabMaterials);
		
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
		extranetiumIngot = registerMainItem("extranetium_ingot", TSECreativeTabs.tabMaterials);
		silverIngot = registerMainItem("silver_ingot", TSECreativeTabs.tabMaterials);
		platinumIngot = registerMainItem("platinum_ingot", TSECreativeTabs.tabMaterials);
		titaniumIngot = registerMainItem("titanium_ingot", TSECreativeTabs.tabMaterials);
		zincIngot = registerMainItem("zinc_ingot", TSECreativeTabs.tabMaterials);
		brassIngot = registerMainItem("brass_ingot", TSECreativeTabs.tabMaterials);
		leadIngot = registerMainItem("lead_ingot", TSECreativeTabs.tabMaterials);
		nickelIngot = registerMainItem("nickel_ingot", TSECreativeTabs.tabMaterials);
		pewterIngot = registerMainItem("pewter_ingot", TSECreativeTabs.tabMaterials);
		aluminumIngot = registerMainItem("aluminum_ingot", TSECreativeTabs.tabMaterials);
		
		magicNugget = registerMainItem("magic_nugget", TSECreativeTabs.tabMaterials);
		mysticNugget = registerMainItem("mystic_nugget", TSECreativeTabs.tabMaterials);
		mysteriousNugget = registerMainItem("mysterious_nugget", TSECreativeTabs.tabMaterials);
		brightflameNugget = registerMainItem("brightflame_nugget", TSECreativeTabs.tabMaterials);
		diamondNugget = registerMainItem("diamond_nugget", TSECreativeTabs.tabMaterials);
		bronzeNugget = registerMainItem("bronze_nugget", TSECreativeTabs.tabMaterials);
		brassNugget = registerMainItem("brass_nugget", TSECreativeTabs.tabMaterials);
		silverNugget = registerMainItem("silver_nugget", TSECreativeTabs.tabMaterials);
		platinumNugget = registerMainItem("platinum_nugget", TSECreativeTabs.tabMaterials);
		titaniumNugget = registerMainItem("titanium_nugget", TSECreativeTabs.tabMaterials);
		steelNugget = registerMainItem("steel_nugget", TSECreativeTabs.tabMaterials);
		
		diamondToslotriumMixedIngot = registerMainItem("diamond_toslotrium_mixed_ingot", TSECreativeTabs.tabMaterials);
		mixedIngot = registerMainItem("mixed_ingot", TSECreativeTabs.tabMaterials);
		tyionetiumMithrilToslotriumMixedIngot = registerMainItem("tyionetium_mithril_toslotrium_mixed_ingot", TSECreativeTabs.tabMaterials);
		//End Materials
		
		//Start Tools
		//Copper
		copperPickaxe = registerPickaxe(TSEToolMaterials.COPPER, "copper_pickaxe", TSECreativeTabs.tabTools, 2);
		copperAxe = registerAxe(TSEToolMaterials.COPPER, "copper_axe", TSECreativeTabs.tabTools, 2, 1F, 5.0F);
		copperMattock = registerMattock(-2.2F, TSEToolMaterials.COPPER, "copper_mattock", TSECreativeTabs.tabTools, 2);
		copperShovel = registerShovel(TSEToolMaterials.COPPER, "copper_shovel", TSECreativeTabs.tabTools, 2);
		copperHoe = registerHoe(TSEToolMaterials.COPPER, "copper_hoe", TSECreativeTabs.tabTools, 2);
		//Copper
		
		bronzePickaxe = registerPickaxe(TSEToolMaterials.BRONZE, "bronze_pickaxe", TSECreativeTabs.tabTools, 3);
		bronzeAxe = registerAxe(TSEToolMaterials.BRONZE, "bronze_axe", TSECreativeTabs.tabTools, 3, 1F, 4.0F);
		bronzeMattock = registerMattock(-2.2F, TSEToolMaterials.BRONZE, "bronze_mattock", TSECreativeTabs.tabTools, 3);
		bronzeShovel = registerShovel(TSEToolMaterials.BRONZE, "bronze_shovel", TSECreativeTabs.tabTools, 3);
		bronzeHoe = registerHoe(TSEToolMaterials.BRONZE, "bronze_hoe", TSECreativeTabs.tabTools, 3);
		
		magicPickaxe = registerPickaxe(TSEToolMaterials.MAGIC, "magic_pickaxe", TSECreativeTabs.tabTools, 6);
		magicAxe = registerAxe(TSEToolMaterials.MITHRIL, "magic_axe", TSECreativeTabs.tabTools, 6, 1F, 10.0F);
		magicMattock = registerMattock(-2.2F, TSEToolMaterials.MAGIC, "magic_mattock", TSECreativeTabs.tabTools, 6);
		magicShovel = registerShovel(TSEToolMaterials.MAGIC, "magic_shovel", TSECreativeTabs.tabTools, 6);
		magicHoe = registerHoe(TSEToolMaterials.MAGIC, "magic_hoe", TSECreativeTabs.tabTools, 6);
		
		mithrilPickaxe = registerPickaxe(TSEToolMaterials.MITHRIL, "mithril_pickaxe", TSECreativeTabs.tabTools, 7);
		mithrilAxe = registerAxe(TSEToolMaterials.MITHRIL, "mithril_axe", TSECreativeTabs.tabTools, 7, 1F, 15.0F);
		mithrilMattock = registerMattock(-2.2F, TSEToolMaterials.MITHRIL, "mithril_mattock", TSECreativeTabs.tabTools, 7);
		mithrilShovel = registerShovel(TSEToolMaterials.MITHRIL, "mithril_shovel", TSECreativeTabs.tabTools, 7);
		mithrilHoe = registerHoe(TSEToolMaterials.MITHRIL, "mithril_hoe", TSECreativeTabs.tabTools, 7);
		
		mortiumPickaxe = registerPickaxe(TSEToolMaterials.MORTIUM, "mortium_pickaxe", TSECreativeTabs.tabTools, 4);
		mortiumAxe = registerAxe(TSEToolMaterials.MORTIUM, "mortium_axe", TSECreativeTabs.tabTools, 4, 1F, 4.0F);
		mortiumMattock = registerMattock(-2.2F, TSEToolMaterials.MORTIUM, "mortium_mattock", TSECreativeTabs.tabTools, 4);
		mortiumShovel = registerShovel(TSEToolMaterials.MORTIUM, "mortium_shovel", TSECreativeTabs.tabTools, 4);
		mortiumHoe = registerHoe(TSEToolMaterials.MORTIUM, "mortium_hoe", TSECreativeTabs.tabTools, 4);
		
		mysteriousPickaxe = registerPickaxe(TSEToolMaterials.MYSTERIOUS, "mysterious_pickaxe", TSECreativeTabs.tabTools, 6);
		mysteriousAxe = registerAxe(TSEToolMaterials.MYSTERIOUS, "mysterious_axe", TSECreativeTabs.tabTools, 6, 1F, 11F);
		mysteriousMattock = registerMattock(-2.2F, TSEToolMaterials.MYSTERIOUS, "mysterious_mattock", TSECreativeTabs.tabTools, 6);
		mysteriousShovel = registerShovel(TSEToolMaterials.MYSTERIOUS, "mysterious_shovel", TSECreativeTabs.tabTools, 6);
		mysteriousHoe = registerHoe(TSEToolMaterials.MYSTERIOUS, "mysterious_hoe", TSECreativeTabs.tabTools, 6);
		
		mysticPickaxe = registerPickaxe(TSEToolMaterials.MYSTIC, "mystic_pickaxe", TSECreativeTabs.tabTools, 5);
		mysticAxe = registerAxe(TSEToolMaterials.MYSTIC, "mystic_axe", TSECreativeTabs.tabTools, 5, 1F, 7F);
		mysticMattock = registerMattock(-2.2F, TSEToolMaterials.MYSTIC, "mystic_mattock", TSECreativeTabs.tabTools, 5);
		mysticShovel = registerShovel(TSEToolMaterials.MYSTIC, "mystic_shovel", TSECreativeTabs.tabTools, 5);
		mysticHoe = registerHoe(TSEToolMaterials.MYSTIC, "mystic_hoe", TSECreativeTabs.tabTools, 5);
		
		skyIronPickaxe = registerPickaxe(TSEToolMaterials.SKYIRON, "sky_iron_pickaxe", TSECreativeTabs.tabTools, 2);
		skyIronAxe = registerAxe(TSEToolMaterials.SKYIRON, "sky_iron_axe", TSECreativeTabs.tabTools, 2, 1F, 2F);
		skyIronMattock = registerMattock(-2.2F, TSEToolMaterials.SKYIRON, "sky_iron_mattock", TSECreativeTabs.tabTools, 2);
		skyIronShovel = registerShovel(TSEToolMaterials.SKYIRON, "sky_iron_shovel", TSECreativeTabs.tabTools, 2);
		skyIronHoe = registerHoe(TSEToolMaterials.SKYIRON, "sky_iron_hoe", TSECreativeTabs.tabTools, 2);
		
		terriumPickaxe = registerPickaxe(TSEToolMaterials.TERRIUM, "terrium_pickaxe", TSECreativeTabs.tabTools, 5);
		terriumAxe = registerAxe(TSEToolMaterials.TERRIUM, "terrium_axe", TSECreativeTabs.tabTools, 5, 1F, 4.0F);
		terriumMattock = registerMattock(-2.2F, TSEToolMaterials.TERRIUM, "terrium_mattock", TSECreativeTabs.tabTools, 5);
		terriumShovel = registerShovel(TSEToolMaterials.TERRIUM, "terrium_shovel", TSECreativeTabs.tabTools, 5);
		terriumHoe = registerHoe(TSEToolMaterials.TERRIUM, "terrium_hoe", TSECreativeTabs.tabTools, 5);
		
		vividiumPickaxe = registerPickaxe(TSEToolMaterials.VIVIDIUM, "vividium_pickaxe", TSECreativeTabs.tabTools, 4);
		vividiumAxe = registerAxe(TSEToolMaterials.VIVIDIUM, "vividium_axe", TSECreativeTabs.tabTools, 4, 1F, 4F);
		vividiumMattock = registerMattock(-2.2F, TSEToolMaterials.VIVIDIUM, "vividium_mattock", TSECreativeTabs.tabTools, 4);
		vividiumShovel = registerShovel(TSEToolMaterials.VIVIDIUM, "vividium_shovel", TSECreativeTabs.tabTools, 4);
		vividiumHoe = registerHoe(TSEToolMaterials.VIVIDIUM, "vividium_hoe", TSECreativeTabs.tabTools, 4);
		
		//Terra Diamond
		terraDiamondPickaxe = registerPickaxe(TSEToolMaterials.TDIAMOND, "terra_diamond_pickaxe", TSECreativeTabs.tabTools, 4);
		terraDiamondAxe = registerAxe(TSEToolMaterials.TDIAMOND, "terra_diamond_axe", TSECreativeTabs.tabTools, 4, 1F, 5F);
		terraDiamondMattock = registerMattock(-2.0F, TSEToolMaterials.TDIAMOND, "terra_diamond_mattock", TSECreativeTabs.tabTools, 4);
		terraDiamondShovel = registerShovel(TSEToolMaterials.TDIAMOND, "terra_diamond_shovel", TSECreativeTabs.tabTools, 4);
		terraDiamondHoe = registerHoe(TSEToolMaterials.TDIAMOND, "terra_diamond_hoe", TSECreativeTabs.tabTools, 4);
		//Terra Diamond
		
		tyionetiumPickaxe = registerPickaxe(TSEToolMaterials.TYIONETIUM, "tyionetium_pickaxe", TSECreativeTabs.tabTools, 5);
		tyionetiumAxe = registerAxe(TSEToolMaterials.TYIONETIUM, "tyionetium_axe", TSECreativeTabs.tabTools, 5, 1F, 7F);
		tyionetiumMattock = registerMattock(-2.2F, TSEToolMaterials.TYIONETIUM, "tyionetium_mattock", TSECreativeTabs.tabTools, 5);
		tyionetiumShovel = registerShovel(TSEToolMaterials.TYIONETIUM, "tyionetium_shovel", TSECreativeTabs.tabTools, 5);
		tyionetiumHoe = registerHoe(TSEToolMaterials.TYIONETIUM, "tyionetium_hoe", TSECreativeTabs.tabTools, 5);
		
		brightflamePickaxe = registerPickaxe(TSEToolMaterials.BRIGHTFLAME, "brightflame_pickaxe", TSECreativeTabs.tabTools, 6);
		brightflameAxe = registerAxe(ToolMaterial.DIAMOND, "brightflame_axe", TSECreativeTabs.tabTools, 6, 1F, 9F);
		brightflameMattock = registerMattock(-2.2F, TSEToolMaterials.BRIGHTFLAME, "brightflame_mattock", TSECreativeTabs.tabTools, 6);
		brightflameShovel = registerShovel(TSEToolMaterials.BRIGHTFLAME, "brightflame_shovel", TSECreativeTabs.tabTools, 6);
		brightflameHoe = registerHoe(TSEToolMaterials.BRIGHTFLAME, "brightflame_hoe", TSECreativeTabs.tabTools, 6);
		
		brightsteelPickaxe = registerPickaxe(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_pickaxe", TSECreativeTabs.tabTools, 6);
		brightsteelAxe = registerAxe(ToolMaterial.DIAMOND, "brightsteel_axe", TSECreativeTabs.tabTools, 6, 1F, 4F);
		brightsteelMattock = registerMattock(-2.2F, TSEToolMaterials.BRIGHTSTEEL, "brightsteel_mattock", TSECreativeTabs.tabTools, 6);
		brightsteelShovel = registerShovel(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_shovel", TSECreativeTabs.tabTools, 6);
		brightsteelHoe = registerHoe(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_hoe", TSECreativeTabs.tabTools, 6);
		
		//Others
		woodMattock = registerMattock(-3.0F, ToolMaterial.WOOD, "wood_mattock", TSECreativeTabs.tabTools, 0);
		stoneMattock = registerMattock(-2.5F, ToolMaterial.STONE, "stone_mattock", TSECreativeTabs.tabTools, 1);
		ironMattock = registerMattock(-2.2F, ToolMaterial.IRON, "iron_mattock", TSECreativeTabs.tabTools, 2);
		diamondMattock = registerMattock(-2.0F, ToolMaterial.DIAMOND, "diamond_mattock", TSECreativeTabs.tabTools, 3);
		goldMattock = registerMattock(1.0F, ToolMaterial.GOLD, "gold_mattock", TSECreativeTabs.tabTools, 0);
		
		lapisRemover = registerRemover("lapis_remover", -3.0F, TSEToolMaterials.LAPIS, 1, TSECreativeTabs.tabTools);
		//Others
		
		//End Tools
		
		//Start Swords
		
		copperSword = registerSword(TSEToolMaterials.COPPER, "copper_sword", TSECreativeTabs.tabWeapons);
		bronzeSword = registerSword(TSEToolMaterials.BRONZE, "bronze_sword", TSECreativeTabs.tabWeapons);
		terraDiamondSword = registerSword(TSEToolMaterials.TDIAMOND, "terra_diamond_sword", TSECreativeTabs.tabWeapons);
		tyionetiumSword = registerSword(TSEToolMaterials.TYIONETIUM, "tyionetium_sword", TSECreativeTabs.tabWeapons);
		brightflameSword = registerSword(TSEToolMaterials.BRIGHTFLAME, "brightflame_sword", TSECreativeTabs.tabWeapons);
		brightsteelSword = registerSword(TSEToolMaterials.BRIGHTFLAME, "brightsteel_sword", TSECreativeTabs.tabWeapons);
		magicSword = registerSword(TSEToolMaterials.MAGIC, "magic_sword", TSECreativeTabs.tabWeapons);
		mithrilSword = registerSword(TSEToolMaterials.MITHRIL, "mithril_sword", TSECreativeTabs.tabWeapons);
		mortiumSword = registerSword(TSEToolMaterials.MORTIUM, "mortium_sword", TSECreativeTabs.tabWeapons);
		mysteriousSword = registerSword(TSEToolMaterials.MYSTERIOUS, "mysterious_sword", TSECreativeTabs.tabWeapons);
		mysticSword = registerSword(TSEToolMaterials.MYSTIC, "mystic_sword", TSECreativeTabs.tabWeapons);
		skyIronSword = registerSword(TSEToolMaterials.SKYIRON, "sky_iron_sword", TSECreativeTabs.tabWeapons);
		terriumSword = registerSword(TSEToolMaterials.TERRIUM, "terrium_sword", TSECreativeTabs.tabWeapons);
		vividiumSword = registerSword(TSEToolMaterials.VIVIDIUM, "vividium_sword", TSECreativeTabs.tabWeapons);
		
		justice = registerLightSword(ToolMaterial.DIAMOND, "justice", TSECreativeTabs.tabWeapons, true);
		corruption = registerLightSword(ToolMaterial.DIAMOND, "corruption", TSECreativeTabs.tabWeapons, false);
		
		//End Swords
		
		//Start Armor
		
		//Copper
		copperHelmet = registerArmor("copper_helmet", TSEArmorMaterials.COPPER, 1, EntityEquipmentSlot.HEAD);
		copperChestplate = registerArmor("copper_chestplate", TSEArmorMaterials.COPPER, 1, EntityEquipmentSlot.CHEST);
		copperLeggings = registerArmor("copper_leggings", TSEArmorMaterials.COPPER, 1, EntityEquipmentSlot.LEGS);
		copperBoots = registerArmor("copper_boots", TSEArmorMaterials.COPPER, 1, EntityEquipmentSlot.FEET);
		//Copper
		
		bronzeHelmet = registerArmor("bronze_helmet", TSEArmorMaterials.BRONZE, 1, EntityEquipmentSlot.HEAD);
		bronzeChestplate = registerArmor("bronze_chestplate", TSEArmorMaterials.BRONZE, 1, EntityEquipmentSlot.CHEST);
		bronzeLeggings = registerArmor("bronze_leggings", TSEArmorMaterials.BRONZE, 1, EntityEquipmentSlot.LEGS);
		bronzeBoots = registerArmor("bronze_boots", TSEArmorMaterials.BRONZE, 1, EntityEquipmentSlot.FEET);
		
		//Terra Diamond
		terraDiamondHelmet = registerArmor("terra_diamond_helmet", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.HEAD);
		terraDiamondChestplate = registerArmor("terra_diamond_chestplate", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.CHEST);
		terraDiamondLeggings = registerArmor("terra_diamond_leggings", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.LEGS);
		terraDiamondBoots = registerArmor("terra_diamond_boots", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.FEET);
		//Terra Diamond
		
		brightflameHelmet = registerArmor("brightflame_helmet", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.HEAD);
		brightflameChestplate = registerArmor("brightflame_chestplate", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.CHEST);
		brightflameLeggings = registerArmor("brightflame_leggings", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.LEGS);
		brightflameBoots = registerArmor("brightflame_boots", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.FEET);
		
		brightsteelHelmet = registerArmor("brightsteel_helmet", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.HEAD);
		brightsteelChestplate = registerArmor("brightsteel_chestplate", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.CHEST);
		brightsteelLeggings = registerArmor("brightsteel_leggings", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.LEGS);
		brightsteelBoots = registerArmor("brightsteel_boots", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.FEET);
		
		tinHelmet = registerArmor("tin_helmet", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.HEAD);
		tinChestplate = registerArmor("tin_chestplate", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.CHEST);
		tinLeggings = registerArmor("tin_leggings", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.LEGS);
		tinBoots = registerArmor("tin_boots", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.FEET);
		
		magicHelmet = registerArmor("magic_helmet", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.HEAD);
		magicChestplate = registerArmor("magic_chestplate", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.CHEST);
		magicLeggings = registerArmor("magic_leggings", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.LEGS);
		magicBoots = registerArmor("magic_boots", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.FEET);
		
		mithrilHelmet = registerArmor("mithril_helmet", TSEArmorMaterials.MITHRIL, 1, EntityEquipmentSlot.HEAD);
		mithrilChestplate = registerArmor("mithril_chestplate", TSEArmorMaterials.MITHRIL, 1, EntityEquipmentSlot.CHEST);
		mithrilLeggings = registerArmor("mithril_leggings", TSEArmorMaterials.MITHRIL, 1, EntityEquipmentSlot.LEGS);
		mithrilBoots = registerArmor("mithril_boots", TSEArmorMaterials.MITHRIL, 1, EntityEquipmentSlot.FEET);
		
		mortiumHelmet = registerArmor("mortium_helmet", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.HEAD);
		mortiumChestplate = registerArmor("mortium_chestplate", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.CHEST);
		mortiumLeggings = registerArmor("mortium_leggings", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.LEGS);
		mortiumBoots = registerArmor("mortium_boots", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.FEET);
		//End Armor
	}
	
}
