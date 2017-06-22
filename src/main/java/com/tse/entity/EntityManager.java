package com.tse.entity;

import com.tse.main.core.TheStuffExtension;
import com.tse.main.lib.StringsLib;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityManager {
	
	public static void init()
	{
		registerEntities();
		spawnEntities();
	}
	public static void registerEntities()
	{
		int id = 1;
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "mortiumorewalker"), EntityMortiumOreWalker.class, "MortiumOreWalker", id++, TheStuffExtension.instance, 64, 1, true, 0x7C7C7C, 0x5E2D42);
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "toslotriumorewalker"), EntityToslotriumOreWalker.class, "ToslotriumOreWalker", id++, TheStuffExtension.instance, 64, 1, true, 0x7C7C7C, 0xFFFF02);
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "whitestonewalker"), EntityWhiteStoneWalker.class, "WhiteStoneWalker", id++, TheStuffExtension.instance, 64, 1, true, 0xE0E0E0, 0xC2C2C2);
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "stonewalker"), EntityStoneWalker.class, "StoneWalker", id++, TheStuffExtension.instance, 64, 1, true, 0x686868, 0x8F8F8F);
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "brightsteelblockwalker"), EntityBrightsteelBlockWalker.class, "BrightsteelBlockWalker", id++, TheStuffExtension.instance, 64, 1, true, 0x4B7775, 0x283F3E);

	}
	public static void spawnEntities()
	{
		
		EntityRegistry.addSpawn(EntityMortiumOreWalker.class,  100, 0, 2, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS);
		EntityRegistry.addSpawn(EntityMortiumOreWalker.class,  5, 0, 2, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS_EDGE);
		EntityRegistry.addSpawn(EntityMortiumOreWalker.class,  5, 0, 2, EnumCreatureType.CREATURE, Biomes.STONE_BEACH);

		EntityRegistry.addSpawn(EntityToslotriumOreWalker.class,  5, 0, 4, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS);
		EntityRegistry.addSpawn(EntityToslotriumOreWalker.class,  5, 0, 4, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS_EDGE);
		EntityRegistry.addSpawn(EntityToslotriumOreWalker.class,  5, 0, 4, EnumCreatureType.CREATURE, Biomes.STONE_BEACH);
	
		EntityRegistry.addSpawn(EntityWhiteStoneWalker.class,  5, 0, 3, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS);
		EntityRegistry.addSpawn(EntityWhiteStoneWalker.class,  5, 0, 3, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS_EDGE);
		EntityRegistry.addSpawn(EntityWhiteStoneWalker.class,  5, 0, 3, EnumCreatureType.CREATURE, Biomes.STONE_BEACH);
		
		EntityRegistry.addSpawn(EntityStoneWalker.class,  5, 0, 7, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS);
		EntityRegistry.addSpawn(EntityStoneWalker.class,  5, 0, 7, EnumCreatureType.CREATURE, Biomes.EXTREME_HILLS_EDGE);
		EntityRegistry.addSpawn(EntityStoneWalker.class,  5, 0, 7, EnumCreatureType.CREATURE, Biomes.STONE_BEACH);
		
		EntityRegistry.addSpawn(EntityBrightsteelBlockWalker.class,  1, 0, 5, EnumCreatureType.CREATURE, Biomes.MUSHROOM_ISLAND);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initmodels()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMortiumOreWalker.class, RenderMortiumOreWalker.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityToslotriumOreWalker.class, RenderToslotriumOreWalker.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityWhiteStoneWalker.class, RenderWhiteStoneWalker.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityStoneWalker.class, RenderStoneWalker.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityBrightsteelBlockWalker.class, RenderBrightsteelBlockWalker.FACTORY);

	}

}
