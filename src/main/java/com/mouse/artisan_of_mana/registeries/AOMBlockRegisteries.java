package com.mouse.artisan_of_mana.registeries;

import com.mouse.artisan_of_mana.ArtisanOfMana;
import com.mouse.artisan_of_mana.block.mystic_wheel.MysticWheelBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class AOMBlockRegisteries {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ArtisanOfMana.MODID);

    public static final DeferredBlock<Block> MITHRIL_BLOCK = registerBlock("mithril_block",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .requiresCorrectToolForDrops()
                    .strength(7.0F, 8.0F)
                    .sound(SoundType.METAL)));

    public static final DeferredBlock<Block> ARCANE_CANDLE = registerBlock("arcane_candle",
            () -> new Block(BlockBehaviour
                    .Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 5.0F)
                    .sound(SoundType.CANDLE)));

    public static final DeferredBlock<Block> MYSTIC_WHEEL = registerBlock("mystic_wheel",
            () -> new MysticWheelBlock(BlockBehaviour
                    .Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)
                    .noOcclusion()
                    .pushReaction(PushReaction.BLOCK)
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        AOMItemRegisteries.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

