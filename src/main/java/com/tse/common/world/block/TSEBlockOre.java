package com.tse.common.world.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.tse.common.config.Config;
import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.ItemManager;

public class TSEBlockOre extends Block{

	private Item itemDropped;
	private int quantityDropped;
	private boolean random;
	private float lightlevel;
	
	protected TSEBlockOre(String unlocalizedName, Material mat, int harvestLevel, String toolType, float hardness, float resistance, CreativeTabs tab, Item itemDropped, int quantityDropped, boolean random, float lightlevel) {
        super(mat);
        this.itemDropped = itemDropped;
        this.setHarvestLevel(toolType, harvestLevel);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(tab);
        this.quantityDropped = quantityDropped;
        this.random = random;
        this.setLightLevel(lightlevel);
        BlockManager.registerBlock(this);
    }
	
	
	protected TSEBlockOre(String unlocalizedName, Material mat, int harvestLevel, String toolType, float hardness, float resistance, CreativeTabs tab, Item itemDropped, int quantityDropped, boolean random) {
        super(mat);
        this.itemDropped = itemDropped;
        this.setHarvestLevel(toolType, harvestLevel);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(tab);
        this.quantityDropped = quantityDropped;
        this.random = random;
        BlockManager.registerBlock(this);
    }
	
	protected TSEBlockOre(String unlocalizedName, Material mat, int harvestLevel, String toolType, float hardness, float resistance, CreativeTabs tab, Item itemDropped, int quantityDropped) {
        super(mat);
        this.itemDropped = itemDropped;
        this.setHarvestLevel(toolType, harvestLevel);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(tab);
        this.quantityDropped = quantityDropped;
        BlockManager.registerBlock(this);
    }
	
	protected TSEBlockOre(String unlocalizedName, Material mat, int harvestLevel, String toolType, float hardness, float resistance, CreativeTabs tab, Item itemDropped) {
        super(mat);
        this.itemDropped = itemDropped;
        this.setHarvestLevel(toolType, harvestLevel);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(tab);
        this.quantityDropped = 1;
        BlockManager.registerBlock(this);
    }
	
	protected TSEBlockOre(String unlocalizedName, Material mat, int harvestLevel, String toolType, float hardness, float resistance, CreativeTabs tab) {
        super(mat);
        this.setHarvestLevel(toolType, harvestLevel);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setCreativeTab(tab);
        this.quantityDropped = 1;
        BlockManager.registerBlock(this);
        
    }
	
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		if(itemDropped != null)
		{
			return itemDropped;
		}
		else return super.getItemDropped(state, rand, fortune);
    }
	
	public int quantityDropped(Random random)
    {
		if(this.random)
			return random.nextInt(quantityDropped)+1;
		else
			return quantityDropped;
    }
    
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }
    
    
}
