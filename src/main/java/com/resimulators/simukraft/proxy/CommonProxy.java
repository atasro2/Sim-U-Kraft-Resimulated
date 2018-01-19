package com.resimulators.simukraft.proxy;

import com.resimulators.simukraft.init.*;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;

/**
 * Created by fabbe on 06/01/2018 - 2:43 AM.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModFluids.init();
        ModBlocks.init();
        ModItems.init();
        ModTileEntities.init();
        ModEntities.init();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }

    public void onServerStarted(FMLServerStartedEvent event) {

    }
}
