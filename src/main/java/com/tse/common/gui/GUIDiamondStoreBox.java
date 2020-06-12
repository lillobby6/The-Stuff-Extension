package com.tse.common.gui;

import com.tse.common.core.library.StringsLib;
import com.tse.common.gui.container.ContainerDiamondStoreBox;
import com.tse.common.gui.tileentity.TileEntityDiamondStoreBox;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GUIDiamondStoreBox extends GuiContainer{
	
	private IInventory playerInv;
	private TileEntityDiamondStoreBox te;
	
	public GUIDiamondStoreBox(IInventory playerInv, TileEntityDiamondStoreBox te) {
		super(new ContainerDiamondStoreBox(playerInv, te));
		
		this.playerInv = playerInv;
		this.te = te;
		
        this.xSize = 248;
        this.ySize = 222;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks,
			int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
	    this.mc.getTextureManager().bindTexture(new ResourceLocation(StringsLib.MODID + ":textures/gui/diamond_store.png"));
	    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.te.getDisplayName().getUnformattedText();
	    this.fontRenderer.drawString(s, 88 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);            //#404040
	    this.fontRenderer.drawString(this.playerInv.getDisplayName().getUnformattedText(), 8, 127, 4210752);      //#404040
	}

}
