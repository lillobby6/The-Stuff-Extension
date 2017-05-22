package com.tse.container;

import com.tse.tileentity.MysteriousTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class MysteriousContainer extends Container{
	private MysteriousTileEntity te;
	
	public MysteriousContainer(IInventory playerInv, MysteriousTileEntity te){
		this.te = te;
		//TileEntity Inventory ID#0

	    this.addSlotToContainer(new Slot(te, 0, 80, 25));
		
		//TileEntity Inventory ID#1-27
		for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 9; ++x)
	        {
	            this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
	        }
	    }
		
		//TileEntity Inventory ID#28-36
		for (int x = 0; x < 9; ++x)
		{
	        this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 142));
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

	        if (fromSlot < 1) {
	            // From TE Inventory to Player Inventory
	            if (!this.mergeItemStack(current, 1, 36, true))
	                return ItemStack.EMPTY;
	        } else {
	            // From Player Inventory to TE Inventory
	            if (!this.mergeItemStack(current, 0, 1, false))
	                return ItemStack.EMPTY;
	        }

	        if (current.isEmpty())
	            slot.putStack(ItemStack.EMPTY);
	        else
	            slot.onSlotChanged();

	        /*if (current.getMaxStackSize() == previous.getMaxStackSize())
	            return ItemStack.EMPTY;
	        slot.func_190901_a(playerIn, current);*/
	    }
	    return previous;
	}
	
	@Override
	public void onContainerClosed(EntityPlayer playerIn)
	{
		super.onContainerClosed(playerIn);
		this.te.closeInventory(playerIn);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUsableByPlayer(playerIn);
	}
}
