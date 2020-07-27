package com.tse.common.world.item.recipe;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;
import com.tse.common.config.Config;
import com.tse.common.core.TheStuffExtension;
import com.tse.common.gui.tileentity.TileEntityAlloyFurnace;
import com.tse.common.world.block.BlockManager;
import com.tse.common.world.item.ItemManager;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.oredict.OreDictionary;

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
		
		this.addOreSmeltingRecipe("ingotMysterious", "ingotMystic", new ItemStack(ItemManager.fantasiumIngot, 2), 0.2F);
		this.addOreSmeltingRecipe("ingotTyionetium", "ingotToslotrium", new ItemStack(ItemManager.scorniumIngot, 2), 0.3F);
		this.addOreSmeltingRecipe("ingotMithril", "ingotScornium", new ItemStack(ItemManager.extranetiumIngot, 2), 0.5F);
		this.addOreSmeltingRecipe("ingotFantasium", "ingotMagic", new ItemStack(ItemManager.mithrilIngot, 2), 0.5F);
		this.addOreSmeltingRecipe("ingotCopper", "ingotTin", new ItemStack(ItemManager.bronzeIngot, 2), 0.1F);
		this.addOreSmeltingRecipe("ingotDiamond", "ingotToslotrium", new ItemStack(ItemManager.mysticIngot, 2), 0.1F);
		this.addOreSmeltingRecipe("ingotGoldReforged", "ingotTyionetium", new ItemStack(ItemManager.mysteriousIngot, 2), 0.3F);
		this.addOreSmeltingRecipe("ingotTitanium", "ingotExtranetium", new ItemStack(ItemManager.mnemiumIngot, 2), 0.8F);
		this.addOreSmeltingRecipe("ingotCopper", "ingotZinc", new ItemStack(ItemManager.brassIngot, 2), 0.1F);
		this.addOreSmeltingRecipe("ingotGold", "ingotSilver", new ItemStack(ItemManager.electrumIngot, 2), 0.5F);
		this.addOreSmeltingRecipe("ingotBrightflame", "ingotPlatinum", new ItemStack(ItemManager.laeniumIngot, 2), 0.1F);
		this.addOreSmeltingRecipe("ingotBrightsteel", "ingotPlatinum", new ItemStack(ItemManager.laeniumIngot, 2), 0.1F);
		this.addOreSmeltingRecipe("ingotIron", "ingotGold", new ItemStack(ItemManager.magneiumIngot, 2), 0.3F);
		this.addOreSmeltingRecipe("ingotEternium", "ingotImmortalium", new ItemStack(ItemManager.maduumIngot, 2), 0.0F);
		this.addOreSmeltingRecipe("ingotMaduum", "ingotMaduum", new ItemStack(ItemManager.maduumIngot, 2), 0.0F);
		this.addOreSmeltingRecipe("ingotToslotrium", "ingotFantasium", new ItemStack(ItemManager.magicIngot, 2), 0.3F);
		this.addOreSmeltingRecipe("ingotManyullyn", "ingotMagic", new ItemStack(ItemManager.dreamIngot, 2), 1.0F);
		
		this.addSmeltingRecipe(ItemManager.unusableMaterial, ItemManager.unusableMaterial, new ItemStack(ItemManager.toslotriumIngot), 0.0F);
		if(!Config.easySteel)
		{
			this.addSmeltingRecipe(Items.COAL, Items.IRON_INGOT, new ItemStack(ItemManager.steelIngot), 0.1F);
			this.addSmeltingRecipe(Item.getItemFromBlock(Blocks.COAL_BLOCK), Item.getItemFromBlock(Blocks.IRON_BLOCK), new ItemStack(Item.getItemFromBlock(BlockManager.steelBlock)), 0.9F);
		}
		if(!Config.easyReforgedGold)
		{
			this.addSmeltingRecipe(Items.COAL, Items.GOLD_INGOT, new ItemStack(ItemManager.reforgedGoldIngot), 0.1F);
			this.addSmeltingRecipe(Item.getItemFromBlock(Blocks.COAL_BLOCK), Item.getItemFromBlock(Blocks.GOLD_BLOCK), new ItemStack(Item.getItemFromBlock(BlockManager.reforgedGoldBlock)), 0.9F);
		}
	}

	public void addSmeltingRecipe(Item input1, Item input2, ItemStack stack, float experience) {
		this.addSmelting(new ItemStack[] { new ItemStack(input1), new ItemStack(input2) }, stack, experience);
		this.addSmelting(new ItemStack[] { new ItemStack(input2), new ItemStack(input1) }, stack, experience);
	}
	
	public void addOreSmeltingRecipe(String string1, String string2, ItemStack stack, float experience)
	{
		NonNullList<ItemStack> input1 = OreDictionary.getOres(string1);
		NonNullList<ItemStack> input2 = OreDictionary.getOres(string2);
		if(input1.size() == 0 || input2.size() == 0) 
		{
			TheStuffExtension.log("Could not create recipe with " + string1 + " and " + string2 + ".");
			return;
		}
		addSmeltingRecipe(input1, input2, stack, experience);
	}
	
	public void addSmeltingRecipe(NonNullList<ItemStack> input1, NonNullList<ItemStack> input2, ItemStack stack, float experience)
	{
		for(ItemStack i: input1)
		{
			for(ItemStack j: input2)
			{
				this.addSmelting(new ItemStack[] {i, j}, stack, experience);
				this.addSmelting(new ItemStack[] {j, i}, stack, experience);
			}
		}
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
		if(TileEntityAlloyFurnace.isItemFuel(itemstack) && itemstack.getItem() != Items.COAL)
		{
			return false;
		}
		else
		{
		
			return true;
		}
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
