package com.tse.common.gui.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityRegistry {
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityStoreBox.class, "tse:tile_entity_store_box");
		GameRegistry.registerTileEntity(TileEntitySuperStoreBox.class, "tse:tile_entity_super_store_box");
		GameRegistry.registerTileEntity(TileEntityMysteriousBox.class, "tse:tile_entity_mysterious_box");
		GameRegistry.registerTileEntity(TileEntityDiamondStoreBox.class, "tse:tile_entity_diamond_store_box");
		GameRegistry.registerTileEntity(TileEntityAlloyFurnace.class, "tse:tile_entity_alloy_furnace");
		GameRegistry.registerTileEntity(TileEntityCopperAlloyFurnace.class, "tse:tile_entity_copper_alloy_furnace");
		GameRegistry.registerTileEntity(TileEntityCopperFurnace.class, "tse:tile_entity_copper_furnace");
	}
}
