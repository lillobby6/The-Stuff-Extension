package com.tse.entity;

import com.tse.main.core.TheStuffExtension;
import com.tse.main.lib.StringsLib;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityManager {
	
	//public static ResourceLocation mortiumOreWalker = new ResourceLocation("tse:textures/entity/mortium_ore_walker.png");

	
	public static void init()
	{
		registerEntities();
	}
	public static void registerEntities()
	{
		int id = 1;
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "mortium_ore_walker"), EntityMortiumOreWalker.class, "MortiumOreWalker", id++, TheStuffExtension.instance, 64, 1, true, 0xB3B3B3, 0x000000);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initmodels()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMortiumOreWalker.class, RenderMortiumOreWalker.FACTORY);
	}

}
