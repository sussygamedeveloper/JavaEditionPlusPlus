
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.javaeditionplusplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.javaeditionplusplus.client.renderer.DragonV2Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JavaeditionplusplusModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(JavaeditionplusplusModEntities.DRAGON_V_2, DragonV2Renderer::new);
	}
}
