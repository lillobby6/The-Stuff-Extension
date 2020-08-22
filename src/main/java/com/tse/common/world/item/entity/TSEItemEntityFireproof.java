package com.tse.common.world.item.entity;

import javax.annotation.Nonnull;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class TSEItemEntityFireproof extends EntityItem{

	public TSEItemEntityFireproof(World worldIn) {
		super(worldIn);
		isImmuneToFire = true;
	}

	public TSEItemEntityFireproof(World worldIn, double x, double y, double z, ItemStack stack) {
		super(worldIn, x, y, z, stack);
		isImmuneToFire = true;
	}
	
	@Override
	  public boolean attackEntityFrom(@Nonnull DamageSource source, float amount) {
	    if(source.getDamageType().equals(DamageSource.OUT_OF_WORLD.damageType)) {
	      return true;
	    }
	    return false;
	  }


}
