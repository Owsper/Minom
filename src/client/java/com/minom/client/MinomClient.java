package com.minom.client;

import net.fabricmc.api.ClientModInitializer;

import com.minom.client.Player.PlayerMove;

public class MinomClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


        System.out.println("Minom client initialized!");

        PlayerMove.register();
        
    }
}