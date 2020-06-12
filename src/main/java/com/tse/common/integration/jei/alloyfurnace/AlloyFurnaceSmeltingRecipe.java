package com.tse.common.integration.jei.alloyfurnace;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.tse.common.world.item.recipe.AlloyFurnaceRecipes;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;

public class AlloyFurnaceSmeltingRecipe implements IRecipeWrapper{
	
	private final List<List<ItemStack>> inputs;
	private final ItemStack output;
	
	public AlloyFurnaceSmeltingRecipe(List<ItemStack> input1, List<ItemStack> input2, ItemStack output)
	{
		this.inputs = new ArrayList<>();
		this.inputs.add(input1);
		this.inputs.add(input2);
		this.output = output;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients)
	{
		ingredients.setInputLists(VanillaTypes.ITEM, inputs);
		ingredients.setOutput(VanillaTypes.ITEM, output);
	}
	
	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY)
	{
		AlloyFurnaceRecipes alloyFurnaceRecipes = AlloyFurnaceRecipes.instance();
		float experience = alloyFurnaceRecipes.getExperience(output);
		if(experience > 0)
		{
			String experienceString = I18n.translateToLocalFormatted("gui.tse.alloysmelting.experience", experience);
			FontRenderer fontRenderer = minecraft.fontRenderer;
			int stringWidth = fontRenderer.getStringWidth(experienceString);
			fontRenderer.drawString(experienceString, recipeWidth - stringWidth, 0, Color.gray.getRGB());
		}
	}
}
