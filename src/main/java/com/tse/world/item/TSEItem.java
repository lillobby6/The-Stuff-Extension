package com.tse.world.item;

import java.util.List;

import javax.annotation.Nullable;

import com.tse.common.creativetabs.TSECreativeTabs;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TSEItem extends Item
{
	private static @Nullable String itemtext;
	
	public TSEItem(@Nullable String itemtext, String unlocalizedName)
	{
		super();
		this.itemtext = itemtext;
		this.setUnlocalizedName(unlocalizedName);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World world, List<String> itemtexts, ITooltipFlag advanced) {
		if(itemtext != null) 
			itemtexts.add(itemtext);
	}
}
