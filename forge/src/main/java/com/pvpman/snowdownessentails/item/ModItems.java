package com.pvpman.snowdownessentails.item;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SnowdownEssentails.MOD_ID);

    // Leather Armor
    public static final RegistryObject<Item> LEATHER_HAT = ITEMS.register("leather_hat",
            () -> new LeatherArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> LEATHER_CHEST_BELT = ITEMS.register("leather_chest_belt",
            () -> new LeatherArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> LEATHER_BELT = ITEMS.register("leather_belt",
            () -> new LeatherArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> LEATHER_BOOTS = ITEMS.register("leather_boots",
            () -> new LeatherArmorItem(ModArmorMaterials.LEATHER, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Iron Armor
    public static final RegistryObject<Item> IRON_HAT = ITEMS.register("iron_hat",
            () -> new IronArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> IRON_CHEST_BELT = ITEMS.register("iron_chest_belt",
            () -> new IronArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> IRON_BELT = ITEMS.register("iron_belt",
            () -> new IronArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> IRON_BOOTS = ITEMS.register("iron_boots",
            () -> new IronArmorItem(ModArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Gold Armor
    public static final RegistryObject<Item> GOLD_HAT = ITEMS.register("gold_hat",
            () -> new GoldArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> GOLD_CHEST_BELT = ITEMS.register("gold_chest_belt",
            () -> new GoldArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> GOLD_BELT = ITEMS.register("gold_belt",
            () -> new GoldArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> GOLD_BOOTS = ITEMS.register("gold_boots",
            () -> new GoldArmorItem(ModArmorMaterials.GOLD, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Diamond Armor
    public static final RegistryObject<Item> DIAMOND_HAT = ITEMS.register("diamond_hat",
            () -> new DiamondArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_CHEST_BELT = ITEMS.register("diamond_chest_belt",
            () -> new DiamondArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_BELT = ITEMS.register("diamond_belt",
            () -> new DiamondArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_BOOTS = ITEMS.register("diamond_boots",
            () -> new DiamondArmorItem(ModArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Netherite Armor
    public static final RegistryObject<Item> NETHERITE_HAT = ITEMS.register("netherite_hat",
            () -> new NetheriteArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_CHEST_BELT = ITEMS.register("netherite_chest_belt",
            () -> new NetheriteArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_BELT = ITEMS.register("netherite_belt",
            () -> new NetheriteArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_BOOTS = ITEMS.register("netherite_boots",
            () -> new NetheriteArmorItem(ModArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }

}
