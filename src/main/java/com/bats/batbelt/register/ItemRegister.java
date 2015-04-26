package com.bats.batbelt.register;

import com.bats.batbelt.item.ItemCobbleGen;
import com.bats.batbelt.reference.Settings;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Bats on 4/26/2015.
 */
public class ItemRegister
{
    public static ItemCobbleGen itemCobbleGen = new ItemCobbleGen();

    public static void init()
    {
        if(Settings.Items.itemCobbleGen)
            GameRegistry.registerItem(itemCobbleGen, "itemCobbleGen");
    }
}
