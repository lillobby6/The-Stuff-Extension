package com.tse.common.world.block;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.gui.GUIManager;
import com.tse.common.gui.tileentity.TileEntityMysteriousBox;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockMysteriousBox extends BlockContainer {

	protected BlockMysteriousBox(String unlocalizedName) {
		super(Material.IRON);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setHardness(1.0F);
		this.setResistance(9999999999999999999.0F);
		this.setHarvestLevel("Remover", 1);
		this.setCreativeTab(TSECreativeTabs.tabStorage);
		BlockManager.registerBlock(this);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityMysteriousBox();
	}
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tileentity = worldIn.getTileEntity(pos);

        if (tileentity instanceof IInventory)
        {
            InventoryHelper.dropInventoryItems(worldIn, pos, (IInventory)tileentity);
        }

        super.breakBlock(worldIn, pos, state);
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }
	
	@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing sidw, float hitX, float hitY, float hitZ)
    {
		if (worldIn.isRemote) {
	        return true;
	    }
		playerIn.openGui(TheStuffExtension.instance, GUIManager.GUI_MYSTERIOUS_BOX, worldIn, pos.getX(), pos.getY(), pos.getZ());
		return true;
	}

}
