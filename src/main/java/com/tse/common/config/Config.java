package com.tse.common.config;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

public class Config {
	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_OREGEN = "ore_gen";
	private static final String CATEGORY_OREFREQ = "ore_freq";
	private static final String CATEGORY_RECIPES = "recipes";
	
	public static boolean useOreDictionaryForTools = false;

	public static boolean spawnExaltedDiamond = true;
	public static boolean spawnBloodDiamond = true;
	public static boolean spawnTerraDiamond = true;
	public static boolean spawnCopper = true;
	public static boolean spawnMortium = true;
	public static boolean spawnTin = true;
	public static boolean spawnToslotrium = true;
	public static boolean spawnVividium = true;
	public static boolean spawnSphalerite = true;
	public static boolean spawnSilver = true;
	public static boolean spawnPlatinum = true;
	public static boolean spawnTitanium = true;
	public static boolean spawnGalena = true;
	public static boolean spawnPentlandite = true;
	public static boolean spawnSkyIron = true;
	public static boolean spawnTerrium = true;
	public static boolean spawnAluminum = true;
	public static boolean spawnWhiteStone = true;
	public static boolean spawnMeteors = true;

	public static int freqWhiteStone = 80;
	public static int freqTitanium = 7;
	public static int freqPlatinum = 8;
	public static int freqGalena = 10;
	public static int freqSilver = 15;
	public static int freqPentlandite = 22;
	public static int freqAluminum = 22;
	public static int freqToslotrium = 30;
	public static int freqSphalerite = 20;
	public static int freqExaltedDiamond = 3;
	public static int freqBloodDiamond = 3;
	public static int freqTerraDiamond = 3;
	public static int freqSkyIron = 15;
	public static int freqCopper = 20;
	public static int freqTin = 20;
	public static int freqMortium = 2;
	public static int freqVividium = 2;
	public static int freqTerrium = 1;
	public static int freqMeteors = 1;

	public static boolean easyZinc = false;

	public static void readConfig() {
		TheStuffExtension.log("Creating config...");
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
			initOreGenConfig(cfg);
			initOreFreqConfig(cfg);
			initRecipeConfig(cfg);
		} catch (Exception e) {
			TheStuffExtension.logError("Error with loading config!", e);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
		TheStuffExtension.log("Created config.");
	}

	private static void initGeneralConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration: ");
			}

	private static void initOreGenConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_OREGEN, "Ore generation configuration: ");
		spawnExaltedDiamond = cfg.getBoolean("spawnExaltedDiamond", CATEGORY_OREGEN, spawnExaltedDiamond,
				"On false will no longer spawn exalted diamond in the world.");
		spawnBloodDiamond = cfg.getBoolean("spawnBloodDiamond", CATEGORY_OREGEN, spawnBloodDiamond,
				"On false will no longer spawn blood diamond in the world.");
		spawnTerraDiamond = cfg.getBoolean("spawnTerraDiamond", CATEGORY_OREGEN, spawnTerraDiamond,
				"On false will no longer spawn terra diamond in the world.");
		spawnCopper = cfg.getBoolean("spawnCopper", CATEGORY_OREGEN, spawnCopper,
				"On false will no longer spawn copper in the world.");
		spawnMortium = cfg.getBoolean("spawnMortium", CATEGORY_OREGEN, spawnMortium,
				"On false will no longer spawn mortium in the world.");
		spawnTin = cfg.getBoolean("spawnTin", CATEGORY_OREGEN, spawnTin,
				"On false will no longer spawn mortium in the world.");
		spawnToslotrium = cfg.getBoolean("spawnToslotrium", CATEGORY_OREGEN, spawnToslotrium,
				"On false will no longer spawn toslotrium in the world.");
		spawnVividium = cfg.getBoolean("spawnVividium", CATEGORY_OREGEN, spawnVividium,
				"On false will no longer spawn vividium in the world.");
		spawnSphalerite = cfg.getBoolean("spawnSphalerite", CATEGORY_OREGEN, spawnSphalerite,
				"On false will no longer spawn sphalerite in the world.");
		spawnSilver = cfg.getBoolean("spawnSilver", CATEGORY_OREGEN, spawnSilver,
				"On false will no longer spawn silver in the world.");
		spawnPlatinum = cfg.getBoolean("spawnPlatinum", CATEGORY_OREGEN, spawnPlatinum,
				"On false will no longer spawn platinum in the world.");
		spawnTitanium = cfg.getBoolean("spawnTitanium", CATEGORY_OREGEN, spawnTitanium,
				"On false will no longer spawn titanium in the world.");
		spawnGalena = cfg.getBoolean("spawnGalena", CATEGORY_OREGEN, spawnGalena,
				"On false will no longer spawn galena in the world.");
		spawnPentlandite = cfg.getBoolean("spawnPentlandite", CATEGORY_OREGEN, spawnPentlandite,
				"On false will no longer spawn pentlandite in the world.");
		spawnSkyIron = cfg.getBoolean("spawnSkyIron", CATEGORY_OREGEN, spawnSkyIron,
				"On false will no longer spawn sky iron in the world.");
		spawnTerrium = cfg.getBoolean("spawnTerrium", CATEGORY_OREGEN, spawnTerrium,
				"On false will no longer spawn terrium in the world.");
		spawnAluminum = cfg.getBoolean("spawnAluminum", CATEGORY_OREGEN, spawnAluminum,
				"On false will no longer spawn aluminum in the world.");
		spawnWhiteStone = cfg.getBoolean("spawnWhiteStone", CATEGORY_OREGEN, spawnWhiteStone,
				"On false will no longer spawn white stone in the world.");
		spawnMeteors = cfg.getBoolean("spawnMeteors", CATEGORY_OREGEN, spawnMeteors, "On false will no longer spawn meteors (effectively a type of ore) in the world.");
	}

	private static void initOreFreqConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_OREFREQ, "Ore spawn frequency configuration: ");
		freqWhiteStone = cfg.getInt("freqWhiteStone", CATEGORY_OREFREQ, freqWhiteStone, 0, 300,
				"How many veins of white stone will be in each chunk.");
		freqTitanium = cfg.getInt("freqTitanium", CATEGORY_OREFREQ, freqTitanium, 0, 200,
				"How many veins of titanium will be in each chunk.");
		freqPlatinum = cfg.getInt("freqPlatinum", CATEGORY_OREFREQ, freqPlatinum, 0, 200,
				"How many veins of platinum will be in each chunk.");
		freqPlatinum = cfg.getInt("freqPlatinum", CATEGORY_OREFREQ, freqPlatinum, 0, 200,
				"How many veins of platinum will be in each chunk.");
		freqGalena = cfg.getInt("freqPlatinum", CATEGORY_OREFREQ, freqGalena, 0, 200,
				"How many veins of galena will be in each chunk.");
		freqSilver = cfg.getInt("freqSilver", CATEGORY_OREFREQ, freqSilver, 0, 200,
				"How many veins of silver will be in each chunk.");
		freqPentlandite = cfg.getInt("freqPentlandite", CATEGORY_OREFREQ, freqPentlandite, 0, 200,
				"How many veins of pentlandite will be in each chunk.");
		freqAluminum = cfg.getInt("freqAluminum", CATEGORY_OREFREQ, freqAluminum, 0, 200,
				"How many veins of aluminum will be in each chunk.");
		freqToslotrium = cfg.getInt("freqToslotrium", CATEGORY_OREFREQ, freqToslotrium, 0, 200,
				"How many veins of toslotrium will be in each chunk.");
		freqSphalerite = cfg.getInt("freqSphalerite", CATEGORY_OREFREQ, freqSphalerite, 0, 200,
				"How many veins of sphalerite will be in each chunk.");
		freqExaltedDiamond = cfg.getInt("freqExaltedDiamond", CATEGORY_OREFREQ, freqExaltedDiamond, 0, 200,
				"How many veins of exalted diamond will be in each chunk.");
		freqBloodDiamond = cfg.getInt("freqBloodDiamond", CATEGORY_OREFREQ, freqBloodDiamond, 0, 200,
				"How many veins of blood diamond will be in each chunk.");
		freqTerraDiamond = cfg.getInt("freqTerraDiamond", CATEGORY_OREFREQ, freqTerraDiamond, 0, 200,
				"How many veins of terra diamond will be in each chunk.");
		freqSkyIron = cfg.getInt("freqSkyIron", CATEGORY_OREFREQ, freqSkyIron, 0, 200,
				"How many veins of sky iron will be in each chunk.");
		freqCopper = cfg.getInt("freqCopper", CATEGORY_OREFREQ, freqCopper, 0, 200,
				"How many veins of copper will be in each chunk.");
		freqTin = cfg.getInt("freqTin", CATEGORY_OREFREQ, freqTin, 0, 200,
				"How many veins of tin will be in each chunk.");
		freqMortium = cfg.getInt("freqMortium", CATEGORY_OREFREQ, freqMortium, 0, 200,
				"How many veins of mortium will be in each chunk.");
		freqVividium = cfg.getInt("freqVividium", CATEGORY_OREFREQ, freqVividium, 0, 200,
				"How many veins of vividium will be in each chunk.");
		freqTerrium = cfg.getInt("freqTerrium", CATEGORY_OREFREQ, freqTerrium, 0, 200,
				"How many veins of terrium will be in each chunk.");
		freqMeteors = cfg.getInt("freqMeteors", CATEGORY_OREFREQ, freqMeteors, 0, 200, "How many meteors will be in each chunk");
	}

	private static void initRecipeConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_RECIPES, "Recipe configuration: ");
		easyZinc = cfg.getBoolean("easyZinc", CATEGORY_RECIPES, easyZinc,
				"On true, zinc will come directly from smelting sphalerite. Sphalerite blocks will now drop themselves.");
		useOreDictionaryForTools = cfg.getBoolean("useOreDictionaryForTools", CATEGORY_RECIPES, useOreDictionaryForTools, "On true all recipes will use the oredictionary, this is useful when a mod defaults all types of materials to one mods version. WARNING this can some items to be impossible to make.");

	}
}