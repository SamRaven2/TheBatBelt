package com.bats.batbelt;

import com.bats.batbelt.handler.ConfigHandler;
import com.bats.batbelt.handler.FuelHandler;
import com.bats.batbelt.reference.ModRef;
import com.bats.batbelt.register.ItemRegister;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Bats on 4/25/2015.
 */

@Mod(modid = ModRef.MOD_ID, name = ModRef.MOD_NAME, version = ModRef.MOD_VERSION)
public class BatBelt
{
    @Instance(ModRef.MOD_ID)
    public static BatBelt instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ItemRegister.init();
    }

    @EventHandler
     public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerFuelHandler(new FuelHandler());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}