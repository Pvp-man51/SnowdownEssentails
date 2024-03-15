package com.pvpman.snowdownessentails.datagen;

import com.pvpman.snowdownessentails.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected  void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Leather
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LEATHER_HAT.get())
                .define('L', Items.LEATHER)
                .pattern("LLL")
                .pattern("LLL")
                .unlockedBy("has_leather", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LEATHER).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LEATHER_CHEST_BELT.get())
                .define('L', Items.LEATHER)
                .define('I', Items.IRON_INGOT)
                .pattern("L L")
                .pattern("LIL")
                .pattern("LLL")
                .unlockedBy("has_leather", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LEATHER).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LEATHER_BELT.get())
                .define('L', Items.LEATHER)
                .pattern("LLL")
                .pattern("LLL")
                .pattern("L L")
                .unlockedBy("has_leather", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LEATHER).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.LEATHER_BOOTS.get())
                .define('L', Items.LEATHER)
                .pattern("L L")
                .pattern("LLL")
                .unlockedBy("has_leather", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LEATHER).build()))
                .save(consumer);
        // Alternate
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.LEATHER_HAT.get())
//                .requires(Items.LEATHER_HELMET)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_leather_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.LEATHER).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.LEATHER_CHEST_BELT.get())
//                .requires(Items.LEATHER_CHESTPLATE)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_leather_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.LEATHER).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.LEATHER_BELT.get())
//                .requires(Items.LEATHER_LEGGINGS)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_leather_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.LEATHER).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.LEATHER_BOOTS.get())
//                .requires(Items.LEATHER_BOOTS)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_leather_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.LEATHER).build()))
//                .save(consumer);

        // Iron
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.IRON_HAT.get())
                .define('I', Items.IRON_INGOT)
                .define('L', Items.LEATHER)
                .pattern("III")
                .pattern("ILI")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.IRON_CHEST_BELT.get())
                .define('I', Items.IRON_INGOT)
                .define('L', Items.LEATHER)
                .pattern("ILI")
                .pattern("III")
                .pattern("III")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.IRON_BELT.get())
                .define('I', Items.IRON_INGOT)
                .define('L', Items.LEATHER)
                .pattern("III")
                .pattern("ILI")
                .pattern("I I")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.IRON_BOOTS.get())
                .define('I', Items.IRON_INGOT)
                .define('L', Items.LEATHER)
                .pattern("I I")
                .pattern("ILI")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(consumer);

//        // Alternate
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.IRON_HAT.get())
//                .requires(Items.IRON_HELMET)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_iron_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.IRON_HELMET).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.IRON_CHEST_BELT.get())
//                .requires(Items.IRON_CHESTPLATE)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_iron_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.IRON_CHESTPLATE).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.IRON_BELT.get())
//                .requires(Items.IRON_LEGGINGS)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_iron_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.IRON_LEGGINGS).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.IRON_BOOTS.get())
//                .requires(Items.IRON_BOOTS)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_iron_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.IRON_BOOTS).build()))
//                .save(consumer);

        // Gold
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GOLD_HAT.get())
                .define('G', Items.GOLD_INGOT)
                .define('L', Items.LEATHER)
                .pattern("GGG")
                .pattern("GLG")
                .unlockedBy("has_gold", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GOLD_CHEST_BELT.get())
                .define('G', Items.GOLD_INGOT)
                .define('L', Items.LEATHER)
                .pattern("GLG")
                .pattern("GGG")
                .pattern("GGG")
                .unlockedBy("has_gold", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GOLD_BELT.get())
                .define('G', Items.GOLD_INGOT)
                .define('L', Items.LEATHER)
                .pattern("GGG")
                .pattern("GLG")
                .pattern("G G")
                .unlockedBy("has_gold", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.GOLD_BOOTS.get())
                .define('G', Items.GOLD_INGOT)
                .define('L', Items.LEATHER)
                .pattern("G G")
                .pattern("GLG")
                .unlockedBy("has_gold", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLD_INGOT).build()))
                .save(consumer);

//        // Alternate
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.GOLD_HAT.get())
//                .requires(Items.GOLDEN_HELMET)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_gold_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.GOLDEN_HELMET).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.GOLD_CHEST_BELT.get())
//                .requires(Items.GOLDEN_CHESTPLATE)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_gold_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.GOLDEN_CHESTPLATE).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.GOLD_BELT.get())
//                .requires(Items.GOLDEN_LEGGINGS)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_gold_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.GOLDEN_LEGGINGS).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.GOLD_BOOTS.get())
//                .requires(Items.GOLDEN_BOOTS)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_gold_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.GOLDEN_BOOTS).build()))
//                .save(consumer);


        // Diamond
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.DIAMOND_HAT.get())
                .define('D', Items.DIAMOND)
                .define('L', Items.LEATHER)
                .pattern("DDD")
                .pattern("DLD")
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.DIAMOND_CHEST_BELT.get())
                .define('D', Items.DIAMOND)
                .define('L', Items.LEATHER)
                .pattern("DLD")
                .pattern("DDD")
                .pattern("DDD")
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.DIAMOND_BELT.get())
                .define('D', Items.DIAMOND)
                .define('L', Items.LEATHER)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("D D")
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.DIAMOND_BOOTS.get())
                .define('D', Items.DIAMOND)
                .define('L', Items.LEATHER)
                .pattern("D D")
                .pattern("DLD")
                .unlockedBy("has_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DIAMOND).build()))
                .save(consumer);

//        // Alternate
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.DIAMOND_HAT.get())
//                .requires(Items.DIAMOND_HELMET)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_diamond_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.DIAMOND_HELMET).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.DIAMOND_CHEST_BELT.get())
//                .requires(Items.DIAMOND_CHESTPLATE)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_diamond_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.DIAMOND_CHESTPLATE).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.DIAMOND_BELT.get())
//                .requires(Items.DIAMOND_LEGGINGS)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_diamond_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.DIAMOND_LEGGINGS).build()))
//                .save(consumer);
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.DIAMOND_BOOTS.get())
//                .requires(Items.DIAMOND_BOOTS)
//                .requires(Items.LEATHER)
//                .unlockedBy("has_diamond_alt", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(Items.DIAMOND_BOOTS).build()))
//                .save(consumer);

        // Netherite
        netheriteSmithing(consumer, ModItems.DIAMOND_HAT.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_HAT.get());
        netheriteSmithing(consumer, ModItems.DIAMOND_CHEST_BELT.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_CHEST_BELT.get());
        netheriteSmithing(consumer, ModItems.DIAMOND_BELT.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_BELT.get());
        netheriteSmithing(consumer, ModItems.DIAMOND_BOOTS.get(), RecipeCategory.COMBAT, ModItems.NETHERITE_BOOTS.get());
        // Alternate
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.NETHERITE_HAT.get())
                .requires(Items.NETHERITE_HELMET)
                .requires(Items.LEATHER)
                .unlockedBy("has_netherite_alt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_HELMET).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.NETHERITE_CHEST_BELT.get())
                .requires(Items.NETHERITE_CHESTPLATE)
                .requires(Items.LEATHER)
                .unlockedBy("has_netherite_alt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_CHESTPLATE).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.NETHERITE_BELT.get())
                .requires(Items.NETHERITE_LEGGINGS)
                .requires(Items.LEATHER)
                .unlockedBy("has_netherite_alt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_LEGGINGS).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.COMBAT, ModItems.NETHERITE_BOOTS.get())
                .requires(Items.NETHERITE_BOOTS)
                .requires(Items.LEATHER)
                .unlockedBy("has_netherite_alt", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.NETHERITE_BOOTS).build()))
                .save(consumer);
    }
}
