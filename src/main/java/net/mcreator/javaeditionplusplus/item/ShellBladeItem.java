
package net.mcreator.javaeditionplusplus.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.javaeditionplusplus.init.JavaeditionplusplusModTabs;

public class ShellBladeItem extends SwordItem {
	public ShellBladeItem() {
		super(new Tier() {
			public int getUses() {
				return 1300;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.SCUTE));
			}
		}, 3, -2.5f, new Item.Properties().tab(JavaeditionplusplusModTabs.TAB_JAVA_EDITION_PLUS_PLUS));
		setRegistryName("shell_blade");
	}
}
