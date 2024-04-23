package com.nemonotfound;

import com.nemonotfound.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosMossyBlocks implements ModInitializer {

	public static final String MOD_ID = "nemos-mossy-blocks";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Mossy Blocks!");
		ModItemGroups.registerItemGroups();
	}
}