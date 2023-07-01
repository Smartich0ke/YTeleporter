package com.nikolaipatrick.yteleporter;

import com.nikolaipatrick.yteleporter.commands.StartTeleporter;
import com.nikolaipatrick.yteleporter.commands.StopTeleporter;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class YTeleporter extends JavaPlugin {

    private static YTeleporter instance;
    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.getCommand("start-teleporter").setExecutor(new StartTeleporter());
        this.getCommand("stop-teleporter").setExecutor(new StopTeleporter());
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static YTeleporter getInstance() {
        return instance;
    }
}
