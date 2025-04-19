
package net.exesmp.exesmpdatapack.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AlazParcasiItem extends Item {
	public AlazParcasiItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
