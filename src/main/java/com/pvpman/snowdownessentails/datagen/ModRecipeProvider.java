package com.pvpman.snowdownessentails.datagen;

import com.pvpman.snowdownessentails.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Leather
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEATHER_HAT)
                .pattern("LLL")
                .pattern("LLL")
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER),
                        FabricRecipeProvider.conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEATHER_CHEST_BELT)
                .pattern("L L")
                .pattern("LIL")
                .pattern("LLL")
                .input('I', Items.IRON_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER),
                        FabricRecipeProvider.conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEATHER_BELT)
                .pattern("LLL")
                .pattern("LLL")
                .pattern("L L")
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER),
                        FabricRecipeProvider.conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEATHER_BOOTS)
                .pattern("L L")
                .pattern("LLL")
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.LEATHER),
                        FabricRecipeProvider.conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);
        // Alternate
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEATHER_HAT)
        //        .input(Items.LEATHER_HELMET)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.LEATHER_HELMET),
        //                FabricRecipeProvider.conditionsFromItem(Items.LEATHER_HELMET))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEATHER_CHEST_BELT)
        //        .input(Items.LEATHER_CHESTPLATE)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.LEATHER_CHESTPLATE),
        //                FabricRecipeProvider.conditionsFromItem(Items.LEATHER_CHESTPLATE))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEATHER_BELT)
        //        .input(Items.LEATHER_LEGGINGS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.LEATHER_LEGGINGS),
        //                FabricRecipeProvider.conditionsFromItem(Items.LEATHER_LEGGINGS))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.LEATHER_BOOTS)
        //        .input(Items.LEATHER_BOOTS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.LEATHER_BOOTS),
        //                FabricRecipeProvider.conditionsFromItem(Items.LEATHER_BOOTS))
        //        .offerTo(exporter);

        // Iron
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_HAT)
                .pattern("III")
                .pattern("ILI")
                .input('I', Items.IRON_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_CHEST_BELT)
                .pattern("ILI")
                .pattern("III")
                .pattern("III")
                .input('I', Items.IRON_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_BELT)
                .pattern("III")
                .pattern("ILI")
                .pattern("I I")
                .input('I', Items.IRON_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_BOOTS)
                .pattern("I I")
                .pattern("ILI")
                .input('I', Items.IRON_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
        // Alternate
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_HAT)
        //        .input(Items.IRON_HELMET)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.IRON_HELMET),
        //                FabricRecipeProvider.conditionsFromItem(Items.IRON_HELMET))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_CHEST_BELT)
        //        .input(Items.IRON_CHESTPLATE)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.IRON_CHESTPLATE),
        //                FabricRecipeProvider.conditionsFromItem(Items.IRON_CHESTPLATE))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_BELT)
        //        .input(Items.IRON_LEGGINGS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.IRON_LEGGINGS),
        //                FabricRecipeProvider.conditionsFromItem(Items.IRON_LEGGINGS))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IRON_BOOTS)
        //        .input(Items.IRON_BOOTS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.IRON_BOOTS),
        //                FabricRecipeProvider.conditionsFromItem(Items.IRON_BOOTS))
        //        .offerTo(exporter);

        // Gold
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_HAT)
                .pattern("GGG")
                .pattern("GLG")
                .input('G', Items.GOLD_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_CHEST_BELT)
                .pattern("GLG")
                .pattern("GGG")
                .pattern("GGG")
                .input('G', Items.GOLD_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_BELT)
                .pattern("GGG")
                .pattern("GLG")
                .pattern("G G")
                .input('G', Items.GOLD_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_BOOTS)
                .pattern("G G")
                .pattern("GLG")
                .input('G', Items.GOLD_INGOT)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
        // Alternate
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_HAT)
        //        .input(Items.GOLDEN_HELMET)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_HELMET),
        //                FabricRecipeProvider.conditionsFromItem(Items.GOLDEN_HELMET))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_CHEST_BELT)
        //        .input(Items.GOLDEN_CHESTPLATE)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_CHESTPLATE),
        //                FabricRecipeProvider.conditionsFromItem(Items.GOLDEN_CHESTPLATE))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_BELT)
        //        .input(Items.GOLDEN_LEGGINGS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_LEGGINGS),
        //                FabricRecipeProvider.conditionsFromItem(Items.GOLDEN_LEGGINGS))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.GOLD_BOOTS)
        //        .input(Items.GOLDEN_BOOTS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.GOLDEN_BOOTS),
        //                FabricRecipeProvider.conditionsFromItem(Items.GOLDEN_BOOTS))
        //        .offerTo(exporter);

        // Diamond
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_HAT)
                .pattern("DDD")
                .pattern("DLD")
                .input('D', Items.DIAMOND)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_CHEST_BELT)
                .pattern("DLD")
                .pattern("DDD")
                .pattern("DDD")
                .input('D', Items.DIAMOND)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_BELT)
                .pattern("DDD")
                .pattern("DLD")
                .pattern("D D")
                .input('D', Items.DIAMOND)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_BOOTS)
                .pattern("D D")
                .pattern("DLD")
                .input('D', Items.DIAMOND)
                .input('L', Items.LEATHER)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
        // Alternate
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_HAT)
        //        .input(Items.DIAMOND_HELMET)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND_HELMET),
        //                FabricRecipeProvider.conditionsFromItem(Items.DIAMOND_HELMET))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_CHEST_BELT)
        //        .input(Items.DIAMOND_CHESTPLATE)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND_CHESTPLATE),
        //                FabricRecipeProvider.conditionsFromItem(Items.DIAMOND_CHESTPLATE))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_BELT)
        //        .input(Items.DIAMOND_LEGGINGS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND_LEGGINGS),
        //                FabricRecipeProvider.conditionsFromItem(Items.DIAMOND_LEGGINGS))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.DIAMOND_BOOTS)
        //        .input(Items.DIAMOND_BOOTS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND_BOOTS),
        //                FabricRecipeProvider.conditionsFromItem(Items.DIAMOND_BOOTS))
        //        .offerTo(exporter);

        // Netherite
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_HAT, RecipeCategory.COMBAT, ModItems.NETHERITE_HAT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_CHEST_BELT, RecipeCategory.COMBAT, ModItems.NETHERITE_CHEST_BELT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_BELT, RecipeCategory.COMBAT, ModItems.NETHERITE_BELT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_BOOTS, RecipeCategory.COMBAT, ModItems.NETHERITE_BOOTS);
        // Alternate
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITE_HAT)
        //        .input(Items.NETHERITE_HELMET)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_HELMET),
        //                FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_HELMET))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITE_CHEST_BELT)
        //        .input(Items.NETHERITE_CHESTPLATE)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_CHESTPLATE),
        //                FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_CHESTPLATE))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITE_BELT)
        //        .input(Items.NETHERITE_LEGGINGS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_LEGGINGS),
        //                FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_LEGGINGS))
        //        .offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.NETHERITE_BOOTS)
        //        .input(Items.NETHERITE_BOOTS)
        //        .input(Items.LEATHER)
        //        .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_BOOTS),
        //                FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_BOOTS))
        //        .offerTo(exporter);
    }
}
