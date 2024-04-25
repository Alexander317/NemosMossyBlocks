package com.nemonotfound.nemosmossyblocks;

import com.nemonotfound.nemosmossyblocks.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NemosMossyBlocksDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelProvider::new);
		pack.addProvider(LootTableProvider::new);
		pack.addProvider(BlockTagProvider::new);
		pack.addProvider(RecipeProvider::new);
		pack.addProvider(ItemTagProvider::new);
	}
}
