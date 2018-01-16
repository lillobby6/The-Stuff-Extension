package com.tse.world.block;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TSEBlock extends Block{

	
	/**Add a block with a custom unlocalized name, material, hardness, resistance, creative tab, and sound.*/
	public TSEBlock(String unlocalizedName, Material material, float hardness, float resistance, CreativeTabs tab, SoundType sound	) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setSoundType(sound);
	}

	/**Add a block with a custom unlocalized name, material, hardness, resistance, and sound. The creative tab will default to TSEBlocks.*/
	public TSEBlock(String unlocalizedName, Material material, float hardness, float resistance, SoundType sound)
	{
		this(unlocalizedName, material, hardness, resistance, TSECreativeTabs.tabBlocks, sound);
	}
	
	/**Add a block with a custom unlocalized name, hardness, resistance, and sound. Material defaults to rock and the creative tab defaults to tabBlocks.*/
	public TSEBlock(String unlocalizedName, float hardness, float resistance, SoundType sound)
	{
		this(unlocalizedName, Material.ROCK, hardness, resistance, TSECreativeTabs.tabBlocks, sound);
	}
	
	/**Add a block with a custom unlocalized name, hardness, and resistance. Material defaults to rock, the creative tab defaults to tabBlocks, and the sound defaults to stone.*/
	public TSEBlock(String unlocalizedName, float hardness, float resistance)
	{
		this(unlocalizedName, Material.ROCK, hardness, resistance, TSECreativeTabs.tabBlocks, SoundType.STONE);
	}
	
	/**Add a block with a custom unlocalized name. Material defaults to rock, hardness defaults to 2.0F, resistance defaults to 1.0F, the creative tab defaults to tabBlocks, and the sound defaults to stone.*/
	public TSEBlock(String unlocalizedName)
	{
		this(unlocalizedName, Material.ROCK, 2.0f, 10.0f, TSECreativeTabs.tabBlocks, SoundType.STONE);
	}
}
