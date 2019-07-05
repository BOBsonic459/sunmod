package com.sunproject.sunmods.stmagic.mods.EventsEntity.PlayerArmor;

import com.sunproject.sunmods.stmagic.mods.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSunArmor_Berilium extends ItemArmor{

	  public ItemSunArmor_Berilium(ArmorMaterial ArmorMaterial, int type)
	    {
	        super(ArmorMaterial, 0, type);
	    }

	  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	    {
	        if(slot == 2)
	        {
	            return Reference.MOD_ID + ":textures/armor/bérylium_layer_2.png";
	        }
	        return Reference.MOD_ID + ":textures/armor/bérylium_layer_1.png";

	 }
}