
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.javaeditionplusplus.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.javaeditionplusplus.world.biome.WoodedForestBiome;
import net.mcreator.javaeditionplusplus.world.biome.RedWoodForestBiome;
import net.mcreator.javaeditionplusplus.JavaeditionplusplusMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JavaeditionplusplusModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome WOODED_FOREST = register("wooded_forest", WoodedForestBiome.createBiome());
	public static Biome RED_WOOD_FOREST = register("red_wood_forest", RedWoodForestBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(JavaeditionplusplusMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			WoodedForestBiome.init();
			RedWoodForestBiome.init();
		});
	}
}
