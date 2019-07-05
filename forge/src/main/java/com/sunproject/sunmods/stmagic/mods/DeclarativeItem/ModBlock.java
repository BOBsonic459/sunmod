package com.sunproject.sunmods.stmagic.mods.DeclarativeItem;

import com.sunproject.sunmods.stmagic.mods.Reference;
import com.sunproject.sunmods.stmagic.mods.SunmodMain;
import com.sunproject.sunmods.stmagic.mods.DeclarativeBlocks.BlockConstructor;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class ModBlock {
	public static Block Scandium_block, BlockOre, BeriliumOre;
	
	public static void init() {
		
		Scandium_block = new BlockConstructor(Material.rock)

				.setCreativeTab(SunmodMain.MyTab)
				.setBlockTextureName(Reference.MOD_ID + ":Scandium_block")
				.setBlockName("Scandium_block");

		BlockOre = new BlockConstructor.BlockOre(Material.rock);
		BeriliumOre = new BlockConstructor.BeriliumOre(Material.rock);
		// voir Blockcontructor.java pour les parametres
		
		
		
	}
	
	public static void register() {
		GameRegistry.registerBlock(BlockOre, "BlockOre");
		GameRegistry.registerBlock(Scandium_block, "Scandium_block");
		GameRegistry.registerBlock(BeriliumOre, "BeriliumOre");
		GameRegistry.addRecipe(new ItemStack(ModBlock.Scandium_block, 1), new Object[] {"###", "###", "###", '#', ModItem.ItemScandium});

	}
}
