package events;



import java.util.Random;


import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;



public class onDamage implements Listener {

	@EventHandler
	public void onHit(EntityDamageByEntityEvent e )  {
		
		

        Entity entity = e.getEntity();
		Random ran = new Random();
		Player player = (Player) e.getDamager();
		
       int number2 = 0;
		
		for(int x = 0; x <= 0; x++ ) {
			
			  number2 = ran.nextInt(20);
		}	   
		

		if(number2 >= 0 && number2 <= 5) {
		
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
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 4));			
				player.sendTitle("§6" + number, null, 5, 5, 5);
			}
			if(number >= 6 && number <= 10) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 40, 2));
				player.sendTitle("§a" + number, null, 5, 5, 5);
			}
			if(number >= 11 && number <= 15) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 40, 4));
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 80, 3));
				player.sendTitle("§2" + number, null, 5, 5, 5);
			}
			if(number >= 16 && number <= 18) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 40, 4));
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 80, 3));
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 50, 2));
				
				player.sendTitle("§3" + number, null, 5, 5, 5);
			}
			if(number >= 19 && number <= 20) {
				player.sendTitle("§d" + number, null, 5, 5, 5);
			    entity.remove();
			
		}	


		}

	}

	}
		
		
		

			
	
	
	

