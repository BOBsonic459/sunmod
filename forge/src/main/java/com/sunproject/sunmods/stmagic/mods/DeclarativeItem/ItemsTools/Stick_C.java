package com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ItemsTools;

import com.sunproject.sunmods.stmagic.mods.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Stick_C extends Item{
	public static Item Stick_C;
	
	
	public static void Init() {
	Stick_C = new Item().setTextureName(Reference.MOD_ID + ":Stick_C");

	}
	
	public static void Register() {
		GameRegistry.registerItem(Stick_C, "Stick_C");
	}
}

