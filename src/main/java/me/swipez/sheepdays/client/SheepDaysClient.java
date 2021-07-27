package me.swipez.sheepdays.client;

import me.swipez.sheepdays.SheepDays;
import me.swipez.sheepdays.entity.base.BaseSheepRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class SheepDaysClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(SheepDays.TEST_MOB, BaseSheepRenderer::new);
    }
}
