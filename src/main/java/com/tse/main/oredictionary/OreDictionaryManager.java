package com.tse.main.oredictionary;

import com.tse.block.BlockManager;
import com.tse.item.ItemManager;
import com.tse.main.core.TheStuffExtension;

import jline.internal.Log;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryManager {

	public static void registerOres() {
		registerItems();
		registerBlocks();
	}

	public static void registerItems() {
		TheStuffExtension.log("Registering items to ore dictionary...");
		OreDictionary.registerOre("stickGold", ItemManager.goldenStick);
		OreDictionary.registerOre("stickDiamond", ItemManager.diamondStick);
		OreDictionary.registerOre("stickMystic", ItemManager.mysticStick);

		OreDictionary.registerOre("stickIron", ItemManager.ironRod);
		OreDictionary.registerOre("stickSteel", ItemManager.steelRod);
		OreDictionary.registerOre("stickBronze", ItemManager.bronzeRod);
		OreDictionary.registerOre("stickBrass", ItemManager.brassRod);
		OreDictionary.registerOre("stickTitanium", ItemManager.titaniumRod);

		OreDictionary.registerOre("gemDiamondExalted", ItemManager.exaltedDiamond);
		OreDictionary.registerOre("gemDiamondBlood", ItemManager.bloodDiamond);
		OreDictionary.registerOre("gemDiamondTerra", ItemManager.terraDiamond);
		OreDictionary.registerOre("gemDiamondLuna", ItemManager.lunaDiamond);

		OreDictionary.registerOre("gemSphalerite", ItemManager.sphaleriteGem);

		OreDictionary.registerOre("ingotCopper", ItemManager.copperIngot);
		OreDictionary.registerOre("ingotSteel", ItemManager.steelIngot);
		OreDictionary.registerOre("ingotTin", ItemManager.tinIngot);
		OreDictionary.registerOre("ingotTyionetium", ItemManager.tyionetiumIngot);
		OreDictionary.registerOre("ingotBronze", ItemManager.bronzeIngot);
		OreDictionary.registerOre("ingotBrightflame", ItemManager.brightflameIngot);
		OreDictionary.registerOre("ingotBrightsteel", ItemManager.brightsteelIngot);
		OreDictionary.registerOre("ingotDiamond", ItemManager.diamondIngot);
		OreDictionary.registerOre("ingotGoldReforged", ItemManager.reforgedGoldIngot);
		OreDictionary.registerOre("ingotMagic", ItemManager.magicIngot);
		OreDictionary.registerOre("ingotMithril", ItemManager.mithrilIngot);
		OreDictionary.registerOre("ingotMortium", ItemManager.mortiumIngot);
		OreDictionary.registerOre("ingotMysterious", ItemManager.mysteriousIngot);
		OreDictionary.registerOre("ingotMystic", ItemManager.mysticIngot);
		OreDictionary.registerOre("ingotIronSky", ItemManager.skyIronIngot);
		OreDictionary.registerOre("ingotTerrium", ItemManager.terriumIngot);
		OreDictionary.registerOre("ingotToslotrium", ItemManager.toslotriumIngot);
		OreDictionary.registerOre("ingotVividium", ItemManager.vividiumIngot);
		OreDictionary.registerOre("ingotExtranetium", ItemManager.extranetiumIngot);
		OreDictionary.registerOre("ingotSilver", ItemManager.silverIngot);
		OreDictionary.registerOre("ingotPlatinum", ItemManager.platinumIngot);
		OreDictionary.registerOre("ingotTitanium", ItemManager.titaniumIngot);
		OreDictionary.registerOre("ingotZinc", ItemManager.zincIngot);
		OreDictionary.registerOre("ingotBrass", ItemManager.brassIngot);
		OreDictionary.registerOre("ingotLead", ItemManager.leadIngot);
		OreDictionary.registerOre("ingotNickel", ItemManager.nickelIngot);
		OreDictionary.registerOre("ingotPewter", ItemManager.pewterIngot);
		OreDictionary.registerOre("ingotAluminum", ItemManager.aluminumIngot);
		OreDictionary.registerOre("ingotMnemium", ItemManager.mnemiumIngot);
		OreDictionary.registerOre("ingotEternium", ItemManager.eterniumIngot);

		OreDictionary.registerOre("nuggetMagic", ItemManager.magicNugget);
		OreDictionary.registerOre("nuggetMystic", ItemManager.mysticNugget);
		OreDictionary.registerOre("nuggetMysterious", ItemManager.mysteriousIngot);
		OreDictionary.registerOre("nuggetBrightflame", ItemManager.brightflameNugget);
		OreDictionary.registerOre("nuggetDiamond", ItemManager.diamondNugget);
		OreDictionary.registerOre("nuggetBronze", ItemManager.bronzeNugget);
		OreDictionary.registerOre("nuggetBrass", ItemManager.brassNugget);
		OreDictionary.registerOre("nuggetPlatinum", ItemManager.platinumNugget);
		OreDictionary.registerOre("nuggetTitanium", ItemManager.titaniumNugget);
		OreDictionary.registerOre("nuggetSteel", ItemManager.steelNugget);
		TheStuffExtension.log("Finished registering items to ore dictionary.");
	}

	public static void registerBlocks() {
		TheStuffExtension.log("Registering blocks to ore dictionary...");
		OreDictionary.registerOre("oreDiamondExalted", BlockManager.exaltedDiamondOre);
		OreDictionary.registerOre("oreDiamondBlood", BlockManager.bloodDiamondOre);
		OreDictionary.registerOre("oreDiamondTerra", BlockManager.terraDiamondOre);
		OreDictionary.registerOre("oreCopper", BlockManager.copperOre);
		OreDictionary.registerOre("oreMortium", BlockManager.mortiumOre);
		OreDictionary.registerOre("oreTin", BlockManager.tinOre);
		OreDictionary.registerOre("oreToslotrium", BlockManager.toslotriumOre);
		OreDictionary.registerOre("oreVividium", BlockManager.vividiumOre);
		OreDictionary.registerOre("oreSphalerite", BlockManager.sphaleriteOre);
		OreDictionary.registerOre("oreSilver", BlockManager.silverOre);
		OreDictionary.registerOre("orePlatinum", BlockManager.platinumOre);
		OreDictionary.registerOre("oreTitanium", BlockManager.titaniumOre);
		OreDictionary.registerOre("oreGalena", BlockManager.galenaOre);
		OreDictionary.registerOre("orePentlandite", BlockManager.pentlanditeOre);
		OreDictionary.registerOre("oreIronSky", BlockManager.skyIronOre);
		OreDictionary.registerOre("oreTerrium", BlockManager.terriumOre);
		OreDictionary.registerOre("oreAluminum", BlockManager.aluminumOre);

		OreDictionary.registerOre("oreIron", BlockManager.moonIronOre);

		OreDictionary.registerOre("blockCopper", BlockManager.copperBlock);
		OreDictionary.registerOre("blockSteel", BlockManager.steelBlock);
		OreDictionary.registerOre("blockDiamondTerra", BlockManager.terraDiamondBlock);
		OreDictionary.registerOre("blockDiamondExalted", BlockManager.exaltedDiamondBlock);
		OreDictionary.registerOre("blockTin", BlockManager.tinBlock);
		OreDictionary.registerOre("blockTyionetium", BlockManager.tyionetiumBlock);
		OreDictionary.registerOre("blockBronze", BlockManager.bronzeBlock);
		OreDictionary.registerOre("blockBrightflame", BlockManager.brightflameBlock);
		OreDictionary.registerOre("blockBrightsteel", BlockManager.brightsteelBlock);
		OreDictionary.registerOre("blockGoldReforged", BlockManager.reforgedGoldBlock);
		OreDictionary.registerOre("blockMagic", BlockManager.magicBlock);
		OreDictionary.registerOre("blockMithril", BlockManager.mithrilBlock);
		OreDictionary.registerOre("blockMortium", BlockManager.mortiumBlock);
		OreDictionary.registerOre("blockMysterious", BlockManager.mysteriousBlock);
		OreDictionary.registerOre("blockMystic", BlockManager.mysticBlock);
		OreDictionary.registerOre("blockIronSky", BlockManager.skyIronBlock);
		OreDictionary.registerOre("blockTerrium", BlockManager.terriumBlock);
		OreDictionary.registerOre("blockToslotrium", BlockManager.toslotriumBlock);
		OreDictionary.registerOre("blockVividium", BlockManager.vividiumBlock);
		OreDictionary.registerOre("blockSphalerite", BlockManager.sphaleriteBlock);
		OreDictionary.registerOre("blockExtranetium", BlockManager.extranetiumBlock);
		OreDictionary.registerOre("blockSilver", BlockManager.silverBlock);
		OreDictionary.registerOre("blockPlatinum", BlockManager.platinumBlock);
		OreDictionary.registerOre("blockTitanium", BlockManager.titaniumBlock);
		OreDictionary.registerOre("blockZinc", BlockManager.zincBlock);
		OreDictionary.registerOre("blockBrass", BlockManager.brassBlock);
		OreDictionary.registerOre("blockLead", BlockManager.leadBlock);
		OreDictionary.registerOre("blockNickel", BlockManager.nickelBlock);
		OreDictionary.registerOre("blockPewter", BlockManager.pewterBlock);
		OreDictionary.registerOre("blockAluminum", BlockManager.aluminumBlock);
		OreDictionary.registerOre("blockMnemium", BlockManager.mnemiumBlock);
		OreDictionary.registerOre("blockEternium", BlockManager.eterniumBlock);
		
		OreDictionary.registerOre("stone", BlockManager.whiteStone);
		OreDictionary.registerOre("cobblestone", BlockManager.whiteCobblestone);

		OreDictionary.registerOre("logWood", BlockManager.purpleheartLog);

		OreDictionary.registerOre("plankWood", BlockManager.purpleheartPlanks);
		// OreDictionary.registerOre("logWood", BlockManager.padaukLog);
		TheStuffExtension.log("Blocks registered to ore dictionary.");
	}
}
