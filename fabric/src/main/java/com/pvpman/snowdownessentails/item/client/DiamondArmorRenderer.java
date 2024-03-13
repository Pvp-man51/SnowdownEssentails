package com.pvpman.snowdownessentails.item.client;

import com.pvpman.snowdownessentails.item.custom.DiamondArmorItem;
import net.minecraft.entity.EquipmentSlot;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DiamondArmorRenderer extends GeoArmorRenderer<DiamondArmorItem> {

    public DiamondArmorRenderer() {
        super(new DiamondArmorModel());
    }

    @Override
    protected void applyBoneVisibilityBySlot(EquipmentSlot currentSlot) {
        setVisible(false);

        switch (currentSlot) {
            case HEAD -> {
                setBoneVisible(this.head, true);
            }
            case CHEST -> {
                setBoneVisible(this.body, true);
                setBoneVisible(this.rightArm, true);
                setBoneVisible(this.leftArm, true);
                setBoneVisible(this.getGeoModel().getBone("patronengurt").get(), true);

                setBoneVisible(this.getGeoModel().getBone("beltArmor").get(), false);
            }
            case LEGS -> {
                setBoneVisible(this.body, true);
                setBoneVisible(this.getGeoModel().getBone("beltArmor").get(), true);

                setBoneVisible(this.rightLeg, true);
                setBoneVisible(this.leftLeg, true);

                setBoneVisible(this.getGeoModel().getBone("patronengurt").get(), false);
            }
            case FEET -> {
                setBoneVisible(this.rightBoot, true);
                setBoneVisible(this.leftBoot, true);
            }
        }
    }
}
