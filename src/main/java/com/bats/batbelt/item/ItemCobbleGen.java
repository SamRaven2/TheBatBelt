package com.bats.batbelt.item;

import com.bats.batbelt.creativetab.CreativeTabBatBelt;
import com.bats.batbelt.reference.ModRef;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

/**
 * Created by Bats on 4/26/2015.
 */
public class ItemCobbleGen extends Item
{
    private String internalName;
    private ItemStack cobbleStack = new ItemStack(Blocks.cobblestone);

    public ItemCobbleGen()
    {
        this.internalName = "itemCobbleGen";
        setCreativeTab(CreativeTabBatBelt.BATBELT_TAB);
    }

    @Override
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(ModRef.LC_MOD_ID + ":" + internalName);
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
        int posX = x;
        int posY = y;
        int posZ = z;

        switch (side)
        {
            case 0:
                --posY;
                break;
            case 1:
                ++posY;
                break;
            case 2:
                --posZ;
                break;
            case 3:
                ++posZ;
                break;
            case 4:
                --posX;
                break;
            case 5:
                ++posX;
                break;
        }

        cobbleStack.stackSize = 1;

        AxisAlignedBB blockBounds = AxisAlignedBB.getBoundingBox(posX, posY, posZ, posX + 1, posY + 1, posZ + 1);
        AxisAlignedBB playerBounds = player.boundingBox;

        return !playerBounds.intersectsWith(blockBounds) && cobbleStack.tryPlaceItemIntoWorld(player, world, x, y, z, side, hitX, hitY, hitZ);
    }
}
