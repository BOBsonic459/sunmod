package com.sunproject.sunmods.stmagic.mods.DeclarativeBlocks;

import com.sunproject.sunmods.stmagic.mods.Reference;
import com.sunproject.sunmods.stmagic.mods.SunmodMain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockConstructor extends Block {

	public BlockConstructor(Material material) {
		super(material);
	}


public static class BlockOre extends Block {
	public BlockOre(Material p_i28096_1_) {
		super(p_i28096_1_);
			
				setCreativeTab(SunmodMain.MyTab);
				setBlockName("BlockOre");
				setBlockTextureName(Reference.MOD_ID + ":Scandium_Ore");
				setResistance(30);
				setHardness(5);
				setLightLevel(15);
				
				
  }
	
 }
	public static class BeriliumOre extends Block {

		public BeriliumOre(Material p_i45394_1_) {
			super(p_i45394_1_);
			
			setCreativeTab(SunmodMain.MyTab);
			setBlockName("BeriliumOre");
			setBlockTextureName(Reference.MOD_ID + ":berylium_ore");
			setResistance(30);
			setHardness(5);
			setLightLevel(15);
		}
		
	}
}

