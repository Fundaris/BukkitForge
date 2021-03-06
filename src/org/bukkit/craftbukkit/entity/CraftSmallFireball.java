package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.projectile.EntitySmallFireball;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.SmallFireball;
//import org.bukkit.craftbukkit.CraftServer;

public class CraftSmallFireball extends CraftFireball implements SmallFireball {
    public CraftSmallFireball(CraftServer server, EntitySmallFireball entity) {
        super(server, entity);
    }

    @Override
    public EntitySmallFireball getHandle() {
        return (EntitySmallFireball) entity;
    }

    @Override
    public String toString() {
        return "CraftSmallFireball";
    }

    public EntityType getType() {
        return EntityType.SMALL_FIREBALL;
    }
}
