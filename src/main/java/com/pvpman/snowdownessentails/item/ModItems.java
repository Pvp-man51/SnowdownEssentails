package com.pvpman.snowdownessentails.item;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.IronArmorItem;
import com.pvpman.snowdownessentails.item.custom.LeatherArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item LEATHER_HAT = registerItem("leather_hat",
            new LeatherArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item LEATHER_CHEST_BELT = registerItem("leather_chest_belt",
            new LeatherArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item LEATHER_BELT = registerItem("leather_belt",
            new LeatherArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item LEATHER_BOOTS = registerItem("leather_boots",
            new LeatherArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item IRON_HAT = registerItem("iron_hat",
            new IronArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item IRON_CHEST_BELT = registerItem("iron_chest_belt",
            new IronArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item IRON_BELT = registerItem("iron_belt",
            new IronArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item IRON_BOOTS = registerItem("iron_boots",
            new IronArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SnowdownEssentails.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SnowdownEssentails.LOGGER.info("Registering Mod Items for " + SnowdownEssentails.MOD_ID);
    }
}
