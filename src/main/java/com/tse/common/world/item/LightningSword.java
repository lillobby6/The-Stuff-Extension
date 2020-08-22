package com.tse.common.world.item;

import java.util.List;

import javax.annotation.Nullable;

import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.entity.TSEItemEntityFireproof;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class LightningSword extends ItemSword{
	
	public boolean hasFlames;

	public LightningSword(ToolMaterial material, String name, CreativeTabs tab, boolean hasFlames) {
		super(material);
		this.setCreativeTab(tab);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.hasFlames = hasFlames;
		ItemManager.registerItem(this);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase owner) {
		Entity bolt = new EntityLightningBolt(owner.world, target.posX, target.posY, target.posZ, this.hasFlames);
	    owner.world.addWeatherEffect(bolt);
	    return true;
    }
	
	@Override
	public boolean hasCustomEntity(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public Entity createEntity(World world, Entity old, ItemStack stack)
	{
		EntityItem entity = new TSEItemEntityFireproof(world, old.posX, old.posY, old.posZ, stack);
		entity.motionX = old.motionX;
		entity.motionY = old.motionY;
		entity.motionZ = old.motionZ;
		entity.setDefaultPickupDelay();
		return entity;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		if(this==ItemManager.justice)
			tooltip.add(TextFormatting.DARK_AQUA + "In the name of the law, I sentence you to die!");
		if(this==ItemManager.corruption)
			tooltip.add(TextFormatting.DARK_RED + "With this, I am unstoppable!");
		if(this==ItemManager.destruction)
			tooltip.add(TextFormatting.DARK_GRAY + "Vae victis!");
		if(this==ItemManager.creation)
			tooltip.add(TextFormatting.DARK_PURPLE + "Deus vult!");

	}

}
