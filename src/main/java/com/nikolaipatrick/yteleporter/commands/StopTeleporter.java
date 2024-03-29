package com.nikolaipatrick.yteleporter.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StopTeleporter implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("Teleporter stopped!");
        Bukkit.getScheduler().cancelTask(StartTeleporter.id);
        return false;
    }
}
