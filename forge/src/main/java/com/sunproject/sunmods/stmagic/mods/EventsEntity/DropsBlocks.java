package com.sunproject.sunmods.stmagic.mods.EventsEntity;

import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ModBlock;
import com.sunproject.sunmods.stmagic.mods.DeclarativeItem.ModItem;

import akka.japi.Effect;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class DropsBlocks {
	@SubscribeEvent
	public void BlockDestroyed(HarvestDropsEvent event) {
		if (event.block == ModBlock.BlockOre) {
			event.drops.clear();
			event.drops.add(new ItemStack(ModItem.ItemScandium, 2));
		}
	}
}
