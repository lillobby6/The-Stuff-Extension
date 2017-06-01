package com.tse.entity;

import com.tse.main.core.TheStuffExtension;
import com.tse.main.lib.StringsLib;

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
		int id = 1;
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "mortiumorewalker"), EntityMortiumOreWalker.class, "MortiumOreWalker", id++, TheStuffExtension.instance, 64, 1, true, 0x7C7C7C, 0x5E2D42);
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "toslotriumorewalker"), EntityToslotriumOreWalker.class, "ToslotriumOreWalker", id++, TheStuffExtension.instance, 64, 1, true, 0x7C7C7C, 0xFFFF02);
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "whitestonewalker"), EntityWhiteStoneWalker.class, "WhiteStoneWalker", id++, TheStuffExtension.instance, 64, 1, true, 0xE0E0E0, 0xC2C2C2);
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "stonewalker"), EntityStoneWalker.class, "StoneWalker", id++, TheStuffExtension.instance, 64, 1, true, 0x686868, 0x8F8F8F);
		EntityRegistry.registerModEntity(new ResourceLocation(StringsLib.MODID, "brightsteelblockwalker"), EntityBrightsteelBlockWalker.class, "BrightsteelBlockWalker", id++, TheStuffExtension.instance, 64, 1, true, 0x4B7775, 0x283F3E);

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
