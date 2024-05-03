package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.nemosmossyblocks.registry.tag.ModItemTags.*;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {


    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(MOSSY_PLANKS)
                .add(ModBlocks.MOSSY_ACACIA_PLANKS.asItem())
                .add(ModBlocks.MOSSY_BAMBOO_PLANKS.asItem())
                .add(ModBlocks.MOSSY_BIRCH_PLANKS.asItem())
                .add(ModBlocks.MOSSY_CHERRY_PLANKS.asItem())
                .add(ModBlocks.MOSSY_CRIMSON_PLANKS.asItem())
                .add(ModBlocks.MOSSY_DARK_OAK_PLANKS.asItem())
                .add(ModBlocks.MOSSY_JUNGLE_PLANKS.asItem())
                .add(ModBlocks.MOSSY_MANGROVE_PLANKS.asItem())
                .add(ModBlocks.MOSSY_OAK_PLANKS.asItem())
                .add(ModBlocks.MOSSY_SPRUCE_PLANKS.asItem())
                .add(ModBlocks.MOSSY_WARPED_PLANKS.asItem());
        
        getOrCreateTagBuilder(MOSSY_STAINED_GLASS)
                .add(ModBlocks.MOSSY_BLACK_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_BLUE_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_BROWN_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_CYAN_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_GRAY_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_GREEN_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_LIME_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_MAGENTA_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_ORANGE_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_PINK_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_PURPLE_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_RED_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_WHITE_STAINED_GLASS.asItem())
                .add(ModBlocks.MOSSY_YELLOW_STAINED_GLASS.asItem());

        getOrCreateTagBuilder(MOSSY_ACACIA_LOGS)
                .add(ModBlocks.MOSSY_ACACIA_LOG.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_ACACIA_LOG.asItem());
        getOrCreateTagBuilder(MOSSY_BAMBOO_BLOCKS)
                .add(ModBlocks.MOSSY_BAMBOO_BLOCK.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_BAMBOO_BLOCK.asItem());
        getOrCreateTagBuilder(MOSSY_BIRCH_LOGS)
                .add(ModBlocks.MOSSY_BIRCH_LOG.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_BIRCH_LOG.asItem());
        getOrCreateTagBuilder(MOSSY_CHERRY_LOGS)
                .add(ModBlocks.MOSSY_CHERRY_LOG.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_CHERRY_LOG.asItem());
        getOrCreateTagBuilder(MOSSY_CRIMSON_STEMS)
                .add(ModBlocks.MOSSY_CRIMSON_STEM.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_CRIMSON_STEM.asItem());
        getOrCreateTagBuilder(MOSSY_DARK_OAK_LOGS)
                .add(ModBlocks.MOSSY_DARK_OAK_LOG.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG.asItem());
        getOrCreateTagBuilder(MOSSY_JUNGLE_LOGS)
                .add(ModBlocks.MOSSY_JUNGLE_LOG.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG.asItem());
        getOrCreateTagBuilder(MOSSY_MANGROVE_LOGS)
                .add(ModBlocks.MOSSY_MANGROVE_LOG.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_MANGROVE_LOG.asItem());
        getOrCreateTagBuilder(MOSSY_OAK_LOGS)
                .add(ModBlocks.MOSSY_OAK_LOG.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_OAK_LOG.asItem());
        getOrCreateTagBuilder(MOSSY_SPRUCE_LOGS)
                .add(ModBlocks.MOSSY_SPRUCE_LOG.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG.asItem());
        getOrCreateTagBuilder(MOSSY_WARPED_STEMS)
                .add(ModBlocks.MOSSY_WARPED_STEM.asItem())
                .add(ModBlocks.MOSSY_STRIPPED_WARPED_STEM.asItem());
    }
}
