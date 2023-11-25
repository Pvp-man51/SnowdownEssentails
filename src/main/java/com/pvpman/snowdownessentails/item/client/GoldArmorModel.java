package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.GoldArmorItem;
import com.pvpman.snowdownessentails.item.custom.LeatherArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class GoldArmorModel extends GeoModel<GoldArmorItem> {
    @Override
    public Identifier getModelResource(GoldArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "geo/armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(GoldArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "textures/armor/gold_armor.png");
    }

    @Override
    public Identifier getAnimationResource(GoldArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
