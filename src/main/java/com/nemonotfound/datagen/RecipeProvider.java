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
        createStairsRecipe(exporter, ModBlocks.MOSSY_STONE, ModBlocks.MOSSY_STONE_STAIRS, "has_mossy_stone",
                "mossy_stone_stairs", ModBlocks.MOSSY_STONE.asItem());
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

    private void createStairsRecipe(RecipeExporter exporter, Block input, Block result, String criterion, String group, Item item) {
        VanillaRecipeProvider.createStairsRecipe(result, Ingredient.ofItems(input)).group(group)
                .criterion(criterion, VanillaRecipeProvider.conditionsFromItem(item))
                .offerTo(exporter);
    }
}
