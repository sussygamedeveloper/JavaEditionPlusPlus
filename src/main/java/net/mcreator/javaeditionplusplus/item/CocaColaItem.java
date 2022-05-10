
package net.mcreator.javaeditionplusplus.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.javaeditionplusplus.procedures.CocaColaFoodEatenProcedure;
import net.mcreator.javaeditionplusplus.init.JavaeditionplusplusModTabs;

public class CocaColaItem extends Item {
	public CocaColaItem() {
		super(new Item.Properties().tab(JavaeditionplusplusModTabs.TAB_JAVA_EDITION_PLUS_PLUS).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(1000).saturationMod(1000f)

						.build()));
		setRegistryName("coca_cola");
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CocaColaFoodEatenProcedure.execute(entity);
		return retval;
	}
}
