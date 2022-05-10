
package net.mcreator.javaeditionplusplus.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.javaeditionplusplus.init.JavaeditionplusplusModTabs;

public class NokiaHammerItem extends AxeItem {
	public NokiaHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.75f, new Item.Properties().tab(JavaeditionplusplusModTabs.TAB_JAVA_EDITION_PLUS_PLUS).fireResistant());
		setRegistryName("nokia_hammer");
	}
}
