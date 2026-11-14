package com.mouse.artisan_of_mana;

import com.mouse.artisan_of_mana.registeries.AOMBlockEntityRegisteries;
import com.mouse.artisan_of_mana.registeries.AOMBlockRegisteries;
import com.mouse.artisan_of_mana.registeries.AOMItemRegisteries;
import com.mouse.artisan_of_mana.registeries.AOMRecipeRegisteries;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(ArtisanOfMana.MODID)
public class ArtisanOfMana {
    public static final String MODID = "artisan_of_mana";

    public ArtisanOfMana(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        AOMItemRegisteries.register(modEventBus);

        AOMBlockRegisteries.register(modEventBus);

        AOMBlockEntityRegisteries.register(modEventBus);

        AOMRecipeRegisteries.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    public static ResourceLocation namespacePath(@NotNull String path) {
        return ResourceLocation.fromNamespaceAndPath(ArtisanOfMana.MODID, path);
    }

    public static ResourceLocation id(@NotNull String path) {
        return ResourceLocation.fromNamespaceAndPath(ArtisanOfMana.MODID, path);
    }
}
