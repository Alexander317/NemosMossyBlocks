package com.nemonotfound.nemosmossyblocks.block;

import com.google.common.collect.ImmutableMap;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.Map;

public class BlockUtils {

    public static final Map<Block, Block> STRIPPED_MOSSY_BLOCKS = new ImmutableMap.Builder<Block, Block>()
            .put(ModBlocks.MOSSY_OAK_LOG, Blocks.STRIPPED_OAK_LOG)
            .put(ModBlocks.MOSSY_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG)
            .put(ModBlocks.MOSSY_ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG)
            .put(ModBlocks.MOSSY_CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG)
            .put(ModBlocks.MOSSY_BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG)
            .put(ModBlocks.MOSSY_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG)
            .put(ModBlocks.MOSSY_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG)
            .put(ModBlocks.MOSSY_WARPED_STEM, Blocks.STRIPPED_WARPED_STEM)
            .put(ModBlocks.MOSSY_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM)
            .put(ModBlocks.MOSSY_MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG)
            .put(ModBlocks.MOSSY_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK)
            .put(ModBlocks.MOSSY_OAK_WOOD, Blocks.STRIPPED_OAK_WOOD)
            .put(ModBlocks.MOSSY_DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD)
            .put(ModBlocks.MOSSY_ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD)
            .put(ModBlocks.MOSSY_CHERRY_WOOD, Blocks.STRIPPED_CHERRY_WOOD)
            .put(ModBlocks.MOSSY_BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD)
            .put(ModBlocks.MOSSY_JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD)
            .put(ModBlocks.MOSSY_SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD)
            .put(ModBlocks.MOSSY_WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE)
            .put(ModBlocks.MOSSY_CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE)
            .put(ModBlocks.MOSSY_MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_WOOD)
            .build();

    public static final Map<Block, Block> SHEARED_MOSSY_BLOCKS = new ImmutableMap.Builder<Block, Block>()
            .put(ModBlocks.MOSSY_STONE, Blocks.STONE)
            .put(ModBlocks.MOSSY_STONE_STAIRS, Blocks.STONE_STAIRS)
            .build();
}
