package com.pvpman.snowdownessentails.datagen;

import com.pvpman.snowdownessentails.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_HAT, RecipeCategory.COMBAT, ModItems.NETHERITE_HAT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_CHEST_BELT, RecipeCategory.COMBAT, ModItems.NETHERITE_CHEST_BELT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_BELT, RecipeCategory.COMBAT, ModItems.NETHERITE_BELT);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_BOOTS, RecipeCategory.COMBAT, ModItems.NETHERITE_BOOTS);
    }
}
