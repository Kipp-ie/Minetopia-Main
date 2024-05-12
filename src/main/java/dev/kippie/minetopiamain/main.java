package dev.kippie.minetopiamain;

import dev.kippie.minetopiamain.listeners.JoinListener;
import dev.kippie.minetopiamain.listeners.LeaveListener;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Minetopia Main - Active");
        Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
        Bukkit.getPluginManager().registerEvents(new LeaveListener(), this);
        Bukkit.getScoreboardManager().getMainScoreboard().registerNewTeam("Minetopia");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Minetopia Main - Disabled");
        // Plugin shutdown logic
    }
}
