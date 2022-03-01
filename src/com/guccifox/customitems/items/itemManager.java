package com.guccifox.customitems.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemManager {
    public static ItemStack creativemind;
    public static ItemStack gamebreaker;
    public static ItemStack aspectoftheend;
    public static ItemStack GrapplingHook;
    public static ItemStack FlowerOfTruth;

    public static void init() {
        createCreativemind();
        createGamebreaker();
        createAspectOfTheEnd();
        createGrapplingHook();
        createFlowerOfTruth();
    }

    private static void createCreativemind () {
        ItemStack item = new ItemStack(Material.ITEM_FRAME, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§d§lCreative Mind");
        List<String> lore = new ArrayList<>();
        lore.add("§7§oOriginal, visionary, inventive");
        lore.add("§7§oinnovative! I would even add");
        lore.add("§7§oingenious, clever! A");
        lore.add("§7§omasterpiece!");
        lore.add("§r");
        lore.add("§d§lSPECIAL");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        creativemind = item;
    }

    private static void createGamebreaker () {
        ItemStack item = new ItemStack(Material.TNT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dGame Breaker");
        List<String> lore = new ArrayList<>();
        lore.add("§fThis item was given to a player");
        lore.add("§fwho reported 3 or more bugs.");
        lore.add("§fThank goodness for them!");
        lore.add("§r");
        lore.add("§d§lSPECIAL");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        gamebreaker = item;
    }

    private static void createAspectOfTheEnd () {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§9Aspect Of The End");
        List<String> lore = new ArrayList<>();
        lore.add("§7Damage: §c+100");
        lore.add("§7Strength: §c+100");
        lore.add("§r");
        lore.add("§6Item Ability: Instant Transmission §l§eRIGHT CLICK");
        lore.add("§7Teleport §a8 blocks §7ahead of");
        lore.add("§7you and gain §a+50 §fSpeed");
        lore.add("§7for §a3 seconds§7.");
        lore.add("§8Mana Cost: §350");
        lore.add("§r");
        lore.add("§9§lRARE");
        meta.setLore(lore);
        item.setItemMeta(meta);
        aspectoftheend = item;
    }

    private static void createGrapplingHook() {
        ItemStack item = new ItemStack(Material.FISHING_ROD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§9Grappling Hook");
        List<String> lore = new ArrayList();
        lore.add("§9RARE");
        lore.add("§7Travel in style with this tool...");
        lore.add("Item has a 5 second cooldown.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        GrapplingHook = item;
    }

    private static void createFlowerOfTruth() {
        ItemStack item = new ItemStack(Material.RED_ROSE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Flower Of Truth");
        List<String> lore = new ArrayList();
        lore.add("§7Gear Score: §d460 §8(1113)");
        lore.add("§7Damage: §c+100 §8(+242)");
        lore.add("§7Strength: §c+360 §8(+871.2)");
        lore.add("§r");
        lore.add("§6Item Ability: Heat-Seeking Rose§e §lRIGHT CLICK");
        meta.setLore(lore);
        item.setItemMeta(meta);
        FlowerOfTruth = item;
    }
}
