package com.nemonotfound.nemosmossyblocks.datagen;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateModelGenerator.BlockTexturePool;
import net.minecraft.data.client.ItemModelGenerator;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockTexturePool mossyStoneTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_STONE);
        mossyStoneTexturePool.stairs(ModBlocks.MOSSY_STONE_STAIRS);
        mossyStoneTexturePool.slab(ModBlocks.MOSSY_STONE_SLAB);
        mossyStoneTexturePool.pressurePlate(ModBlocks.MOSSY_STONE_PRESSURE_PLATE);
        mossyStoneTexturePool.button(ModBlocks.MOSSY_STONE_BUTTON);

        BlockTexturePool mossyAcaciaPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_ACACIA_PLANKS);
        mossyAcaciaPlanksTexturePool.stairs(ModBlocks.MOSSY_ACACIA_STAIRS);
        mossyAcaciaPlanksTexturePool.slab(ModBlocks.MOSSY_ACACIA_SLAB);
        mossyAcaciaPlanksTexturePool.pressurePlate(ModBlocks.MOSSY_ACACIA_PRESSURE_PLATE);
        mossyAcaciaPlanksTexturePool.button(ModBlocks.MOSSY_ACACIA_BUTTON);
        mossyAcaciaPlanksTexturePool.fence(ModBlocks.MOSSY_ACACIA_FENCE);
        mossyAcaciaPlanksTexturePool.fenceGate(ModBlocks.MOSSY_ACACIA_FENCE_GATE);

        BlockTexturePool mossyBambooPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_BAMBOO_PLANKS);
        mossyBambooPlanksTexturePool.stairs(ModBlocks.MOSSY_BAMBOO_STAIRS);
        mossyBambooPlanksTexturePool.slab(ModBlocks.MOSSY_BAMBOO_SLAB);
        mossyBambooPlanksTexturePool.pressurePlate(ModBlocks.MOSSY_BAMBOO_PRESSURE_PLATE);
        mossyBambooPlanksTexturePool.button(ModBlocks.MOSSY_BAMBOO_BUTTON);
        mossyBambooPlanksTexturePool.fence(ModBlocks.MOSSY_BAMBOO_FENCE);
        mossyBambooPlanksTexturePool.fenceGate(ModBlocks.MOSSY_BAMBOO_FENCE_GATE);

        BlockTexturePool mossyBirchPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_BIRCH_PLANKS);
        mossyBirchPlanksTexturePool.stairs(ModBlocks.MOSSY_BIRCH_STAIRS);
        mossyBirchPlanksTexturePool.slab(ModBlocks.MOSSY_BIRCH_SLAB);
        mossyBirchPlanksTexturePool.pressurePlate(ModBlocks.MOSSY_BIRCH_PRESSURE_PLATE);
        mossyBirchPlanksTexturePool.button(ModBlocks.MOSSY_BIRCH_BUTTON);
        mossyBirchPlanksTexturePool.fence(ModBlocks.MOSSY_BIRCH_FENCE);
        mossyBirchPlanksTexturePool.fenceGate(ModBlocks.MOSSY_BIRCH_FENCE_GATE);

        BlockTexturePool mossyCherryPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_CHERRY_PLANKS);
        mossyCherryPlanksTexturePool.stairs(ModBlocks.MOSSY_CHERRY_STAIRS);
        mossyCherryPlanksTexturePool.slab(ModBlocks.MOSSY_CHERRY_SLAB);
        mossyCherryPlanksTexturePool.pressurePlate(ModBlocks.MOSSY_CHERRY_PRESSURE_PLATE);
        mossyCherryPlanksTexturePool.button(ModBlocks.MOSSY_CHERRY_BUTTON);
        mossyCherryPlanksTexturePool.fence(ModBlocks.MOSSY_CHERRY_FENCE);
        mossyCherryPlanksTexturePool.fenceGate(ModBlocks.MOSSY_CHERRY_FENCE_GATE);

        BlockTexturePool mossyCrimsonPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_CRIMSON_PLANKS);
        mossyCrimsonPlanksTexturePool.stairs(ModBlocks.MOSSY_CRIMSON_STAIRS);
        mossyCrimsonPlanksTexturePool.slab(ModBlocks.MOSSY_CRIMSON_SLAB);
        mossyCrimsonPlanksTexturePool.pressurePlate(ModBlocks.MOSSY_CRIMSON_PRESSURE_PLATE);
        mossyCrimsonPlanksTexturePool.button(ModBlocks.MOSSY_CRIMSON_BUTTON);
        mossyCrimsonPlanksTexturePool.fence(ModBlocks.MOSSY_CRIMSON_FENCE);
        mossyCrimsonPlanksTexturePool.fenceGate(ModBlocks.MOSSY_CRIMSON_FENCE_GATE);

        BlockTexturePool mossyDarkOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DARK_OAK_PLANKS);
        mossyDarkOakPlanksTexturePool.stairs(ModBlocks.MOSSY_DARK_OAK_STAIRS);
        mossyDarkOakPlanksTexturePool.slab(ModBlocks.MOSSY_DARK_OAK_SLAB);
        mossyDarkOakPlanksTexturePool.pressurePlate(ModBlocks.MOSSY_DARK_OAK_PRESSURE_PLATE);
        mossyDarkOakPlanksTexturePool.button(ModBlocks.MOSSY_DARK_OAK_BUTTON);
        mossyDarkOakPlanksTexturePool.fence(ModBlocks.MOSSY_DARK_OAK_FENCE);
        mossyDarkOakPlanksTexturePool.fenceGate(ModBlocks.MOSSY_DARK_OAK_FENCE_GATE);

        BlockTexturePool mossyJunglePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_JUNGLE_PLANKS);
        mossyJunglePlanksTexturePool.stairs(ModBlocks.MOSSY_JUNGLE_STAIRS);
        mossyJunglePlanksTexturePool.slab(ModBlocks.MOSSY_JUNGLE_SLAB);
        mossyJunglePlanksTexturePool.pressurePlate(ModBlocks.MOSSY_JUNGLE_PRESSURE_PLATE);
        mossyJunglePlanksTexturePool.button(ModBlocks.MOSSY_JUNGLE_BUTTON);
        mossyJunglePlanksTexturePool.fence(ModBlocks.MOSSY_JUNGLE_FENCE);
        mossyJunglePlanksTexturePool.fenceGate(ModBlocks.MOSSY_JUNGLE_FENCE_GATE);

        BlockTexturePool mossyMangrovePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_MANGROVE_PLANKS);
        mossyMangrovePlanksTexturePool.stairs(ModBlocks.MOSSY_MANGROVE_STAIRS);
        mossyMangrovePlanksTexturePool.slab(ModBlocks.MOSSY_MANGROVE_SLAB);
        mossyMangrovePlanksTexturePool.pressurePlate(ModBlocks.MOSSY_MANGROVE_PRESSURE_PLATE);
        mossyMangrovePlanksTexturePool.button(ModBlocks.MOSSY_MANGROVE_BUTTON);
        mossyMangrovePlanksTexturePool.fence(ModBlocks.MOSSY_MANGROVE_FENCE);
        mossyMangrovePlanksTexturePool.fenceGate(ModBlocks.MOSSY_MANGROVE_FENCE_GATE);

        BlockTexturePool mossyOakPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_OAK_PLANKS);
        mossyOakPlanksTexturePool.stairs(ModBlocks.MOSSY_OAK_STAIRS);
        mossyOakPlanksTexturePool.slab(ModBlocks.MOSSY_OAK_SLAB);
        mossyOakPlanksTexturePool.pressurePlate(ModBlocks.MOSSY_OAK_PRESSURE_PLATE);
        mossyOakPlanksTexturePool.button(ModBlocks.MOSSY_OAK_BUTTON);
        mossyOakPlanksTexturePool.fence(ModBlocks.MOSSY_OAK_FENCE);
        mossyOakPlanksTexturePool.fenceGate(ModBlocks.MOSSY_OAK_FENCE_GATE);

        BlockTexturePool mossySprucePlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_SPRUCE_PLANKS);
        mossySprucePlanksTexturePool.stairs(ModBlocks.MOSSY_SPRUCE_STAIRS);
        mossySprucePlanksTexturePool.slab(ModBlocks.MOSSY_SPRUCE_SLAB);
        mossySprucePlanksTexturePool.pressurePlate(ModBlocks.MOSSY_SPRUCE_PRESSURE_PLATE);
        mossySprucePlanksTexturePool.button(ModBlocks.MOSSY_SPRUCE_BUTTON);
        mossySprucePlanksTexturePool.fence(ModBlocks.MOSSY_SPRUCE_FENCE);
        mossySprucePlanksTexturePool.fenceGate(ModBlocks.MOSSY_SPRUCE_FENCE_GATE);

        BlockTexturePool mossyWarpedPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_WARPED_PLANKS);
        mossyWarpedPlanksTexturePool.stairs(ModBlocks.MOSSY_WARPED_STAIRS);
        mossyWarpedPlanksTexturePool.slab(ModBlocks.MOSSY_WARPED_SLAB);
        mossyWarpedPlanksTexturePool.pressurePlate(ModBlocks.MOSSY_WARPED_PRESSURE_PLATE);
        mossyWarpedPlanksTexturePool.button(ModBlocks.MOSSY_WARPED_BUTTON);
        mossyWarpedPlanksTexturePool.fence(ModBlocks.MOSSY_WARPED_FENCE);
        mossyWarpedPlanksTexturePool.fenceGate(ModBlocks.MOSSY_WARPED_FENCE_GATE);

        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_GLASS, ModBlocks.MOSSY_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_BLACK_STAINED_GLASS, ModBlocks.MOSSY_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_BLUE_STAINED_GLASS, ModBlocks.MOSSY_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_BROWN_STAINED_GLASS, ModBlocks.MOSSY_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_CYAN_STAINED_GLASS, ModBlocks.MOSSY_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_GRAY_STAINED_GLASS, ModBlocks.MOSSY_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_GREEN_STAINED_GLASS, ModBlocks.MOSSY_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS, ModBlocks.MOSSY_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_LIME_STAINED_GLASS, ModBlocks.MOSSY_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_MAGENTA_STAINED_GLASS, ModBlocks.MOSSY_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_ORANGE_STAINED_GLASS, ModBlocks.MOSSY_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_PINK_STAINED_GLASS, ModBlocks.MOSSY_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_PURPLE_STAINED_GLASS, ModBlocks.MOSSY_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_RED_STAINED_GLASS, ModBlocks.MOSSY_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_TINTED_GLASS);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_WHITE_STAINED_GLASS, ModBlocks.MOSSY_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.MOSSY_YELLOW_STAINED_GLASS, ModBlocks.MOSSY_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_ACACIA_LOG).log(ModBlocks.MOSSY_ACACIA_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_BAMBOO_BLOCK).log(ModBlocks.MOSSY_BAMBOO_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_BIRCH_LOG).log(ModBlocks.MOSSY_BIRCH_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_CHERRY_LOG).log(ModBlocks.MOSSY_CHERRY_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_CRIMSON_STEM).log(ModBlocks.MOSSY_CRIMSON_STEM);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_DARK_OAK_LOG).log(ModBlocks.MOSSY_DARK_OAK_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_JUNGLE_LOG).log(ModBlocks.MOSSY_JUNGLE_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_MANGROVE_LOG).log(ModBlocks.MOSSY_MANGROVE_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_OAK_LOG).log(ModBlocks.MOSSY_OAK_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_SPRUCE_LOG).log(ModBlocks.MOSSY_SPRUCE_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_WARPED_STEM).stem(ModBlocks.MOSSY_WARPED_STEM);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_ACACIA_LOG).log(ModBlocks.MOSSY_STRIPPED_ACACIA_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_BAMBOO_BLOCK).log(ModBlocks.MOSSY_STRIPPED_BAMBOO_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_BIRCH_LOG).log(ModBlocks.MOSSY_STRIPPED_BIRCH_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_CHERRY_LOG).log(ModBlocks.MOSSY_STRIPPED_CHERRY_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_CRIMSON_STEM).log(ModBlocks.MOSSY_STRIPPED_CRIMSON_STEM);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG).log(ModBlocks.MOSSY_STRIPPED_DARK_OAK_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG).log(ModBlocks.MOSSY_STRIPPED_JUNGLE_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_MANGROVE_LOG).log(ModBlocks.MOSSY_STRIPPED_MANGROVE_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_OAK_LOG).log(ModBlocks.MOSSY_STRIPPED_OAK_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG).log(ModBlocks.MOSSY_STRIPPED_SPRUCE_LOG);
        blockStateModelGenerator.registerLog(ModBlocks.MOSSY_STRIPPED_WARPED_STEM).stem(ModBlocks.MOSSY_STRIPPED_WARPED_STEM);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
