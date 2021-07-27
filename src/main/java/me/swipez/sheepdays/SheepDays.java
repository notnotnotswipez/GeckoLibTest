package me.swipez.sheepdays;

import me.swipez.sheepdays.entity.base.BaseSheepRenderer;
import me.swipez.sheepdays.entity.base.DumbSheepEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SheepDays implements ModInitializer {

    public static final EntityType<DumbSheepEntity> TEST_MOB = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("sheepdays", "dumb_sheep"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DumbSheepEntity::new).dimensions(EntityDimensions.fixed(1.3f, 1.5f)).build()
    );

    @Override
    public void onInitialize() {
        EntityRendererRegistry.INSTANCE.register(TEST_MOB,
                (BaseSheepRenderer::new));
        FabricDefaultAttributeRegistry.register(TEST_MOB, SheepEntity.createSheepAttributes());
    }
}
