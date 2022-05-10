
package net.mcreator.javaeditionplusplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.javaeditionplusplus.init.JavaeditionplusplusModTabs;

public class NokiaItem extends Item {
	public NokiaItem() {
		super(new Item.Properties().tab(JavaeditionplusplusModTabs.TAB_JAVA_EDITION_PLUS_PLUS).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
		setRegistryName("nokia");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
