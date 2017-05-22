package com.tse.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.tse.tileentity.DiamondSBTileEntity;
import com.tse.tileentity.StoreBoxTileEntity;

public class DiamondSBContainer extends Container{

	private DiamondSBTileEntity te;
	
	public DiamondSBContainer(IInventory playerInv, DiamondSBTileEntity te){
		this.te = te;
		//TileEntity Inventory ID#0-77
		for (int y = 0; y < 6; ++y)
		{
			for (int x = 0; x < 13; ++x)
			{
	            this.addSlotToContainer(new Slot(te, x + y * 13, 8 + x * 18, 18 + y * 18));
	        }
	    }
		
		//TileEntity Inventory ID#78-104
		for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 9; ++x)
	        {
	            this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 44 + x * 18, 140 + y * 18));
	        }
	    }
		
		//TileEntity Inventory ID#0-8
		for (int x = 0; x < 9; ++x)
		{
	        this.addSlotToContainer(new Slot(playerInv, x, 44 + x * 18, 198));
	    }
		
		/*
		 * SLOTS:
		 * 
		 * Tile Entity 0-53 ........ 0 - 53
		 * Player Inventory 54-80 . 54 - 80
		 * Player Inventory 0-8 ... 81 - 89
		 */
	}
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
	    ItemStack previous = ItemStack.EMPTY;
	    Slot slot = (Slot) this.inventorySlots.get(fromSlot);

	    if (slot != null && slot.getHasStack()) {
	        ItemStack current = slot.getStack();
	        previous = current.copy();

	        if (fromSlot < 54) {
	            // From TE Inventory to Player Inventory
	            if (!this.mergeItemStack(current, 77, 104, true))
	                return ItemStack.EMPTY;
	        } else {
	            // From Player Inventory to TE Inventory
	            if (!this.mergeItemStack(current, 0, 78, false))
	                return ItemStack.EMPTY;
	        }

	        if (current.isEmpty())
	            slot.putStack((ItemStack.EMPTY));
	        else
	            slot.onSlotChanged();

	        /*if (current.getMaxStackSize() == previous.getMaxStackSize())
	            return ItemStack.EMPTY;
	       // slot.onPickupFromSlot(playerIn, current);
	        slot.func_190901_a(playerIn, current);*/ //TODO Find out what this was
	    }
	    return previous;
	}
	
    
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUsableByPlayer(playerIn);
	}

}
