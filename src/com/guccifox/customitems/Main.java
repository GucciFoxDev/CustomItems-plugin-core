package com.guccifox.customitems;

import com.guccifox.customitems.commands.*;
import com.guccifox.customitems.events.*;
import com.guccifox.customitems.items.itemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {



    @Override
    public void onEnable() {

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[CustomItems]: Plugin is enabled!");
        itemManager.init();
        getServer().getPluginManager().registerEvents(new aspectOfTheEndEvent(), this);
        getServer().getPluginManager().registerEvents(new madBlockEvent(), this);
        getServer().getPluginManager().registerEvents(new alwaysSpawnEvent(), this);
        this.getServer().getPluginManager().registerEvents(new flowerOfTruthEvent(this), this);
        getServer().getPluginManager().registerEvents(new grapplingHook(), this);
        getCommand("givecreativemind").setExecutor(new giveCreativeMind());
        getCommand("givegamebreaker").setExecutor(new giveGameBreaker());
        getCommand("giveaspectoftheend").setExecutor(new giveAspectOfTheEnd());
        getCommand("givegrapplehook").setExecutor(new giveGrappleHook());
        getCommand("givefloweroftruth").setExecutor(new giveFlowerOfTruth());
        getCommand("givemadblock").setExecutor(new giveMadBlock());
        getCommand("heal").setExecutor(new commandHeal());
        getCommand("feed").setExecutor(new commandFeed());
        getCommand("ping").setExecutor(new commandPing());

        grapplingHookCooldown.setupCooldown();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[CustomItems]: Plugin is disabled!");
    }

}
