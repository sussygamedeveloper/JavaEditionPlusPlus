
package net.mcreator.javaeditionplusplus.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.javaeditionplusplus.init.JavaeditionplusplusModTabs;

public class PearlScaleItem extends Item {
	public PearlScaleItem() {
		super(new Item.Properties().tab(JavaeditionplusplusModTabs.TAB_JAVA_EDITION_PLUS_PLUS).stacksTo(64).fireResistant().rarity(Rarity.RARE));
		setRegistryName("pearl_scale");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}
}
