package me.swipez.sheepdays.entity.base;

import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BaseSheepModel extends AnimatedGeoModel<DumbSheepEntity> {

    @Override
    public Identifier getModelLocation(DumbSheepEntity object) {
        return new Identifier("sheepdays", "geo/base_sheep.geo.json");
    }

    @Override
    public Identifier getTextureLocation(DumbSheepEntity object) {
        return new Identifier("sheepdays", "textures/sheep_normal.png");
    }

    @Override
    public Identifier getAnimationFileLocation(DumbSheepEntity animatable) {
        return new Identifier("sheepdays", "animations/model.animation.json");
    }
}
