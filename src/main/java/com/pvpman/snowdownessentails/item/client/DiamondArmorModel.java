package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.DiamondArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class DiamondArmorModel extends GeoModel<DiamondArmorItem> {
    @Override
    public Identifier getModelResource(DiamondArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "geo/armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(DiamondArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "textures/armor/diamond_armor.png");
    }

    @Override
    public Identifier getAnimationResource(DiamondArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
