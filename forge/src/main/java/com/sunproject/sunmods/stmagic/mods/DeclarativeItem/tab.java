package com.sunproject.sunmods.stmagic.mods.DeclarativeItem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tab extends CreativeTabs {
 
	public tab(String lable) {
		super(lable);

	}

	@Override
	public Item getTabIconItem() {
		return ModItem.IconMagic;
	    
	}

}
