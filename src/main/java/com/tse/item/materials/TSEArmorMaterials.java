package com.tse.item.materials;

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
	public static final ArmorMaterial COPPER = EnumHelper.addArmorMaterial("COPPER", "tse:copper", 15, new int[] {2, 6, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial TERRADIAMOND = EnumHelper.addArmorMaterial("TERRADIAMOND", "tse:terra_diamond", 40, new int[] {3, 8, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial BRIGHTFLAME = EnumHelper.addArmorMaterial("BRIGHTFLAME", "tse:brightflame", 38, new int[] {3, 7, 7, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
}
