package com.zoomdk.shopalert;

import com.zoomdk.shopalert.Commands.AlertCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ShopAlert extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("shopalert")).setExecutor(new AlertCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
