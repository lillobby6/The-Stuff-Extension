package com.tse.world.item.recipe;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;
import com.tse.common.core.TheStuffExtension;
import com.tse.container.ContainerAlloyFurnace;
import com.tse.world.item.ItemManager;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AlloyFurnaceRecipes {
	private static final AlloyFurnaceRecipes recipes = new AlloyFurnaceRecipes();
	// Recipe
	private final Map<ItemStack[], ItemStack> metaRecipeList = Maps.<ItemStack[], ItemStack>newHashMap();
	// Experience
	private final Map<ItemStack[], Float> metaExperience = Maps.<ItemStack[], Float>newHashMap();

	public static AlloyFurnaceRecipes instance() {
		return recipes;
	}

	private AlloyFurnaceRecipes() {
		this.addSmeltingRecipe(ItemManager.mysteriousIngot, ItemManager.mysticIngot,
				new ItemStack(ItemManager.fantasiumIngot), 0.2F);
		this.addSmeltingRecipe(ItemManager.tyionetiumIngot, ItemManager.toslotriumIngot,
				new ItemStack(ItemManager.scorniumIngot), 0.3F);
		this.addSmeltingRecipe(ItemManager.mithrilIngot, ItemManager.scorniumIngot,
				new ItemStack(ItemManager.extranetiumIngot), 0.5F);
		this.addSmeltingRecipe(ItemManager.fantasiumIngot, ItemManager.magicIngot,
				new ItemStack(ItemManager.mithrilIngot), 0.5F);
		this.addSmeltingRecipe(ItemManager.copperIngot, ItemManager.tinIngot, new ItemStack(ItemManager.bronzeIngot),
				0.1F);
		this.addSmeltingRecipe(ItemManager.diamondIngot, ItemManager.toslotriumIngot,
				new ItemStack(ItemManager.mysticIngot), 0.1F);
		this.addSmeltingRecipe(ItemManager.reforgedGoldIngot, ItemManager.tyionetiumIngot,
				new ItemStack(ItemManager.mysteriousIngot), 0.3F);
		this.addSmeltingRecipe(ItemManager.titaniumIngot, ItemManager.extranetiumIngot,
				new ItemStack(ItemManager.mnemiumIngot), 0.8F);
		this.addSmeltingRecipe(ItemManager.unusableMaterial, ItemManager.unusableMaterial,
				new ItemStack(ItemManager.toslotriumIngot), 0.0F);
		this.addSmeltingRecipe(ItemManager.copperIngot, ItemManager.zincIngot, new ItemStack(ItemManager.brassIngot),
				0.1F);
		this.addSmeltingRecipe(Items.GOLD_INGOT, ItemManager.silverIngot, new ItemStack(ItemManager.electrumIngot),
				0.5F);
		this.addSmeltingRecipe(ItemManager.brightflameIngot, ItemManager.brightsteelIngot,
				new ItemStack(ItemManager.unusableMaterial), 0.0F);
		this.addSmeltingRecipe(ItemManager.brightflameIngot, ItemManager.platinumIngot,
				new ItemStack(ItemManager.laeniumIngot), 0.1F);
		this.addSmeltingRecipe(ItemManager.brightsteelIngot, ItemManager.platinumIngot,
				new ItemStack(ItemManager.laeniumIngot), 0.1F);
		this.addSmeltingRecipe(ItemManager.laeniumIngot, ItemManager.brightflameIngot,
				new ItemStack(ItemManager.unusableMaterial, 2), 0.0F);
		this.addSmeltingRecipe(ItemManager.laeniumIngot, ItemManager.brightsteelIngot,
				new ItemStack(ItemManager.unusableMaterial, 2), 0.0F);
		this.addSmeltingRecipe(Items.IRON_INGOT, Items.GOLD_INGOT, new ItemStack(ItemManager.magneiumIngot), 0.3F);
		this.addSmeltingRecipe(ItemManager.toslotriumIngot, ItemManager.toslotriumIngot,
				new ItemStack(ItemManager.unusableMaterial), 0.0F);
		this.addSmeltingRecipe(ItemManager.magneiumIngot, ItemManager.fantasiumIngot,
				new ItemStack(ItemManager.unusableMaterial), 0.0F);
	}

	public void addSmeltingRecipe(Item input1, Item input2, ItemStack stack, float experience) {
		this.addSmelting(new ItemStack[] { new ItemStack(input1), new ItemStack(input2) }, stack, experience);
		this.addSmelting(new ItemStack[] { new ItemStack(input2), new ItemStack(input1) }, stack, experience);
	}

	public void addSmeltingRecipe(ItemStack[] input, ItemStack stack, float experience) {
		this.addSmelting(input, stack, experience);
	}

	public void addSmelting(ItemStack[] items, ItemStack result, float experience) {
		if (metaRecipeList.containsKey(items)) {
			TheStuffExtension.logWarn(
					"Conflicting recipe: " + items.toString() + " for " + metaRecipeList.get(items).toString());
		} else {
			metaRecipeList.put(items, result);
			metaExperience.put(items, Float.valueOf(experience));
		}
	}

	public static boolean matchesIngredient(ItemStack itemstack) {
		Item it = itemstack.getItem();
		if (it == ItemManager.mysteriousIngot || it == Items.IRON_INGOT || it == ItemManager.laeniumIngot
				|| it == ItemManager.platinumIngot || it == ItemManager.brightflameIngot
				|| it == ItemManager.brightsteelIngot || it == ItemManager.zincIngot || it == Items.GOLD_INGOT
				|| it == ItemManager.silverIngot || it == ItemManager.mysticIngot || it == ItemManager.tyionetiumIngot
				|| it == ItemManager.toslotriumIngot || it == ItemManager.mithrilIngot
				|| it == ItemManager.scorniumIngot || it == ItemManager.fantasiumIngot || it == ItemManager.magicIngot
				|| it == ItemManager.copperIngot || it == ItemManager.tinIngot || it == ItemManager.diamondIngot
				|| it == ItemManager.reforgedGoldIngot || it == ItemManager.titaniumIngot
				|| it == ItemManager.extranetiumIngot || it == ItemManager.unusableMaterial
				|| it == ItemManager.magneiumIngot)
			return true;
		return false;
	}

	public float getExperience(ItemStack item) {
		if (item.isEmpty()) {
			return 0;
		}
		float ret = -1;
		if (ret < 0 && metaExperience.containsKey(new ItemStack[] { item })) {
			ret = metaExperience.get(new ItemStack[] { item });
		}

		return (ret < 0 ? 0 : ret);
	}

	public ItemStack getSmeltingResult(ItemStack item1, ItemStack item2) {
		for (Entry<ItemStack[], ItemStack> entry : this.metaRecipeList.entrySet()) {
			if (this.compareItemStacks(new ItemStack[] { item1, item2 }, entry.getKey())) {
				return entry.getValue();
			}

		}
		return ItemStack.EMPTY;
	}

	private boolean compareItemStacks(ItemStack[] stack1, ItemStack[] stack2) {
		if (stack1.length != stack2.length) {
			return false;
		} else {
			for (int i = 0; i < stack1.length; i++)
				if (stack1[i].getItem() != stack2[i].getItem() || stack1[i].getMetadata() != stack2[i].getMetadata()) {
					return false;
				}
			return true;
		}
	}

	public Map<ItemStack[], ItemStack> getMetaRecipeList() {
		return metaRecipeList;
	}

}
