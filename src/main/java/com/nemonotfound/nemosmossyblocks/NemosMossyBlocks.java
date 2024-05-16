package com.nemonotfound.nemosmossyblocks;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import com.nemonotfound.nemosmossyblocks.entity.Entities;
import com.nemonotfound.nemosmossyblocks.item.ModItemGroups;
import com.nemonotfound.nemosmossyblocks.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NemosMossyBlocks implements ModInitializer {

	public static final String MOD_ID = "nemos-mossy-blocks";
    public static final Logger log = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		log.info("Thank you for using Nemo's Mossy Blocks!");
		ModBlocks.registerBlocks();
		ModItemGroups.registerItemGroups();
		ModItemGroups.registerItemsToItemGroups();
		ModItems.registerItems();
		Entities.registerEntities();
	}
}