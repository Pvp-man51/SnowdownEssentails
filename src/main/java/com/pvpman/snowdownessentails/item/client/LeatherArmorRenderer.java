package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.item.custom.LeatherArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class LeatherArmorRenderer extends GeoArmorRenderer<LeatherArmorItem> {
    public LeatherArmorRenderer() {
        super(new LeatherArmorModel());
    }
}
