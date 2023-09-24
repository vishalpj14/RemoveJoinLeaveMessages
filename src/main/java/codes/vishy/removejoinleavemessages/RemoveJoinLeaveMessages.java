package codes.vishy.removejoinleavemessages;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class RemoveJoinLeaveMessages extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this ,this);
        System.out.println("Plugin enabled.");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        e.setJoinMessage("");
    }
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        e.setQuitMessage("");
    }
}
