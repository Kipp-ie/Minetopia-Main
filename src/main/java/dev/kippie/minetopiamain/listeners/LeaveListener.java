package dev.kippie.minetopiamain.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveListener implements Listener {
    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Bukkit.getLogger().info(event.getPlayer().getName() + " has left the game!");
    }
}
