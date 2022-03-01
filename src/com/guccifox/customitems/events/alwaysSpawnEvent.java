package com.guccifox.customitems.events;

import com.connorlinfoot.titleapi.TitleAPI;
import com.onarandombox.MultiverseCore.MultiverseCore;
import com.onarandombox.MultiverseCore.api.MVWorldManager;
import com.onarandombox.MultiverseCore.api.MultiverseWorld;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class alwaysSpawnEvent implements Listener {

    MultiverseCore core = (MultiverseCore) Bukkit.getServer().getPluginManager().getPlugin("Multiverse-Core");
    MVWorldManager worldManager = core.getMVWorldManager();
    MultiverseWorld creativeWorld = worldManager.getMVWorld("world");

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        final Player player = event.getPlayer();
        worldManager.loadWorld("world");
        Location loc = new Location(Bukkit.getWorld("world"), 43, 113, 63, 0, 0);
        player.teleport(loc);
        player.setGameMode(GameMode.CREATIVE);
        TitleAPI.sendTitle(player, 25, 25, 25, "§4Welcome to", "5 Frame Studios!");
    }
}
