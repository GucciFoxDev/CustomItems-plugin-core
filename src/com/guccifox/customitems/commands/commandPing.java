package com.guccifox.customitems.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandPing implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can run this command!");
            return true;
        }
        Player player = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("ping")) {
                player.sendMessage("Pong!");
            }
        return true;
    }
}
