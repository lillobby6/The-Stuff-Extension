package com.tse.common.world.item;

import java.util.List;

import javax.annotation.Nullable;

import com.tse.common.creativetabs.TSECreativeTabs;
import com.tse.common.world.item.entity.TSEItemEntityFireproof;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TSEItem extends Item
{
	
	private boolean fireproof = false;
	
	public TSEItem(String name, CreativeTabs tab)
	{
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		ItemManager.registerItem(this);
	}
	
	public TSEItem(String name, CreativeTabs tab, boolean fireproof)
	{
		this.fireproof = fireproof;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		ItemManager.registerItem(this);
	}
	
	@Override
	public boolean hasCustomEntity(ItemStack stack)
	{
		return fireproof;
	}
	
	@Override
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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag advanced) {
		if(this==ItemManager.meteoricIronShard)
			tooltip.add("§7A piece of the stars");
		if(this==ItemManager.unusableMaterial)
			tooltip.add("A little bit of everything, but mostly nothing");
		if(this==ItemManager.toslotriumIngot)
			tooltip.add("It feels like it could mix with anything");
		if(this==ItemManager.magicStick)
			tooltip.add("WARNING: Do not wave in the air while reciting Latin!");
		if(this==ItemManager.mysticIngot)
			tooltip.add("A memory of a time long past");
		if(this==ItemManager.maduumIngot)
			tooltip.add("Too much of a good thing can be bad, or, in this case, terrible.");
		if(this==ItemManager.everbrightShard)
			tooltip.add("A single touch of the shard makes you dream of places far, far away...");
		if(this==ItemManager.arcaeumIngot)
			tooltip.add("It feels as if it wants to go home.");
		if(this==ItemManager.necromiumIngot)
			tooltip.add("The very heart of evil, well maybe not technically, but it feels like it.");
		if(this==ItemManager.mysteriousIngot)
			tooltip.add("You don't see this every day? Well I guess you do now at least.");
		if(this==ItemManager.terriumIngot)
			tooltip.add("This stuff is rare, so rare, in fact, that it didn't exist for a while!");
		if(this==ItemManager.dreamIngot)
			tooltip.add("Sweet!");
		if(this==ItemManager.nightmareIngot)
			tooltip.add("It speaks of sweet nothings...");
		if(this==ItemManager.immortaliumIngot || this==ItemManager.eterniumIngot)
			tooltip.add("Tell me, was it worth it?");
	}
}
