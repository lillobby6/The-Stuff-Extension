package com.tse.world.item;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.library.StringsLib;
import com.tse.world.item.materials.TSEArmorMaterials;
import com.tse.world.item.materials.TSEToolMaterials;

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
	
	public static Item diamondStick = registerMainItem("diamond_stick", TSECreativeTabs.tabMaterials);
	public static Item goldenStick = registerMainItem("golden_stick", TSECreativeTabs.tabMaterials);
	public static Item brightflameStick = registerMainItem("brightflame_stick", TSECreativeTabs.tabMaterials);
	public static Item brightsteelStick = registerMainItem("brightsteel_stick", TSECreativeTabs.tabMaterials);
	public static Item reforgedGoldStick = registerMainItem("reforged_gold_stick", TSECreativeTabs.tabMaterials);
	public static Item magicStick = registerMainItem("magic_stick", TSECreativeTabs.tabMaterials);
	public static Item mithrilStick = registerMainItem("mithril_stick", TSECreativeTabs.tabMaterials);
	public static Item mysteriousStick = registerMainItem("mysterious_stick", TSECreativeTabs.tabMaterials);
	public static Item mysticStick = registerMainItem("mystic_stick", TSECreativeTabs.tabMaterials);
	public static Item extranetiumStick = registerMainItem("extranetium_stick", TSECreativeTabs.tabMaterials);
	public static Item eterniumStick = registerMainItem("eternium_stick", TSECreativeTabs.tabMaterials);
	public static Item fantasiumStick = registerMainItem("fantasium_stick", TSECreativeTabs.tabMaterials);
	public static Item scorniumStick = registerMainItem("scornium_stick", TSECreativeTabs.tabMaterials);
	public static Item electrumStick = registerMainItem("electrum_stick", TSECreativeTabs.tabMaterials);
	public static Item laeniumStick = registerMainItem("laenium_stick", TSECreativeTabs.tabMaterials);
	public static Item magneiumStick = registerMainItem("magneium_stick", TSECreativeTabs.tabMaterials);
	public static Item sterlingSilverStick = registerMainItem("sterling_silver_stick", TSECreativeTabs.tabMaterials);
	public static Item roseGoldStick = registerMainItem("rose_gold_stick", TSECreativeTabs.tabMaterials);
	public static Item whiteGoldStick = registerMainItem("white_gold_stick", TSECreativeTabs.tabMaterials);
	public static Item spangoldStick = registerMainItem("spangold_stick", TSECreativeTabs.tabMaterials);
	public static Item maduumStick = registerMainItem("maduum_stick", TSECreativeTabs.tabMaterials);
	public static Item immortaliumStick = registerMainItem("immortalium_stick", TSECreativeTabs.tabMaterials);
	
	public static Item ironRod = registerMainItem("iron_rod", TSECreativeTabs.tabMaterials);
	public static Item copperRod = registerMainItem("copper_rod", TSECreativeTabs.tabMaterials);
	public static Item steelRod = registerMainItem("steel_rod", TSECreativeTabs.tabMaterials);
	public static Item tinRod = registerMainItem("tin_rod", TSECreativeTabs.tabMaterials);
	public static Item tyionetiumRod = registerMainItem("tyionetium_rod", TSECreativeTabs.tabMaterials);
	public static Item bronzeRod = registerMainItem("bronze_rod", TSECreativeTabs.tabMaterials);
	public static Item mortiumRod = registerMainItem("mortium_rod", TSECreativeTabs.tabMaterials);
	public static Item skyIronRod = registerMainItem("sky_iron_rod", TSECreativeTabs.tabMaterials);
	public static Item terriumRod = registerMainItem("terrium_rod", TSECreativeTabs.tabMaterials);
	public static Item toslotriumRod = registerMainItem("toslotrium_rod", TSECreativeTabs.tabMaterials);
	public static Item vividiumRod = registerMainItem("vividium_rod", TSECreativeTabs.tabMaterials);
	public static Item silverRod = registerMainItem("silver_rod", TSECreativeTabs.tabMaterials);
	public static Item platinumRod = registerMainItem("platinum_rod", TSECreativeTabs.tabMaterials);
	public static Item titaniumRod = registerMainItem("titanium_rod", TSECreativeTabs.tabMaterials);
	public static Item zincRod = registerMainItem("zinc_rod", TSECreativeTabs.tabMaterials);
	public static Item brassRod = registerMainItem("brass_rod", TSECreativeTabs.tabMaterials);
	public static Item leadRod = registerMainItem("lead_rod", TSECreativeTabs.tabMaterials);
	public static Item nickelRod = registerMainItem("nickel_rod", TSECreativeTabs.tabMaterials);
	public static Item pewterRod = registerMainItem("pewter_rod", TSECreativeTabs.tabMaterials);
	public static Item aluminumRod = registerMainItem("aluminum_rod", TSECreativeTabs.tabMaterials);
	public static Item mnemiumRod = registerMainItem("mnemium_rod", TSECreativeTabs.tabMaterials);
	public static Item meteoricIronRod = registerMainItem("meteoric_iron_rod", TSECreativeTabs.tabMaterials);
	
	public static Item unusableMaterial = registerMainItem("unusable_material", TSECreativeTabs.tabMaterials);

	public static Item meteoricIronShard = registerMainItem("meteoric_iron_shard", TSECreativeTabs.tabMaterials);
	
	public static Item exaltedDiamond = registerMainItem("exalted_diamond", TSECreativeTabs.tabMaterials);
	public static Item bloodDiamond = registerMainItem("blood_diamond", TSECreativeTabs.tabMaterials);
	public static Item terraDiamond = registerMainItem("terra_diamond", TSECreativeTabs.tabMaterials);
	public static Item lunaDiamond = registerMainItem("luna_diamond", TSECreativeTabs.tabMaterials);
	public static Item solDiamond = registerMainItem("sol_diamond", TSECreativeTabs.tabMaterials);
	
	public static Item sphaleriteGem = registerMainItem("sphalerite_gem", TSECreativeTabs.tabMaterials);
	
	public static Item diamondIngot = registerMainItem("diamond_ingot", TSECreativeTabs.tabMaterials);
	public static Item copperIngot = registerMainItem("copper_ingot", TSECreativeTabs.tabMaterials);
	public static Item steelIngot = registerMainItem("steel_ingot", TSECreativeTabs.tabMaterials);
	public static Item tinIngot = registerMainItem("tin_ingot", TSECreativeTabs.tabMaterials);
	public static Item tyionetiumIngot = registerMainItem("tyionetium_ingot", TSECreativeTabs.tabMaterials);
	public static Item bronzeIngot = registerMainItem("bronze_ingot", TSECreativeTabs.tabMaterials);
	public static Item brightflameIngot = registerMainItem("brightflame_ingot", TSECreativeTabs.tabMaterials);
	public static Item brightsteelIngot = registerMainItem("brightsteel_ingot", TSECreativeTabs.tabMaterials);
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
	public static Item mnemiumIngot = registerMainItem("mnemium_ingot", TSECreativeTabs.tabMaterials);
	public static Item eterniumIngot = registerMainItem("eternium_ingot", TSECreativeTabs.tabMaterials);
	public static Item fantasiumIngot = registerMainItem("fantasium_ingot", TSECreativeTabs.tabMaterials);
	public static Item scorniumIngot = registerMainItem("scornium_ingot", TSECreativeTabs.tabMaterials);
	public static Item electrumIngot = registerMainItem("electrum_ingot", TSECreativeTabs.tabMaterials);
	public static Item laeniumIngot = registerMainItem("laenium_ingot", TSECreativeTabs.tabMaterials);
	public static Item magneiumIngot = registerMainItem("magneium_ingot", TSECreativeTabs.tabMaterials);
	public static Item sterlingSilverIngot = registerMainItem("sterling_silver_ingot", TSECreativeTabs.tabMaterials);
	public static Item roseGoldIngot = registerMainItem("rose_gold_ingot", TSECreativeTabs.tabMaterials);
	public static Item whiteGoldIngot = registerMainItem("white_gold_ingot", TSECreativeTabs.tabMaterials);
	public static Item spangoldIngot = registerMainItem("spangold_ingot", TSECreativeTabs.tabMaterials);
	public static Item meteoricIronIngot = registerMainItem("meteoric_iron_ingot", TSECreativeTabs.tabMaterials);
	public static Item maduumIngot = registerMainItem("maduum_ingot", TSECreativeTabs.tabMaterials);
	public static Item immortaliumIngot = registerMainItem("immortalium_ingot", TSECreativeTabs.tabMaterials);
	
	public static Item diamondNugget = registerMainItem("diamond_nugget", TSECreativeTabs.tabMaterials);
	public static Item copperNugget = registerMainItem("copper_nugget", TSECreativeTabs.tabMaterials);
	public static Item steelNugget = registerMainItem("steel_nugget", TSECreativeTabs.tabMaterials);
	public static Item tinNugget = registerMainItem("tin_nugget", TSECreativeTabs.tabMaterials);
	public static Item tyionetiumNugget = registerMainItem("tyionetium_nugget", TSECreativeTabs.tabMaterials);
	public static Item bronzeNugget = registerMainItem("bronze_nugget", TSECreativeTabs.tabMaterials);
	public static Item brightflameNugget = registerMainItem("brightflame_nugget", TSECreativeTabs.tabMaterials);
	public static Item brightsteelNugget = registerMainItem("brightsteel_nugget", TSECreativeTabs.tabMaterials);
	public static Item reforgedGoldNugget = registerMainItem("reforged_gold_nugget", TSECreativeTabs.tabMaterials);
	public static Item magicNugget = registerMainItem("magic_nugget", TSECreativeTabs.tabMaterials);
	public static Item mithrilNugget = registerMainItem("mithril_nugget", TSECreativeTabs.tabMaterials);
	public static Item mortiumNugget = registerMainItem("mortium_nugget", TSECreativeTabs.tabMaterials);
	public static Item mysteriousNugget = registerMainItem("mysterious_nugget", TSECreativeTabs.tabMaterials);
	public static Item mysticNugget = registerMainItem("mystic_nugget", TSECreativeTabs.tabMaterials);
	public static Item skyIronNugget = registerMainItem("sky_iron_nugget", TSECreativeTabs.tabMaterials);
	public static Item terriumNugget = registerMainItem("terrium_nugget", TSECreativeTabs.tabMaterials);
	public static Item toslotriumNugget = registerMainItem("toslotrium_nugget", TSECreativeTabs.tabMaterials);
	public static Item vividiumNugget = registerMainItem("vividium_nugget", TSECreativeTabs.tabMaterials);
	public static Item extranetiumNugget = registerMainItem("extranetium_nugget", TSECreativeTabs.tabMaterials);
	public static Item silverNugget = registerMainItem("silver_nugget", TSECreativeTabs.tabMaterials);
	public static Item platinumNugget = registerMainItem("platinum_nugget", TSECreativeTabs.tabMaterials);
	public static Item titaniumNugget = registerMainItem("titanium_nugget", TSECreativeTabs.tabMaterials);
	public static Item zincNugget = registerMainItem("zinc_nugget", TSECreativeTabs.tabMaterials);
	public static Item brassNugget = registerMainItem("brass_nugget", TSECreativeTabs.tabMaterials);
	public static Item leadNugget = registerMainItem("lead_nugget", TSECreativeTabs.tabMaterials);
	public static Item nickelNugget = registerMainItem("nickel_nugget", TSECreativeTabs.tabMaterials);
	public static Item pewterNugget = registerMainItem("pewter_nugget", TSECreativeTabs.tabMaterials);
	public static Item aluminumNugget = registerMainItem("aluminum_nugget", TSECreativeTabs.tabMaterials);
	public static Item mnemiumNugget = registerMainItem("mnemium_nugget", TSECreativeTabs.tabMaterials);
	public static Item eterniumNugget = registerMainItem("eternium_nugget", TSECreativeTabs.tabMaterials);
	public static Item fantasiumNugget = registerMainItem("fantasium_nugget", TSECreativeTabs.tabMaterials);
	public static Item scorniumNugget = registerMainItem("scornium_nugget", TSECreativeTabs.tabMaterials);
	public static Item electrumNugget = registerMainItem("electrum_nugget", TSECreativeTabs.tabMaterials);
	public static Item laeniumNugget = registerMainItem("laenium_nugget", TSECreativeTabs.tabMaterials);
	public static Item magneiumNugget = registerMainItem("magneium_nugget", TSECreativeTabs.tabMaterials);
	public static Item sterlingSilverNugget = registerMainItem("sterling_silver_nugget", TSECreativeTabs.tabMaterials);
	public static Item roseGoldNugget = registerMainItem("rose_gold_nugget", TSECreativeTabs.tabMaterials);
	public static Item whiteGoldNugget = registerMainItem("white_gold_nugget", TSECreativeTabs.tabMaterials);
	public static Item spangoldNugget = registerMainItem("spangold_nugget", TSECreativeTabs.tabMaterials);
	public static Item meteoricIronNugget = registerMainItem("meteoric_iron_nugget", TSECreativeTabs.tabMaterials);
	public static Item maduumNugget = registerMainItem("maduum_nugget", TSECreativeTabs.tabMaterials);
	public static Item immortaliumNugget = registerMainItem("immortalium_nugget", TSECreativeTabs.tabMaterials);
	
	// End Materials

	// Start Tools
	// Copper
	public static Item copperPickaxe = registerPickaxe(TSEToolMaterials.COPPER, "copper_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item copperAxe = registerAxe(TSEToolMaterials.COPPER, "copper_axe", TSECreativeTabs.tabTools, 2, 1F, 5.0F);
	public static Item copperMattock = registerMattock(-2.2F, TSEToolMaterials.COPPER, "copper_mattock", TSECreativeTabs.tabTools, 2);
	public static Item copperShovel = registerShovel(TSEToolMaterials.COPPER, "copper_shovel", TSECreativeTabs.tabTools, 2);
	public static Item copperHoe = registerHoe(TSEToolMaterials.COPPER, "copper_hoe", TSECreativeTabs.tabTools, 2);
	// Copper

	public static Item bronzePickaxe = registerPickaxe(TSEToolMaterials.BRONZE, "bronze_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item bronzeAxe = registerAxe(TSEToolMaterials.BRONZE, "bronze_axe", TSECreativeTabs.tabTools, 3, 1F, 4.0F);
	public static Item bronzeMattock = registerMattock(-2.2F, TSEToolMaterials.BRONZE, "bronze_mattock", TSECreativeTabs.tabTools, 3);
	public static Item bronzeShovel = registerShovel(TSEToolMaterials.BRONZE, "bronze_shovel", TSECreativeTabs.tabTools, 3);
	public static Item bronzeHoe = registerHoe(TSEToolMaterials.BRONZE, "bronze_hoe", TSECreativeTabs.tabTools, 3);

	public static Item magicPickaxe = registerPickaxe(TSEToolMaterials.MAGIC, "magic_pickaxe", TSECreativeTabs.tabTools, 6);
	public static Item magicAxe = registerAxe(TSEToolMaterials.MITHRIL, "magic_axe", TSECreativeTabs.tabTools, 6, 1F, 10.0F);
	public static Item magicMattock = registerMattock(-2.2F, TSEToolMaterials.MAGIC, "magic_mattock", TSECreativeTabs.tabTools, 6);
	public static Item magicShovel = registerShovel(TSEToolMaterials.MAGIC, "magic_shovel", TSECreativeTabs.tabTools, 6);
	public static Item magicHoe = registerHoe(TSEToolMaterials.MAGIC, "magic_hoe", TSECreativeTabs.tabTools, 6);

	public static Item mithrilPickaxe = registerPickaxe(TSEToolMaterials.MITHRIL, "mithril_pickaxe", TSECreativeTabs.tabTools, 7);
	public static Item mithrilAxe = registerAxe(TSEToolMaterials.MITHRIL, "mithril_axe", TSECreativeTabs.tabTools, 7, 1F, 15.0F);
	public static Item mithrilMattock = registerMattock(-2.2F, TSEToolMaterials.MITHRIL, "mithril_mattock", TSECreativeTabs.tabTools, 7);
	public static Item mithrilShovel = registerShovel(TSEToolMaterials.MITHRIL, "mithril_shovel", TSECreativeTabs.tabTools, 7);
	public static Item mithrilHoe = registerHoe(TSEToolMaterials.MITHRIL, "mithril_hoe", TSECreativeTabs.tabTools, 7);

	public static Item mortiumPickaxe = registerPickaxe(TSEToolMaterials.MORTIUM, "mortium_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item mortiumAxe = registerAxe(TSEToolMaterials.MORTIUM, "mortium_axe", TSECreativeTabs.tabTools, 4, 1F, 4.0F);
	public static Item mortiumMattock = registerMattock(-2.2F, TSEToolMaterials.MORTIUM, "mortium_mattock", TSECreativeTabs.tabTools, 4);
	public static Item mortiumShovel = registerShovel(TSEToolMaterials.MORTIUM, "mortium_shovel", TSECreativeTabs.tabTools, 4);
	public static Item mortiumHoe = registerHoe(TSEToolMaterials.MORTIUM, "mortium_hoe", TSECreativeTabs.tabTools, 4);

	public static Item mysteriousPickaxe = registerPickaxe(TSEToolMaterials.MYSTERIOUS, "mysterious_pickaxe", TSECreativeTabs.tabTools, 6);
	public static Item mysteriousAxe = registerAxe(TSEToolMaterials.MYSTERIOUS, "mysterious_axe", TSECreativeTabs.tabTools, 6, 1F, 11F);
	public static Item mysteriousMattock = registerMattock(-2.2F, TSEToolMaterials.MYSTERIOUS, "mysterious_mattock", TSECreativeTabs.tabTools, 6);
	public static Item mysteriousShovel = registerShovel(TSEToolMaterials.MYSTERIOUS, "mysterious_shovel", TSECreativeTabs.tabTools, 6);
	public static Item mysteriousHoe = registerHoe(TSEToolMaterials.MYSTERIOUS, "mysterious_hoe", TSECreativeTabs.tabTools, 6);

	public static Item mysticPickaxe = registerPickaxe(TSEToolMaterials.MYSTIC, "mystic_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item mysticAxe = registerAxe(TSEToolMaterials.MYSTIC, "mystic_axe", TSECreativeTabs.tabTools, 5, 1F, 7F);
	public static Item mysticMattock = registerMattock(-2.2F, TSEToolMaterials.MYSTIC, "mystic_mattock", TSECreativeTabs.tabTools, 5);
	public static Item mysticShovel = registerShovel(TSEToolMaterials.MYSTIC, "mystic_shovel", TSECreativeTabs.tabTools, 5);
	public static Item mysticHoe = registerHoe(TSEToolMaterials.MYSTIC, "mystic_hoe", TSECreativeTabs.tabTools, 5);

	public static Item skyIronPickaxe = registerPickaxe(TSEToolMaterials.SKYIRON, "sky_iron_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item skyIronAxe = registerAxe(TSEToolMaterials.SKYIRON, "sky_iron_axe", TSECreativeTabs.tabTools, 2, 1F, 2F);
	public static Item skyIronMattock = registerMattock(-2.2F, TSEToolMaterials.SKYIRON, "sky_iron_mattock", TSECreativeTabs.tabTools, 2);
	public static Item skyIronShovel = registerShovel(TSEToolMaterials.SKYIRON, "sky_iron_shovel", TSECreativeTabs.tabTools, 2);
	public static Item skyIronHoe = registerHoe(TSEToolMaterials.SKYIRON, "sky_iron_hoe", TSECreativeTabs.tabTools, 2);

	public static Item terriumPickaxe = registerPickaxe(TSEToolMaterials.TERRIUM, "terrium_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item terriumAxe = registerAxe(TSEToolMaterials.TERRIUM, "terrium_axe", TSECreativeTabs.tabTools, 5, 1F, 4.0F);
	public static Item terriumMattock = registerMattock(-2.2F, TSEToolMaterials.TERRIUM, "terrium_mattock", TSECreativeTabs.tabTools, 5);
	public static Item terriumShovel = registerShovel(TSEToolMaterials.TERRIUM, "terrium_shovel", TSECreativeTabs.tabTools, 5);
	public static Item terriumHoe = registerHoe(TSEToolMaterials.TERRIUM, "terrium_hoe", TSECreativeTabs.tabTools, 5);

	public static Item vividiumPickaxe = registerPickaxe(TSEToolMaterials.VIVIDIUM, "vividium_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item vividiumAxe = registerAxe(TSEToolMaterials.VIVIDIUM, "vividium_axe", TSECreativeTabs.tabTools, 4, 1F, 4F);
	public static Item vividiumMattock = registerMattock(-2.2F, TSEToolMaterials.VIVIDIUM, "vividium_mattock", TSECreativeTabs.tabTools, 4);
	public static Item vividiumShovel = registerShovel(TSEToolMaterials.VIVIDIUM, "vividium_shovel", TSECreativeTabs.tabTools, 4);
	public static Item vividiumHoe = registerHoe(TSEToolMaterials.VIVIDIUM, "vividium_hoe", TSECreativeTabs.tabTools, 4);

	// Terra Diamond
	public static Item terraDiamondPickaxe = registerPickaxe(TSEToolMaterials.TDIAMOND, "terra_diamond_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondAxe = registerAxe(TSEToolMaterials.TDIAMOND, "terra_diamond_axe", TSECreativeTabs.tabTools, 4, 1F, 5F);
	public static Item terraDiamondMattock = registerMattock(-2.0F, TSEToolMaterials.TDIAMOND, "terra_diamond_mattock", TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondShovel = registerShovel(TSEToolMaterials.TDIAMOND, "terra_diamond_shovel", TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondHoe = registerHoe(TSEToolMaterials.TDIAMOND, "terra_diamond_hoe", TSECreativeTabs.tabTools, 4);
	// Terra Diamond

	public static Item tyionetiumPickaxe = registerPickaxe(TSEToolMaterials.TYIONETIUM, "tyionetium_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumAxe = registerAxe(TSEToolMaterials.TYIONETIUM, "tyionetium_axe", TSECreativeTabs.tabTools, 5, 1F, 7F);
	public static Item tyionetiumMattock = registerMattock(-2.2F, TSEToolMaterials.TYIONETIUM, "tyionetium_mattock", TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumShovel = registerShovel(TSEToolMaterials.TYIONETIUM, "tyionetium_shovel", TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumHoe = registerHoe(TSEToolMaterials.TYIONETIUM, "tyionetium_hoe", TSECreativeTabs.tabTools, 5);

	public static Item brightflamePickaxe = registerPickaxe(TSEToolMaterials.BRIGHTFLAME, "brightflame_pickaxe", TSECreativeTabs.tabTools, 6);
	public static Item brightflameAxe = registerAxe(ToolMaterial.DIAMOND, "brightflame_axe", TSECreativeTabs.tabTools, 6, 1F, 9F);
	public static Item brightflameMattock = registerMattock(-2.2F, TSEToolMaterials.BRIGHTFLAME, "brightflame_mattock", TSECreativeTabs.tabTools, 6);
	public static Item brightflameShovel = registerShovel(TSEToolMaterials.BRIGHTFLAME, "brightflame_shovel", TSECreativeTabs.tabTools, 6);
	public static Item brightflameHoe = registerHoe(TSEToolMaterials.BRIGHTFLAME, "brightflame_hoe", TSECreativeTabs.tabTools, 6);

	public static Item brightsteelPickaxe = registerPickaxe(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_pickaxe", TSECreativeTabs.tabTools, 6);
	public static Item brightsteelAxe = registerAxe(ToolMaterial.DIAMOND, "brightsteel_axe", TSECreativeTabs.tabTools, 6, 1F, 4F);
	public static Item brightsteelMattock = registerMattock(-2.2F, TSEToolMaterials.BRIGHTSTEEL, "brightsteel_mattock", TSECreativeTabs.tabTools, 6);
	public static Item brightsteelShovel = registerShovel(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_shovel", TSECreativeTabs.tabTools, 6);
	public static Item brightsteelHoe = registerHoe(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_hoe", TSECreativeTabs.tabTools, 6);

	public static Item extranetiumPickaxe = registerPickaxe(TSEToolMaterials.EXTRANETIUM, "extranetium_pickaxe", TSECreativeTabs.tabTools, 8);
	public static Item extranetiumAxe = registerAxe(TSEToolMaterials.EXTRANETIUM, "extranetium_axe", TSECreativeTabs.tabTools, 8, 1F, 20F);
	public static Item extranetiumMattock = registerMattock(-2.2F, TSEToolMaterials.EXTRANETIUM, "extranetium_mattock", TSECreativeTabs.tabTools, 8);
	public static Item extranetiumShovel = registerShovel(TSEToolMaterials.EXTRANETIUM, "extranetium_shovel", TSECreativeTabs.tabTools, 8);
	public static Item extranetiumHoe = registerHoe(TSEToolMaterials.EXTRANETIUM, "extranetium_hoe", TSECreativeTabs.tabTools, 8);

	public static Item steelPickaxe = registerPickaxe(TSEToolMaterials.STEEL, "steel_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item steelAxe = registerAxe(TSEToolMaterials.STEEL, "steel_axe", TSECreativeTabs.tabTools, 3, 1F, 5F);
	public static Item steelShovel = registerShovel(TSEToolMaterials.STEEL, "steel_shovel", TSECreativeTabs.tabTools, 3);
	public static Item steelHoe = registerHoe(TSEToolMaterials.STEEL, "steel_hoe", TSECreativeTabs.tabTools, 3);
	public static Item steelMattock = registerMattock(-2.2F, TSEToolMaterials.STEEL, "steel_mattock", TSECreativeTabs.tabTools, 3);

	public static Item titaniumPickaxe = registerPickaxe(TSEToolMaterials.TITANIUM, "titanium_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item titaniumAxe = registerAxe(TSEToolMaterials.TITANIUM, "titanium_axe", TSECreativeTabs.tabTools, 3, 1F, 6F);
	public static Item titaniumShovel = registerShovel(TSEToolMaterials.TITANIUM, "titanium_shovel", TSECreativeTabs.tabTools, 3);
	public static Item titaniumHoe = registerHoe(TSEToolMaterials.TITANIUM, "titanium_hoe", TSECreativeTabs.tabTools, 3);
	public static Item titaniumMattock = registerMattock(-2.2F, TSEToolMaterials.TITANIUM, "titanium_mattock", TSECreativeTabs.tabTools, 3);

	public static Item silverPickaxe = registerPickaxe(TSEToolMaterials.SILVER, "silver_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item silverAxe = registerAxe(TSEToolMaterials.SILVER, "silver_axe", TSECreativeTabs.tabTools, 0, 1F, 1F);
	public static Item silverShovel = registerShovel(TSEToolMaterials.SILVER, "silver_shovel", TSECreativeTabs.tabTools, 0);
	public static Item silverHoe = registerHoe(TSEToolMaterials.SILVER, "silver_hoe", TSECreativeTabs.tabTools, 0);
	public static Item silverMattock = registerMattock(-2.2F, TSEToolMaterials.SILVER, "silver_mattock", TSECreativeTabs.tabTools, 0);

	public static Item exaltedDiamondPickaxe = registerPickaxe(TSEToolMaterials.EDIAMOND, "exalted_diamond_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item exaltedDiamondAxe = registerAxe(TSEToolMaterials.EDIAMOND, "exalted_diamond_axe", TSECreativeTabs.tabTools, 4, 1F, 6F);
	public static Item exaltedDiamondShovel = registerShovel(TSEToolMaterials.EDIAMOND, "exalted_diamond_shovel", TSECreativeTabs.tabTools, 4);
	public static Item exaltedDiamondHoe = registerHoe(TSEToolMaterials.EDIAMOND, "exalted_diamond_hoe", TSECreativeTabs.tabTools, 4);
	public static Item exaltedDiamondMattock = registerMattock(TSEToolMaterials.EDIAMOND, "exalted_diamond_mattock", TSECreativeTabs.tabTools, 4);

	public static Item bloodDiamondPickaxe = registerPickaxe(TSEToolMaterials.BDIAMOND, "blood_diamond_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item bloodDiamondAxe = registerAxe(TSEToolMaterials.BDIAMOND, "blood_diamond_axe", TSECreativeTabs.tabTools, 4, 4F);
	public static Item bloodDiamondShovel = registerShovel(TSEToolMaterials.BDIAMOND, "blood_diamond_shovel", TSECreativeTabs.tabTools, 4);
	public static Item bloodDiamondHoe = registerHoe(TSEToolMaterials.BDIAMOND, "blood_diamond_hoe", TSECreativeTabs.tabTools, 4);
	public static Item bloodDiamondMattock = registerMattock(TSEToolMaterials.BDIAMOND, "blood_diamond_mattock", TSECreativeTabs.tabTools, 4);

	public static Item platinumPickaxe = registerPickaxe(TSEToolMaterials.PLATINUM, "platinum_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item platinumAxe = registerAxe(TSEToolMaterials.PLATINUM, "platinum_axe", TSECreativeTabs.tabTools, 0, 2F);
	public static Item platinumShovel = registerShovel(TSEToolMaterials.PLATINUM, "platinum_shovel", TSECreativeTabs.tabTools, 0);
	public static Item platinumHoe = registerHoe(TSEToolMaterials.PLATINUM, "platinum_hoe", TSECreativeTabs.tabTools, 0);
	public static Item platinumMattock = registerMattock(TSEToolMaterials.PLATINUM, "platinum_mattock", TSECreativeTabs.tabTools, 0);

	public static Item tinPickaxe = registerPickaxe(TSEToolMaterials.TIN, "tin_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item tinAxe = registerAxe(TSEToolMaterials.TIN, "tin_axe", TSECreativeTabs.tabTools, 1, 1F);
	public static Item tinShovel = registerShovel(TSEToolMaterials.TIN, "tin_shovel", TSECreativeTabs.tabTools, 1);
	public static Item tinHoe = registerHoe(TSEToolMaterials.TIN, "tin_hoe", TSECreativeTabs.tabTools, 1);
	public static Item tinMattock = registerMattock(TSEToolMaterials.TIN, "tin_mattock", TSECreativeTabs.tabTools, 1);

	public static Item pewterPickaxe = registerPickaxe(TSEToolMaterials.PEWTER, "pewter_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item pewterAxe = registerAxe(TSEToolMaterials.PEWTER, "pewter_axe", TSECreativeTabs.tabTools, 3, 3.0F);
	public static Item pewterShovel = registerShovel(TSEToolMaterials.PEWTER, "pewter_shovel", TSECreativeTabs.tabTools, 3);
	public static Item pewterHoe = registerHoe(TSEToolMaterials.PEWTER, "pewter_hoe", TSECreativeTabs.tabTools, 3);
	public static Item pewterMattock = registerMattock(TSEToolMaterials.PEWTER, "pewter_mattock", TSECreativeTabs.tabTools, 3);

	public static Item mnemiumPickaxe = registerPickaxe(TSEToolMaterials.MNEMIUM, "mnemium_pickaxe", TSECreativeTabs.tabTools, 9);
	public static Item mnemiumAxe = registerAxe(TSEToolMaterials.MNEMIUM, "mnemium_axe", TSECreativeTabs.tabTools, 9, 30F);
	public static Item mnemiumShovel = registerShovel(TSEToolMaterials.MNEMIUM, "mnemium_shovel", TSECreativeTabs.tabTools, 9);
	public static Item mnemiumHoe = registerHoe(TSEToolMaterials.MNEMIUM, "mnemium_hoe", TSECreativeTabs.tabTools, 9);
	public static Item mnemiumMattock = registerMattock(TSEToolMaterials.MNEMIUM, "mnemium_mattock", TSECreativeTabs.tabTools, 9);

	public static Item aluminumPickaxe = registerPickaxe(TSEToolMaterials.ALUMINUM, "aluminum_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item aluminumAxe = registerAxe(TSEToolMaterials.ALUMINUM, "aluminum_axe", TSECreativeTabs.tabTools, 1, 3F);
	public static Item aluminumShovel = registerShovel(TSEToolMaterials.ALUMINUM, "aluminum_shovel", TSECreativeTabs.tabTools, 1);
	public static Item aluminumHoe = registerHoe(TSEToolMaterials.ALUMINUM, "aluminum_hoe", TSECreativeTabs.tabTools, 1);
	public static Item aluminumMattock = registerMattock(TSEToolMaterials.ALUMINUM, "aluminum_mattock", TSECreativeTabs.tabTools, 1);

	public static Item eterniumPickaxe = registerPickaxe(TSEToolMaterials.ETERNIUM, "eternium_pickaxe", TSECreativeTabs.tabTools, 10);
	public static Item eterniumAxe = registerAxe(TSEToolMaterials.ETERNIUM, "eternium_axe", TSECreativeTabs.tabTools, 10, 90.0F);
	public static Item eterniumShovel = registerShovel(TSEToolMaterials.ETERNIUM, "eternium_shovel", TSECreativeTabs.tabTools, 10);
	public static Item eterniumHoe = registerHoe(TSEToolMaterials.ETERNIUM, "eternium_hoe", TSECreativeTabs.tabTools, 10);
	public static Item eterniumMattock = registerMattock(TSEToolMaterials.ETERNIUM, "eternium_mattock", TSECreativeTabs.tabTools, 10);
	
	public static Item reforgedGoldPickaxe = registerPickaxe(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item reforgedGoldAxe = registerAxe(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_axe", TSECreativeTabs.tabTools, 2, 2.0F);
	public static Item reforgedGoldShovel = registerShovel(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_shovel", TSECreativeTabs.tabTools, 2);
	public static Item reforgedGoldHoe = registerHoe(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_hoe", TSECreativeTabs.tabTools, 2);
	public static Item reforgedGoldMattock = registerMattock(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_mattock", TSECreativeTabs.tabTools, 2);
	
	public static Item zincPickaxe = registerPickaxe(TSEToolMaterials.ZINC, "zinc_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item zincAxe = registerAxe(TSEToolMaterials.ZINC, "zinc_axe", TSECreativeTabs.tabTools, 1, 0.0F);
	public static Item zincShovel = registerShovel(TSEToolMaterials.ZINC, "zinc_shovel", TSECreativeTabs.tabTools, 1);
	public static Item zincHoe = registerHoe(TSEToolMaterials.ZINC, "zinc_hoe", TSECreativeTabs.tabTools, 1);
	public static Item zincMattock = registerMattock(TSEToolMaterials.ZINC, "zinc_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item brassPickaxe = registerPickaxe(TSEToolMaterials.BRASS, "brass_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item brassAxe = registerAxe(TSEToolMaterials.BRASS, "brass_axe", TSECreativeTabs.tabTools, 2, 1.5F);
	public static Item brassShovel = registerShovel(TSEToolMaterials.BRASS, "brass_shovel", TSECreativeTabs.tabTools, 2);
	public static Item brassHoe = registerHoe(TSEToolMaterials.BRASS, "brass_hoe", TSECreativeTabs.tabTools, 2);
	public static Item brassMattock = registerMattock(TSEToolMaterials.BRASS, "brass_mattock", TSECreativeTabs.tabTools, 2);
	
	public static Item leadPickaxe = registerPickaxe(TSEToolMaterials.LEAD, "lead_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item leadAxe = registerAxe(TSEToolMaterials.LEAD, "lead_axe", TSECreativeTabs.tabTools, 3, 3.2F);
	public static Item leadShovel = registerShovel(TSEToolMaterials.LEAD, "lead_shovel", TSECreativeTabs.tabTools, 3);
	public static Item leadHoe = registerHoe(TSEToolMaterials.LEAD, "lead_hoe", TSECreativeTabs.tabTools, 3);
	public static Item leadMattock = registerMattock(TSEToolMaterials.LEAD, "lead_mattock", TSECreativeTabs.tabTools, 3);
	
	public static Item nickelPickaxe = registerPickaxe(TSEToolMaterials.NICKEL, "nickel_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item nickelAxe = registerAxe(TSEToolMaterials.NICKEL, "nickel_axe", TSECreativeTabs.tabTools, 1, 0.0F);
	public static Item nickelShovel = registerShovel(TSEToolMaterials.NICKEL, "nickel_shovel", TSECreativeTabs.tabTools, 1);
	public static Item nickelHoe = registerHoe(TSEToolMaterials.NICKEL, "nickel_hoe", TSECreativeTabs.tabTools, 1);
	public static Item nickelMattock = registerMattock(TSEToolMaterials.NICKEL, "nickel_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item fantasiumPickaxe = registerPickaxe(TSEToolMaterials.FANTASIUM, "fantasium_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item fantasiumAxe = registerAxe(TSEToolMaterials.FANTASIUM, "fantasium_axe", TSECreativeTabs.tabTools, 5, 8.0F);
	public static Item fantasiumShovel = registerShovel(TSEToolMaterials.FANTASIUM, "fantasium_shovel", TSECreativeTabs.tabTools, 5);
	public static Item fantasiumHoe = registerHoe(TSEToolMaterials.FANTASIUM, "fantasium_hoe", TSECreativeTabs.tabTools, 5);
	public static Item fantasiumMattock = registerMattock(TSEToolMaterials.FANTASIUM, "fantasium_mattock", TSECreativeTabs.tabTools, 5);
	
	public static Item scorniumPickaxe = registerPickaxe(TSEToolMaterials.SCORNIUM, "scornium_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item scorniumAxe = registerAxe(TSEToolMaterials.SCORNIUM, "scornium_axe", TSECreativeTabs.tabTools, 5, 9.0F);
	public static Item scorniumShovel = registerShovel(TSEToolMaterials.SCORNIUM, "scornium_shovel", TSECreativeTabs.tabTools, 5);
	public static Item scorniumHoe = registerHoe(TSEToolMaterials.SCORNIUM, "scornium_hoe", TSECreativeTabs.tabTools, 5);
	public static Item scorniumMattock = registerMattock(TSEToolMaterials.SCORNIUM, "scornium_mattock", TSECreativeTabs.tabTools, 5);
	
	public static Item electrumPickaxe = registerPickaxe(TSEToolMaterials.ELECTRUM, "electrum_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item electrumAxe = registerAxe(TSEToolMaterials.ELECTRUM, "electrum_axe", TSECreativeTabs.tabTools, 1, 0.5F);
	public static Item electrumShovel = registerShovel(TSEToolMaterials.ELECTRUM, "electrum_shovel", TSECreativeTabs.tabTools, 1);
	public static Item electrumHoe = registerHoe(TSEToolMaterials.ELECTRUM, "electrum_hoe", TSECreativeTabs.tabTools, 1);
	public static Item electrumMattock = registerMattock(TSEToolMaterials.ELECTRUM, "electrum_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item laeniumPickaxe = registerPickaxe(TSEToolMaterials.LAENIUM, "laenium_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item laeniumAxe = registerAxe(TSEToolMaterials.LAENIUM, "laenium_axe", TSECreativeTabs.tabTools, 4, 2.0F);
	public static Item laeniumShovel = registerShovel(TSEToolMaterials.LAENIUM, "laenium_shovel", TSECreativeTabs.tabTools, 4);
	public static Item laeniumHoe = registerHoe(TSEToolMaterials.LAENIUM, "laenium_hoe", TSECreativeTabs.tabTools, 4);
	public static Item laeniumMattock = registerMattock(TSEToolMaterials.LAENIUM, "laenium_mattock", TSECreativeTabs.tabTools, 4);
	
	public static Item magneiumPickaxe = registerPickaxe(TSEToolMaterials.MAGNEIUM, "magneium_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item magneiumAxe = registerAxe(TSEToolMaterials.MAGNEIUM, "magneium_axe", TSECreativeTabs.tabTools, 2, 1.0F);
	public static Item magneiumShovel = registerShovel(TSEToolMaterials.MAGNEIUM, "magneium_shovel", TSECreativeTabs.tabTools, 2);
	public static Item magneiumHoe = registerHoe(TSEToolMaterials.MAGNEIUM, "magneium_hoe", TSECreativeTabs.tabTools, 2);
	public static Item magneiumMattock = registerMattock(TSEToolMaterials.MAGNEIUM, "magneium_mattock", TSECreativeTabs.tabTools, 2);
	
	public static Item sterlingSilverPickaxe = registerPickaxe(TSEToolMaterials.STSILVER, "sterling_silver_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item sterlingSilverAxe = registerAxe(TSEToolMaterials.STSILVER, "sterling_silver_axe", TSECreativeTabs.tabTools, 1, 0.0F);
	public static Item sterlingSilverShovel = registerShovel(TSEToolMaterials.STSILVER, "sterling_silver_shovel", TSECreativeTabs.tabTools, 1);
	public static Item sterlingSilverHoe = registerHoe(TSEToolMaterials.STSILVER, "sterling_silver_hoe", TSECreativeTabs.tabTools, 1);
	public static Item sterlingSilverMattock = registerMattock(TSEToolMaterials.STSILVER, "sterling_silver_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item roseGoldPickaxe = registerPickaxe(ToolMaterial.GOLD, "rose_gold_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item roseGoldAxe = registerAxe(ToolMaterial.GOLD, "rose_gold_axe", TSECreativeTabs.tabTools, 0, 0.0F);
	public static Item roseGoldShovel = registerShovel(ToolMaterial.GOLD, "rose_gold_shovel", TSECreativeTabs.tabTools, 0);
	public static Item roseGoldHoe = registerHoe(ToolMaterial.GOLD, "rose_gold_hoe", TSECreativeTabs.tabTools, 0);
	public static Item roseGoldMattock = registerMattock(ToolMaterial.GOLD, "rose_gold_mattock", TSECreativeTabs.tabTools, 0);
	
	public static Item whiteGoldPickaxe = registerPickaxe(ToolMaterial.GOLD, "white_gold_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item whiteGoldAxe = registerAxe(ToolMaterial.GOLD, "white_gold_axe", TSECreativeTabs.tabTools, 0, 0.0F);
	public static Item whiteGoldShovel = registerShovel(ToolMaterial.GOLD, "white_gold_shovel", TSECreativeTabs.tabTools, 0);
	public static Item whiteGoldHoe = registerHoe(ToolMaterial.GOLD, "white_gold_hoe", TSECreativeTabs.tabTools, 0);
	public static Item whiteGoldMattock = registerMattock(ToolMaterial.GOLD, "white_gold_mattock", TSECreativeTabs.tabTools, 0);
	
	public static Item spangoldPickaxe = registerPickaxe(ToolMaterial.GOLD, "spangold_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item spangoldAxe = registerAxe(ToolMaterial.GOLD, "spangold_axe", TSECreativeTabs.tabTools, 0, 0.0F);
	public static Item spangoldShovel = registerShovel(ToolMaterial.GOLD, "spangold_shovel", TSECreativeTabs.tabTools, 0);
	public static Item spangoldHoe = registerHoe(ToolMaterial.GOLD, "spangold_hoe", TSECreativeTabs.tabTools, 0);
	public static Item spangoldMattock = registerMattock(ToolMaterial.GOLD, "spangold_mattock", TSECreativeTabs.tabTools, 0);
	
	public static Item meteoricIronPickaxe = registerPickaxe(TSEToolMaterials.METEORICIRON, "meteoric_iron_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item meteoricIronAxe = registerAxe(TSEToolMaterials.METEORICIRON, "meteoric_iron_axe", TSECreativeTabs.tabTools, 2, 2.1F);
	public static Item meteoricIronShovel = registerShovel(TSEToolMaterials.METEORICIRON, "meteoric_iron_shovel", TSECreativeTabs.tabTools, 2);
	public static Item meteoricIronHoe = registerHoe(TSEToolMaterials.METEORICIRON, "meteoric_iron_hoe", TSECreativeTabs.tabTools, 2);
	public static Item meteoricIronMattock = registerMattock(TSEToolMaterials.METEORICIRON, "meteoric_iron_mattock", TSECreativeTabs.tabTools, 2);
	
	public static Item maduumPickaxe = registerPickaxe(TSEToolMaterials.MADUUM, "maduum_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item maduumAxe = registerAxe(TSEToolMaterials.MADUUM, "maduum_axe", TSECreativeTabs.tabTools, 1, 0.0F);
	public static Item maduumShovel = registerShovel(TSEToolMaterials.MADUUM, "maduum_shovel", TSECreativeTabs.tabTools, 1);
	public static Item maduumHoe = registerHoe(TSEToolMaterials.MADUUM, "maduum_hoe", TSECreativeTabs.tabTools, 1);
	public static Item maduumMattock = registerMattock(TSEToolMaterials.MADUUM, "maduum_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item immortaliumPickaxe = registerPickaxe(TSEToolMaterials.IMMORTALIUM, "immortalium_pickaxe", TSECreativeTabs.tabTools, 10);
	public static Item immortaliumAxe = registerAxe(TSEToolMaterials.IMMORTALIUM, "immortalium_axe", TSECreativeTabs.tabTools, 10, 50.0F);
	public static Item immortaliumShovel = registerShovel(TSEToolMaterials.IMMORTALIUM, "immortalium_shovel", TSECreativeTabs.tabTools, 10);
	public static Item immortaliumHoe = registerHoe(TSEToolMaterials.IMMORTALIUM, "immortalium_hoe", TSECreativeTabs.tabTools, 10);
	public static Item immortaliumMattock = registerMattock(TSEToolMaterials.IMMORTALIUM, "immortalium_mattock", TSECreativeTabs.tabTools, 10);
	
	// Others
	public static Item woodMattock = registerMattock(-3.0F, ToolMaterial.WOOD, "wood_mattock", TSECreativeTabs.tabTools, 0);
	public static Item stoneMattock = registerMattock(-2.5F, ToolMaterial.STONE, "stone_mattock", TSECreativeTabs.tabTools, 1);
	public static Item ironMattock = registerMattock(-2.2F, ToolMaterial.IRON, "iron_mattock", TSECreativeTabs.tabTools, 2);
	public static Item diamondMattock = registerMattock(-2.0F, ToolMaterial.DIAMOND, "diamond_mattock", TSECreativeTabs.tabTools, 3);
	public static Item goldMattock = registerMattock(1.0F, ToolMaterial.GOLD, "gold_mattock", TSECreativeTabs.tabTools, 0);
	// Others

	// End Tools

	// Start Swords

	public static Item copperSword = registerSword(TSEToolMaterials.COPPER, "copper_sword", TSECreativeTabs.tabWeapons);
	public static Item bronzeSword = registerSword(TSEToolMaterials.BRONZE, "bronze_sword", TSECreativeTabs.tabWeapons);
	public static Item terraDiamondSword = registerSword(TSEToolMaterials.TDIAMOND, "terra_diamond_sword", TSECreativeTabs.tabWeapons);
	public static Item tyionetiumSword = registerSword(TSEToolMaterials.TYIONETIUM, "tyionetium_sword", TSECreativeTabs.tabWeapons);
	public static Item brightflameSword = registerSword(TSEToolMaterials.BRIGHTFLAME, "brightflame_sword", TSECreativeTabs.tabWeapons);
	public static Item brightsteelSword = registerSword(TSEToolMaterials.BRIGHTFLAME, "brightsteel_sword", TSECreativeTabs.tabWeapons);
	public static Item magicSword = registerSword(TSEToolMaterials.MAGIC, "magic_sword", TSECreativeTabs.tabWeapons);
	public static Item mithrilSword = registerSword(TSEToolMaterials.MITHRIL, "mithril_sword", TSECreativeTabs.tabWeapons);
	public static Item mortiumSword = registerSword(TSEToolMaterials.MORTIUM, "mortium_sword", TSECreativeTabs.tabWeapons);
	public static Item mysteriousSword = registerSword(TSEToolMaterials.MYSTERIOUS, "mysterious_sword", TSECreativeTabs.tabWeapons);
	public static Item mysticSword = registerSword(TSEToolMaterials.MYSTIC, "mystic_sword", TSECreativeTabs.tabWeapons);
	public static Item skyIronSword = registerSword(TSEToolMaterials.SKYIRON, "sky_iron_sword", TSECreativeTabs.tabWeapons);
	public static Item terriumSword = registerSword(TSEToolMaterials.TERRIUM, "terrium_sword", TSECreativeTabs.tabWeapons);
	public static Item vividiumSword = registerSword(TSEToolMaterials.VIVIDIUM, "vividium_sword", TSECreativeTabs.tabWeapons);
	public static Item extranetiumSword = registerSword(TSEToolMaterials.EXTRANETIUM, "extranetium_sword", TSECreativeTabs.tabWeapons);
	public static Item steelSword = registerSword(TSEToolMaterials.STEEL, "steel_sword", TSECreativeTabs.tabWeapons);
	public static Item titaniumSword = registerSword(TSEToolMaterials.TITANIUM, "titanium_sword", TSECreativeTabs.tabWeapons);
	public static Item silverSword = registerSword(TSEToolMaterials.SILVER, "silver_sword", TSECreativeTabs.tabWeapons);
	public static Item exaltedDiamondSword = registerSword(TSEToolMaterials.EDIAMOND, "exalted_diamond_sword", TSECreativeTabs.tabWeapons);
	public static Item bloodDiamondSword = registerSword(TSEToolMaterials.BDIAMOND, "blood_diamond_sword", TSECreativeTabs.tabWeapons);
	public static Item platinumSword = registerSword(TSEToolMaterials.PLATINUM, "platinum_sword", TSECreativeTabs.tabWeapons);
	public static Item tinSword = registerSword(TSEToolMaterials.TIN, "tin_sword", TSECreativeTabs.tabWeapons);
	public static Item pewterSword = registerSword(TSEToolMaterials.PEWTER, "pewter_sword", TSECreativeTabs.tabWeapons);
	public static Item mnemiumSword = registerSword(TSEToolMaterials.MNEMIUM, "mnemium_sword", TSECreativeTabs.tabWeapons);
	public static Item aluminumSword = registerSword(TSEToolMaterials.ALUMINUM, "aluminum_sword", TSECreativeTabs.tabWeapons);
	public static Item eterniumSword = registerSword(TSEToolMaterials.ETERNIUM, "eternium_sword", TSECreativeTabs.tabWeapons);
	public static Item reforgedGoldSword = registerSword(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_sword", TSECreativeTabs.tabWeapons);
	public static Item zincSword = registerSword(TSEToolMaterials.ZINC, "zinc_sword", TSECreativeTabs.tabWeapons);
	public static Item brassSword = registerSword(TSEToolMaterials.BRASS, "brass_sword", TSECreativeTabs.tabWeapons);
	public static Item leadSword = registerSword(TSEToolMaterials.LEAD, "lead_sword", TSECreativeTabs.tabWeapons);
	public static Item nickelSword = registerSword(TSEToolMaterials.NICKEL, "nickel_sword", TSECreativeTabs.tabWeapons);
	public static Item fantasiumSword = registerSword(TSEToolMaterials.FANTASIUM, "fantasium_sword", TSECreativeTabs.tabWeapons);
	public static Item scorniumSword = registerSword(TSEToolMaterials.SCORNIUM, "scornium_sword", TSECreativeTabs.tabWeapons);
	public static Item electrumSword = registerSword(TSEToolMaterials.ELECTRUM, "electrum_sword", TSECreativeTabs.tabWeapons);
	public static Item laeniumSword = registerSword(TSEToolMaterials.LAENIUM, "laenium_sword", TSECreativeTabs.tabWeapons);
	public static Item magneiumSword = registerSword(TSEToolMaterials.MAGNEIUM, "magneium_sword", TSECreativeTabs.tabWeapons);
	public static Item sterlingSilverSword = registerSword(TSEToolMaterials.STSILVER, "sterling_silver_sword", TSECreativeTabs.tabWeapons);
	public static Item roseGoldSword = registerSword(ToolMaterial.GOLD, "rose_gold_sword", TSECreativeTabs.tabWeapons);
	public static Item whiteGoldSword = registerSword(ToolMaterial.GOLD, "white_gold_sword", TSECreativeTabs.tabWeapons);
	public static Item spangoldSword = registerSword(ToolMaterial.GOLD, "spangold_sword", TSECreativeTabs.tabWeapons);
	public static Item meteoricIronSword = registerSword(TSEToolMaterials.METEORICIRON, "meteoric_iron_sword", TSECreativeTabs.tabWeapons);
	public static Item maduumSword = registerSword(TSEToolMaterials.MADUUM, "maduum_sword", TSECreativeTabs.tabWeapons);
	public static Item immortaliumSword = registerSword(TSEToolMaterials.IMMORTALIUM, "immortalium_sword", TSECreativeTabs.tabWeapons);
	
	public static Item justice = registerLightSword(TSEToolMaterials.JUSTICE, "justice", TSECreativeTabs.tabWeapons, true);
	public static Item corruption = registerLightSword(TSEToolMaterials.CORRUPTION, "corruption", TSECreativeTabs.tabWeapons, false);
	public static Item destruction = registerLightSword(TSEToolMaterials.DESTRUCTION, "destruction", TSECreativeTabs.tabWeapons, false);
	public static Item creation = registerLightSword(TSEToolMaterials.DESTRUCTION, "creation", TSECreativeTabs.tabWeapons, true);
	
	// End Swords

	// Start Armor

	public static Item copperHelmet = registerArmor("copper_helmet", TSEArmorMaterials.COPPER, 1,EntityEquipmentSlot.HEAD);
	public static Item copperChestplate = registerArmor("copper_chestplate", TSEArmorMaterials.COPPER, 1,EntityEquipmentSlot.CHEST);
	public static Item copperLeggings = registerArmor("copper_leggings", TSEArmorMaterials.COPPER, 1,EntityEquipmentSlot.LEGS);
	public static Item copperBoots = registerArmor("copper_boots", TSEArmorMaterials.COPPER, 1,EntityEquipmentSlot.FEET);

	public static Item bronzeHelmet = registerArmor("bronze_helmet", TSEArmorMaterials.BRONZE, 1,EntityEquipmentSlot.HEAD);
	public static Item bronzeChestplate = registerArmor("bronze_chestplate", TSEArmorMaterials.BRONZE, 1,EntityEquipmentSlot.CHEST);
	public static Item bronzeLeggings = registerArmor("bronze_leggings", TSEArmorMaterials.BRONZE, 1,EntityEquipmentSlot.LEGS);
	public static Item bronzeBoots = registerArmor("bronze_boots", TSEArmorMaterials.BRONZE, 1,EntityEquipmentSlot.FEET);

	public static Item terraDiamondHelmet = registerArmor("terra_diamond_helmet", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static Item terraDiamondChestplate = registerArmor("terra_diamond_chestplate",TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static Item terraDiamondLeggings = registerArmor("terra_diamond_leggings", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.LEGS);
	public static Item terraDiamondBoots = registerArmor("terra_diamond_boots", TSEArmorMaterials.TERRADIAMOND, 1 ,EntityEquipmentSlot.FEET);
	
	public static Item brightflameHelmet = registerArmor("brightflame_helmet", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.HEAD);
	public static Item brightflameChestplate = registerArmor("brightflame_chestplate", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.CHEST);
	public static Item brightflameLeggings = registerArmor("brightflame_leggings", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.LEGS);
	public static Item brightflameBoots = registerArmor("brightflame_boots", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.FEET);

	public static Item brightsteelHelmet = registerArmor("brightsteel_helmet", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.HEAD);
	public static Item brightsteelChestplate = registerArmor("brightsteel_chestplate", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.CHEST);
	public static Item brightsteelLeggings = registerArmor("brightsteel_leggings", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.LEGS);
	public static Item brightsteelBoots = registerArmor("brightsteel_boots", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.FEET);

	public static Item tinHelmet = registerArmor("tin_helmet", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.HEAD);
	public static Item tinChestplate = registerArmor("tin_chestplate", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.CHEST);
	public static Item tinLeggings = registerArmor("tin_leggings", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.LEGS);
	public static Item tinBoots = registerArmor("tin_boots", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.FEET);

	public static Item magicHelmet = registerArmor("magic_helmet", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.HEAD);
	public static Item magicChestplate = registerArmor("magic_chestplate", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.CHEST);
	public static Item magicLeggings = registerArmor("magic_leggings", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.LEGS);
	public static Item magicBoots = registerArmor("magic_boots", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.FEET);

	public static Item mithrilHelmet = registerArmor("mithril_helmet", TSEArmorMaterials.MITHRIL, 1, EntityEquipmentSlot.HEAD);
	public static Item mithrilChestplate = registerArmor("mithril_chestplate", TSEArmorMaterials.MITHRIL, 1, EntityEquipmentSlot.CHEST);
	public static Item mithrilLeggings = registerArmor("mithril_leggings", TSEArmorMaterials.MITHRIL, 1, EntityEquipmentSlot.LEGS);
	public static Item mithrilBoots = registerArmor("mithril_boots", TSEArmorMaterials.MITHRIL, 1, EntityEquipmentSlot.FEET);

	public static Item mortiumHelmet = registerArmor("mortium_helmet", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item mortiumChestplate = registerArmor("mortium_chestplate", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item mortiumLeggings = registerArmor("mortium_leggings", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item mortiumBoots = registerArmor("mortium_boots", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.FEET);

	public static Item steelHelmet = registerArmor("steel_helmet", TSEArmorMaterials.STEEL, 1, EntityEquipmentSlot.HEAD);
	public static Item steelChestplate = registerArmor("steel_chestplate", TSEArmorMaterials.STEEL, 1, EntityEquipmentSlot.CHEST);
	public static Item steelLeggings = registerArmor("steel_leggings", TSEArmorMaterials.STEEL, 1, EntityEquipmentSlot.LEGS);
	public static Item steelBoots = registerArmor("steel_boots", TSEArmorMaterials.STEEL, 1, EntityEquipmentSlot.FEET);

	public static Item titaniumHelmet = registerArmor("titanium_helmet", TSEArmorMaterials.TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item titaniumChestplate = registerArmor("titanium_chestplate", TSEArmorMaterials.TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item titaniumLeggings = registerArmor("titanium_leggings", TSEArmorMaterials.TITANIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item titaniumBoots = registerArmor("titanium_boots", TSEArmorMaterials.TITANIUM, 1, EntityEquipmentSlot.FEET);

	public static Item extranetiumHelmet = registerArmor("extranetium_helmet", TSEArmorMaterials.EXTRANETIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item extranetiumChestplate = registerArmor("extranetium_chestplate", TSEArmorMaterials.EXTRANETIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item extranetiumLeggings = registerArmor("extranetium_leggings", TSEArmorMaterials.EXTRANETIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item extranetiumBoots = registerArmor("extranetium_boots", TSEArmorMaterials.EXTRANETIUM, 1, EntityEquipmentSlot.FEET);

	public static Item mysteriousHelmet = registerArmor("mysterious_helmet", TSEArmorMaterials.MYSTERIOUS, 1, EntityEquipmentSlot.HEAD);
	public static Item mysteriousChestplate = registerArmor("mysterious_chestplate", TSEArmorMaterials.MYSTERIOUS, 1, EntityEquipmentSlot.CHEST);
	public static Item mysteriousLeggings = registerArmor("mysterious_leggings", TSEArmorMaterials.MYSTERIOUS, 1, EntityEquipmentSlot.LEGS);
	public static Item mysteriousBoots = registerArmor("mysterious_boots", TSEArmorMaterials.MYSTERIOUS, 1, EntityEquipmentSlot.FEET);

	public static Item skyIronHelmet = registerArmor("sky_iron_helmet", TSEArmorMaterials.SKYIRON, 1, EntityEquipmentSlot.HEAD);
	public static Item skyIronChestplate = registerArmor("sky_iron_chestplate", TSEArmorMaterials.SKYIRON, 1, EntityEquipmentSlot.CHEST);
	public static Item skyIronLeggings = registerArmor("sky_iron_leggings", TSEArmorMaterials.SKYIRON, 1, EntityEquipmentSlot.LEGS);
	public static Item skyIronBoots = registerArmor("sky_iron_boots", TSEArmorMaterials.SKYIRON, 1, EntityEquipmentSlot.FEET);

	public static Item mysticHelmet = registerArmor("mystic_helmet", TSEArmorMaterials.MYSTIC, 1, EntityEquipmentSlot.HEAD);
	public static Item mysticChestplate = registerArmor("mystic_chestplate", TSEArmorMaterials.MYSTIC, 1, EntityEquipmentSlot.CHEST);
	public static Item mysticLeggings = registerArmor("mystic_leggings", TSEArmorMaterials.MYSTIC, 1, EntityEquipmentSlot.LEGS);
	public static Item mysticBoots = registerArmor("mystic_boots", TSEArmorMaterials.MYSTIC, 1, EntityEquipmentSlot.FEET);

	public static Item terriumHelmet = registerArmor("terrium_helmet", TSEArmorMaterials.TERRIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item terriumChestplate = registerArmor("terrium_chestplate", TSEArmorMaterials.TERRIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item terriumLeggings = registerArmor("terrium_leggings", TSEArmorMaterials.TERRIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item terriumBoots = registerArmor("terrium_boots", TSEArmorMaterials.TERRIUM, 1, EntityEquipmentSlot.FEET);

	public static Item vividiumHelmet = registerArmor("vividium_helmet", TSEArmorMaterials.VIVIDIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item vividiumChestplate = registerArmor("vividium_chestplate", TSEArmorMaterials.VIVIDIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item vividiumLeggings = registerArmor("vividium_leggings", TSEArmorMaterials.VIVIDIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item vividiumBoots = registerArmor("vividium_boots", TSEArmorMaterials.VIVIDIUM, 1, EntityEquipmentSlot.FEET);

	public static Item tyionetiumHelmet = registerArmor("tyionetium_helmet", TSEArmorMaterials.TYIONETIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item tyionetiumChestplate = registerArmor("tyionetium_chestplate", TSEArmorMaterials.TYIONETIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item tyionetiumLeggings = registerArmor("tyionetium_leggings", TSEArmorMaterials.TYIONETIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item tyionetiumBoots = registerArmor("tyionetium_boots", TSEArmorMaterials.TYIONETIUM, 1, EntityEquipmentSlot.FEET);

	public static Item silverHelmet = registerArmor("silver_helmet", TSEArmorMaterials.SILVER, 1, EntityEquipmentSlot.HEAD);
	public static Item silverChestplate = registerArmor("silver_chestplate", TSEArmorMaterials.SILVER, 1, EntityEquipmentSlot.CHEST);
	public static Item silverLeggings = registerArmor("silver_leggings", TSEArmorMaterials.SILVER, 1, EntityEquipmentSlot.LEGS);
	public static Item silverBoots = registerArmor("silver_boots", TSEArmorMaterials.SILVER, 1, EntityEquipmentSlot.FEET);

	public static Item exaltedDiamondHelmet = registerArmor("exalted_diamond_helmet", TSEArmorMaterials.EDIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static Item exaltedDiamondChestplate = registerArmor("exalted_diamond_chestplate", TSEArmorMaterials.EDIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static Item exaltedDiamondLeggings = registerArmor("exalted_diamond_leggings", TSEArmorMaterials.EDIAMOND, 1, EntityEquipmentSlot.LEGS);
	public static Item exaltedDiamondBoots = registerArmor("exalted_diamond_boots", TSEArmorMaterials.EDIAMOND, 1, EntityEquipmentSlot.FEET);

	public static Item bloodDiamondHelmet = registerArmor("blood_diamond_helmet", TSEArmorMaterials.BDIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static Item bloodDiamondChestplate = registerArmor("blood_diamond_chestplate", TSEArmorMaterials.BDIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static Item bloodDiamondLeggings = registerArmor("blood_diamond_leggings", TSEArmorMaterials.BDIAMOND, 1, EntityEquipmentSlot.LEGS);
	public static Item bloodDiamondBoots = registerArmor("blood_diamond_boots", TSEArmorMaterials.BDIAMOND, 1, EntityEquipmentSlot.FEET);

	public static Item platinumHelmet = registerArmor("platinum_helmet", TSEArmorMaterials.PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static Item platinumChestplate = registerArmor("platinum_chestplate", TSEArmorMaterials.PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static Item platinumLeggings = registerArmor("platinum_leggings", TSEArmorMaterials.PLATINUM, 1, EntityEquipmentSlot.LEGS);
	public static Item platinumBoots = registerArmor("platinum_boots", TSEArmorMaterials.PLATINUM, 1, EntityEquipmentSlot.FEET);

	public static Item reforgedGoldHelmet = registerArmor("reforged_gold_helmet", TSEArmorMaterials.REFORGEDGOLD, 1, EntityEquipmentSlot.HEAD);
	public static Item reforgedGoldChestplate = registerArmor("reforged_gold_chestplate", TSEArmorMaterials.REFORGEDGOLD, 1, EntityEquipmentSlot.CHEST);
	public static Item reforgedGoldLeggings = registerArmor("reforged_gold_leggings", TSEArmorMaterials.REFORGEDGOLD, 1, EntityEquipmentSlot.LEGS);
	public static Item reforgedGoldBoots = registerArmor("reforged_gold_boots", TSEArmorMaterials.REFORGEDGOLD, 1, EntityEquipmentSlot.FEET);
	
	public static Item zincHelmet = registerArmor("zinc_helmet", TSEArmorMaterials.ZINC, 1, EntityEquipmentSlot.HEAD);
	public static Item zincChestplate = registerArmor("zinc_chestplate", TSEArmorMaterials.ZINC, 1, EntityEquipmentSlot.CHEST);
	public static Item zincLeggings = registerArmor("zinc_leggings", TSEArmorMaterials.ZINC, 1, EntityEquipmentSlot.LEGS);
	public static Item zincBoots = registerArmor("zinc_boots", TSEArmorMaterials.ZINC, 1, EntityEquipmentSlot.FEET);
	
	public static Item brassHelmet = registerArmor("brass_helmet", TSEArmorMaterials.BRASS, 1, EntityEquipmentSlot.HEAD);
	public static Item brassChestplate = registerArmor("brass_chestplate", TSEArmorMaterials.BRASS, 1, EntityEquipmentSlot.CHEST);
	public static Item brassLeggings = registerArmor("brass_leggings", TSEArmorMaterials.BRASS, 1, EntityEquipmentSlot.LEGS);
	public static Item brassBoots = registerArmor("brass_boots", TSEArmorMaterials.BRASS, 1, EntityEquipmentSlot.FEET);
	
	public static Item leadHelmet = registerArmor("lead_helmet", TSEArmorMaterials.LEAD, 1, EntityEquipmentSlot.HEAD);
	public static Item leadChestplate = registerArmor("lead_chestplate", TSEArmorMaterials.LEAD, 1, EntityEquipmentSlot.CHEST);
	public static Item leadLeggings = registerArmor("lead_leggings", TSEArmorMaterials.LEAD, 1, EntityEquipmentSlot.LEGS);
	public static Item leadBoots = registerArmor("lead_boots", TSEArmorMaterials.LEAD, 1, EntityEquipmentSlot.FEET);
	
	public static Item nickelHelmet = registerArmor("nickel_helmet", TSEArmorMaterials.NICKEL, 1, EntityEquipmentSlot.HEAD);
	public static Item nickelChestplate = registerArmor("nickel_chesplate", TSEArmorMaterials.NICKEL, 1, EntityEquipmentSlot.CHEST);
	public static Item nickelLeggings = registerArmor("nickel_leggings", TSEArmorMaterials.NICKEL, 1, EntityEquipmentSlot.LEGS);
	public static Item nickelBoots = registerArmor("nickel_boots", TSEArmorMaterials.NICKEL, 1, EntityEquipmentSlot.FEET);
	
	public static Item pewterHelmet = registerArmor("pewter_helmet", TSEArmorMaterials.PEWTER, 1, EntityEquipmentSlot.HEAD);
	public static Item pewterChestplate = registerArmor("pewter_chestplate", TSEArmorMaterials.PEWTER, 1, EntityEquipmentSlot.CHEST);
	public static Item pewterLeggings = registerArmor("pewter_leggings", TSEArmorMaterials.PEWTER, 1, EntityEquipmentSlot.LEGS);
	public static Item pewterBoots = registerArmor("pewter_boots", TSEArmorMaterials.PEWTER, 1, EntityEquipmentSlot.FEET);

	public static Item aluminumHelmet = registerArmor("aluminum_helmet", TSEArmorMaterials.ALUMINUM, 1, EntityEquipmentSlot.HEAD);
	public static Item aluminumChestplate = registerArmor("aluminum_chestplate", TSEArmorMaterials.ALUMINUM, 1, EntityEquipmentSlot.CHEST);
	public static Item aluminumLeggings = registerArmor("aluminum_leggings", TSEArmorMaterials.ALUMINUM, 1, EntityEquipmentSlot.LEGS);
	public static Item aluminumBoots = registerArmor("aluminum_boots", TSEArmorMaterials.ALUMINUM, 1, EntityEquipmentSlot.FEET);

	public static Item mnemiumHelmet = registerArmor("mnemium_helmet", TSEArmorMaterials.MNEMIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item mnemiumChestplate = registerArmor("mnemium_chestplate", TSEArmorMaterials.MNEMIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item mnemiumLeggings = registerArmor("mnemium_leggings", TSEArmorMaterials.MNEMIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item mnemiumBoots = registerArmor("mnemium_boots", TSEArmorMaterials.MNEMIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item eterniumHelmet = registerArmor("eternium_helmet", TSEArmorMaterials.ETERNIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item eterniumChestplate = registerArmor("eternium_chestplate", TSEArmorMaterials.ETERNIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item eterniumLeggings = registerArmor("eternium_leggings", TSEArmorMaterials.ETERNIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item eterniumBoots = registerArmor("eternium_boots", TSEArmorMaterials.ETERNIUM, 1, EntityEquipmentSlot.FEET);

	public static Item fantasiumHelmet = registerArmor("fantasium_helmet", TSEArmorMaterials.FANTASIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item fantasiumChestplate = registerArmor("fantasium_chestplate", TSEArmorMaterials.FANTASIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item fantasiumLeggings = registerArmor("fantasium_leggings", TSEArmorMaterials.FANTASIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item fantasiumBoots = registerArmor("fantasium_boots", TSEArmorMaterials.FANTASIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item scorniumHelmet = registerArmor("scornium_helmet", TSEArmorMaterials.SCORNIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item scorniumChestplate = registerArmor("scornium_chestplate", TSEArmorMaterials.SCORNIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item scorniumLeggings = registerArmor("scornium_leggings", TSEArmorMaterials.SCORNIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item scorniumBoots = registerArmor("scornium_boots", TSEArmorMaterials.SCORNIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item electrumHelmet = registerArmor("electrum_helmet", TSEArmorMaterials.ELECTRUM, 1, EntityEquipmentSlot.HEAD);
	public static Item electrumChestplate = registerArmor("electrum_chestplate", TSEArmorMaterials.ELECTRUM, 1, EntityEquipmentSlot.CHEST);
	public static Item electrumLeggings = registerArmor("electrum_leggings", TSEArmorMaterials.ELECTRUM, 1, EntityEquipmentSlot.LEGS);
	public static Item electrumBoots = registerArmor("electrum_boots", TSEArmorMaterials.ELECTRUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item laeniumHelmet = registerArmor("laenium_helmet", TSEArmorMaterials.LAENIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item laeniumChestplate = registerArmor("laenium_chestplate", TSEArmorMaterials.LAENIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item laeniumLeggings = registerArmor("laenium_leggings", TSEArmorMaterials.LAENIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item laeniumBoots = registerArmor("laenium_boots", TSEArmorMaterials.LAENIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item magneiumHelmet = registerArmor("magneium_helmet", TSEArmorMaterials.MAGNEIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item magneiumChestplate = registerArmor("magneium_chestplate", TSEArmorMaterials.MAGNEIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item magneiumLeggings = registerArmor("magneium_leggings", TSEArmorMaterials.MAGNEIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item magneiumBoots = registerArmor("magneium_boots", TSEArmorMaterials.MAGNEIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item sterlingSilverHelmet = registerArmor("sterling_silver_helmet", TSEArmorMaterials.STSILVER, 1, EntityEquipmentSlot.HEAD);
	public static Item sterlingSilverChestplate = registerArmor("sterling_silver_chestplate", TSEArmorMaterials.STSILVER, 1, EntityEquipmentSlot.CHEST);
	public static Item sterlingSilverLeggings = registerArmor("sterling_silver_leggings", TSEArmorMaterials.STSILVER, 1, EntityEquipmentSlot.LEGS);
	public static Item sterlingSilverBoots = registerArmor("sterling_silver_boots", TSEArmorMaterials.STSILVER, 1, EntityEquipmentSlot.FEET);
	
	public static Item roseGoldHelmet = registerArmor("rose_gold_helmet", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.HEAD);
	public static Item roseGoldChestplate = registerArmor("rose_gold_chestplate", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.CHEST);
	public static Item roseGoldLeggings = registerArmor("rose_gold_leggings", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.LEGS);
	public static Item roseGoldBoots = registerArmor("rose_gold_boots", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.FEET);
	
	public static Item whiteGoldHelmet = registerArmor("white_gold_helmet", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.HEAD);
	public static Item whiteGoldChestplate = registerArmor("white_gold_chestplate", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.CHEST);
	public static Item whiteGoldLeggings = registerArmor("white_gold_leggings", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.FEET);
	public static Item whiteGoldBoots = registerArmor("white_gold_boots", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.FEET);
	
	public static Item spangoldHelmet = registerArmor("spangold_helmet", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.HEAD);
	public static Item spangoldChestplate = registerArmor("spangold_chestplate", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.CHEST);
	public static Item spangoldLeggings = registerArmor("spangold_leggings", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.LEGS);
	public static Item spangoldBoots = registerArmor("spangold_boots", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.FEET);
	
	public static Item meteoricIronHelmet = registerArmor("meteoric_iron_helmet", TSEArmorMaterials.METEORICIRON, 1, EntityEquipmentSlot.HEAD);
	public static Item meteoricIronChestplate = registerArmor("meteoric_iron_chestplate", TSEArmorMaterials.METEORICIRON, 1, EntityEquipmentSlot.CHEST);
	public static Item meteoricIronLeggings = registerArmor("meteoric_iron_leggings", TSEArmorMaterials.METEORICIRON, 1, EntityEquipmentSlot.LEGS);
	public static Item meteoricIronBoots = registerArmor("meteoric_iron_boots", TSEArmorMaterials.METEORICIRON, 1, EntityEquipmentSlot.FEET);	
	
	public static Item maduumHelmet = registerArmor("maduum_helmet", TSEArmorMaterials.MADUUM, 1, EntityEquipmentSlot.HEAD);
	public static Item maduumChestplate = registerArmor("maduum_chestplate", TSEArmorMaterials.MADUUM, 1, EntityEquipmentSlot.CHEST);
	public static Item maduumLeggings = registerArmor("maduum_leggings", TSEArmorMaterials.MADUUM, 1, EntityEquipmentSlot.LEGS);
	public static Item maduumBoots = registerArmor("maduum_boots", TSEArmorMaterials.MADUUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item immortaliumHelmet = registerArmor("immortalium_helmet", TSEArmorMaterials.IMMORTALIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item immortaliumChestplate = registerArmor("immortalium_chestplate", TSEArmorMaterials.IMMORTALIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item immortaliumLeggings = registerArmor("immortalium_leggings", TSEArmorMaterials.IMMORTALIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item immortaliumBoots = registerArmor("immortalium_boots", TSEArmorMaterials.IMMORTALIUM, 1, EntityEquipmentSlot.FEET);
	
	private static void registerItem(Item item, String registryName) {
		item.setRegistryName(StringsLib.MODID, registryName);
		item.setUnlocalizedName(registryName);

		// return GameRegistry.register(item);
	}

	public static Item registerMainItem(String registryName, CreativeTabs tab) {
		final Item item = new TSEItem();
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

	public static Item registerAxe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel, float attackSpeed, float damage) {
		final Item item = new TSEAxe(mat, damage, -1F, tab, harvestLevel, registryName);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerAxe(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel, float damage) {
		final Item item = new TSEAxe(mat, damage, -1F, tab, harvestLevel, registryName);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerMattock(float attackSpeed, ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel) {
		final Item item = new TSEMattock(-2.2F, mat, harvestLevel, registryName, tab);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerMattock(ToolMaterial mat, String registryName, CreativeTabs tab, int harvestLevel) {
		final Item item = new TSEMattock(-2.2F, mat, harvestLevel, registryName, tab);
		registerItem(item, registryName);
		return item;
	}

	public static Item registerRemover(String registryName, float attackSpeed, ToolMaterial mat, int harvestLevel, CreativeTabs tab) {
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

	public static Item registerArmor(String registryName, ArmorMaterial mat, int renderIndex, EntityEquipmentSlot equipSlot) {
		final Item item = new TSEArmor(registryName, mat, renderIndex, equipSlot);
		registerItem(item, registryName);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		TheStuffExtension.log("Registering Items...");
		registry.registerAll(goldenStick,

				brightflameStick, brightsteelStick, diamondStick, reforgedGoldStick, magicStick, mithrilStick, mysteriousStick, mysticStick, extranetiumStick, eterniumStick, fantasiumStick, scorniumStick, electrumStick, laeniumStick, magneiumStick, sterlingSilverStick, roseGoldStick, whiteGoldStick, spangoldStick, maduumStick, immortaliumStick,
				ironRod,copperRod, steelRod, tinRod, tyionetiumRod, bronzeRod, mortiumRod, skyIronRod, terriumRod, toslotriumRod, vividiumRod, silverRod, platinumRod, titaniumRod, zincRod, brassRod, leadRod, nickelRod, pewterRod, aluminumRod, mnemiumRod, meteoricIronRod,

				unusableMaterial,
				
				meteoricIronShard,

				exaltedDiamond, bloodDiamond, terraDiamond, lunaDiamond, solDiamond,

				sphaleriteGem,
				
				diamondIngot, copperIngot, steelIngot, tinIngot, tyionetiumIngot, bronzeIngot, brightflameIngot, brightsteelIngot, reforgedGoldIngot, magicIngot, mithrilIngot, mortiumIngot, mysteriousIngot, mysticIngot, skyIronIngot, terriumIngot, toslotriumIngot, vividiumIngot, extranetiumIngot, silverIngot, platinumIngot, titaniumIngot, zincIngot, brassIngot, leadIngot, nickelIngot, pewterIngot, aluminumIngot, mnemiumIngot, eterniumIngot, fantasiumIngot, scorniumIngot, electrumIngot, laeniumIngot, magneiumIngot, sterlingSilverIngot, roseGoldIngot, whiteGoldIngot, spangoldIngot, meteoricIronIngot, maduumIngot, immortaliumIngot,
				
				diamondNugget, copperNugget, steelNugget, tinNugget, tyionetiumNugget, bronzeNugget, brightflameNugget, brightsteelNugget, reforgedGoldNugget, magicNugget, mithrilNugget, mortiumNugget, mysteriousNugget, mysticNugget, skyIronNugget, terriumNugget, toslotriumNugget, vividiumNugget, extranetiumNugget, silverNugget, platinumNugget, titaniumNugget, zincNugget, brassNugget, leadNugget, nickelNugget, pewterNugget, aluminumNugget, mnemiumNugget, eterniumNugget, fantasiumNugget,	scorniumNugget, electrumNugget, laeniumNugget, magneiumNugget, sterlingSilverNugget, roseGoldNugget, whiteGoldNugget, spangoldNugget, meteoricIronNugget, maduumNugget, immortaliumNugget,
				
				justice, corruption, destruction, creation,
				
				copperPickaxe, copperAxe, copperShovel, copperHoe, copperMattock, copperSword,
				steelPickaxe, steelAxe, steelShovel, steelHoe, steelMattock, steelSword,
				tinPickaxe, tinAxe, tinShovel, tinHoe, tinMattock, tinSword,
				tyionetiumPickaxe, tyionetiumAxe, tyionetiumShovel, tyionetiumHoe, tyionetiumMattock, tyionetiumSword,
				bronzePickaxe, bronzeAxe, bronzeShovel, bronzeHoe, bronzeMattock, bronzeSword,
				brightflamePickaxe, brightflameAxe, brightflameShovel, brightflameHoe, brightflameMattock, brightflameSword,
				brightsteelPickaxe, brightsteelAxe, brightsteelShovel, brightsteelHoe, brightsteelMattock, brightsteelSword,
				reforgedGoldPickaxe, reforgedGoldAxe, reforgedGoldShovel, reforgedGoldHoe, reforgedGoldMattock, reforgedGoldSword,
				magicPickaxe, magicAxe, magicShovel, magicHoe, magicMattock, magicSword, 
				mithrilPickaxe, mithrilAxe, mithrilShovel, mithrilHoe, mithrilMattock, mithrilSword,
				mortiumPickaxe, mortiumAxe, mortiumShovel, mortiumHoe, mortiumMattock, mortiumSword,
				mysteriousPickaxe, mysteriousAxe, mysteriousShovel, mysteriousHoe, mysteriousMattock, mysteriousSword,
				mysticPickaxe, mysticAxe, mysticShovel, mysticHoe, mysticMattock, mysticSword,
				skyIronPickaxe, skyIronAxe, skyIronShovel, skyIronHoe, skyIronMattock, skyIronSword,
				terriumPickaxe, terriumAxe, terriumShovel, terriumHoe, terriumMattock, terriumSword,
				vividiumPickaxe, vividiumAxe, vividiumShovel, vividiumHoe, vividiumMattock, vividiumSword,
				extranetiumPickaxe, extranetiumAxe, extranetiumShovel, extranetiumHoe, extranetiumMattock, extranetiumSword,
				silverPickaxe, silverAxe, silverShovel, silverHoe, silverMattock, silverSword,
				platinumPickaxe, platinumAxe, platinumShovel, platinumHoe, platinumMattock, platinumSword,
				titaniumPickaxe, titaniumAxe, titaniumShovel, titaniumHoe, titaniumMattock, titaniumSword,
				zincPickaxe, zincAxe, zincShovel, zincHoe, zincMattock, zincSword,
				brassPickaxe, brassAxe, brassShovel, brassHoe, brassMattock, brassSword,
				leadPickaxe, leadAxe, leadShovel, leadHoe, leadMattock, leadSword,
				nickelPickaxe, nickelAxe, nickelShovel, nickelHoe, nickelMattock, nickelSword,
				pewterPickaxe, pewterAxe, pewterShovel, pewterHoe, pewterMattock, pewterSword,
				aluminumPickaxe, aluminumAxe, aluminumShovel, aluminumHoe, aluminumMattock, aluminumSword,
				mnemiumPickaxe, mnemiumAxe, mnemiumShovel, mnemiumHoe, mnemiumMattock, mnemiumSword,
				eterniumPickaxe, eterniumAxe, eterniumShovel, eterniumHoe, eterniumMattock, eterniumSword,
				fantasiumPickaxe, fantasiumAxe, fantasiumShovel, fantasiumHoe, fantasiumMattock, fantasiumSword,
				scorniumPickaxe, scorniumAxe, scorniumShovel, scorniumHoe, scorniumMattock, scorniumSword,
				electrumPickaxe, electrumAxe, electrumShovel, electrumHoe, electrumMattock, electrumSword,
				laeniumPickaxe, laeniumAxe, laeniumShovel, laeniumHoe, laeniumMattock, laeniumSword,
				magneiumPickaxe, magneiumAxe, magneiumShovel, magneiumHoe, magneiumMattock, magneiumSword,
				sterlingSilverPickaxe, sterlingSilverAxe, sterlingSilverShovel, sterlingSilverHoe, sterlingSilverMattock, sterlingSilverSword,
				roseGoldPickaxe, roseGoldAxe, roseGoldShovel, roseGoldHoe, roseGoldMattock, roseGoldSword,
				whiteGoldPickaxe, whiteGoldAxe, whiteGoldShovel, whiteGoldHoe, whiteGoldMattock, whiteGoldSword,
				spangoldPickaxe, spangoldAxe, spangoldShovel, spangoldHoe, spangoldMattock, spangoldSword,
				meteoricIronPickaxe, meteoricIronAxe, meteoricIronShovel, meteoricIronHoe, meteoricIronMattock, meteoricIronSword,
				maduumPickaxe, maduumAxe, maduumShovel, maduumHoe, maduumMattock, maduumSword,
				immortaliumPickaxe, immortaliumAxe, immortaliumShovel, immortaliumHoe, immortaliumMattock, immortaliumSword,
				
				exaltedDiamondPickaxe, exaltedDiamondAxe, exaltedDiamondShovel, exaltedDiamondHoe, exaltedDiamondMattock, exaltedDiamondSword,
				bloodDiamondPickaxe, bloodDiamondAxe, bloodDiamondShovel, bloodDiamondHoe, bloodDiamondMattock,	bloodDiamondSword,
				terraDiamondPickaxe, terraDiamondAxe, terraDiamondShovel, terraDiamondHoe, terraDiamondMattock,	terraDiamondSword,

				woodMattock, stoneMattock, ironMattock, diamondMattock, goldMattock,

				copperHelmet, copperChestplate, copperLeggings, copperBoots,
				steelHelmet, steelChestplate, steelLeggings, steelBoots,
				tinHelmet, tinChestplate, tinLeggings, tinBoots,
				tyionetiumHelmet, tyionetiumChestplate, tyionetiumLeggings, tyionetiumBoots,
				bronzeHelmet, bronzeChestplate, bronzeLeggings, bronzeBoots,
				brightflameHelmet, brightflameChestplate, brightflameLeggings, brightflameBoots,
				brightsteelHelmet, brightsteelChestplate, brightsteelLeggings, brightsteelBoots,
				reforgedGoldHelmet, reforgedGoldChestplate, reforgedGoldLeggings, reforgedGoldBoots,
				magicHelmet, magicChestplate, magicLeggings, magicBoots,
				mithrilHelmet, mithrilChestplate, mithrilLeggings, mithrilBoots,
				mortiumHelmet, mortiumChestplate, mortiumLeggings, mortiumBoots,
				mysteriousHelmet, mysteriousChestplate, mysteriousLeggings, mysteriousBoots,
				mysticHelmet, mysticChestplate, mysticLeggings, mysticBoots,
				skyIronHelmet, skyIronChestplate, skyIronLeggings, skyIronBoots,
				vividiumHelmet, vividiumChestplate, vividiumLeggings, vividiumBoots,
				extranetiumHelmet, extranetiumChestplate, extranetiumLeggings, extranetiumBoots,
				silverHelmet, silverChestplate, silverLeggings, silverBoots,
				platinumHelmet, platinumChestplate, platinumLeggings, platinumBoots,
				titaniumHelmet, titaniumChestplate, titaniumLeggings, titaniumBoots,
				zincHelmet, zincChestplate, zincLeggings, zincBoots,
				brassHelmet, brassChestplate, brassLeggings, brassBoots,
				pewterHelmet, pewterChestplate, pewterLeggings, pewterBoots,
				leadHelmet, leadChestplate, leadLeggings, leadBoots,
				nickelHelmet, nickelChestplate, nickelLeggings, nickelBoots,
				aluminumHelmet, aluminumChestplate, aluminumLeggings, aluminumBoots,
				mnemiumHelmet, mnemiumChestplate, mnemiumLeggings, mnemiumBoots,
				eterniumHelmet, eterniumChestplate, eterniumLeggings, eterniumBoots,
				fantasiumHelmet, fantasiumChestplate, fantasiumLeggings, fantasiumBoots,
				electrumHelmet, electrumChestplate, electrumLeggings, electrumBoots,
				laeniumHelmet, laeniumChestplate, laeniumLeggings, laeniumBoots,
				magneiumHelmet, magneiumChestplate, magneiumLeggings, magneiumBoots,
				sterlingSilverHelmet, sterlingSilverChestplate, sterlingSilverLeggings, sterlingSilverBoots,
				roseGoldHelmet, roseGoldChestplate, roseGoldLeggings, roseGoldBoots,
				whiteGoldHelmet, whiteGoldChestplate, whiteGoldLeggings, whiteGoldBoots,
				spangoldHelmet, spangoldChestplate, spangoldLeggings, spangoldBoots,
				meteoricIronHelmet, meteoricIronChestplate, meteoricIronLeggings, meteoricIronBoots,
				maduumHelmet, maduumChestplate, maduumLeggings, maduumBoots,
				immortaliumHelmet, immortaliumChestplate, immortaliumLeggings, immortaliumBoots,
				
				exaltedDiamondHelmet, exaltedDiamondChestplate, exaltedDiamondLeggings, exaltedDiamondBoots,
				bloodDiamondHelmet, bloodDiamondChestplate, bloodDiamondLeggings, bloodDiamondBoots,
				terraDiamondHelmet, terraDiamondChestplate, terraDiamondLeggings, terraDiamondBoots
				);


		TheStuffExtension.log("Registered Items");
	}

}
