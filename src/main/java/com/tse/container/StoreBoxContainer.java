/*package com.tse.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.tse.tileentity.StoreBoxTileEntity;

public class StoreBoxContainer extends Container{

	private StoreBoxTileEntity te;
	
	public StoreBoxContainer(IInventory playerInv, StoreBoxTileEntity te){
		this.te = te;
		//TileEntity Inventory ID#0-53
		for (int y = 0; y < 6; ++y)
		{
			for (int x = 0; x < 9; ++x)
			{
	            	this.addSlotToContainer(new Slot(te, x + y * 9, 8 + x * 18, 18 + y * 18));
	        }
	    }
		
		//TileEntity Inventory ID#54-80
		for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 9; ++x)
	        {
	            this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 140 + y * 18));
	        }
	    }
		
		//TileEntity Inventory ID#0-8
		for (int x = 0; x < 9; ++x)
		{
	        this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 198));
	    }
		
		/*
		 * SLOTS:
		 * 
		 * Tile Entity 0-53 ........ 0 - 53
		 * Player Inventory 54-80 . 54 - 80
		 * Player Inventory 0-8 ... 81 - 89
		 *
	}
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
	    ItemStack previous = null;
	    Slot slot = (Slot) this.inventorySlots.get(fromSlot);

	    if (slot != null && slot.getHasStack()) {
	        ItemStack current = slot.getStack();
	        previous = current.copy();

	        if (fromSlot < 54) {
	            // From TE Inventory to Player Inventory
	            if (!this.mergeItemStack(current, 55, 81, true))
	                return null;
	        } else {
	            // From Player Inventory to TE Inventory
	            if (!this.mergeItemStack(current, 0, 54, false))
	                return null;
	        }

	        if (current.getMaxStackSize() == 0)
	            slot.putStack((ItemStack) null);
	        else
	            slot.onSlotChanged();

	        if (current.getMaxStackSize() == previous.getMaxStackSize())
	            return null;
	        slot.func_190901_a(playerIn, current);
	    }
	    return previous;
	}
	
    
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUseableByPlayer(playerIn);
	}

}
*/