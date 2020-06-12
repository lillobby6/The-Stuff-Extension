package com.tse.common.integration.jei.alloyfurnace;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;

public abstract class AlloyFurnaceRecipeCategory<T extends IRecipeWrapper> implements IRecipeCategory<T> {

	protected static final int inputSlot1 = 0;
	protected static final int inputSlot2 = 1;
	protected static final int fuelSlot = 2;
	protected static final int outputSlot = 3;
	
	protected final IDrawableStatic staticFlame;
	protected final IDrawableAnimated animatedFlame;
	protected final IDrawableAnimated arrow;
	
	public AlloyFurnaceRecipeCategory(IGuiHelper guiHelper)
	{
		staticFlame = guiHelper.createDrawable(new ResourceLocation("tse", "textures/gui/furnace_movement.png"), 0, 0, 14, 14);
		animatedFlame = guiHelper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);
		arrow = guiHelper.drawableBuilder(new ResourceLocation("tse", "textures/gui/furnace_movement.png"), 0, 14, 24, 17).buildAnimated(200, IDrawableAnimated.StartDirection.LEFT, false);
	}
}
