package com.tse.common.integration;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.integration.tconstruct.TConstructHelper;
import com.tse.common.integration.tconstruct.conarm.ConArmHelper;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public abstract class CompatModule
{
	public static HashMap<String, Class<? extends CompatModule>> moduleClasses = new HashMap<String, Class<? extends CompatModule>>();
	public static Set<CompatModule> modules = new HashSet<CompatModule>();

	static
	{
		moduleClasses.put("tconstruct", TConstructHelper.class);
		moduleClasses.put("conarm", ConArmHelper.class);
	}

	public static void doModulesPreInit()
	{
		for(Entry<String, Class<? extends CompatModule>> e : moduleClasses.entrySet())
			if(Loader.isModLoaded(e.getKey()))
				try
				{
					CompatModule m = e.getValue().newInstance();
					modules.add(m);
					m.preInit();
				} catch(Exception exception)
				{
					TheStuffExtension.logError("Compat module for "+e.getKey()+" could not be preInitialized. Report this and include the error message below!", exception);
				}
	}

	public static void doModulesRecipes()
	{
		for(CompatModule compat : CompatModule.modules)
			try
			{
				compat.registerRecipes();
			} catch(Exception exception)
			{
				TheStuffExtension.logError("Compat module for "+compat+" could not register recipes. Report this and include the error message below!", exception);
			}
	}

	public static void doModulesInit()
	{
		for(CompatModule compat : CompatModule.modules)
			try
			{
				compat.init();
			} catch(Exception exception)
			{
				TheStuffExtension.logError("Compat module for "+compat+" could not be initialized. Report this and include the error message below!", exception);
			}
	}

	public static void doModulesPostInit()
	{
		for(CompatModule compat : CompatModule.modules)
			try
			{
				compat.postInit();
			} catch(Exception exception)
			{
				TheStuffExtension.logError("Compat module for "+compat+" could not be postInitialized. Report this and include the error message below!", exception);
			}
	}

	//We don't want this to happen multiple times after all >_>
	public static boolean serverStartingDone = false;

	public static void doModulesLoadComplete()
	{
		if(!serverStartingDone)
		{
			serverStartingDone = true;
			for(CompatModule compat : CompatModule.modules)
				try
				{
					compat.loadComplete();
				} catch(Exception exception)
				{
					TheStuffExtension.logError("Compat module for "+compat+" could not be initialized. Report this and include the error message below!", exception);
				}
		}
	}

	public abstract void preInit();

	public abstract void registerRecipes();

	public abstract void init();

	public abstract void postInit();

	public void loadComplete()
	{
	}

	@SideOnly(Side.CLIENT)
	public void clientPreInit()
	{
	}

	@SideOnly(Side.CLIENT)
	public void clientInit()
	{
	}

	@SideOnly(Side.CLIENT)
	public void clientPostInit()
	{
	}
}