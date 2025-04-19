
package net.exesmp.exesmpdatapack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AlazKulcesiItem extends Item {
	public AlazKulcesiItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(64).fireResistant());
	}
}
