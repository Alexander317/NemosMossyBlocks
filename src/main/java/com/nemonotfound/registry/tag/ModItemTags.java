package com.nemonotfound.registry.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static com.nemonotfound.NemosMossyBlocks.MOD_ID;

public class ModItemTags {

    public static final TagKey<Item> MOSSY_PLANKS = TagKey.of(RegistryKeys.ITEM, new Identifier(MOD_ID, "mossy_planks"));
}
