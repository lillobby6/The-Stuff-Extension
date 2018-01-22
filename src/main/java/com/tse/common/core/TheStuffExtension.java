package com.tse.common.core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tse.common.proxy.CommonProxy;
import com.tse.library.StringsLib;
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
	@SidedProxy(clientSide = "com.tse.common.proxy.ClientProxy", serverSide = "com.tse.common.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(StringsLib.MODID)
	public static TheStuffExtension instance = new TheStuffExtension();
	
	public static final DateFormat hms = new SimpleDateFormat("HH:mm:ss"); 
	public static Date date = new Date();
	

	public static void log(String message)
	{
		Console.print("[" + hms.format(date) + "] " + "[main/INFO] " + "[tse]: " + message + "\n");
	}
	
	public static void logError(String message, Exception exception)
	{
		Console.print("[" + hms.format(date) + "] " + "[main/ERROR] " + "[tse]: " + message + "\n" + exception + "\n");
	}
	
	public static void logWarn(String message)
	{
		Console.print("[" + hms.format(date) + "] " + "[main/WARN] " + "[tse]: " + message + "\n");
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
