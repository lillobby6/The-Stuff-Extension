package com.tse.common.integration.jei;

import com.tse.common.gui.GUIAlloyFurnace;
import com.tse.common.gui.GUICopperAlloyFurnace;
import com.tse.common.gui.GUICopperFurnace;
import com.tse.common.gui.container.ContainerAlloyFurnace;
import com.tse.common.gui.container.ContainerCopperAlloyFurnace;
import com.tse.common.gui.container.ContainerCopperFurnace;
import com.tse.common.integration.jei.alloyfurnace.AlloyFurnaceSmeltingCategory;
import com.tse.common.integration.jei.alloyfurnace.AlloyFurnaceSmeltingRecipeMaker;
import com.tse.common.world.block.BlockManager;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.item.ItemStack;

@JEIPlugin
public class JEITSEPlugin implements IModPlugin{
	
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry)
	{
		IGuiHelper guiHelper = registry.getJeiHelpers().getGuiHelper();
		registry.addRecipeCategories(
			new AlloyFurnaceSmeltingCategory(guiHelper)
		);
	}
	@Override
	public void register(IModRegistry registry) {
		IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
		IJeiHelpers jeiHelpers = registry.getJeiHelpers();
		
		
		registry.addRecipes(AlloyFurnaceSmeltingRecipeMaker.getFurnaceRecipes(jeiHelpers), "tse.alloy_smelting");
		
		registry.addRecipeClickArea(GUIAlloyFurnace.class, 80, 35, 24, 17, "tse.alloy_smelting", VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeClickArea(GUICopperAlloyFurnace.class, 80, 35, 24, 17, "tse.alloy_smelting", VanillaRecipeCategoryUid.FUEL);
		
		registry.addRecipeClickArea(GUICopperFurnace.class, 78, 32, 28, 23, VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);
		
		IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();
		
		recipeTransferRegistry.addRecipeTransferHandler(ContainerAlloyFurnace.class, "tse.alloy_smelting", 0, 2, 4, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerAlloyFurnace.class, VanillaRecipeCategoryUid.FUEL, 2, 1, 4, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerCopperAlloyFurnace.class, VanillaRecipeCategoryUid.SMELTING, 0, 2, 4, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerCopperAlloyFurnace.class, VanillaRecipeCategoryUid.FUEL, 2, 1, 4, 36);
		
		recipeTransferRegistry.addRecipeTransferHandler(ContainerCopperFurnace.class, "tse.alloy_smelting", 0, 1, 3, 36);
		recipeTransferRegistry.addRecipeTransferHandler(ContainerCopperFurnace.class, VanillaRecipeCategoryUid.FUEL, 1, 1, 3, 36);
		
		registry.addRecipeCatalyst(new ItemStack(BlockManager.alloyFurnace), "tse.alloy_smelting", VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(BlockManager.copperAlloyFurnace), "tse.alloy_smelting", VanillaRecipeCategoryUid.FUEL);
		registry.addRecipeCatalyst(new ItemStack(BlockManager.copperFurnace), VanillaRecipeCategoryUid.SMELTING, VanillaRecipeCategoryUid.FUEL);

		
	}
}
