package com.sunproject.sunmods.stmagic.mods.EventsEntity.PlayerArmor;

import com.sunproject.sunmods.stmagic.mods.Reference;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ModItem;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemSunArmor_Scandium extends ItemArmor{

	  public ItemSunArmor_Scandium(ArmorMaterial ArmorMaterial, int type)
	    {
	        super(ArmorMaterial, 0, type);
	    }

	  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	    {
	        if(slot == 2)
	        {
	            return Reference.MOD_ID + ":textures/armor/diamond_layer_2.png";
	        }
	        return Reference.MOD_ID + ":textures/armor/diamond_layer_1.png";

	 }
}