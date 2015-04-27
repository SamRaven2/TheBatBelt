package com.bats.batbelt.item;

import com.bats.batbelt.creativetab.CreativeTabBatBelt;
import com.bats.batbelt.reference.ModRef;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Bats on 4/27/2015.
 */
public class ItemMiniCoal extends Item
{
    private String internalName;

    public ItemMiniCoal()
    {
        this.internalName = "itemMiniCoal";
        setCreativeTab(CreativeTabBatBelt.BATBELT_TAB);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(ModRef.LC_MOD_ID + ":" + internalName);
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
}
