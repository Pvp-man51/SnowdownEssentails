package com.pvpman.snowdownessentails.item;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.*;
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

    public static final Item GOLD_HAT = registerItem("gold_hat",
            new GoldArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GOLD_CHEST_BELT = registerItem("gold_chest_belt",
            new GoldArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GOLD_BELT = registerItem("gold_belt",
            new GoldArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GOLD_BOOTS = registerItem("gold_boots",
            new GoldArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item DIAMOND_HAT = registerItem("diamond_hat",
            new DiamondArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item DIAMOND_CHEST_BELT = registerItem("diamond_chest_belt",
            new DiamondArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item DIAMOND_BELT = registerItem("diamond_belt",
            new DiamondArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item DIAMOND_BOOTS = registerItem("diamond_boots",
            new DiamondArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item NETHERITE_HAT = registerItem("netherite_hat",
            new NetheriteArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item NETHERITE_CHEST_BELT = registerItem("netherite_chest_belt",
            new NetheriteArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item NETHERITE_BELT = registerItem("netherite_belt",
            new NetheriteArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item NETHERITE_BOOTS = registerItem("netherite_boots",
            new NetheriteArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(SnowdownEssentails.MOD_ID, name), item);
    }

    public static void registerModItems(){
        SnowdownEssentails.LOGGER.info("Registering Mod Items for " + SnowdownEssentails.MOD_ID);
    }
}
