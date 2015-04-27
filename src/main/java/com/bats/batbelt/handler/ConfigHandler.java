package com.bats.batbelt.handler;

import com.bats.batbelt.reference.ModRef;
import com.bats.batbelt.reference.Settings;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Bats on 4/25/2015.
 */
public class ConfigHandler
{
    public static Configuration config;

    public static void init(File configFile)
    {
        if (config == null)
        {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    private static void loadConfig()
    {
        Settings.CrossMod.fuelCharcoalDust = config.getBoolean("fuelCharcoalDust", Configuration.CATEGORY_GENERAL, true, "Does charcoal dust function as fuel?");
        Settings.CrossMod.fuelCoalDust = config.getBoolean("fuelCoalDust", Configuration.CATEGORY_GENERAL, true, "Does coal dust function as fuel?");

        Settings.Items.itemCobbleGen = config.getBoolean("itemCobbleGen", "Items", true, "Is the handheld cobble gen enabled?");
        Settings.Items.itemMiniCoal = config.getBoolean("itemMiniCoal", "Items", true, "Is the miniature coal enabled?");

        Settings.Blocks.blockHydrator = config.getBoolean("blockHydrator", "Blocks", true, "Is the farm hydrator block enabled?");

        if (config.hasChanged())
            config.save();
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(ModRef.MOD_ID))
            loadConfig();
    }
}
