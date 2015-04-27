package com.bats.batbelt.creativetab;

import com.bats.batbelt.reference.ModRef;
import com.bats.batbelt.register.ItemRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Bats on 4/26/2015.
 */
public class CreativeTabBatBelt
{
    public static final CreativeTabs BATBELT_TAB = new CreativeTabs(ModRef.LC_MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ItemRegister.itemCobbleGen;
        }
    };
}
