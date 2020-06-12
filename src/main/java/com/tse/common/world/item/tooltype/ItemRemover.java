package com.tse.common.world.item.tooltype;

import java.util.Set;

import com.google.common.collect.Sets;
import com.tse.common.world.block.BlockManager;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class ItemRemover extends ItemTool{
	
    private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {BlockManager.mysteriousBox, BlockManager.storeBox, BlockManager.superStoreBox});


	protected ItemRemover(float attackSpeed, ToolMaterial material) {
		super(0F, attackSpeed, material, EFFECTIVE_ON);
	}

}
