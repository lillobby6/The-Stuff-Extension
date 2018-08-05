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
	public TSEItem()
	{
		super();
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
	}
}
