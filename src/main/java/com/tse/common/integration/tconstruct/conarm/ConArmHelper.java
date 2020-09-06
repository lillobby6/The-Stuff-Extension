package com.tse.common.integration.tconstruct.conarm;

import com.tse.common.integration.CompatModule;
import com.tse.common.integration.tconstruct.TConstructHelper;
import com.tse.common.world.item.material.TSEArmorMaterials;

import c4.conarm.common.armor.traits.ArmorTraits;
import c4.conarm.lib.materials.ArmorMaterialType;
import c4.conarm.lib.materials.ArmorMaterials;
import c4.conarm.lib.materials.CoreMaterialStats;
import c4.conarm.lib.materials.PlatesMaterialStats;
import c4.conarm.lib.materials.TrimMaterialStats;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.Material;

public class ConArmHelper extends CompatModule{

	public void preInit() {
		
//		TinkerRegistry.addMaterialStats(TinkerMaterials.iron,
//        new CoreMaterialStats(12, 15),
//        new PlatesMaterialStats(0.85F, 5, 0),
//        new TrimMaterialStats(3.5F));
		
		Material.UNKNOWN.addStats(new CoreMaterialStats(0, 0));
		Material.UNKNOWN.addStats(new PlatesMaterialStats(1, 0, 0));
		Material.UNKNOWN.addStats(new TrimMaterialStats(0));
		
		TinkerRegistry.addMaterialStats(TConstructHelper.maduum,
				new PlatesMaterialStats(4.0F, -20, 0));
		
		addMaterialStats(TConstructHelper.tyionetium, TSEArmorMaterials.TYIONETIUM, 1.2F);
		addMaterialStats(TConstructHelper.brightflame, TSEArmorMaterials.BRIGHTFLAME, 0.1F);
		addMaterialStats(TConstructHelper.brightsteel, TSEArmorMaterials.BRIGHTSTEEL, 0.5F);
		addMaterialStats(TConstructHelper.reforgedGold, TSEArmorMaterials.REFORGEDGOLD, 1.2F);
		addMaterialStats(TConstructHelper.magic, TSEArmorMaterials.MAGIC, 0.4F);
		addMaterialStats(TConstructHelper.manatheum, TSEArmorMaterials.MANATHEUM, 0.2F);
		addMaterialStats(TConstructHelper.mortium, TSEArmorMaterials.MORTIUM, 0.8F);
		addMaterialStats(TConstructHelper.mysterious, TSEArmorMaterials.MYSTERIOUS, 1.1F);
		addMaterialStats(TConstructHelper.mystic, TSEArmorMaterials.MYSTIC, 1.3F);
		addMaterialStats(TConstructHelper.skyIron, TSEArmorMaterials.SKYIRON, 0.7F);
		addMaterialStats(TConstructHelper.terrium, TSEArmorMaterials.TERRIUM, 0.6F);
		addMaterialStats(TConstructHelper.vividium, TSEArmorMaterials.VIVIDIUM, 0.9F);
		addMaterialStats(TConstructHelper.extranetium, TSEArmorMaterials.EXTRANETIUM, 1.0F);
		addMaterialStats(TConstructHelper.platinum, TSEArmorMaterials.PLATINUM, 1.3F);
		addMaterialStats(TConstructHelper.titanium, TSEArmorMaterials.TITANIUM, 0.8F);
		addMaterialStats(TConstructHelper.pewter, TSEArmorMaterials.PEWTER, 0.7F);
		addMaterialStats(TConstructHelper.mnemium, TSEArmorMaterials.MNEMIUM, 2.1F);
		addMaterialStats(TConstructHelper.eternium, TSEArmorMaterials.ETERNIUM, 1.5F);
		addMaterialStats(TConstructHelper.fantasium, TSEArmorMaterials.FANTASIUM, 0.8F);
		addMaterialStats(TConstructHelper.laenium, TSEArmorMaterials.LAENIUM, 0.9F);
		addMaterialStats(TConstructHelper.magneium, TSEArmorMaterials.MAGNEIUM, 1.0F);
		addMaterialStats(TConstructHelper.sterlingSilver, TSEArmorMaterials.STSILVER, 1.2F);
		addMaterialStats(TConstructHelper.roseGold, ArmorMaterial.GOLD, 1.1F);
		addMaterialStats(TConstructHelper.whiteGold, ArmorMaterial.GOLD, 0.9F);
		addMaterialStats(TConstructHelper.spangold, ArmorMaterial.GOLD, 0.5F);
		addMaterialStats(TConstructHelper.meteoricIron, TSEArmorMaterials.METEORICIRON, 0.75F);
		addMaterialStats(TConstructHelper.immortalium, TSEArmorMaterials.IMMORTALIUM, 1.4F);
		addMaterialStats(TConstructHelper.dream, TSEArmorMaterials.DREAM, 1.6F);
	}

	public void init() {
	}

	public void postInit() {
	}

	@Override
	public void registerRecipes() {
	}
	
	public void addMaterialStats(Material material, float durability, float armor, float modifier, float plateDurability, float toughness, float extraDurability)
	{
		TinkerRegistry.addMaterialStats(material,
				new CoreMaterialStats(durability, armor),
				new PlatesMaterialStats(modifier, plateDurability, toughness),
				new TrimMaterialStats(extraDurability));
	}
	public void addMaterialStats(Material materialA, ArmorMaterial materialB, float modifier)
	{
		float durability = (materialB.getDurability(EntityEquipmentSlot.LEGS)+materialB.getDurability(EntityEquipmentSlot.HEAD)+materialB.getDurability(EntityEquipmentSlot.CHEST)+materialB.getDurability(EntityEquipmentSlot.FEET))/4;
		float adjustedDurability = durability/20F;
		float armor = (materialB.getDamageReductionAmount(EntityEquipmentSlot.LEGS)+materialB.getDamageReductionAmount(EntityEquipmentSlot.CHEST)+materialB.getDamageReductionAmount(EntityEquipmentSlot.HEAD)+materialB.getDamageReductionAmount(EntityEquipmentSlot.FEET));
		addMaterialStats(materialA, adjustedDurability, armor, modifier, adjustedDurability/3, materialB.getToughness(), adjustedDurability/4);
	}
}
