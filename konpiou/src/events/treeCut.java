package events;



import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class treeCut implements Listener {
	
	
	

	  

	 
	@SuppressWarnings("deprecation")
	@EventHandler
	public static void onBreak(BlockBreakEvent e) {
         
		Player player = e.getPlayer();
		Random ran = new Random();
		
		

		

 
	
		// OAK
		if(e.getBlock().getType().equals(Material.OAK_LOG)) {
			int number = 0;
			
			for(int x = 0; x <= 0; x++ ) {
				
				number = ran.nextInt(20);
			}
			if(number >= 1 && number <= 5) {
				Bee mob = Bukkit.getWorld("world").spawn(player.getLocation(), Bee.class);
				mob.setCustomName("?ebee");
				mob.setCustomNameVisible(true);
				mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(1);
				mob.attack(player);
				mob.setAnger(630);
				player.sendTitle("?6" + number, null, 10, 10, 10); 
			}
			if(number == 0) {
				Zombie mobz = Bukkit.getWorld("world").spawn(player.getLocation().add(0, 2, 0), Zombie.class);
				mobz.getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS));
				mobz.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
				mobz.getEquipment().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				mobz.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
				mobz.getEquipment().getItemInHand().setType(Material.AIR);
				mobz.setAge(10);
				mobz.setHealth(10);
				mobz.setTarget(player);
				mobz.setCustomName("?2Bob");
				mobz.setCustomNameVisible(true);
				player.playSound(mobz.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1, 1);
				player.sendTitle("?4" + number, null, 10, 10, 10);
			}
			if(number >= 6 && number <= 10) {		
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.OAK_LOG, 1));
				player.sendTitle("?a" + number, null, 10, 10, 10);
			}
			if(number == 11 || number == 12 || number == 13 || number == 14 || number == 15) {
				e.getBlock().setType(Material.AIR);				
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.OAK_LOG, 2));
				player.sendTitle("?2" + number, null, 10, 10, 10);
			}
			
			if(number == 16 || number == 17 || number == 18) {				
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.OAK_LOG, 5));
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET, 6));
				player.sendTitle("?3" + number, null, 10, 10, 10);
			}
			if(number == 19 || number == 20) {
				e.getBlock().setType(Material.AIR);		
                player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND, 2));
				player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
				player.sendTitle("?d" + number, null, 10, 10, 10);
			}
		}
		// SPRUCE
		if(e.getBlock().getType().equals(Material.SPRUCE_LOG)) {
			int number = 19;
			
			for(int x = 0; x <= 0; x++ ) {
				
				number = ran.nextInt(20);
			}
			
			if(number >= 1 && number <= 5) {
				Bee mob = Bukkit.getWorld("world").spawn(player.getLocation(), Bee.class);
				mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(4);
				mob.attack(player);
				mob.setAnger(630);
				player.sendTitle("?6" + number, null, 10, 10, 10); 
			}
			if(number == 0) {
				Zombie mobz = Bukkit.getWorld("world").spawn(player.getLocation().add(0, 2, 0), Zombie.class);
				mobz.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				mobz.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				mobz.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				mobz.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				mobz.getEquipment().getItemInHand().setType(Material.AIR);
				mobz.setAge(10);
				mobz.setHealth(10);
				mobz.setTarget(player);
				mobz.setCustomName("?2Bob");
				mobz.setCustomNameVisible(true);
				player.playSound(mobz.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1, 1);
				player.sendTitle("?4" + number, null, 10, 10, 10);
			}
			if(number >= 6 && number <= 10) {		
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.SPRUCE_LOG, 1));
				player.sendTitle("?a" + number, null, 10, 10, 10);
			}
			if(number == 11 || number == 12 || number == 13 || number == 14 || number == 15) {
				e.getBlock().setType(Material.AIR);				
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.SPRUCE_LOG, 2));
				player.sendTitle("?2" + number, null, 10, 10, 10);
			}
			
			if(number == 16 || number == 17 || number == 18) {				
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.SPRUCE_LOG, 5));
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET, 6));
				player.sendTitle("?3" + number, null, 10, 10, 10);
			}
			if(number == 19 || number == 20) {
				e.getBlock().setType(Material.AIR);		
                player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND, 2));
				player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
				player.sendTitle("?d" + number, null, 10, 10, 10);
			}
		}
		// BIRCH
		if(e.getBlock().getType().equals(Material.BIRCH_LOG)) {
			int number = 19;
			
			for(int x = 0; x <= 0; x++ ) {
				
				number = ran.nextInt(20);
			}
			if(number >= 1 && number <= 5) {
				Bee mob = Bukkit.getWorld("world").spawn(player.getLocation(), Bee.class);
				mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(4);
				mob.attack(player);
				mob.setAnger(630);
				player.sendTitle("?6" + number, null, 10, 10, 10); 
			}
			if(number == 0) {
				Zombie mobz = Bukkit.getWorld("world").spawn(player.getLocation().add(0, 2, 0), Zombie.class);
				mobz.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				mobz.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				mobz.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				mobz.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				mobz.getEquipment().getItemInHand().setType(Material.AIR);
				mobz.setAge(10);
				mobz.setHealth(10);
				mobz.setTarget(player);
				mobz.setCustomName("?2Bob");
				mobz.setCustomNameVisible(true);
				player.playSound(mobz.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1, 1);
				player.sendTitle("?4" + number, null, 10, 10, 10);
			}
			if(number >= 6 && number <= 10) {		
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.BIRCH_LOG, 1));
				player.sendTitle("?a" + number, null, 10, 10, 10);
			}
			if(number == 11 || number == 12 || number == 13 || number == 14 || number == 15) {
				e.getBlock().setType(Material.AIR);				
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.BIRCH_LOG, 2));
				player.sendTitle("?2" + number, null, 10, 10, 10);
			}
			
			if(number == 16 || number == 17 || number == 18) {				
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.BIRCH_LOG, 5));
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET, 6));
				player.sendTitle("?3" + number, null, 10, 10, 10);
			}
			if(number == 19 || number == 20) {
				e.getBlock().setType(Material.AIR);		
                player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND, 2));
				player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
				player.sendTitle("?d" + number, null, 10, 10, 10);
			}
		}
		// JUNGLE
		if(e.getBlock().getType().equals(Material.JUNGLE_LOG)) {

			int number = 19;
			
			for(int x = 0; x <= 0; x++ ) {
				
				number = ran.nextInt(20);
			}
			if(number >= 1 && number <= 5) {
				Bee mob = Bukkit.getWorld("world").spawn(player.getLocation(), Bee.class);
				mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(4);
				mob.attack(player);
				mob.setAnger(630);
				player.sendTitle("?6" + number, null, 10, 10, 10); 
			}
			if(number == 0) {
				Zombie mobz = Bukkit.getWorld("world").spawn(player.getLocation().add(0, 2, 0), Zombie.class);
				mobz.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				mobz.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				mobz.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				mobz.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				mobz.getEquipment().getItemInHand().setType(Material.AIR);
				mobz.setAge(10);
				mobz.setHealth(10);
				mobz.setTarget(player);
				mobz.setCustomName("?2Bob");
				mobz.setCustomNameVisible(true);
				player.playSound(mobz.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1, 1);
				player.sendTitle("?4" + number, null, 10, 10, 10);
			}
			if(number >= 6 && number <= 10) {		
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.JUNGLE_LOG, 1));
				player.sendTitle("?a" + number, null, 10, 10, 10);
			}
			if(number == 11 || number == 12 || number == 13 || number == 14 || number == 15) {
				e.getBlock().setType(Material.AIR);				
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.JUNGLE_LOG, 2));
				player.sendTitle("?2" + number, null, 10, 10, 10);
			}
			
			if(number == 16 || number == 17 || number == 18) {				
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.JUNGLE_LOG, 5));
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET, 6));
				player.sendTitle("?3" + number, null, 10, 10, 10);
			}
			if(number == 19 || number == 20) {
				e.getBlock().setType(Material.AIR);		
                player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND, 2));
				player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
				player.sendTitle("?d" + number, null, 10, 10, 10);
			}
		}
		// ACACIA
		if(e.getBlock().getType().equals(Material.ACACIA_LOG)) {

			int number = 19;
			
			for(int x = 0; x <= 0; x++ ) {
				
				number = ran.nextInt(20);
			}
			if(number >= 1 && number <= 5) {
				Bee mob = Bukkit.getWorld("world").spawn(player.getLocation(), Bee.class);
				mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(4);
				mob.attack(player);
				mob.setAnger(630);
				player.sendTitle("?6" + number, null, 10, 10, 10); 
			}
			if(number == 0) {
				Zombie mobz = Bukkit.getWorld("world").spawn(player.getLocation().add(0, 2, 0), Zombie.class);
				mobz.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				mobz.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				mobz.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				mobz.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				mobz.getEquipment().getItemInHand().setType(Material.AIR);
				mobz.setAge(10);
				mobz.setHealth(10);
				mobz.setTarget(player);
				mobz.setCustomName("?2Bob");
				mobz.setCustomNameVisible(true);
				player.playSound(mobz.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1, 1);
				player.sendTitle("?4" + number, null, 10, 10, 10);
			}
			if(number >= 6 && number <= 10) {		
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ACACIA_LOG, 1));
				player.sendTitle("?a" + number, null, 10, 10, 10);
			}
			if(number == 11 || number == 12 || number == 13 || number == 14 || number == 15) {
				e.getBlock().setType(Material.AIR);				
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ACACIA_LOG, 2));
				player.sendTitle("?2" + number, null, 10, 10, 10);
			}
			
			if(number == 16 || number == 17 || number == 18) {				
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ACACIA_LOG, 5));
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET, 6));
				player.sendTitle("?3" + number, null, 10, 10, 10);
			}
			if(number == 19 || number == 20) {
				e.getBlock().setType(Material.AIR);		
                player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND, 2));
				player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
				player.sendTitle("?d" + number, null, 10, 10, 10);
			}
		}
		// DARK OAK
		if(e.getBlock().getType().equals(Material.DARK_OAK_LOG)) {
			int number = 19;
			
			for(int x = 0; x <= 0; x++ ) {
				
				number = ran.nextInt(20);
			}
			if(number >= 1 && number <= 5) {
				Bee mob = Bukkit.getWorld("world").spawn(player.getLocation(), Bee.class);
				mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(4);
				mob.attack(player);
				mob.setAnger(630);
				player.sendTitle("?6" + number, null, 10, 10, 10); 
			}
			if(number == 0) {
				Zombie mobz = Bukkit.getWorld("world").spawn(player.getLocation().add(0, 2, 0), Zombie.class);
				mobz.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
				mobz.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
				mobz.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
				mobz.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
				mobz.getEquipment().getItemInHand().setType(Material.AIR);
				mobz.setAge(10);
				mobz.setHealth(10);
				mobz.setTarget(player);
				mobz.setCustomName("?2Bob");
				mobz.setCustomNameVisible(true);
				player.playSound(mobz.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1, 1);
				player.sendTitle("?4" + number, null, 10, 10, 10);
			}
			if(number >= 6 && number <= 10) {		
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DARK_OAK_LOG, 1));
				player.sendTitle("?a" + number, null, 10, 10, 10);
			}
			if(number == 11 || number == 12 || number == 13 || number == 14 || number == 15) {
				e.getBlock().setType(Material.AIR);				
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DARK_OAK_LOG, 2));
				player.sendTitle("?2" + number, null, 10, 10, 10);
			}
			
			if(number == 16 || number == 17 || number == 18) {				
				e.getBlock().setType(Material.AIR);
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DARK_OAK_LOG, 5));
				player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET, 6));
				player.sendTitle("?3" + number, null, 10, 10, 10);
			}
			if(number == 19 || number == 20) {
				e.getBlock().setType(Material.AIR);		
                player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.DIAMOND, 2));
				player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1, 1);
				player.sendTitle("?d" + number, null, 10, 10, 10);
			}
		}
		
		
		
		
}
	}
	

