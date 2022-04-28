
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.javaeditionplusplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import net.mcreator.javaeditionplusplus.item.ShellBladeItem;
import net.mcreator.javaeditionplusplus.item.PearlScaleItem;
import net.mcreator.javaeditionplusplus.item.EnderSwordItem;
import net.mcreator.javaeditionplusplus.item.EnderScaleItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JavaeditionplusplusModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SHELL_BLADE = register(new ShellBladeItem());
	public static final Item ENDER_SWORD = register(new EnderSwordItem());
	public static final Item ENDER_SCALE = register(new EnderScaleItem());
	public static final Item PEARL_SCALE = register(new PearlScaleItem());
	public static final Item DRAGON_V_2 = register(new SpawnEggItem(JavaeditionplusplusModEntities.DRAGON_V_2, -1, -1,
			new Item.Properties().tab(JavaeditionplusplusModTabs.TAB_JAVA_EDITION_PLUS_PLUS)).setRegistryName("dragon_v_2_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
