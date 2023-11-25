package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.item.custom.DiamondArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DiamondArmorRenderer extends GeoArmorRenderer<DiamondArmorItem> {

    public DiamondArmorRenderer() {
        super(new DiamondArmorModel());
    }
}
