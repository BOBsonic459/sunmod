package com.sunproject.sunmods.stmagic.mods.EventsEntity.PlayerArmor;

import com.sunproject.sunmods.stmagic.mods.Reference;
import com.sunproject.sunmods.stmagic.mods.SunmodMain;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ModItem;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class PlayerArmor extends Item{
	// Declarative
	public static Item Helemet, Leegings, 
	boots, chestPlate, Berilium_chestPlate,
	Berilium_Helemet, Berilium_Boots, Berilium_Leegings;
	
	public static ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial("PlayerArmor", 9999, new int[] {0, 2, 1, 3}, 1064);

	
	
	public static void Init() {
				// Function for initialize variables and Items
		
		Helemet = new ItemSunArmor_Scandium(armorMaterial, 0)
				.setUnlocalizedName("Helmet")
				.setTextureName(Reference.MOD_ID + ":diamond_helmet")
				.setCreativeTab(SunmodMain.MyTab);
		Leegings = new ItemSunArmor_Scandium(armorMaterial, 2)
				.setUnlocalizedName("Leegings")
				.setTextureName(Reference.MOD_ID + ":diamond_leggings")
				.setCreativeTab(SunmodMain.MyTab);

		chestPlate = new ItemSunArmor_Scandium(armorMaterial, 1)
				.setUnlocalizedName("chestPlate")
				.setTextureName(Reference.MOD_ID + ":diamond_chestplate")
				.setCreativeTab(SunmodMain.MyTab);
		boots = new ItemSunArmor_Scandium(armorMaterial, 3)
				.setUnlocalizedName("boots")
				.setTextureName(Reference.MOD_ID + ":diamond_boots")
				.setCreativeTab(SunmodMain.MyTab);
		
		Berilium_chestPlate = new ItemSunArmor_Berilium(armorMaterial, 1)
				.setUnlocalizedName("BeriliumChestPlate")
				.setTextureName(Reference.MOD_ID + ":bérylium_chestplate")
				.setCreativeTab(SunmodMain.MyTab);
		
		Berilium_Helemet = new ItemSunArmor_Berilium(armorMaterial, 0)
				.setUnlocalizedName("BeriliumHelemet")
				.setTextureName(Reference.MOD_ID + ":bérylium_helmet")
				.setCreativeTab(SunmodMain.MyTab);
		
		Berilium_Boots = new ItemSunArmor_Berilium(armorMaterial, 3)
				.setUnlocalizedName("BeriliumBoots")
				.setTextureName(Reference.MOD_ID + ":bérylium_boots")
				.setCreativeTab(SunmodMain.MyTab);
		
		Berilium_Leegings = new ItemSunArmor_Berilium(armorMaterial, 2)
				.setUnlocalizedName("BeriliumLeegings")
				.setTextureName(Reference.MOD_ID + ":bérylium_leggings")
				.setCreativeTab(SunmodMain.MyTab);
	}
	

	
	public static void Register() {
		GameRegistry.registerItem(Leegings, "Leegings");
			// Craft Leegings
				GameRegistry.addRecipe(new ItemStack(Leegings), new Object[] {
						"SSS",
						"S#S",
						"S#S", 'S', ModItem.ItemScandium});
				
				////////////////////////////////////////////////////////////////////////
				
		GameRegistry.registerItem(Helemet, "Helmet");
			// Craft Helmet 
				GameRegistry.addRecipe(new ItemStack(Helemet), new Object[] {
						"###",
						"SSS",
						"S#S", 'S', ModItem.ItemScandium
						});
				
				////////////////////////////////////////////////////////////////////////
				
		GameRegistry.registerItem(chestPlate, "chestPlate");
			// Craft chestPlate
					GameRegistry.addRecipe(new ItemStack(chestPlate), new Object[] {
							"S#S",
							"SSS",
							"SSS", 'S', ModItem.ItemScandium
							});
					
		GameRegistry.registerItem(boots, "boots");
				// Craft Boots
					GameRegistry.addRecipe(new ItemStack(boots), new Object[] {
							"###",
							"S#S",
							"S#S", 'S', ModItem.ItemScandium
					});
					
				////////////////////////////////////////////////////////////////////////
				GameRegistry.registerItem(Berilium_Boots, "BeriliumBoots");
				GameRegistry.registerItem(Berilium_Helemet, "BeriliumHelemet");
				GameRegistry.registerItem(Berilium_Leegings, "BeriliumLeegings");
				GameRegistry.registerItem(Berilium_chestPlate, "beriliumChestplate");
	}
	
   }
