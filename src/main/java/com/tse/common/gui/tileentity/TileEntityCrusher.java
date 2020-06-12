package com.tse.common.gui.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;

public class TileEntityCrusher extends TileEntityLockable implements ISidedInventory{

	private static final int[] slots_top = new int[] {0};
	private static final int[] slots_side = new int[] {1};
				
	private NonNullList<ItemStack> itemStacks = NonNullList.<ItemStack>withSize(2, ItemStack.EMPTY);
			
	/** Progress bar for progress of getting through one item */
	private int workTime;
	
	private int totalWorkTime;
	
	private String customName;
	
	@Override
	public int getSizeInventory() {
		return this.itemStacks.size();
	}

	@Override
	public boolean isEmpty() {
		for(ItemStack stack: this.itemStacks)
		{
			if(!stack.isEmpty())
			{
				return false;
			}
		}
		return true;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		return this.itemStacks.get(index);
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		return ItemStackHelper.getAndSplit(this.itemStacks, index, count);
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return ItemStackHelper.getAndRemove(this.itemStacks, index);
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		ItemStack itemStack = this.itemStacks.get(index);
		boolean flag = !stack.isEmpty() && stack.isItemEqual(itemStack) && ItemStack.areItemStacksEqual(stack, itemStack);
		if (stack.getCount() > this.getInventoryStackLimit())
		{
			stack.setCount(this.getInventoryStackLimit());
		}
		
		if(index == 0 && !flag)
		{
			this.totalWorkTime = this.getWorkTime(stack);
			this.workTime = 0;
			this.markDirty();
		}
	}
	

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer player) {
		if(this.world.getTileEntity(this.pos) != this)
		{
			return false;
		}
		else
		{
			return player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
		}
	}

	@Override
	public void openInventory(EntityPlayer player) {}

	@Override
	public void closeInventory(EntityPlayer player) {}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		if(index == 1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public int getField(int id) {
		switch (id)
		{
			case 0:
				return this.workTime;
			case 1:
				return this.totalWorkTime;
			default:
				return 0;
		}
		
	}

	@Override
	public void setField(int id, int value) {
		switch(id)
		{
			case 0:
				this.totalWorkTime = value;
				break;
			case 1:
				this.workTime = value;
		}
	}

	@Override
	public int getFieldCount() {
		return 2;
	}

	@Override
	public void clear() {
		this.itemStacks.clear();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.hasCustomName() ? this.customName : "container.crusher";
	}

	@Override
	public boolean hasCustomName() {
		return this.customName != null && !this.customName.isEmpty();
	}

	@Override
	public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return null;
		//return new ContainerCrusher(playerIn, playerInventory, this);
	}

	@Override
	public String getGuiID() {
		// TODO Auto-generated method stub
		return "tse:crusher";
	}

	@Override
	public int[] getSlotsForFace(EnumFacing side) {
		if (side == EnumFacing.DOWN)
		{
			return slots_top;
		}
		else
		{
			return side == EnumFacing.UP ? slots_top : slots_side;
		}
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
		return this.isItemValidForSlot(index, itemStackIn);
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
		return true;
	}
	
	public int getWorkTime(ItemStack stack)
	
	{
		return 200;
	}
	

}
