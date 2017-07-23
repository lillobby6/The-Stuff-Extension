package com.tse.item;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

import com.tse.main.core.TheStuffExtension;
import com.tse.main.lib.StringsLib;

public class ItemRenderRegister {
	public static void registerItemRenderer()
	{
		TheStuffExtension.log("Rendering items...");
		reg(ItemManager.exaltedDiamond);
	    reg(ItemManager.bloodDiamond);
	    reg(ItemManager.terraDiamond);
	    reg(ItemManager.lunaDiamond);
	    
	    reg(ItemManager.ironRod);
	    reg(ItemManager.steelRod);
	    reg(ItemManager.bronzeRod);
	    reg(ItemManager.brassRod);
	    reg(ItemManager.titaniumRod);
	    
	    reg(ItemManager.sphaleriteGem);
	    
	    reg(ItemManager.copperIngot);
	    reg(ItemManager.copperAxe);
	    reg(ItemManager.copperPickaxe);
	    reg(ItemManager.copperShovel);
	    reg(ItemManager.copperSword);
	    reg(ItemManager.copperHoe);
	    
	    reg(ItemManager.bronzePickaxe);
	    reg(ItemManager.bronzeAxe);
	    reg(ItemManager.bronzeMattock);
	    reg(ItemManager.bronzeShovel);
	    reg(ItemManager.bronzeHoe);
	    
	    reg(ItemManager.bronzeHelmet);
	    reg(ItemManager.bronzeChestplate);
	    reg(ItemManager.bronzeLeggings);
	    reg(ItemManager.bronzeBoots);
	    
	    reg(ItemManager.bronzeNugget);
	    
	    reg(ItemManager.lapisRemover);
	    
	    reg(ItemManager.steelIngot);
	    
	    reg(ItemManager.stoneMattock);
	    
	    reg(ItemManager.copperMattock);
	    
	    reg(ItemManager.copperHelmet);
	    reg(ItemManager.copperChestplate);
	    reg(ItemManager.copperLeggings);
	    reg(ItemManager.copperBoots);
	    
	    reg(ItemManager.extranetiumAxe);
	    reg(ItemManager.extranetiumHoe);
	    reg(ItemManager.extranetiumMattock);
	    reg(ItemManager.extranetiumPickaxe);
	    reg(ItemManager.extranetiumShovel);
	    reg(ItemManager.extranetiumSword);
	    
	    reg(ItemManager.ironMattock);
	    reg(ItemManager.woodMattock);
	    reg(ItemManager.goldMattock);
	    reg(ItemManager.diamondMattock);
	    
	    reg(ItemManager.terraDiamondPickaxe);
	    reg(ItemManager.terraDiamondAxe);
	    reg(ItemManager.terraDiamondShovel);
	    reg(ItemManager.terraDiamondHoe);
	    reg(ItemManager.terraDiamondMattock);
	    reg(ItemManager.terraDiamondSword);
	    reg(ItemManager.terraDiamondHelmet);
	    reg(ItemManager.terraDiamondChestplate);
	    reg(ItemManager.terraDiamondLeggings);
	    reg(ItemManager.terraDiamondBoots);
	    
	    reg(ItemManager.tinIngot);
	    reg(ItemManager.eterniumIngot);
	    reg(ItemManager.tyionetiumIngot);
	    
	    reg(ItemManager.tyionetiumPickaxe);
	    reg(ItemManager.tyionetiumAxe);
	    reg(ItemManager.tyionetiumShovel);
	    reg(ItemManager.tyionetiumHoe);
	    reg(ItemManager.tyionetiumMattock);
	    reg(ItemManager.tyionetiumSword);
	    
	    reg(ItemManager.mnemiumPickaxe);
	    reg(ItemManager.mnemiumAxe);
	    reg(ItemManager.mnemiumShovel);
	    reg(ItemManager.mnemiumHoe);
	    reg(ItemManager.mnemiumMattock);
	    reg(ItemManager.mnemiumSword);
	    
	    reg(ItemManager.bronzeIngot);
	    reg(ItemManager.brightflameIngot);
	    reg(ItemManager.brightsteelIngot);
	    reg(ItemManager.diamondIngot);
	    reg(ItemManager.reforgedGoldIngot);
	    reg(ItemManager.magicIngot);
	    reg(ItemManager.mithrilIngot);
	    reg(ItemManager.mortiumIngot);
	    reg(ItemManager.mysteriousIngot);
	    reg(ItemManager.mysticIngot);
	    reg(ItemManager.skyIronIngot);
	    reg(ItemManager.terriumIngot);
	    reg(ItemManager.toslotriumIngot);
	    reg(ItemManager.vividiumIngot);
	    reg(ItemManager.extranetiumIngot);
	    reg(ItemManager.silverIngot);
	    reg(ItemManager.platinumIngot);
	    reg(ItemManager.titaniumIngot);
	    reg(ItemManager.zincIngot);
	    reg(ItemManager.brassIngot);
	    reg(ItemManager.leadIngot);
	    reg(ItemManager.nickelIngot);
	    reg(ItemManager.pewterIngot);
	    reg(ItemManager.aluminumIngot);
	    reg(ItemManager.mnemiumIngot);
	    
	    reg(ItemManager.justice);
	    reg(ItemManager.corruption);
	    reg(ItemManager.destruction);
	    
	    reg(ItemManager.brightflamePickaxe);
	    reg(ItemManager.brightflameAxe);
	    reg(ItemManager.brightflameHoe);
	    reg(ItemManager.brightflameShovel);
	    reg(ItemManager.brightflameMattock);
	    reg(ItemManager.brightflameSword);
	    reg(ItemManager.brightflameHelmet);
	    reg(ItemManager.brightflameChestplate);
	    reg(ItemManager.brightflameLeggings);
	    reg(ItemManager.brightflameBoots);
	    
	    reg(ItemManager.goldenStick);
	    reg(ItemManager.diamondStick);
	    reg(ItemManager.mysticStick);
	    reg(ItemManager.magicSword);
	    reg(ItemManager.mithrilSword);
	    
	    reg(ItemManager.mortiumSword);
	    reg(ItemManager.mysteriousSword);
	    reg(ItemManager.mysticSword);
	    reg(ItemManager.skyIronSword);
	    reg(ItemManager.terriumSword);
	    reg(ItemManager.vividiumSword);
	    reg(ItemManager.bronzeSword);
	    
	    reg(ItemManager.magicPickaxe);
	    reg(ItemManager.magicAxe);
	    reg(ItemManager.magicHoe);
	    reg(ItemManager.magicShovel);
	    reg(ItemManager.magicMattock);
	    
	    reg(ItemManager.mortiumPickaxe);
	    reg(ItemManager.mortiumAxe);
	    reg(ItemManager.mortiumShovel);
	    reg(ItemManager.mortiumHoe);
	    reg(ItemManager.mortiumSword);
	    reg(ItemManager.mortiumMattock);
	    
	    reg(ItemManager.mithrilPickaxe);
	    reg(ItemManager.mithrilAxe);
	    reg(ItemManager.mithrilShovel);
	    reg(ItemManager.mithrilHoe);
	    reg(ItemManager.mithrilMattock);
	    reg(ItemManager.mithrilSword);
	    
	    reg(ItemManager.mysteriousPickaxe);
	    reg(ItemManager.mysteriousAxe);
	    reg(ItemManager.mysteriousShovel);
	    reg(ItemManager.mysteriousHoe);
	    reg(ItemManager.mysteriousMattock);
	    reg(ItemManager.mysteriousSword);
	    
	    reg(ItemManager.mysticPickaxe);
	    reg(ItemManager.mysticAxe);
	    reg(ItemManager.mysticShovel);
	    reg(ItemManager.mysticHoe);
	    reg(ItemManager.mysticMattock);
	    reg(ItemManager.mysticSword);
	    
	    reg(ItemManager.skyIronPickaxe);
	    reg(ItemManager.skyIronAxe);
	    reg(ItemManager.skyIronShovel);
	    reg(ItemManager.skyIronMattock);
	    reg(ItemManager.skyIronHoe);
	    
	    reg(ItemManager.terriumPickaxe);
	    reg(ItemManager.terriumAxe);
	    reg(ItemManager.terriumShovel);
	    reg(ItemManager.terriumHoe);
	    reg(ItemManager.terriumMattock);
	    
	    reg(ItemManager.brightsteelPickaxe);
	    reg(ItemManager.brightsteelAxe);
	    reg(ItemManager.brightsteelHoe);
	    reg(ItemManager.brightsteelShovel);
	    reg(ItemManager.brightsteelMattock);
	    reg(ItemManager.brightsteelSword);
	    
	    reg(ItemManager.vividiumPickaxe);
	    reg(ItemManager.vividiumAxe);
	    reg(ItemManager.vividiumShovel);
	    reg(ItemManager.vividiumHoe);
	    reg(ItemManager.vividiumMattock);
	    
	    reg(ItemManager.steelPickaxe);
	    reg(ItemManager.steelAxe);
	    reg(ItemManager.steelShovel);
	    reg(ItemManager.steelHoe);
	    reg(ItemManager.steelMattock);
	    reg(ItemManager.steelSword);
	    
	    reg(ItemManager.silverPickaxe);
	    reg(ItemManager.silverAxe);
	    reg(ItemManager.silverShovel);
	    reg(ItemManager.silverHoe);
	    reg(ItemManager.silverMattock);
	    reg(ItemManager.silverSword);
	    
	    reg(ItemManager.exaltedDiamondPickaxe);
	    reg(ItemManager.exaltedDiamondAxe);
	    reg(ItemManager.exaltedDiamondShovel);
	    reg(ItemManager.exaltedDiamondHoe);
	    reg(ItemManager.exaltedDiamondMattock);
	    reg(ItemManager.exaltedDiamondSword);
	    
	    reg(ItemManager.bloodDiamondPickaxe);
	    reg(ItemManager.bloodDiamondAxe);
	    reg(ItemManager.bloodDiamondShovel);
	    reg(ItemManager.bloodDiamondHoe);
	    reg(ItemManager.bloodDiamondMattock);
	    reg(ItemManager.bloodDiamondSword);
	    
	    reg(ItemManager.platinumPickaxe);
	    reg(ItemManager.platinumAxe);
	    reg(ItemManager.platinumShovel);
	    reg(ItemManager.platinumHoe);
	    reg(ItemManager.platinumMattock);
	    reg(ItemManager.platinumSword);
	    
	    reg(ItemManager.tinPickaxe);
	    reg(ItemManager.tinAxe);
	    reg(ItemManager.tinShovel);
	    reg(ItemManager.tinHoe);
	    reg(ItemManager.tinMattock);
	    reg(ItemManager.tinSword);
	    
	    reg(ItemManager.pewterPickaxe);
	    reg(ItemManager.pewterAxe);
	    reg(ItemManager.pewterShovel);
	    reg(ItemManager.pewterHoe);
	    reg(ItemManager.pewterMattock);
	    reg(ItemManager.pewterSword);
	    
	    reg(ItemManager.titaniumPickaxe);
	    reg(ItemManager.titaniumAxe);
	    reg(ItemManager.titaniumShovel);
	    reg(ItemManager.titaniumHoe);
	    reg(ItemManager.titaniumMattock);
	    reg(ItemManager.titaniumSword);
	    
	    reg(ItemManager.aluminumPickaxe);
	    reg(ItemManager.aluminumAxe);
	    reg(ItemManager.aluminumShovel);
	    reg(ItemManager.aluminumHoe);
	    reg(ItemManager.aluminumMattock);
	    reg(ItemManager.aluminumSword);
	    
	    reg(ItemManager.magicNugget);
	    reg(ItemManager.mixedIngot);
	    reg(ItemManager.mysticNugget);
	    reg(ItemManager.mysteriousNugget);
	    reg(ItemManager.brightflameNugget);
	    reg(ItemManager.diamondNugget);
	    reg(ItemManager.brassNugget);
	    reg(ItemManager.silverNugget);
	    reg(ItemManager.platinumNugget);
	    reg(ItemManager.titaniumNugget);
	    reg(ItemManager.steelNugget);
	    
	    reg(ItemManager.diamondToslotriumMixedIngot);
	    reg(ItemManager.tyionetiumMithrilToslotriumMixedIngot);
	    reg(ItemManager.reforgedGoldTyionetiumMixedIngot);
	    reg(ItemManager.titaniumMysticMixedIngot);
	    reg(ItemManager.titaniumExtranetiumMixedIngot);
	    
	    reg(ItemManager.brightsteelHelmet);
	    reg(ItemManager.brightsteelChestplate);
	    reg(ItemManager.brightsteelLeggings);
	    reg(ItemManager.brightsteelBoots);
	    
	    reg(ItemManager.tinHelmet);
	    reg(ItemManager.tinChestplate);
	    reg(ItemManager.tinLeggings);
	    reg(ItemManager.tinBoots);
	    
	    reg(ItemManager.magicHelmet);
	    reg(ItemManager.magicChestplate);
	    reg(ItemManager.magicLeggings);
	    reg(ItemManager.magicBoots);
	    
	    reg(ItemManager.mithrilHelmet);
	    reg(ItemManager.mithrilChestplate);
	    reg(ItemManager.mithrilLeggings);
	    reg(ItemManager.mithrilBoots);
	    
	    reg(ItemManager.mortiumHelmet);
	    reg(ItemManager.mortiumChestplate);
	    reg(ItemManager.mortiumLeggings);
	    reg(ItemManager.mortiumBoots);
	    
	    reg(ItemManager.steelHelmet);
	    reg(ItemManager.steelChestplate);
	    reg(ItemManager.steelLeggings);
	    reg(ItemManager.steelBoots);
	    
	    reg(ItemManager.titaniumHelmet);
	    reg(ItemManager.titaniumChestplate);
	    reg(ItemManager.titaniumLeggings);
	    reg(ItemManager.titaniumBoots);
	    
	    reg(ItemManager.extranetiumHelmet);
	    reg(ItemManager.extranetiumChestplate);
	    reg(ItemManager.extranetiumLeggings);
	    reg(ItemManager.extranetiumBoots);
	    
	    reg(ItemManager.mysteriousHelmet);
	    reg(ItemManager.mysteriousChestplate);
	    reg(ItemManager.mysteriousLeggings);
	    reg(ItemManager.mysteriousBoots);
	    
	    reg(ItemManager.mysticHelmet);
	    reg(ItemManager.mysticChestplate);
	    reg(ItemManager.mysticLeggings);
	    reg(ItemManager.mysticBoots);
	    
	    reg(ItemManager.bloodDiamondHelmet);
	    reg(ItemManager.bloodDiamondChestplate);
	    reg(ItemManager.bloodDiamondLeggings);
	    reg(ItemManager.bloodDiamondBoots);
	    TheStuffExtension.log("Rendered items.");
	}
	public static void reg(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher() .register(item, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(StringsLib.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));	
	}
}
