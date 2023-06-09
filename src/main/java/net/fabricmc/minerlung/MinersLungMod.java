package net.fabricmc.minerlung;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.minerlung.item.MinerLungItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinersLungMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "minerslung";
	public static final Logger LOGGER = LoggerFactory.getLogger("minerslung");




	@Override
	public void onInitialize() {
		MinerLungItem.registerMinerLungItem();
	}


}
