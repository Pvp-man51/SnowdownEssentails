package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.item.custom.GoldArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class GoldArmorRenderer extends GeoArmorRenderer<GoldArmorItem> {

    public GoldArmorRenderer() {
        super(new GoldArmorModel());
    }
}
