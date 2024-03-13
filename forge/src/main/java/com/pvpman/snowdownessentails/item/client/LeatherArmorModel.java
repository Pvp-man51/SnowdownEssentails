package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.LeatherArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class LeatherArmorModel extends GeoModel<LeatherArmorItem> {
    @Override
    public ResourceLocation getModelResource(LeatherArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "geo/leather_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LeatherArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "textures/armor/leather_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LeatherArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
