package com.tse.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
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
		//reg(BlockManager.storeBox);
		//reg(BlockManager.superStoreBox);
		//reg(BlockManager.mysteriousBox);
		reg(BlockManager.steelBlock);
		reg(BlockManager.exaltedDiamondBlock);
		reg(BlockManager.terraDiamondBlock);
		reg(BlockManager.bronzeBlock);
		reg(BlockManager.tyionetiumBlock);
		reg(BlockManager.brightsteelBlock);
		reg(BlockManager.reforgedGoldBlock);
		reg(BlockManager.tinBlock);
		reg(BlockManager.mithrilBlock);
		reg(BlockManager.brightflameBlock);
		reg(BlockManager.mysteriousBlock);
		reg(BlockManager.mysticBlock);
		reg(BlockManager.skyIronBlock);
		reg(BlockManager.terriumBlock);
		reg(BlockManager.bloodDiamondBlock);	
		reg(BlockManager.vividiumBlock);
		reg(BlockManager.mortiumBlock);
		reg(BlockManager.toslotriumBlock);
		reg(BlockManager.magicBlock);
		reg(BlockManager.whiteStone);
		reg(BlockManager.whiteCobblestone);
	}
	
	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(StringsLib.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
