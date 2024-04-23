package com.nemonotfound.block;

import com.nemonotfound.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.Arrays;

import static com.nemonotfound.NemosMossyBlocks.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block MOSSY_STONE = registerBlock("mossy_stone",
            new Block(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASEDRUM)
                    .requiresTool().strength(2.0f, 6.0f)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE_STAIRS = registerBlock("mossy_stone_stairs",
            Blocks.createStairsBlock(MOSSY_STONE), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE_SLAB = registerBlock("mossy_stone_slab",
            new SlabBlock(MOSSY_STONE.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE_PRESSURE_PLATE = registerBlock("mossy_stone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY)
                    .solid().instrument(Instrument.BASEDRUM).requiresTool().noCollision().strength(0.5F)
                    .pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_STONE_BUTTON = registerBlock("mossy_stone_button",
            Blocks.createStoneButtonBlock(), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_PLANKS = registerBlock("mossy_acacia_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_STAIRS = registerBlock("mossy_acacia_stairs",
            Blocks.createStairsBlock(MOSSY_ACACIA_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_SLAB = registerBlock("mossy_acacia_slab",
            new SlabBlock(MOSSY_ACACIA_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_PRESSURE_PLATE = registerBlock("mossy_acacia_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA, AbstractBlock.Settings.create().mapColor(ACACIA_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_BUTTON = registerBlock("mossy_acacia_button",
            Blocks.createWoodenButtonBlock(BlockSetType.ACACIA), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_FENCE = registerBlock("mossy_acacia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(ACACIA_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_ACACIA_FENCE_GATE = registerBlock("mossy_acacia_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, FabricBlockSettings.copyOf(ACACIA_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_PLANKS = registerBlock("mossy_bamboo_planks",
            new Block(FabricBlockSettings.copyOf(BAMBOO_PLANKS)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_STAIRS = registerBlock("mossy_bamboo_stairs",
            Blocks.createStairsBlock(MOSSY_BAMBOO_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_SLAB = registerBlock("mossy_bamboo_slab",
            new SlabBlock(MOSSY_BAMBOO_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_PRESSURE_PLATE = registerBlock("mossy_bamboo_pressure_plate",
            new PressurePlateBlock(BlockSetType.BAMBOO, AbstractBlock.Settings.create().mapColor(BAMBOO_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_BUTTON = registerBlock("mossy_bamboo_button",
            Blocks.createWoodenButtonBlock(BlockSetType.BAMBOO), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_FENCE = registerBlock("mossy_bamboo_fence",
            new FenceBlock(FabricBlockSettings.copyOf(BAMBOO_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BAMBOO_FENCE_GATE = registerBlock("mossy_bamboo_fence_gate",
            new FenceGateBlock(WoodType.BAMBOO, FabricBlockSettings.copyOf(BAMBOO_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_PLANKS = registerBlock("mossy_birch_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_STAIRS = registerBlock("mossy_birch_stairs",
            Blocks.createStairsBlock(MOSSY_BIRCH_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_SLAB = registerBlock("mossy_birch_slab",
            new SlabBlock(MOSSY_BIRCH_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_PRESSURE_PLATE = registerBlock("mossy_birch_pressure_plate",
            new PressurePlateBlock(BlockSetType.BIRCH, AbstractBlock.Settings.create().mapColor(BIRCH_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_BUTTON = registerBlock("mossy_birch_button",
            Blocks.createWoodenButtonBlock(BlockSetType.BIRCH), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_FENCE = registerBlock("mossy_birch_fence",
            new FenceBlock(FabricBlockSettings.copyOf(BIRCH_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_BIRCH_FENCE_GATE = registerBlock("mossy_birch_fence_gate",
            new FenceGateBlock(WoodType.BIRCH, FabricBlockSettings.copyOf(BIRCH_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_PLANKS = registerBlock("mossy_cherry_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_STAIRS = registerBlock("mossy_cherry_stairs",
            Blocks.createStairsBlock(MOSSY_CHERRY_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_SLAB = registerBlock("mossy_cherry_slab",
            new SlabBlock(MOSSY_CHERRY_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_PRESSURE_PLATE = registerBlock("mossy_cherry_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.create().mapColor(CHERRY_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_BUTTON = registerBlock("mossy_cherry_button",
            Blocks.createWoodenButtonBlock(BlockSetType.CHERRY), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_FENCE = registerBlock("mossy_cherry_fence",
            new FenceBlock(FabricBlockSettings.copyOf(CHERRY_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CHERRY_FENCE_GATE = registerBlock("mossy_cherry_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, FabricBlockSettings.copyOf(CHERRY_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_PLANKS = registerBlock("mossy_crimson_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_STAIRS = registerBlock("mossy_crimson_stairs",
            Blocks.createStairsBlock(MOSSY_CRIMSON_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_SLAB = registerBlock("mossy_crimson_slab",
            new SlabBlock(MOSSY_CRIMSON_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_PRESSURE_PLATE = registerBlock("mossy_crimson_pressure_plate",
            new PressurePlateBlock(BlockSetType.CRIMSON, AbstractBlock.Settings.create().mapColor(CRIMSON_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_BUTTON = registerBlock("mossy_crimson_button",
            Blocks.createWoodenButtonBlock(BlockSetType.CRIMSON), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_FENCE = registerBlock("mossy_crimson_fence",
            new FenceBlock(FabricBlockSettings.copyOf(CRIMSON_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_CRIMSON_FENCE_GATE = registerBlock("mossy_crimson_fence_gate",
            new FenceGateBlock(WoodType.CRIMSON, FabricBlockSettings.copyOf(CRIMSON_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_PLANKS = registerBlock("mossy_dark_oak_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_STAIRS = registerBlock("mossy_dark_oak_stairs",
            Blocks.createStairsBlock(MOSSY_DARK_OAK_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_SLAB = registerBlock("mossy_dark_oak_slab",
            new SlabBlock(MOSSY_DARK_OAK_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_PRESSURE_PLATE = registerBlock("mossy_dark_oak_pressure_plate",
            new PressurePlateBlock(BlockSetType.DARK_OAK, AbstractBlock.Settings.create().mapColor(DARK_OAK_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_BUTTON = registerBlock("mossy_dark_oak_button",
            Blocks.createWoodenButtonBlock(BlockSetType.DARK_OAK), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_FENCE = registerBlock("mossy_dark_oak_fence",
            new FenceBlock(FabricBlockSettings.copyOf(DARK_OAK_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_DARK_OAK_FENCE_GATE = registerBlock("mossy_dark_oak_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, FabricBlockSettings.copyOf(DARK_OAK_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_PLANKS = registerBlock("mossy_jungle_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_STAIRS = registerBlock("mossy_jungle_stairs",
            Blocks.createStairsBlock(MOSSY_JUNGLE_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_SLAB = registerBlock("mossy_jungle_slab",
            new SlabBlock(MOSSY_JUNGLE_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_PRESSURE_PLATE = registerBlock("mossy_jungle_pressure_plate",
            new PressurePlateBlock(BlockSetType.JUNGLE, AbstractBlock.Settings.create().mapColor(JUNGLE_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_BUTTON = registerBlock("mossy_jungle_button",
            Blocks.createWoodenButtonBlock(BlockSetType.JUNGLE), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_FENCE = registerBlock("mossy_jungle_fence",
            new FenceBlock(FabricBlockSettings.copyOf(JUNGLE_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_JUNGLE_FENCE_GATE = registerBlock("mossy_jungle_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, FabricBlockSettings.copyOf(JUNGLE_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_PLANKS = registerBlock("mossy_mangrove_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.RED).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_STAIRS = registerBlock("mossy_mangrove_stairs",
            Blocks.createStairsBlock(MOSSY_MANGROVE_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_SLAB = registerBlock("mossy_mangrove_slab",
            new SlabBlock(MOSSY_MANGROVE_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_PRESSURE_PLATE = registerBlock("mossy_mangrove_pressure_plate",
            new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.create().mapColor(MANGROVE_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_BUTTON = registerBlock("mossy_mangrove_button",
            Blocks.createWoodenButtonBlock(BlockSetType.MANGROVE), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_FENCE = registerBlock("mossy_mangrove_fence",
            new FenceBlock(FabricBlockSettings.copyOf(MANGROVE_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_MANGROVE_FENCE_GATE = registerBlock("mossy_mangrove_fence_gate",
            new FenceGateBlock(WoodType.MANGROVE, FabricBlockSettings.copyOf(MANGROVE_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_PLANKS = registerBlock("mossy_oak_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_STAIRS = registerBlock("mossy_oak_stairs",
            Blocks.createStairsBlock(MOSSY_OAK_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_SLAB = registerBlock("mossy_oak_slab",
            new SlabBlock(MOSSY_OAK_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_PRESSURE_PLATE = registerBlock("mossy_oak_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.create().mapColor(OAK_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_BUTTON = registerBlock("mossy_oak_button",
            Blocks.createWoodenButtonBlock(BlockSetType.OAK), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_FENCE = registerBlock("mossy_oak_fence",
            new FenceBlock(FabricBlockSettings.copyOf(OAK_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_OAK_FENCE_GATE = registerBlock("mossy_oak_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(OAK_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_PLANKS = registerBlock("mossy_spruce_planks",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.SPRUCE_BROWN)
                    .instrument(Instrument.BASS).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_STAIRS = registerBlock("mossy_spruce_stairs",
            Blocks.createStairsBlock(MOSSY_SPRUCE_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_SLAB = registerBlock("mossy_spruce_slab",
            new SlabBlock(MOSSY_SPRUCE_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_PRESSURE_PLATE = registerBlock("mossy_spruce_pressure_plate",
            new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().mapColor(SPRUCE_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_BUTTON = registerBlock("mossy_spruce_button",
            Blocks.createWoodenButtonBlock(BlockSetType.SPRUCE), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_FENCE = registerBlock("mossy_spruce_fence",
            new FenceBlock(FabricBlockSettings.copyOf(SPRUCE_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_SPRUCE_FENCE_GATE = registerBlock("mossy_spruce_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE, FabricBlockSettings.copyOf(SPRUCE_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_PLANKS = registerBlock("mossy_warped_planks",
            new Block(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).instrument(Instrument.BASS)
                    .strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).burnable()),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_STAIRS = registerBlock("mossy_warped_stairs",
            Blocks.createStairsBlock(MOSSY_WARPED_PLANKS), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_SLAB = registerBlock("mossy_warped_slab",
            new SlabBlock(MOSSY_WARPED_PLANKS.getSettings()), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_PRESSURE_PLATE = registerBlock("mossy_warped_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED, AbstractBlock.Settings.create().mapColor(WARPED_PLANKS
                            .getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(0.5f)
                    .burnable().pistonBehavior(PistonBehavior.DESTROY)), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_BUTTON = registerBlock("mossy_warped_button",
            Blocks.createWoodenButtonBlock(BlockSetType.WARPED), ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_FENCE = registerBlock("mossy_warped_fence",
            new FenceBlock(FabricBlockSettings.copyOf(WARPED_FENCE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);
    public static final Block MOSSY_WARPED_FENCE_GATE = registerBlock("mossy_warped_fence_gate",
            new FenceGateBlock(WoodType.WARPED, FabricBlockSettings.copyOf(WARPED_FENCE_GATE)),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_MOSSY_BLOCKS);

    @SafeVarargs
    private static Block registerBlock(String path, Block block, RegistryKey<ItemGroup>... itemGroups) {
        Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, path), block);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), new BlockItem(block, new FabricItemSettings()));

        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(block)));

        return registeredBlock;
    }
}
