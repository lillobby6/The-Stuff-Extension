package com.tse.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import com.tse.container.StoreBoxContainer;
import com.tse.main.lib.StringsLib;
import com.tse.tileentity.StoreBoxTileEntity;

public class StoreBoxGui extends GuiContainer{
	
	private IInventory playerInv;
	private StoreBoxTileEntity te;
	
	public StoreBoxGui(IInventory playerInv, StoreBoxTileEntity te) {
		super(new StoreBoxContainer(playerInv, te));
		
		this.playerInv = playerInv;
		this.te = te;
		
        this.xSize = 176;
        this.ySize = 222;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks,
			int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
	    this.mc.getTextureManager().bindTexture(new ResourceLocation(StringsLib.MODID + ":textures/gui/54inventorychest.png"));
	    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.te.getDisplayName().getUnformattedText();
	    this.fontRendererObj.drawString(s, 88 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);            //#404040
	    this.fontRendererObj.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, 127, 4210752);      //#404040
	}

}
