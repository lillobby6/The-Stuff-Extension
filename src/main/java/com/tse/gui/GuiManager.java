package com.tse.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import com.tse.container.DiamondSBContainer;
import com.tse.container.MysteriousContainer;
import com.tse.container.StoreBoxContainer;
import com.tse.container.SuperStoreBoxContainer;
import com.tse.tileentity.DiamondSBTileEntity;
import com.tse.tileentity.MysteriousTileEntity;
import com.tse.tileentity.StoreBoxTileEntity;
import com.tse.tileentity.SuperStoreBoxTileEntity;

public class GuiManager implements IGuiHandler{
	
	public static final int STORE_BOX_GUI = 0;
	public static final int SUPER_STORE_BOX_GUI = 1;
	public static final int VOID_STORE_BOX_GUI = 2;
	public static final int MYSTERIOUS_BOX_GUI = 3;
	public static final int DIAMOND_STORE_BOX_GUI = 4;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == STORE_BOX_GUI)
		{
	        return new StoreBoxContainer(player.inventory, (StoreBoxTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == SUPER_STORE_BOX_GUI)
		{
			return new SuperStoreBoxContainer(player.inventory, (SuperStoreBoxTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == MYSTERIOUS_BOX_GUI)
		{
			return new MysteriousContainer(player.inventory, (MysteriousTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == DIAMOND_STORE_BOX_GUI)
		{
			return new DiamondSBContainer(player.inventory, (DiamondSBTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
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
		return null;
	}

}
