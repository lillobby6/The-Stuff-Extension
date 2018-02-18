package com.tse.world.block.render;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

import com.tse.common.core.TheStuffExtension;
import com.tse.library.StringsLib;
import com.tse.world.block.BlockManager;

public class BlockRenderRegister {
	public static void registerBlockRenderer()
	{
		TheStuffExtension.log("Rendering blocks...");
		reg(BlockManager.exaltedDiamondOre);
		reg(BlockManager.bloodDiamondOre);
		reg(BlockManager.terraDiamondOre);
		reg(BlockManager.copperOre);
		reg(BlockManager.mortiumOre);
		reg(BlockManager.tinOre);
		reg(BlockManager.toslotriumOre);
		reg(BlockManager.vividiumOre);
		reg(BlockManager.silverOre);
		reg(BlockManager.sphaleriteOre);
		reg(BlockManager.titaniumOre);
		reg(BlockManager.platinumOre);
		reg(BlockManager.galenaOre);
		reg(BlockManager.pentlanditeOre);
		reg(BlockManager.aluminumOre);
		
		reg(BlockManager.skyIronOre);

		reg(BlockManager.terriumOre);
		
		reg(BlockManager.moonSand);
		reg(BlockManager.moonStone);
		reg(BlockManager.moonTeleporter);

		reg(BlockManager.lunaDiamondOre);
		reg(BlockManager.moonIronOre);
		
		reg(BlockManager.storeBox);
		reg(BlockManager.superStoreBox);
		reg(BlockManager.mysteriousBox);
		reg(BlockManager.diamondStoreBox);
		
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
		reg(BlockManager.copperBlock);
		reg(BlockManager.sphaleriteBlock);
		reg(BlockManager.extranetiumBlock);
		reg(BlockManager.silverBlock);
		reg(BlockManager.platinumBlock);
		reg(BlockManager.titaniumBlock);
		reg(BlockManager.zincBlock);
		reg(BlockManager.brassBlock);
		reg(BlockManager.leadBlock);
		reg(BlockManager.nickelBlock);
		reg(BlockManager.pewterBlock);
		reg(BlockManager.aluminumBlock);
		reg(BlockManager.mnemiumBlock);
		reg(BlockManager.eterniumBlock);
		
		reg(BlockManager.whiteStone);
		reg(BlockManager.whiteCobblestone);
		
		reg(BlockManager.purpleheartLog);
		reg(BlockManager.purpleheartPlanks);
		
		reg(BlockManager.alloyFurnace);
		
		//reg(BlockManager.padaukLog);
		TheStuffExtension.log("Rendered blocks.");
	}
	
	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(StringsLib.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
