package com.mouse.artisan_of_mana.registeries;

import com.mouse.artisan_of_mana.ArtisanOfMana;
import com.mouse.artisan_of_mana.screens.mystic_wheel.MysticWheelMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AOMMenuRegisteries {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(BuiltInRegistries.MENU, ArtisanOfMana.MODID);

    public static final Supplier<MenuType<MysticWheelMenu>> MYSTIC_WHEEL =
            MENUS.register("mystic_wheel", () -> IMenuTypeExtension.create(MysticWheelMenu::new));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
