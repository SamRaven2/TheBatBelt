package com.bats.batbelt.register;

import com.bats.batbelt.item.ItemCobbleGen;
import com.bats.batbelt.item.ItemDiamondBlockArmor;
import com.bats.batbelt.item.ItemMiniCoal;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Bats on 4/26/2015.
 */
public class ItemRegister
{
    public static Item itemCobbleGen = new ItemCobbleGen();
    public static Item itemMiniCoal = new ItemMiniCoal();
    public static Item itemDiamondBlockHelm = new ItemDiamondBlockArmor(0);
    public static Item itemDiamondBlockTunic = new ItemDiamondBlockArmor(1);
    public static Item itemDiamondBlockLegs = new ItemDiamondBlockArmor(2);
    public static Item itemDiamondBlockBoots = new ItemDiamondBlockArmor(3);

    public static void init()
    {
        GameRegistry.registerItem(itemCobbleGen, "itemCobbleGen");
        GameRegistry.registerItem(itemMiniCoal, "itemMiniCoal");
        GameRegistry.registerItem(itemDiamondBlockHelm, "itemDiamondBlockHelm");
        GameRegistry.registerItem(itemDiamondBlockTunic, "itemDiamondBlockTunic");
        GameRegistry.registerItem(itemDiamondBlockLegs, "itemDiamondBlockLegs");
        GameRegistry.registerItem(itemDiamondBlockBoots, "itemDiamondBlockBoots");
    }
}
