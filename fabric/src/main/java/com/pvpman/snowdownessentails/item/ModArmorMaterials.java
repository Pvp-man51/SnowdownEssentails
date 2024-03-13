package com.pvpman.snowdownessentails.item;

import net.minecraft.item.ArmorItem.Type;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    LEATHER("leather", 6, new int[] { 1, 3, 2, 1}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, 0f, () -> Ingredient.ofItems(Items.LEATHER)),
    IRON("iron", 16, new int[] { 2, 5, 6, 2}, 9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    GOLD("gold", 8, new int[] { 2, 5, 3, 1}, 25,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    DIAMOND("diamond", 34, new int[] { 3, 8, 6, 3}, 10,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0f, () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHERITE("netherite", 38, new int[] { 3, 8, 6, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3f, 0.1f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT))
    ;

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float kncokbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DUARBILITY = { 11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound,
                      float thoughness, float kncokbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = thoughness;
        this.kncokbackResistance = kncokbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(Type type) {
        return BASE_DUARBILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.kncokbackResistance;
    }
}
