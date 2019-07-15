package com.sunproject.sunmods.stmagic.mods.EventsEntity.PlayerArmor;

import com.sunproject.sunmods.stmagic.mods.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSunArmor_Scandium extends ItemArmor {

	public ItemSunArmor_Scandium(ArmorMaterial ArmorMaterial, int type) {
		super(ArmorMaterial, 0, type);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (slot == 2) {
			return Reference.MOD_ID + ":textures/armor/diamond_layer_2.png";
		}
		return Reference.MOD_ID + ":textures/armor/diamond_layer_1.png";

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		ItemStack boots = player.getEquipmentInSlot(3);
		if (boots != null) {
			player.motionX = 0.5F;
			player.motionY = 0.5F;
			
		}
	}
}