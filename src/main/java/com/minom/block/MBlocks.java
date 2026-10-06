package com.minom.block;

import com.minom.Minom;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MBlocks {

    public static final Block WET_SAND = new FallingBlock(
            AbstractBlock.Settings.copy(Blocks.SAND)
    );

    public static void registerModBlocks() {
        Registry.register(
                Registry.BLOCK,
                new Identifier(Minom.MOD_ID, "wet_sand"),
                WET_SAND
        );

        Registry.register(
                Registry.ITEM,
                new Identifier(Minom.MOD_ID, "wet_sand"),
                new BlockItem(WET_SAND, new Item.Settings())
        );

        System.out.println("Registered Wet Sand!");
    }
}

