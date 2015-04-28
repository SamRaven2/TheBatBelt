package com.bats.batbelt.item;

import com.bats.batbelt.creativetab.CreativeTabBatBelt;
import com.bats.batbelt.reference.ModRef;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Bats on 4/27/2015.
 */
public class ItemDiamondBlockArmor extends ItemArmor
{

    public static ArmorMaterial DIAMOND_BLOCK = EnumHelper.addArmorMaterial("DIAMOND_BLOCK", 300, new int[]{4,10,7,4}, 0);
    private String internalName;

    public ItemDiamondBlockArmor(int type)
    {
        super(DIAMOND_BLOCK, 0, type);
        switch(type)
        {
            case 0:
                this.internalName = "itemDiamondBlockHelm";
                break;
            case 1:
                this.internalName = "itemDiamondBlockTunic";
                break;
            case 2:
                this.internalName = "itemDiamondBlockLegs";
                break;
            case 3:
                this.internalName = "itemDiamondBlockBoots";
                break;
        }
        setCreativeTab(CreativeTabBatBelt.BATBELT_TAB);
    }

    @Override
    public boolean getIsRepairable(ItemStack stack, ItemStack stack2)
    {
        return false;
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
