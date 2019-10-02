package com.tse.world.block;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.creativetabs.TSECreativeTabs;

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

	public static Block exaltedDiamondOre = registerOre("exalted_diamond_ore", Material.ROCK, 2, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block bloodDiamondOre = registerOre("blood_diamond_ore", Material.ROCK, 2, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block terraDiamondOre = registerOre("terra_diamond_ore", Material.ROCK, 2, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	
	public static Block copperOre = registerOre("copper_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block mortiumOre = registerOre("mortium_ore", Material.ROCK, 3, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block tinOre = registerOre("tin_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block toslotriumOre = registerOre("toslotrium_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block vividiumOre = registerOre("vividium_ore", Material.ROCK, 3, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block sphaleriteOre = registerOre("sphalerite_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block silverOre = registerOre("silver_ore", Material.ROCK, 2, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block platinumOre = registerOre("platinum_ore", Material.ROCK, 3, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block titaniumOre = registerOre("titanium_ore", Material.ROCK, 3, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block galenaOre = registerOre("galena_ore", Material.ROCK, 2, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block pentlanditeOre = registerOre("pentlandite_ore", Material.ROCK, 2, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block skyIronOre = registerOre("sky_iron_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block terriumOre = registerOre("terrium_ore", Material.ROCK, 4, "pickaxe", 3.5F, 3.5F, TSECreativeTabs.tabOres);
	public static Block aluminumOre = registerOre("aluminum_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	
	public static Block meteor = registerOre("meteor", Material.ROCK, 1, "pickaxe", 3.0F, 50.0F, TSECreativeTabs.tabOres);
			
	//TODO Moon stuff
	public static Block moonStone = registerBlockNormal("moon_stone", 3.0F, 3.0F);
	public static Block moonSand = registerBlockWithSound("moon_sand", 2.0F, 2.0F, SoundType.SAND);
	public static Block moonTeleporter = registerBlockNormal("moon_teleporter", 3.0F, 3.0F);
	
	//TODO Create converter - converts equivalent TSE materials for other TSE materials - Vividium for mortium, brightsteel for brightflame, etc.

	
	public static Block mysticStone = registerBlockNormal("mystic_stone", 3.0F,3.0F);
	public static Block mysticDirt = registerBlockNormal("mystic_dirt",1.0F, 1.0F); 
	public static Block mysticLog = registerBlockNormal("mystic_log", 2.0F, 2.0F);
	public static Block mysticPlanks = registerBlockNormal("mystic_planks", 2.0F, 2.0F);
	 

	public static Block lunaDiamondOre = registerOre("luna_diamond_ore", Material.ROCK, 3, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block moonIronOre = registerOre("moon_iron_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);

	public static Block copperBlock = registerBlockNormal("copper_block", 3.0F, 3.0F);
	public static Block steelBlock = registerBlockNormal("steel_block", 3.0F, 3.0F);
	public static Block terraDiamondBlock = registerBlockNormal("terra_diamond_block", 3.0F, 3.0F);
	public static Block exaltedDiamondBlock = registerBlockNormal("exalted_diamond_block", 3.0F, 3.0F);
	public static Block bloodDiamondBlock = registerBlockNormal("blood_diamond_block", 3.0F, 3.0F);
	public static Block tinBlock = registerBlockNormal("tin_block", 3.0F, 3.0F);
	public static Block tyionetiumBlock = registerBlockNormal("tyionetium_block", 3.0F, 3.0F);
	public static Block bronzeBlock = registerBlockNormal("bronze_block", 3.0F, 3.0F);
	public static Block brightflameBlock = registerBlockNormal("brightflame_block", 3.0F, 3.0F);
	public static Block brightsteelBlock = registerBlockNormal("brightsteel_block", 3.0F, 3.0F);
	public static Block reforgedGoldBlock = registerBlockNormal("reforged_gold_block", 3.0F, 3.0F);
	public static Block magicBlock = registerBlockNormal("magic_block", 3.0F, 3.0F);
	public static Block mithrilBlock = registerBlockNormal("mithril_block", 3.0F, 3.0F);
	public static Block mortiumBlock = registerBlockNormal("mortium_block", 3.0F, 3.0F);
	public static Block mysteriousBlock = registerBlockNormal("mysterious_block", 3.0F, 3.0F);
	public static Block mysticBlock = registerBlockNormal("mystic_block", 3.0F, 3.0F);
	public static Block skyIronBlock = registerBlockNormal("sky_iron_block", 3.0F, 3.0F);
	public static Block terriumBlock = registerBlockNormal("terrium_block", 3.0F, 3.0F);
	public static Block toslotriumBlock = registerBlockNormal("toslotrium_block", 3.0F, 3.0F);
	public static Block vividiumBlock = registerBlockNormal("vividium_block", 3.0F, 3.0F);
	public static Block sphaleriteBlock = registerBlockNormal("sphalerite_block", 3.0F, 3.0F);
	public static Block extranetiumBlock = registerBlockNormal("extranetium_block", 3.0F, 3.0F);
	public static Block silverBlock = registerBlockNormal("silver_block", 3.0F, 3.0F);
	public static Block platinumBlock = registerBlockNormal("platinum_block", 3.0F, 3.0F);
	public static Block titaniumBlock = registerBlockNormal("titanium_block", 3.0F, 3.0F);
	public static Block zincBlock = registerBlockNormal("zinc_block", 3.0F, 3.0F);
	public static Block brassBlock = registerBlockNormal("brass_block", 3.0F, 3.0F);
	public static Block leadBlock = registerBlockNormal("lead_block", 3.0F, 3.0F);
	public static Block nickelBlock = registerBlockNormal("nickel_block", 3.0F, 3.0F);
	public static Block pewterBlock = registerBlockNormal("pewter_block", 3.0F, 3.0F);
	public static Block aluminumBlock = registerBlockNormal("aluminum_block", 3.0F, 3.0F);
	public static Block mnemiumBlock = registerBlockNormal("mnemium_block", 3.0F, 3.0F);
	public static Block eterniumBlock = registerBlockNormal("eternium_block", 3.0F, 3.0F);
	public static Block fantasiumBlock = registerBlockNormal("fantasium_block", 3.0F, 3.0F);
	public static Block scorniumBlock = registerBlockNormal("scornium_block", 3.0F, 3.0F);
	public static Block electrumBlock = registerBlockNormal("electrum_block", 3.0F, 3.0F);
	public static Block laeniumBlock = registerBlockNormal("laenium_block", 3.0F, 3.0F);
	public static Block magneiumBlock = registerBlockNormal("magneium_block", 3.0F, 3.0F);
	public static Block sterlingSilverBlock = registerBlockNormal("sterling_silver_block", 3.0F, 3.0F);
	public static Block roseGoldBlock = registerBlockNormal("rose_gold_block", 3.0F, 3.0F);
	public static Block whiteGoldBlock = registerBlockNormal("white_gold_block", 3.0F, 3.0F);
	public static Block spangoldBlock = registerBlockNormal("spangold_block", 3.0F, 3.0F);
	public static Block meteoricIronBlock = registerBlockNormal("meteoric_iron_block", 3.0F, 3.0F);
	public static Block maduumBlock = registerBlockNormal("maduum_block", 10.0F, 100.0F);
	public static Block immortaliumBlock = registerBlockNormal("immortalium_block", 10.0F, 100.0F);
	
	public static Block storeBox = registerStoreBox("store_box");
	public static Block mysteriousBox = registerMBox("mysterious_box");
	public static Block superStoreBox = registerSSBox("super_store_box");
	public static Block diamondStoreBox = registerDSBox("diamond_store_box");

	public static Block alloyFurnace = registerAlloyFurnace("alloy_furnace", false, true, "regular");
	public static Block alloyFurnaceActive = registerAlloyFurnace("alloy_furnace_active", true, false, "regular");
	
	public static Block copperAlloyFurnace = registerAlloyFurnace("copper_alloy_furnace", false, true, "copper");
	public static Block copperAlloyFurnaceActive = registerAlloyFurnace("copper_alloy_furnace_active", true, false, "copper");
	
	public static Block copperFurnace = registerFurnace("copper_furnace", false, true);
	public static Block copperFurnaceActive = registerFurnace("copper_furnace_active", true, false);
	
	public static Block whiteStone = registerBlockNormal("white_stone", 2.0F, 2.0F);
	public static Block whiteCobblestone = registerBlockNormal("white_cobblestone", 2.0F, 2.0F);
	
	public static Block compressedWhiteCobblestone = registerBlockNormal("compressed_white_cobblestone", 2.5F, 2.5F);
	public static Block doubleCompressedWhiteCobblestone = registerBlockNormal("double_compressed_white_cobblestone", 3.0F, 3.0F);
	public static Block tripleCompressedWhiteCobblestone = registerBlockNormal("triple_compressed_white_cobblestone", 3.5F, 3.5F);
	public static Block quadrupleCompressedWhiteCobblestone = registerBlockNormal("quadruple_compressed_white_cobblestone", 4.0F, 4.0F);
	public static Block quintupleCompressedWhiteCobblestone = registerBlockNormal("quintuple_compressed_white_cobblestone", 4.5F, 4.5F);
	public static Block sextupleCompressedWhiteCobblestone = registerBlockNormal("sextuple_compressed_white_cobblestone", 5.0F, 5.0F);
	public static Block septupleCompressedWhiteCobblestone = registerBlockNormal("septuple_compressed_white_cobblestone", 5.5F, 5.5F);
	public static Block octupleCompressedWhiteCobblestone = registerBlockNormal("octuple_compressed_white_cobblestone", 6.0F, 6.0F);
	public static Block nonupleCompressedWhiteCobblestone = registerBlockNormal("nonuple_compressed_white_cobblestone", 6.5F, 6.5F);
	public static Block decupleCompressedWhiteCobblestone = registerBlockNormal("decuple_compressed_white_cobblestone", 7.0F, 7.0F);

	public static Block purpleheartLog = registerBlockNormal("purpleheart_log", 2.0F, 2.0F);
	public static Block purpleheartPlanks = registerBlockNormal("purpleheart_planks", 2.0F, 2.0F);
	// public static Block purpleheartLeaves;

	// public static Block padaukLog = registerBlockNormal("padauk_log", 2.0F,
	// 2.0F);
	// public static Block paduakPlanks = registerBlockNormal("padauk_planks",
	// 2.0F, 2.0F);
	public static Block padaukLeaves;
	
	

	public static Item exaltedDiamondOreItem = new ItemBlock(exaltedDiamondOre).setRegistryName("exalted_diamond_ore").setUnlocalizedName("exalted_diamond_ore");
	public static Item bloodDiamondOreItem = new ItemBlock(bloodDiamondOre).setRegistryName("blood_diamond_ore").setUnlocalizedName("blood_diamond_ore");
	public static Item terraDiamondOreItem = new ItemBlock(terraDiamondOre).setRegistryName("terra_diamond_ore").setUnlocalizedName("terra_diamond_ore");
	public static Item copperOreItem = new ItemBlock(copperOre).setRegistryName("copper_ore").setUnlocalizedName("copper_ore");
	public static Item mortiumOreItem = new ItemBlock(mortiumOre).setRegistryName("mortium_ore").setUnlocalizedName("mortium_ore");
	public static Item tinOreItem = new ItemBlock(tinOre).setRegistryName("tin_ore").setUnlocalizedName("tin_ore");
	public static Item toslotriumOreItem = new ItemBlock(toslotriumOre).setRegistryName("toslotrium_ore").setUnlocalizedName("toslotrium_ore");
	public static Item vividiumOreItem = new ItemBlock(vividiumOre).setRegistryName("vividium_ore").setUnlocalizedName("vividium_ore");
	public static Item sphaleriteOreItem = new ItemBlock(sphaleriteOre).setRegistryName("sphalerite_ore").setUnlocalizedName("sphalerite_ore");
	public static Item silverOreItem = new ItemBlock(silverOre).setRegistryName("silver_ore").setUnlocalizedName("silver_ore");
	public static Item platinumOreItem = new ItemBlock(platinumOre).setRegistryName("platinum_ore").setUnlocalizedName("platinum_ore");
	public static Item titaniumOreItem = new ItemBlock(titaniumOre).setRegistryName("titanium_ore").setUnlocalizedName("titanium_ore");
	public static Item galenaOreItem = new ItemBlock(galenaOre).setRegistryName("galena_ore").setUnlocalizedName("galena_ore");
	public static Item pentlanditeOreItem = new ItemBlock(pentlanditeOre).setRegistryName("pentlandite_ore").setUnlocalizedName("pentlandite_ore");
	public static Item skyIronOreItem = new ItemBlock(skyIronOre).setRegistryName("sky_iron_ore").setUnlocalizedName("sky_iron_ore");
	public static Item terriumOreItem = new ItemBlock(terriumOre).setRegistryName("terrium_ore").setUnlocalizedName("terrium_ore");
	public static Item aluminumOreItem = new ItemBlock(aluminumOre).setRegistryName("aluminum_ore").setUnlocalizedName("aluminum_ore");
	
	public static Item meteorItem = new ItemBlock(meteor).setRegistryName("meteor").setUnlocalizedName("meteor");

	public static Item moonStoneItem = new ItemBlock(moonStone).setRegistryName("moon_stone").setUnlocalizedName("moon_stone");
	public static Item moonSandItem = new ItemBlock(moonSand).setRegistryName("moon_sand").setUnlocalizedName("moon_sand");
	public static Item moonTeleporterItem = new ItemBlock(moonTeleporter).setRegistryName("moon_teleporter").setUnlocalizedName("moon_teleporter");

	public static Item mysticStoneItem = new ItemBlock(mysticStone);
	public static Item mysticDirtItem = new ItemBlock(mysticDirt);
	
	public static Item lunaDiamondOreItem = new ItemBlock(lunaDiamondOre).setRegistryName("luna_diamond_ore").setUnlocalizedName("luna_diamond_ore");
	public static Item moonIronOreItem = new ItemBlock(moonIronOre).setRegistryName("moon_iron_ore").setUnlocalizedName("moon_diamond_ore");

	public static Item copperBlockItem = new ItemBlock(copperBlock).setRegistryName("copper_block").setUnlocalizedName("copper_block");
	public static Item steelBlockItem = new ItemBlock(steelBlock).setRegistryName("steel_block").setUnlocalizedName("steel_block");
	public static Item terraDiamondBlockItem = new ItemBlock(terraDiamondBlock).setRegistryName("terra_diamond_block").setUnlocalizedName("terra_diamond_block");
	public static Item exaltedDiamondBlockItem = new ItemBlock(exaltedDiamondBlock).setRegistryName("exalted_diamond_block").setUnlocalizedName("exalted_diamond_block");
	public static Item bloodDiamondBlockItem = new ItemBlock(bloodDiamondBlock).setRegistryName("blood_diamond_block").setUnlocalizedName("blood_diamond_block");
	public static Item tinBlockItem = new ItemBlock(tinBlock).setRegistryName("tin_block").setUnlocalizedName("tin_block");
	public static Item tyionetiumBlockItem = new ItemBlock(tyionetiumBlock).setRegistryName("tyionetium_block").setUnlocalizedName("tyionetium_block");
	public static Item bronzeBlockItem = new ItemBlock(bronzeBlock).setRegistryName("bronze_block").setUnlocalizedName("bronze_block");
	public static Item brightflameBlockItem = new ItemBlock(brightflameBlock).setRegistryName("brightflame_block").setUnlocalizedName("brightflame_block");
	public static Item brightsteelBlockItem = new ItemBlock(brightsteelBlock).setRegistryName("brightsteel_block").setUnlocalizedName("brightsteel_block");
	public static Item reforgedGoldBlockItem = new ItemBlock(reforgedGoldBlock).setRegistryName("reforged_gold_block").setUnlocalizedName("reforged_gold_block");
	public static Item magicBlockItem = new ItemBlock(magicBlock).setRegistryName("magic_block").setUnlocalizedName("magic_block");
	public static Item mithrilBlockItem = new ItemBlock(mithrilBlock).setRegistryName("mithril_block").setUnlocalizedName("mithril_block");
	public static Item mortiumBlockItem = new ItemBlock(mortiumBlock).setRegistryName("mortium_block").setUnlocalizedName("mortium_block");
	public static Item mysteriousBlockItem = new ItemBlock(mysteriousBlock).setRegistryName("mysterious_block").setUnlocalizedName("mysterious_block");
	public static Item mysticBlockItem = new ItemBlock(mysticBlock).setRegistryName("mystic_block").setUnlocalizedName("mystic_block");
	public static Item skyIronBlockItem = new ItemBlock(skyIronBlock).setRegistryName("sky_iron_block").setUnlocalizedName("sky_iron_block");
	public static Item terriumBlockItem = new ItemBlock(terriumBlock).setRegistryName("terrium_block").setUnlocalizedName("terrium_block");
	public static Item toslotriumBlockItem = new ItemBlock(toslotriumBlock).setRegistryName("toslotrium_block").setUnlocalizedName("toslotrium_block");
	public static Item vividiumBlockItem = new ItemBlock(vividiumBlock).setRegistryName("vividium_block").setUnlocalizedName("vividium_block");
	public static Item sphaleriteBlockItem = new ItemBlock(sphaleriteBlock).setRegistryName("sphalerite_block").setUnlocalizedName("sphalerite_block");
	public static Item extranetiumBlockItem = new ItemBlock(extranetiumBlock).setRegistryName("extranetium_block").setUnlocalizedName("extranetium_block");
	public static Item silverBlockItem = new ItemBlock(silverBlock).setRegistryName("silver_block").setUnlocalizedName("silver_block");
	public static Item platinumBlockItem = new ItemBlock(platinumBlock).setRegistryName("platinum_block").setUnlocalizedName("platinum_block");
	public static Item titaniumBlockItem = new ItemBlock(titaniumBlock).setRegistryName("titanium_block").setUnlocalizedName("titanium_block");
	public static Item zincBlockItem = new ItemBlock(zincBlock).setRegistryName("zinc_block").setUnlocalizedName("zinc_block");
	public static Item brassBlockItem = new ItemBlock(brassBlock).setRegistryName("brass_block").setUnlocalizedName("brass_block");
	public static Item leadBlockItem = new ItemBlock(leadBlock).setRegistryName("lead_block").setUnlocalizedName("lead_block");
	public static Item nickelBlockItem = new ItemBlock(nickelBlock).setRegistryName("nickel_block").setUnlocalizedName("nickel_block");
	public static Item pewterBlockItem = new ItemBlock(pewterBlock).setRegistryName("pewter_block").setUnlocalizedName("pewter_block");
	public static Item aluminumBlockItem = new ItemBlock(aluminumBlock).setRegistryName("aluminum_block").setUnlocalizedName("aluminum_block");
	public static Item mnemiumBlockItem = new ItemBlock(mnemiumBlock).setRegistryName("mnemium_block").setUnlocalizedName("mnemium_block");
	public static Item eterniumBlockItem = new ItemBlock(eterniumBlock).setRegistryName("eternium_block").setUnlocalizedName("eternium_block");
	public static Item fantasiumBlockItem = new ItemBlock(fantasiumBlock).setRegistryName("fantasium_block").setUnlocalizedName("fantasium_block");
	public static Item scorniumBlockItem = new ItemBlock(scorniumBlock).setRegistryName("scornium_block").setUnlocalizedName("scornium_block");
	public static Item electrumBlockItem = new ItemBlock(electrumBlock).setRegistryName("electrum_block").setUnlocalizedName("electrum_block");
	public static Item laeniumBlockItem = new ItemBlock(laeniumBlock).setRegistryName("laenium_block").setUnlocalizedName("laenium_block");
	public static Item magneiumBlockItem = new ItemBlock(magneiumBlock).setRegistryName("magneium_block").setUnlocalizedName("magneium_block");
	public static Item sterlingSilverBlockItem = new ItemBlock(sterlingSilverBlock).setRegistryName("sterling_silver_block");
	public static Item roseGoldBlockItem = new ItemBlock(roseGoldBlock).setRegistryName("rose_gold_block").setUnlocalizedName("rose_gold_block");
	public static Item whiteGoldBlockItem = new ItemBlock(whiteGoldBlock).setRegistryName("white_gold_block").setUnlocalizedName("white_gold_block");
	public static Item spangoldBlockItem = new ItemBlock(spangoldBlock).setRegistryName("spangold_block").setUnlocalizedName("spangold_block");
	public static Item meteoricIronBlockItem = new ItemBlock(meteoricIronBlock).setRegistryName("meteoric_iron_block").setUnlocalizedName("meteoric_iron_block");
	public static Item maduumBlockItem = new ItemBlock(maduumBlock).setRegistryName("maduum_block").setUnlocalizedName("maduum_block");
	public static Item immortaliumBlockItem = new ItemBlock(immortaliumBlock).setRegistryName("immortalium_block").setUnlocalizedName("immortalium_block");
	
	public static Item storeBoxItem = new ItemBlock(storeBox).setRegistryName("store_box").setUnlocalizedName("store_box");
	public static Item superStoreBoxItem = new ItemBlock(superStoreBox).setRegistryName("super_store_box").setUnlocalizedName("super_store_box");
	public static Item mysteriousBoxItem = new ItemBlock(mysteriousBox).setRegistryName("mysterious_box").setUnlocalizedName("mysterious_box");
	public static Item diamondStoreBoxItem = new ItemBlock(diamondStoreBox).setRegistryName("diamond_store_box").setUnlocalizedName("diamond_store_box");

	public static Item alloyFurnaceItem = new ItemBlock(alloyFurnace).setRegistryName("alloy_furnace").setUnlocalizedName("alloy_furnace");
	public static Item alloyFurnaceActiveItem = new ItemBlock(alloyFurnaceActive).setRegistryName("alloy_furnace_active").setUnlocalizedName("alloy_furnace_active");
	
	public static Item copperAlloyFurnaceItem = new ItemBlock(copperAlloyFurnace).setRegistryName("copper_alloy_furnace").setUnlocalizedName("copper_alloy_furnace");
	public static Item copperAlloyFurnaceActiveItem = new ItemBlock(copperAlloyFurnaceActive).setRegistryName("copper_alloy_furnace_active").setUnlocalizedName("copper_alloy_furnace_active");
	
	public static Item copperFurnaceItem = new ItemBlock(copperFurnace).setRegistryName("copper_furnace").setUnlocalizedName("copper_furnace");
	public static Item copperFurnaceActiveItem = new ItemBlock(copperFurnaceActive).setRegistryName("copper_furnace_active").setUnlocalizedName("copper_furnace_active");
	
	public static Item whiteStoneItem = new ItemBlock(whiteStone).setRegistryName("white_stone").setUnlocalizedName("white_stone");
	public static Item whiteCobblestoneItem = new ItemBlock(whiteCobblestone).setRegistryName("white_cobblestone").setUnlocalizedName("white_cobblestone");
	
	public static Item compressedWhiteCobblestoneItem = new ItemBlock(compressedWhiteCobblestone).setRegistryName("compressed_white_cobblestone").setUnlocalizedName("compressed_white_cobblestone");
	public static Item doubleCompressedWhiteCobblestoneItem = new ItemBlock(doubleCompressedWhiteCobblestone).setRegistryName("double_compressed_white_cobblestone").setUnlocalizedName("double_compressed_white_cobblestone");
	public static Item tripleCompressedWhiteCobblestoneItem = new ItemBlock(tripleCompressedWhiteCobblestone).setRegistryName("triple_compressed_white_cobblestone").setUnlocalizedName("triple_compressed_white_cobblestone");
	public static Item quadrupleCompressedWhiteCobblestoneItem = new ItemBlock(quadrupleCompressedWhiteCobblestone).setRegistryName("quadruple_compressed_white_cobblestone").setUnlocalizedName("quadruple_compressed_white_cobblestone");
	public static Item quintupleCompressedWhiteCobblestoneItem = new ItemBlock(quintupleCompressedWhiteCobblestone).setRegistryName("quintuple_compressed_white_cobblestone").setUnlocalizedName("quintuple_compressed_white_cobblestone");
	public static Item sextupleCompressedWhiteCobblestoneItem = new ItemBlock(sextupleCompressedWhiteCobblestone).setRegistryName("sextuple_compressed_white_cobblestone").setUnlocalizedName("sextuple_compressed_white_cobblestone");
	public static Item septupleCompressedWhiteCobblestoneItem = new ItemBlock(septupleCompressedWhiteCobblestone).setRegistryName("septuple_compressed_white_cobblestone").setUnlocalizedName("septuple_compressed_white_cobblestone");
	public static Item octupleCompressedWhiteCobblestoneItem = new ItemBlock(octupleCompressedWhiteCobblestone).setRegistryName("octuple_compressed_white_cobblestone").setUnlocalizedName("octuple_compressed_white_cobblestone");
	public static Item nonupleCompressedWhiteCobblestoneItem = new ItemBlock(nonupleCompressedWhiteCobblestone).setRegistryName("nonuple_compressed_white_cobblestone").setUnlocalizedName("nonuple_compressed_white_cobblestone");
	public static Item decupleCompressedWhiteCobblestoneItem = new ItemBlock(decupleCompressedWhiteCobblestone).setRegistryName("decuple_compressed_white_cobblestone").setUnlocalizedName("decuple_compressed_white_cobblestone");

	public static Item purpleheartLogItem = new ItemBlock(purpleheartLog).setRegistryName("purpleheart_log").setUnlocalizedName("purpleheart_log");
	public static Item purpleheartPlanksItem = new ItemBlock(purpleheartPlanks).setRegistryName("purpleheart_planks").setUnlocalizedName("purpleheart_planks");

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
	
	public static Block registerAlloyFurnace(String registryName, boolean active, boolean inTab, String identifier)
	{
		final Block aalloyFurnace = new AlloyFurnace(active);
		final Block copperAalloyFurnace = new CopperAlloyFurnace(active);
		if(identifier == "regular")
		{
			if(inTab) aalloyFurnace.setCreativeTab(TSECreativeTabs.tabMachines);
			aalloyFurnace.setHardness(5.0F);
			aalloyFurnace.setResistance(5.0F);
			aalloyFurnace.setHarvestLevel("pickaxe", 1);
			if(!inTab) aalloyFurnace.setLightLevel(0.6F);
			final ItemBlock itemBlock = new ItemBlock(aalloyFurnace);
			return registerBlock(registryName, itemBlock, aalloyFurnace);
		}
		else if(identifier == "copper")
		{
			if(inTab) copperAalloyFurnace.setCreativeTab(TSECreativeTabs.tabMachines);
			copperAalloyFurnace.setHardness(5.0F);
			copperAalloyFurnace.setResistance(5.0F);
			copperAalloyFurnace.setHarvestLevel("pickaxe", 1);
			if(!inTab) copperAalloyFurnace.setLightLevel(0.6F);
			final ItemBlock itemBlock = new ItemBlock(copperAalloyFurnace);
			return registerBlock(registryName, itemBlock, copperAalloyFurnace);
		}
		else
		{
			throw new NullPointerException("Identifier for alloyfurnace does not exist.");
		}
	}
	
	public static Block registerFurnace(String registryName, boolean active, boolean inTab)
	{
		final Block block = new BlockCopperFurnace(active);
		if(inTab)
		{
			block.setCreativeTab(TSECreativeTabs.tabMachines);
		}
		if(!inTab) block.setLightLevel(0.6F);
		block.setHardness(5.0F);
		block.setResistance(5.0F);
		block.setHarvestLevel("pickaxe", 1);
		final ItemBlock itemBlock = new ItemBlock(block);
		return registerBlock(registryName, itemBlock, block);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		final IForgeRegistry<Block> registry = event.getRegistry();
		TheStuffExtension.log("Registering blocks...");
		registry.registerAll(
				exaltedDiamondOre, bloodDiamondOre, terraDiamondOre, copperOre, mortiumOre, tinOre, toslotriumOre, vividiumOre, silverOre, platinumOre, titaniumOre, galenaOre, pentlanditeOre, skyIronOre, terriumOre, aluminumOre, sphaleriteOre,
				
				meteor,

				/*moonStone, moonSand, moonTeleporter,*/

				lunaDiamondOre, moonIronOre,

				copperBlock, steelBlock, tinBlock, tyionetiumBlock, bronzeBlock, brightflameBlock, brightsteelBlock, reforgedGoldBlock, magicBlock, mithrilBlock, mortiumBlock, mysteriousBlock, mysticBlock, skyIronBlock, terriumBlock, toslotriumBlock, vividiumBlock, extranetiumBlock, silverBlock, platinumBlock, titaniumBlock, zincBlock, brassBlock, leadBlock, nickelBlock, pewterBlock, aluminumBlock, mnemiumBlock, eterniumBlock, fantasiumBlock, scorniumBlock, electrumBlock, laeniumBlock, magneiumBlock, sterlingSilverBlock, roseGoldBlock, whiteGoldBlock, spangoldBlock, meteoricIronBlock, maduumBlock, immortaliumBlock,
				
				exaltedDiamondBlock, bloodDiamondBlock, terraDiamondBlock, 
				
				sphaleriteBlock,
				
				storeBox, superStoreBox, mysteriousBox, diamondStoreBox,

				alloyFurnace, alloyFurnaceActive,
				
				copperAlloyFurnace, copperAlloyFurnaceActive,
				
				copperFurnace, copperFurnaceActive,

				whiteStone, whiteCobblestone,
				
				compressedWhiteCobblestone, doubleCompressedWhiteCobblestone, tripleCompressedWhiteCobblestone, quadrupleCompressedWhiteCobblestone, quintupleCompressedWhiteCobblestone, sextupleCompressedWhiteCobblestone, septupleCompressedWhiteCobblestone, octupleCompressedWhiteCobblestone, nonupleCompressedWhiteCobblestone, decupleCompressedWhiteCobblestone,

				purpleheartLog, purpleheartPlanks

		// padaukLog, paduakPlanks
		);
		TheStuffExtension.log("Registered blocks.");
	}

	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		TheStuffExtension.log("Registering ItemBlocks...");
		registry.registerAll(
				exaltedDiamondOreItem, bloodDiamondOreItem, terraDiamondOreItem, copperOreItem, mortiumOreItem, tinOreItem, toslotriumOreItem, vividiumOreItem, sphaleriteOreItem, silverOreItem, platinumOreItem, titaniumOreItem, galenaOreItem, pentlanditeOreItem, skyIronOreItem, terriumOreItem, aluminumOreItem,
				
				meteorItem,

				/*moonStoneItem, moonSandItem, moonTeleporterItem,*/

				lunaDiamondOreItem, moonIronOreItem,

				copperBlockItem, steelBlockItem, tinBlockItem, tyionetiumBlockItem, bronzeBlockItem, brightflameBlockItem, brightsteelBlockItem, reforgedGoldBlockItem, magicBlockItem, mithrilBlockItem, mortiumBlockItem, mysteriousBlockItem, mysticBlockItem, skyIronBlockItem, terriumBlockItem, toslotriumBlockItem, vividiumBlockItem, extranetiumBlockItem, silverBlockItem, platinumBlockItem, titaniumBlockItem, zincBlockItem, brassBlockItem, leadBlockItem, nickelBlockItem, pewterBlockItem, aluminumBlockItem, mnemiumBlockItem, eterniumBlockItem, fantasiumBlockItem, scorniumBlockItem, electrumBlockItem, laeniumBlockItem, magneiumBlockItem, sterlingSilverBlockItem, roseGoldBlockItem, whiteGoldBlockItem, spangoldBlockItem, meteoricIronBlockItem, maduumBlockItem, immortaliumBlockItem,
	
				exaltedDiamondBlockItem, bloodDiamondBlockItem, terraDiamondBlockItem, 
				
				sphaleriteBlockItem,
				
				storeBoxItem, superStoreBoxItem, mysteriousBoxItem, diamondStoreBoxItem,

				alloyFurnaceItem, alloyFurnaceActiveItem,
				
				copperAlloyFurnaceItem, copperAlloyFurnaceActiveItem,
				
				copperFurnaceItem, copperFurnaceActiveItem,
				
				whiteStoneItem, whiteCobblestoneItem,
				
				compressedWhiteCobblestoneItem, doubleCompressedWhiteCobblestoneItem, tripleCompressedWhiteCobblestoneItem, quadrupleCompressedWhiteCobblestoneItem, quintupleCompressedWhiteCobblestoneItem, sextupleCompressedWhiteCobblestoneItem, septupleCompressedWhiteCobblestoneItem, octupleCompressedWhiteCobblestoneItem, nonupleCompressedWhiteCobblestoneItem, decupleCompressedWhiteCobblestoneItem,
				
				purpleheartLogItem, purpleheartPlanksItem

		// padaukLogItem, padaukPlanksItem
		);
		TheStuffExtension.log("Registered ItemBlocks.");
	}

}
