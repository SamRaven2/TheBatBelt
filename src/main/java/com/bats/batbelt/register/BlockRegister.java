package com.bats.batbelt.register;

import com.bats.batbelt.block.BlockHydrator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by Bats on 4/27/2015.
 */
public class BlockRegister
{
    public static Block blockHydrator = new BlockHydrator();

    public static void init()
    {
        GameRegistry.registerBlock(blockHydrator, "blockHydrator");
    }
}
