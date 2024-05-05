package com.nemonotfound.nemosmossyblocks.mixin;

import com.nemonotfound.nemosmossyblocks.block.BlockUtils;
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

import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeItemMixin {

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
        return Optional.ofNullable(BlockUtils.STRIPPED_MOSSY_BLOCKS.get(state.getBlock())).map(block ->
                block.getDefaultState().with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)));
    }
}
