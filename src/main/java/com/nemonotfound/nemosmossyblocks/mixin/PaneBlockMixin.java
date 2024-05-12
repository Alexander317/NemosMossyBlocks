package com.nemonotfound.nemosmossyblocks.mixin;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PaneBlock;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.block.ConnectingBlock.FACING_PROPERTIES;

@Mixin(PaneBlock.class)
public class PaneBlockMixin {

    @Inject(method = "isSideInvisible", at = @At("HEAD"), cancellable = true)
    private void isSideInvisible(BlockState state, BlockState stateFrom, Direction direction,
                                 CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (shouldBeInvisible(state, stateFrom)) {
            if (!direction.getAxis().isHorizontal()) {
                callbackInfoReturnable.setReturnValue(true);
            }
            else if (statesFaceEachOther(state, stateFrom, direction)) {
                callbackInfoReturnable.setReturnValue(true);
            }
        }
    }

    @Unique
    private boolean statesFaceEachOther(BlockState state, BlockState stateFrom, Direction direction) {
        return state.get(FACING_PROPERTIES.get(direction)) &&
                stateFrom.get(FACING_PROPERTIES.get(direction.getOpposite()));
    }

    @Unique
    private boolean shouldBeInvisible(BlockState state, BlockState stateFrom) {
     return (state.isOf(ModBlocks.MOSSY_IRON_BARS) && stateFrom.isOf(Blocks.IRON_BARS)) ||
             (state.isOf(Blocks.IRON_BARS) && stateFrom.isOf(ModBlocks.MOSSY_IRON_BARS));
    }
}
