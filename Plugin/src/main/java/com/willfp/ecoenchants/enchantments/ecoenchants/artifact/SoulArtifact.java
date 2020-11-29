package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import com.willfp.ecoenchants.util.internal.Prerequisite;
import org.bukkit.Particle;

public class SoulArtifact extends Artifact {
    public SoulArtifact() {
        super(
                "soul_artifact",
                Prerequisite.MinVer1_16
        );
    }

    @Override
    public Particle getParticle() {
        return Particle.SOUL;
    }
}