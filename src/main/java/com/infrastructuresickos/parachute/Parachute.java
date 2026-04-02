package com.infrastructuresickos.parachute;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("parachute")
public class Parachute {
    public static final String MOD_ID = "parachute";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public Parachute() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Parachute initialized");
    }
}
