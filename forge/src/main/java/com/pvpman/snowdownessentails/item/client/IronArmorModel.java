package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.IronArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class IronArmorModel extends GeoModel<IronArmorItem> {
    @Override
    public ResourceLocation getModelResource(IronArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "geo/armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IronArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "textures/armor/iron_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IronArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
