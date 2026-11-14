package com.mouse.artisan_of_mana.block.mystic_wheel;

import com.mouse.artisan_of_mana.ArtisanOfMana;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class MysticWheelBlockModel extends DefaultedBlockGeoModel<MysticWheelBlockEntity> {
    public MysticWheelBlockModel() {
        super(ResourceLocation.fromNamespaceAndPath(ArtisanOfMana.MODID, ""));
    }

    @Override
    public ResourceLocation getModelResource(MysticWheelBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ArtisanOfMana.MODID, "geo/block/mystic_wheel.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MysticWheelBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ArtisanOfMana.MODID, "textures/block/mystic_wheel.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MysticWheelBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ArtisanOfMana.MODID, "animations/block/mystic_wheel.animation.json");
    }
}
