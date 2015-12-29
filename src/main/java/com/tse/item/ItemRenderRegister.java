package com.tse.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.tse.main.lib.StringsLib;

public class ItemRenderRegister {
	public static void registerItemRenderer()
	{
		reg(ItemManager.exaltedDiamond);
		reg(ItemManager.bloodDiamond);
		reg(ItemManager.terraDiamond);
		reg(ItemManager.lunaDiamond);
		reg(ItemManager.copperIngot);
		reg(ItemManager.copperAxe);
		reg(ItemManager.copperPickaxe);
		reg(ItemManager.copperShovel);
		reg(ItemManager.copperSword);
		reg(ItemManager.copperHoe);
		reg(ItemManager.lapisRemover);
		reg(ItemManager.steelIngot);
		reg(ItemManager.stoneMattock);
		reg(ItemManager.copperMattock);
		reg(ItemManager.copperHelmet);
		reg(ItemManager.copperChestplate);
		reg(ItemManager.copperLeggings);
		reg(ItemManager.copperBoots);
		reg(ItemManager.ironMattock);
		reg(ItemManager.woodMattock);
		reg(ItemManager.goldMattock);
		reg(ItemManager.diamondMattock);
		
	}
	public static void reg(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher() .register(item, 0, new ModelResourceLocation(StringsLib.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));	
	}
}
