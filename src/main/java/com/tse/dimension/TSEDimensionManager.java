package com.tse.dimension;

import net.minecraft.world.DimensionType;

public class TSEDimensionManager {
	public TSEDimensionManager()
	{
		registerDimensions();
	}
	
	public static DimensionType mysticWorld;
	public static int dim = 18;
	public static boolean keepLoaded = false;
	
	public static void registerDimensions()
	{
		mysticWorld = DimensionType.register("The Mystic", "tse", dim, WorldProviderMystic.class, keepLoaded);
	}
}
