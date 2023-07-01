package com.nikolaipatrick.yteleporter.commands;

import com.nikolaipatrick.yteleporter.YTeleporter;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.Collection;

public class StartTeleporter implements CommandExecutor {

    public static int id;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        FileConfiguration config = YTeleporter.getInstance().getConfig();
        sender.sendMessage("Teleporter started!");
        id = Bukkit.getScheduler().scheduleSyncRepeatingTask(YTeleporter.getInstance(), new Runnable() {
            public void run() {
                Collection<? extends Player> players = Bukkit.getOnlinePlayers();
                for (Player player : players) {
                    player.teleport(player.getLocation().add(0, config.getInt("teleport-height"), 0));
                }

            }
        }, config.getInt("teleport-interval") * 20L,config.getInt("teleport-interval") * 20L);

        return true;
    }
}
