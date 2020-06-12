package com.tse.common.world.item;

import java.util.List;

import javax.annotation.Nullable;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
	
	@SideOnly(Side.CLIENT)
	@Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		if(this==ItemManager.justice)
			tooltip.add("§3In the name of the law, I sentence you to die!");
		if(this==ItemManager.corruption)
			tooltip.add("§4With this, I am unstoppable!");
		if(this==ItemManager.destruction)
			tooltip.add("§8Vae victis!");
		if(this==ItemManager.creation)
			tooltip.add("§5Deus vult!");

	}

}
