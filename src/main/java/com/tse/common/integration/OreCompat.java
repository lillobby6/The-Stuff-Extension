package com.tse.common.integration;

import com.tse.common.config.Config;
import com.tse.common.world.block.BlockManager;

import net.minecraftforge.oredict.OreDictionary;

public class OreCompat {
	
	public static void checkForOres()
	{
		
		if(OreDictionary.doesOreNameExist("oreCopper"))
			Config.spawnCopper = false;
		else
			Config.spawnCopper = true;
		if(OreDictionary.doesOreNameExist("oreTin"))
			Config.spawnTin = false;
		else
			Config.spawnTin = true;
		if(OreDictionary.doesOreNameExist("oreSilver"))
			Config.spawnSilver = false;
		else
			Config.spawnSilver = true;
		if(OreDictionary.doesOreNameExist("orePlatinum"))
			Config.spawnPlatinum = false;
		else
			Config.spawnPlatinum = true;
		if(OreDictionary.doesOreNameExist("oreTitanium"))
			Config.spawnTitanium = false;
		else
			Config.spawnTitanium = true;
		if(OreDictionary.doesOreNameExist("oreLead") || OreDictionary.doesOreNameExist("oreGalena"))
			Config.spawnGalena = false;
		else
			Config.spawnGalena = true;
		if(OreDictionary.doesOreNameExist("oreAluminum"))
			Config.spawnAluminum = false;
		else
			Config.spawnAluminum = true;
	}
}
