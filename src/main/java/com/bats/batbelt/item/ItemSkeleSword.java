package com.bats.batbelt.item;

import com.bats.batbelt.creativetab.CreativeTabBatBelt;
import com.bats.batbelt.reference.ModRef;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

/**
 * Created by Bats on 5/2/2015.
 */
public class ItemSkeleSword extends Item
{

    //Base Item
    private String internalName;

    public ItemSkeleSword()
    {
        this.internalName = "itemSkeleSword";
        setMaxDamage(33);
        setMaxStackSize(1);
        setNoRepair();
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

    //Item Specific Methods

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
        if(entity instanceof EntitySkeleton)
        {
            EntitySkeleton skele = (EntitySkeleton) entity;
            if(skele.getSkeletonType() == 1)
            {
                skele.attackEntityFrom(DamageSource.causePlayerDamage(player),2.0F);
                return false;
            }
        }

        if(entity instanceof EntityLivingBase)
        {
            entity.worldObj.newExplosion(entity,entity.posX,entity.posY,entity.posZ,3.0F,false,true);
            player.attackEntityFrom(DamageSource.magic,1000.0F);
            stack.stackSize = 0;
            return false;
        }

        return true;
    }
}
