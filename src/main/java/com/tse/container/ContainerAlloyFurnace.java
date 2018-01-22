package com.tse.container;

import com.tse.inventory.SlotAlloyFurnaceOutput;
import com.tse.tileentity.TileEntityAlloyFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class ContainerAlloyFurnace extends Container{

	private TileEntityAlloyFurnace alloyFurnace;
	private int cookTime;
    private int totalCookTime;
    private int furnaceBurnTime;
    private int currentItemBurnTime;
	
	public static final int INPUT[] = {0, 1};
	public static final int FUEL[] = {2};
	public static final int OUTPUT[] = {3};
	
	public static final int INV_START = OUTPUT.length + INPUT.length + FUEL.length, INV_END = INV_START + 26, HOTBAR_START = INV_END + 1, HOTBAR_END = HOTBAR_START + 8;
		
	public ContainerAlloyFurnace(EntityPlayer playerIn, InventoryPlayer playerInventory, TileEntityAlloyFurnace alloyFurnace)
	{
		this.alloyFurnace = alloyFurnace;
		
		this.addSlotToContainer(new Slot(alloyFurnace, INPUT[0], 45, 17));
		this.addSlotToContainer(new Slot(alloyFurnace, INPUT[1], 67, 17));
		this.addSlotToContainer(new SlotFurnaceFuel(alloyFurnace, FUEL[0], 56, 53));
		this.addSlotToContainer(new SlotAlloyFurnaceOutput(playerIn, alloyFurnace, OUTPUT[0], 116, 35));
		
		//Player Inventory
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		//Player action bar
		for (int i = 0; i < 9; ++i)
		{
			this.addSlotToContainer(new Slot(playerInventory, i, 8 + i * 18, 142));
		}
	}
	
	public void addListener(IContainerListener listener)
    {
        super.addListener(listener);
        listener.sendAllWindowProperties(this, this.alloyFurnace);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.listeners.size(); ++i)
        {
            IContainerListener icontainerlistener = this.listeners.get(i);

            if (this.cookTime != this.alloyFurnace.getField(2))
            {
                icontainerlistener.sendWindowProperty(this, 2, this.alloyFurnace.getField(2));
            }

            if (this.furnaceBurnTime != this.alloyFurnace.getField(0))
            {
                icontainerlistener.sendWindowProperty(this, 0, this.alloyFurnace.getField(0));
            }

            if (this.currentItemBurnTime != this.alloyFurnace.getField(1))
            {
                icontainerlistener.sendWindowProperty(this, 1, this.alloyFurnace.getField(1));
            }

            if (this.totalCookTime != this.alloyFurnace.getField(3))
            {
                icontainerlistener.sendWindowProperty(this, 3, this.alloyFurnace.getField(3));
            }
        }

        this.cookTime = this.alloyFurnace.getField(2);
        this.furnaceBurnTime = this.alloyFurnace.getField(0);
        this.currentItemBurnTime = this.alloyFurnace.getField(1);
        this.totalCookTime = this.alloyFurnace.getField(3);
    }
    
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 3)
            {
                if (!this.mergeItemStack(itemstack1, 4, 40, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (index != 2 && index != 1 && index != 0)
            {
                if (!FurnaceRecipes.instance().getSmeltingResult(itemstack1).isEmpty())
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (TileEntityFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 2, 3, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 3 && index < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 31, 40, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }
                else if (index >= 31 && index < 40 && !this.mergeItemStack(itemstack1, 4, 31, false))
                {
                    return ItemStack.EMPTY;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 4, 40, false))
            {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
            {
                slot.putStack(ItemStack.EMPTY);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    }
	
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		// TODO Auto-generated method stub
		return this.alloyFurnace.isUsableByPlayer(playerIn);
	}

}
