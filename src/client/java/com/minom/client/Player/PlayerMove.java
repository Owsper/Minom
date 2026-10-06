package com.minom.client.Player;

import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;


import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class PlayerMove {

    

    public static void PlayerPos(){

        MinecraftClient client = MinecraftClient.getInstance();
        
        if (client.player == null) return;

        String pos = "Player Position: " + client.player.getX() + ", " + client.player.getY() + ", " + client.player.getZ();
        client.player.sendMessage(Text.literal(pos), false);

    }



    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            PlayerPos(); 
        });
    }

}