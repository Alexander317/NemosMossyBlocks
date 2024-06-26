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
            .put(ModBlocks.MOSSY_STONE_SLAB, Blocks.STONE_SLAB)
            .put(ModBlocks.MOSSY_STONE_BUTTON, Blocks.STONE_BUTTON)
            .put(ModBlocks.MOSSY_STONE_PRESSURE_PLATE, Blocks.STONE_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_ACACIA_LOG, Blocks.ACACIA_LOG)
            .put(ModBlocks.MOSSY_ACACIA_WOOD, Blocks.ACACIA_WOOD)
            .put(ModBlocks.MOSSY_ACACIA_PLANKS, Blocks.ACACIA_PLANKS)
            .put(ModBlocks.MOSSY_ACACIA_STAIRS, Blocks.ACACIA_STAIRS)
            .put(ModBlocks.MOSSY_ACACIA_SLAB, Blocks.ACACIA_SLAB)
            .put(ModBlocks.MOSSY_ACACIA_FENCE, Blocks.ACACIA_FENCE)
            .put(ModBlocks.MOSSY_ACACIA_FENCE_GATE, Blocks.ACACIA_FENCE_GATE)
            .put(ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE, Blocks.ACACIA_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_ACACIA_BUTTON, Blocks.ACACIA_BUTTON)
            .put(ModBlocks.MOSSY_BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK)
            .put(ModBlocks.MOSSY_BAMBOO_PLANKS, Blocks.BAMBOO_PLANKS)
            .put(ModBlocks.MOSSY_BAMBOO_MOSAIC, Blocks.BAMBOO_MOSAIC)
            .put(ModBlocks.MOSSY_BAMBOO_MOSAIC_STAIRS, Blocks.BAMBOO_MOSAIC_STAIRS)
            .put(ModBlocks.MOSSY_BAMBOO_MOSAIC_SLAB, Blocks.BAMBOO_MOSAIC_SLAB)
            .put(ModBlocks.MOSSY_BAMBOO_STAIRS, Blocks.BAMBOO_STAIRS)
            .put(ModBlocks.MOSSY_BAMBOO_SLAB, Blocks.BAMBOO_SLAB)
            .put(ModBlocks.MOSSY_BAMBOO_FENCE, Blocks.BAMBOO_FENCE)
            .put(ModBlocks.MOSSY_BAMBOO_FENCE_GATE, Blocks.BAMBOO_FENCE_GATE)
            .put(ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE, Blocks.BAMBOO_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_BAMBOO_BUTTON, Blocks.BAMBOO_BUTTON)
            .put(ModBlocks.MOSSY_BIRCH_LOG, Blocks.BIRCH_LOG)
            .put(ModBlocks.MOSSY_BIRCH_WOOD, Blocks.BIRCH_WOOD)
            .put(ModBlocks.MOSSY_BIRCH_PLANKS, Blocks.BIRCH_PLANKS)
            .put(ModBlocks.MOSSY_BIRCH_STAIRS, Blocks.BIRCH_STAIRS)
            .put(ModBlocks.MOSSY_BIRCH_SLAB, Blocks.BIRCH_SLAB)
            .put(ModBlocks.MOSSY_BIRCH_FENCE, Blocks.BIRCH_FENCE)
            .put(ModBlocks.MOSSY_BIRCH_FENCE_GATE, Blocks.BIRCH_FENCE_GATE)
            .put(ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE, Blocks.BIRCH_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_BIRCH_BUTTON, Blocks.BIRCH_BUTTON)
            .put(ModBlocks.MOSSY_CHERRY_LOG, Blocks.CHERRY_LOG)
            .put(ModBlocks.MOSSY_CHERRY_WOOD, Blocks.CHERRY_WOOD)
            .put(ModBlocks.MOSSY_CHERRY_PLANKS, Blocks.CHERRY_PLANKS)
            .put(ModBlocks.MOSSY_CHERRY_STAIRS, Blocks.CHERRY_STAIRS)
            .put(ModBlocks.MOSSY_CHERRY_SLAB, Blocks.CHERRY_SLAB)
            .put(ModBlocks.MOSSY_CHERRY_FENCE, Blocks.CHERRY_FENCE)
            .put(ModBlocks.MOSSY_CHERRY_FENCE_GATE, Blocks.CHERRY_FENCE_GATE)
            .put(ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE, Blocks.CHERRY_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_CHERRY_BUTTON, Blocks.CHERRY_BUTTON)
            .put(ModBlocks.MOSSY_CRIMSON_STEM, Blocks.CRIMSON_STEM)
            .put(ModBlocks.MOSSY_CRIMSON_HYPHAE, Blocks.CRIMSON_HYPHAE)
            .put(ModBlocks.MOSSY_CRIMSON_PLANKS, Blocks.CRIMSON_PLANKS)
            .put(ModBlocks.MOSSY_CRIMSON_STAIRS, Blocks.CRIMSON_STAIRS)
            .put(ModBlocks.MOSSY_CRIMSON_SLAB, Blocks.CRIMSON_SLAB)
            .put(ModBlocks.MOSSY_CRIMSON_FENCE, Blocks.CRIMSON_FENCE)
            .put(ModBlocks.MOSSY_CRIMSON_FENCE_GATE, Blocks.CRIMSON_FENCE_GATE)
            .put(ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE, Blocks.CRIMSON_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_CRIMSON_BUTTON, Blocks.CRIMSON_BUTTON)
            .put(ModBlocks.MOSSY_DARK_OAK_LOG, Blocks.DARK_OAK_LOG)
            .put(ModBlocks.MOSSY_DARK_OAK_WOOD, Blocks.DARK_OAK_WOOD)
            .put(ModBlocks.MOSSY_DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS)
            .put(ModBlocks.MOSSY_DARK_OAK_STAIRS, Blocks.DARK_OAK_STAIRS)
            .put(ModBlocks.MOSSY_DARK_OAK_SLAB, Blocks.DARK_OAK_SLAB)
            .put(ModBlocks.MOSSY_DARK_OAK_FENCE, Blocks.DARK_OAK_FENCE)
            .put(ModBlocks.MOSSY_DARK_OAK_FENCE_GATE, Blocks.DARK_OAK_FENCE_GATE)
            .put(ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE, Blocks.DARK_OAK_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_DARK_OAK_BUTTON, Blocks.DARK_OAK_BUTTON)
            .put(ModBlocks.MOSSY_JUNGLE_LOG, Blocks.JUNGLE_LOG)
            .put(ModBlocks.MOSSY_JUNGLE_WOOD, Blocks.JUNGLE_WOOD)
            .put(ModBlocks.MOSSY_JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS)
            .put(ModBlocks.MOSSY_JUNGLE_STAIRS, Blocks.JUNGLE_STAIRS)
            .put(ModBlocks.MOSSY_JUNGLE_SLAB, Blocks.JUNGLE_SLAB)
            .put(ModBlocks.MOSSY_JUNGLE_FENCE, Blocks.JUNGLE_FENCE)
            .put(ModBlocks.MOSSY_JUNGLE_FENCE_GATE, Blocks.JUNGLE_FENCE_GATE)
            .put(ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE, Blocks.JUNGLE_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_JUNGLE_BUTTON, Blocks.JUNGLE_BUTTON)
            .put(ModBlocks.MOSSY_MANGROVE_LOG, Blocks.MANGROVE_LOG)
            .put(ModBlocks.MOSSY_MANGROVE_WOOD, Blocks.MANGROVE_WOOD)
            .put(ModBlocks.MOSSY_MANGROVE_PLANKS, Blocks.MANGROVE_PLANKS)
            .put(ModBlocks.MOSSY_MANGROVE_STAIRS, Blocks.MANGROVE_STAIRS)
            .put(ModBlocks.MOSSY_MANGROVE_SLAB, Blocks.MANGROVE_SLAB)
            .put(ModBlocks.MOSSY_MANGROVE_FENCE, Blocks.MANGROVE_FENCE)
            .put(ModBlocks.MOSSY_MANGROVE_FENCE_GATE, Blocks.MANGROVE_FENCE_GATE)
            .put(ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE, Blocks.MANGROVE_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_MANGROVE_BUTTON, Blocks.MANGROVE_BUTTON)
            .put(ModBlocks.MOSSY_OAK_LOG, Blocks.OAK_LOG)
            .put(ModBlocks.MOSSY_OAK_WOOD, Blocks.OAK_WOOD)
            .put(ModBlocks.MOSSY_OAK_PLANKS, Blocks.OAK_PLANKS)
            .put(ModBlocks.MOSSY_OAK_STAIRS, Blocks.OAK_STAIRS)
            .put(ModBlocks.MOSSY_OAK_SLAB, Blocks.OAK_SLAB)
            .put(ModBlocks.MOSSY_OAK_FENCE, Blocks.OAK_FENCE)
            .put(ModBlocks.MOSSY_OAK_FENCE_GATE, Blocks.OAK_FENCE_GATE)
            .put(ModBlocks.MOSSY_OAK_PRESSURE_PLATE, Blocks.OAK_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_OAK_BUTTON, Blocks.OAK_BUTTON)
            .put(ModBlocks.MOSSY_SPRUCE_LOG, Blocks.SPRUCE_LOG)
            .put(ModBlocks.MOSSY_SPRUCE_WOOD, Blocks.SPRUCE_WOOD)
            .put(ModBlocks.MOSSY_SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS)
            .put(ModBlocks.MOSSY_SPRUCE_STAIRS, Blocks.SPRUCE_STAIRS)
            .put(ModBlocks.MOSSY_SPRUCE_SLAB, Blocks.SPRUCE_SLAB)
            .put(ModBlocks.MOSSY_SPRUCE_FENCE, Blocks.SPRUCE_FENCE)
            .put(ModBlocks.MOSSY_SPRUCE_FENCE_GATE, Blocks.SPRUCE_FENCE_GATE)
            .put(ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE, Blocks.SPRUCE_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_SPRUCE_BUTTON, Blocks.SPRUCE_BUTTON)
            .put(ModBlocks.MOSSY_WARPED_STEM, Blocks.WARPED_STEM)
            .put(ModBlocks.MOSSY_WARPED_HYPHAE, Blocks.WARPED_HYPHAE)
            .put(ModBlocks.MOSSY_WARPED_PLANKS, Blocks.WARPED_PLANKS)
            .put(ModBlocks.MOSSY_WARPED_STAIRS, Blocks.WARPED_STAIRS)
            .put(ModBlocks.MOSSY_WARPED_SLAB, Blocks.WARPED_SLAB)
            .put(ModBlocks.MOSSY_WARPED_FENCE, Blocks.WARPED_FENCE)
            .put(ModBlocks.MOSSY_WARPED_FENCE_GATE, Blocks.WARPED_FENCE_GATE)
            .put(ModBlocks.MOSSY_WARPED_PRESSURE_PLATE, Blocks.WARPED_PRESSURE_PLATE)
            .put(ModBlocks.MOSSY_WARPED_BUTTON, Blocks.WARPED_BUTTON)
            .put(ModBlocks.MOSSY_GLASS, Blocks.GLASS)
            .put(ModBlocks.MOSSY_GLASS_PANE, Blocks.GLASS_PANE)
            .put(ModBlocks.MOSSY_BLACK_STAINED_GLASS, Blocks.BLACK_STAINED_GLASS)
            .put(ModBlocks.MOSSY_BLACK_STAINED_GLASS_PANE, Blocks.BLACK_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_BLUE_STAINED_GLASS, Blocks.BLUE_STAINED_GLASS)
            .put(ModBlocks.MOSSY_BLUE_STAINED_GLASS_PANE, Blocks.BLUE_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_BROWN_STAINED_GLASS, Blocks.BROWN_STAINED_GLASS)
            .put(ModBlocks.MOSSY_BROWN_STAINED_GLASS_PANE, Blocks.BROWN_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_CYAN_STAINED_GLASS, Blocks.CYAN_STAINED_GLASS)
            .put(ModBlocks.MOSSY_CYAN_STAINED_GLASS_PANE, Blocks.CYAN_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_GRAY_STAINED_GLASS, Blocks.GRAY_STAINED_GLASS)
            .put(ModBlocks.MOSSY_GRAY_STAINED_GLASS_PANE, Blocks.GRAY_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_GREEN_STAINED_GLASS, Blocks.GREEN_STAINED_GLASS)
            .put(ModBlocks.MOSSY_GREEN_STAINED_GLASS_PANE, Blocks.GREEN_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS)
            .put(ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS)
            .put(ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_LIME_STAINED_GLASS, Blocks.LIME_STAINED_GLASS)
            .put(ModBlocks.MOSSY_LIME_STAINED_GLASS_PANE, Blocks.LIME_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_MAGENTA_STAINED_GLASS, Blocks.MAGENTA_STAINED_GLASS)
            .put(ModBlocks.MOSSY_MAGENTA_STAINED_GLASS_PANE, Blocks.MAGENTA_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_ORANGE_STAINED_GLASS, Blocks.ORANGE_STAINED_GLASS)
            .put(ModBlocks.MOSSY_ORANGE_STAINED_GLASS_PANE, Blocks.ORANGE_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_PINK_STAINED_GLASS, Blocks.PINK_STAINED_GLASS)
            .put(ModBlocks.MOSSY_PINK_STAINED_GLASS_PANE, Blocks.PINK_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_PURPLE_STAINED_GLASS, Blocks.PURPLE_STAINED_GLASS)
            .put(ModBlocks.MOSSY_PURPLE_STAINED_GLASS_PANE, Blocks.PURPLE_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_RED_STAINED_GLASS, Blocks.RED_STAINED_GLASS)
            .put(ModBlocks.MOSSY_RED_STAINED_GLASS_PANE, Blocks.RED_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_WHITE_STAINED_GLASS, Blocks.WHITE_STAINED_GLASS)
            .put(ModBlocks.MOSSY_WHITE_STAINED_GLASS_PANE, Blocks.WHITE_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_YELLOW_STAINED_GLASS, Blocks.YELLOW_STAINED_GLASS)
            .put(ModBlocks.MOSSY_YELLOW_STAINED_GLASS_PANE, Blocks.YELLOW_STAINED_GLASS_PANE)
            .put(ModBlocks.MOSSY_IRON_BARS, Blocks.IRON_BARS)
            .put(Blocks.MOSSY_COBBLESTONE, Blocks.COBBLESTONE)
            .put(Blocks.MOSSY_COBBLESTONE_STAIRS, Blocks.COBBLESTONE_STAIRS)
            .put(Blocks.MOSSY_COBBLESTONE_SLAB, Blocks.COBBLESTONE_SLAB)
            .put(Blocks.MOSSY_COBBLESTONE_WALL, Blocks.COBBLESTONE_WALL)
            .put(Blocks.MOSSY_STONE_BRICKS, Blocks.STONE_BRICKS)
            .put(Blocks.MOSSY_STONE_BRICK_STAIRS, Blocks.STONE_BRICK_STAIRS)
            .put(Blocks.MOSSY_STONE_BRICK_SLAB, Blocks.STONE_BRICK_SLAB)
            .put(Blocks.MOSSY_STONE_BRICK_WALL, Blocks.STONE_BRICK_WALL)
            .put(Blocks.INFESTED_MOSSY_STONE_BRICKS, Blocks.INFESTED_STONE_BRICKS)
            .build();
}
