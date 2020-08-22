package com.tse.common.world.entity;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.core.library.StringsLib;
import com.tse.common.world.item.entity.TSEItemEntityFireproof;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityManager {
	
	public static void init()
	{
		registerEntities();
	}
	public static void registerEntities()
	{
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "item_fireproof"), TSEItemEntityFireproof.class, "item_fireproof", 0, TheStuffExtension.instance, 32, 5, true);
	}
}
