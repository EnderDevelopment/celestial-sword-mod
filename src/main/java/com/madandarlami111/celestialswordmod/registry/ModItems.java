package com.madandarlami111.celestialswordmod.registry;

import com.madandarlami111.celestialswordmod.CelestialSwordMod;
import com.madandarlami111.celestialswordmod.items.CelestialSwordItem;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item CELESTIAL_SWORD = new CelestialSwordItem();

    public static void register() {
        Registry.register(Registry.ITEM, new ResourceLocation(CelestialSwordMod.MOD_ID, "celestial_sword"), CELESTIAL_SWORD);
    }
}