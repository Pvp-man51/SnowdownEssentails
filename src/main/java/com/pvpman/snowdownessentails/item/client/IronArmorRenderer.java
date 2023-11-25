package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.item.custom.IronArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IronArmorRenderer extends GeoArmorRenderer<IronArmorItem> {
    public IronArmorRenderer() {
        super(new IronArmorModel());
    }
}
