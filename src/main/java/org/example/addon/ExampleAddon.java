package org.example.addon;

import io.github.solclient.client.addon.Addon;
import io.github.solclient.client.event.EventHandler;
import io.github.solclient.client.event.impl.SendChatMessageEvent;

public final class ExampleAddon extends Addon {

	@EventHandler
	public void onPlayerChat(SendChatMessageEvent event) {
		System.out.println("Player is sending " + event.message);
	}

}
