package com.tse.proxy;

import com.tse.block.BlockManager;
import com.tse.item.ItemManager;
import com.tse.main.core.WorldGen;
import com.tse.recipe.Crafting;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ItemManager.createItems();
    	BlockManager.createBlocks();
    	//AchievementManager.createAchievements();
    	Crafting.initCrafting();
    }

    public void init(FMLInitializationEvent e) {
    	//NetworkRegistry.INSTANCE.registerGuiHandler(TheStuffExtension.instance, new GuiManager());
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}