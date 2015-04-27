package com.bats.batbelt.register;

import com.bats.batbelt.reference.Settings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Bats on 4/27/2015.
 */
public class RecipeRegister
{
    public static void init()
    {
        if (Settings.Items.itemCobbleGen)
        {
            GameRegistry.addShapedRecipe(new ItemStack(ItemRegister.itemCobbleGen), "lpw", "bsb", "isi", 'l', Items.lava_bucket, 'p', Items.iron_pickaxe, 'w', Items.water_bucket, 'b', Blocks.iron_block, 's', Items.stick, 'i', Items.iron_ingot);
            GameRegistry.addShapedRecipe(new ItemStack(ItemRegister.itemCobbleGen), "wpl", "bsb", "isi", 'l', Items.lava_bucket, 'p', Items.iron_pickaxe, 'w', Items.water_bucket, 'b', Blocks.iron_block, 's', Items.stick, 'i', Items.iron_ingot);
        }

        if (Settings.Blocks.blockHydrator)
        {
            GameRegistry.addShapedRecipe(new ItemStack(BlockRegister.blockHydrator), "lwl", "wrw", "lwl", 'l', Blocks.lapis_block, 'w', Items.water_bucket, 'r', Items.redstone);
        }
    }
}
