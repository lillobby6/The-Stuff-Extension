package com.tse.common.gui;

import com.tse.common.gui.container.ContainerAlloyFurnace;
import com.tse.common.gui.container.ContainerCopperAlloyFurnace;
import com.tse.common.gui.container.ContainerCopperFurnace;
import com.tse.common.gui.container.ContainerDiamondStoreBox;
import com.tse.common.gui.container.ContainerMysteriousBox;
import com.tse.common.gui.container.ContainerStoreBox;
import com.tse.common.gui.container.ContainerSuperStoreBox;
import com.tse.common.gui.tileentity.TileEntityAlloyFurnace;
import com.tse.common.gui.tileentity.TileEntityCopperAlloyFurnace;
import com.tse.common.gui.tileentity.TileEntityCopperFurnace;
import com.tse.common.gui.tileentity.TileEntityDiamondStoreBox;
import com.tse.common.gui.tileentity.TileEntityMysteriousBox;
import com.tse.common.gui.tileentity.TileEntityStoreBox;
import com.tse.common.gui.tileentity.TileEntitySuperStoreBox;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIManager implements IGuiHandler{
	
	public static final int GUI_STORE_BOX = 17;
	public static final int GUI_SUPER_STORE_BOX = 18;
	public static final int GUI_VOID_STORE_BOX = 19;
	public static final int GUI_MYSTERIOUS_BOX = 20;
	public static final int GUI_DIAMOND_STORE_BOX = 21;
	public static final int GUI_COPPER_FURNACE = 25;
	public static final int GUI_ALLOY_FURNACE = 30;
	public static final int GUI_COPPER_ALLOY_FURNACE = 31;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		BlockPos xyz = new BlockPos(x, y, z);
		TileEntity tileEntity = world.getTileEntity(xyz);
		if (ID == GUI_STORE_BOX)
		{
	        return new ContainerStoreBox(player.inventory, (TileEntityStoreBox) tileEntity);
		}
		else if(ID == GUI_SUPER_STORE_BOX)
		{
			return new ContainerSuperStoreBox(player.inventory, (TileEntitySuperStoreBox) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_MYSTERIOUS_BOX)
		{
			return new ContainerMysteriousBox(player.inventory, (TileEntityMysteriousBox) tileEntity);
		}
		else if(ID == GUI_DIAMOND_STORE_BOX)
		{
			return new ContainerDiamondStoreBox(player.inventory, (TileEntityDiamondStoreBox) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_COPPER_FURNACE)
		{
			return new ContainerCopperFurnace(player.inventory, (TileEntityCopperFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_ALLOY_FURNACE)
		{
			return new ContainerAlloyFurnace(player, player.inventory, (TileEntityAlloyFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_COPPER_ALLOY_FURNACE)
		{
			return new ContainerCopperAlloyFurnace(player, player.inventory, (TileEntityCopperAlloyFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		if (ID == GUI_STORE_BOX)
		{
			 return new GUIStoreBox(player.inventory,  (TileEntityStoreBox) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_SUPER_STORE_BOX)
		{
			 return new GUISuperStoreBox(player.inventory,  (TileEntitySuperStoreBox) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_MYSTERIOUS_BOX)
		{
			return new GUIMysteriousBox(player.inventory, (TileEntityMysteriousBox) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_DIAMOND_STORE_BOX)
		{
			return new GUIDiamondStoreBox(player.inventory, (TileEntityDiamondStoreBox) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_COPPER_FURNACE)
		{
			return new GUICopperFurnace(player.inventory, (TileEntityCopperFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_ALLOY_FURNACE)
		{
			return new GUIAlloyFurnace(player, player.inventory, (TileEntityAlloyFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else if(ID == GUI_COPPER_ALLOY_FURNACE)
		{
			return new GUICopperAlloyFurnace(player, player.inventory, (TileEntityCopperAlloyFurnace) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}

}
