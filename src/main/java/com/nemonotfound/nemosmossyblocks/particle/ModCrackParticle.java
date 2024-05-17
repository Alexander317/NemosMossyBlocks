package com.nemonotfound.nemosmossyblocks.particle;

import com.nemonotfound.nemosmossyblocks.item.ModItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.CrackParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.SimpleParticleType;

@Environment(value= EnvType.CLIENT)
public class ModCrackParticle extends CrackParticle {

    protected ModCrackParticle(ClientWorld world, double x, double y, double z, ItemStack stack) {
        super(world, x, y, z, stack);
    }

    @Environment(value=EnvType.CLIENT)
    public static class MossBallFactory
            implements ParticleFactory<SimpleParticleType> {

        @Override
        public Particle createParticle(SimpleParticleType simpleParticleType, ClientWorld clientWorld,
                                       double d, double e, double f, double g, double h, double i) {
            return new ModCrackParticle(clientWorld, d, e, f, new ItemStack(ModItems.MOSS_BALL));
        }
    }
}

