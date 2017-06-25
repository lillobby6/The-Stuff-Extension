package com.tse.item;

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.item.materials.TSEArmorMaterials;
import com.tse.item.materials.TSEToolMaterials;
import com.tse.main.core.TheStuffExtension;
import com.tse.main.lib.StringsLib;

import jline.internal.Log;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemManager {

	public static Item goldenStick = new TSEItem("golden_stick").setRegistryName("golden_stick");
	public static Item diamondStick = registerMainItem("diamond_stick", TSECreativeTabs.tabMaterials);
	public static Item mysticStick = registerMainItem("mystic_stick", TSECreativeTabs.tabMaterials);

	public static Item ironRod = registerMainItem("iron_rod", TSECreativeTabs.tabMaterials);
	public static Item steelRod = registerMainItem("steel_rod", TSECreativeTabs.tabMaterials);
	public static Item bronzeRod = registerMainItem("bronze_rod", TSECreativeTabs.tabMaterials);
	public static Item brassRod = registerMainItem("brass_rod", TSECreativeTabs.tabMaterials);
	public static Item titaniumRod = registerMainItem("titanium_rod", TSECreativeTabs.tabMaterials);

	public static Item exaltedDiamond = registerMainItem("exalted_diamond", TSECreativeTabs.tabMaterials);
	public static Item bloodDiamond = registerMainItem("blood_diamond", TSECreativeTabs.tabMaterials);
	public static Item terraDiamond = registerMainItem("terra_diamond", TSECreativeTabs.tabMaterials);
	public static Item lunaDiamond = registerMainItem("luna_diamond", TSECreativeTabs.tabMaterials);

	public static Item sphaleriteGem = registerMainItem("sphalerite_gem", TSECreativeTabs.tabMaterials);

	public static Item copperIngot = registerMainItem("copper_ingot", TSECreativeTabs.tabMaterials);
	public static Item steelIngot = registerMainItem("steel_ingot", TSECreativeTabs.tabMaterials);
	public static Item tinIngot = registerMainItem("tin_ingot", TSECreativeTabs.tabMaterials);
	public static Item tyionetiumIngot = registerMainItem("tyionetium_ingot", TSECreativeTabs.tabMaterials);
	public static Item bronzeIngot = registerMainItem("bronze_ingot", TSECreativeTabs.tabMaterials);
	public static Item brightflameIngot = registerMainItem("brightflame_ingot", TSECreativeTabs.tabMaterials);
	public static Item brightsteelIngot = registerMainItem("brightsteel_ingot", TSECreativeTabs.tabMaterials);
	public static Item diamondIngot = registerMainItem("diamond_ingot", TSECreativeTabs.tabMaterials);
	public static Item reforgedGoldIngot = registerMainItem("reforged_gold_ingot", TSECreativeTabs.tabMaterials);
	public static Item magicIngot = registerMainItem("magic_ingot", TSECreativeTabs.tabMaterials);
	public static Item mithrilIngot = registerMainItem("mithril_ingot", TSECreativeTabs.tabMaterials);
	public static Item mortiumIngot = registerMainItem("mortium_ingot", TSECreativeTabs.tabMaterials);
	public static Item mysteriousIngot = registerMainItem("mysterious_ingot", TSECreativeTabs.tabMaterials);
	public static Item mysticIngot = registerMainItem("mystic_ingot", TSECreativeTabs.tabMaterials);
	public static Item skyIronIngot = registerMainItem("sky_iron_ingot", TSECreativeTabs.tabMaterials);
	public static Item terriumIngot = registerMainItem("terrium_ingot", TSECreativeTabs.tabMaterials);
	public static Item toslotriumIngot = registerMainItem("toslotrium_ingot", TSECreativeTabs.tabMaterials);
	public static Item vividiumIngot = registerMainItem("vividium_ingot", TSECreativeTabs.tabMaterials);
	public static Item extranetiumIngot = registerMainItem("extranetium_ingot", TSECreativeTabs.tabMaterials);
	public static Item silverIngot = registerMainItem("silver_ingot", TSECreativeTabs.tabMaterials);
	public static Item platinumIngot = registerMainItem("platinum_ingot", TSECreativeTabs.tabMaterials);
	public static Item titaniumIngot = registerMainItem("titanium_ingot", TSECreativeTabs.tabMaterials);
	public static Item zincIngot = registerMainItem("zinc_ingot", TSECreativeTabs.tabMaterials);
	public static Item brassIngot = registerMainItem("brass_ingot", TSECreativeTabs.tabMaterials);
	public static Item leadIngot = registerMainItem("lead_ingot", TSECreativeTabs.tabMaterials);
	public static Item nickelIngot = registerMainItem("nickel_ingot", TSECreativeTabs.tabMaterials);
	public static Item pewterIngot = registerMainItem("pewter_ingot", TSECreativeTabs.tabMaterials);
	public static Item aluminumIngot = registerMainItem("aluminum_ingot", TSECreativeTabs.tabMaterials);

	public static Item magicNugget = registerMainItem("magic_nugget", TSECreativeTabs.tabMaterials);
	public static Item mysticNugget = registerMainItem("mystic_nugget", TSECreativeTabs.tabMaterials);
	public static Item mysteriousNugget = registerMainItem("mysterious_nugget", TSECreativeTabs.tabMaterials);
	public static Item brightflameNugget = registerMainItem("brightflame_nugget", TSECreativeTabs.tabMaterials);
	public static Item diamondNugget = registerMainItem("diamond_nugget", TSECreativeTabs.tabMaterials);
	public static Item bronzeNugget = registerMainItem("bronze_nugget", TSECreativeTabs.tabMaterials);
	public static Item brassNugget = registerMainItem("brass_nugget", TSECreativeTabs.tabMaterials);
	public static Item silverNugget = registerMainItem("silver_nugget", TSECreativeTabs.tabMaterials);
	public static Item platinumNugget = registerMainItem("platinum_nugget", TSECreativeTabs.tabMaterials);
	public static Item titaniumNugget = registerMainItem("titanium_nugget", TSECreativeTabs.tabMaterials);
	public static Item steelNugget = registerMainItem("steel_nugget", TSECreativeTabs.tabMaterials);

	public static Item diamondToslotriumMixedIngot = registerMainItem("diamond_toslotrium_mixed_ingot",
			TSECreativeTabs.tabMaterials);
	public static Item mixedIngot = registerMainItem("mixed_ingot", TSECreativeTabs.tabMaterials);
	public static Item tyionetiumMithrilToslotriumMixedIngot = registerMainItem(
			"tyionetium_mithril_toslotrium_mixed_ingot", TSECreativeTabs.tabMaterials);
	public static Item reforgedGoldTyionetiumMixedIngot = registerMainItem("reforged_gold_tyionetium_mixed_ingot",
			TSECreativeTabs.tabMaterials);
	public static Item titaniumMysticMixedIngot = registerMainItem("titanium_mystic_mixed_ingot",
			TSECreativeTabs.tabMaterials);
	// End Materials

	// Start Tools
	// Copper
	public static Item copperPickaxe = registerPickaxe(TSEToolMaterials.COPPER, "copper_pickaxe",
			TSECreativeTabs.tabTools, 2);
	public static Item copperAxe = registerAxe(TSEToolMaterials.COPPER, "copper_axe", TSECreativeTabs.tabTools, 2, 1F,
			5.0F);
	public static Item copperMattock = registerMattock(-2.2F, TSEToolMaterials.COPPER, "copper_mattock",
			TSECreativeTabs.tabTools, 2);
	public static Item copperShovel = registerShovel(TSEToolMaterials.COPPER, "copper_shovel", TSECreativeTabs.tabTools,
			2);
	public static Item copperHoe = registerHoe(TSEToolMaterials.COPPER, "copper_hoe", TSECreativeTabs.tabTools, 2);
	// Copper

	public static Item bronzePickaxe = registerPickaxe(TSEToolMaterials.BRONZE, "bronze_pickaxe",
			TSECreativeTabs.tabTools, 3);
	public static Item bronzeAxe = registerAxe(TSEToolMaterials.BRONZE, "bronze_axe", TSECreativeTabs.tabTools, 3, 1F,
			4.0F);
	public static Item bronzeMattock = registerMattock(-2.2F, TSEToolMaterials.BRONZE, "bronze_mattock",
			TSECreativeTabs.tabTools, 3);
	public static Item bronzeShovel = registerShovel(TSEToolMaterials.BRONZE, "bronze_shovel", TSECreativeTabs.tabTools,
			3);
	public static Item bronzeHoe = registerHoe(TSEToolMaterials.BRONZE, "bronze_hoe", TSECreativeTabs.tabTools, 3);

	public static Item magicPickaxe = registerPickaxe(TSEToolMaterials.MAGIC, "magic_pickaxe", TSECreativeTabs.tabTools,
			6);
	public static Item magicAxe = registerAxe(TSEToolMaterials.MITHRIL, "magic_axe", TSECreativeTabs.tabTools, 6, 1F,
			10.0F);
	public static Item magicMattock = registerMattock(-2.2F, TSEToolMaterials.MAGIC, "magic_mattock",
			TSECreativeTabs.tabTools, 6);
	public static Item magicShovel = registerShovel(TSEToolMaterials.MAGIC, "magic_shovel", TSECreativeTabs.tabTools,
			6);
	public static Item magicHoe = registerHoe(TSEToolMaterials.MAGIC, "magic_hoe", TSECreativeTabs.tabTools, 6);

	public static Item mithrilPickaxe = registerPickaxe(TSEToolMaterials.MITHRIL, "mithril_pickaxe",
			TSECreativeTabs.tabTools, 7);
	public static Item mithrilAxe = registerAxe(TSEToolMaterials.MITHRIL, "mithril_axe", TSECreativeTabs.tabTools, 7,
			1F, 15.0F);
	public static Item mithrilMattock = registerMattock(-2.2F, TSEToolMaterials.MITHRIL, "mithril_mattock",
			TSECreativeTabs.tabTools, 7);
	public static Item mithrilShovel = registerShovel(TSEToolMaterials.MITHRIL, "mithril_shovel",
			TSECreativeTabs.tabTools, 7);
	public static Item mithrilHoe = registerHoe(TSEToolMaterials.MITHRIL, "mithril_hoe", TSECreativeTabs.tabTools, 7);

	public static Item mortiumPickaxe = registerPickaxe(TSEToolMaterials.MORTIUM, "mortium_pickaxe",
			TSECreativeTabs.tabTools, 4);
	public static Item mortiumAxe = registerAxe(TSEToolMaterials.MORTIUM, "mortium_axe", TSECreativeTabs.tabTools, 4,
			1F, 4.0F);
	public static Item mortiumMattock = registerMattock(-2.2F, TSEToolMaterials.MORTIUM, "mortium_mattock",
			TSECreativeTabs.tabTools, 4);
	public static Item mortiumShovel = registerShovel(TSEToolMaterials.MORTIUM, "mortium_shovel",
			TSECreativeTabs.tabTools, 4);
	public static Item mortiumHoe = registerHoe(TSEToolMaterials.MORTIUM, "mortium_hoe", TSECreativeTabs.tabTools, 4);

	public static Item mysteriousPickaxe = registerPickaxe(TSEToolMaterials.MYSTERIOUS, "mysterious_pickaxe",
			TSECreativeTabs.tabTools, 6);
	public static Item mysteriousAxe = registerAxe(TSEToolMaterials.MYSTERIOUS, "mysterious_axe",
			TSECreativeTabs.tabTools, 6, 1F, 11F);
	public static Item mysteriousMattock = registerMattock(-2.2F, TSEToolMaterials.MYSTERIOUS, "mysterious_mattock",
			TSECreativeTabs.tabTools, 6);
	public static Item mysteriousShovel = registerShovel(TSEToolMaterials.MYSTERIOUS, "mysterious_shovel",
			TSECreativeTabs.tabTools, 6);
	public static Item mysteriousHoe = registerHoe(TSEToolMaterials.MYSTERIOUS, "mysterious_hoe",
			TSECreativeTabs.tabTools, 6);

	public static Item mysticPickaxe = registerPickaxe(TSEToolMaterials.MYSTIC, "mystic_pickaxe",
			TSECreativeTabs.tabTools, 5);
	public static Item mysticAxe = registerAxe(TSEToolMaterials.MYSTIC, "mystic_axe", TSECreativeTabs.tabTools, 5, 1F,
			7F);
	public static Item mysticMattock = registerMattock(-2.2F, TSEToolMaterials.MYSTIC, "mystic_mattock",
			TSECreativeTabs.tabTools, 5);
	public static Item mysticShovel = registerShovel(TSEToolMaterials.MYSTIC, "mystic_shovel", TSECreativeTabs.tabTools,
			5);
	public static Item mysticHoe = registerHoe(TSEToolMaterials.MYSTIC, "mystic_hoe", TSECreativeTabs.tabTools, 5);

	public static Item skyIronPickaxe = registerPickaxe(TSEToolMaterials.SKYIRON, "sky_iron_pickaxe",
			TSECreativeTabs.tabTools, 2);
	public static Item skyIronAxe = registerAxe(TSEToolMaterials.SKYIRON, "sky_iron_axe", TSECreativeTabs.tabTools, 2,
			1F, 2F);
	public static Item skyIronMattock = registerMattock(-2.2F, TSEToolMaterials.SKYIRON, "sky_iron_mattock",
			TSECreativeTabs.tabTools, 2);
	public static Item skyIronShovel = registerShovel(TSEToolMaterials.SKYIRON, "sky_iron_shovel",
			TSECreativeTabs.tabTools, 2);
	public static Item skyIronHoe = registerHoe(TSEToolMaterials.SKYIRON, "sky_iron_hoe", TSECreativeTabs.tabTools, 2);

	public static Item terriumPickaxe = registerPickaxe(TSEToolMaterials.TERRIUM, "terrium_pickaxe",
			TSECreativeTabs.tabTools, 5);
	public static Item terriumAxe = registerAxe(TSEToolMaterials.TERRIUM, "terrium_axe", TSECreativeTabs.tabTools, 5,
			1F, 4.0F);
	public static Item terriumMattock = registerMattock(-2.2F, TSEToolMaterials.TERRIUM, "terrium_mattock",
			TSECreativeTabs.tabTools, 5);
	public static Item terriumShovel = registerShovel(TSEToolMaterials.TERRIUM, "terrium_shovel",
			TSECreativeTabs.tabTools, 5);
	public static Item terriumHoe = registerHoe(TSEToolMaterials.TERRIUM, "terrium_hoe", TSECreativeTabs.tabTools, 5);

	public static Item vividiumPickaxe = registerPickaxe(TSEToolMaterials.VIVIDIUM, "vividium_pickaxe",
			TSECreativeTabs.tabTools, 4);
	public static Item vividiumAxe = registerAxe(TSEToolMaterials.VIVIDIUM, "vividium_axe", TSECreativeTabs.tabTools, 4,
			1F, 4F);
	public static Item vividiumMattock = registerMattock(-2.2F, TSEToolMaterials.VIVIDIUM, "vividium_mattock",
			TSECreativeTabs.tabTools, 4);
	public static Item vividiumShovel = registerShovel(TSEToolMaterials.VIVIDIUM, "vividium_shovel",
			TSECreativeTabs.tabTools, 4);
	public static Item vividiumHoe = registerHoe(TSEToolMaterials.VIVIDIUM, "vividium_hoe", TSECreativeTabs.tabTools,
			4);

	// Terra Diamond
	public static Item terraDiamondPickaxe = registerPickaxe(TSEToolMaterials.TDIAMOND, "terra_diamond_pickaxe",
			TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondAxe = registerAxe(TSEToolMaterials.TDIAMOND, "terra_diamond_axe",
			TSECreativeTabs.tabTools, 4, 1F, 5F);
	public static Item terraDiamondMattock = registerMattock(-2.0F, TSEToolMaterials.TDIAMOND, "terra_diamond_mattock",
			TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondShovel = registerShovel(TSEToolMaterials.TDIAMOND, "terra_diamond_shovel",
			TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondHoe = registerHoe(TSEToolMaterials.TDIAMOND, "terra_diamond_hoe",
			TSECreativeTabs.tabTools, 4);
	// Terra Diamond

	public static Item tyionetiumPickaxe = registerPickaxe(TSEToolMaterials.TYIONETIUM, "tyionetium_pickaxe",
			TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumAxe = registerAxe(TSEToolMaterials.TYIONETIUM, "tyionetium_axe",
			TSECreativeTabs.tabTools, 5, 1F, 7F);
	public static Item tyionetiumMattock = registerMattock(-2.2F, TSEToolMaterials.TYIONETIUM, "tyionetium_mattock",
			TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumShovel = registerShovel(TSEToolMaterials.TYIONETIUM, "tyionetium_shovel",
			TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumHoe = registerHoe(TSEToolMaterials.TYIONETIUM, "tyionetium_hoe",
			TSECreativeTabs.tabTools, 5);

	public static Item brightflamePickaxe = registerPickaxe(TSEToolMaterials.BRIGHTFLAME, "brightflame_pickaxe",
			TSECreativeTabs.tabTools, 6);
	public static Item brightflameAxe = registerAxe(ToolMaterial.DIAMOND, "brightflame_axe", TSECreativeTabs.tabTools,
			6, 1F, 9F);
	public static Item brightflameMattock = registerMattock(-2.2F, TSEToolMaterials.BRIGHTFLAME, "brightflame_mattock",
			TSECreativeTabs.tabTools, 6);
	public static Item brightflameShovel = registerShovel(TSEToolMaterials.BRIGHTFLAME, "brightflame_shovel",
			TSECreativeTabs.tabTools, 6);
	public static Item brightflameHoe = registerHoe(TSEToolMaterials.BRIGHTFLAME, "brightflame_hoe",
			TSECreativeTabs.tabTools, 6);

	public static Item brightsteelPickaxe = registerPickaxe(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_pickaxe",
			TSECreativeTabs.tabTools, 6);
	public static Item brightsteelAxe = registerAxe(ToolMaterial.DIAMOND, "brightsteel_axe", TSECreativeTabs.tabTools,
			6, 1F, 4F);
	public static Item brightsteelMattock = registerMattock(-2.2F, TSEToolMaterials.BRIGHTSTEEL, "brightsteel_mattock",
			TSECreativeTabs.tabTools, 6);
	public static Item brightsteelShovel = registerShovel(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_shovel",
			TSECreativeTabs.tabTools, 6);
	public static Item brightsteelHoe = registerHoe(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_hoe",
			TSECreativeTabs.tabTools, 6);

	// Others
	public static Item woodMattock = registerMattock(-3.0F, ToolMaterial.WOOD, "wood_mattock", TSECreativeTabs.tabTools,
			0);
	public static Item stoneMattock = registerMattock(-2.5F, ToolMaterial.STONE, "stone_mattock",
			TSECreativeTabs.tabTools, 1);
	public static Item ironMattock = registerMattock(-2.2F, ToolMaterial.IRON, "iron_mattock", TSECreativeTabs.tabTools,
			2);
	public static Item diamondMattock = registerMattock(-2.0F, ToolMaterial.DIAMOND, "diamond_mattock",
			TSECreativeTabs.tabTools, 3);
	public static Item goldMattock = registerMattock(1.0F, ToolMaterial.GOLD, "gold_mattock", TSECreativeTabs.tabTools,
			0);

	public static Item lapisRemover = registerRemover("lapis_remover", -3.0F, TSEToolMaterials.LAPIS, 1,
			TSECreativeTabs.tabTools);
	// Others

	// End Tools

	// Start Swords

	public static Item copperSword = registerSword(TSEToolMaterials.COPPER, "copper_sword", TSECreativeTabs.tabWeapons);
	public static Item bronzeSword = registerSword(TSEToolMaterials.BRONZE, "bronze_sword", TSECreativeTabs.tabWeapons);
	public static Item terraDiamondSword = registerSword(TSEToolMaterials.TDIAMOND, "terra_diamond_sword",
			TSECreativeTabs.tabWeapons);
	public static Item tyionetiumSword = registerSword(TSEToolMaterials.TYIONETIUM, "tyionetium_sword",
			TSECreativeTabs.tabWeapons);
	public static Item brightflameSword = registerSword(TSEToolMaterials.BRIGHTFLAME, "brightflame_sword",
			TSECreativeTabs.tabWeapons);
	public static Item brightsteelSword = registerSword(TSEToolMaterials.BRIGHTFLAME, "brightsteel_sword",
			TSECreativeTabs.tabWeapons);
	public static Item magicSword = registerSword(TSEToolMaterials.MAGIC, "magic_sword", TSECreativeTabs.tabWeapons);
	public static Item mithrilSword = registerSword(TSEToolMaterials.MITHRIL, "mithril_sword",
			TSECreativeTabs.tabWeapons);
	public static Item mortiumSword = registerSword(TSEToolMaterials.MORTIUM, "mortium_sword",
			TSECreativeTabs.tabWeapons);
	public static Item mysteriousSword = registerSword(TSEToolMaterials.MYSTERIOUS, "mysterious_sword",
			TSECreativeTabs.tabWeapons);
	public static Item mysticSword = registerSword(TSEToolMaterials.MYSTIC, "mystic_sword", TSECreativeTabs.tabWeapons);
	public static Item skyIronSword = registerSword(TSEToolMaterials.SKYIRON, "sky_iron_sword",
			TSECreativeTabs.tabWeapons);
	public static Item terriumSword = registerSword(TSEToolMaterials.TERRIUM, "terrium_sword",
			TSECreativeTabs.tabWeapons);
	public static Item vividiumSword = registerSword(TSEToolMaterials.VIVIDIUM, "vividium_sword",
			TSECreativeTabs.tabWeapons);

	public static Item justice = registerLightSword(ToolMaterial.DIAMOND, "justice", TSECreativeTabs.tabWeapons, true);
	public static Item corruption = registerLightSword(ToolMaterial.DIAMOND, "corruption", TSECreativeTabs.tabWeapons,
			false);

	// End Swords

	// Start Armor

	// Copper
	public static Item copperHelmet = registerArmor("copper_helmet", TSEArmorMaterials.COPPER, 1,
			EntityEquipmentSlot.HEAD);
	public static Item copperChestplate = registerArmor("copper_chestplate", TSEArmorMaterials.COPPER, 1,
			EntityEquipmentSlot.CHEST);
	public static Item copperLeggings = registerArmor("copper_leggings", TSEArmorMaterials.COPPER, 1,
			EntityEquipmentSlot.LEGS);
	public static Item copperBoots = registerArmor("copper_boots", TSEArmorMaterials.COPPER, 1,
			EntityEquipmentSlot.FEET);
	// Copper

	public static Item bronzeHelmet = registerArmor("bronze_helmet", TSEArmorMaterials.BRONZE, 1,
			EntityEquipmentSlot.HEAD);
	public static Item bronzeChestplate = registerArmor("bronze_chestplate", TSEArmorMaterials.BRONZE, 1,
			EntityEquipmentSlot.CHEST);
	public static Item bronzeLeggings = registerArmor("bronze_leggings", TSEArmorMaterials.BRONZE, 1,
			EntityEquipmentSlot.LEGS);
	public static Item bronzeBoots = registerArmor("bronze_boots", TSEArmorMaterials.BRONZE, 1,
			EntityEquipmentSlot.FEET);

	// Terra Diamond
	public static Item terraDiamondHelmet = registerArmor("terra_diamond_helmet", TSEArmorMaterials.TERRADIAMOND, 1,
			EntityEquipmentSlot.HEAD);
	public static Item terraDiamondChestplate = registerArmor("terra_diamond_chestplate",
			TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static Item terraDiamondLeggings = registerArmor("terra_diamond_leggings", TSEArmorMaterials.TERRADIAMOND, 1,
			EntityEquipmentSlot.LEGS);
	public static Item terraDiamondBoots = registerArmor("terra_diamond_boots", TSEArmorMaterials.TERRADIAMOND, 1,
			EntityEquipmentSlot.FEET);
	// Terra Diamond

	public static Item brightflameHelmet = registerArmor("brightflame_helmet", TSEArmorMaterials.BRIGHTFLAME, 1,
			EntityEquipmentSlot.HEAD);
	public static Item brightflameChestplate = registerArmor("brightflame_chestplate", TSEArmorMaterials.BRIGHTFLAME, 1,
			EntityEquipmentSlot.CHEST);
	public static Item brightflameLeggings = registerArmor("brightflame_leggings", TSEArmorMaterials.BRIGHTFLAME, 1,
			EntityEquipmentSlot.LEGS);
	public static Item brightflameBoots = registerArmor("brightflame_boots", TSEArmorMaterials.BRIGHTFLAME, 1,
			EntityEquipmentSlot.FEET);

	public static Item brightsteelHelmet = registerArmor("brightsteel_helmet", TSEArmorMaterials.BRIGHTSTEEL, 1,
			EntityEquipmentSlot.HEAD);
	public static Item brightsteelChestplate = registerArmor("brightsteel_chestplate", TSEArmorMaterials.BRIGHTSTEEL, 1,
			EntityEquipmentSlot.CHEST);
	public static Item brightsteelLeggings = registerArmor("brightsteel_leggings", TSEArmorMaterials.BRIGHTSTEEL, 1,
			EntityEquipmentSlot.LEGS);
	public static Item brightsteelBoots = registerArmor("brightsteel_boots", TSEArmorMaterials.BRIGHTSTEEL, 1,
			EntityEquipmentSlot.FEET);

	public static Item tinHelmet = registerArmor("tin_helmet", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.HEAD);
	public static Item tinChestplate = registerArmor("tin_chestplate", TSEArmorMaterials.TIN, 1,
			EntityEquipmentSlot.CHEST);
	public static Item tinLeggings = registerArmor("tin_leggings", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.LEGS);
	public static Item tinBoots = registerArmor("tin_boots", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.FEET);

	public static Item magicHelmet = registerArmor("magic_helmet", TSEArmorMaterials.MAGIC, 1,
			EntityEquipmentSlot.HEAD);
	public static Item magicChestplate = registerArmor("magic_chestplate", TSEArmorMaterials.MAGIC, 1,
			EntityEquipmentSlot.CHEST);
	public static Item magicLeggings = registerArmor("magic_leggings", TSEArmorMaterials.MAGIC, 1,
			EntityEquipmentSlot.LEGS);
	public static Item magicBoots = registerArmor("magic_boots", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.FEET);

	public static Item mithrilHelmet = registerArmor("mithril_helmet", TSEArmorMaterials.MITHRIL, 1,
			EntityEquipmentSlot.HEAD);
	public static Item mithrilChestplate = registerArmor("mithril_chestplate", TSEArmorMaterials.MITHRIL, 1,
			EntityEquipmentSlot.CHEST);
	public static Item mithrilLeggings = registerArmor("mithril_leggings", TSEArmorMaterials.MITHRIL, 1,
			EntityEquipmentSlot.LEGS);
	public static Item mithrilBoots = registerArmor("mithril_boots", TSEArmorMaterials.MITHRIL, 1,
			EntityEquipmentSlot.FEET);

	public static Item mortiumHelmet = registerArmor("mortium_helmet", TSEArmorMaterials.MORTIUM, 1,
			EntityEquipmentSlot.HEAD);
	public static Item mortiumChestplate = registerArmor("mortium_chestplate", TSEArmorMaterials.MORTIUM, 1,
			EntityEquipmentSlot.CHEST);
	public static Item mortiumLeggings = registerArmor("mortium_leggings", TSEArmorMaterials.MORTIUM, 1,
			EntityEquipmentSlot.LEGS);
	public static Item mortiumBoots = registerArmor("mortium_boots", TSEArmorMaterials.MORTIUM, 1,
			EntityEquipmentSlot.FEET);

	private static void registerItem(Item item, String registryName) {
		item.setRegistryName(StringsLib.MODID, registryName);
		item.setUnlocalizedName(registryName);

		// return GameRegistry.register(item);
	}

	public static Item registerMainItem(String registryName, CreativeTabs tab) {
		final Item item = new Item();
		item.setCreativeTab(tab);

		registerItem(item, registryName);
		return item;
	}

	public static Item registerSword(ToolMaterial mat, String registryName, CreativeTabs tab) {
		final Item item = new TSESword(mat, tab, registryName);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerLightSword(ToolMaterial mat, String registryName, CreativeTabs tab, boolean hasFlames) {
		final Item item = new LightningSword(mat, tab, registryName, hasFlames);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerPickaxe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel) {
		final Item item = new TSEPickaxe(mat, tab, harvestLevel, registryName);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerAxe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel,
			float attackSpeed, float damage) {
		final Item item = new TSEAxe(mat, attackSpeed, damage, tab, harvestLevel, registryName);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerMattock(float attackSpeed, ToolMaterial mat, String registryName, CreativeTabs tab,
			int harvestLevel) {
		final Item item = new TSEMattock(attackSpeed, mat, harvestLevel, registryName, tab);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerRemover(String registryName, float attackSpeed, ToolMaterial mat, int harvestLevel,
			CreativeTabs tab) {
		final Item item = new TSERemover(mat, tab, registryName, harvestLevel, attackSpeed);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerShovel(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel) {
		final Item item = new TSESpade(mat, harvestLevel, tab, registryName);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerHoe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel) {
		final Item item = new TSEHoe(mat, tab, harvestLevel, registryName);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerArmor(String registryName, ArmorMaterial mat, int renderIndex,
			EntityEquipmentSlot equipSlot) {
		final Item item = new TSEArmor(registryName, mat, renderIndex, equipSlot);
		registerItem(item, registryName);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		TheStuffExtension.log("Registering Items...");
		registry.registerAll(goldenStick, diamondStick, mysticStick,

				ironRod, steelRod, bronzeRod, brassRod, titaniumRod,

				exaltedDiamond, bloodDiamond, terraDiamond, lunaDiamond,

				sphaleriteGem,

				copperIngot, steelIngot, tinIngot, tyionetiumIngot, bronzeIngot, brightflameIngot, brightsteelIngot,
				diamondIngot, reforgedGoldIngot, magicIngot, mithrilIngot, mortiumIngot, mysteriousIngot, mysticIngot,
				skyIronIngot, terriumIngot, toslotriumIngot, vividiumIngot, extranetiumIngot, silverIngot,
				platinumIngot, titaniumIngot, zincIngot, brassIngot, leadIngot, nickelIngot, pewterIngot, aluminumIngot,

				magicNugget, mysticNugget, mysteriousNugget, brightflameNugget, diamondNugget, bronzeNugget,
				brassNugget, silverNugget, platinumNugget, titaniumNugget, steelNugget,

				diamondToslotriumMixedIngot,

				tyionetiumMithrilToslotriumMixedIngot,

				mixedIngot,

				reforgedGoldTyionetiumMixedIngot,

				titaniumMysticMixedIngot,

				justice, corruption,

				bronzePickaxe, bronzeAxe, bronzeMattock, bronzeShovel, bronzeHoe, bronzeSword,

				copperPickaxe, copperAxe, copperShovel, copperHoe, copperMattock, copperSword,

				brightflamePickaxe, brightflameAxe, brightflameShovel, brightflameHoe, brightflameMattock,
				brightflameSword,

				brightsteelPickaxe, brightsteelAxe, brightsteelShovel, brightsteelHoe, brightsteelMattock,
				brightsteelSword,

				magicPickaxe, magicAxe, magicShovel, magicHoe, magicMattock, magicSword,

				mithrilPickaxe, mithrilAxe, mithrilShovel, mithrilHoe, mithrilMattock, mithrilSword,

				/*
				 * extranetiumPickaxe, extranetiumAxe, extranetiumMattock,
				 * extranetiumShovel, extranetiumHoe, extranetiumSword,
				 */

				mortiumPickaxe, mortiumAxe, mortiumHoe, mortiumShovel, mortiumMattock, mortiumSword,

				mysteriousPickaxe, mysteriousAxe, mysteriousHoe, mysteriousShovel, mysteriousMattock, mysteriousSword,

				mysticPickaxe, mysticAxe, mysticHoe, mysticShovel, mysticMattock, mysticSword,

				skyIronPickaxe, skyIronAxe, skyIronHoe, skyIronShovel, skyIronMattock, skyIronSword,

				terriumPickaxe, terriumAxe, terriumHoe, terriumShovel, terriumMattock, terriumSword,

				vividiumPickaxe, vividiumAxe, vividiumHoe, vividiumShovel, vividiumMattock, vividiumSword,

				woodMattock, stoneMattock, ironMattock, diamondMattock, goldMattock,

				lapisRemover,

				copperHelmet, copperChestplate, copperLeggings, copperBoots,

				terraDiamondPickaxe, terraDiamondAxe, terraDiamondShovel, terraDiamondHoe, terraDiamondMattock,
				terraDiamondSword,

				tyionetiumPickaxe, tyionetiumAxe, tyionetiumShovel, tyionetiumHoe, tyionetiumMattock, tyionetiumSword,

				/*
				 * exaltedDiamondPickaxe, exaltedDiamondAxe,
				 * exaltedDiamondShovel, exaltedDiamondHoe,
				 * exaltedDiamondMattock, exaltedDiamondSword,
				 */

				terraDiamondHelmet, terraDiamondChestplate, terraDiamondLeggings, terraDiamondBoots,

				brightflameHelmet, brightflameChestplate, brightflameLeggings, brightflameBoots,

				brightsteelHelmet, brightsteelChestplate, brightsteelLeggings, brightsteelBoots,

				bronzeHelmet, bronzeChestplate, bronzeLeggings, bronzeBoots,

				tinHelmet, tinChestplate, tinLeggings, tinBoots,

				magicHelmet, magicChestplate, magicLeggings, magicBoots,

				mithrilHelmet, mithrilChestplate, mithrilLeggings, mithrilBoots,

				mortiumHelmet, mortiumChestplate, mortiumLeggings, mortiumBoots);
		TheStuffExtension.log("Registered Items");
	}

}
