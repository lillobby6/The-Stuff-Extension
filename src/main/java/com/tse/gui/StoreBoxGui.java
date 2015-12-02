package com.tse.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;

import com.tse.container.StoreBoxContainer;
import com.tse.tileentity.StoreBoxTileEntity;

public class StoreBoxGui extends GuiContainer{
	
	public StoreBoxGui(IInventory playerInv, StoreBoxTileEntity te) {
		super(new StoreBoxContainer(playerInv, te));

        this.xSize = 176;
        this.ySize = 222;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks,
			int mouseX, int mouseY) {
	}

}
