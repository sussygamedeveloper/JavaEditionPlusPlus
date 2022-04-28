
package net.mcreator.javaeditionplusplus.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.javaeditionplusplus.procedures.PearlScaleRightClickedInAirProcedure;
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

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PearlScaleRightClickedInAirProcedure.execute(world, x, y, z);
		return ar;
	}
}
