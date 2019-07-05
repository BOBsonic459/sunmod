// https://www.minecraftforgefrance.fr/topic/600/cr%C3%A9er-une-armure


package com.sunproject.sunmods.stmagic.mods;

import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ModBlock;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ModItem;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.tab;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ItemsTools.Stick_C;
import com.sunproject.sunmods.stmagic.mods.EventsEntity.SunModEvents;
import com.sunproject.sunmods.stmagic.mods.EventsEntity.PlayerArmor.PlayerArmor;
import com.sunproject.sunmods.stmagic.mods.EventsEntity.SunWorldDep.SunWorldRegister;
import com.sunproject.sunmods.stmagic.mods.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class SunmodMain {
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	public static CreativeTabs SunTabs, MyTab = new tab("lalalol");
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItem.init();
		ModItem.register();
		ModBlock.init();
		ModBlock.register();
		PlayerArmor.Init();
		PlayerArmor.Register();
		Stick_C.Init();
		Stick_C.Register();
		SunModEvents.Init();
		SunWorldRegister.SunWorldMainRegistry();

	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.RegisterRenders();
		

	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}





