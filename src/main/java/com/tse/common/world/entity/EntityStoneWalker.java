package com.tse.common.world.entity;

import javax.annotation.Nullable;

import com.tse.common.core.library.StringsLib;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityStoneWalker extends EntityAnimal
{

	public static final ResourceLocation LOOT = new ResourceLocation(StringsLib.MODID, "entities/stone_walker");
	public EntityStoneWalker(World worldIn)
	{
		super(worldIn);
		this.setSize(1.1F, 1F);
		
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(20.0D);
	}
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAIWander(this, 0.5D));
		this.tasks.addTask(1, new EntityAIPanic(this, 1D));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.tasks.addTask(3, new EntityAITempt(this, 1.2D, Item.getItemFromBlock(Blocks.STONE), false));
		this.tasks.addTask(5, new EntityAISwimming(this));
		this.applyEntityAI();
	}
	private void applyEntityAI()
	{
		this.tasks.addTask(6, new EntityAIHurtByTarget(this, true, new Class[]{EntitySkeleton.class}));
	}

	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return null;
	}
	@Override
	@Nullable
	protected ResourceLocation getLootTable()
	{
		return LOOT;
	}
	
	@Override
	public int getMaxSpawnedInChunk()
	{
		return 15;
	}

}
