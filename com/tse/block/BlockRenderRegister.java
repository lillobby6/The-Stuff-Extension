package com.tse.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.tse.main.lib.StringsLib;

public class BlockRenderRegister {
	public static void registerBlockRenderer()
	{
		reg(BlockManager.exaltedDiamondOre);
		reg(BlockManager.bloodDiamondOre);
		reg(BlockManager.terraDiamondOre);
		reg(BlockManager.moonSand);
		reg(BlockManager.moonStone);
		reg(BlockManager.moonTeleporter);
		reg(BlockManager.copperBlock);
		reg(BlockManager.copperOre);
	}
	
	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(StringsLib.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
