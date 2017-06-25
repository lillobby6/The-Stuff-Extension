package com.tse.main.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.tse.main.lib.StringsLib;
import com.tse.proxy.CommonProxy;
import com.tse.tileentity.TileEntityRegistry;

import jline.internal.Log;

@Mod(modid = StringsLib.MODID, version = StringsLib.VERSION)
public class TheStuffExtension
{
	@SidedProxy(clientSide = "com.tse.proxy.ClientProxy", serverSide = "com.tse.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(StringsLib.MODID)
	public static TheStuffExtension instance = new TheStuffExtension();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {   
    	Log.info("Welcome to The Stuff Extension, we hope you have a wonderful trip!");
    	Log.info("Starting PreINIT");
    	this.proxy.preInit(e);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    	Log.info("Starting INIT...");
    	TileEntityRegistry.init();
    	this.proxy.init(e);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	Log.info("Starting PostINIT...");
    	this.proxy.postInit(e);
    }
}
