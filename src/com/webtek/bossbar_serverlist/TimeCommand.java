package com.webtek.bossbar_serverlist;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TimeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        player.resetPlayerTime();
        player.sendMessage(ChatColor.GREEN + "Your Time Has Been Reset!");
        return false;
    }
}
