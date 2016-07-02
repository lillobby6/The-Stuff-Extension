package com.tse.item;

import net.minecraft.client.Minecraft;
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
		reg(ItemManager.terraDiamondPickaxe);
		reg(ItemManager.terraDiamondAxe);
		reg(ItemManager.terraDiamondShovel);
		reg(ItemManager.terraDiamondHoe);
		reg(ItemManager.terraDiamondMattock);
		reg(ItemManager.terraDiamondSword);
		reg(ItemManager.terraDiamondHelmet);
		reg(ItemManager.terraDiamondChestplate);
		reg(ItemManager.terraDiamondLeggings);
		reg(ItemManager.terraDiamondBoots);
		reg(ItemManager.tinIngot);
		reg(ItemManager.tyionetiumIngot);
		reg(ItemManager.tyionetiumPickaxe);
		reg(ItemManager.tyionetiumAxe);
		reg(ItemManager.tyionetiumShovel);
		reg(ItemManager.tyionetiumHoe);
		reg(ItemManager.tyionetiumMattock);
		reg(ItemManager.tyionetiumSword);
		reg(ItemManager.bronzeIngot);
		reg(ItemManager.brightflameIngot);
		reg(ItemManager.brightsteelIngot);
		reg(ItemManager.diamondIngot);
		reg(ItemManager.reforgedGoldIngot);
		reg(ItemManager.magicIngot);
		reg(ItemManager.mithrilIngot);
		reg(ItemManager.mortiumIngot);
		reg(ItemManager.mysteriousIngot);
		reg(ItemManager.mysticIngot);
		reg(ItemManager.skyIronIngot);
		reg(ItemManager.terriumIngot);
		reg(ItemManager.toslotriumIngot);
		reg(ItemManager.vividiumIngot);
		reg(ItemManager.justice);
		reg(ItemManager.corruption);
		
	}
	public static void reg(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher() .register(item, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(StringsLib.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));	
	}
}
