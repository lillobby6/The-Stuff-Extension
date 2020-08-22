package com.tse.common.world.block;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.tse.common.config.Config;
import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.ItemManager;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TSEBlock extends Block{

	
	/**Add a block with a custom unlocalized name, material, hardness, resistance, creative tab, and sound.*/
	public TSEBlock(String unlocalizedName, Material material, float hardness, float resistance, CreativeTabs tab, SoundType sound	) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(tab);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setSoundType(sound);
		BlockManager.registerBlock(this);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	if(this == BlockManager.whiteStone)
    		return Item.getItemFromBlock(BlockManager.whiteCobblestone);
    	else
    		return Item.getItemFromBlock(this);
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
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced)
    {
		if(this==BlockManager.eterniumBlock || this==BlockManager.immortaliumBlock)
			tooltip.add("Clearly, you have a problem.");
    }
	
	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
    {
        return this == BlockManager.bloodDiamondBlock || this == BlockManager.exaltedDiamondBlock || this == BlockManager.terraDiamondBlock || this == BlockManager.aluminumBlock || this == BlockManager.brassBlock || this == BlockManager.brightflameBlock || this == BlockManager.brightsteelBlock || this == BlockManager.bronzeBlock || this == BlockManager.copperBlock || this == BlockManager.electrumBlock || this == BlockManager.eterniumBlock || this == BlockManager.extranetiumBlock || this == BlockManager.fantasiumBlock || this == BlockManager.immortaliumBlock || this == BlockManager.laeniumBlock || this == BlockManager.leadBlock || this == BlockManager.maduumBlock || this == BlockManager.magicBlock || this == BlockManager.magneiumBlock || this == BlockManager.meteoricIronBlock || this == BlockManager.mithrilBlock || this == BlockManager.mnemiumBlock || this == BlockManager.mortiumBlock || this == BlockManager.mysteriousBlock || this == BlockManager.mysticBlock || this == BlockManager.nickelBlock || this == BlockManager.pewterBlock || this == BlockManager.platinumBlock || this == BlockManager.reforgedGoldBlock || this == BlockManager.roseGoldBlock || this == BlockManager.scorniumBlock || this == BlockManager.silverBlock || this == BlockManager.skyIronBlock || this == BlockManager.spangoldBlock || this == BlockManager.steelBlock || this == BlockManager.sterlingSilverBlock || this == BlockManager.terriumBlock || this == BlockManager.tinBlock || this == BlockManager.titaniumBlock || this == BlockManager.tyionetiumBlock || this == BlockManager.vividiumBlock || this == BlockManager.whiteGoldBlock || this == BlockManager.zincBlock;
    }
}
