package com.nemonotfound.datagen;

import com.nemonotfound.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        this.addDrop(ModBlocks.MOSSY_STONE, (Block block) -> BlockLootTableGenerator.dropsWithSilkTouch(block,
                this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.MOSSY_COBBLESTONE))));
        this.addDrop(ModBlocks.MOSSY_STONE_STAIRS);
        this.addDrop(ModBlocks.MOSSY_STONE_SLAB);
        this.addDrop(ModBlocks.MOSSY_STONE_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_STONE_BUTTON);
        this.addDrop(ModBlocks.MOSSY_ACACIA_PLANKS);
        this.addDrop(ModBlocks.MOSSY_ACACIA_STAIRS);
        this.addDrop(ModBlocks.MOSSY_ACACIA_SLAB);
        this.addDrop(ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_ACACIA_BUTTON);
        this.addDrop(ModBlocks.MOSSY_ACACIA_FENCE);
        this.addDrop(ModBlocks.MOSSY_ACACIA_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_PLANKS);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_STAIRS);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_SLAB);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_BUTTON);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_FENCE);
        this.addDrop(ModBlocks.MOSSY_BAMBOO_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_BIRCH_PLANKS);
        this.addDrop(ModBlocks.MOSSY_BIRCH_STAIRS);
        this.addDrop(ModBlocks.MOSSY_BIRCH_SLAB);
        this.addDrop(ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_BIRCH_BUTTON);
        this.addDrop(ModBlocks.MOSSY_BIRCH_FENCE);
        this.addDrop(ModBlocks.MOSSY_BIRCH_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_CHERRY_PLANKS);
        this.addDrop(ModBlocks.MOSSY_CHERRY_STAIRS);
        this.addDrop(ModBlocks.MOSSY_CHERRY_SLAB);
        this.addDrop(ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_CHERRY_BUTTON);
        this.addDrop(ModBlocks.MOSSY_CHERRY_FENCE);
        this.addDrop(ModBlocks.MOSSY_CHERRY_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_PLANKS);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_STAIRS);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_SLAB);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_BUTTON);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_FENCE);
        this.addDrop(ModBlocks.MOSSY_CRIMSON_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_PLANKS);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_STAIRS);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_SLAB);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_BUTTON);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_FENCE);
        this.addDrop(ModBlocks.MOSSY_DARK_OAK_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_PLANKS);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_STAIRS);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_SLAB);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_BUTTON);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_FENCE);
        this.addDrop(ModBlocks.MOSSY_JUNGLE_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_PLANKS);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_STAIRS);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_SLAB);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_BUTTON);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_FENCE);
        this.addDrop(ModBlocks.MOSSY_MANGROVE_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_OAK_PLANKS);
        this.addDrop(ModBlocks.MOSSY_OAK_STAIRS);
        this.addDrop(ModBlocks.MOSSY_OAK_SLAB);
        this.addDrop(ModBlocks.MOSSY_OAK_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_OAK_BUTTON);
        this.addDrop(ModBlocks.MOSSY_OAK_FENCE);
        this.addDrop(ModBlocks.MOSSY_OAK_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_PLANKS);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_STAIRS);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_SLAB);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_BUTTON);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_FENCE);
        this.addDrop(ModBlocks.MOSSY_SPRUCE_FENCE_GATE);
        this.addDrop(ModBlocks.MOSSY_WARPED_PLANKS);
        this.addDrop(ModBlocks.MOSSY_WARPED_STAIRS);
        this.addDrop(ModBlocks.MOSSY_WARPED_SLAB);
        this.addDrop(ModBlocks.MOSSY_WARPED_PRESSURE_PLATE);
        this.addDrop(ModBlocks.MOSSY_WARPED_BUTTON);
        this.addDrop(ModBlocks.MOSSY_WARPED_FENCE);
        this.addDrop(ModBlocks.MOSSY_WARPED_FENCE_GATE);
    }
}
