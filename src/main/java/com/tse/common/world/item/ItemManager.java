package com.tse.common.world.item;

import java.util.ArrayList;
import java.util.List;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.core.library.StringsLib;
import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.material.TSEArmorMaterials;
import com.tse.common.world.item.material.TSEToolMaterials;

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
	
	private static List<Item> registeredItems = new ArrayList<Item>();
	
	public static Item diamondStick = new TSEItem("diamond_stick", TSECreativeTabs.tabMaterials);
	public static Item goldenStick = new TSEItem("golden_stick", TSECreativeTabs.tabMaterials);
	public static Item brightflameStick = new TSEItem("brightflame_stick", TSECreativeTabs.tabMaterials);
	public static Item brightsteelStick = new TSEItem("brightsteel_stick", TSECreativeTabs.tabMaterials);
	public static Item reforgedGoldStick = new TSEItem("reforged_gold_stick", TSECreativeTabs.tabMaterials);
	public static Item magicStick = new TSEItem("magic_stick", TSECreativeTabs.tabMaterials);
	public static Item mithrilStick = new TSEItem("mithril_stick", TSECreativeTabs.tabMaterials);
	public static Item manatheumStick = new TSEItem("manatheum_stick", TSECreativeTabs.tabMaterials);
	public static Item mysteriousStick = new TSEItem("mysterious_stick", TSECreativeTabs.tabMaterials);
	public static Item mysticStick = new TSEItem("mystic_stick", TSECreativeTabs.tabMaterials);
	public static Item extranetiumStick = new TSEItem("extranetium_stick", TSECreativeTabs.tabMaterials);
	public static Item eterniumStick = new TSEItem("eternium_stick", TSECreativeTabs.tabMaterials);
	public static Item fantasiumStick = new TSEItem("fantasium_stick", TSECreativeTabs.tabMaterials);
	public static Item scorniumStick = new TSEItem("scornium_stick", TSECreativeTabs.tabMaterials);
	public static Item electrumStick = new TSEItem("electrum_stick", TSECreativeTabs.tabMaterials);
	public static Item laeniumStick = new TSEItem("laenium_stick", TSECreativeTabs.tabMaterials);
	public static Item magneiumStick = new TSEItem("magneium_stick", TSECreativeTabs.tabMaterials);
	public static Item sterlingSilverStick = new TSEItem("sterling_silver_stick", TSECreativeTabs.tabMaterials);
	public static Item roseGoldStick = new TSEItem("rose_gold_stick", TSECreativeTabs.tabMaterials);
	public static Item whiteGoldStick = new TSEItem("white_gold_stick", TSECreativeTabs.tabMaterials);
	public static Item spangoldStick = new TSEItem("spangold_stick", TSECreativeTabs.tabMaterials);
	public static Item maduumStick = new TSEItem("maduum_stick", TSECreativeTabs.tabMaterials, true);
	public static Item immortaliumStick = new TSEItem("immortalium_stick", TSECreativeTabs.tabMaterials);
	public static Item dreamStick = new TSEItem("dream_stick", TSECreativeTabs.tabMaterials);
	
	public static Item ironRod = new TSEItem("iron_rod", TSECreativeTabs.tabMaterials);
	public static Item copperRod = new TSEItem("copper_rod", TSECreativeTabs.tabMaterials);
	public static Item steelRod = new TSEItem("steel_rod", TSECreativeTabs.tabMaterials);
	public static Item tinRod = new TSEItem("tin_rod", TSECreativeTabs.tabMaterials);
	public static Item tyionetiumRod = new TSEItem("tyionetium_rod", TSECreativeTabs.tabMaterials);
	public static Item bronzeRod = new TSEItem("bronze_rod", TSECreativeTabs.tabMaterials);
	public static Item mortiumRod = new TSEItem("mortium_rod", TSECreativeTabs.tabMaterials);
	public static Item skyIronRod = new TSEItem("sky_iron_rod", TSECreativeTabs.tabMaterials);
	public static Item terriumRod = new TSEItem("terrium_rod", TSECreativeTabs.tabMaterials);
	public static Item toslotriumRod = new TSEItem("toslotrium_rod", TSECreativeTabs.tabMaterials);
	public static Item vividiumRod = new TSEItem("vividium_rod", TSECreativeTabs.tabMaterials);
	public static Item silverRod = new TSEItem("silver_rod", TSECreativeTabs.tabMaterials);
	public static Item platinumRod = new TSEItem("platinum_rod", TSECreativeTabs.tabMaterials);
	public static Item titaniumRod = new TSEItem("titanium_rod", TSECreativeTabs.tabMaterials);
	public static Item zincRod = new TSEItem("zinc_rod", TSECreativeTabs.tabMaterials);
	public static Item brassRod = new TSEItem("brass_rod", TSECreativeTabs.tabMaterials);
	public static Item leadRod = new TSEItem("lead_rod", TSECreativeTabs.tabMaterials);
	public static Item nickelRod = new TSEItem("nickel_rod", TSECreativeTabs.tabMaterials);
	public static Item pewterRod = new TSEItem("pewter_rod", TSECreativeTabs.tabMaterials);
	public static Item aluminumRod = new TSEItem("aluminum_rod", TSECreativeTabs.tabMaterials);
	public static Item mnemiumRod = new TSEItem("mnemium_rod", TSECreativeTabs.tabMaterials);
	public static Item meteoricIronRod = new TSEItem("meteoric_iron_rod", TSECreativeTabs.tabMaterials);
	
	public static Item woodenGear = new TSEItem("wooden_gear", TSECreativeTabs.tabMaterials);
	public static Item stoneGear = new TSEItem("stone_gear", TSECreativeTabs.tabMaterials);
	
	public static Item unusableMaterial = new TSEItem("unusable_material", TSECreativeTabs.tabMaterials);

	public static Item meteoricIronShard = new TSEItem("meteoric_iron_shard", TSECreativeTabs.tabMaterials);
	public static Item everbrightShard = new TSEItem("everbright_shard", TSECreativeTabs.tabMaterials);
	
	public static Item exaltedDiamond = new TSEItem("exalted_diamond", TSECreativeTabs.tabMaterials);
	public static Item bloodDiamond = new TSEItem("blood_diamond", TSECreativeTabs.tabMaterials);
	public static Item terraDiamond = new TSEItem("terra_diamond", TSECreativeTabs.tabMaterials);
	public static Item iceDiamond = new TSEItem("ice_diamond", TSECreativeTabs.tabMaterials);
	public static Item lunaDiamond = new TSEItem("luna_diamond", TSECreativeTabs.tabMaterials);
	public static Item solDiamond = new TSEItem("sol_diamond", TSECreativeTabs.tabMaterials);
	public static Item mysticDiamond = new TSEItem("mystic_diamond", TSECreativeTabs.tabMaterials);
	
	public static Item sphaleriteGem = new TSEItem("sphalerite_gem", TSECreativeTabs.tabMaterials);
	
	public static Item diamondIngot = new TSEItem("diamond_ingot", TSECreativeTabs.tabMaterials);
	public static Item copperIngot = new TSEItem("copper_ingot", TSECreativeTabs.tabMaterials);
	public static Item steelIngot = new TSEItem("steel_ingot", TSECreativeTabs.tabMaterials);
	public static Item tinIngot = new TSEItem("tin_ingot", TSECreativeTabs.tabMaterials);
	public static Item tyionetiumIngot = new TSEItem("tyionetium_ingot", TSECreativeTabs.tabMaterials);
	public static Item bronzeIngot = new TSEItem("bronze_ingot", TSECreativeTabs.tabMaterials);
	public static Item brightflameIngot = new TSEItem("brightflame_ingot", TSECreativeTabs.tabMaterials);
	public static Item brightsteelIngot = new TSEItem("brightsteel_ingot", TSECreativeTabs.tabMaterials);
	public static Item brightheartIngot = new TSEItem("brightheart_ingot", TSECreativeTabs.tabMaterials);
	public static Item reforgedGoldIngot = new TSEItem("reforged_gold_ingot", TSECreativeTabs.tabMaterials);
	public static Item magicIngot = new TSEItem("magic_ingot", TSECreativeTabs.tabMaterials);
	public static Item mithrilIngot = new TSEItem("mithril_ingot", TSECreativeTabs.tabMaterials);
	public static Item manatheumIngot = new TSEItem("manatheum_ingot", TSECreativeTabs.tabMaterials);
	public static Item mortiumIngot = new TSEItem("mortium_ingot", TSECreativeTabs.tabMaterials);
	public static Item mysteriousIngot = new TSEItem("mysterious_ingot", TSECreativeTabs.tabMaterials);
	public static Item mysticIngot = new TSEItem("mystic_ingot", TSECreativeTabs.tabMaterials);
	public static Item skyIronIngot = new TSEItem("sky_iron_ingot", TSECreativeTabs.tabMaterials);
	public static Item terriumIngot = new TSEItem("terrium_ingot", TSECreativeTabs.tabMaterials);
	public static Item toslotriumIngot = new TSEItem("toslotrium_ingot", TSECreativeTabs.tabMaterials);
	public static Item vividiumIngot = new TSEItem("vividium_ingot", TSECreativeTabs.tabMaterials);
	public static Item extranetiumIngot = new TSEItem("extranetium_ingot", TSECreativeTabs.tabMaterials);
	public static Item silverIngot = new TSEItem("silver_ingot", TSECreativeTabs.tabMaterials);
	public static Item platinumIngot = new TSEItem("platinum_ingot", TSECreativeTabs.tabMaterials);
	public static Item titaniumIngot = new TSEItem("titanium_ingot", TSECreativeTabs.tabMaterials);
	public static Item zincIngot = new TSEItem("zinc_ingot", TSECreativeTabs.tabMaterials);
	public static Item brassIngot = new TSEItem("brass_ingot", TSECreativeTabs.tabMaterials);
	public static Item leadIngot = new TSEItem("lead_ingot", TSECreativeTabs.tabMaterials);
	public static Item nickelIngot = new TSEItem("nickel_ingot", TSECreativeTabs.tabMaterials);
	public static Item pewterIngot = new TSEItem("pewter_ingot", TSECreativeTabs.tabMaterials);
	public static Item aluminumIngot = new TSEItem("aluminum_ingot", TSECreativeTabs.tabMaterials);
	public static Item mnemiumIngot = new TSEItem("mnemium_ingot", TSECreativeTabs.tabMaterials);
	public static Item eterniumIngot = new TSEItem("eternium_ingot", TSECreativeTabs.tabMaterials);
	public static Item fantasiumIngot = new TSEItem("fantasium_ingot", TSECreativeTabs.tabMaterials);
	public static Item scorniumIngot = new TSEItem("scornium_ingot", TSECreativeTabs.tabMaterials);
	public static Item electrumIngot = new TSEItem("electrum_ingot", TSECreativeTabs.tabMaterials);
	public static Item laeniumIngot = new TSEItem("laenium_ingot", TSECreativeTabs.tabMaterials);
	public static Item magneiumIngot = new TSEItem("magneium_ingot", TSECreativeTabs.tabMaterials);
	public static Item sterlingSilverIngot = new TSEItem("sterling_silver_ingot", TSECreativeTabs.tabMaterials);
	public static Item roseGoldIngot = new TSEItem("rose_gold_ingot", TSECreativeTabs.tabMaterials);
	public static Item whiteGoldIngot = new TSEItem("white_gold_ingot", TSECreativeTabs.tabMaterials);
	public static Item spangoldIngot = new TSEItem("spangold_ingot", TSECreativeTabs.tabMaterials);
	public static Item meteoricIronIngot = new TSEItem("meteoric_iron_ingot", TSECreativeTabs.tabMaterials);
	public static Item maduumIngot = new TSEItem("maduum_ingot", TSECreativeTabs.tabMaterials, true);
	public static Item immortaliumIngot = new TSEItem("immortalium_ingot", TSECreativeTabs.tabMaterials);
	public static Item dreamIngot = new TSEItem("dream_ingot", TSECreativeTabs.tabMaterials);
	public static Item everbrightIngot = new TSEItem("everbright_ingot", TSECreativeTabs.tabMaterials, true);
	public static Item arcaeumIngot = new TSEItem("arcaeum_ingot", TSECreativeTabs.tabMaterials, true);
	public static Item necromiumIngot = new TSEItem("necromium_ingot", TSECreativeTabs.tabMaterials, true);
	public static Item nightmareIngot = new TSEItem("nightmare_ingot", TSECreativeTabs.tabMaterials, true);
	public static Item coldflameIngot = new TSEItem("coldflame_ingot", TSECreativeTabs.tabMaterials);
	public static Item coldheartIngot = new TSEItem("coldheart_ingot", TSECreativeTabs.tabMaterials);
	public static Item coldsteelIngot = new TSEItem("coldsteel_ingot", TSECreativeTabs.tabMaterials);
	
	public static Item diamondNugget = new TSEItem("diamond_nugget", TSECreativeTabs.tabMaterials);
	public static Item copperNugget = new TSEItem("copper_nugget", TSECreativeTabs.tabMaterials);
	public static Item steelNugget = new TSEItem("steel_nugget", TSECreativeTabs.tabMaterials);
	public static Item tinNugget = new TSEItem("tin_nugget", TSECreativeTabs.tabMaterials);
	public static Item tyionetiumNugget = new TSEItem("tyionetium_nugget", TSECreativeTabs.tabMaterials);
	public static Item bronzeNugget = new TSEItem("bronze_nugget", TSECreativeTabs.tabMaterials);
	public static Item brightflameNugget = new TSEItem("brightflame_nugget", TSECreativeTabs.tabMaterials);
	public static Item brightsteelNugget = new TSEItem("brightsteel_nugget", TSECreativeTabs.tabMaterials);
	public static Item reforgedGoldNugget = new TSEItem("reforged_gold_nugget", TSECreativeTabs.tabMaterials);
	public static Item magicNugget = new TSEItem("magic_nugget", TSECreativeTabs.tabMaterials);
	public static Item mithrilNugget = new TSEItem("mithril_nugget", TSECreativeTabs.tabMaterials);
	public static Item manatheumNugget = new TSEItem("manatheum_nugget", TSECreativeTabs.tabMaterials);
	public static Item mortiumNugget = new TSEItem("mortium_nugget", TSECreativeTabs.tabMaterials);
	public static Item mysteriousNugget = new TSEItem("mysterious_nugget", TSECreativeTabs.tabMaterials);
	public static Item mysticNugget = new TSEItem("mystic_nugget", TSECreativeTabs.tabMaterials);
	public static Item skyIronNugget = new TSEItem("sky_iron_nugget", TSECreativeTabs.tabMaterials);
	public static Item terriumNugget = new TSEItem("terrium_nugget", TSECreativeTabs.tabMaterials);
	public static Item toslotriumNugget = new TSEItem("toslotrium_nugget", TSECreativeTabs.tabMaterials);
	public static Item vividiumNugget = new TSEItem("vividium_nugget", TSECreativeTabs.tabMaterials);
	public static Item extranetiumNugget = new TSEItem("extranetium_nugget", TSECreativeTabs.tabMaterials);
	public static Item silverNugget = new TSEItem("silver_nugget", TSECreativeTabs.tabMaterials);
	public static Item platinumNugget = new TSEItem("platinum_nugget", TSECreativeTabs.tabMaterials);
	public static Item titaniumNugget = new TSEItem("titanium_nugget", TSECreativeTabs.tabMaterials);
	public static Item zincNugget = new TSEItem("zinc_nugget", TSECreativeTabs.tabMaterials);
	public static Item brassNugget = new TSEItem("brass_nugget", TSECreativeTabs.tabMaterials);
	public static Item leadNugget = new TSEItem("lead_nugget", TSECreativeTabs.tabMaterials);
	public static Item nickelNugget = new TSEItem("nickel_nugget", TSECreativeTabs.tabMaterials);
	public static Item pewterNugget = new TSEItem("pewter_nugget", TSECreativeTabs.tabMaterials);
	public static Item aluminumNugget = new TSEItem("aluminum_nugget", TSECreativeTabs.tabMaterials);
	public static Item mnemiumNugget = new TSEItem("mnemium_nugget", TSECreativeTabs.tabMaterials);
	public static Item eterniumNugget = new TSEItem("eternium_nugget", TSECreativeTabs.tabMaterials);
	public static Item fantasiumNugget = new TSEItem("fantasium_nugget", TSECreativeTabs.tabMaterials);
	public static Item scorniumNugget = new TSEItem("scornium_nugget", TSECreativeTabs.tabMaterials);
	public static Item electrumNugget = new TSEItem("electrum_nugget", TSECreativeTabs.tabMaterials);
	public static Item laeniumNugget = new TSEItem("laenium_nugget", TSECreativeTabs.tabMaterials);
	public static Item magneiumNugget = new TSEItem("magneium_nugget", TSECreativeTabs.tabMaterials);
	public static Item sterlingSilverNugget = new TSEItem("sterling_silver_nugget", TSECreativeTabs.tabMaterials);
	public static Item roseGoldNugget = new TSEItem("rose_gold_nugget", TSECreativeTabs.tabMaterials);
	public static Item whiteGoldNugget = new TSEItem("white_gold_nugget", TSECreativeTabs.tabMaterials);
	public static Item spangoldNugget = new TSEItem("spangold_nugget", TSECreativeTabs.tabMaterials);
	public static Item meteoricIronNugget = new TSEItem("meteoric_iron_nugget", TSECreativeTabs.tabMaterials);
	public static Item maduumNugget = new TSEItem("maduum_nugget", TSECreativeTabs.tabMaterials, true);
	public static Item immortaliumNugget = new TSEItem("immortalium_nugget", TSECreativeTabs.tabMaterials);
	public static Item dreamNugget = new TSEItem("dream_nugget", TSECreativeTabs.tabMaterials);
	public static Item everbrightNugget = new TSEItem("everbright_nugget", TSECreativeTabs.tabMaterials, true);
	
	// End Materials

	// Start Tools
	// Copper
	public static Item copperPickaxe = new TSEPickaxe(TSEToolMaterials.COPPER, "copper_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item copperAxe = new TSEAxe(TSEToolMaterials.COPPER, "copper_axe", TSECreativeTabs.tabTools, 2, 1F, 5.0F);
	//public static Item copperMattock = new TSEMattock(-2.2F, TSEToolMaterials.COPPER, "copper_mattock", TSECreativeTabs.tabTools, 2);
	public static Item copperShovel = new TSESpade(TSEToolMaterials.COPPER, "copper_shovel", TSECreativeTabs.tabTools, 2);
	public static Item copperHoe = new TSEHoe(TSEToolMaterials.COPPER, "copper_hoe", TSECreativeTabs.tabTools, 2);
	// Copper

	public static Item bronzePickaxe = new TSEPickaxe(TSEToolMaterials.BRONZE, "bronze_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item bronzeAxe = new TSEAxe(TSEToolMaterials.BRONZE, "bronze_axe", TSECreativeTabs.tabTools, 3, 1F, 4.0F);
	//public static Item bronzeMattock = new TSEMattock(-2.2F, TSEToolMaterials.BRONZE, "bronze_mattock", TSECreativeTabs.tabTools, 3);
	public static Item bronzeShovel = new TSESpade(TSEToolMaterials.BRONZE, "bronze_shovel", TSECreativeTabs.tabTools, 3);
	public static Item bronzeHoe = new TSEHoe(TSEToolMaterials.BRONZE, "bronze_hoe", TSECreativeTabs.tabTools, 3);

	public static Item magicPickaxe = new TSEPickaxe(TSEToolMaterials.MAGIC, "magic_pickaxe", TSECreativeTabs.tabTools, 6);
	public static Item magicAxe = new TSEAxe(TSEToolMaterials.MAGIC, "magic_axe", TSECreativeTabs.tabTools, 6, 1F, 10.0F);
	//public static Item magicMattock = new TSEMattock(-2.2F, TSEToolMaterials.MAGIC, "magic_mattock", TSECreativeTabs.tabTools, 6);
	public static Item magicShovel = new TSESpade(TSEToolMaterials.MAGIC, "magic_shovel", TSECreativeTabs.tabTools, 6);
	public static Item magicHoe = new TSEHoe(TSEToolMaterials.MAGIC, "magic_hoe", TSECreativeTabs.tabTools, 6);

	public static Item mithrilPickaxe = new TSEItem("mithril_pickaxe", TSECreativeTabs.tabTools);//new TSEPickaxe(TSEToolMaterials.MITHRIL, "mithril_pickaxe", TSECreativeTabs.tabTools, 7);
	public static Item mithrilAxe = new TSEItem("mithril_axe", TSECreativeTabs.tabTools);//new TSEAxe(TSEToolMaterials.MITHRIL, "mithril_axe", TSECreativeTabs.tabTools, 7, 1F, 15.0F);
	//public static Item mithrilMattock = new TSEItem("mithril_mattock", TSECreativeTabs.tabTools);//new TSEMattock(-2.2F, TSEToolMaterials.MITHRIL, "mithril_mattock", TSECreativeTabs.tabTools, 7);
	public static Item mithrilShovel = new TSEItem("mithril_shovel", TSECreativeTabs.tabTools);//new TSESpade(TSEToolMaterials.MITHRIL, "mithril_shovel", TSECreativeTabs.tabTools, 7);
	public static Item mithrilHoe = new TSEItem("mithril_hoe", TSECreativeTabs.tabTools);//new TSEHoe(TSEToolMaterials.MITHRIL, "mithril_hoe", TSECreativeTabs.tabTools, 7);
	
	public static Item manatheumPickaxe = new TSEPickaxe(TSEToolMaterials.MANATHEUM, "manatheum_pickaxe", TSECreativeTabs.tabTools, 7);
	public static Item manatheumAxe = new TSEAxe(TSEToolMaterials.MANATHEUM, "manatheum_axe", TSECreativeTabs.tabTools, 7, 1F, 15.0F);
	//public static Item manatheumMattock = new TSEMattock(-2.2F, TSEToolMaterials.MANATHEUM, "manatheum_mattock", TSECreativeTabs.tabTools, 7);
	public static Item manatheumShovel = new TSESpade(TSEToolMaterials.MANATHEUM, "manatheum_shovel", TSECreativeTabs.tabTools, 7);
	public static Item manatheumHoe = new TSEHoe(TSEToolMaterials.MANATHEUM, "manatheum_hoe", TSECreativeTabs.tabTools, 7);

	public static Item mortiumPickaxe = new TSEPickaxe(TSEToolMaterials.MORTIUM, "mortium_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item mortiumAxe = new TSEAxe(TSEToolMaterials.MORTIUM, "mortium_axe", TSECreativeTabs.tabTools, 4, 1F, 4.0F);
	//public static Item mortiumMattock = new TSEMattock(-2.2F, TSEToolMaterials.MORTIUM, "mortium_mattock", TSECreativeTabs.tabTools, 4);
	public static Item mortiumShovel = new TSESpade(TSEToolMaterials.MORTIUM, "mortium_shovel", TSECreativeTabs.tabTools, 4);
	public static Item mortiumHoe = new TSEHoe(TSEToolMaterials.MORTIUM, "mortium_hoe", TSECreativeTabs.tabTools, 4);

	public static Item mysteriousPickaxe = new TSEPickaxe(TSEToolMaterials.MYSTERIOUS, "mysterious_pickaxe", TSECreativeTabs.tabTools, 6);
	public static Item mysteriousAxe = new TSEAxe(TSEToolMaterials.MYSTERIOUS, "mysterious_axe", TSECreativeTabs.tabTools, 6, 1F, 11F);
	//public static Item mysteriousMattock = new TSEMattock(-2.2F, TSEToolMaterials.MYSTERIOUS, "mysterious_mattock", TSECreativeTabs.tabTools, 6);
	public static Item mysteriousShovel = new TSESpade(TSEToolMaterials.MYSTERIOUS, "mysterious_shovel", TSECreativeTabs.tabTools, 6);
	public static Item mysteriousHoe = new TSEHoe(TSEToolMaterials.MYSTERIOUS, "mysterious_hoe", TSECreativeTabs.tabTools, 6);

	public static Item mysticPickaxe = new TSEPickaxe(TSEToolMaterials.MYSTIC, "mystic_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item mysticAxe = new TSEAxe(TSEToolMaterials.MYSTIC, "mystic_axe", TSECreativeTabs.tabTools, 5, 1F, 7F);
	//public static Item mysticMattock = new TSEMattock(-2.2F, TSEToolMaterials.MYSTIC, "mystic_mattock", TSECreativeTabs.tabTools, 5);
	public static Item mysticShovel = new TSESpade(TSEToolMaterials.MYSTIC, "mystic_shovel", TSECreativeTabs.tabTools, 5);
	public static Item mysticHoe = new TSEHoe(TSEToolMaterials.MYSTIC, "mystic_hoe", TSECreativeTabs.tabTools, 5);

	public static Item skyIronPickaxe = new TSEPickaxe(TSEToolMaterials.SKYIRON, "sky_iron_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item skyIronAxe = new TSEAxe(TSEToolMaterials.SKYIRON, "sky_iron_axe", TSECreativeTabs.tabTools, 2, 1F, 2F);
	//public static Item skyIronMattock = new TSEMattock(-2.2F, TSEToolMaterials.SKYIRON, "sky_iron_mattock", TSECreativeTabs.tabTools, 2);
	public static Item skyIronShovel = new TSESpade(TSEToolMaterials.SKYIRON, "sky_iron_shovel", TSECreativeTabs.tabTools, 2);
	public static Item skyIronHoe = new TSEHoe(TSEToolMaterials.SKYIRON, "sky_iron_hoe", TSECreativeTabs.tabTools, 2);

	public static Item terriumPickaxe = new TSEPickaxe(TSEToolMaterials.TERRIUM, "terrium_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item terriumAxe = new TSEAxe(TSEToolMaterials.TERRIUM, "terrium_axe", TSECreativeTabs.tabTools, 5, 1F, 4.0F);
	//public static Item terriumMattock = new TSEMattock(-2.2F, TSEToolMaterials.TERRIUM, "terrium_mattock", TSECreativeTabs.tabTools, 5);
	public static Item terriumShovel = new TSESpade(TSEToolMaterials.TERRIUM, "terrium_shovel", TSECreativeTabs.tabTools, 5);
	public static Item terriumHoe = new TSEHoe(TSEToolMaterials.TERRIUM, "terrium_hoe", TSECreativeTabs.tabTools, 5);

	public static Item vividiumPickaxe = new TSEPickaxe(TSEToolMaterials.VIVIDIUM, "vividium_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item vividiumAxe = new TSEAxe(TSEToolMaterials.VIVIDIUM, "vividium_axe", TSECreativeTabs.tabTools, 4, 1F, 4F);
	//public static Item vividiumMattock = new TSEMattock(-2.2F, TSEToolMaterials.VIVIDIUM, "vividium_mattock", TSECreativeTabs.tabTools, 4);
	public static Item vividiumShovel = new TSESpade(TSEToolMaterials.VIVIDIUM, "vividium_shovel", TSECreativeTabs.tabTools, 4);
	public static Item vividiumHoe = new TSEHoe(TSEToolMaterials.VIVIDIUM, "vividium_hoe", TSECreativeTabs.tabTools, 4);

	// Terra Diamond
	public static Item terraDiamondPickaxe = new TSEPickaxe(TSEToolMaterials.TDIAMOND, "terra_diamond_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondAxe = new TSEAxe(TSEToolMaterials.TDIAMOND, "terra_diamond_axe", TSECreativeTabs.tabTools, 4, 1F, 5F);
	//public static Item terraDiamondMattock = new TSEMattock(-2.0F, TSEToolMaterials.TDIAMOND, "terra_diamond_mattock", TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondShovel = new TSESpade(TSEToolMaterials.TDIAMOND, "terra_diamond_shovel", TSECreativeTabs.tabTools, 4);
	public static Item terraDiamondHoe = new TSEHoe(TSEToolMaterials.TDIAMOND, "terra_diamond_hoe", TSECreativeTabs.tabTools, 4);
	// Terra Diamond

	public static Item tyionetiumPickaxe = new TSEPickaxe(TSEToolMaterials.TYIONETIUM, "tyionetium_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumAxe = new TSEAxe(TSEToolMaterials.TYIONETIUM, "tyionetium_axe", TSECreativeTabs.tabTools, 5, 1F, 7F);
	//public static Item tyionetiumMattock = new TSEMattock(-2.2F, TSEToolMaterials.TYIONETIUM, "tyionetium_mattock", TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumShovel = new TSESpade(TSEToolMaterials.TYIONETIUM, "tyionetium_shovel", TSECreativeTabs.tabTools, 5);
	public static Item tyionetiumHoe = new TSEHoe(TSEToolMaterials.TYIONETIUM, "tyionetium_hoe", TSECreativeTabs.tabTools, 5);

	public static Item brightflamePickaxe = new TSEPickaxe(TSEToolMaterials.BRIGHTFLAME, "brightflame_pickaxe", TSECreativeTabs.tabTools, 6);
	public static Item brightflameAxe = new TSEAxe(ToolMaterial.DIAMOND, "brightflame_axe", TSECreativeTabs.tabTools, 6, 1F, 9F);
	//public static Item brightflameMattock = new TSEMattock(-2.2F, TSEToolMaterials.BRIGHTFLAME, "brightflame_mattock", TSECreativeTabs.tabTools, 6);
	public static Item brightflameShovel = new TSESpade(TSEToolMaterials.BRIGHTFLAME, "brightflame_shovel", TSECreativeTabs.tabTools, 6);
	public static Item brightflameHoe = new TSEHoe(TSEToolMaterials.BRIGHTFLAME, "brightflame_hoe", TSECreativeTabs.tabTools, 6);

	public static Item brightsteelPickaxe = new TSEPickaxe(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_pickaxe", TSECreativeTabs.tabTools, 6);
	public static Item brightsteelAxe = new TSEAxe(ToolMaterial.DIAMOND, "brightsteel_axe", TSECreativeTabs.tabTools, 6, 1F, 4F);
	//public static Item brightsteelMattock = new TSEMattock(-2.2F, TSEToolMaterials.BRIGHTSTEEL, "brightsteel_mattock", TSECreativeTabs.tabTools, 6);
	public static Item brightsteelShovel = new TSESpade(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_shovel", TSECreativeTabs.tabTools, 6);
	public static Item brightsteelHoe = new TSEHoe(TSEToolMaterials.BRIGHTSTEEL, "brightsteel_hoe", TSECreativeTabs.tabTools, 6);

	public static Item extranetiumPickaxe = new TSEPickaxe(TSEToolMaterials.EXTRANETIUM, "extranetium_pickaxe", TSECreativeTabs.tabTools, 8);
	public static Item extranetiumAxe = new TSEAxe(TSEToolMaterials.EXTRANETIUM, "extranetium_axe", TSECreativeTabs.tabTools, 8, 1F, 20F);
	//public static Item extranetiumMattock = new TSEMattock(-2.2F, TSEToolMaterials.EXTRANETIUM, "extranetium_mattock", TSECreativeTabs.tabTools, 8);
	public static Item extranetiumShovel = new TSESpade(TSEToolMaterials.EXTRANETIUM, "extranetium_shovel", TSECreativeTabs.tabTools, 8);
	public static Item extranetiumHoe = new TSEHoe(TSEToolMaterials.EXTRANETIUM, "extranetium_hoe", TSECreativeTabs.tabTools, 8);

	public static Item steelPickaxe = new TSEPickaxe(TSEToolMaterials.STEEL, "steel_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item steelAxe = new TSEAxe(TSEToolMaterials.STEEL, "steel_axe", TSECreativeTabs.tabTools, 3, 1F, 5F);
	public static Item steelShovel = new TSESpade(TSEToolMaterials.STEEL, "steel_shovel", TSECreativeTabs.tabTools, 3);
	public static Item steelHoe = new TSEHoe(TSEToolMaterials.STEEL, "steel_hoe", TSECreativeTabs.tabTools, 3);
	//public static Item steelMattock = new TSEMattock(-2.2F, TSEToolMaterials.STEEL, "steel_mattock", TSECreativeTabs.tabTools, 3);

	public static Item titaniumPickaxe = new TSEPickaxe(TSEToolMaterials.TITANIUM, "titanium_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item titaniumAxe = new TSEAxe(TSEToolMaterials.TITANIUM, "titanium_axe", TSECreativeTabs.tabTools, 3, 1F, 6F);
	public static Item titaniumShovel = new TSESpade(TSEToolMaterials.TITANIUM, "titanium_shovel", TSECreativeTabs.tabTools, 3);
	public static Item titaniumHoe = new TSEHoe(TSEToolMaterials.TITANIUM, "titanium_hoe", TSECreativeTabs.tabTools, 3);
	//public static Item titaniumMattock = new TSEMattock(-2.2F, TSEToolMaterials.TITANIUM, "titanium_mattock", TSECreativeTabs.tabTools, 3);

	public static Item silverPickaxe = new TSEPickaxe(TSEToolMaterials.SILVER, "silver_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item silverAxe = new TSEAxe(TSEToolMaterials.SILVER, "silver_axe", TSECreativeTabs.tabTools, 0, 1F, 1F);
	public static Item silverShovel = new TSESpade(TSEToolMaterials.SILVER, "silver_shovel", TSECreativeTabs.tabTools, 0);
	public static Item silverHoe = new TSEHoe(TSEToolMaterials.SILVER, "silver_hoe", TSECreativeTabs.tabTools, 0);
	//public static Item silverMattock = new TSEMattock(-2.2F, TSEToolMaterials.SILVER, "silver_mattock", TSECreativeTabs.tabTools, 0);

	public static Item exaltedDiamondPickaxe = new TSEPickaxe(TSEToolMaterials.EDIAMOND, "exalted_diamond_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item exaltedDiamondAxe = new TSEAxe(TSEToolMaterials.EDIAMOND, "exalted_diamond_axe", TSECreativeTabs.tabTools, 4, 1F, 6F);
	public static Item exaltedDiamondShovel = new TSESpade(TSEToolMaterials.EDIAMOND, "exalted_diamond_shovel", TSECreativeTabs.tabTools, 4);
	public static Item exaltedDiamondHoe = new TSEHoe(TSEToolMaterials.EDIAMOND, "exalted_diamond_hoe", TSECreativeTabs.tabTools, 4);
	//public static Item exaltedDiamondMattock = new TSEMattock(-2.2F, TSEToolMaterials.EDIAMOND, "exalted_diamond_mattock", TSECreativeTabs.tabTools, 4);

	public static Item bloodDiamondPickaxe = new TSEPickaxe(TSEToolMaterials.BDIAMOND, "blood_diamond_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item bloodDiamondAxe = new TSEAxe(TSEToolMaterials.BDIAMOND, "blood_diamond_axe", TSECreativeTabs.tabTools, 4, 4F, 4F);
	public static Item bloodDiamondShovel = new TSESpade(TSEToolMaterials.BDIAMOND, "blood_diamond_shovel", TSECreativeTabs.tabTools, 4);
	public static Item bloodDiamondHoe = new TSEHoe(TSEToolMaterials.BDIAMOND, "blood_diamond_hoe", TSECreativeTabs.tabTools, 4);
	//public static Item bloodDiamondMattock = new TSEMattock(-2.2F, TSEToolMaterials.BDIAMOND, "blood_diamond_mattock", TSECreativeTabs.tabTools, 4);

	public static Item platinumPickaxe = new TSEPickaxe(TSEToolMaterials.PLATINUM, "platinum_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item platinumAxe = new TSEAxe(TSEToolMaterials.PLATINUM, "platinum_axe", TSECreativeTabs.tabTools, 0, 2F, 2F);
	public static Item platinumShovel = new TSESpade(TSEToolMaterials.PLATINUM, "platinum_shovel", TSECreativeTabs.tabTools, 0);
	public static Item platinumHoe = new TSEHoe(TSEToolMaterials.PLATINUM, "platinum_hoe", TSECreativeTabs.tabTools, 0);
	//public static Item platinumMattock = new TSEMattock(-2.2F, TSEToolMaterials.PLATINUM, "platinum_mattock", TSECreativeTabs.tabTools, 0);

	public static Item tinPickaxe = new TSEPickaxe(TSEToolMaterials.TIN, "tin_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item tinAxe = new TSEAxe(TSEToolMaterials.TIN, "tin_axe", TSECreativeTabs.tabTools, 1, 1F, 1F);
	public static Item tinShovel = new TSESpade(TSEToolMaterials.TIN, "tin_shovel", TSECreativeTabs.tabTools, 1);
	public static Item tinHoe = new TSEHoe(TSEToolMaterials.TIN, "tin_hoe", TSECreativeTabs.tabTools, 1);
	//public static Item tinMattock = new TSEMattock(-2.2F, TSEToolMaterials.TIN, "tin_mattock", TSECreativeTabs.tabTools, 1);

	public static Item pewterPickaxe = new TSEPickaxe(TSEToolMaterials.PEWTER, "pewter_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item pewterAxe = new TSEAxe(TSEToolMaterials.PEWTER, "pewter_axe", TSECreativeTabs.tabTools, 3, 3.0F, 3.0F);
	public static Item pewterShovel = new TSESpade(TSEToolMaterials.PEWTER, "pewter_shovel", TSECreativeTabs.tabTools, 3);
	public static Item pewterHoe = new TSEHoe(TSEToolMaterials.PEWTER, "pewter_hoe", TSECreativeTabs.tabTools, 3);
	//public static Item pewterMattock = new TSEMattock(-2.2F, TSEToolMaterials.PEWTER, "pewter_mattock", TSECreativeTabs.tabTools, 3);

	public static Item mnemiumPickaxe = new TSEPickaxe(TSEToolMaterials.MNEMIUM, "mnemium_pickaxe", TSECreativeTabs.tabTools, 9);
	public static Item mnemiumAxe = new TSEAxe(TSEToolMaterials.MNEMIUM, "mnemium_axe", TSECreativeTabs.tabTools, 9, 30F, 30F);
	public static Item mnemiumShovel = new TSESpade(TSEToolMaterials.MNEMIUM, "mnemium_shovel", TSECreativeTabs.tabTools, 9);
	public static Item mnemiumHoe = new TSEHoe(TSEToolMaterials.MNEMIUM, "mnemium_hoe", TSECreativeTabs.tabTools, 9);
	//public static Item mnemiumMattock = new TSEMattock(-2.2F, TSEToolMaterials.MNEMIUM, "mnemium_mattock", TSECreativeTabs.tabTools, 9);

	public static Item aluminumPickaxe = new TSEPickaxe(TSEToolMaterials.ALUMINUM, "aluminum_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item aluminumAxe = new TSEAxe(TSEToolMaterials.ALUMINUM, "aluminum_axe", TSECreativeTabs.tabTools, 1, 3F, 3F);
	public static Item aluminumShovel = new TSESpade(TSEToolMaterials.ALUMINUM, "aluminum_shovel", TSECreativeTabs.tabTools, 1);
	public static Item aluminumHoe = new TSEHoe(TSEToolMaterials.ALUMINUM, "aluminum_hoe", TSECreativeTabs.tabTools, 1);
	//public static Item aluminumMattock = new TSEMattock(-2.2F, TSEToolMaterials.ALUMINUM, "aluminum_mattock", TSECreativeTabs.tabTools, 1);

	public static Item eterniumPickaxe = new TSEPickaxe(TSEToolMaterials.ETERNIUM, "eternium_pickaxe", TSECreativeTabs.tabTools, 10);
	public static Item eterniumAxe = new TSEAxe(TSEToolMaterials.ETERNIUM, "eternium_axe", TSECreativeTabs.tabTools, 10, 90.0F, 60.0F);
	public static Item eterniumShovel = new TSESpade(TSEToolMaterials.ETERNIUM, "eternium_shovel", TSECreativeTabs.tabTools, 10);
	public static Item eterniumHoe = new TSEHoe(TSEToolMaterials.ETERNIUM, "eternium_hoe", TSECreativeTabs.tabTools, 10);
	//public static Item eterniumMattock = new TSEMattock(-2.2F, TSEToolMaterials.ETERNIUM, "eternium_mattock", TSECreativeTabs.tabTools, 10);
	
	public static Item reforgedGoldPickaxe = new TSEPickaxe(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item reforgedGoldAxe = new TSEAxe(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_axe", TSECreativeTabs.tabTools, 2, 2.0F, 2.0F);
	public static Item reforgedGoldShovel = new TSESpade(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_shovel", TSECreativeTabs.tabTools, 2);
	public static Item reforgedGoldHoe = new TSEHoe(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_hoe", TSECreativeTabs.tabTools, 2);
	//public static Item reforgedGoldMattock = new TSEMattock(-2.2F, TSEToolMaterials.REFORGEDGOLD, "reforged_gold_mattock", TSECreativeTabs.tabTools, 2);
	
	public static Item zincPickaxe = new TSEPickaxe(TSEToolMaterials.ZINC, "zinc_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item zincAxe = new TSEAxe(TSEToolMaterials.ZINC, "zinc_axe", TSECreativeTabs.tabTools, 1, 0.0F, 1.0F);
	public static Item zincShovel = new TSESpade(TSEToolMaterials.ZINC, "zinc_shovel", TSECreativeTabs.tabTools, 1);
	public static Item zincHoe = new TSEHoe(TSEToolMaterials.ZINC, "zinc_hoe", TSECreativeTabs.tabTools, 1);
	//public static Item zincMattock = new TSEMattock(-2.2F, TSEToolMaterials.ZINC, "zinc_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item brassPickaxe = new TSEPickaxe(TSEToolMaterials.BRASS, "brass_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item brassAxe = new TSEAxe(TSEToolMaterials.BRASS, "brass_axe", TSECreativeTabs.tabTools, 2, 1.5F, 1.5F);
	public static Item brassShovel = new TSESpade(TSEToolMaterials.BRASS, "brass_shovel", TSECreativeTabs.tabTools, 2);
	public static Item brassHoe = new TSEHoe(TSEToolMaterials.BRASS, "brass_hoe", TSECreativeTabs.tabTools, 2);
	//public static Item brassMattock = new TSEMattock(-2.2F, TSEToolMaterials.BRASS, "brass_mattock", TSECreativeTabs.tabTools, 2);
	
	public static Item leadPickaxe = new TSEPickaxe(TSEToolMaterials.LEAD, "lead_pickaxe", TSECreativeTabs.tabTools, 3);
	public static Item leadAxe = new TSEAxe(TSEToolMaterials.LEAD, "lead_axe", TSECreativeTabs.tabTools, 3, 3.2F, 2.3F);
	public static Item leadShovel = new TSESpade(TSEToolMaterials.LEAD, "lead_shovel", TSECreativeTabs.tabTools, 3);
	public static Item leadHoe = new TSEHoe(TSEToolMaterials.LEAD, "lead_hoe", TSECreativeTabs.tabTools, 3);
	//public static Item leadMattock = new TSEMattock(-2.2F, TSEToolMaterials.LEAD, "lead_mattock", TSECreativeTabs.tabTools, 3);
	
	public static Item nickelPickaxe = new TSEPickaxe(TSEToolMaterials.NICKEL, "nickel_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item nickelAxe = new TSEAxe(TSEToolMaterials.NICKEL, "nickel_axe", TSECreativeTabs.tabTools, 1, 0.0F, 1.0F);
	public static Item nickelShovel = new TSESpade(TSEToolMaterials.NICKEL, "nickel_shovel", TSECreativeTabs.tabTools, 1);
	public static Item nickelHoe = new TSEHoe(TSEToolMaterials.NICKEL, "nickel_hoe", TSECreativeTabs.tabTools, 1);
	//public static Item nickelMattock = new TSEMattock(-2.2F, TSEToolMaterials.NICKEL, "nickel_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item fantasiumPickaxe = new TSEPickaxe(TSEToolMaterials.FANTASIUM, "fantasium_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item fantasiumAxe = new TSEAxe(TSEToolMaterials.FANTASIUM, "fantasium_axe", TSECreativeTabs.tabTools, 5, 8.0F, 8.0F);
	public static Item fantasiumShovel = new TSESpade(TSEToolMaterials.FANTASIUM, "fantasium_shovel", TSECreativeTabs.tabTools, 5);
	public static Item fantasiumHoe = new TSEHoe(TSEToolMaterials.FANTASIUM, "fantasium_hoe", TSECreativeTabs.tabTools, 5);
	//public static Item fantasiumMattock = new TSEMattock(-2.2F, TSEToolMaterials.FANTASIUM, "fantasium_mattock", TSECreativeTabs.tabTools, 5);
	
	public static Item scorniumPickaxe = new TSEPickaxe(TSEToolMaterials.SCORNIUM, "scornium_pickaxe", TSECreativeTabs.tabTools, 5);
	public static Item scorniumAxe = new TSEAxe(TSEToolMaterials.SCORNIUM, "scornium_axe", TSECreativeTabs.tabTools, 5, 9.0F, 9.0F);
	public static Item scorniumShovel = new TSESpade(TSEToolMaterials.SCORNIUM, "scornium_shovel", TSECreativeTabs.tabTools, 5);
	public static Item scorniumHoe = new TSEHoe(TSEToolMaterials.SCORNIUM, "scornium_hoe", TSECreativeTabs.tabTools, 5);
	//public static Item scorniumMattock = new TSEMattock(-2.2F, TSEToolMaterials.SCORNIUM, "scornium_mattock", TSECreativeTabs.tabTools, 5);
	
	public static Item electrumPickaxe = new TSEPickaxe(TSEToolMaterials.ELECTRUM, "electrum_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item electrumAxe = new TSEAxe(TSEToolMaterials.ELECTRUM, "electrum_axe", TSECreativeTabs.tabTools, 1, 0.5F, 3.0F);
	public static Item electrumShovel = new TSESpade(TSEToolMaterials.ELECTRUM, "electrum_shovel", TSECreativeTabs.tabTools, 1);
	public static Item electrumHoe = new TSEHoe(TSEToolMaterials.ELECTRUM, "electrum_hoe", TSECreativeTabs.tabTools, 1);
	//public static Item electrumMattock = new TSEMattock(-2.2F, TSEToolMaterials.ELECTRUM, "electrum_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item laeniumPickaxe = new TSEPickaxe(TSEToolMaterials.LAENIUM, "laenium_pickaxe", TSECreativeTabs.tabTools, 4);
	public static Item laeniumAxe = new TSEAxe(TSEToolMaterials.LAENIUM, "laenium_axe", TSECreativeTabs.tabTools, 4, 2.0F, 4.0F);
	public static Item laeniumShovel = new TSESpade(TSEToolMaterials.LAENIUM, "laenium_shovel", TSECreativeTabs.tabTools, 4);
	public static Item laeniumHoe = new TSEHoe(TSEToolMaterials.LAENIUM, "laenium_hoe", TSECreativeTabs.tabTools, 4);
	//public static Item laeniumMattock = new TSEMattock(-2.2F, TSEToolMaterials.LAENIUM, "laenium_mattock", TSECreativeTabs.tabTools, 4);
	
	public static Item magneiumPickaxe = new TSEPickaxe(TSEToolMaterials.MAGNEIUM, "magneium_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item magneiumAxe = new TSEAxe(TSEToolMaterials.MAGNEIUM, "magneium_axe", TSECreativeTabs.tabTools, 2, 1.0F, 4.0F);
	public static Item magneiumShovel = new TSESpade(TSEToolMaterials.MAGNEIUM, "magneium_shovel", TSECreativeTabs.tabTools, 2);
	public static Item magneiumHoe = new TSEHoe(TSEToolMaterials.MAGNEIUM, "magneium_hoe", TSECreativeTabs.tabTools, 2);
	//public static Item magneiumMattock = new TSEMattock(-2.2F, TSEToolMaterials.MAGNEIUM, "magneium_mattock", TSECreativeTabs.tabTools, 2);
	
	public static Item sterlingSilverPickaxe = new TSEPickaxe(TSEToolMaterials.STSILVER, "sterling_silver_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item sterlingSilverAxe = new TSEAxe(TSEToolMaterials.STSILVER, "sterling_silver_axe", TSECreativeTabs.tabTools, 1, 0.0F, 2.0F);
	public static Item sterlingSilverShovel = new TSESpade(TSEToolMaterials.STSILVER, "sterling_silver_shovel", TSECreativeTabs.tabTools, 1);
	public static Item sterlingSilverHoe = new TSEHoe(TSEToolMaterials.STSILVER, "sterling_silver_hoe", TSECreativeTabs.tabTools, 1);
	//public static Item sterlingSilverMattock = new TSEMattock(-2.2F, TSEToolMaterials.STSILVER, "sterling_silver_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item roseGoldPickaxe = new TSEPickaxe(ToolMaterial.GOLD, "rose_gold_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item roseGoldAxe = new TSEAxe(ToolMaterial.GOLD, "rose_gold_axe", TSECreativeTabs.tabTools, 0, 0.0F, 2.0F);
	public static Item roseGoldShovel = new TSESpade(ToolMaterial.GOLD, "rose_gold_shovel", TSECreativeTabs.tabTools, 0);
	public static Item roseGoldHoe = new TSEHoe(ToolMaterial.GOLD, "rose_gold_hoe", TSECreativeTabs.tabTools, 0);
	//public static Item roseGoldMattock = new TSEMattock(-2.2F, ToolMaterial.GOLD, "rose_gold_mattock", TSECreativeTabs.tabTools, 0);
	
	public static Item whiteGoldPickaxe = new TSEPickaxe(ToolMaterial.GOLD, "white_gold_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item whiteGoldAxe = new TSEAxe(ToolMaterial.GOLD, "white_gold_axe", TSECreativeTabs.tabTools, 0, 0.0F, 2.0F);
	public static Item whiteGoldShovel = new TSESpade(ToolMaterial.GOLD, "white_gold_shovel", TSECreativeTabs.tabTools, 0);
	public static Item whiteGoldHoe = new TSEHoe(ToolMaterial.GOLD, "white_gold_hoe", TSECreativeTabs.tabTools, 0);
	//public static Item whiteGoldMattock = new TSEMattock(-2.2F, ToolMaterial.GOLD, "white_gold_mattock", TSECreativeTabs.tabTools, 0);
	
	public static Item spangoldPickaxe = new TSEPickaxe(ToolMaterial.GOLD, "spangold_pickaxe", TSECreativeTabs.tabTools, 0);
	public static Item spangoldAxe = new TSEAxe(ToolMaterial.GOLD, "spangold_axe", TSECreativeTabs.tabTools, 0, 0.0F, 2.0F);
	public static Item spangoldShovel = new TSESpade(ToolMaterial.GOLD, "spangold_shovel", TSECreativeTabs.tabTools, 0);
	public static Item spangoldHoe = new TSEHoe(ToolMaterial.GOLD, "spangold_hoe", TSECreativeTabs.tabTools, 0);
	//public static Item spangoldMattock = new TSEMattock(-2.2F, ToolMaterial.GOLD, "spangold_mattock", TSECreativeTabs.tabTools, 0);
	
	public static Item meteoricIronPickaxe = new TSEPickaxe(TSEToolMaterials.METEORICIRON, "meteoric_iron_pickaxe", TSECreativeTabs.tabTools, 2);
	public static Item meteoricIronAxe = new TSEAxe(TSEToolMaterials.METEORICIRON, "meteoric_iron_axe", TSECreativeTabs.tabTools, 2, 2.1F, 2.2F);
	public static Item meteoricIronShovel = new TSESpade(TSEToolMaterials.METEORICIRON, "meteoric_iron_shovel", TSECreativeTabs.tabTools, 2);
	public static Item meteoricIronHoe = new TSEHoe(TSEToolMaterials.METEORICIRON, "meteoric_iron_hoe", TSECreativeTabs.tabTools, 2);
	//public static Item meteoricIronMattock = new TSEMattock(-2.2F, TSEToolMaterials.METEORICIRON, "meteoric_iron_mattock", TSECreativeTabs.tabTools, 2);
	
	public static Item maduumPickaxe = new TSEPickaxe(TSEToolMaterials.MADUUM, "maduum_pickaxe", TSECreativeTabs.tabTools, 1);
	public static Item maduumAxe = new TSEAxe(TSEToolMaterials.MADUUM, "maduum_axe", TSECreativeTabs.tabTools, 1, 0.0F, 2.0F);
	public static Item maduumShovel = new TSESpade(TSEToolMaterials.MADUUM, "maduum_shovel", TSECreativeTabs.tabTools, 1);
	public static Item maduumHoe = new TSEHoe(TSEToolMaterials.MADUUM, "maduum_hoe", TSECreativeTabs.tabTools, 1);
	//public static Item maduumMattock = new TSEMattock(-2.2F, TSEToolMaterials.MADUUM, "maduum_mattock", TSECreativeTabs.tabTools, 1);
	
	public static Item immortaliumPickaxe = new TSEPickaxe(TSEToolMaterials.IMMORTALIUM, "immortalium_pickaxe", TSECreativeTabs.tabTools, 10);
	public static Item immortaliumAxe = new TSEAxe(TSEToolMaterials.IMMORTALIUM, "immortalium_axe", TSECreativeTabs.tabTools, 10, 50.0F, 90.0F);
	public static Item immortaliumShovel = new TSESpade(TSEToolMaterials.IMMORTALIUM, "immortalium_shovel", TSECreativeTabs.tabTools, 10);
	public static Item immortaliumHoe = new TSEHoe(TSEToolMaterials.IMMORTALIUM, "immortalium_hoe", TSECreativeTabs.tabTools, 10);
	//public static Item immortaliumMattock = new TSEMattock(-2.2F, TSEToolMaterials.IMMORTALIUM, "immortalium_mattock", TSECreativeTabs.tabTools, 10);
	
	public static Item dreamPickaxe = new TSEPickaxe(TSEToolMaterials.DREAM, "dream_pickaxe", TSECreativeTabs.tabTools, 10);
	public static Item dreamAxe = new TSEAxe(TSEToolMaterials.DREAM, "dream_axe", TSECreativeTabs.tabTools, 10, 50.0F, 30.0F);
	public static Item dreamShovel = new TSESpade(TSEToolMaterials.DREAM, "dream_shovel", TSECreativeTabs.tabTools, 10);
	public static Item dreamHoe = new TSEHoe(TSEToolMaterials.DREAM, "dream_hoe", TSECreativeTabs.tabTools, 10);
	//public static Item dreamMattock = new TSEMattock(-2.2F, TSEToolMaterials.DREAM, "dream_mattock", TSECreativeTabs.tabTools, 10);
	
	// Others
//	public static Item woodMattock = new TSEMattock(-3.0F, ToolMaterial.WOOD, "wood_mattock", TSECreativeTabs.tabTools, 0);
//	public static Item stoneMattock = new TSEMattock(-2.5F, ToolMaterial.STONE, "stone_mattock", TSECreativeTabs.tabTools, 1);
//	public static Item ironMattock = new TSEMattock(-2.2F, ToolMaterial.IRON, "iron_mattock", TSECreativeTabs.tabTools, 2);
//	public static Item diamondMattock = new TSEMattock(-2.0F, ToolMaterial.DIAMOND, "diamond_mattock", TSECreativeTabs.tabTools, 3);
//	public static Item goldMattock = new TSEMattock(1.0F, ToolMaterial.GOLD, "gold_mattock", TSECreativeTabs.tabTools, 0);
	// Others

	// End Tools

	// Start Swords

	public static Item copperSword = new TSESword(TSEToolMaterials.COPPER, "copper_sword", TSECreativeTabs.tabWeapons);
	public static Item bronzeSword = new TSESword(TSEToolMaterials.BRONZE, "bronze_sword", TSECreativeTabs.tabWeapons);
	public static Item terraDiamondSword = new TSESword(TSEToolMaterials.TDIAMOND, "terra_diamond_sword", TSECreativeTabs.tabWeapons);
	public static Item tyionetiumSword = new TSESword(TSEToolMaterials.TYIONETIUM, "tyionetium_sword", TSECreativeTabs.tabWeapons);
	public static Item brightflameSword = new TSESword(TSEToolMaterials.BRIGHTFLAME, "brightflame_sword", TSECreativeTabs.tabWeapons);
	public static Item brightsteelSword = new TSESword(TSEToolMaterials.BRIGHTFLAME, "brightsteel_sword", TSECreativeTabs.tabWeapons);
	public static Item magicSword = new TSESword(TSEToolMaterials.MAGIC, "magic_sword", TSECreativeTabs.tabWeapons);
	public static Item mithrilSword = new TSEItem("mithril_sword", TSECreativeTabs.tabWeapons);
	public static Item manatheumSword = new TSESword(TSEToolMaterials.MANATHEUM, "manatheum_sword", TSECreativeTabs.tabWeapons);
	public static Item mortiumSword = new TSESword(TSEToolMaterials.MORTIUM, "mortium_sword", TSECreativeTabs.tabWeapons);
	public static Item mysteriousSword = new TSESword(TSEToolMaterials.MYSTERIOUS, "mysterious_sword", TSECreativeTabs.tabWeapons);
	public static Item mysticSword = new TSESword(TSEToolMaterials.MYSTIC, "mystic_sword", TSECreativeTabs.tabWeapons);
	public static Item skyIronSword = new TSESword(TSEToolMaterials.SKYIRON, "sky_iron_sword", TSECreativeTabs.tabWeapons);
	public static Item terriumSword = new TSESword(TSEToolMaterials.TERRIUM, "terrium_sword", TSECreativeTabs.tabWeapons);
	public static Item vividiumSword = new TSESword(TSEToolMaterials.VIVIDIUM, "vividium_sword", TSECreativeTabs.tabWeapons);
	public static Item extranetiumSword = new TSESword(TSEToolMaterials.EXTRANETIUM, "extranetium_sword", TSECreativeTabs.tabWeapons);
	public static Item steelSword = new TSESword(TSEToolMaterials.STEEL, "steel_sword", TSECreativeTabs.tabWeapons);
	public static Item titaniumSword = new TSESword(TSEToolMaterials.TITANIUM, "titanium_sword", TSECreativeTabs.tabWeapons);
	public static Item silverSword = new TSESword(TSEToolMaterials.SILVER, "silver_sword", TSECreativeTabs.tabWeapons);
	public static Item exaltedDiamondSword = new TSESword(TSEToolMaterials.EDIAMOND, "exalted_diamond_sword", TSECreativeTabs.tabWeapons);
	public static Item bloodDiamondSword = new TSESword(TSEToolMaterials.BDIAMOND, "blood_diamond_sword", TSECreativeTabs.tabWeapons);
	public static Item platinumSword = new TSESword(TSEToolMaterials.PLATINUM, "platinum_sword", TSECreativeTabs.tabWeapons);
	public static Item tinSword = new TSESword(TSEToolMaterials.TIN, "tin_sword", TSECreativeTabs.tabWeapons);
	public static Item pewterSword = new TSESword(TSEToolMaterials.PEWTER, "pewter_sword", TSECreativeTabs.tabWeapons);
	public static Item mnemiumSword = new TSESword(TSEToolMaterials.MNEMIUM, "mnemium_sword", TSECreativeTabs.tabWeapons);
	public static Item aluminumSword = new TSESword(TSEToolMaterials.ALUMINUM, "aluminum_sword", TSECreativeTabs.tabWeapons);
	public static Item eterniumSword = new TSESword(TSEToolMaterials.ETERNIUM, "eternium_sword", TSECreativeTabs.tabWeapons);
	public static Item reforgedGoldSword = new TSESword(TSEToolMaterials.REFORGEDGOLD, "reforged_gold_sword", TSECreativeTabs.tabWeapons);
	public static Item zincSword = new TSESword(TSEToolMaterials.ZINC, "zinc_sword", TSECreativeTabs.tabWeapons);
	public static Item brassSword = new TSESword(TSEToolMaterials.BRASS, "brass_sword", TSECreativeTabs.tabWeapons);
	public static Item leadSword = new TSESword(TSEToolMaterials.LEAD, "lead_sword", TSECreativeTabs.tabWeapons);
	public static Item nickelSword = new TSESword(TSEToolMaterials.NICKEL, "nickel_sword", TSECreativeTabs.tabWeapons);
	public static Item fantasiumSword = new TSESword(TSEToolMaterials.FANTASIUM, "fantasium_sword", TSECreativeTabs.tabWeapons);
	public static Item scorniumSword = new TSESword(TSEToolMaterials.SCORNIUM, "scornium_sword", TSECreativeTabs.tabWeapons);
	public static Item electrumSword = new TSESword(TSEToolMaterials.ELECTRUM, "electrum_sword", TSECreativeTabs.tabWeapons);
	public static Item laeniumSword = new TSESword(TSEToolMaterials.LAENIUM, "laenium_sword", TSECreativeTabs.tabWeapons);
	public static Item magneiumSword = new TSESword(TSEToolMaterials.MAGNEIUM, "magneium_sword", TSECreativeTabs.tabWeapons);
	public static Item sterlingSilverSword = new TSESword(TSEToolMaterials.STSILVER, "sterling_silver_sword", TSECreativeTabs.tabWeapons);
	public static Item roseGoldSword = new TSESword(ToolMaterial.GOLD, "rose_gold_sword", TSECreativeTabs.tabWeapons);
	public static Item whiteGoldSword = new TSESword(ToolMaterial.GOLD, "white_gold_sword", TSECreativeTabs.tabWeapons);
	public static Item spangoldSword = new TSESword(ToolMaterial.GOLD, "spangold_sword", TSECreativeTabs.tabWeapons);
	public static Item meteoricIronSword = new TSESword(TSEToolMaterials.METEORICIRON, "meteoric_iron_sword", TSECreativeTabs.tabWeapons);
	public static Item maduumSword = new TSESword(TSEToolMaterials.MADUUM, "maduum_sword", TSECreativeTabs.tabWeapons);
	public static Item immortaliumSword = new TSESword(TSEToolMaterials.IMMORTALIUM, "immortalium_sword", TSECreativeTabs.tabWeapons);
	public static Item dreamSword = new TSESword(TSEToolMaterials.DREAM, "dream_sword", TSECreativeTabs.tabWeapons);
	
	public static Item justice = new LightningSword(TSEToolMaterials.JUSTICE, "justice", TSECreativeTabs.tabWeapons, true);
	public static Item corruption = new LightningSword(TSEToolMaterials.CORRUPTION, "corruption", TSECreativeTabs.tabWeapons, false);
	public static Item destruction = new LightningSword(TSEToolMaterials.DESTRUCTION, "destruction", TSECreativeTabs.tabWeapons, false);
	public static Item creation = new LightningSword(TSEToolMaterials.DESTRUCTION, "creation", TSECreativeTabs.tabWeapons, true);
	
	// End Swords

	// Start Armor

	public static Item copperHelmet = new TSEArmor("copper_helmet", TSEArmorMaterials.COPPER, 1,EntityEquipmentSlot.HEAD);
	public static Item copperChestplate = new TSEArmor("copper_chestplate", TSEArmorMaterials.COPPER, 1,EntityEquipmentSlot.CHEST);
	public static Item copperLeggings = new TSEArmor("copper_leggings", TSEArmorMaterials.COPPER, 1,EntityEquipmentSlot.LEGS);
	public static Item copperBoots = new TSEArmor("copper_boots", TSEArmorMaterials.COPPER, 1,EntityEquipmentSlot.FEET);

	public static Item bronzeHelmet = new TSEArmor("bronze_helmet", TSEArmorMaterials.BRONZE, 1,EntityEquipmentSlot.HEAD);
	public static Item bronzeChestplate = new TSEArmor("bronze_chestplate", TSEArmorMaterials.BRONZE, 1,EntityEquipmentSlot.CHEST);
	public static Item bronzeLeggings = new TSEArmor("bronze_leggings", TSEArmorMaterials.BRONZE, 1,EntityEquipmentSlot.LEGS);
	public static Item bronzeBoots = new TSEArmor("bronze_boots", TSEArmorMaterials.BRONZE, 1,EntityEquipmentSlot.FEET);

	public static Item terraDiamondHelmet = new TSEArmor("terra_diamond_helmet", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static Item terraDiamondChestplate = new TSEArmor("terra_diamond_chestplate",TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static Item terraDiamondLeggings = new TSEArmor("terra_diamond_leggings", TSEArmorMaterials.TERRADIAMOND, 1, EntityEquipmentSlot.LEGS);
	public static Item terraDiamondBoots = new TSEArmor("terra_diamond_boots", TSEArmorMaterials.TERRADIAMOND, 1 ,EntityEquipmentSlot.FEET);
	
	public static Item brightflameHelmet = new TSEArmor("brightflame_helmet", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.HEAD);
	public static Item brightflameChestplate = new TSEArmor("brightflame_chestplate", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.CHEST);
	public static Item brightflameLeggings = new TSEArmor("brightflame_leggings", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.LEGS);
	public static Item brightflameBoots = new TSEArmor("brightflame_boots", TSEArmorMaterials.BRIGHTFLAME, 1, EntityEquipmentSlot.FEET);

	public static Item brightsteelHelmet = new TSEArmor("brightsteel_helmet", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.HEAD);
	public static Item brightsteelChestplate = new TSEArmor("brightsteel_chestplate", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.CHEST);
	public static Item brightsteelLeggings = new TSEArmor("brightsteel_leggings", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.LEGS);
	public static Item brightsteelBoots = new TSEArmor("brightsteel_boots", TSEArmorMaterials.BRIGHTSTEEL, 1, EntityEquipmentSlot.FEET);

	public static Item tinHelmet = new TSEArmor("tin_helmet", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.HEAD);
	public static Item tinChestplate = new TSEArmor("tin_chestplate", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.CHEST);
	public static Item tinLeggings = new TSEArmor("tin_leggings", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.LEGS);
	public static Item tinBoots = new TSEArmor("tin_boots", TSEArmorMaterials.TIN, 1, EntityEquipmentSlot.FEET);

	public static Item magicHelmet = new TSEArmor("magic_helmet", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.HEAD);
	public static Item magicChestplate = new TSEArmor("magic_chestplate", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.CHEST);
	public static Item magicLeggings = new TSEArmor("magic_leggings", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.LEGS);
	public static Item magicBoots = new TSEArmor("magic_boots", TSEArmorMaterials.MAGIC, 1, EntityEquipmentSlot.FEET);

	public static Item mithrilHelmet = new TSEItem("mithril_helmet", TSECreativeTabs.tabWeapons);
	public static Item mithrilChestplate = new TSEItem("mithril_chestplate", TSECreativeTabs.tabWeapons);
	public static Item mithrilLeggings = new TSEItem("mithril_leggings", TSECreativeTabs.tabWeapons);
	public static Item mithrilBoots = new TSEItem("mithril_boots", TSECreativeTabs.tabWeapons);
	
	public static Item manatheumHelmet = new TSEArmor("manatheum_helmet", TSEArmorMaterials.MANATHEUM, 1, EntityEquipmentSlot.HEAD);
	public static Item manatheumChestplate = new TSEArmor("manatheum_chestplate", TSEArmorMaterials.MANATHEUM, 1, EntityEquipmentSlot.CHEST);
	public static Item manatheumLeggings = new TSEArmor("manatheum_leggings", TSEArmorMaterials.MANATHEUM, 1, EntityEquipmentSlot.LEGS);
	public static Item manatheumBoots = new TSEArmor("manatheum_boots", TSEArmorMaterials.MANATHEUM, 1, EntityEquipmentSlot.FEET);


	public static Item mortiumHelmet = new TSEArmor("mortium_helmet", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item mortiumChestplate = new TSEArmor("mortium_chestplate", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item mortiumLeggings = new TSEArmor("mortium_leggings", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item mortiumBoots = new TSEArmor("mortium_boots", TSEArmorMaterials.MORTIUM, 1, EntityEquipmentSlot.FEET);

	public static Item steelHelmet = new TSEArmor("steel_helmet", TSEArmorMaterials.STEEL, 1, EntityEquipmentSlot.HEAD);
	public static Item steelChestplate = new TSEArmor("steel_chestplate", TSEArmorMaterials.STEEL, 1, EntityEquipmentSlot.CHEST);
	public static Item steelLeggings = new TSEArmor("steel_leggings", TSEArmorMaterials.STEEL, 1, EntityEquipmentSlot.LEGS);
	public static Item steelBoots = new TSEArmor("steel_boots", TSEArmorMaterials.STEEL, 1, EntityEquipmentSlot.FEET);

	public static Item titaniumHelmet = new TSEArmor("titanium_helmet", TSEArmorMaterials.TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item titaniumChestplate = new TSEArmor("titanium_chestplate", TSEArmorMaterials.TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item titaniumLeggings = new TSEArmor("titanium_leggings", TSEArmorMaterials.TITANIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item titaniumBoots = new TSEArmor("titanium_boots", TSEArmorMaterials.TITANIUM, 1, EntityEquipmentSlot.FEET);

	public static Item extranetiumHelmet = new TSEArmor("extranetium_helmet", TSEArmorMaterials.EXTRANETIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item extranetiumChestplate = new TSEArmor("extranetium_chestplate", TSEArmorMaterials.EXTRANETIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item extranetiumLeggings = new TSEArmor("extranetium_leggings", TSEArmorMaterials.EXTRANETIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item extranetiumBoots = new TSEArmor("extranetium_boots", TSEArmorMaterials.EXTRANETIUM, 1, EntityEquipmentSlot.FEET);

	public static Item mysteriousHelmet = new TSEArmor("mysterious_helmet", TSEArmorMaterials.MYSTERIOUS, 1, EntityEquipmentSlot.HEAD);
	public static Item mysteriousChestplate = new TSEArmor("mysterious_chestplate", TSEArmorMaterials.MYSTERIOUS, 1, EntityEquipmentSlot.CHEST);
	public static Item mysteriousLeggings = new TSEArmor("mysterious_leggings", TSEArmorMaterials.MYSTERIOUS, 1, EntityEquipmentSlot.LEGS);
	public static Item mysteriousBoots = new TSEArmor("mysterious_boots", TSEArmorMaterials.MYSTERIOUS, 1, EntityEquipmentSlot.FEET);

	public static Item skyIronHelmet = new TSEArmor("sky_iron_helmet", TSEArmorMaterials.SKYIRON, 1, EntityEquipmentSlot.HEAD);
	public static Item skyIronChestplate = new TSEArmor("sky_iron_chestplate", TSEArmorMaterials.SKYIRON, 1, EntityEquipmentSlot.CHEST);
	public static Item skyIronLeggings = new TSEArmor("sky_iron_leggings", TSEArmorMaterials.SKYIRON, 1, EntityEquipmentSlot.LEGS);
	public static Item skyIronBoots = new TSEArmor("sky_iron_boots", TSEArmorMaterials.SKYIRON, 1, EntityEquipmentSlot.FEET);

	public static Item mysticHelmet = new TSEArmor("mystic_helmet", TSEArmorMaterials.MYSTIC, 1, EntityEquipmentSlot.HEAD);
	public static Item mysticChestplate = new TSEArmor("mystic_chestplate", TSEArmorMaterials.MYSTIC, 1, EntityEquipmentSlot.CHEST);
	public static Item mysticLeggings = new TSEArmor("mystic_leggings", TSEArmorMaterials.MYSTIC, 1, EntityEquipmentSlot.LEGS);
	public static Item mysticBoots = new TSEArmor("mystic_boots", TSEArmorMaterials.MYSTIC, 1, EntityEquipmentSlot.FEET);

	public static Item terriumHelmet = new TSEArmor("terrium_helmet", TSEArmorMaterials.TERRIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item terriumChestplate = new TSEArmor("terrium_chestplate", TSEArmorMaterials.TERRIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item terriumLeggings = new TSEArmor("terrium_leggings", TSEArmorMaterials.TERRIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item terriumBoots = new TSEArmor("terrium_boots", TSEArmorMaterials.TERRIUM, 1, EntityEquipmentSlot.FEET);

	public static Item vividiumHelmet = new TSEArmor("vividium_helmet", TSEArmorMaterials.VIVIDIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item vividiumChestplate = new TSEArmor("vividium_chestplate", TSEArmorMaterials.VIVIDIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item vividiumLeggings = new TSEArmor("vividium_leggings", TSEArmorMaterials.VIVIDIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item vividiumBoots = new TSEArmor("vividium_boots", TSEArmorMaterials.VIVIDIUM, 1, EntityEquipmentSlot.FEET);

	public static Item tyionetiumHelmet = new TSEArmor("tyionetium_helmet", TSEArmorMaterials.TYIONETIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item tyionetiumChestplate = new TSEArmor("tyionetium_chestplate", TSEArmorMaterials.TYIONETIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item tyionetiumLeggings = new TSEArmor("tyionetium_leggings", TSEArmorMaterials.TYIONETIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item tyionetiumBoots = new TSEArmor("tyionetium_boots", TSEArmorMaterials.TYIONETIUM, 1, EntityEquipmentSlot.FEET);

	public static Item silverHelmet = new TSEArmor("silver_helmet", TSEArmorMaterials.SILVER, 1, EntityEquipmentSlot.HEAD);
	public static Item silverChestplate = new TSEArmor("silver_chestplate", TSEArmorMaterials.SILVER, 1, EntityEquipmentSlot.CHEST);
	public static Item silverLeggings = new TSEArmor("silver_leggings", TSEArmorMaterials.SILVER, 1, EntityEquipmentSlot.LEGS);
	public static Item silverBoots = new TSEArmor("silver_boots", TSEArmorMaterials.SILVER, 1, EntityEquipmentSlot.FEET);

	public static Item exaltedDiamondHelmet = new TSEArmor("exalted_diamond_helmet", TSEArmorMaterials.EDIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static Item exaltedDiamondChestplate = new TSEArmor("exalted_diamond_chestplate", TSEArmorMaterials.EDIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static Item exaltedDiamondLeggings = new TSEArmor("exalted_diamond_leggings", TSEArmorMaterials.EDIAMOND, 1, EntityEquipmentSlot.LEGS);
	public static Item exaltedDiamondBoots = new TSEArmor("exalted_diamond_boots", TSEArmorMaterials.EDIAMOND, 1, EntityEquipmentSlot.FEET);

	public static Item bloodDiamondHelmet = new TSEArmor("blood_diamond_helmet", TSEArmorMaterials.BDIAMOND, 1, EntityEquipmentSlot.HEAD);
	public static Item bloodDiamondChestplate = new TSEArmor("blood_diamond_chestplate", TSEArmorMaterials.BDIAMOND, 1, EntityEquipmentSlot.CHEST);
	public static Item bloodDiamondLeggings = new TSEArmor("blood_diamond_leggings", TSEArmorMaterials.BDIAMOND, 1, EntityEquipmentSlot.LEGS);
	public static Item bloodDiamondBoots = new TSEArmor("blood_diamond_boots", TSEArmorMaterials.BDIAMOND, 1, EntityEquipmentSlot.FEET);

	public static Item platinumHelmet = new TSEArmor("platinum_helmet", TSEArmorMaterials.PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static Item platinumChestplate = new TSEArmor("platinum_chestplate", TSEArmorMaterials.PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static Item platinumLeggings = new TSEArmor("platinum_leggings", TSEArmorMaterials.PLATINUM, 1, EntityEquipmentSlot.LEGS);
	public static Item platinumBoots = new TSEArmor("platinum_boots", TSEArmorMaterials.PLATINUM, 1, EntityEquipmentSlot.FEET);

	public static Item reforgedGoldHelmet = new TSEArmor("reforged_gold_helmet", TSEArmorMaterials.REFORGEDGOLD, 1, EntityEquipmentSlot.HEAD);
	public static Item reforgedGoldChestplate = new TSEArmor("reforged_gold_chestplate", TSEArmorMaterials.REFORGEDGOLD, 1, EntityEquipmentSlot.CHEST);
	public static Item reforgedGoldLeggings = new TSEArmor("reforged_gold_leggings", TSEArmorMaterials.REFORGEDGOLD, 1, EntityEquipmentSlot.LEGS);
	public static Item reforgedGoldBoots = new TSEArmor("reforged_gold_boots", TSEArmorMaterials.REFORGEDGOLD, 1, EntityEquipmentSlot.FEET);
	
	public static Item zincHelmet = new TSEArmor("zinc_helmet", TSEArmorMaterials.ZINC, 1, EntityEquipmentSlot.HEAD);
	public static Item zincChestplate = new TSEArmor("zinc_chestplate", TSEArmorMaterials.ZINC, 1, EntityEquipmentSlot.CHEST);
	public static Item zincLeggings = new TSEArmor("zinc_leggings", TSEArmorMaterials.ZINC, 1, EntityEquipmentSlot.LEGS);
	public static Item zincBoots = new TSEArmor("zinc_boots", TSEArmorMaterials.ZINC, 1, EntityEquipmentSlot.FEET);
	
	public static Item brassHelmet = new TSEArmor("brass_helmet", TSEArmorMaterials.BRASS, 1, EntityEquipmentSlot.HEAD);
	public static Item brassChestplate = new TSEArmor("brass_chestplate", TSEArmorMaterials.BRASS, 1, EntityEquipmentSlot.CHEST);
	public static Item brassLeggings = new TSEArmor("brass_leggings", TSEArmorMaterials.BRASS, 1, EntityEquipmentSlot.LEGS);
	public static Item brassBoots = new TSEArmor("brass_boots", TSEArmorMaterials.BRASS, 1, EntityEquipmentSlot.FEET);
	
	public static Item leadHelmet = new TSEArmor("lead_helmet", TSEArmorMaterials.LEAD, 1, EntityEquipmentSlot.HEAD);
	public static Item leadChestplate = new TSEArmor("lead_chestplate", TSEArmorMaterials.LEAD, 1, EntityEquipmentSlot.CHEST);
	public static Item leadLeggings = new TSEArmor("lead_leggings", TSEArmorMaterials.LEAD, 1, EntityEquipmentSlot.LEGS);
	public static Item leadBoots = new TSEArmor("lead_boots", TSEArmorMaterials.LEAD, 1, EntityEquipmentSlot.FEET);
	
	public static Item nickelHelmet = new TSEArmor("nickel_helmet", TSEArmorMaterials.NICKEL, 1, EntityEquipmentSlot.HEAD);
	public static Item nickelChestplate = new TSEArmor("nickel_chestplate", TSEArmorMaterials.NICKEL, 1, EntityEquipmentSlot.CHEST);
	public static Item nickelLeggings = new TSEArmor("nickel_leggings", TSEArmorMaterials.NICKEL, 1, EntityEquipmentSlot.LEGS);
	public static Item nickelBoots = new TSEArmor("nickel_boots", TSEArmorMaterials.NICKEL, 1, EntityEquipmentSlot.FEET);
	
	public static Item pewterHelmet = new TSEArmor("pewter_helmet", TSEArmorMaterials.PEWTER, 1, EntityEquipmentSlot.HEAD);
	public static Item pewterChestplate = new TSEArmor("pewter_chestplate", TSEArmorMaterials.PEWTER, 1, EntityEquipmentSlot.CHEST);
	public static Item pewterLeggings = new TSEArmor("pewter_leggings", TSEArmorMaterials.PEWTER, 1, EntityEquipmentSlot.LEGS);
	public static Item pewterBoots = new TSEArmor("pewter_boots", TSEArmorMaterials.PEWTER, 1, EntityEquipmentSlot.FEET);

	public static Item aluminumHelmet = new TSEArmor("aluminum_helmet", TSEArmorMaterials.ALUMINUM, 1, EntityEquipmentSlot.HEAD);
	public static Item aluminumChestplate = new TSEArmor("aluminum_chestplate", TSEArmorMaterials.ALUMINUM, 1, EntityEquipmentSlot.CHEST);
	public static Item aluminumLeggings = new TSEArmor("aluminum_leggings", TSEArmorMaterials.ALUMINUM, 1, EntityEquipmentSlot.LEGS);
	public static Item aluminumBoots = new TSEArmor("aluminum_boots", TSEArmorMaterials.ALUMINUM, 1, EntityEquipmentSlot.FEET);

	public static Item mnemiumHelmet = new TSEArmor("mnemium_helmet", TSEArmorMaterials.MNEMIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item mnemiumChestplate = new TSEArmor("mnemium_chestplate", TSEArmorMaterials.MNEMIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item mnemiumLeggings = new TSEArmor("mnemium_leggings", TSEArmorMaterials.MNEMIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item mnemiumBoots = new TSEArmor("mnemium_boots", TSEArmorMaterials.MNEMIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item eterniumHelmet = new TSEArmor("eternium_helmet", TSEArmorMaterials.ETERNIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item eterniumChestplate = new TSEArmor("eternium_chestplate", TSEArmorMaterials.ETERNIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item eterniumLeggings = new TSEArmor("eternium_leggings", TSEArmorMaterials.ETERNIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item eterniumBoots = new TSEArmor("eternium_boots", TSEArmorMaterials.ETERNIUM, 1, EntityEquipmentSlot.FEET);

	public static Item fantasiumHelmet = new TSEArmor("fantasium_helmet", TSEArmorMaterials.FANTASIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item fantasiumChestplate = new TSEArmor("fantasium_chestplate", TSEArmorMaterials.FANTASIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item fantasiumLeggings = new TSEArmor("fantasium_leggings", TSEArmorMaterials.FANTASIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item fantasiumBoots = new TSEArmor("fantasium_boots", TSEArmorMaterials.FANTASIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item scorniumHelmet = new TSEArmor("scornium_helmet", TSEArmorMaterials.SCORNIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item scorniumChestplate = new TSEArmor("scornium_chestplate", TSEArmorMaterials.SCORNIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item scorniumLeggings = new TSEArmor("scornium_leggings", TSEArmorMaterials.SCORNIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item scorniumBoots = new TSEArmor("scornium_boots", TSEArmorMaterials.SCORNIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item electrumHelmet = new TSEArmor("electrum_helmet", TSEArmorMaterials.ELECTRUM, 1, EntityEquipmentSlot.HEAD);
	public static Item electrumChestplate = new TSEArmor("electrum_chestplate", TSEArmorMaterials.ELECTRUM, 1, EntityEquipmentSlot.CHEST);
	public static Item electrumLeggings = new TSEArmor("electrum_leggings", TSEArmorMaterials.ELECTRUM, 1, EntityEquipmentSlot.LEGS);
	public static Item electrumBoots = new TSEArmor("electrum_boots", TSEArmorMaterials.ELECTRUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item laeniumHelmet = new TSEArmor("laenium_helmet", TSEArmorMaterials.LAENIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item laeniumChestplate = new TSEArmor("laenium_chestplate", TSEArmorMaterials.LAENIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item laeniumLeggings = new TSEArmor("laenium_leggings", TSEArmorMaterials.LAENIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item laeniumBoots = new TSEArmor("laenium_boots", TSEArmorMaterials.LAENIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item magneiumHelmet = new TSEArmor("magneium_helmet", TSEArmorMaterials.MAGNEIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item magneiumChestplate = new TSEArmor("magneium_chestplate", TSEArmorMaterials.MAGNEIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item magneiumLeggings = new TSEArmor("magneium_leggings", TSEArmorMaterials.MAGNEIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item magneiumBoots = new TSEArmor("magneium_boots", TSEArmorMaterials.MAGNEIUM, 1, EntityEquipmentSlot.FEET);
	
	public static Item sterlingSilverHelmet = new TSEArmor("sterling_silver_helmet", TSEArmorMaterials.STSILVER, 1, EntityEquipmentSlot.HEAD);
	public static Item sterlingSilverChestplate = new TSEArmor("sterling_silver_chestplate", TSEArmorMaterials.STSILVER, 1, EntityEquipmentSlot.CHEST);
	public static Item sterlingSilverLeggings = new TSEArmor("sterling_silver_leggings", TSEArmorMaterials.STSILVER, 1, EntityEquipmentSlot.LEGS);
	public static Item sterlingSilverBoots = new TSEArmor("sterling_silver_boots", TSEArmorMaterials.STSILVER, 1, EntityEquipmentSlot.FEET);
	
	public static Item roseGoldHelmet = new TSEArmor("rose_gold_helmet", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.HEAD);
	public static Item roseGoldChestplate = new TSEArmor("rose_gold_chestplate", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.CHEST);
	public static Item roseGoldLeggings = new TSEArmor("rose_gold_leggings", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.LEGS);
	public static Item roseGoldBoots = new TSEArmor("rose_gold_boots", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.FEET);
	
	public static Item whiteGoldHelmet = new TSEArmor("white_gold_helmet", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.HEAD);
	public static Item whiteGoldChestplate = new TSEArmor("white_gold_chestplate", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.CHEST);
	public static Item whiteGoldLeggings = new TSEArmor("white_gold_leggings", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.FEET);
	public static Item whiteGoldBoots = new TSEArmor("white_gold_boots", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.FEET);
	
	public static Item spangoldHelmet = new TSEArmor("spangold_helmet", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.HEAD);
	public static Item spangoldChestplate = new TSEArmor("spangold_chestplate", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.CHEST);
	public static Item spangoldLeggings = new TSEArmor("spangold_leggings", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.LEGS);
	public static Item spangoldBoots = new TSEArmor("spangold_boots", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.FEET);
	
	public static Item meteoricIronHelmet = new TSEArmor("meteoric_iron_helmet", TSEArmorMaterials.METEORICIRON, 1, EntityEquipmentSlot.HEAD);
	public static Item meteoricIronChestplate = new TSEArmor("meteoric_iron_chestplate", TSEArmorMaterials.METEORICIRON, 1, EntityEquipmentSlot.CHEST);
	public static Item meteoricIronLeggings = new TSEArmor("meteoric_iron_leggings", TSEArmorMaterials.METEORICIRON, 1, EntityEquipmentSlot.LEGS);
	public static Item meteoricIronBoots = new TSEArmor("meteoric_iron_boots", TSEArmorMaterials.METEORICIRON, 1, EntityEquipmentSlot.FEET);	
	
	public static Item maduumHelmet = new TSEArmor("maduum_helmet", TSEArmorMaterials.MADUUM, 1, EntityEquipmentSlot.HEAD, true);
	public static Item maduumChestplate = new TSEArmor("maduum_chestplate", TSEArmorMaterials.MADUUM, 1, EntityEquipmentSlot.CHEST, true);
	public static Item maduumLeggings = new TSEArmor("maduum_leggings", TSEArmorMaterials.MADUUM, 1, EntityEquipmentSlot.LEGS, true);
	public static Item maduumBoots = new TSEArmor("maduum_boots", TSEArmorMaterials.MADUUM, 1, EntityEquipmentSlot.FEET, true);
	
	public static Item immortaliumHelmet = new TSEArmor("immortalium_helmet", TSEArmorMaterials.IMMORTALIUM, 1, EntityEquipmentSlot.HEAD);
	public static Item immortaliumChestplate = new TSEArmor("immortalium_chestplate", TSEArmorMaterials.IMMORTALIUM, 1, EntityEquipmentSlot.CHEST);
	public static Item immortaliumLeggings = new TSEArmor("immortalium_leggings", TSEArmorMaterials.IMMORTALIUM, 1, EntityEquipmentSlot.LEGS);
	public static Item immortaliumBoots = new TSEArmor("immortalium_boots", TSEArmorMaterials.IMMORTALIUM, 1, EntityEquipmentSlot.FEET);


	
	private static Item registerItem(Item item, String registryName) {
		item.setRegistryName(StringsLib.MODID, registryName);
		item.setUnlocalizedName(registryName);
		registeredItems.add(item);
		return item;
	}
	
	public static void registerItem(Item item)
	{
		registeredItems.add(item);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		TheStuffExtension.log("Registering Items...");
		for(Item i: registeredItems)
		{
			registry.register(i);
		}
		TheStuffExtension.log("Registered Items");
	}

}
