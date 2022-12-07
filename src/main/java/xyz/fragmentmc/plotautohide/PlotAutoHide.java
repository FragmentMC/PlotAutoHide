package xyz.fragmentmc.plotautohide;

import com.plotsquared.core.PlotAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlotAutoHide extends JavaPlugin {
    PlotAPI plotAPI;
    P2Listener p2Listener;

    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("PlotSquared") != null && Bukkit.getPluginManager().getPlugin("plothider") != null) {
            Bukkit.getLogger().info("[PlotAutoHide] PlotSquared and PlotHider found. Hooking...");
            plotAPI = new PlotAPI();
            p2Listener = new P2Listener(plotAPI);
            Bukkit.getLogger().info("[PlotAutoHide] Hooked!");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
