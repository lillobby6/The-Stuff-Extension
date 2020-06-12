package com.tse.common.integration.tconstruct.trait;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitAmeliorating extends AbstractTrait {
		
	public TraitAmeliorating() {
		super("ameliorating", TextFormatting.GREEN);
	}
	
	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit)
	{
		if(wasHit && target.isEntityAlive()) {
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 100));
		}
		
		
	}

}
