package com.sunproject.sunmods.stmagic.mods.EventsEntity;

import net.minecraftforge.common.MinecraftForge;

public class SunModEvents {
	
	public static void Init() {
		MinecraftForge.EVENT_BUS.register(new DropsBlocks());
		
	}
}
