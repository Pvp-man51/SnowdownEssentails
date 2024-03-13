package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.GoldArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GoldArmorModel extends GeoModel<GoldArmorItem> {
    @Override
    public ResourceLocation getModelResource(GoldArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "geo/armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GoldArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "textures/armor/gold_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GoldArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
