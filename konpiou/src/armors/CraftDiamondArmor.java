package armors;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

public class CraftDiamondArmor implements Listener {

	
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onCraft(CraftItemEvent e) {
	Random ran = new Random();
	Player player = (Player) e.getWhoClicked();
	
	
	if(e.getRecipe().getResult().getType().equals(Material.DIAMOND_CHESTPLATE)) {
        int number = 0;
            for(int x = 0; x <= 0; x++ ) {
			
			number = ran.nextInt(20);
		}
        
		player.getOpenInventory().close();           
		if(number == 0) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE, 1, (short) 527));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_CHESTPLATE));         
			player.sendTitle("§4" + number, null, 10, 10, 10);			
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 8));   
			player.updateInventory();
		}
		if(number >= 1 && number <= 5) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE, 1, (short) 400));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_CHESTPLATE));        
			player.sendTitle("§6" + number, null, 10, 10, 10);	
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 8));   
			player.updateInventory();
		}
		if(number >= 6 && number <= 10) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE, 1, (short) 200));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
            player.sendTitle("§a" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 8));   
			player.updateInventory();
		}
		if(number >= 11 && number <= 15) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_CHESTPLATE, 1, (short) 100));
				player.getInventory().removeItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
        player.sendTitle("§2" + number, null, 10, 10, 10);
		player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 8));   
		player.updateInventory();
		
	}
		if(number >= 16 && number <= 18) {
			ItemStack customP = new ItemStack(Material.DIAMOND_CHESTPLATE);
			customP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			player.getInventory().addItem(customP);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
			player.sendTitle("§3" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 8));   
			player.updateInventory();
		}
		if(number >= 19 && number <= 20) {
			ItemStack customP = new ItemStack(Material.DIAMOND_CHESTPLATE);
			customP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			player.getInventory().addItem(customP);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND_CHESTPLATE));
			player.sendTitle("§d" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 8));   
			player.updateInventory();
			player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
		}
	}
	
	
	
	if(e.getRecipe().getResult().getType().equals(Material.DIAMOND_HELMET)) {
        int number = 0;
            for(int x = 0; x <= 0; x++ ) {
			
			number = ran.nextInt(20);
		}
        
		player.getOpenInventory().close();           
		if(number == 0) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_HELMET, 1, (short) 250));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_HELMET));         
			player.sendTitle("§4" + number, null, 10, 10, 10);		
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 5));   
			player.updateInventory();
		}
		if(number >= 1 && number <= 5) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_HELMET, 1, (short) 150));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_HELMET));        
			player.sendTitle("§6" + number, null, 10, 10, 10);		
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 5));   
			player.updateInventory();
		}
		if(number >= 6 && number <= 10) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_HELMET, 1, (short) 50));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_HELMET));
            player.sendTitle("§a" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 5));   
			player.updateInventory();
		}
		if(number >= 11 && number <= 15) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_HELMET, 1, (short) 20));
				player.getInventory().removeItem(new ItemStack(Material.DIAMOND_HELMET));
        player.sendTitle("§2" + number, null, 10, 10, 10);
		player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 5));   
		player.updateInventory();
		
	}
		if(number >= 16 && number <= 18) {
			ItemStack customP = new ItemStack(Material.DIAMOND_HELMET);
			customP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			player.getInventory().addItem(customP);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND_HELMET));
			player.sendTitle("§3" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 5));   
			player.updateInventory();
		}
		if(number >= 19 && number <= 20) {
			ItemStack customP = new ItemStack(Material.DIAMOND_HELMET);
			customP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			player.getInventory().addItem(customP);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND_HELMET));
			player.sendTitle("§d" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 5));   
			player.updateInventory();
			player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
		}
	}
	
	
	if(e.getRecipe().getResult().getType().equals(Material.DIAMOND_BOOTS)) {
        int number = 0;
            for(int x = 0; x <= 0; x++ ) {
			
			number = ran.nextInt(20);
		}
        
		player.getOpenInventory().close();           
		if(number == 0) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS, 1, (short) 250));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_BOOTS));         
			player.sendTitle("§4" + number, null, 10, 10, 10);		
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 4));   
			player.updateInventory();
		}
		if(number >= 1 && number <= 5) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS, 1, (short) 150));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_BOOTS));        
			player.sendTitle("§6" + number, null, 10, 10, 10);		
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 4));   
			player.updateInventory();
		}
		if(number >= 6 && number <= 10) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS, 1, (short) 50));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_BOOTS));
            player.sendTitle("§a" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 4));   
			player.updateInventory();
		}
		if(number >= 11 && number <= 15) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_BOOTS, 1, (short) 20));
				player.getInventory().removeItem(new ItemStack(Material.DIAMOND_BOOTS));
        player.sendTitle("§2" + number, null, 10, 10, 10);
		player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 4));   
		player.updateInventory();
		
	}
		if(number >= 16 && number <= 18) {
			ItemStack customP = new ItemStack(Material.DIAMOND_BOOTS);
			customP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			player.getInventory().addItem(customP);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND_BOOTS));
			player.sendTitle("§3" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 4));   
			player.updateInventory();
		}
		if(number >= 19 && number <= 20) {
			ItemStack customP = new ItemStack(Material.DIAMOND_BOOTS);
			customP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			player.getInventory().addItem(customP);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND_BOOTS));
			player.sendTitle("§d" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 4));   
			player.updateInventory();
			player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
		}
	}
	
	
	if(e.getRecipe().getResult().getType().equals(Material.DIAMOND_LEGGINGS)) {
        int number = 0;
            for(int x = 0; x <= 0; x++ ) {
			
			number = ran.nextInt(20);
		}
        
		player.getOpenInventory().close();           
		if(number == 0) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_LEGGINGS, 1, (short) 300));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_LEGGINGS));         
			player.sendTitle("§4" + number, null, 10, 10, 10);	
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 7));   
			player.updateInventory();
		}
		if(number >= 1 && number <= 5) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_LEGGINGS, 1, (short) 200));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_LEGGINGS));        
			player.sendTitle("§6" + number, null, 10, 10, 10);	
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 7));   
			player.updateInventory();
		}
		if(number >= 6 && number <= 10) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_LEGGINGS, 1, (short) 100));
					player.getInventory().removeItem(new ItemStack(Material.DIAMOND_LEGGINGS));
            player.sendTitle("§a" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 7));   
			player.updateInventory();
		}
		if(number >= 11 && number <= 15) {
			player.getInventory().addItem(new ItemStack(Material.DIAMOND_LEGGINGS, 1, (short) 50));
				player.getInventory().removeItem(new ItemStack(Material.DIAMOND_LEGGINGS));
        player.sendTitle("§2" + number, null, 10, 10, 10);
		player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 7));   
		player.updateInventory();
		
	}
		if(number >= 16 && number <= 18) {
			ItemStack customP = new ItemStack(Material.DIAMOND_LEGGINGS);
			customP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
			player.getInventory().addItem(customP);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND_LEGGINGS));
			player.sendTitle("§3" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 7));   
			player.updateInventory();
		}
		if(number >= 19 && number <= 20) {
			ItemStack customP = new ItemStack(Material.DIAMOND_LEGGINGS);
			customP.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			player.getInventory().addItem(customP);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND_LEGGINGS));
			player.sendTitle("§d" + number, null, 10, 10, 10);
			player.getInventory().removeItem(new ItemStack(Material.DIAMOND, 7));   
			player.updateInventory();
			player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
		}
	}
	
	
}
	{

}
	
}
