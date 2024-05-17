package com.nemonotfound.nemosmossyblocks.entity;

import com.nemonotfound.nemosmossyblocks.entity.projectile.thrown.MossBallEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;
import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.log;

public class Entities {

    public static final EntityType<MossBallEntity> MOSS_BALL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "moss_ball"), EntityType.Builder
                    .<MossBallEntity>create(MossBallEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f, 0.25f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(10)
                    .build());

    public static void registerEntities() {
        log.debug("Register entities");
    }

}
