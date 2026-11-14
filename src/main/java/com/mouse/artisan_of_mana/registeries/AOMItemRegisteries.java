package com.mouse.artisan_of_mana.registeries;

import com.mouse.artisan_of_mana.ArtisanOfMana;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class AOMItemRegisteries {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArtisanOfMana.MODID);

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}

    public static final DeferredItem<Item> FLUX_INGOT = ITEMS.register("flux_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ARCANE_ALLOY = ITEMS.register("arcane_alloy",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ELDER_WEAVE = ITEMS.register("elder_weave",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ENCHANTED_BOTTLE = ITEMS.register("enchanted_bottle",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> KNOWLEDGE_FRAGMENT = ITEMS.register("knowledge_fragment",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PURE_ELIXIR = ITEMS.register("pure_elixir",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TRUE_ESSENCE = ITEMS.register("true_essence",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FALSE_ESSENCE = ITEMS.register("false_essence",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TIME_ESSENCE = ITEMS.register("time_essence",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> KNOWLEDGE_ESSENCE = ITEMS.register("knowledge_essence",
            () -> new Item(new Item.Properties()));

    private static <T extends Item> DeferredHolder<Item, T> registerItem(String name, Function<Item.Properties, T> itemFactory) {
        return ITEMS.register(name, () -> itemFactory.apply(new Item.Properties()));
    }
}
