package com.nemonotfound.datagen;

import com.nemonotfound.block.ModBlocks;
import com.nemonotfound.registry.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.TagKey;

public class RecipeProvider extends FabricRecipeProvider {

    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        createMossyBlockRecipe(exporter, Blocks.STONE, ModBlocks.MOSSY_STONE, "mossy_stone");
        createMossyBlockRecipe(exporter, Blocks.ACACIA_PLANKS, ModBlocks.MOSSY_ACACIA_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.MOSSY_BAMBOO_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.BIRCH_PLANKS, ModBlocks.MOSSY_BIRCH_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.CHERRY_PLANKS, ModBlocks.MOSSY_CHERRY_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.MOSSY_CRIMSON_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.MOSSY_DARK_OAK_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.MOSSY_JUNGLE_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MOSSY_MANGROVE_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.OAK_PLANKS, ModBlocks.MOSSY_OAK_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.MOSSY_SPRUCE_PLANKS, "mossy_planks");
        createMossyBlockRecipe(exporter, Blocks.WARPED_PLANKS, ModBlocks.MOSSY_WARPED_PLANKS, "mossy_planks");

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
}
