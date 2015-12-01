package com.tse.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.tse.block.BlockManager;
import com.tse.item.ItemManager;
import com.tse.recipe.Crafting;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ItemManager.createItems();
    	BlockManager.createBlocks();
    	Crafting.initCrafting();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}