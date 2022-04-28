
package net.mcreator.javaeditionplusplus.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.javaeditionplusplus.init.JavaeditionplusplusModTabs;

public class EnderSwordItem extends SwordItem {
	public EnderSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.ENDER_PEARL));
			}
		}, 3, -2.5f, new Item.Properties().tab(JavaeditionplusplusModTabs.TAB_JAVA_EDITION_PLUS_PLUS));
		setRegistryName("ender_sword");
	}
}
