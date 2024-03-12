package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.SnowdownEssentails;
import com.pvpman.snowdownessentails.item.custom.NetheriteArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class NetheriteArmorModel extends GeoModel<NetheriteArmorItem> {
    @Override
    public Identifier getModelResource(NetheriteArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "geo/armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(NetheriteArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "textures/armor/netherite_armor.png");
    }

    @Override
    public Identifier getAnimationResource(NetheriteArmorItem animatable) {
        return new Identifier(SnowdownEssentails.MOD_ID, "animations/armor.animation.json");
    }
}
