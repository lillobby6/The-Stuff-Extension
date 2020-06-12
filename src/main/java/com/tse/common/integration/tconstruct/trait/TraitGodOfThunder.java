package com.tse.common.integration.tconstruct.trait;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitGodOfThunder extends AbstractTrait {

	public TraitGodOfThunder() {
		super("god_of_thunder", TextFormatting.YELLOW);
		
	}
	
	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit)
	{
		if(wasHit)
		{
			Entity bolt = new EntityLightningBolt(player.world, target.posX, target.posY, target.posZ, false);
		    player.world.addWeatherEffect(bolt);
		}
	}

}
