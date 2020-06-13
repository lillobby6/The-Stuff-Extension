package com.tse.common.world.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.ItemManager;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockManager {
	private static Random rand = new Random();
	
	private static List<Block> registeredBlocks = new ArrayList<Block>();

	public static Block exaltedDiamondOre = new TSEBlockOre("exalted_diamond_ore", Material.ROCK, 2, "pickaxe", 4.0F, 1.0F, TSECreativeTabs.tabOres, ItemManager.exaltedDiamond);
	public static Block bloodDiamondOre = new TSEBlockOre("blood_diamond_ore", Material.ROCK, 2, "pickaxe", 4.0F, 1.0F, TSECreativeTabs.tabOres, ItemManager.bloodDiamond);
	public static Block terraDiamondOre = new TSEBlockOre("terra_diamond_ore", Material.ROCK, 2, "pickaxe", 4.0F, 1.0F, TSECreativeTabs.tabOres, ItemManager.terraDiamond);
	
	public static Block copperOre = new TSEBlockOre("copper_ore", Material.ROCK, 1, "pickaxe", 2.0F, 4.0F, TSECreativeTabs.tabOres);
	public static Block mortiumOre = new TSEBlockOre("mortium_ore", Material.ROCK, 3, "pickaxe", 5.0F, 6.0F, TSECreativeTabs.tabOres);
	public static Block tinOre = new TSEBlockOre("tin_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block toslotriumOre = new TSEBlockOre("toslotrium_ore", Material.ROCK, 1, "pickaxe", 1.0F, 4.0F, TSECreativeTabs.tabOres);
	public static Block vividiumOre = new TSEBlockOre("vividium_ore", Material.ROCK, 3, "pickaxe", 6.0F, 5.0F, TSECreativeTabs.tabOres);
	public static Block sphaleriteOre = new TSEBlockOre("sphalerite_ore", Material.ROCK, 1, "pickaxe", 4.0F, 2.0F, TSECreativeTabs.tabOres);
	public static Block silverOre = new TSEBlockOre("silver_ore", Material.ROCK, 2, "pickaxe", 4.0F, 8.0F, TSECreativeTabs.tabOres);
	public static Block platinumOre = new TSEBlockOre("platinum_ore", Material.ROCK, 3, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block titaniumOre = new TSEBlockOre("titanium_ore", Material.ROCK, 3, "pickaxe", 7.0F, 8.0F, TSECreativeTabs.tabOres);
	public static Block galenaOre = new TSEBlockOre("galena_ore", Material.ROCK, 2, "pickaxe", 3.0F, 4.0F, TSECreativeTabs.tabOres);
	public static Block pentlanditeOre = new TSEBlockOre("pentlandite_ore", Material.ROCK, 2, "pickaxe", 5.0F, 2.0F, TSECreativeTabs.tabOres);
	public static Block skyIronOre = new TSEBlockOre("sky_iron_ore", Material.ROCK, 1, "pickaxe", 2.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block terriumOre = new TSEBlockOre("terrium_ore", Material.ROCK, 4, "pickaxe", 8.0F, 8.0F, TSECreativeTabs.tabOres);
	public static Block aluminumOre = new TSEBlockOre("aluminum_ore", Material.ROCK, 1, "pickaxe", 2.0F, 3.0F, TSECreativeTabs.tabOres);
	
	public static Block meteor = new TSEBlockOre("meteor", Material.ROCK, 1, "pickaxe", 3.0F, 50.0F, TSECreativeTabs.tabOres, ItemManager.sphaleriteGem, rand.nextInt(3));
			
	//TODO Moon stuff
	public static Block moonStone;// = new TSEBlock("moon_stone", 3.0F, 3.0F);
	public static Block moonSand;// = registerBlockWithSound("moon_sand", 2.0F, 2.0F, SoundType.SAND);
	public static Block moonTeleporter;// = new TSEBlock("moon_teleporter", 3.0F, 3.0F);
	
	//TODO Create converter - converts equivalent TSE materials for other TSE materials - Vividium for mortium, brightsteel for brightflame, etc.
	
	public static Block converter;
	public static Block crusher;
	public static Block filterer;
	
	public static Block mysticStone;// = new TSEBlock("mystic_stone", 3.0F,3.0F);
	public static Block mysticDirt;// = new TSEBlock("mystic_dirt",1.0F, 1.0F); 
	public static Block mysticLog;// = new TSEBlock("mystic_log", 2.0F, 2.0F);
	public static Block mysticPlanks;// = new TSEBlock("mystic_planks", 2.0F, 2.0F);
	 

	public static Block lunaDiamondOre;// = registerOre("luna_diamond_ore", Material.ROCK, 3, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);
	public static Block moonIronOre;// = registerOre("moon_iron_ore", Material.ROCK, 1, "pickaxe", 3.0F, 3.0F, TSECreativeTabs.tabOres);

	public static Block copperBlock = new TSEBlock("copper_block", 3.0F, 3.0F);
	public static Block steelBlock = new TSEBlock("steel_block", 3.0F, 3.0F);
	public static Block terraDiamondBlock = new TSEBlock("terra_diamond_block", 3.0F, 3.0F);
	public static Block exaltedDiamondBlock = new TSEBlock("exalted_diamond_block", 3.0F, 3.0F);
	public static Block bloodDiamondBlock = new TSEBlock("blood_diamond_block", 3.0F, 3.0F);
	public static Block tinBlock = new TSEBlock("tin_block", 3.0F, 3.0F);
	public static Block tyionetiumBlock = new TSEBlock("tyionetium_block", 3.0F, 3.0F);
	public static Block bronzeBlock = new TSEBlock("bronze_block", 3.0F, 3.0F);
	public static Block brightflameBlock = new TSEBlock("brightflame_block", 3.0F, 3.0F);
	public static Block brightsteelBlock = new TSEBlock("brightsteel_block", 3.0F, 3.0F);
	public static Block reforgedGoldBlock = new TSEBlock("reforged_gold_block", 3.0F, 3.0F);
	public static Block magicBlock = new TSEBlock("magic_block", 3.0F, 3.0F);
	public static Block mithrilBlock = new TSEBlock("mithril_block", 3.0F, 3.0F);
	public static Block mortiumBlock = new TSEBlock("mortium_block", 3.0F, 3.0F);
	public static Block mysteriousBlock = new TSEBlock("mysterious_block", 3.0F, 3.0F);
	public static Block mysticBlock = new TSEBlock("mystic_block", 3.0F, 3.0F);
	public static Block skyIronBlock = new TSEBlock("sky_iron_block", 3.0F, 3.0F);
	public static Block terriumBlock = new TSEBlock("terrium_block", 3.0F, 3.0F);
	public static Block toslotriumBlock = new TSEBlock("toslotrium_block", 3.0F, 3.0F);
	public static Block vividiumBlock = new TSEBlock("vividium_block", 3.0F, 3.0F);
	public static Block sphaleriteBlock = new TSEBlock("sphalerite_block", 3.0F, 3.0F);
	public static Block extranetiumBlock = new TSEBlock("extranetium_block", 3.0F, 3.0F);
	public static Block silverBlock = new TSEBlock("silver_block", 3.0F, 3.0F);
	public static Block platinumBlock = new TSEBlock("platinum_block", 3.0F, 3.0F);
	public static Block titaniumBlock = new TSEBlock("titanium_block", 3.0F, 3.0F);
	public static Block zincBlock = new TSEBlock("zinc_block", 3.0F, 3.0F);
	public static Block brassBlock = new TSEBlock("brass_block", 3.0F, 3.0F);
	public static Block leadBlock = new TSEBlock("lead_block", 3.0F, 3.0F);
	public static Block nickelBlock = new TSEBlock("nickel_block", 3.0F, 3.0F);
	public static Block pewterBlock = new TSEBlock("pewter_block", 3.0F, 3.0F);
	public static Block aluminumBlock = new TSEBlock("aluminum_block", 3.0F, 3.0F);
	public static Block mnemiumBlock = new TSEBlock("mnemium_block", 3.0F, 3.0F);
	public static Block eterniumBlock = new TSEBlock("eternium_block", 3.0F, 3.0F);
	public static Block fantasiumBlock = new TSEBlock("fantasium_block", 3.0F, 3.0F);
	public static Block scorniumBlock = new TSEBlock("scornium_block", 3.0F, 3.0F);
	public static Block electrumBlock = new TSEBlock("electrum_block", 3.0F, 3.0F);
	public static Block laeniumBlock = new TSEBlock("laenium_block", 3.0F, 3.0F);
	public static Block magneiumBlock = new TSEBlock("magneium_block", 3.0F, 3.0F);
	public static Block sterlingSilverBlock = new TSEBlock("sterling_silver_block", 3.0F, 3.0F);
	public static Block roseGoldBlock = new TSEBlock("rose_gold_block", 3.0F, 3.0F);
	public static Block whiteGoldBlock = new TSEBlock("white_gold_block", 3.0F, 3.0F);
	public static Block spangoldBlock = new TSEBlock("spangold_block", 3.0F, 3.0F);
	public static Block meteoricIronBlock = new TSEBlock("meteoric_iron_block", 3.0F, 3.0F);
	public static Block maduumBlock = new TSEBlock("maduum_block", 10.0F, 100.0F);
	public static Block immortaliumBlock = new TSEBlock("immortalium_block", 10.0F, 100.0F);
	
	public static Block storeBox = new BlockStoreBox("store_box");
	public static Block mysteriousBox = new BlockMysteriousBox("mysterious_box");
	public static Block superStoreBox = new BlockSuperStoreBox("super_store_box");
	public static Block diamondStoreBox = new BlockDiamondStoreBox("diamond_store_box");

	public static Block alloyFurnace = new BlockAlloyFurnace(false, "alloy_furnace");
	public static Block alloyFurnaceActive = new BlockAlloyFurnace(true, "alloy_furnace_active");
	
	public static Block copperAlloyFurnace = new BlockCopperAlloyFurnace(false, "copper_alloy_furnace");
	public static Block copperAlloyFurnaceActive = new BlockCopperAlloyFurnace(true, "copper_alloy_furnace_active");
	
	public static Block copperFurnace = new BlockCopperFurnace(false, "copper_furnace");
	public static Block copperFurnaceActive = new BlockCopperFurnace(true, "copper_furnace_active");
	
	public static Block whiteStone = new TSEBlock("white_stone", 2.0F, 2.0F);
	public static Block whiteCobblestone = new TSEBlock("white_cobblestone", 2.0F, 2.0F);
	
	public static Block compressedWhiteCobblestone = new TSEBlock("compressed_white_cobblestone", 2.5F, 2.5F);
	public static Block doubleCompressedWhiteCobblestone = new TSEBlock("double_compressed_white_cobblestone", 3.0F, 3.0F);
	public static Block tripleCompressedWhiteCobblestone = new TSEBlock("triple_compressed_white_cobblestone", 3.5F, 3.5F);
	public static Block quadrupleCompressedWhiteCobblestone = new TSEBlock("quadruple_compressed_white_cobblestone", 4.0F, 4.0F);
	public static Block quintupleCompressedWhiteCobblestone = new TSEBlock("quintuple_compressed_white_cobblestone", 4.5F, 4.5F);
	public static Block sextupleCompressedWhiteCobblestone = new TSEBlock("sextuple_compressed_white_cobblestone", 5.0F, 5.0F);
	public static Block septupleCompressedWhiteCobblestone = new TSEBlock("septuple_compressed_white_cobblestone", 5.5F, 5.5F);
	public static Block octupleCompressedWhiteCobblestone = new TSEBlock("octuple_compressed_white_cobblestone", 6.0F, 6.0F);
	public static Block nonupleCompressedWhiteCobblestone = new TSEBlock("nonuple_compressed_white_cobblestone", 6.5F, 6.5F);
	public static Block decupleCompressedWhiteCobblestone = new TSEBlock("decuple_compressed_white_cobblestone", 7.0F, 7.0F);

	public static Block purpleheartLog = new TSEBlock("purpleheart_log", 2.0F, 2.0F);
	public static Block purpleheartPlanks = new TSEBlock("purpleheart_planks", 2.0F, 2.0F);
	public static Block purpleheartLeaves;

	public static Block padaukLog;// = new TSEBlock("padauk_log", 2.0F, 2.0F);
	public static Block paduakPlanks;// = new TSEBlock("padauk_planks", 2.0F, 2.0F);
	public static Block padaukLeaves;

	public static Block registerBlock(Block block) {

		registeredBlocks.add(block);
		ItemBlock iBlock = new ItemBlock(block);
		iBlock.setUnlocalizedName(block.getUnlocalizedName().substring(5));
		iBlock.setRegistryName(block.getUnlocalizedName().substring(5));
		ItemManager.registerItem(iBlock);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		final IForgeRegistry<Block> registry = event.getRegistry();
		for(Block b: registeredBlocks)
		{
			registry.register(b);
		}
		TheStuffExtension.log("Registered blocks.");
	}
	
}
