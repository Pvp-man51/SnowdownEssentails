package com.pvpman.snowdownessentails.datagen;

import com.pvpman.snowdownessentails.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
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

        // Netherite
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_HAT, RecipeCategory.COMBAT, ModItems.NETHERITE_HAT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_CHEST_BELT, RecipeCategory.COMBAT, ModItems.NETHERITE_CHEST_BELT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_BELT, RecipeCategory.COMBAT, ModItems.NETHERITE_BELT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_BOOTS, RecipeCategory.COMBAT, ModItems.NETHERITE_BOOTS);
    }
}
