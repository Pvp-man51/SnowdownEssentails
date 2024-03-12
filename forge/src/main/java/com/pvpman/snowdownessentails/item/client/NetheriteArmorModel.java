package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.NetheriteArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NetheriteArmorModel extends GeoModel<NetheriteArmorItem> {
    @Override
    public ResourceLocation getModelResource(NetheriteArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "geo/armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NetheriteArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "textures/armor/netherite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NetheriteArmorItem animatable) {
        return new ResourceLocation(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
