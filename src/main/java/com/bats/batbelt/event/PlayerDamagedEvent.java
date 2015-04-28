package com.bats.batbelt.event;

import com.bats.batbelt.reference.Settings;
import com.bats.batbelt.register.ItemRegister;
import com.bats.batbelt.utility.ForgeLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import java.util.Random;

/**
 * Created by Bats on 4/27/2015.
 */
public class PlayerDamagedEvent
{
    Random random = new Random();
    int chance;

    @SubscribeEvent
    public void playerDamagedEvent(LivingHurtEvent event)
    {
        if(Settings.Armor.effectOn && event.entityLiving instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.entityLiving;
            if(player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ItemRegister.itemDiamondBlockTunic)
            {
                chance = random.nextInt(100);
                if(chance == 99)
                {
                    if(Settings.Armor.easyMode)
                        player.addPotionEffect(new PotionEffect(19, 120, 1, false));
                    else
                        player.addPotionEffect(new PotionEffect(20, 120, 1, false));
                }
            }
        }
    }
}
