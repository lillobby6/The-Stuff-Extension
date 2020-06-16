package com.tse.common.integration.oredictionary;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.world.block.BlockManager;
import com.tse.common.world.item.ItemManager;

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
		OreDictionary.registerOre("stickBrightflame", ItemManager.brightflameStick);
		OreDictionary.registerOre("stickBrightsteel", ItemManager.brightsteelStick);
		OreDictionary.registerOre("stickMagic", ItemManager.magicStick);
		OreDictionary.registerOre("stickMithril", ItemManager.mithrilStick);
		OreDictionary.registerOre("stickMyterious", ItemManager.mysteriousStick);
		OreDictionary.registerOre("stickExtranetium", ItemManager.extranetiumStick);
		OreDictionary.registerOre("stickEternium", ItemManager.eterniumStick);
		OreDictionary.registerOre("stickFantasium", ItemManager.fantasiumStick);
		OreDictionary.registerOre("stickScornium", ItemManager.scorniumStick);
		OreDictionary.registerOre("stickElectrum", ItemManager.electrumStick);
		OreDictionary.registerOre("stickLaenium", ItemManager.laeniumStick);
		OreDictionary.registerOre("stickMagneium", ItemManager.magneiumStick);
		OreDictionary.registerOre("stickSilverSterling", ItemManager.sterlingSilverStick);
		OreDictionary.registerOre("stickGoldRose", ItemManager.roseGoldStick);
		OreDictionary.registerOre("stickGoldWhite", ItemManager.whiteGoldStick);
		OreDictionary.registerOre("stickSpangold", ItemManager.spangoldStick);
		OreDictionary.registerOre("stickMaduum", ItemManager.maduumStick);
		OreDictionary.registerOre("stickImmortalium", ItemManager.immortaliumStick);
		OreDictionary.registerOre("stickIron", ItemManager.ironRod);
		OreDictionary.registerOre("stickCopper", ItemManager.copperRod);
		OreDictionary.registerOre("stickSteel", ItemManager.steelRod);
		OreDictionary.registerOre("stickTin", ItemManager.tinRod);
		OreDictionary.registerOre("stickTyionetium", ItemManager.tyionetiumRod);
		OreDictionary.registerOre("stickBronze", ItemManager.bronzeRod);
		OreDictionary.registerOre("stickMortium", ItemManager.mortiumRod);
		OreDictionary.registerOre("stickIronSky", ItemManager.skyIronRod);
		OreDictionary.registerOre("stickTerrium", ItemManager.terriumRod);
		OreDictionary.registerOre("stickToslotrium", ItemManager.toslotriumRod);
		OreDictionary.registerOre("stickVividium", ItemManager.vividiumRod);
		OreDictionary.registerOre("stickSilver", ItemManager.silverRod);
		OreDictionary.registerOre("stickPlatinum", ItemManager.platinumRod);
		OreDictionary.registerOre("stickTitanium", ItemManager.titaniumRod);
		OreDictionary.registerOre("stickZinc", ItemManager.zincRod);
		OreDictionary.registerOre("stickBrass", ItemManager.brassRod);
		OreDictionary.registerOre("stickLead", ItemManager.leadRod);
		OreDictionary.registerOre("stickNickel", ItemManager.nickelRod);
		OreDictionary.registerOre("stickPewter", ItemManager.pewterRod);
		OreDictionary.registerOre("stickAluminum", ItemManager.aluminumRod);
		OreDictionary.registerOre("stickMnemium", ItemManager.mnemiumRod);
		OreDictionary.registerOre("stickIronMeteoric", ItemManager.meteoricIronRod);
		
		OreDictionary.registerOre("gearWood", ItemManager.woodenGear);
		OreDictionary.registerOre("gearStone", ItemManager.stoneGear);
		
		OreDictionary.registerOre("gemDiamondExalted", ItemManager.exaltedDiamond);
		OreDictionary.registerOre("gemDiamondBlood", ItemManager.bloodDiamond);
		OreDictionary.registerOre("gemDiamondTerra", ItemManager.terraDiamond);
		OreDictionary.registerOre("gemDiamondLuna", ItemManager.lunaDiamond);
		OreDictionary.registerOre("gemDiamondSol", ItemManager.solDiamond);

		OreDictionary.registerOre("gemSphalerite", ItemManager.sphaleriteGem);
		OreDictionary.registerOre("oreZinc", ItemManager.sphaleriteGem);

		OreDictionary.registerOre("ingotDiamond", ItemManager.diamondIngot);
		
		OreDictionary.registerOre("ingotCopper", ItemManager.copperIngot);
		OreDictionary.registerOre("ingotSteel", ItemManager.steelIngot);
		OreDictionary.registerOre("ingotTin", ItemManager.tinIngot);
		OreDictionary.registerOre("ingotTyionetium", ItemManager.tyionetiumIngot);
		OreDictionary.registerOre("ingotBronze", ItemManager.bronzeIngot);
		OreDictionary.registerOre("ingotBrightflame", ItemManager.brightflameIngot);
		OreDictionary.registerOre("ingotBrightsteel", ItemManager.brightsteelIngot);
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
		OreDictionary.registerOre("ingotFantasium", ItemManager.fantasiumIngot);
		OreDictionary.registerOre("ingotScornium", ItemManager.scorniumIngot);
		OreDictionary.registerOre("ingotElectrum", ItemManager.electrumIngot);
		OreDictionary.registerOre("ingotLaenium", ItemManager.laeniumIngot);
		OreDictionary.registerOre("ingotMagneium", ItemManager.magneiumIngot);
		OreDictionary.registerOre("ingotSilverSterling", ItemManager.sterlingSilverIngot);
		OreDictionary.registerOre("ingotGoldRose", ItemManager.roseGoldIngot);
		OreDictionary.registerOre("ingotGoldWhite", ItemManager.whiteGoldIngot);
		OreDictionary.registerOre("ingotSpangold", ItemManager.spangoldIngot);
		OreDictionary.registerOre("ingotIronMeteoric", ItemManager.meteoricIronIngot);
		OreDictionary.registerOre("ingotMaduum", ItemManager.maduumIngot);
		OreDictionary.registerOre("ingotImmortalium", ItemManager.immortaliumIngot);
		
		OreDictionary.registerOre("nuggetDiamond", ItemManager.diamondNugget);

		OreDictionary.registerOre("nuggetCopper", ItemManager.copperNugget);
		OreDictionary.registerOre("nuggetSteel", ItemManager.steelNugget);
		OreDictionary.registerOre("nuggetTin", ItemManager.tinNugget);
		OreDictionary.registerOre("nuggetTyionetium", ItemManager.tyionetiumNugget);
		OreDictionary.registerOre("nuggetBronze", ItemManager.bronzeNugget);
		OreDictionary.registerOre("nuggetBrightflame", ItemManager.brightflameNugget);
		OreDictionary.registerOre("nuggetBrightsteel", ItemManager.brightsteelNugget);
		OreDictionary.registerOre("nuggetGoldReforged", ItemManager.reforgedGoldNugget);
		OreDictionary.registerOre("nuggetMagic", ItemManager.magicNugget);
		OreDictionary.registerOre("nuggetMithril", ItemManager.mithrilNugget);
		OreDictionary.registerOre("nuggetMortium", ItemManager.mortiumNugget);
		OreDictionary.registerOre("nuggetMysterious", ItemManager.mysteriousNugget);
		OreDictionary.registerOre("nuggetMystic", ItemManager.mysticNugget);
		OreDictionary.registerOre("nuggetIronSky", ItemManager.skyIronNugget);
		OreDictionary.registerOre("nuggetTerrium", ItemManager.terriumNugget);
		OreDictionary.registerOre("nuggetToslotrium", ItemManager.toslotriumNugget);
		OreDictionary.registerOre("nuggetVividium", ItemManager.vividiumNugget);
		OreDictionary.registerOre("nuggetExtranetium", ItemManager.extranetiumNugget);
		OreDictionary.registerOre("nuggetSilver", ItemManager.silverIngot);
		OreDictionary.registerOre("nuggetPlatinum", ItemManager.platinumNugget);	
		OreDictionary.registerOre("nuggetTitanium", ItemManager.titaniumNugget);
		OreDictionary.registerOre("nuggetZinc", ItemManager.zincNugget);
		OreDictionary.registerOre("nuggetBrass", ItemManager.brassNugget);
		OreDictionary.registerOre("nuggetLead", ItemManager.leadNugget);
		OreDictionary.registerOre("nuggetNickel", ItemManager.nickelNugget);
		OreDictionary.registerOre("nuggetPewter", ItemManager.pewterNugget);
		OreDictionary.registerOre("nuggetAluminum", ItemManager.aluminumNugget);
		OreDictionary.registerOre("nuggetMnemium", ItemManager.mnemiumNugget);
		OreDictionary.registerOre("nuggetEternium", ItemManager.eterniumNugget);
		OreDictionary.registerOre("nuggetFantasium", ItemManager.fantasiumNugget);
		OreDictionary.registerOre("nuggetSilverSterling", ItemManager.sterlingSilverNugget);
		OreDictionary.registerOre("nuggetGoldRose", ItemManager.roseGoldNugget);
		OreDictionary.registerOre("nuggetGoldWhite", ItemManager.whiteGoldNugget);
		OreDictionary.registerOre("nuggetSpangold", ItemManager.spangoldNugget);
		OreDictionary.registerOre("nuggetIronMeteoric", ItemManager.meteoricIronNugget);
		OreDictionary.registerOre("nuggetMaduum", ItemManager.maduumNugget);
		OreDictionary.registerOre("nuggetImmortalium", ItemManager.immortaliumNugget);

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
		OreDictionary.registerOre("oreLead", BlockManager.galenaOre);
		OreDictionary.registerOre("orePentlandite", BlockManager.pentlanditeOre);
		OreDictionary.registerOre("oreNickel", BlockManager.pentlanditeOre);
		OreDictionary.registerOre("oreIronSky", BlockManager.skyIronOre);
		OreDictionary.registerOre("oreTerrium", BlockManager.terriumOre);
		OreDictionary.registerOre("oreAluminum", BlockManager.aluminumOre);

		//OreDictionary.registerOre("oreIron", BlockManager.moonIronOre);

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
