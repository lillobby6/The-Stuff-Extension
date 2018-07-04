package com.tse.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRegistry {
	public static void init() {
		GameRegistry.registerTileEntity(StoreBoxTileEntity.class, "tse:store_box_tile_entity");
		GameRegistry.registerTileEntity(SuperStoreBoxTileEntity.class, "tse:super_store_box_tile_entity");
		GameRegistry.registerTileEntity(MysteriousTileEntity.class, "tse:mysterious_box_tile_entity");
		GameRegistry.registerTileEntity(DiamondSBTileEntity.class, "tse:diamond_store_box_tile_entity");
		GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "tse:alloy_furnace_tile_entity");
		GameRegistry.registerTileEntity(TileEntityCopperAlloyFurnace.class, "tse:copper_alloy_furnace_tile_entity");
		GameRegistry.registerTileEntity(TileEntityCopperFurnace.class, "tse:copper_furnace");
	}
}
