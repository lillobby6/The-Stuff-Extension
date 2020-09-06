package com.tse.client.proxy;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.integration.CompatModule;
import com.tse.common.proxy.CommonProxy;
import com.tse.common.world.block.BlockRenderRegister;
import com.tse.common.world.entity.EntityManager;
import com.tse.common.world.item.ItemRenderRegister;

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
        
        for(CompatModule compat : CompatModule.modules)
			try
			{
				compat.clientInit();
			} catch(Exception exception)
			{
				TheStuffExtension.logError("Compat module for "+compat+" could not be client initialized", exception);
			}
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
				TheStuffExtension.logError("Compat module for "+compat+" could not be client post-initialized", exception);
			}
    }
    
}
