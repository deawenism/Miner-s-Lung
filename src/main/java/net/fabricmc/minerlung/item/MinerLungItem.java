package net.fabricmc.minerlung.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.minerlung.MinersLungMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MinerLungItem {
    public static final Item MASK = registerItem("mask",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MinersLungMod.MOD_ID,name),item);
    }
    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.COMBAT,MASK);
    }
    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item) );
    }
    public static void registerMinerLungItem () {
        MinersLungMod.LOGGER.info("Registering item for" + MinersLungMod.MOD_ID);
        addItemsToItemGroup();
    }
}
