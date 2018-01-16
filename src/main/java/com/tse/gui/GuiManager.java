package com.tse.gui;

import com.tse.container.ContainerAlloyFurnace;
import com.tse.container.DiamondSBContainer;
import com.tse.container.MysteriousContainer;
import com.tse.container.StoreBoxContainer;
import com.tse.container.SuperStoreBoxContainer;
import com.tse.tileentity.DiamondSBTileEntity;
import com.tse.tileentity.MysteriousTileEntity;
import com.tse.tileentity.StoreBoxTileEntity;
import com.tse.tileentity.SuperStoreBoxTileEntity;
import com.tse.tileentity.TileEntityAlloyFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiManager implements IGuiHandler{
	
	public static final int STORE_BOX_GUI = 17;
	public static final int SUPER_STORE_BOX_GUI = 18;
	public static final int VOID_STORE_BOX_GUI = 19;
	public static final int MYSTERIOUS_BOX_GUI = 20;
	public static final int DIAMOND_STORE_BOX_GUI = 21;
	public static final int ALLOY_FURNACE_GUI = 30;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		BlockPos xyz = new BlockPos(x, y, z);
		TileEntity tileEntity = world.getTileEntity(xyz);
		if (ID == STORE_BOX_GUI)
		{
	        return new StoreBoxContainer(player.inventory, (StoreBoxTileEntity) tileEntity);
		}
		else if(ID == SUPER_STORE_BOX_GUI)
		{
			return new SuperStoreBoxContainer(player.inventory, (SuperStoreBoxTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == MYSTERIOUS_BOX_GUI)
		{
			return new MysteriousContainer(player.inventory, (MysteriousTileEntity) tileEntity);
		}
		else if(ID == DIAMOND_STORE_BOX_GUI)
		{
			return new DiamondSBContainer(player.inventory, (DiamondSBTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == ALLOY_FURNACE_GUI)
		{
			return new ContainerAlloyFurnace(player, player.inventory, (TileEntityAlloyFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == STORE_BOX_GUI)
		{
			 return new StoreBoxGui(player.inventory,  (StoreBoxTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == SUPER_STORE_BOX_GUI)
		{
			 return new SuperStoreBoxGui(player.inventory,  (SuperStoreBoxTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == MYSTERIOUS_BOX_GUI)
		{
			return new MysteriousGui(player.inventory, (MysteriousTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == DIAMOND_STORE_BOX_GUI)
		{
			return new DiamondSBGui(player.inventory, (DiamondSBTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == ALLOY_FURNACE_GUI)
		{
			return new AlloyFurnaceGui(player, player.inventory, (TileEntityAlloyFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
