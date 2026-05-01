import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.entity.EntityType;
import org.bukkit.Bukkit;
import org.bukkit.Location;

public class DoctorsBossesEvents extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerEnterCabin(PlayerInteractEvent event) {
        // Check if the player is entering the cabin (you will need to implement this check)
        if (isEnteringCabin(event.getPlayer().getLocation())) {
            spawnYetiWithDelay(event.getPlayer().getLocation());
        }
    }

    private void spawnYetiWithDelay(Location loc) {
        new BukkitRunnable() {
            @Override
            public void run() {
                loc.getWorld().spawnEntity(loc, EntityType.SNOWMAN); // Assuming the Yeti is represented by a snowman
            }
        }.runTaskLater(this, 2400); // 2400 ticks = 2 minutes
    }

    private boolean isEnteringCabin(Location loc) {
        // Implement the logic to determine if the player is entering the cabin
        return true; // Placeholder logic
    }
}