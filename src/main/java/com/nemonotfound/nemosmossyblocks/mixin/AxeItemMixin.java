package com.nemonotfound.nemosmossyblocks.mixin;

import com.google.common.collect.ImmutableMap;
import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;
import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeItemMixin {

    @Unique
    private static final Map<Block, Block> STRIPPED_MOSSY_BLOCKS = new ImmutableMap.Builder<Block, Block>()
//            .put(Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD)
//            .put(Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG)
//            .put(Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD)
//            .put(Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG)
//            .put(Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD)
//            .put(Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG)
//            .put(Blocks.CHERRY_WOOD, Blocks.STRIPPED_CHERRY_WOOD)
//            .put(Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG)
//            .put(Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD)
//            .put(Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG)
//            .put(Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD)
//            .put(Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG)
//            .put(Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD)
//            .put(Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG)
//            .put(Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM)
//            .put(Blocks.WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE)
//            .put(Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM)
//            .put(Blocks.CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE)
//            .put(Blocks.MANGROVE_WOOD, Blocks.STRIPPED_MANGROVE_WOOD)
//            .put(Blocks.MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG)
//            .put(Blocks.BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK)
            //.put(ModBlocks.MOSSY_OAK_LOG, Blocks.STRIPPED_OAK_LOG)
//            .put(ModBlocks.MOSSY_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG)
//            .put(ModBlocks.MOSSY_ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG)
//            .put(ModBlocks.MOSSY_CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG)
//            .put(ModBlocks.MOSSY_BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG)
//            .put(ModBlocks.MOSSY_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG)
//            .put(ModBlocks.MOSSY_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG)
//            .put(ModBlocks.MOSSY_WARPED_STEM, Blocks.STRIPPED_WARPED_STEM)
//            .put(ModBlocks.MOSSY_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM)
//            .put(ModBlocks.MOSSY_MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG)
//            .put(ModBlocks.MOSSY_BAMBOO_BLOCK, Blocks.STRIPPED_BAMBOO_BLOCK)
            .build();

    @Inject(method = "tryStrip", at = @At("HEAD"), cancellable = true)
    private void tryStrip(World world, BlockPos pos, @Nullable PlayerEntity player, BlockState state,
                                          CallbackInfoReturnable<Optional<BlockState>> callbackInfoReturnable) {
        Optional<BlockState> optional = this.getMossyStrippedState(state);
        if (optional.isPresent()) {
            world.playSound(player, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
            callbackInfoReturnable.setReturnValue(optional);
        }
    }

    @Unique
    private Optional<BlockState> getMossyStrippedState(BlockState state) {
        return Optional.ofNullable(ModBlocks.STRIPPED_MOSSY_BLOCKS.get(state.getBlock())).map(block ->
                block.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)));
    }
}
