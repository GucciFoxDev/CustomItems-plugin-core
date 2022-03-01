package com.guccifox.customitems.events;

import com.guccifox.customitems.items.itemManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class gameBreakerEvent implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced() != null) {
            if (event.getBlockPlaced().equals(itemManager.gamebreaker.getItemMeta())) {
                event.setCancelled(true);
            }
        }
    }
}
