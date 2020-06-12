package com.tse.common.gui;

import com.tse.common.core.library.StringsLib;
import com.tse.common.gui.container.ContainerMysteriousBox;
import com.tse.common.gui.tileentity.TileEntityMysteriousBox;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GUIMysteriousBox extends GuiContainer{
	private IInventory playerInv;
	private TileEntityMysteriousBox te;
	
	public GUIMysteriousBox(IInventory playerInv, TileEntityMysteriousBox te) {
		super(new ContainerMysteriousBox(playerInv, te));
		
		this.playerInv = playerInv;
		this.te = te;
		
        this.xSize = 176;
        this.ySize = 166;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks,
			int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
	    this.mc.getTextureManager().bindTexture(new ResourceLocation(StringsLib.MODID + ":textures/gui/mysterious_gui.png"));
	    this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.te.getDisplayName().getUnformattedText();
	    this.fontRenderer.drawString(s, 75 - this.fontRenderer.getStringWidth(s) / 2, 5, 4210752);            //#404040
	    this.fontRenderer.drawString(this.playerInv.getDisplayName().getUnformattedText(), 9, 72, 4210752);      //#404040
	}
}
