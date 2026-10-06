package com.minom.world;

import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;


import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;

public class WetSandGenerate {


    public void isSand(ServerWorld world, BlockPos pos) {

        if (world.getBlockState(pos).isOf(Blocks.SAND)) {
            System.out.println("Sand found at Y = " + pos.getY());
        }
    }

    public static void register() {
        ServerChunkEvents.CHUNK_LOAD.register((world, chunk) -> {
    
            System.out.println("A chunk loaded!");
    
        });
    }


}