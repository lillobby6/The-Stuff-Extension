package com.tse.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import com.tse.container.MysteriousContainer;
import com.tse.main.lib.StringsLib;
import com.tse.tileentity.MysteriousTileEntity;

public class MysteriousGui extends GuiContainer{
	private IInventory playerInv;
	private MysteriousTileEntity te;
	
	public MysteriousGui(IInventory playerInv, MysteriousTileEntity te) {
		super(new MysteriousContainer(playerInv, te));
		
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
	    this.fontRendererObj.drawString(s, 75 - this.fontRendererObj.getStringWidth(s) / 2, 5, 4210752);            //#404040
	    this.fontRendererObj.drawString(this.playerInv.getDisplayName().getUnformattedText(), 9, 72, 4210752);      //#404040
	}
}
