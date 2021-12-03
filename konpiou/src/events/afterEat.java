package events;

import org.bukkit.Sound;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class afterEat implements Listener {

	@EventHandler
	public void oneat(PlayerItemConsumeEvent e) {
		
        Random ran = new Random();
		Player player = e.getPlayer();
		
		
		
			
		int numberchance = 0;

		for(int x = 0; x <= 0; x++ ) {
			
		  numberchance = ran.nextInt(20);
		}
		
		
		 
		if(numberchance >= 0 && numberchance <= 10) {
		
			int number = 0;
			
			for(int x = 0; x <= 0; x++ ) {
				
				  number = ran.nextInt(20);
			}	   
		if(number == 0) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 4));
			player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 100, 100));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 5));
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 100));
			player.sendTitle("§4" + number, null, 10, 10, 10);
		}
		if(number >= 1 && number <= 5) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 4));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 200, 50));
			player.sendTitle("§6" + number, null, 10, 10, 10);
		}
		if(number >= 6 && number <= 10) {
			player.sendTitle("§a" + number, null, 10, 10, 10);
			return;
		}
		if(number >= 11 && number <= 15) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 400, 0));
			player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
			player.sendTitle("§2" + number, null, 10, 10, 10);
		}
		if(number >= 16 && number <= 18) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 400, 0));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 1 ));
			player.sendTitle("§3" + number, null, 10, 10, 10);
		}
		if(number >= 19 && number <= 20) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 400, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 2 ));
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 400, 1));
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 400, 1 ));
			player.setFoodLevel(20);
			player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
			player.sendTitle("§d" + number, null, 10, 10, 10);
		}
		}
			}
		
		
	}
	
	
  