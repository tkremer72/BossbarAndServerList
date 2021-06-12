package com.webtek.bossbar_serverlist;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static void main(String[] args) {
    }
    BossBar bossBar;
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PingListener(), this);
        Bukkit.getPluginManager().registerEvents(new JoinListener(this),this);
        Bukkit.getPluginManager().registerEvents(new PlayerDamageListener(), this);

        bossBar = Bukkit.createBossBar(ChatColor.DARK_PURPLE + "Created By WebTek Inc.",
                BarColor.GREEN,
                BarStyle.SOLID,
                BarFlag.PLAY_BOSS_MUSIC);
        bossBar.setProgress(1);

        getCommand("heal").setExecutor(new HealCommand());
        getCommand("time").setExecutor(new TimeCommand());
    }
}
