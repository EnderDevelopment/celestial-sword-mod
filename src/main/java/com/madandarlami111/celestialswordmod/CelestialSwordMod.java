package com.madandarlami111.celestialswordmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CelestialSwordMod implements ModInitializer {
    public static final String MOD_ID = "celestialswordmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Celestial Sword Mod has been initialized!");
    }
}