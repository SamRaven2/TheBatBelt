package com.bats.batbelt.handler;

import com.bats.batbelt.reference.Settings;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Bats on 4/26/2015.
 */
public class FuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        int[] fuelOreIds = OreDictionary.getOreIDs(fuel);

        if (fuelOreIds.length <= 0)
            return 0;

        if (Settings.CrossMod.fuelCoalDust)
        {
            int coalDustOreID = OreDictionary.getOreID("dustCoal");
            for (int i : fuelOreIds)
                if (i == coalDustOreID)
                    return 200;
        }

        if (Settings.CrossMod.fuelCharcoalDust)
        {
            int charcoalDustOreID = OreDictionary.getOreID("dustCharcoal");
            for (int i : fuelOreIds)
                if (i == charcoalDustOreID)
                    return 200;
        }

        return 0;
    }
}
