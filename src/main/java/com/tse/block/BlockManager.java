package com.tse.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tse.item.ItemManager;

public class BlockManager {
	
	public static Block exaltedDiamondOre;
	public static Block bloodDiamondOre;
	public static Block terraDiamondOre;
	public static Block moonStone;
	public static Block moonSand;
	public static Block moonTeleporter;	
	public static Block copperBlock;
	public static Block copperOre;
	
	public static void createBlocks()
	{
		GameRegistry.registerBlock(exaltedDiamondOre = new TSEBlockOre("exalted_diamond_ore", Material.rock, ItemManager.exaltedDiamond), "exalted_diamond_ore");
		GameRegistry.registerBlock(bloodDiamondOre = new TSEBlockOre("blood_diamond_ore", Material.rock, ItemManager.bloodDiamond), "blood_diamond_ore");
		GameRegistry.registerBlock(terraDiamondOre = new TSEBlockOre("terra_diamond_ore", Material.rock, ItemManager.terraDiamond), "terra_diamond_ore");
		GameRegistry.registerBlock(moonStone = new TSEBlock("moon_stone"), "moon_stone");
		GameRegistry.registerBlock(moonSand = new TSEBlock("moon_sand"), "moon_sand");
		GameRegistry.registerBlock(moonTeleporter = new MoonTeleporter(Material.rock), "moon_teleporter");
		GameRegistry.registerBlock(copperBlock = new TSEBlock("copper_block"), "copper_block");
		GameRegistry.registerBlock(copperOre = new TSEBlock("copper_ore"), "copper_ore");
	}
	
}
