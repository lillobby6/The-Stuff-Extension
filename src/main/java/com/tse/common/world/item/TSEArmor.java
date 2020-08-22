package com.tse.common.world.item;

import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.entity.TSEItemEntityFireproof;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TSEArmor extends ItemArmor{
	
	private boolean fireproof = false;

	public TSEArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType, boolean fireproof)
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabWeapons);
		this.fireproof = fireproof;
		ItemManager.registerItem(this);
	}
	
	public TSEArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType)
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(unlocalizedName);
		this.setCreativeTab(TSECreativeTabs.tabWeapons);
		ItemManager.registerItem(this);
	}
	
	public boolean hasCustomEntity(ItemStack stack)
	{
		return fireproof;
	}
	
	public Entity createEntity(World world, Entity old, ItemStack stack)
	{
		if(fireproof)
		{
			EntityItem entity = new TSEItemEntityFireproof(world, old.posX, old.posY, old.posZ, stack);
			entity.motionX = old.motionX;
			entity.motionY = old.motionY;
			entity.motionZ = old.motionZ;
			entity.setDefaultPickupDelay();
			return entity;
		}
		return super.createEntity(world, old, stack);
			
	}

}
