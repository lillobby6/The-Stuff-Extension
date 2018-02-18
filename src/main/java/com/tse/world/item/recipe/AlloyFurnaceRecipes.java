package com.tse.world.item.recipe;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;
import com.tse.common.core.TheStuffExtension;
import com.tse.container.ContainerAlloyFurnace;
import com.tse.world.item.ItemManager;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AlloyFurnaceRecipes {
	private static final AlloyFurnaceRecipes recipes = new AlloyFurnaceRecipes();
	//Recipe
	private final Map<ItemStack[], ItemStack> metaRecipeList = Maps.<ItemStack[], ItemStack>newHashMap();
	//Experience
	private final Map<ItemStack[], Float> metaExperience = Maps.<ItemStack[], Float>newHashMap();
	
	public static AlloyFurnaceRecipes instance()
    {
        return recipes;
    }

	private AlloyFurnaceRecipes()
	{
		this.addSmeltingRecipe(ItemManager.copperIngot, ItemManager.tinIngot, new ItemStack(ItemManager.bronzeIngot), 0.3F);
	}
	
	public void addSmeltingRecipe(Item input1, Item input2, ItemStack stack, float experience)
	{
		this.addSmelting(new ItemStack[] {new ItemStack(input1), new ItemStack(input2)}, stack, experience);
	}
	
	public void addSmeltingRecipe(ItemStack[] input, ItemStack stack, float experience)
	{
		this.addSmelting(input, stack, experience);
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
			metaExperience.put(items, Float.valueOf(experience));
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
	
	public ItemStack getSmeltingResult(ItemStack item1, ItemStack item2)
	{
		for (Entry<ItemStack[], ItemStack> entry : this.metaRecipeList.entrySet())
        {
			if (this.compareItemStacks(new ItemStack[] {item1, item2}, entry.getKey()))
            {
                return entry.getValue(); 
            }
           
        }
        return ItemStack.EMPTY;
	}
	
	private boolean compareItemStacks(ItemStack[] stack1, ItemStack[] stack2)
    {
		if(stack1.length != stack2.length)
		{
			return false;
		}
		else
		{
			for(int i = 0; i < stack1.length; i++)
				if(stack1[i].getItem() != stack2[i].getItem() || stack1[i].getMetadata() != stack2[i].getMetadata())
				{
					return false;
				}
			return true;
		}
    }

	public Map<ItemStack[], ItemStack> getMetaRecipeList()
	{
		return metaRecipeList;
	}
	
}
