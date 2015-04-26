package com.bats.batbelt.item;

import com.bats.batbelt.creativetab.CreativeTabBatBelt;
import com.bats.batbelt.reference.ModRef;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Bats on 4/26/2015.
 */
public class ItemCobbleGen extends Item
{
    private String internalName;
    private ItemStack cobbleStack;
    private AxisAlignedBB axisAligned;

    public ItemCobbleGen()
    {
        this.internalName = "itemCobbleGen";
        setCreativeTab(CreativeTabBatBelt.BATBELT_TAB);
    }

    @Override
    public int getItemStackLimit(ItemStack stack)
    {
        return 1;
    }

    @Override
    public String getUnlocalizedName()
    {
        return "item." + ModRef.LC_MOD_ID + ":" + this.internalName;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return getUnlocalizedName();
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        return cobbleStack.tryPlaceItemIntoWorld(player, world, x, y, z, side, hitX, hitY, hitZ);
    }
}
