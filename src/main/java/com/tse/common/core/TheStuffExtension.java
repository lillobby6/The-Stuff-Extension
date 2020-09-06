package com.tse.common.core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import com.tse.common.core.library.StringsLib;
import com.tse.common.gui.tileentity.TileEntityRegistry;
import com.tse.common.integration.CompatModule;
import com.tse.common.proxy.CommonProxy;
import com.tse.common.world.dimension.WorldProviderMystic;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import scala.Console;

@Mod(modid = StringsLib.MODID, version = StringsLib.VERSION, updateJSON = "https://raw.githubusercontent.com/lillobby6/The-Stuff-Extension/master/update.json")
public class TheStuffExtension
{
	public static int dimensionID = 32;
	public static DimensionType dimType = DimensionType.register("mystic", "_mystic", 32, WorldProviderMystic.class, false);

	@SidedProxy(clientSide = "com.tse.client.proxy.ClientProxy", serverSide = "com.tse.common.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(StringsLib.MODID)
	public static TheStuffExtension instance = new TheStuffExtension();
	
	public static final DateFormat hms = new SimpleDateFormat("HH:mm:ss"); 
	public static Date date = new Date();
	
	public static Logger logger = Logger.getGlobal();
	

	public static void log(String message)
	{
		Console.print("[" + hms.format(date) + "] " + "[main/INFO] " + "[tse]: " + message + "\n");
	}
	
	public static void logError(String message, Exception exception)
	{
		Console.print("[" + hms.format(date) + "] " + "[main/ERROR] " + "[tse]: " + message + "\n");
		exception.printStackTrace();
	}
	public static void logError(String message)
	{
		Console.print("[" + hms.format(date) + "] " + "[main/ERROR] " + "[tse]: " + message + "\n");
	}
	
	public static void logWarn(String message)
	{
		Console.print("[" + hms.format(date) + "] " + "[main/WARN] " + "[tse]: " + message + "\n");
	}
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {   
    	log("Welcome to The Stuff Extension, we hope you have a wonderful trip!");
    	this.proxy.preInit(e);
    	CompatModule.doModulesPreInit();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    	TileEntityRegistry.init();
    	this.proxy.init(e);
    	CompatModule.doModulesInit();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	//registerDimension();
    	this.proxy.postInit(e);
    	CompatModule.doModulesPostInit();
    }
    
    
    public void registerDimension()
    {
    	if(DimensionManager.isDimensionRegistered(dimensionID))
    	{
    		dimensionID = 34;
    	}
    	DimensionManager.registerDimension(dimensionID, dimType);
    }
}
