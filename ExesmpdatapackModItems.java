
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.exesmp.exesmpdatapack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.exesmp.exesmpdatapack.item.AlazParcasiItem;
import net.exesmp.exesmpdatapack.item.AlazKulcesiItem;
import net.exesmp.exesmpdatapack.ExesmpdatapackMod;

import java.util.function.Function;

public class ExesmpdatapackModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ExesmpdatapackMod.MODID);
	public static final DeferredItem<Item> ALAZ_MADENI = block(ExesmpdatapackModBlocks.ALAZ_MADENI);
	public static final DeferredItem<Item> ALAZ_PARCASI = register("alaz_parcasi", AlazParcasiItem::new);
	public static final DeferredItem<Item> ALAZ_KULCESI = register("alaz_kulcesi", AlazKulcesiItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
