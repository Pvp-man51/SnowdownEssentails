package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.DiamondArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DiamondArmorModel extends GeoModel<DiamondArmorItem> {
    @Override
    public ResourceLocation getModelResource(DiamondArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "geo/armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DiamondArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "textures/armor/diamond_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DiamondArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
