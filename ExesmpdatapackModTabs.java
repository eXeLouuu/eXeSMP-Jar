
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.exesmp.exesmpdatapack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.exesmp.exesmpdatapack.ExesmpdatapackMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ExesmpdatapackModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExesmpdatapackMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ExesmpdatapackModBlocks.ALAZ_MADENI.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ExesmpdatapackModItems.ALAZ_PARCASI.get());
			tabData.accept(ExesmpdatapackModItems.ALAZ_KULCESI.get());
		}
	}
}
