package com.tse.main.core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tse.main.lib.StringsLib;
import com.tse.proxy.CommonProxy;
import com.tse.tileentity.TileEntityRegistry;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.Console;

@Mod(modid = StringsLib.MODID, version = StringsLib.VERSION)
public class TheStuffExtension
{
	@SidedProxy(clientSide = "com.tse.proxy.ClientProxy", serverSide = "com.tse.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(StringsLib.MODID)
	public static TheStuffExtension instance = new TheStuffExtension();
	
	public static final DateFormat hms = new SimpleDateFormat("HH:mm:ss"); 
	public static Date date = new Date();
	
	public static void log(String message)
	{
		Console.print("[" + hms.format(date) + "] " + "[main/INFO] " + "[TSE]: " + message + "\n");
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {   
    	log("Welcome to The Stuff Extension, we hope you have a wonderful trip!");
    	//log("Starting PreINIT");
    	this.proxy.preInit(e);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    	//log("Starting INIT...");
    	TileEntityRegistry.init();
    	this.proxy.init(e);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	//log("Starting PostINIT...");
    	this.proxy.postInit(e);
    }
}
