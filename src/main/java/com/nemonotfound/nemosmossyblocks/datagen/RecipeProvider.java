package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import com.nemonotfound.nemosmossyblocks.item.ModItems;
import com.nemonotfound.nemosmossyblocks.registry.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        createMossyBlockRecipe(exporter, Blocks.STONE, ModBlocks.MOSSY_STONE, "mossy_stone");
        createMossyBlockRecipe(exporter, Blocks.ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.OAK_PLANKS, ModBlocks.MOSSY_OAK_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.WARPED_PLANKS, ModBlocks.MOSSY_WARPED_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.ACACIA_LOG, ModBlocks.MOSSY_ACACIA_LOG, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.BAMBOO_BLOCK, ModBlocks.MOSSY_BAMBOO_BLOCK, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.BIRCH_LOG, ModBlocks.MOSSY_BIRCH_LOG, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.CHERRY_LOG, ModBlocks.MOSSY_CHERRY_LOG, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.CRIMSON_STEM, ModBlocks.MOSSY_CRIMSON_STEM, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.DARK_OAK_LOG, ModBlocks.MOSSY_DARK_OAK_LOG, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.JUNGLE_LOG, ModBlocks.MOSSY_JUNGLE_LOG, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.MANGROVE_LOG, ModBlocks.MOSSY_MANGROVE_LOG, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.OAK_LOG, ModBlocks.MOSSY_OAK_LOG, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.SPRUCE_LOG, ModBlocks.MOSSY_SPRUCE_LOG, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.WARPED_STEM, ModBlocks.MOSSY_WARPED_STEM, "mossy_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_ACACIA_LOG, ModBlocks.MOSSY_STRIPPED_ACACIA_LOG, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_BAMBOO_BLOCK, ModBlocks.MOSSY_STRIPPED_BAMBOO_BLOCK, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_BIRCH_LOG, ModBlocks.MOSSY_STRIPPED_BIRCH_LOG, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_CHERRY_LOG, ModBlocks.MOSSY_STRIPPED_CHERRY_LOG, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_CRIMSON_STEM, ModBlocks.MOSSY_STRIPPED_CRIMSON_STEM, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_DARK_OAK_LOG, ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_JUNGLE_LOG, ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_MANGROVE_LOG, ModBlocks.MOSSY_STRIPPED_MANGROVE_LOG, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_OAK_LOG, ModBlocks.MOSSY_STRIPPED_OAK_LOG, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_SPRUCE_LOG, ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.STRIPPED_WARPED_STEM, ModBlocks.MOSSY_STRIPPED_WARPED_STEM, "mossy_stripped_log");
        createMossyBlockRecipe(exporter, Blocks.GLASS, ModBlocks.MOSSY_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.BLACK_STAINED_GLASS, ModBlocks.MOSSY_BLACK_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.BLUE_STAINED_GLASS, ModBlocks.MOSSY_BLUE_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.BROWN_STAINED_GLASS, ModBlocks.MOSSY_BROWN_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.CYAN_STAINED_GLASS, ModBlocks.MOSSY_CYAN_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.GRAY_STAINED_GLASS, ModBlocks.MOSSY_GRAY_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.GREEN_STAINED_GLASS, ModBlocks.MOSSY_GREEN_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.LIGHT_BLUE_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.LIGHT_GRAY_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.LIME_STAINED_GLASS, ModBlocks.MOSSY_LIME_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.MAGENTA_STAINED_GLASS, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.ORANGE_STAINED_GLASS, ModBlocks.MOSSY_ORANGE_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.PINK_STAINED_GLASS, ModBlocks.MOSSY_PINK_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.PURPLE_STAINED_GLASS, ModBlocks.MOSSY_PURPLE_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.RED_STAINED_GLASS, ModBlocks.MOSSY_RED_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.TINTED_GLASS, ModBlocks.MOSSY_TINTED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.WHITE_STAINED_GLASS, ModBlocks.MOSSY_WHITE_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.YELLOW_STAINED_GLASS, ModBlocks.MOSSY_YELLOW_STAINED_GLASS, "mossy_glass");
        createMossyBlockRecipe(exporter, Blocks.IRON_BARS, ModBlocks.MOSSY_IRON_BARS, "mossy_iron_bars");

        createPlanksRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_ACACIA_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_BAMBOO_BLOCKS);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_BIRCH_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_CHERRY_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_CRIMSON_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_DARK_OAK_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_JUNGLE_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_MANGROVE_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_OAK_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_SPRUCE_WOOD);
        createPlanksRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, "has_mossy_wood", "mossy_planks", ModItemTags.MOSSY_WARPED_WOOD);

        createStairsRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_STAIRS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_STAIRS, "has_mossy_planks",
                "mossy_wooden_stairs", ModItemTags.MOSSY_PLANKS);
        createStairsRecipe(exporter, ModBlocks.MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_STAIRS);

        createSlabRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_SLAB);
        createSlabRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_SLAB, "has_mossy_planks",
                "mossy_wooden_slab", ModItemTags.MOSSY_PLANKS);
        createSlabRecipe(exporter, ModBlocks.MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_SLAB);

        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_PRESSURE_PLATE);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);
        createPressurePlateRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_PRESSURE_PLATE, "has_mossy_planks",
                "mossy_wooden_pressure_plate", ModItemTags.MOSSY_PLANKS);

        createWallRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_FENCE, "has_mossy_planks",
                "mossy_wooden_fence", ModItemTags.MOSSY_PLANKS);
        createWallRecipe(exporter, Items.IRON_INGOT, ModBlocks.MOSSY_IRON_BARS, "mossy_iron_bars");

        createFenceGateRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);
        createFenceGateRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_FENCE_GATE, "has_mossy_planks",
                "mossy_wooden_fence_gate", ModItemTags.MOSSY_PLANKS);

        createButtonRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_BUTTON);
        createButtonRecipe(exporter, ModBlocks.MOSSY_ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_OAK_PLANKS, ModBlocks.MOSSY_OAK_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);
        createButtonRecipe(exporter, ModBlocks.MOSSY_WARPED_PLANKS, ModBlocks.MOSSY_WARPED_BUTTON, "has_mossy_planks",
                "mossy_wooden_button", ModItemTags.MOSSY_PLANKS);

        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.MOSSY_STONE_SLAB, ModBlocks.MOSSY_STONE, 2);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.MOSSY_STONE_STAIRS, ModBlocks.MOSSY_STONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
                Blocks.MOSSY_STONE_BRICK_SLAB, ModBlocks.MOSSY_STONE, 2);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
                Blocks.MOSSY_STONE_BRICKS, ModBlocks.MOSSY_STONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
                Blocks.MOSSY_STONE_BRICK_STAIRS, ModBlocks.MOSSY_STONE);
        VanillaRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,
                Blocks.MOSSY_STONE_BRICK_WALL, ModBlocks.MOSSY_STONE);

        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_GLASS, ModBlocks.MOSSY_GLASS_PANE);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_BLACK_STAINED_GLASS, ModBlocks.MOSSY_BLACK_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_BLUE_STAINED_GLASS, ModBlocks.MOSSY_BLUE_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_BROWN_STAINED_GLASS, ModBlocks.MOSSY_BROWN_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_CYAN_STAINED_GLASS, ModBlocks.MOSSY_CYAN_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_GRAY_STAINED_GLASS, ModBlocks.MOSSY_GRAY_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_GREEN_STAINED_GLASS, ModBlocks.MOSSY_GREEN_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_LIME_STAINED_GLASS, ModBlocks.MOSSY_LIME_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_ORANGE_STAINED_GLASS, ModBlocks.MOSSY_ORANGE_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_PINK_STAINED_GLASS, ModBlocks.MOSSY_PINK_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_PURPLE_STAINED_GLASS, ModBlocks.MOSSY_PURPLE_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_RED_STAINED_GLASS, ModBlocks.MOSSY_RED_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_WHITE_STAINED_GLASS, ModBlocks.MOSSY_WHITE_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);
        createGlassPaneRecipe(exporter, ModBlocks.MOSSY_YELLOW_STAINED_GLASS, ModBlocks.MOSSY_YELLOW_STAINED_GLASS_PANE,
                "has_mossy_stained_glass", "mossy_stained_glass", ModItemTags.MOSSY_STAINED_GLASS);

        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_ACACIA_WOOD, ModBlocks.MOSSY_ACACIA_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_BIRCH_WOOD, ModBlocks.MOSSY_BIRCH_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_DARK_OAK_WOOD, ModBlocks.MOSSY_DARK_OAK_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_JUNGLE_WOOD, ModBlocks.MOSSY_JUNGLE_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_OAK_WOOD, ModBlocks.MOSSY_OAK_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_SPRUCE_WOOD, ModBlocks.MOSSY_SPRUCE_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_CRIMSON_HYPHAE, ModBlocks.MOSSY_CRIMSON_STEM);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_WARPED_HYPHAE, ModBlocks.MOSSY_WARPED_STEM);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_MANGROVE_WOOD, ModBlocks.MOSSY_MANGROVE_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_ACACIA_WOOD, ModBlocks.MOSSY_STRIPPED_ACACIA_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_BIRCH_WOOD, ModBlocks.MOSSY_STRIPPED_BIRCH_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_DARK_OAK_WOOD, ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_JUNGLE_WOOD, ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_OAK_WOOD, ModBlocks.MOSSY_STRIPPED_OAK_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_SPRUCE_WOOD, ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_CRIMSON_HYPHAE, ModBlocks.MOSSY_STRIPPED_CRIMSON_STEM);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_WARPED_HYPHAE, ModBlocks.MOSSY_STRIPPED_WARPED_STEM);
        VanillaRecipeProvider.offerBarkBlockRecipe(exporter, ModBlocks.MOSSY_STRIPPED_MANGROVE_WOOD, ModBlocks.MOSSY_STRIPPED_MANGROVE_LOG);

        VanillaRecipeProvider.offerMosaicRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_BAMBOO_MOSAIC, ModBlocks.MOSSY_BAMBOO_MOSAIC_SLAB);

        VanillaRecipeProvider.offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MOSS_BLOCK,
                ModItems.MOSS_BALL);
        ShapelessRecipeJsonBuilder
                .create(RecipeCategory.MISC, ModItems.MOSS_BALL, 4).input(Blocks.MOSS_BLOCK)
                .criterion(RecipeProvider.hasItem(Blocks.MOSS_BLOCK),
                        RecipeProvider.conditionsFromItem(Blocks.MOSS_BLOCK))
                .offerTo(exporter);
    }

    private void createMossyBlockRecipe(RecipeExporter exporter, Block input, Block result, String group) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, result)
                .input(input).input(Blocks.VINE).group(group)
                .criterion("has_vine", VanillaRecipeProvider.conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, VanillaRecipeProvider.convertBetween(result, Blocks.VINE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, result)
                .input(input).input(Blocks.MOSS_BLOCK).group(group)
                .criterion("has_moss_block", VanillaRecipeProvider.conditionsFromItem(Blocks.MOSS_BLOCK))
                .offerTo(exporter, VanillaRecipeProvider.convertBetween(result, Blocks.MOSS_BLOCK));
    }

    public static void createPlanksRecipe(RecipeExporter exporter, ItemConvertible output, String criterion, String group, TagKey<Item> input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input(input)
                .group(group)
                .criterion(criterion, VanillaRecipeProvider.conditionsFromTag(input))
                .offerTo(exporter);
    }

    private void createStairsRecipe(RecipeExporter exporter, Block input, Block result, String criterion, String group, TagKey<Item> tag) {
        VanillaRecipeProvider.createStairsRecipe(result, Ingredient.ofItems(input)).group(group)
                .criterion(criterion, VanillaRecipeProvider.conditionsFromTag(tag))
                .offerTo(exporter);
    }

    private void createStairsRecipe(RecipeExporter exporter, Block input, Block result) {
        VanillaRecipeProvider.createStairsRecipe(result, Ingredient.ofItems(input))
                .criterion(VanillaRecipeProvider.hasItem(input), VanillaRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createSlabRecipe(RecipeExporter exporter, Block input, Block result, String criterion, String group, TagKey<Item> tag) {
        VanillaRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.ofItems(input.asItem()))
                .group(group)
                .criterion(criterion, VanillaRecipeProvider.conditionsFromTag(tag))
                .offerTo(exporter);
    }

    private void createSlabRecipe(RecipeExporter exporter, Block input, Block result) {
        VanillaRecipeProvider.createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, result, Ingredient.ofItems(input.asItem()))
                .criterion(VanillaRecipeProvider.hasItem(input), VanillaRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createPressurePlateRecipe(RecipeExporter exporter, Block input, Block result, String criterion, String group, TagKey<Item> tag) {
        VanillaRecipeProvider.createPressurePlateRecipe(RecipeCategory.REDSTONE, result, Ingredient.ofItems(input))
                .group(group)
                .criterion(criterion, VanillaRecipeProvider.conditionsFromTag(tag))
                .offerTo(exporter);
    }

    private void createPressurePlateRecipe(RecipeExporter exporter, Block input, Block result) {
        VanillaRecipeProvider.createPressurePlateRecipe(RecipeCategory.REDSTONE, result, Ingredient.ofItems(input))
                .criterion(VanillaRecipeProvider.hasItem(input), VanillaRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createWallRecipe(RecipeExporter exporter, Block input, Block result, String criterion, String group, TagKey<Item> tag) {
        VanillaRecipeProvider.getWallRecipe(RecipeCategory.DECORATIONS, result, Ingredient.ofItems(input))
                .group(group)
                .criterion(criterion, VanillaRecipeProvider.conditionsFromTag(tag))
                .offerTo(exporter);
    }

    private void createWallRecipe(RecipeExporter exporter, Item input, Block result, String group) {
        VanillaRecipeProvider.getWallRecipe(RecipeCategory.DECORATIONS, result, Ingredient.ofItems(input))
                .group(group)
                .criterion(VanillaRecipeProvider.hasItem(input), VanillaRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createFenceGateRecipe(RecipeExporter exporter, Block input, Block result, String criterion, String group, TagKey<Item> tag) {
        VanillaRecipeProvider.createFenceGateRecipe(result, Ingredient.ofItems(input))
                .group(group)
                .criterion(criterion, VanillaRecipeProvider.conditionsFromTag(tag))
                .offerTo(exporter);
    }

    private void createButtonRecipe(RecipeExporter exporter, Block input, Block result, String criterion, String group, TagKey<Item> tag) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, result)
                .input(input)
                .group(group)
                .criterion(criterion, VanillaRecipeProvider.conditionsFromTag(tag))
                .offerTo(exporter, VanillaRecipeProvider.convertBetween(result, input));
    }

    private void createButtonRecipe(RecipeExporter exporter, Block input, Block result) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, result)
                .input(input)
                .criterion(VanillaRecipeProvider.hasItem(input), VanillaRecipeProvider.conditionsFromItem(input.asItem()))
                .offerTo(exporter, VanillaRecipeProvider.convertBetween(result, input));
    }

    private void createGlassPaneRecipe(RecipeExporter exporter, Block input, Block result) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, result, 16)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(VanillaRecipeProvider.hasItem(input), VanillaRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createGlassPaneRecipe(RecipeExporter exporter, Block input, Block result, String criterion, String group, TagKey<Item> tag) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, result, 16)
                .input('#', input)
                .pattern("###")
                .pattern("###")
                .criterion(criterion, VanillaRecipeProvider.conditionsFromTag(tag))
                .group(group)
                .offerTo(exporter);
    }
}
