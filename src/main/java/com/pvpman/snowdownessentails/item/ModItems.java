package com.pvpman.snowdownessentails.item;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SDE_IRON_HELMET = registerItem("sde_iron_helmet",
            new ArmorItem(ModArmorMaterials.SDE_IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SDE_IRON_CHESTPLATE = registerItem("sde_iron_chestplate",
            new ArmorItem(ModArmorMaterials.SDE_IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SDE_IRON_LEGGINGS = registerItem("sde_iron_leggings",
            new ArmorItem(ModArmorMaterials.SDE_IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SDE_IRON_BOOTS = registerItem("sde_iron_boots",
            new ArmorItem(ModArmorMaterials.SDE_IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SnowdownEssentails.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SnowdownEssentails.LOGGER.info("Registering Mod Items for " + SnowdownEssentails.MOD_ID);
    }
}
