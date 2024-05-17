package com.nemonotfound.nemosmossyblocks.entity.projectile.thrown;

import com.nemonotfound.nemosmossyblocks.entity.Entities;
import com.nemonotfound.nemosmossyblocks.item.ModItems;
import com.nemonotfound.nemosmossyblocks.particle.Particles;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class MossBallEntity extends ThrownItemEntity {

    public MossBallEntity(EntityType<MossBallEntity> entityType, World world) {
        super(entityType, world);
    }

    public MossBallEntity(World world, LivingEntity owner) {
        super(Entities.MOSS_BALL, owner, world);
    }

    public MossBallEntity(World world, double x, double y, double z) {
        super(Entities.MOSS_BALL, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.MOSS_BALL;
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getStack();
        return itemStack.isEmpty() || itemStack.isOf(this.getDefaultItem()) ? Particles.ITEM_MOSS_BALL :
                new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack);
    }

    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            ParticleEffect particleEffect = this.getParticleParameters();
            for (int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(),
                        0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = entity instanceof BlazeEntity ? 3 : 0;
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), i);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.discard();
        }
    }
}
