package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.LeatherArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class LeatherArmorModel extends GeoModel<LeatherArmorItem> {
    @Override
    public Identifier getModelResource(LeatherArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "geo/leather_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(LeatherArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "textures/armor/leather_armor.png");
    }

    @Override
    public Identifier getAnimationResource(LeatherArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
