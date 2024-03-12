package com.pvpman.snowdownessentails;

import com.pvpman.snowdownessentails.item.ModItemGroups;
import com.pvpman.snowdownessentails.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class SnowdownEssentails implements ModInitializer {
	public static final String MOD_ID = "snowdownessentails";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		GeckoLib.initialize();
	}
}