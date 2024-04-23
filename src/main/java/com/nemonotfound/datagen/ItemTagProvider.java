package com.nemonotfound.datagen;

import com.nemonotfound.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.nemonotfound.registry.tag.ModItemTags.MOSSY_PLANKS;

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
    }
}
