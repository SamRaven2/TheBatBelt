package com.bats.batbelt.register;

import com.bats.batbelt.item.ItemCobbleGen;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Bats on 4/26/2015.
 */
public class ItemRegister
{
    public static Item itemCobbleGen = new ItemCobbleGen();

    public static void init()
    {
        GameRegistry.registerItem(itemCobbleGen, "itemCobbleGen");
    }
}
