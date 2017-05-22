package com.tse.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRegistry {
	public static void init() {
		GameRegistry.registerTileEntity(StoreBoxTileEntity.class, "store_box_tile_entity");
		GameRegistry.registerTileEntity(SuperStoreBoxTileEntity.class, "super_store_box_tile_entity");
		GameRegistry.registerTileEntity(MysteriousTileEntity.class, "mysterious_box_tile_entity");
		GameRegistry.registerTileEntity(DiamondSBTileEntity.class, "diamond_store_box_tile_entity");
	}
}
