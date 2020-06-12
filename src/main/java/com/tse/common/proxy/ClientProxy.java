package com.tse.common.proxy;

import com.tse.common.client.integration.tconstruct.CompatModule;
import com.tse.common.core.TheStuffExtension;
import com.tse.world.block.BlockRenderRegister;
import com.tse.world.entity.EntityManager;
import com.tse.world.item.ItemRenderRegister;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber
public class ClientProxy extends CommonProxy{
	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        EntityManager.initmodels();
        for(CompatModule compat : CompatModule.modules)
			try
			{
				compat.clientPreInit();
			} catch(Exception exception)
			{
				TheStuffExtension.logError("Compat module for "+compat+" could not be client pre-initialized", exception);
			}
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        
        ItemRenderRegister.registerItemRenderer();
        BlockRenderRegister.registerBlockRenderer();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
        for(CompatModule compat : CompatModule.modules)
			try
			{
				compat.clientPostInit();
			} catch(Exception exception)
			{
				TheStuffExtension.logError("Compat module for "+compat+" could not be client pre-initialized", exception);
			}
    }
    
}
