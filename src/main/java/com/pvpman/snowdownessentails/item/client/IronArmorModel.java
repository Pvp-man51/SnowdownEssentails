package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.IronArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class IronArmorModel extends GeoModel<IronArmorItem> {
    @Override
    public Identifier getModelResource(IronArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "geo/iron_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(IronArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "textures/armor/sde_iron_armor.png");
    }

    @Override
    public Identifier getAnimationResource(IronArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "animations/iron_armor.animation.json");
    }
}
