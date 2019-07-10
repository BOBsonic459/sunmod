package com.sunproject.sunmods.stmagic.mods.DeclarativeItem;

import com.sunproject.sunmods.stmagic.mods.Reference;
import com.sunproject.sunmods.stmagic.mods.SunmodMain;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ItemsTools.HoeMaterial;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ItemsTools.ItemHache;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ItemsTools.ItemShovel;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ItemsTools.ItemSwordTools;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ItemsTools.ItemToolsAxe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModItem {

	public static ToolMaterial scandiumMaterial = EnumHelper.addToolMaterial("scandiumMaterial", 0, 9000, 9, 8, 5);
	public static ToolMaterial BeriliumSwordMaterial = EnumHelper.addToolMaterial("BeriliumSwordMaterial", 0, 10000, 10,
			10, 8);
	public static ToolMaterial ScandiumAxeMaterial = EnumHelper.addToolMaterial("PiocheMaterial", 5, 8000, 30, 3, 5);
	public static ToolMaterial BeriliumAxeMaterial = EnumHelper.addToolMaterial("BeriliumAxeMAterial", 5, 10000, 20, 20,
			2);
	public static ToolMaterial Pellematerial = EnumHelper.addToolMaterial("PelleMaterial", 5, 8000, 30, 3, 5);
	public static ToolMaterial BeriliumShovelmaterial = EnumHelper.addToolMaterial("BeriliumShovelMaterial", 5, 10500,
			35, 4, 2);
	public static ToolMaterial HoueMaterial = EnumHelper.addToolMaterial("HoueMaterial", 0, 8000, 900, 3, 5);
	public static ToolMaterial BeriliumHoeMaterial = EnumHelper.addToolMaterial("BeriliumHoeMaterial", 0, 7560, 860, 1,
			7);
	public static ToolMaterial AxeMaterial = EnumHelper.addToolMaterial("AxeScandium", 1, 8000, 30, 3, 5);
	public static ToolMaterial BeriliumPicAxeMaterial = EnumHelper.addToolMaterial("BeriliumAxeMaterial", 5, 10000, 20,
			20, 2);
	public static Item ItemSword, IconMagic, ItemScandium, ItemToolsAxe, ItemScandiumPelle, ItemHache, ItemHoue,
			Stick_C, BeriliumAxe, BeriliumPicaxe, BeriliumSword, BeriliumShovel, Beriliumhoe, BeriliumIngot;

	public static void init() {

		ItemHoue = new HoeMaterial(HoueMaterial)

				.setCreativeTab(SunmodMain.MyTab).setUnlocalizedName("Houe").setFull3D()
				.setTextureName(Reference.MOD_ID + ":Scandium_Houe");

		ItemHache = new ItemHache(AxeMaterial)

				.setUnlocalizedName("HacheScandium").setTextureName(Reference.MOD_ID + ":Scandium_hache")
				.setCreativeTab(SunmodMain.MyTab);

		ItemScandiumPelle = new ItemShovel(Pellematerial)

				.setUnlocalizedName("ScandiumPelle").setTextureName(Reference.MOD_ID + ":Scandium_pelle")
				.setCreativeTab(SunmodMain.MyTab);

		ItemToolsAxe = new ItemToolsAxe(ScandiumAxeMaterial)

				.setUnlocalizedName("Pioche scandium").setCreativeTab(SunmodMain.MyTab)
				.setTextureName(Reference.MOD_ID + ":Scandium-pioche");

		ItemSword = new ItemSwordTools(scandiumMaterial)

				.setUnlocalizedName("Scandium_Sword").setTextureName(Reference.MOD_ID + ":Scandium_Sword")
				.setCreativeTab(SunmodMain.MyTab);
		// easter eggs
		IconMagic = new Item().setTextureName(Reference.MOD_ID + ":steril_icon");
		//////////////////////////////////
		ItemScandium = new Item().setUnlocalizedName("Scandium").setTextureName(Reference.MOD_ID + ":Scandium")
				.setCreativeTab(SunmodMain.MyTab);

		BeriliumAxe = new ItemToolsAxe(BeriliumAxeMaterial).setCreativeTab(SunmodMain.MyTab)
				.setUnlocalizedName("BseriliumAxe").setTextureName(Reference.MOD_ID + ":bérylium_axe");

		BeriliumPicaxe = new ItemToolsAxe(BeriliumAxeMaterial).setCreativeTab(SunmodMain.MyTab)
				.setUnlocalizedName("Beriliumpicaxe").setTextureName(Reference.MOD_ID + ":bérylium_pickaxe");

		BeriliumSword = new ItemSwordTools(BeriliumSwordMaterial).setCreativeTab(SunmodMain.MyTab)
				.setUnlocalizedName("BeriliumSword").setTextureName(Reference.MOD_ID + ":bérylium_sword");

		BeriliumShovel = new ItemShovel(BeriliumShovelmaterial).setCreativeTab(SunmodMain.MyTab)
				.setUnlocalizedName("BeriliumShovel").setTextureName(Reference.MOD_ID + ":bérylium_shovel");

		Beriliumhoe = new HoeMaterial(BeriliumHoeMaterial).setCreativeTab(SunmodMain.MyTab)
				.setUnlocalizedName("BeriliumHoe").setTextureName(Reference.MOD_ID + ":bérylium_hoe");
		BeriliumIngot = new Item().setCreativeTab(SunmodMain.MyTab).setUnlocalizedName("BeriliumIngot")
				.setTextureName(Reference.MOD_ID + ":greenIngot");
	}

	public static void register() {

		GameRegistry.registerItem(ItemHoue, "ItemHoue");
		GameRegistry.registerItem(ItemHache, "Scandium_hache");
		GameRegistry.registerItem(ItemScandiumPelle, "Scandium_pelle");
		GameRegistry.registerItem(ItemSword, "Scandium_Sword");
		GameRegistry.registerItem(IconMagic, "steril_icon");
		GameRegistry.registerItem(ItemScandium, "Scandium");
		GameRegistry.registerItem(ItemToolsAxe, "ItemToolsAxe");
		GameRegistry.registerItem(BeriliumAxe, "BeriliumAxe");
		GameRegistry.registerItem(BeriliumPicaxe, "BeriliumPicaxe");
		GameRegistry.registerItem(BeriliumSword, "BeriliumSword");
		GameRegistry.registerItem(BeriliumShovel, "BeriliumShovel");
		GameRegistry.registerItem(BeriliumIngot, "BeriliumIngot");
		// Crafting
		GameRegistry.addRecipe(new ItemStack(ItemSword),
				new Object[] { "#M#", "#M#", "#S#", 'S', Items.stick, 'M', ItemScandium });

		GameRegistry.addRecipe(new ItemStack(ItemToolsAxe),
				new Object[] { "MMM", "#S#", "#S#", 'M', ModItem.ItemScandium, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ItemHache),
				new Object[] { "#MM", "#SM", "#S#", 'M', ModItem.ItemScandium, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(ItemScandiumPelle),
				new Object[] { "#M#", "#S#", "#S#", 'S', Items.stick, 'M', ModItem.ItemScandium });

		GameRegistry.addRecipe(new ItemStack(ItemHoue),
				new Object[] { "#MM", "#S#", "#S#", 'S', Items.stick, 'M', ItemScandium });
		GameRegistry.addRecipe(new ItemStack(BeriliumAxe),
				new Object[] { "#MM", "#SM", "#S#", 'M', BeriliumIngot, 'S', Items.stick });
		GameRegistry.addRecipe(new ItemStack(BeriliumSword),
				new Object[] { "#M#", "#M#", "#S#", 'M', BeriliumIngot, 'S', Items.stick });

		GameRegistry.addRecipe(new ItemStack(BeriliumPicaxe),
				new Object[] { "MMM", "#S#", "#S#", 'S', Items.stick, 'M', BeriliumIngot });
		GameRegistry.addRecipe(new ItemStack(BeriliumShovel),
				new Object[] { "#M#", "#S#", "#S#", 'S', Items.stick, 'M', BeriliumIngot });

	}

}
