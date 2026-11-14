package com.mouse.artisan_of_mana.registeries;

import com.mouse.artisan_of_mana.ArtisanOfMana;
import com.mouse.artisan_of_mana.block.mystic_wheel.MysticWheelBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AOMBlockEntityRegisteries {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ArtisanOfMana.MODID);

    public static final Supplier<BlockEntityType<MysticWheelBlockEntity>> MYSTIC_WHEEL =
            BLOCK_ENTITIES.register("mystic_wheel", () -> BlockEntityType.Builder.of(
                    MysticWheelBlockEntity::new, AOMBlockRegisteries.MYSTIC_WHEEL.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
