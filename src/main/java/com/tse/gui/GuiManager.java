package com.tse.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import com.tse.container.StoreBoxContainer;
import com.tse.tileentity.StoreBoxTileEntity;

public class GuiManager implements IGuiHandler{
	
	public static final int STORE_BOX_GUI = 0;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == STORE_BOX_GUI)
	        return new StoreBoxContainer(player.inventory, (StoreBoxTileEntity) world.getTileEntity(new BlockPos(x, y, z)));

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == STORE_BOX_GUI)
		 return new StoreBoxGui(player.inventory,  (StoreBoxTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		return null;
	}

}
