package com.tse.item.materials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TSEToolMaterials {
	
	
	//e.g.  IRON(2, 250, 6.0F, 2.0F, 14)
		public static final ToolMaterial LAPIS = EnumHelper.addToolMaterial("LAPIS", 1, 50, 10.0F, 0.0F, 30);
		public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 250, 5.0F, 2.0F, 22);
		public static final ToolMaterial TDIAMOND = EnumHelper.addToolMaterial("TDIAMOND", 4, 2000, 13.0F, 5.0F, 20);
}
