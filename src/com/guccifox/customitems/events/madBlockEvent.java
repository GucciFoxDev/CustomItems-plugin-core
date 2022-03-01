package com.guccifox.customitems.events;

import com.guccifox.customitems.items.itemManager;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class madBlockEvent implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlockPlaced() != null) {
            if (event.getBlockPlaced().equals(itemManager.MadBlock.getItemMeta())) {
                Block block = event.getBlock();
                Player player = event.getPlayer();
                block.getWorld().createExplosion(block.getLocation(), 2.0f);
                player.sendMessage("§4IM MAD!!!");
            }
        }
    }
}
