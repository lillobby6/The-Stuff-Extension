/*package com.tse.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

public class SuperStoreBoxTileEntity extends TileEntity implements IInventory{
	
	private ItemStack[] inventory;
	private String customName;
	 
	public SuperStoreBoxTileEntity() {
		this.inventory = new ItemStack[this.getSizeInventory()];
	}

	public String getCustomName() {
		return this.customName;
	}

	public void setCustomName(String customName) {
	    this.customName = customName;
	}

	@Override
	public String getName() {
		 return this.hasCustomName() ? this.customName : "container.super_store_box";
	}

	@Override
	public boolean hasCustomName() {
		return this.customName != null && !this.customName.equals("");
	}

	@Override
	public ITextComponent getDisplayName() {
		 return this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName());
	}

	@Override
	public int getSizeInventory() {
		return 71;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		 if (index < 0 || index >= this.getSizeInventory())
		        return null;
		    return this.inventory[index];
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		if (this.getStackInSlot(index) != null) {
	        ItemStack itemstack;

	        if (this.getStackInSlot(index).getMaxStackSize() <= count) {
	            itemstack = this.getStackInSlot(index);
	            this.setInventorySlotContents(index, null);
	            this.markDirty();
	            return itemstack;
	        } else {
	            itemstack = this.getStackInSlot(index).splitStack(count);

	            if (this.getStackInSlot(index).getMaxStackSize() <= 0) {
	                this.setInventorySlotContents(index, null);
	            } else {
	                this.setInventorySlotContents(index, this.getStackInSlot(index));
	            }

	            this.markDirty();
	            return itemstack;
	        }
	    } else {
	        return null;
	    }
	}

	/*@Override
	public ItemStack getStackInSlotOnClosing(int index) {
		 ItemStack stack = this.getStackInSlot(index);
		 this.setInventorySlotContents(index, null);
		 return stack;
	}*

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		int st = stack.getMaxStackSize();
		if (index < 0 || index >= this.getSizeInventory())
	        return;

	    if (stack != null && stack.getMaxStackSize() > this.getInventoryStackLimit())
	        st = this.getInventoryStackLimit();
	        
	    if (stack != null && stack.getMaxStackSize() == 0)
	        stack = null;

	    this.inventory[index] = stack;
	    this.markDirty();
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.getPos()) == this && player.getDistanceSq(this.pos.add(0.5, 0.5, 0.5)) <= 64;
	}

	@Override
	public void openInventory(EntityPlayer player) {}

	@Override
	public void closeInventory(EntityPlayer player) {}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return true;
	}

	@Override
	public int getField(int id) {
		return 0;
	}

	@Override
	public void setField(int id, int value) {}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		 for (int i = 0; i < this.getSizeInventory(); i++)
		        this.setInventorySlotContents(i, null);
	}
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {
	    super.writeToNBT(nbt);

	    NBTTagList list = new NBTTagList();
	    for (int i = 0; i < this.getSizeInventory(); ++i) {
	        if (this.getStackInSlot(i) != null) {
	            NBTTagCompound stackTag = new NBTTagCompound();
	            stackTag.setByte("Slot1", (byte) i);
	            this.getStackInSlot(i).writeToNBT(stackTag);
	            list.appendTag(stackTag);
	        }
	    }
	    nbt.setTag("Items1", list);

	    if (this.hasCustomName()) {
	        nbt.setString("CustomName1", this.getCustomName());
	    }
	    return nbt;
	}


	@Override
	public void readFromNBT(NBTTagCompound nbt) {
	    super.readFromNBT(nbt);

	    NBTTagList list = nbt.getTagList("Items1", 10);
	    for (int i = 0; i < list.tagCount(); ++i) {
	        NBTTagCompound stackTag = list.getCompoundTagAt(i);
	        int slot = stackTag.getByte("Slot1") & 255;
	        //this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(stackTag));
	    }

	    if (nbt.hasKey("CustomName1", 8)) {
	        this.setCustomName(nbt.getString("CustomName1"));
	    }
	}


	@Override
	public ItemStack removeStackFromSlot(int index) {
		ItemStack stack = this.getStackInSlot(index);
		 this.setInventorySlotContents(index, null);
		 return stack;
	}

	@Override
	public boolean func_191420_l() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
*/