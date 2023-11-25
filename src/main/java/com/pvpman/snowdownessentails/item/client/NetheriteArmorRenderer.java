package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.item.custom.DiamondArmorItem;
import com.pvpman.snowdownessentails.item.custom.NetheriteArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class NetheriteArmorRenderer extends GeoArmorRenderer<NetheriteArmorItem> {

    public NetheriteArmorRenderer() {
        super(new NetheriteArmorModel ());
    }
}
