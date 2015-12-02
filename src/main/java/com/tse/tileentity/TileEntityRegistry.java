package com.tse.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRegistry {
	public static void init() {
		GameRegistry.registerTileEntity(StoreBoxTileEntity.class, "store_box_tile_entity");
	}
}
