
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.exesmp.exesmpdatapack.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.exesmp.exesmpdatapack.block.AlazMadeniBlock;
import net.exesmp.exesmpdatapack.ExesmpdatapackMod;

import java.util.function.Function;

public class ExesmpdatapackModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ExesmpdatapackMod.MODID);
	public static final DeferredBlock<Block> ALAZ_MADENI = register("alaz_madeni", AlazMadeniBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
