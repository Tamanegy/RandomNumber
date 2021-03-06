package stoneTools;





import java.util.Random;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;



public class CraftStoneSword implements Listener {
	
	
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onCraft(CraftItemEvent e) {

		
		Random ran = new Random();
		Player player = (Player) e.getWhoClicked();
		
		
        // WOODEN PICKAXE
		if(e.getRecipe().getResult().getType().equals(Material.STONE_SWORD)) {
            int number = 0;
                for(int x = 0; x <= 0; x++ ) {
				
				number = ran.nextInt(20);
			}
            
			player.getOpenInventory().close();           
			if(number == 0) {
				player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1, (short) 130));
						player.getInventory().removeItem(new ItemStack(Material.STONE_SWORD));         
				player.sendTitle("?4" + number, null, 10, 10, 10);		
				player.getInventory().removeItem(new ItemStack(Material.COBBLESTONE, 2));   
				player.getInventory().removeItem(new ItemStack(Material.STICK, 1)); 
				player.updateInventory();
			}
			if(number >= 1 && number <= 5) {
				player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1, (short) 110));
						player.getInventory().removeItem(new ItemStack(Material.STONE_SWORD));        
				player.sendTitle("?6" + number, null, 10, 10, 10);	
				player.getInventory().removeItem(new ItemStack(Material.COBBLESTONE, 2));   
				player.getInventory().removeItem(new ItemStack(Material.STICK, 1)); 
				player.updateInventory();
			}
			if(number >= 6 && number <= 10) {
				player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1, (short) 50));
						player.getInventory().removeItem(new ItemStack(Material.STONE_SWORD));
	            player.sendTitle("?a" + number, null, 10, 10, 10);
				player.getInventory().removeItem(new ItemStack(Material.COBBLESTONE, 2));   
				player.getInventory().removeItem(new ItemStack(Material.STICK, 1)); 
				player.updateInventory();
			}
			if(number >= 11 && number <= 15) {
				player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1, (short) 20));
					player.getInventory().removeItem(new ItemStack(Material.STONE_SWORD));
            player.sendTitle("?2" + number, null, 10, 10, 10);
			
		}
			if(number >= 16 && number <= 18) {
				ItemStack customP = new ItemStack(Material.STONE_SWORD);
				customP.addEnchantment(Enchantment.DAMAGE_ALL, 1);
				
				player.getInventory().addItem(customP);
				player.getInventory().removeItem(new ItemStack(Material.STONE_SWORD));
				player.sendTitle("?3" + number, null, 10, 10, 10);
				player.getInventory().removeItem(new ItemStack(Material.COBBLESTONE, 2));   
				player.getInventory().removeItem(new ItemStack(Material.STICK, 1)); 
				player.updateInventory();
			}
			if(number >= 19 && number <= 20) {
				ItemStack customP = new ItemStack(Material.STONE_SWORD);
				customP.addEnchantment(Enchantment.DAMAGE_ALL, 2);
				player.getInventory().addItem(customP);
				player.getInventory().removeItem(new ItemStack(Material.STONE_SWORD));
				player.sendTitle("?d" + number, null, 10, 10, 10);
				player.getInventory().removeItem(new ItemStack(Material.COBBLESTONE, 2));   
				player.getInventory().removeItem(new ItemStack(Material.STICK, 1)); 
				player.updateInventory();
				player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
			}
		}
		
		
		
		
	}
	

}


