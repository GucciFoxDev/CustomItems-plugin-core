package com.guccifox.customitems.events;

import com.guccifox.customitems.Main;
import com.guccifox.customitems.items.itemManager;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class flowerOfTruthEvent implements Listener {

    Main plugin;

    public flowerOfTruthEvent(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onRightClick (PlayerInteractEvent event) {
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getItem() != null) {
                if (event.getItem().getItemMeta().equals(itemManager.FlowerOfTruth.getItemMeta())) {
                    Player player = event.getPlayer();

                    ArmorStand ar = (ArmorStand) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.ARMOR_STAND);
                    ar.setVisible(false);
                    ar.setGravity(false);
                    ar.setArms(true);
                    ItemStack poppy = new ItemStack(Material.RED_ROSE);
                    ar.setItemInHand(poppy);


                    Vector copy = player.getLocation().getDirection();
                    ar.getLocation().setDirection(copy);

                    new BukkitRunnable() {
                        @Override
                        public void run() {

                            if (ar.getLocation().getBlock().getType().equals(Material.AIR)) {
                                ar.teleport(ar.getLocation().add(ar.getLocation().getDirection().multiply(1)));
                            } else {
                                World world = ar.getWorld();
                                float power = 2.0f;
                                world.createExplosion(ar.getLocation().getX(), ar.getLocation().getY(), ar.getLocation().getZ(), power, false, false);
                                this.cancel();
                                ar.remove();
                            }
                        }
                    }.runTaskTimer(plugin, 10, 1);
                }
            }
        }
    }
}
