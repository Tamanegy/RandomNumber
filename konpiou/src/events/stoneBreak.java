package events;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;


public class stoneBreak implements Listener {

	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Random ran = new Random();
		Player player = e.getPlayer();
		
		if(e.getBlock().getType().equals(Material.STONE)) {
			int numberstone = 0;
            for(int x = 0; x <= 0; x++ ) {
			
			numberstone = ran.nextInt(20);
		}
            if(numberstone >= 0 && numberstone <= 5) {
            	
            	
            	
            	
            	int number = 0;	
            	for(int x = 0; x <= 0; x++ ) {
        			
        			number = ran.nextInt(20);
        		}
            	

    			if(number == 0) {
    				e.setCancelled(true);
    				Entity tnt = e.getPlayer().getWorld().spawn(e.getBlock().getLocation(), TNTPrimed.class);
    				e.getBlock().setType(Material.AIR);
    		        ((TNTPrimed)tnt).setFuseTicks(20);
    		        ((TNTPrimed)tnt).eject();
    		        player.sendTitle("§4" + number, null, 10, 10, 10);
    			}
    			if(number >= 1 && number <= 5) {
    				Silverfish mob = Bukkit.getWorld("world").spawn(e.getBlock().getLocation().add(1,0,0), Silverfish.class);
    				mob.setCustomName("Silverfish");
    				mob.setCustomNameVisible(true);
    				mob.setTarget(player);
    				mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(1.5);

    				player.sendTitle("§6" + number, null, 10, 10, 10);
    				e.setCancelled(true);
    				e.getBlock().setType(Material.AIR);
    			}
    			if(number >= 6 && number <= 10) {
    				e.getBlock().getLocation().add(0, 0, -1).getBlock().setType(Material.COAL_ORE);
    				e.getBlock().getLocation().add(0, 1, 0).getBlock().setType(Material.COAL_ORE);
    				player.sendTitle("§a" + number, null, 10, 10, 10);
    			}
    			if(number >= 11 && number <= 15) {
    				e.setCancelled(true);
    				e.getBlock().setType(Material.IRON_ORE);
    				player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
    				player.sendTitle("§2" + number, null, 10, 10, 10);
    			}
    			if(number >= 16 && number <= 18) {
    				e.setCancelled(true);
    				e.getBlock().setType(Material.AIR);
    				e.getBlock().getLocation().add(0, 0, -1).getBlock().setType(Material.IRON_ORE);
    				e.getBlock().getLocation().add(0, 1, 0).getBlock().setType(Material.IRON_ORE);
    				player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
    				player.sendTitle("§3" + number, null, 10, 10, 10);
    			}
    			if(number >= 19 && number <= 20) {
    				e.setCancelled(true);
    				e.getBlock().setType(Material.DIAMOND_ORE);
    				player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
    				player.sendTitle("§d" + number, null, 10, 10, 10);
    			}
    			
    			
    		}
            }
		}
		
		
	}
	
	

