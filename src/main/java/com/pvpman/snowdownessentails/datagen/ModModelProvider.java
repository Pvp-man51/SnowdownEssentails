package com.pvpman.snowdownessentails.datagen;

import com.pvpman.snowdownessentails.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LEATHER_HAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEATHER_CHEST_BELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEATHER_BELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEATHER_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.IRON_HAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_CHEST_BELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.GOLD_HAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_CHEST_BELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_BELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.DIAMOND_HAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_CHEST_BELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_BELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_BOOTS, Models.GENERATED);
    }
}
