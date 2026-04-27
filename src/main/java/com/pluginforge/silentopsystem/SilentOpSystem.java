package com.pluginforge.silentopsystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class SilentOpSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SilentOpSystem v1.0 enabled.");
        getCommand("op").setExecutor(new OpCommand());

    }

    @Override
    public void onDisable() {
        getLogger().info("SilentOpSystem disabled.");
    }
}
