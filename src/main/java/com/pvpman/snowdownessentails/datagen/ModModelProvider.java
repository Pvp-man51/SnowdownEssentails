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
        itemModelGenerator.register(ModItems.IRON_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BOOTS, Models.GENERATED);
    }
}
