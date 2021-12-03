package events;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class onLeaveBed implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onLeave(PlayerBedLeaveEvent e) {
		
		
		Random ran = new Random();
		Player player = e.getPlayer();
		
		
		int number = 0;
		for(int x = 0; x <= 0; x++ ) {
			
			  number = ran.nextInt(20);
		}	   
		if(number >= 0 && number <= 5) {
			Zombie zombie = Bukkit.getWorld("world").spawn(player.getLocation().add(0, 0, 2), Zombie.class);
			zombie.getEquipment().setBoots(new ItemStack (Material.DIAMOND_BOOTS));
			zombie.getEquipment().setChestplate(new ItemStack (Material.DIAMOND_CHESTPLATE));
			zombie.getEquipment().setLeggings(new ItemStack (Material.DIAMOND_LEGGINGS));
			zombie.getEquipment().setHelmet(new ItemStack (Material.DIAMOND_HELMET));
			zombie.getEquipment().setItemInHand(new ItemStack(Material.IRON_AXE));
			player.sendTitle("§4§kt§4CAUCHEMAR§kt  ", null, 10, 10, 10);
			zombie.setTarget(player);
			zombie.setCustomName("§4Freddy");
			zombie.setCustomNameVisible(true);	
		}
		if(number >= 15 && number <= 20) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 12000, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 12000, 2 ));
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 12000, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 12000, 1 ));
			player.sendTitle("§bRÊVE", null, 10, 10, 10);
		}
		if(number >= 6 && number <= 14) {
			return;
		}
	}
}
