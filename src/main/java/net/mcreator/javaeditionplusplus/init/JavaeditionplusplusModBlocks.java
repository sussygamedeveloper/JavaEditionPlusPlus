
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.javaeditionplusplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.javaeditionplusplus.block.RedwoodPlankBlock;
import net.mcreator.javaeditionplusplus.block.RedwoodLogBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JavaeditionplusplusModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block REDWOOD_PLANK = register(new RedwoodPlankBlock());
	public static final Block REDWOOD_LOG = register(new RedwoodLogBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
