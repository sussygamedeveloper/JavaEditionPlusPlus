
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

import net.mcreator.javaeditionplusplus.world.biome.EndV2Biome;
import net.mcreator.javaeditionplusplus.JavaeditionplusplusMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JavaeditionplusplusModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome END_V_2 = register("end_v_2", EndV2Biome.createBiome());

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
			EndV2Biome.init();
		});
	}
}
