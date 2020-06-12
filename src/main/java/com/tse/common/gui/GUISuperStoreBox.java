package com.tse.common.gui;

import com.tse.common.core.library.StringsLib;
import com.tse.common.gui.container.ContainerSuperStoreBox;
import com.tse.common.gui.tileentity.TileEntitySuperStoreBox;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GUISuperStoreBox extends GuiContainer{
	
	private IInventory playerInv;
	private TileEntitySuperStoreBox te;
	
	public GUISuperStoreBox(IInventory playerInv, TileEntitySuperStoreBox te) {
		super(new ContainerSuperStoreBox(playerInv, te));
		
		this.playerInv = playerInv;
		this.te = te;
		
        this.xSize = 230;
        this.ySize = 222;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks,
			int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
	    this.mc.getTextureManager().bindTexture(new ResourceLocation(StringsLib.MODID + ":textures/gui/super_store_chest_gui.png"));
	    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.te.getDisplayName().getUnformattedText();
	    this.fontRenderer.drawString(s, 115 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);            //#404040
	    this.fontRenderer.drawString(this.playerInv.getDisplayName().getUnformattedText(), 34, 110, 4210752);      //#404040
	}

}
