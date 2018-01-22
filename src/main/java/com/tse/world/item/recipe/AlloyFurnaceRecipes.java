package com.tse.world.item.recipe;

import java.util.Map;

import com.google.common.collect.Maps;
import com.tse.common.core.TheStuffExtension;
import com.tse.container.ContainerAlloyFurnace;
import com.tse.world.item.ItemManager;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AlloyFurnaceRecipes {
	private static final AlloyFurnaceRecipes recipes = new AlloyFurnaceRecipes();
	//Recipe
	private Map<ItemStack[], ItemStack> metaRecipeList = Maps.<ItemStack[], ItemStack>newHashMap();
	//Experience
	private Map<ItemStack[], Float> metaExperience = Maps.<ItemStack[], Float>newHashMap();
	
	public static AlloyFurnaceRecipes instance()
    {
        return recipes;
    }

	private AlloyFurnaceRecipes()
	{
		this.addSmeltingRecipe(ItemManager.copperIngot, ItemManager.tinIngot, new ItemStack(ItemManager.bronzeIngot), 0.2F);
	}
	
	public void addSmeltingRecipe(Item input1, Item input2, ItemStack stack, float experience)
	{
		this.addSmelting(new ItemStack[] {new ItemStack(input1), new ItemStack(input2)}, stack, experience);
	}
	
	public void addSmelting(ItemStack[] items, ItemStack result, float experience)
	{
		if (metaRecipeList.containsKey(items))
		{
			TheStuffExtension.logWarn("Conflicting recipe: " + items.toString() + " for " + metaRecipeList.get(items).toString());
		}
		else
		{
			metaRecipeList.put(items, result);
			metaExperience.put(items, experience);
		}
	}
	
	
	
	public float getExperience(ItemStack item)
	{
		if (item.isEmpty())
		{
			return 0;
		}
		float ret = -1;
		if (ret < 0 && metaExperience.containsKey(new ItemStack[] {item}))
		{
			ret = metaExperience.get(new ItemStack[] {item});
		}
		
		return (ret < 0 ? 0: ret);
	}
	
	public ItemStack getSmeltingResult(ItemStack[] items)
	{
		return metaRecipeList.get(items);
	}

	public Map<ItemStack[], ItemStack> getMetaRecipeList()
	{
		return metaRecipeList;
	}
	
}
