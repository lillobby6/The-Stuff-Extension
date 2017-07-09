package com.tse.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.tse.creativetabs.TSECreativeTabs;

public class LightningSword extends ItemSword{
	
	public boolean hasFlames;

	public LightningSword(ToolMaterial material, CreativeTabs tab, String name, boolean hasFlames) {
		super(material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(name);
		this.hasFlames = hasFlames;
	}
	
	public LightningSword(ToolMaterial material, String name)
	{
		super(material);
		this.setCreativeTab(TSECreativeTabs.tabWeapons);
		this.setUnlocalizedName(name);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase owner) {
		Entity bolt = new EntityLightningBolt(owner.world, target.posX, target.posY, target.posZ, this.hasFlames);
	    owner.world.addWeatherEffect(bolt);
	    return true;
    }

}
