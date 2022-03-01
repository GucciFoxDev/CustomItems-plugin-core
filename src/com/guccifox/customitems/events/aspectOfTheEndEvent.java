package com.guccifox.customitems.events;

import com.guccifox.customitems.items.itemManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Set;

public class aspectOfTheEndEvent implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(itemManager.aspectoftheend.getItemMeta())) {
                    Player player = event.getPlayer();
                    Block block = player.getTargetBlock((Set<Material>)null, 8);
                    Location location = block.getLocation();
                    float pitch = player.getEyeLocation().getPitch();
                    float yaw = player.getEyeLocation().getYaw();
                    location.add(0, 1, 0);
                    location.setYaw(yaw);
                    location.setPitch(pitch);
                    player.teleport(location);
                    player.playSound(player.getLocation(), Sound.ENDERMAN_TELEPORT, 5, 5);
                }
            }
        }
    }
}
