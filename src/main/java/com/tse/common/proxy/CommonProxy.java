package com.tse.common.proxy;

import java.io.File;

import com.tse.common.config.Config;
import com.tse.common.core.TheStuffExtension;
import com.tse.common.gui.GUIManager;
import com.tse.common.integration.oredictionary.OreDictionaryManager;
import com.tse.common.world.gen.WorldGen;
import com.tse.common.world.item.recipe.AlloyFurnaceRecipes;
import com.tse.common.world.item.recipe.Smelting;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
    	TheStuffExtension.log("Starting preInit...");
    	File directory = e.getModConfigurationDirectory();
    	config = new Configuration(new File(directory.getPath(), "thestuffextension.cfg"));
    	Config.readConfig();
    	
    	TheStuffExtension.log("Finished preInit.");
    }

    public void init(FMLInitializationEvent e) {
    	TheStuffExtension.log("Starting init...");
    	OreDictionaryManager.registerOres();
    	Smelting.smelting();
    	AlloyFurnaceRecipes.instance();
    	NetworkRegistry.INSTANCE.registerGuiHandler(TheStuffExtension.instance, new GUIManager());
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
       
        TheStuffExtension.log("Finished Init.");
    }

    public void postInit(FMLPostInitializationEvent e) {
    	TheStuffExtension.log("Starting postInit");
    	if (config.hasChanged())
    	{
    		config.save();
    	}
    	TheStuffExtension.log("Finished postInit.");
    }
    
    public void registerFluidBlockRendering(Block block, String name) {
		
	}
}