package com.nemonotfound.nemosmossyblocks.mixin;

import com.nemonotfound.nemosmossyblocks.block.BlockUtils;
import com.nemonotfound.nemosmossyblocks.item.ModItems;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ShearsItem;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Collection;
import java.util.Optional;

@Mixin(ShearsItem.class)
public class ShearsItemMixin {

    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    private void useOnBlock(ItemUsageContext context, CallbackInfoReturnable<ActionResult> callbackInfoReturnable) {
        PlayerEntity playerEntity = context.getPlayer();
        BlockPos blockPos = context.getBlockPos();
        World world = context.getWorld();
        Optional<BlockState> optional = this.tryShear(world, blockPos, playerEntity, world.getBlockState(blockPos));

        if (optional.isPresent()) {
            ItemStack itemStack = context.getStack();
            if (playerEntity instanceof ServerPlayerEntity) {
                Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);
            }
            world.setBlockState(blockPos, optional.get(), Block.NOTIFY_ALL_AND_REDRAW);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, optional.get()));
            ItemScatterer.spawn(world, blockPos, DefaultedList.ofSize(1, new ItemStack(ModItems.MOSS_BALL)));

            if (playerEntity != null) {
                itemStack.damage(1, playerEntity, LivingEntity.getSlotForHand(context.getHand()));
            }

            callbackInfoReturnable.setReturnValue(ActionResult.success(world.isClient));
        }

    }

    @Unique
    private Optional<BlockState> tryShear(World world, BlockPos pos, @Nullable PlayerEntity player, BlockState state) {
        Optional<BlockState> optional = this.getShearedState(state);

        if (optional.isPresent()) {
            world.playSound(player, pos, SoundEvents.ENTITY_SHEEP_SHEAR, SoundCategory.BLOCKS, 1.0f, 1.0f);
            return optional;
        }

        return Optional.empty();
    }

    @Unique
    private Optional<BlockState> getShearedState(BlockState state) {
        Optional<Block> optionalBlock = Optional.ofNullable(BlockUtils.SHEARED_MOSSY_BLOCKS.get(state.getBlock()));

        if (optionalBlock.isPresent()) {
            Block mossyBlock = optionalBlock.get();
            Collection<Property<?>> properties = state.getProperties();
            BlockState defaultState = mossyBlock.getDefaultState();

            for (Property property:properties) {
                defaultState = defaultState.with(property, state.get(property));
            }

            return Optional.of(defaultState);
        }

        return Optional.empty();
    }
}
