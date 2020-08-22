package com.tse.common.world.item;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.core.library.StringsLib;

public class ItemRenderRegister {
	public static void registerItemRenderer() {
		TheStuffExtension.log("Rendering items...");
		reg(ItemManager.exaltedDiamond);
		reg(ItemManager.bloodDiamond);
		reg(ItemManager.terraDiamond);
		reg(ItemManager.lunaDiamond);
		reg(ItemManager.solDiamond);
		
		reg(ItemManager.unusableMaterial);
		
		reg(ItemManager.brightflameStick);
		reg(ItemManager.brightsteelStick);
		reg(ItemManager.reforgedGoldStick);
		reg(ItemManager.magicStick);
		reg(ItemManager.mithrilStick);
		reg(ItemManager.mysteriousStick);
		reg(ItemManager.extranetiumStick);
		reg(ItemManager.eterniumStick);
		reg(ItemManager.fantasiumStick);
		reg(ItemManager.scorniumStick);
		reg(ItemManager.electrumStick);
		reg(ItemManager.laeniumStick);
		reg(ItemManager.magneiumStick);
		reg(ItemManager.sterlingSilverStick);
		reg(ItemManager.roseGoldStick);
		reg(ItemManager.whiteGoldStick);
		reg(ItemManager.spangoldStick);
		reg(ItemManager.maduumStick);
		reg(ItemManager.immortaliumStick);
		
		reg(ItemManager.ironRod);
		reg(ItemManager.steelRod);
		reg(ItemManager.bronzeRod);
		reg(ItemManager.brassRod);
		reg(ItemManager.titaniumRod);
		reg(ItemManager.copperRod);
		reg(ItemManager.tinRod);
		reg(ItemManager.tyionetiumRod);
		reg(ItemManager.mortiumRod);
		reg(ItemManager.skyIronRod);
		reg(ItemManager.terriumRod);
		reg(ItemManager.toslotriumRod);
		reg(ItemManager.vividiumRod);
		reg(ItemManager.silverRod);
		reg(ItemManager.platinumRod);
		reg(ItemManager.zincRod);
		reg(ItemManager.leadRod);
		reg(ItemManager.nickelRod);
		reg(ItemManager.pewterRod);
		reg(ItemManager.aluminumRod);
		reg(ItemManager.mnemiumRod);
		reg(ItemManager.meteoricIronRod);
		
		reg(ItemManager.woodenGear);

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
		reg(ItemManager.scorniumIngot);
		reg(ItemManager.fantasiumIngot);
		reg(ItemManager.laeniumIngot);
		reg(ItemManager.magneiumIngot);
		reg(ItemManager.electrumIngot);
		reg(ItemManager.sterlingSilverIngot);
		reg(ItemManager.roseGoldIngot);
		reg(ItemManager.whiteGoldIngot);
		reg(ItemManager.spangoldIngot);
		reg(ItemManager.meteoricIronIngot);
		reg(ItemManager.maduumIngot);
		reg(ItemManager.immortaliumIngot);
		reg(ItemManager.everbrightIngot);

		reg(ItemManager.justice);
		reg(ItemManager.corruption);
		reg(ItemManager.destruction);
		reg(ItemManager.creation);

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

		reg(ItemManager.eterniumPickaxe);
		reg(ItemManager.eterniumAxe);
		reg(ItemManager.eterniumShovel);
		reg(ItemManager.eterniumHoe);
		reg(ItemManager.eterniumMattock);
		reg(ItemManager.eterniumSword);

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
		reg(ItemManager.mysticNugget);
		reg(ItemManager.mysteriousNugget);
		reg(ItemManager.brightflameNugget);
		reg(ItemManager.diamondNugget);
		reg(ItemManager.brassNugget);
		reg(ItemManager.silverNugget);
		reg(ItemManager.platinumNugget);
		reg(ItemManager.titaniumNugget);
		reg(ItemManager.steelNugget);
		reg(ItemManager.copperNugget);
		reg(ItemManager.tinNugget);
		reg(ItemManager.tyionetiumNugget);
		reg(ItemManager.brightsteelNugget);
		reg(ItemManager.reforgedGoldNugget);
		reg(ItemManager.mithrilNugget);
		reg(ItemManager.mortiumNugget);
		reg(ItemManager.skyIronNugget);
		reg(ItemManager.terriumNugget);
		reg(ItemManager.toslotriumNugget);
		reg(ItemManager.vividiumNugget);
		reg(ItemManager.extranetiumNugget);
		reg(ItemManager.zincNugget);
		reg(ItemManager.leadNugget);
		reg(ItemManager.nickelNugget);
		reg(ItemManager.pewterNugget);
		reg(ItemManager.aluminumNugget);
		reg(ItemManager.mnemiumNugget);
		reg(ItemManager.eterniumNugget);
		reg(ItemManager.fantasiumNugget);
		reg(ItemManager.scorniumNugget);
		reg(ItemManager.electrumNugget);
		reg(ItemManager.laeniumNugget);
		reg(ItemManager.magneiumNugget);
		reg(ItemManager.sterlingSilverNugget);
		reg(ItemManager.roseGoldNugget);
		reg(ItemManager.whiteGoldNugget);
		reg(ItemManager.spangoldNugget);
		reg(ItemManager.meteoricIronNugget);
		reg(ItemManager.maduumNugget);
		reg(ItemManager.immortaliumNugget);
		reg(ItemManager.everbrightNugget);
		
		reg(ItemManager.meteoricIronShard);
		reg(ItemManager.everbrightShard);

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

		reg(ItemManager.skyIronHelmet);
		reg(ItemManager.skyIronChestplate);
		reg(ItemManager.skyIronLeggings);
		reg(ItemManager.skyIronBoots);

		reg(ItemManager.vividiumHelmet);
		reg(ItemManager.vividiumChestplate);
		reg(ItemManager.vividiumLeggings);
		reg(ItemManager.vividiumBoots);

		reg(ItemManager.tyionetiumHelmet);
		reg(ItemManager.tyionetiumChestplate);
		reg(ItemManager.tyionetiumLeggings);
		reg(ItemManager.tyionetiumBoots);

		reg(ItemManager.silverHelmet);
		reg(ItemManager.silverChestplate);
		reg(ItemManager.silverLeggings);
		reg(ItemManager.silverBoots);

		reg(ItemManager.exaltedDiamondHelmet);
		reg(ItemManager.exaltedDiamondChestplate);
		reg(ItemManager.exaltedDiamondLeggings);
		reg(ItemManager.exaltedDiamondBoots);

		reg(ItemManager.platinumHelmet);
		reg(ItemManager.platinumChestplate);
		reg(ItemManager.platinumLeggings);
		reg(ItemManager.platinumBoots);

		reg(ItemManager.pewterHelmet);
		reg(ItemManager.pewterChestplate);
		reg(ItemManager.pewterLeggings);
		reg(ItemManager.pewterBoots);

		reg(ItemManager.mnemiumHelmet);
		reg(ItemManager.mnemiumChestplate);
		reg(ItemManager.mnemiumLeggings);
		reg(ItemManager.mnemiumBoots);

		reg(ItemManager.aluminumHelmet);
		reg(ItemManager.aluminumChestplate);
		reg(ItemManager.aluminumLeggings);
		reg(ItemManager.aluminumBoots);

		reg(ItemManager.eterniumHelmet);
		reg(ItemManager.eterniumChestplate);
		reg(ItemManager.eterniumLeggings);
		reg(ItemManager.eterniumBoots);
		
		reg(ItemManager.reforgedGoldHelmet);
		reg(ItemManager.reforgedGoldChestplate);
		reg(ItemManager.reforgedGoldLeggings);
		reg(ItemManager.reforgedGoldBoots);
		
		reg(ItemManager.nickelHelmet);
		reg(ItemManager.nickelChestplate);
		reg(ItemManager.nickelLeggings);
		reg(ItemManager.nickelBoots);
		
		reg(ItemManager.brassHelmet);
		reg(ItemManager.brassChestplate);
		reg(ItemManager.brassLeggings);
		reg(ItemManager.brassBoots);
		
		reg(ItemManager.leadHelmet);
		reg(ItemManager.leadChestplate);
		reg(ItemManager.leadLeggings);
		reg(ItemManager.leadBoots);
		
		reg(ItemManager.zincHelmet);
		reg(ItemManager.zincChestplate);
		reg(ItemManager.zincLeggings);
		reg(ItemManager.zincBoots);
		
		reg(ItemManager.fantasiumHelmet);
		reg(ItemManager.fantasiumChestplate);
		reg(ItemManager.fantasiumLeggings);
		reg(ItemManager.fantasiumBoots);
		
		reg(ItemManager.electrumHelmet);
		reg(ItemManager.electrumChestplate);
		reg(ItemManager.electrumLeggings);
		reg(ItemManager.electrumBoots);
		
		reg(ItemManager.laeniumHelmet);
		reg(ItemManager.laeniumChestplate);
		reg(ItemManager.laeniumLeggings);
		reg(ItemManager.laeniumBoots);
		
		reg(ItemManager.magneiumHelmet);
		reg(ItemManager.magneiumChestplate);
		reg(ItemManager.magneiumLeggings);
		reg(ItemManager.magneiumBoots);
		
		reg(ItemManager.sterlingSilverHelmet);
		reg(ItemManager.sterlingSilverChestplate);
		reg(ItemManager.sterlingSilverLeggings);
		reg(ItemManager.sterlingSilverBoots);
		
		reg(ItemManager.roseGoldHelmet);
		reg(ItemManager.roseGoldChestplate);
		reg(ItemManager.roseGoldLeggings);
		reg(ItemManager.roseGoldBoots);
		
		reg(ItemManager.whiteGoldHelmet);
		reg(ItemManager.whiteGoldChestplate);
		reg(ItemManager.whiteGoldLeggings);
		reg(ItemManager.whiteGoldBoots);
		
		reg(ItemManager.spangoldHelmet);
		reg(ItemManager.spangoldChestplate);
		reg(ItemManager.spangoldLeggings);
		reg(ItemManager.spangoldBoots);
		
		reg(ItemManager.meteoricIronHelmet);
		reg(ItemManager.meteoricIronChestplate);
		reg(ItemManager.meteoricIronLeggings);
		reg(ItemManager.meteoricIronBoots);
		
		reg(ItemManager.maduumHelmet);
		reg(ItemManager.maduumChestplate);
		reg(ItemManager.maduumLeggings);
		reg(ItemManager.maduumBoots);
		
		reg(ItemManager.immortaliumHelmet);
		reg(ItemManager.immortaliumChestplate);
		reg(ItemManager.immortaliumLeggings);
		reg(ItemManager.immortaliumBoots);
		
		reg(ItemManager.reforgedGoldAxe);
		reg(ItemManager.reforgedGoldHoe);
		reg(ItemManager.reforgedGoldMattock);
		reg(ItemManager.reforgedGoldPickaxe);
		reg(ItemManager.reforgedGoldShovel);
		reg(ItemManager.reforgedGoldSword);
		
		reg(ItemManager.zincAxe);
		reg(ItemManager.zincHoe);
		reg(ItemManager.zincMattock);
		reg(ItemManager.zincPickaxe);
		reg(ItemManager.zincShovel);
		reg(ItemManager.zincSword);
		
		reg(ItemManager.brassAxe);
		reg(ItemManager.brassHoe);
		reg(ItemManager.brassMattock);
		reg(ItemManager.brassPickaxe);
		reg(ItemManager.brassShovel);
		reg(ItemManager.brassSword);
		
		reg(ItemManager.leadAxe);
		reg(ItemManager.leadHoe);
		reg(ItemManager.leadMattock);
		reg(ItemManager.leadPickaxe);
		reg(ItemManager.leadShovel);
		reg(ItemManager.leadSword);
		
		reg(ItemManager.nickelAxe);
		reg(ItemManager.nickelHoe);
		reg(ItemManager.nickelMattock);
		reg(ItemManager.nickelPickaxe);
		reg(ItemManager.nickelShovel);
		reg(ItemManager.nickelSword);
		
		reg(ItemManager.fantasiumAxe);
		reg(ItemManager.fantasiumHoe);
		reg(ItemManager.fantasiumMattock);
		reg(ItemManager.fantasiumPickaxe);
		reg(ItemManager.fantasiumShovel);
		reg(ItemManager.fantasiumSword);
		
		reg(ItemManager.scorniumAxe);
		reg(ItemManager.scorniumHoe);
		reg(ItemManager.scorniumMattock);
		reg(ItemManager.scorniumPickaxe);
		reg(ItemManager.scorniumShovel);
		reg(ItemManager.scorniumSword);
		
		reg(ItemManager.electrumAxe);
		reg(ItemManager.electrumHoe);
		reg(ItemManager.electrumMattock);
		reg(ItemManager.electrumPickaxe);
		reg(ItemManager.electrumShovel);
		reg(ItemManager.electrumSword);
		
		reg(ItemManager.laeniumAxe);
		reg(ItemManager.laeniumHoe);
		reg(ItemManager.laeniumMattock);
		reg(ItemManager.laeniumPickaxe);
		reg(ItemManager.laeniumShovel);
		reg(ItemManager.laeniumSword);
		
		reg(ItemManager.magneiumAxe);
		reg(ItemManager.magneiumHoe);
		reg(ItemManager.magneiumMattock);
		reg(ItemManager.magneiumPickaxe);
		reg(ItemManager.magneiumShovel);
		reg(ItemManager.magneiumSword);
		
		reg(ItemManager.sterlingSilverAxe);
		reg(ItemManager.sterlingSilverHoe);
		reg(ItemManager.sterlingSilverMattock);
		reg(ItemManager.sterlingSilverPickaxe);
		reg(ItemManager.sterlingSilverShovel);
		reg(ItemManager.sterlingSilverSword);
		
		reg(ItemManager.roseGoldAxe);
		reg(ItemManager.roseGoldHoe);
		reg(ItemManager.roseGoldMattock);
		reg(ItemManager.roseGoldPickaxe);
		reg(ItemManager.roseGoldShovel);
		reg(ItemManager.roseGoldSword);
		
		reg(ItemManager.whiteGoldAxe);
		reg(ItemManager.whiteGoldHoe);
		reg(ItemManager.whiteGoldMattock);
		reg(ItemManager.whiteGoldPickaxe);
		reg(ItemManager.whiteGoldShovel);
		reg(ItemManager.whiteGoldSword);
		
		reg(ItemManager.spangoldAxe);
		reg(ItemManager.spangoldHoe);
		reg(ItemManager.spangoldMattock);
		reg(ItemManager.spangoldPickaxe);
		reg(ItemManager.spangoldShovel);
		reg(ItemManager.spangoldSword);
		
		reg(ItemManager.meteoricIronAxe);
		reg(ItemManager.meteoricIronHoe);
		reg(ItemManager.meteoricIronMattock);
		reg(ItemManager.meteoricIronPickaxe);
		reg(ItemManager.meteoricIronShovel);
		reg(ItemManager.meteoricIronSword);
		
		reg(ItemManager.maduumAxe);
		reg(ItemManager.maduumHoe);
		reg(ItemManager.maduumMattock);
		reg(ItemManager.maduumPickaxe);
		reg(ItemManager.maduumShovel);
		reg(ItemManager.maduumSword);
		
		reg(ItemManager.immortaliumAxe);
		reg(ItemManager.immortaliumHoe);
		reg(ItemManager.immortaliumMattock);
		reg(ItemManager.immortaliumPickaxe);
		reg(ItemManager.immortaliumShovel);
		reg(ItemManager.immortaliumSword);
		
		reg(ItemManager.terriumHelmet);
		reg(ItemManager.terriumChestplate);
		reg(ItemManager.terriumLeggings);
		reg(ItemManager.terriumBoots);
		
		reg(ItemManager.scorniumHelmet);
		reg(ItemManager.scorniumChestplate);
		reg(ItemManager.scorniumLeggings);
		reg(ItemManager.scorniumBoots);
		
		TheStuffExtension.log("Rendered items.");
	}

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(StringsLib.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
