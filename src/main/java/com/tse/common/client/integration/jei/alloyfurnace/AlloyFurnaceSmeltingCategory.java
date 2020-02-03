package com.tse.common.client.integration.jei.alloyfurnace;

import com.tse.library.StringsLib;
import com.tse.world.block.BlockManager;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;

public class AlloyFurnaceSmeltingCategory extends AlloyFurnaceRecipeCategory<AlloyFurnaceSmeltingRecipe>{
	private final IDrawableStatic background;
	private final IDrawable icon;
	private final String localizedName;
	
	public AlloyFurnaceSmeltingCategory(IGuiHelper guiHelper) {
		super(guiHelper);
		ResourceLocation location = new ResourceLocation("tse", "textures/gui/jei_alloy_furnace.png");
		background = guiHelper.createDrawable(location, 0, 0, 70, 56);
		icon = guiHelper.createDrawableIngredient(new ItemStack(BlockManager.alloyFurnace));
		localizedName = I18n.translateToLocalFormatted("gui.tse.alloy_smelting");
	}

	@Override
	public String getUid() {
		return "tse.alloy_smelting";
	}

	@Override
	public String getTitle() {
		return localizedName;
	}
	
	@Override
	public IDrawable getIcon()
	{
		return icon;
	}

	@Override
	public String getModName() {
		return StringsLib.NAME;
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}
	
	@Override
	public void drawExtras(Minecraft minecraft)
	{
		animatedFlame.draw(minecraft, 3, 22);
		arrow.draw(minecraft, 24, 22);
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, AlloyFurnaceSmeltingRecipe recipeWrapper, IIngredients ingredients) {
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		
		guiItemStacks.init(inputSlot1, true, 2, 2);
		guiItemStacks.init(inputSlot2, true, 28, 2);
		guiItemStacks.init(outputSlot, false, 52, 20);
		
		guiItemStacks.set(ingredients);
	}
}
