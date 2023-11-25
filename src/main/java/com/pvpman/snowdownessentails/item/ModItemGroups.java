package com.pvpman.snowdownessentails.item;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SNOWDOWN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SnowdownEssentails.MOD_ID, "snowdown"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.snowdown"))
                    .icon(() -> new ItemStack(ModItems.IRON_HELMET)).entries((displayContext, entries) -> {

                        entries.add(ModItems.IRON_HELMET);
                        entries.add(ModItems.IRON_CHESTPLATE);
                        entries.add(ModItems.IRON_LEGGINGS);
                        entries.add(ModItems.IRON_BOOTS);

                    }).build());

    public static void registerItemGroups(){
        SnowdownEssentails.LOGGER.info("Registering Item Groups for " + SnowdownEssentails.MOD_ID);
    }
}
