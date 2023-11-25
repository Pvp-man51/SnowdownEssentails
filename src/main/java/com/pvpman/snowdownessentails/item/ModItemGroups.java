package com.pvpman.snowdownessentails.item;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SNOWDOWN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SnowdownEssentails.MOD_ID, "snowdown"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.snowdown"))
                    .icon(() -> new ItemStack(ModItems.SDE_IRON_HELMET)).entries((displayContext, entries) -> {

                        entries.add(ModItems.SDE_IRON_HELMET);
                        entries.add(ModItems.SDE_IRON_CHESTPLATE);
                        entries.add(ModItems.SDE_IRON_LEGGINGS);
                        entries.add(ModItems.SDE_IRON_BOOTS);

                    }).build());

    public static void registerItemGroups(){
        SnowdownEssentails.LOGGER.info("Registering Item Groups for " + SnowdownEssentails.MOD_ID);
    }
}
