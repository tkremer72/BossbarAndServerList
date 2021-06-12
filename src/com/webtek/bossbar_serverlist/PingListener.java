package com.webtek.bossbar_serverlist;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.io.File;

public class PingListener implements Listener {

    @EventHandler
    public void onPing(ServerListPingEvent serverListPingEvent) {
        serverListPingEvent.setMaxPlayers(200000);
        serverListPingEvent.setMotd(ChatColor.YELLOW + "This Is A WebTek Inc. Server!" + "\n" +
                ChatColor.BLUE + "Come Join The Minecraft Fun!");

        try {
            serverListPingEvent.setServerIcon(Bukkit.loadServerIcon(new File("webtek.png")));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
