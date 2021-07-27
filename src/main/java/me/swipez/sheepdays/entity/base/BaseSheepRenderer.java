package me.swipez.sheepdays.entity.base;

import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BaseSheepRenderer extends GeoEntityRenderer<DumbSheepEntity> {
    public BaseSheepRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new BaseSheepModel());
    }
}
