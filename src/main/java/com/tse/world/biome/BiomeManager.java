package com.tse.world.biome;

import com.tse.common.core.TheStuffExtension;

import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;


@Mod.EventBusSubscriber
public class BiomeManager {
	
	public static Biome mysticPlains = new BiomeMysticPlains();
	
	@SubscribeEvent()
	public static void registerBiomes(RegistryEvent.Register<Biome> event)
	{
		final IForgeRegistry<Biome> registry = event.getRegistry();
		TheStuffExtension.log("Registering biomes...");
		//registry.register(mysticPlains);
		TheStuffExtension.log("Registered biomes.");
	}
	
}
