package com.tse.world.block;

import java.awt.List;

import javax.annotation.Nullable;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.gui.GuiManager;
import com.tse.tileentity.DiamondSBTileEntity;
import com.tse.tileentity.SuperStoreBoxTileEntity;

public class DiamondStoreBox extends BlockContainer{

	protected DiamondStoreBox(String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(TSECreativeTabs.tabStorage);
	}
	
	public void func_77624_a(ItemStack itemStack, EntityPlayer player, List list, boolean p_77624_4_)
	{
	    list.add("Store much more of all your stuff and things.");
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new DiamondSBTileEntity();
	}
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof IInventory)
        {
            InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
            worldIn.updateComparatorOutputLevel(pos, this);
        }

        super.breakBlock(worldIn, pos, state);
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		if (stack.hasDisplayName()) {
			((DiamondSBTileEntity) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
		}
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
	
	@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing heldItem, float side, float hitX, float hitY)
    {
		if (!worldIn.isRemote) {
	        playerIn.openGui(TheStuffExtension.instance, GuiManager.DIAMOND_STORE_BOX_GUI, worldIn, pos.getX(), pos.getY(), pos.getZ());
	    }
	    return true;
	}

}
