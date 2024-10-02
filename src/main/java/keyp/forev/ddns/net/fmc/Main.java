package keyp.forev.ddns.net.fmc;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.EventHandler;

public class Main extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("FMC-Pluginが有効になりました！");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("FMC-Pluginが無効になりました！");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("サーバーへようこそ、" + event.getPlayer().getName() + "さん！");
    }
}