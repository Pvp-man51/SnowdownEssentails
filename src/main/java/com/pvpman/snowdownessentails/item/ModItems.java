package com.pvpman.snowdownessentails.item;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item IRON_HELMET = registerItem("iron_helmet",
            new ArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_CHESTPLATE = registerItem("iron_chestplate",
            new ArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item IRON_LEGGINGS = registerItem("iron_leggings",
            new ArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item IRON_BOOTS = registerItem("iron_boots",
            new ArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SnowdownEssentails.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SnowdownEssentails.LOGGER.info("Registering Mod Items for " + SnowdownEssentails.MOD_ID);
    }
}
