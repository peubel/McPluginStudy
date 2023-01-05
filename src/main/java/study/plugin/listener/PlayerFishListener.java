package study.plugin.listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import study.plugin.Main;

public class PlayerFishListener implements Listener {

    public PlayerFishListener(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerFishAndSendFishName(PlayerFishEvent event) {
        Player player = event.getPlayer();
        Entity caught = event.getCaught();

        String fishName = caught.getName();

        player.sendMessage(fishName);
    }
}
