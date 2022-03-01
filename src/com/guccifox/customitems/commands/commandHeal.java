package com.guccifox.customitems.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.jar.Attributes;

public class commandHeal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can run this command!");
            return true;
        }
        Player player = (Player) sender;
        if(!player.isOp()){
            player.sendMessage(ChatColor.RED + "You must be admin or higher to use this command!");
            return true;
        }
        if(player.isOp()) {
            if (cmd.getName().equalsIgnoreCase("heal")) {
                double maxHealth = player.getMaxHealth();
                player.setHealth(maxHealth);
                player.sendMessage(ChatColor.GREEN + "You have been healed to full health!");
            }


        }
        return true;
    }
}
