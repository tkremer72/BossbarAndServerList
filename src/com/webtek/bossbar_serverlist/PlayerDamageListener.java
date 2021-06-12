package com.webtek.bossbar_serverlist;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerDamageListener implements Listener {

    @EventHandler
    public void onMove(PlayerInteractEvent pie) {
        Player player = pie.getPlayer();
        if(player.getHealth() <= 19) {
            player.setHealth(20);
            player.sendMessage(ChatColor.GREEN + "You Lost Health Points, You Gained Health Points!");
        } else {
            return;
        }
    }
}
