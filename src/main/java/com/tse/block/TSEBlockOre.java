package com.tse.block;

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

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.item.ItemManager;



public class TSEBlockOre extends Block{
	
	private int meta;
	
	protected TSEBlockOre(String unlocalizedName, Material mat, int harvestLevel, String toolType, float hardness, float resistance, CreativeTabs tab, int meta) {
        super(mat);
        this.meta = meta;
        this.setHarvestLevel(toolType, harvestLevel);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(tab);
    }
	
	protected TSEBlockOre(String unlocalizedName, Material mat) {
	    this(unlocalizedName, mat, 1, "pickaxe", 10.0F, 15.0F, TSECreativeTabs.tabBlocks, 0);
	}
	
	@Override
	public int damageDropped(IBlockState blockstate)
	{
		return 0;//this.meta;
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	if(this == BlockManager.bloodDiamondOre)
    		return ItemManager.bloodDiamond;
    	else if(this == BlockManager.exaltedDiamondOre)
    		return ItemManager.exaltedDiamond;
    	else if(this == BlockManager.terraDiamondOre)
    		return ItemManager.terraDiamond;
    	else if(this == BlockManager.lunaDiamondOre)
    		return ItemManager.lunaDiamond;
    	else
    		return Item.getItemFromBlock(this);
    }
    
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this);
    }
	
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
    
}
