package com.tse.block;

import com.tse.creativetabs.TSECreativeTabs;
import com.tse.gui.GuiManager;
import com.tse.main.core.TheStuffExtension;
import com.tse.tileentity.MysteriousTileEntity;
import com.tse.tileentity.SuperStoreBoxTileEntity;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class MysteriousBox extends BlockContainer {

	protected MysteriousBox(String unlocalizedName) {
		super(Material.iron);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(1.0F);
		this.setResistance(9999999999999999999.0F);
		this.setHarvestLevel("Remover", 1);
		this.setCreativeTab(TSECreativeTabs.tabStorage);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new MysteriousTileEntity();
	}
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockstate) {
		MysteriousTileEntity te = (MysteriousTileEntity) world.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(world, pos, te);
		super.breakBlock(world, pos, blockstate);
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		if (stack.hasDisplayName()) {
			((MysteriousTileEntity) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
		}
	}

	@Override
	public int getRenderType() {
		return 3;
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
	    if (!world.isRemote) {
	        player.openGui(TheStuffExtension.instance, GuiManager.MYSTERIOUS_BOX_GUI, world, pos.getX(), pos.getY(), pos.getZ());
	    }
	    return true;
	}

}
