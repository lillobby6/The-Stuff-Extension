package com.tse.item.materials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TSEToolMaterials {
	
	/** WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        DIAMOND(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);*/
	//e.g.  IRON(2, 250, 6.0F, 2.0F, 14)
		public static final ToolMaterial LAPIS = EnumHelper.addToolMaterial("LAPIS", 1, 50, 10.0F, 1.0F, 30);
		public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 250, 5.0F, 2.0F, 22);
		public static final ToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 3, 1000, 7.0F, 4.0F, 20);
		public static final ToolMaterial TYIONETIUM = EnumHelper.addToolMaterial("TYIONETIUM", 5, 3000, 15.0F, 7.0F, 20);
		public static final ToolMaterial TDIAMOND = EnumHelper.addToolMaterial("TDIAMOND", 4, 2000, 13.0F, 5.0F, 20);
		public static final ToolMaterial BRIGHTFLAME = EnumHelper.addToolMaterial("BRIGHTFLAME", 6, 13000, 25.0f, 9.0f, 25);
		public static final ToolMaterial BRIGHTSTEEL = EnumHelper.addToolMaterial("BRIGHTSTEEL", 6, 10000, 30.0f, 4.0f, 35);
		public static final ToolMaterial MAGIC = EnumHelper.addToolMaterial("MAGIC", 6, 15000, 30.0F, 10.0F, 30);
		public static final ToolMaterial MYSTIC = EnumHelper.addToolMaterial("MYSTIC", 5, 12000, 20.0F, 7.0F, 30);
		public static final ToolMaterial MITHRIL = EnumHelper.addToolMaterial("MITHRIL", 7, 20000, 35.0F, 15.0F, 50);
		public static final ToolMaterial EXTRANETIUM = EnumHelper.addToolMaterial("EXTRANETIUM", 8, 30000, 50.0F, 20F, 60);
		public static final ToolMaterial MORTIUM = EnumHelper.addToolMaterial("MORTIUM", 4, 2161, 9.0F, 4.0F, 13);
		public static final ToolMaterial MYSTERIOUS = EnumHelper.addToolMaterial("MYSTERIOUS", 6, 16000, 32F, 11F, 32);
		public static final ToolMaterial SKYIRON = EnumHelper.addToolMaterial("SKYIRON", 2, 300, 6.5F, 2.0F, 14);
		public static final ToolMaterial TERRIUM = EnumHelper.addToolMaterial("TERRIUM", 5, 3124, 12.5f, 4.0f, 17);
		public static final ToolMaterial VIVIDIUM = EnumHelper.addToolMaterial("VIVIDIUM", 4, 2161, 9.0F, 4.0F, 13);
		public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 3, 500, 7.0F, 3.0F, 10);
}
