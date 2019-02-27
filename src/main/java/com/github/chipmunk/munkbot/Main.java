package com.github.chipmunk.munkbot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

    public static void main(String[] args) {
        String token = "MzM1NDk4MDMyODA2MTAxMDAy.DoCBPA.qgXqONlCqXPc6_mm8UT-x-puB3o";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();


        api.addMessageCreateListener(event -> {
            MapList thing = new MapList();
            String input = event.getMessage().getContent();
            System.out.println(input);
            //handle input
            thing.myfunc(event.getChannel(), input);

            if (event.getMessage().getContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
            if (input.equals("!prefix")) {
            	event.getMessage().addReaction("😃");
            }
            
        });

        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }
}
