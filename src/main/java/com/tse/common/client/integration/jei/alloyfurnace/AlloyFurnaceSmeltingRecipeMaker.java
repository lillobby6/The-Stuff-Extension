package com.tse.common.client.integration.jei.alloyfurnace;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tse.world.item.recipe.AlloyFurnaceRecipes;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

public class AlloyFurnaceSmeltingRecipeMaker {
	private AlloyFurnaceSmeltingRecipeMaker()
	{}
	
	public static List<AlloyFurnaceSmeltingRecipe> getFurnaceRecipes(IJeiHelpers helpers)
	{
		IStackHelper stackHelper = helpers.getStackHelper();
		AlloyFurnaceRecipes furnaceRecipes = AlloyFurnaceRecipes.instance();
		Map<ItemStack[], ItemStack> smeltingMap = furnaceRecipes.getMetaRecipeList();

		List<AlloyFurnaceSmeltingRecipe> recipes = new ArrayList<>();

		for (Map.Entry<ItemStack[], ItemStack> entry : smeltingMap.entrySet()) {
			ItemStack[] input = entry.getKey();
			ItemStack output = entry.getValue();

			List<ItemStack> inputs1 = stackHelper.getSubtypes(input[0]);
			List<ItemStack> inputs2 = stackHelper.getSubtypes(input[1]);
			AlloyFurnaceSmeltingRecipe recipe = new AlloyFurnaceSmeltingRecipe(inputs1, inputs2, output);
			recipes.add(recipe);
		}

		return recipes;
	}
}
