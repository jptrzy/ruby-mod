package net.jptrzy.ruby;


import net.fabricmc.api.ModInitializer;
import net.jptrzy.ruby.registry.ItemsRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
    public static final String MOD_ID = "ruby";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ItemsRegistry.init();

        LOGGER.info("Hello Fabric world!");
    }
}