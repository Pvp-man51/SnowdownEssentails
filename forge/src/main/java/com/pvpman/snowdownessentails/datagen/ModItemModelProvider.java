package com.pvpman.snowdownessentails.datagen;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SnowdownEssentails.MOD_ID, existingFileHelper);
    }

    @Override
    public void registerModels() {
        simpleItem(ModItems.LEATHER_HAT);
        simpleItem(ModItems.LEATHER_CHEST_BELT);
        simpleItem(ModItems.LEATHER_BELT);
        simpleItem(ModItems.LEATHER_BOOTS);

        simpleItem(ModItems.IRON_HAT);
        simpleItem(ModItems.IRON_CHEST_BELT);
        simpleItem(ModItems.IRON_BELT);
        simpleItem(ModItems.IRON_BOOTS);

        simpleItem(ModItems.GOLD_HAT);
        simpleItem(ModItems.GOLD_CHEST_BELT);
        simpleItem(ModItems.GOLD_BELT);
        simpleItem(ModItems.GOLD_BOOTS);

        simpleItem(ModItems.DIAMOND_HAT);
        simpleItem(ModItems.DIAMOND_CHEST_BELT);
        simpleItem(ModItems.DIAMOND_BELT);
        simpleItem(ModItems.DIAMOND_BOOTS);

        simpleItem(ModItems.NETHERITE_HAT);
        simpleItem(ModItems.NETHERITE_CHEST_BELT);
        simpleItem(ModItems.NETHERITE_BELT);
        simpleItem(ModItems.NETHERITE_BOOTS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SnowdownEssentails.MOD_ID,"item/" + item.getId().getPath()));
    }
}
