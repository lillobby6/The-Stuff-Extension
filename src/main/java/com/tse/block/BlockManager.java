package com.tse.block;

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.main.core.TheStuffExtension;

import jline.internal.Log;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockManager {

	public static Block exaltedDiamondOre = registerOre("exalted_diamond_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block bloodDiamondOre = registerOre("blood_diamond_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block terraDiamondOre = registerOre("terra_diamond_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block copperOre = registerOre("copper_ore", Material.ROCK, 1, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block mortiumOre = registerOre("mortium_ore", Material.ROCK, 3, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block tinOre = registerOre("tin_ore", Material.ROCK, 1, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block toslotriumOre = registerOre("toslotrium_ore", Material.ROCK, 1, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block vividiumOre = registerOre("vividium_ore", Material.ROCK, 3, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block sphaleriteOre = registerOre("sphalerite_ore", Material.ROCK, 1, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block silverOre = registerOre("silver_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block platinumOre = registerOre("platinum_ore", Material.ROCK, 3, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block titaniumOre = registerOre("titanium_ore", Material.ROCK, 3, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block galenaOre = registerOre("galena_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block pentlanditeOre = registerOre("pentlandite_ore", Material.ROCK, 2, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block skyIronOre = registerOre("sky_iron_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F,
			TSECreativeTabs.tabOres);
	public static Block terriumOre = registerOre("terrium_ore", Material.ROCK, 4, "pickaxe", 3.5F, 3.5F,
			TSECreativeTabs.tabOres);
	public static Block aluminumOre = registerOre("aluminum_ore", Material.ROCK, 1, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);

	public static Block moonStone = registerBlockNormal("moon_stone", 5.0F, 5.0F);
	public static Block moonSand = registerBlockWithSound("moon_sand", 2.0F, 2.0F, SoundType.SAND);
	public static Block moonTeleporter = registerBlockNormal("moon_teleporter", 5.0F, 5.0F);

	/*
	 * public static Block mysticStone = registerBlockNormal("mystic_stone", 5.0F,
	 * 5.0F); public static Block mysticDirt = registerBlockNormal("mystic_dirt",
	 * 1.0F, 1.0F); public static Block mysticLog =
	 * registerBlockNormal("mystic_log", 2.0F, 2.0F); public static Block
	 * mysticPlanks = registerBlockNormal("mystic_planks", 2.0F, 2.0F);
	 */

	public static Block lunaDiamondOre = registerOre("luna_diamond_ore", Material.ROCK, 3, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);
	public static Block moonIronOre = registerOre("moon_iron_ore", Material.ROCK, 1, "pickaxe", 5.0F, 5.0F,
			TSECreativeTabs.tabOres);

	public static Block copperBlock = registerBlockNormal("copper_block", 5.0F, 5.0F);
	public static Block steelBlock = registerBlockNormal("steel_block", 5.0F, 5.0F);
	public static Block terraDiamondBlock = registerBlockNormal("terra_diamond_block", 5.0F, 5.0F);
	public static Block exaltedDiamondBlock = registerBlockNormal("exalted_diamond_block", 5.0F, 5.0F);
	public static Block bloodDiamondBlock = registerBlockNormal("blood_diamond_block", 5.0F, 5.0F);
	public static Block tinBlock = registerBlockNormal("tin_block", 5.0F, 5.0F);
	public static Block tyionetiumBlock = registerBlockNormal("tyionetium_block", 5.0F, 5.0F);
	public static Block bronzeBlock = registerBlockNormal("bronze_block", 5.0F, 5.0F);
	public static Block brightflameBlock = registerBlockNormal("brightflame_block", 5.0F, 5.0F);
	public static Block brightsteelBlock = registerBlockNormal("brightsteel_block", 5.0F, 5.0F);
	public static Block reforgedGoldBlock = registerBlockNormal("reforged_gold_block", 5.0F, 5.0F);
	public static Block magicBlock = registerBlockNormal("magic_block", 5.0F, 5.0F);
	public static Block mithrilBlock = registerBlockNormal("mithril_block", 5.0F, 5.0F);
	public static Block mortiumBlock = registerBlockNormal("mortium_block", 5.0F, 5.0F);
	public static Block mysteriousBlock = registerBlockNormal("mysterious_block", 5.0F, 5.0F);
	public static Block mysticBlock = registerBlockNormal("mystic_block", 5.0F, 5.0F);
	public static Block skyIronBlock = registerBlockNormal("sky_iron_block", 5.0F, 5.0F);
	public static Block terriumBlock = registerBlockNormal("terrium_block", 5.0F, 5.0F);
	public static Block toslotriumBlock = registerBlockNormal("toslotrium_block", 5.0F, 5.0F);
	public static Block vividiumBlock = registerBlockNormal("vividium_block", 5.0F, 5.0F);
	public static Block sphaleriteBlock = registerBlockNormal("sphalerite_block", 5.0F, 5.0F);
	public static Block extranetiumBlock = registerBlockNormal("extranetium_block", 5.0F, 5.0F);
	public static Block silverBlock = registerBlockNormal("silver_block", 5.0F, 5.0F);
	public static Block platinumBlock = registerBlockNormal("platinum_block", 5.0F, 5.0F);
	public static Block titaniumBlock = registerBlockNormal("titanium_block", 5.0F, 5.0F);
	public static Block zincBlock = registerBlockNormal("zinc_block", 5.0F, 5.0F);
	public static Block brassBlock = registerBlockNormal("brass_block", 5.0F, 5.0F);
	public static Block leadBlock = registerBlockNormal("lead_block", 5.0F, 5.0F);
	public static Block nickelBlock = registerBlockNormal("nickel_block", 5.0F, 5.0F);
	public static Block pewterBlock = registerBlockNormal("pewter_block", 5.0F, 5.0F);
	public static Block aluminumBlock = registerBlockNormal("aluminum_block", 5.0F, 5.0F);
	public static Block mnemiumBlock = registerBlockNormal("mnemium_block", 5.0F, 5.0F);

	public static Block storeBox = registerStoreBox("store_box");
	public static Block mysteriousBox = registerMBox("mysterious_box");
	public static Block superStoreBox = registerSSBox("super_store_box");
	public static Block diamondStoreBox = registerDSBox("diamond_store_box");

	public static Block whiteStone = registerBlockNormal("white_stone", 2.0F, 2.0F);
	public static Block whiteCobblestone = registerBlockNormal("white_cobblestone", 2.0F, 2.0F);

	public static Block purpleheartLog = registerBlockNormal("purpleheart_log", 2.0F, 2.0F);
	public static Block purpleheartPlanks = registerBlockNormal("purpleheart_planks", 2.0F, 2.0F);
	// public static Block purpleheartLeaves;

	// public static Block padaukLog = registerBlockNormal("padauk_log", 2.0F,
	// 2.0F);
	// public static Block paduakPlanks = registerBlockNormal("padauk_planks",
	// 2.0F, 2.0F);
	public static Block padaukLeaves;

	public static Item exaltedDiamondOreItem = new ItemBlock(exaltedDiamondOre).setRegistryName("exalted_diamond_ore")
			.setUnlocalizedName("exalted_diamond_ore");
	public static Item bloodDiamondOreItem = new ItemBlock(bloodDiamondOre).setRegistryName("blood_diamond_ore")
			.setUnlocalizedName("blood_diamond_ore");
	public static Item terraDiamondOreItem = new ItemBlock(terraDiamondOre).setRegistryName("terra_diamond_ore")
			.setUnlocalizedName("terra_diamond_ore");
	public static Item copperOreItem = new ItemBlock(copperOre).setRegistryName("copper_ore")
			.setUnlocalizedName("copper_ore");
	public static Item mortiumOreItem = new ItemBlock(mortiumOre).setRegistryName("mortium_ore")
			.setUnlocalizedName("mortium_ore");
	public static Item tinOreItem = new ItemBlock(tinOre).setRegistryName("tin_ore").setUnlocalizedName("tin_ore");
	public static Item toslotriumOreItem = new ItemBlock(toslotriumOre).setRegistryName("toslotrium_ore")
			.setUnlocalizedName("toslotrium_ore");
	public static Item vividiumOreItem = new ItemBlock(vividiumOre).setRegistryName("vividium_ore")
			.setUnlocalizedName("vividium_ore");
	public static Item sphaleriteOreItem = new ItemBlock(sphaleriteOre).setRegistryName("sphalerite_ore")
			.setUnlocalizedName("sphalerite_ore");
	public static Item silverOreItem = new ItemBlock(silverOre).setRegistryName("silver_ore")
			.setUnlocalizedName("silver_ore");
	public static Item platinumOreItem = new ItemBlock(platinumOre).setRegistryName("platinum_ore")
			.setUnlocalizedName("platinum_ore");
	public static Item titaniumOreItem = new ItemBlock(titaniumOre).setRegistryName("titanium_ore")
			.setUnlocalizedName("titanium_ore");
	public static Item galenaOreItem = new ItemBlock(galenaOre).setRegistryName("galena_ore")
			.setUnlocalizedName("galena_ore");
	public static Item pentlanditeOreItem = new ItemBlock(pentlanditeOre).setRegistryName("pentlandite_ore")
			.setUnlocalizedName("pentlandite_ore");
	public static Item skyIronOreItem = new ItemBlock(skyIronOre).setRegistryName("sky_iron_ore")
			.setUnlocalizedName("sky_iron_ore");
	public static Item terriumOreItem = new ItemBlock(terriumOre).setRegistryName("terrium_ore")
			.setUnlocalizedName("terrium_ore");
	public static Item aluminumOreItem = new ItemBlock(aluminumOre).setRegistryName("aluminum_ore")
			.setUnlocalizedName("aluminum_ore");

	public static Item moonStoneItem = new ItemBlock(moonStone).setRegistryName("moon_stone")
			.setUnlocalizedName("moon_stone");
	public static Item moonSandItem = new ItemBlock(moonSand).setRegistryName("moon_sand")
			.setUnlocalizedName("moon_sand");
	public static Item moonTeleporterItem = new ItemBlock(moonTeleporter).setRegistryName("moon_teleporter")
			.setUnlocalizedName("moon_teleporter");

	public static Item lunaDiamondOreItem = new ItemBlock(lunaDiamondOre).setRegistryName("luna_diamond_ore")
			.setUnlocalizedName("luna_diamond_ore");
	public static Item moonIronOreItem = new ItemBlock(moonIronOre).setRegistryName("moon_iron_ore")
			.setUnlocalizedName("moon_diamond_ore");

	public static Item copperBlockItem = new ItemBlock(copperBlock).setRegistryName("copper_block")
			.setUnlocalizedName("copper_block");
	public static Item steelBlockItem = new ItemBlock(steelBlock).setRegistryName("steel_block")
			.setUnlocalizedName("steel_block");
	public static Item terraDiamondBlockItem = new ItemBlock(terraDiamondBlock).setRegistryName("terra_diamond_block")
			.setUnlocalizedName("terra_diamond_block");
	public static Item exaltedDiamondBlockItem = new ItemBlock(exaltedDiamondBlock)
			.setRegistryName("exalted_diamond_block").setUnlocalizedName("exalted_diamond_block");
	public static Item bloodDiamondBlockItem = new ItemBlock(bloodDiamondBlock).setRegistryName("blood_diamond_block")
			.setUnlocalizedName("blood_diamond_block");
	public static Item tinBlockItem = new ItemBlock(tinBlock).setRegistryName("tin_block")
			.setUnlocalizedName("tin_block");
	public static Item tyionetiumBlockItem = new ItemBlock(tyionetiumBlock).setRegistryName("tyionetium_block")
			.setUnlocalizedName("tyionetium_block");
	public static Item bronzeBlockItem = new ItemBlock(bronzeBlock).setRegistryName("bronze_block")
			.setUnlocalizedName("bronze_block");
	public static Item brightflameBlockItem = new ItemBlock(brightflameBlock).setRegistryName("brightflame_block")
			.setUnlocalizedName("brightflame_block");
	public static Item brightsteelBlockItem = new ItemBlock(brightsteelBlock).setRegistryName("brightsteel_block")
			.setUnlocalizedName("brightsteel_block");
	public static Item reforgedGoldBlockItem = new ItemBlock(reforgedGoldBlock).setRegistryName("reforged_gold_block")
			.setUnlocalizedName("reforged_gold_block");
	public static Item magicBlockItem = new ItemBlock(magicBlock).setRegistryName("magic_block")
			.setUnlocalizedName("magic_block");
	public static Item mithrilBlockItem = new ItemBlock(mithrilBlock).setRegistryName("mithril_block")
			.setUnlocalizedName("mithril_block");
	public static Item mortiumBlockItem = new ItemBlock(mortiumBlock).setRegistryName("mortium_block")
			.setUnlocalizedName("mortium_block");
	public static Item mysteriousBlockItem = new ItemBlock(mysteriousBlock).setRegistryName("mysterious_block")
			.setUnlocalizedName("mysterious_block");
	public static Item mysticBlockItem = new ItemBlock(mysticBlock).setRegistryName("mystic_block")
			.setUnlocalizedName("mystic_block");
	public static Item skyIronBlockItem = new ItemBlock(skyIronBlock).setRegistryName("sky_iron_block")
			.setUnlocalizedName("sky_iron_block");
	public static Item terriumBlockItem = new ItemBlock(terriumBlock).setRegistryName("terrium_block")
			.setUnlocalizedName("terrium_block");
	public static Item toslotriumBlockItem = new ItemBlock(toslotriumBlock).setRegistryName("toslotrium_block")
			.setUnlocalizedName("toslotrium_block");
	public static Item vividiumBlockItem = new ItemBlock(vividiumBlock).setRegistryName("vividium_block")
			.setUnlocalizedName("vividium_block");
	public static Item sphaleriteBlockItem = new ItemBlock(sphaleriteBlock).setRegistryName("sphalerite_block")
			.setUnlocalizedName("sphalerite_block");
	// TODO
	public static Item extranetiumBlockItem = new ItemBlock(extranetiumBlock).setRegistryName("extranetium_block")
			.setUnlocalizedName("extranetium_block");
	public static Item silverBlockItem = new ItemBlock(silverBlock).setRegistryName("silver_block")
			.setUnlocalizedName("silver_block");
	public static Item platinumBlockItem = new ItemBlock(platinumBlock).setRegistryName("platinum_block")
			.setUnlocalizedName("platinum_block");
	public static Item titaniumBlockItem = new ItemBlock(titaniumBlock).setRegistryName("titanium_block")
			.setUnlocalizedName("titanium_block");
	public static Item zincBlockItem = new ItemBlock(zincBlock).setRegistryName("zinc_block")
			.setUnlocalizedName("zinc_block");
	public static Item brassBlockItem = new ItemBlock(brassBlock).setRegistryName("brass_block")
			.setUnlocalizedName("brass_block");
	public static Item leadBlockItem = new ItemBlock(leadBlock).setRegistryName("lead_block")
			.setUnlocalizedName("lead_block");
	public static Item nickelBlockItem = new ItemBlock(nickelBlock).setRegistryName("nickel_block")
			.setUnlocalizedName("nickel_block");
	public static Item pewterBlockItem = new ItemBlock(pewterBlock).setRegistryName("pewter_block")
			.setUnlocalizedName("pewter_block");
	public static Item aluminumBlockItem = new ItemBlock(aluminumBlock).setRegistryName("aluminum_block")
			.setUnlocalizedName("aluminum_block");
	public static Item mnemiumBlockItem = new ItemBlock(mnemiumBlock).setRegistryName("mnemium_block")
			.setUnlocalizedName("mnemium_block");

	public static Item storeBoxItem = new ItemBlock(storeBox).setRegistryName("store_box")
			.setUnlocalizedName("store_box");
	public static Item superStoreBoxItem = new ItemBlock(superStoreBox).setRegistryName("super_store_box")
			.setUnlocalizedName("super_store_box");
	public static Item mysteriousBoxItem = new ItemBlock(mysteriousBox).setRegistryName("mysterious_box")
			.setUnlocalizedName("mysterious_box");
	public static Item diamondStoreBoxItem = new ItemBlock(diamondStoreBox).setRegistryName("diamond_store_box")
			.setUnlocalizedName("diamond_store_box");

	// new ItemBlock( alloyFurnace);

	public static Item whiteStoneItem = new ItemBlock(whiteStone).setRegistryName("white_stone")
			.setUnlocalizedName("white_stone");
	public static Item whiteCobblestoneItem = new ItemBlock(whiteCobblestone).setRegistryName("white_cobblestone")
			.setUnlocalizedName("white_cobblestone");

	public static Item purpleheartLogItem = new ItemBlock(purpleheartLog).setRegistryName("purpleheart_log")
			.setUnlocalizedName("purpleheart_log");
	public static Item purpleheartPlanksItem = new ItemBlock(purpleheartPlanks).setRegistryName("purpleheart_planks")
			.setUnlocalizedName("purpleheart_planks");

	// public static Item padaukLogItem = new
	// ItemBlock(padaukLog).setRegistryName("padauk_log")
	// .setUnlocalizedName("purpleheart_log");
	// public static Item padaukPlanksItem = new
	// ItemBlock(paduakPlanks).setRegistryName("padauk_planks")
	// .setUnlocalizedName("padauk_planks");

	private static Block registerBlock(String registerName, ItemBlock itemBlock, Block block) {
		block.setRegistryName(registerName);
		block.setUnlocalizedName(registerName);

		// GameRegistry.register(block);

		itemBlock.setRegistryName(registerName);
		itemBlock.setUnlocalizedName(registerName);
		// GameRegistry.register(itemBlock);

		return block;
	}

	public static Block registerBlockNormal(String registerName, float hardness, float resistance) {
		final Block block = new TSEBlock(registerName, hardness, resistance);
		final ItemBlock itemBlock = new ItemBlock(block);
		block.setCreativeTab(TSECreativeTabs.tabBlocks);
		return registerBlock(registerName, itemBlock, block);
	}

	public static Block registerBlockWithSound(String registerName, float harness, float resistance, SoundType sound) {
		final Block block = new TSEBlock(registerName, harness, resistance, sound);
		final ItemBlock itemBlock = new ItemBlock(block);

		return registerBlock(registerName, itemBlock, block);
	}

	private static Block registerOre(String registerName, Material mat, int harvestLevel, String toolType,
			float hardness, float resistance, CreativeTabs tab) {
		final Block ore = new TSEBlockOre(registerName, mat, harvestLevel, toolType, hardness, resistance, tab, 0);
		final ItemBlock itemBlock = new ItemBlock(ore);

		return registerBlock(registerName, itemBlock, ore);
	}

	private static Block registerStoreBox(String registryName) {
		final Block block = new StoreBox(registryName);
		final ItemBlock itemBlock = new ItemBlock(block);

		return registerBlock(registryName, itemBlock, block);
	}

	private static Block registerSSBox(String registryName) {
		final Block block = new SuperStoreBox(registryName);
		final ItemBlock itemBlock = new ItemBlock(block);

		return registerBlock(registryName, itemBlock, block);
	}

	private static Block registerMBox(String registryName) {
		final Block block = new MysteriousBox(registryName);
		final ItemBlock itemBlock = new ItemBlock(block);

		return registerBlock(registryName, itemBlock, block);
	}

	private static Block registerDSBox(String registryName) {
		final Block block = new DiamondStoreBox(registryName);
		final ItemBlock itemBlock = new ItemBlock(block);

		return registerBlock(registryName, itemBlock, block);
	}

	public static Block registerLog(String registryName) {
		final Block block = new TSEBlockLog();
		block.setCreativeTab(TSECreativeTabs.tabBlocks);
		final ItemBlock itemBlock = new ItemBlock(block);
		return registerBlock(registryName, itemBlock, block);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		final IForgeRegistry<Block> registry = event.getRegistry();
		TheStuffExtension.log("Registering blocks...");
		// TODO
		registry.registerAll(exaltedDiamondOre, bloodDiamondOre, terraDiamondOre, copperOre, mortiumOre, tinOre,
				toslotriumOre, vividiumOre, sphaleriteOre, silverOre, platinumOre, titaniumOre, galenaOre,
				pentlanditeOre, skyIronOre, terriumOre, aluminumOre,

				moonStone, moonSand, moonTeleporter,

				lunaDiamondOre, moonIronOre,

				copperBlock, steelBlock, terraDiamondBlock, exaltedDiamondBlock, bloodDiamondBlock, tinBlock,
				tyionetiumBlock, bronzeBlock, brightflameBlock, brightsteelBlock, reforgedGoldBlock, magicBlock,
				mithrilBlock, mortiumBlock, mysteriousBlock, mysticBlock, skyIronBlock, terriumBlock, toslotriumBlock,
				vividiumBlock, sphaleriteBlock, extranetiumBlock, silverBlock, platinumBlock, titaniumBlock, zincBlock,
				brassBlock, leadBlock, nickelBlock, pewterBlock, aluminumBlock,

				storeBox, superStoreBox, mysteriousBox, diamondStoreBox, whiteStone, whiteCobblestone,

				purpleheartLog, purpleheartPlanks

		// padaukLog, paduakPlanks
		);
		TheStuffExtension.log("Registered blocks.");
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		TheStuffExtension.log("Registering ItemBlocks...");
		registry.registerAll(exaltedDiamondOreItem, bloodDiamondOreItem, terraDiamondOreItem, copperOreItem,
				mortiumOreItem, tinOreItem, toslotriumOreItem, vividiumOreItem, sphaleriteOreItem, silverOreItem,
				platinumOreItem, titaniumOreItem, galenaOreItem, pentlanditeOreItem, skyIronOreItem, terriumOreItem,
				aluminumOreItem,

				moonStoneItem, moonSandItem, moonTeleporterItem,

				lunaDiamondOreItem, moonIronOreItem,

				copperBlockItem, steelBlockItem, terraDiamondBlockItem, exaltedDiamondBlockItem, bloodDiamondBlockItem,
				tinBlockItem, tyionetiumBlockItem, bronzeBlockItem, brightflameBlockItem, brightsteelBlockItem,
				reforgedGoldBlockItem, magicBlockItem, mithrilBlockItem, mortiumBlockItem, mysteriousBlockItem,
				mysticBlockItem, skyIronBlockItem, terriumBlockItem, toslotriumBlockItem, vividiumBlockItem,
				sphaleriteBlockItem, extranetiumBlockItem, silverBlockItem, platinumBlockItem, titaniumBlockItem,
				zincBlockItem, brassBlockItem, leadBlockItem, nickelBlockItem, pewterBlockItem, aluminumBlockItem,

				storeBoxItem, superStoreBoxItem, mysteriousBoxItem, diamondStoreBoxItem,

				whiteStoneItem, whiteCobblestoneItem,

				purpleheartLogItem, purpleheartPlanksItem// ,

		// padaukLogItem, padaukPlanksItem
		);
		TheStuffExtension.log("Registered ItemBlocks.");
	}

}
