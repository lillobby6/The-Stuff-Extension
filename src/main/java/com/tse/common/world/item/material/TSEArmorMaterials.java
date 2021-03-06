package com.tse.common.world.item.material;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/*
  		LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
        CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
        IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
        GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
        DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
 */
public class TSEArmorMaterials {
	public static final ArmorMaterial COPPER = EnumHelper.addArmorMaterial("COPPER", "tse:copper", 15, new int[] { 2, 6, 5, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STEEL = EnumHelper.addArmorMaterial("STEEL", "tse:steel", 23, new int[] { 3, 6, 7, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F);
	public static final ArmorMaterial TIN = EnumHelper.addArmorMaterial("TIN", "tse:tin", 10, new int[] { 1, 3, 3, 2 }, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0F);
	public static final ArmorMaterial TYIONETIUM = EnumHelper.addArmorMaterial("TYIONETIUM", "tse:tyionetium", 35, new int[] { 6, 6, 5, 3 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2F);
	public static final ArmorMaterial BRONZE = EnumHelper.addArmorMaterial("BRONZE", "tse:bronze", 25, new int[] { 3, 5, 6, 3 }, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static final ArmorMaterial BRIGHTFLAME = EnumHelper.addArmorMaterial("BRIGHTFLAME", "tse:brightflame", 38, new int[] { 3, 7, 7, 3 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1.5F);
	public static final ArmorMaterial BRIGHTSTEEL = EnumHelper.addArmorMaterial("BRIGHTSTEEL", "tse:brightsteel", 38, new int[] { 4, 6, 6, 4 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F);
	public static final ArmorMaterial REFORGEDGOLD = EnumHelper.addArmorMaterial("REFORGEDGOLD", "tse:reforged_gold", 15, new int[] {2, 4, 5, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial MAGIC = EnumHelper.addArmorMaterial("MAGIC", "tse:magic", 45, new int[] { 6, 9, 7, 5 }, 40, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F);
	public static final ArmorMaterial DREAM = EnumHelper.addArmorMaterial("DREAM", "tse:dream", 50, new int[] {6, 10, 8, 6}, 44, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.3F);
	public static final ArmorMaterial MANATHEUM = EnumHelper.addArmorMaterial("MANATHEUM", "tse:manatheum", 65, new int[] { 7, 10, 8, 6 }, 60, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
	public static final ArmorMaterial MORTIUM = EnumHelper.addArmorMaterial("MORTIUM", "tse:mortium", 45, new int[] { 6, 8, 7, 4 }, 40, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	public static final ArmorMaterial MYSTERIOUS = EnumHelper.addArmorMaterial("MYSTERIOUS", "tse:mysterious", 53, new int[] { 7, 8, 8, 5 }, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.5F);
	public static final ArmorMaterial MYSTIC = EnumHelper.addArmorMaterial("MYSTIC", "tse:mystic", 40, new int[] { 5, 8, 6, 4 }, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.5F);
	public static final ArmorMaterial SKYIRON = EnumHelper.addArmorMaterial("SKYIRON", "tse:sky_iron", 20, new int[] { 3, 6, 6, 2 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TERRIUM = EnumHelper.addArmorMaterial("TERRIUM", "tse:terrium", 50, new int[] { 5, 7, 6, 4 }, 17, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.2F);
	public static final ArmorMaterial VIVIDIUM = EnumHelper.addArmorMaterial("VIVIDIUM", "tse:vividium", 45, new int[] { 6, 8, 8, 5 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.5F);
	public static final ArmorMaterial EXTRANETIUM = EnumHelper.addArmorMaterial("EXTRANETIUM", "tse:extranetium", 75, new int[] { 8, 11, 10, 8 }, 70, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	public static final ArmorMaterial SILVER = EnumHelper.addArmorMaterial("SILVER", "tse:silver", 5, new int[] { 1, 2, 4, 1 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PLATINUM = EnumHelper.addArmorMaterial("PLATINUM", "tse:platinum", 9, new int[] { 2, 3, 6, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial TITANIUM = EnumHelper.addArmorMaterial("TITANIUM", "tse:titanium", 38, new int[] { 3, 6, 7, 4 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial ZINC = EnumHelper.addArmorMaterial("ZINC", "tse:zinc", 12, new int[] {2, 4, 5, 2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial BRASS = EnumHelper.addArmorMaterial("BRASS", "tse:brass", 17, new int[] {3, 4, 5, 2}, 6, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial LEAD = EnumHelper.addArmorMaterial("LEAD", "tse:lead", 30, new int [] {2, 5, 6, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial NICKEL = EnumHelper.addArmorMaterial("NICKEL", "tse:nickel", 3, new int[] {1, 3, 4, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PEWTER = EnumHelper.addArmorMaterial("PEWTER", "tse:pewter", 22, new int[] { 3, 5, 7, 3 }, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static final ArmorMaterial ALUMINUM = EnumHelper.addArmorMaterial("ALUMINUM", "tse:aluminum", 10, new int[] { 1, 3, 4, 1 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MNEMIUM = EnumHelper.addArmorMaterial("MNEMIUM", "tse:mnemium", 120, new int[] { 10, 13, 12, 10 }, 100, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	public static final ArmorMaterial ETERNIUM = EnumHelper.addArmorMaterial("ETERNIUM", "tse:eternium", 200, new int[] { 12, 14, 13, 11 }, 120, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	public static final ArmorMaterial FANTASIUM = EnumHelper.addArmorMaterial("FANTASIM", "tse:fantasium", 27, new int[] {4, 7, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0F);
	public static final ArmorMaterial SCORNIUM = EnumHelper.addArmorMaterial("SCORNIUM", "tse:scornium", 20, new int[] {4, 5, 4, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F);
	public static final ArmorMaterial ELECTRUM = EnumHelper.addArmorMaterial("ELECTRUM", "tse:electrum", 8, new int[]{2, 4, 5, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial LAENIUM = EnumHelper.addArmorMaterial("LAENIUM", "tse:laenium", 28, new int[]{3, 6, 8, 3}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static final ArmorMaterial MAGNEIUM = EnumHelper.addArmorMaterial("MAGNEIUM", "tse:magneium", 11, new int[]{1, 3, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial STSILVER = EnumHelper.addArmorMaterial("STSILVER", "tse:sterling_silver", 7, new int[] {1, 3, 4, 2}, 22, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	/*public static final ArmorMaterial ROSEGOLD;
	public static final ArmorMaterial WHITEGOLD;
	public static final ArmorMaterial SPANGOLD;*/
	public static final ArmorMaterial METEORICIRON = EnumHelper.addArmorMaterial("METEORICIRON", "tse:meteoric_iron", 17, new int[] {2, 6, 6, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial MADUUM = EnumHelper.addArmorMaterial("MADUUM", "tse:maduum", -1, new int[] {1, 1, 1, 1}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial IMMORTALIUM = EnumHelper.addArmorMaterial("IMMORTALIUM", "tse:eternium", 170, new int[] {13, 13, 13, 11}, 150, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 10.0F);
	
	public static final ArmorMaterial TERRADIAMOND = EnumHelper.addArmorMaterial("TERRADIAMOND", "tse:terra_diamond", 40, new int[] { 3, 8, 6, 3 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial EDIAMOND = EnumHelper.addArmorMaterial("EDIAMOND", "tse:exalted_diamond", 40,	new int[] { 4, 7, 5, 4 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial BDIAMOND = EnumHelper.addArmorMaterial("BDIAMOND", "tse:blood_diamond", 43, new int[] { 3, 8, 4, 5 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

}
