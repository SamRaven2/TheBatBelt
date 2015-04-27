package com.bats.batbelt.block;

import com.bats.batbelt.creativetab.CreativeTabBatBelt;
import com.bats.batbelt.reference.ModRef;
import com.bats.batbelt.utility.CallerProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Bats on 4/27/2015.
 */
public class BlockHydrator extends Block
{
    private String internalName;
    private CallerProvider callerProvider = new CallerProvider();

    public BlockHydrator()
    {
        super(Material.rock);
        this.internalName = "blockHydrator";
        setHardness(2.0f);
        setCreativeTab(CreativeTabBatBelt.BATBELT_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return "block." + ModRef.LC_MOD_ID + ":" + this.internalName;
    }

    @Override
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(ModRef.LC_MOD_ID + ":" + internalName);
    }

    @Override
    public Material getMaterial()
    {
        if (callerProvider.getCallerClass() == BlockFarmland.class)
            return Material.water;
        return super.getMaterial();
    }
}
