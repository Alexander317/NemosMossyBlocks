package com.nemonotfound.nemosmossyblocks.item;

import com.nemonotfound.nemosmossyblocks.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.nemonotfound.nemosmossyblocks.NemosMossyBlocks.MOD_ID;

public class ModItemGroups {

    public static String NEMOS_CARPENTRY_GROUP_ID = "nemos-mossy-blocks-group";
    public static final RegistryKey<ItemGroup> NEMOS_MOSSY_BLOCKS = getItemGroup(NEMOS_CARPENTRY_GROUP_ID);
    public static final Map<RegistryKey<ItemGroup>, List<BlockItem>> itemGroupToBlocksMap = new HashMap<>();

    public static void registerItemGroups() {
        registerItemGroup("Nemo's Mossy Blocks", NEMOS_CARPENTRY_GROUP_ID, ModBlocks.MOSSY_STONE);
    }

    public static void registerItemGroup(String displayName, String path, Block iconBlock) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconBlock))
                .displayName(Text.translatable(displayName))
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, path), ITEM_GROUP);
    }

    private static RegistryKey<ItemGroup> getItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, path));
    }

    public static void registerItemsToItemGroups() {
        for (Map.Entry<RegistryKey<ItemGroup>, List<BlockItem>> entry : itemGroupToBlocksMap.entrySet()) {
            ItemGroupEvents.modifyEntriesEvent(entry.getKey())
                    .register(content -> {
                        for (BlockItem blockItem : entry.getValue()) {
                            content.add(blockItem);
                        }
                    });
        }
    }

}
