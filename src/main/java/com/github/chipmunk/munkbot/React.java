package com.github.chipmunk.munkbot;

import org.javacord.api.entity.channel.TextChannel;

public class React {
	void commandSplitter(TextChannel channel, String user_input) {
		String[] msgSplit = user_input.split(" ");
		if (msgSplit.length == 2 && msgSplit[0].equals("!addreact")) {
			
		}
		else {
			channel.sendMessage("Incorrect formatting.");
		}
	}
}
