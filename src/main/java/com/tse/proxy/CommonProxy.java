package com.tse.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tse.block.BlockManager;
import com.tse.entity.EntityManager;
import com.tse.events.AchievementManager;
import com.tse.gui.GuiManager;
import com.tse.item.ItemManager;
import com.tse.main.core.TheStuffExtension;
import com.tse.main.core.WorldGen;
import com.tse.recipe.Crafting;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ItemManager.createItems();
    	BlockManager.createBlocks();
    	EntityManager.init();
    	//AchievementManager.createAchievements();
    	Crafting.initCrafting();
    }

    public void init(FMLInitializationEvent e) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(TheStuffExtension.instance, new GuiManager());
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}