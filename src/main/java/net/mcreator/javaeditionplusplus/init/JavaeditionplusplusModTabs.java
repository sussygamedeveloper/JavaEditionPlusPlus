
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.javaeditionplusplus.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class JavaeditionplusplusModTabs {
	public static CreativeModeTab TAB_JAVA_EDITION_PLUS_PLUS;

	public static void load() {
		TAB_JAVA_EDITION_PLUS_PLUS = new CreativeModeTab("tabjava_edition_plus_plus") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(JavaeditionplusplusModItems.SHELL_BLADE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
