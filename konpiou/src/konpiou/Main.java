package konpiou;



import org.bukkit.plugin.java.JavaPlugin;

import armors.CraftDiamondArmor;
import armors.CraftGoldArmor;
import armors.CraftIronArmor;


import diamondTools.CraftDiamondAxe;
import diamondTools.CraftDiamondHoe;
import diamondTools.CraftDiamondPickaxe;
import diamondTools.CraftDiamondShovel;
import diamondTools.CraftDiamondSword;
import events.afterEat;
import events.onDamage;
import events.onLeaveBed;
import events.stoneBreak;
import events.treeCut;
import goldTools.CraftGoldAxe;
import goldTools.CraftGoldHoe;
import goldTools.CraftGoldPickaxe;
import goldTools.CraftGoldShovel;
import goldTools.CraftGoldSword;
import ironTools.CraftIronAxe;
import ironTools.CraftIronHoe;
import ironTools.CraftIronPickaxe;
import ironTools.CraftIronShovel;
import ironTools.CraftIronSword;
import net.md_5.bungee.api.ChatColor;
import stoneTools.CraftStoneAxe;
import stoneTools.CraftStoneHoe;
import stoneTools.CraftStonePickaxe;
import stoneTools.CraftStoneShovel;
import stoneTools.CraftStoneSword;
import woodTools.CraftWoodenAxe;
import woodTools.CraftWoodenHoe;
import woodTools.CraftWoodenPickaxe;
import woodTools.CraftWoodenShovel;
import woodTools.CraftWoodenSword;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN+"  _____  _   _  _____ \r\n"
				+ " |  __ \\| \\ | |/ ____|\r\n"
				+ " | |__) |  \\| | |  __ \r\n"
				+ " |  _  /| . ` | | |_ |\r\n"
				+ " | | \\ \\| |\\  | |__| |\r\n"
				+ " |_|  \\_\\_| \\_|\\_____|\r\n"
				+ "                      \r\n"
				+ "                      ");


		
		// WOODEN TOOLS
		
		getServer().getPluginManager().registerEvents(new CraftWoodenPickaxe(), this);
		getServer().getPluginManager().registerEvents(new CraftWoodenSword(), this);
		getServer().getPluginManager().registerEvents(new CraftWoodenAxe(), this);
		getServer().getPluginManager().registerEvents(new CraftWoodenShovel(), this);
		getServer().getPluginManager().registerEvents(new CraftWoodenHoe(), this);
		
		// STONE TOOLS
		
		getServer().getPluginManager().registerEvents(new CraftStonePickaxe(), this);
		getServer().getPluginManager().registerEvents(new CraftStoneSword(), this);
		getServer().getPluginManager().registerEvents(new CraftStoneAxe(), this);
		getServer().getPluginManager().registerEvents(new CraftStoneShovel(), this);
		getServer().getPluginManager().registerEvents(new CraftStoneHoe(), this);
		
		// IRON TOOLS
		
		getServer().getPluginManager().registerEvents(new CraftIronPickaxe(), this);
		getServer().getPluginManager().registerEvents(new CraftIronSword(), this);
		getServer().getPluginManager().registerEvents(new CraftIronAxe(), this);
		getServer().getPluginManager().registerEvents(new CraftIronShovel(), this);
		getServer().getPluginManager().registerEvents(new CraftIronHoe(), this);
		
		// DIAMOND TOOLS
		
		getServer().getPluginManager().registerEvents(new CraftDiamondPickaxe(), this);
		getServer().getPluginManager().registerEvents(new CraftDiamondSword(), this);
		getServer().getPluginManager().registerEvents(new CraftDiamondAxe(), this);
		getServer().getPluginManager().registerEvents(new CraftDiamondShovel(), this);
		getServer().getPluginManager().registerEvents(new CraftDiamondHoe(), this);
		
		// GOLD TOOLS
		
		getServer().getPluginManager().registerEvents(new CraftGoldPickaxe(), this);
		getServer().getPluginManager().registerEvents(new CraftGoldSword(), this);
		getServer().getPluginManager().registerEvents(new CraftGoldAxe(), this);
		getServer().getPluginManager().registerEvents(new CraftGoldShovel(), this);
		getServer().getPluginManager().registerEvents(new CraftGoldHoe(), this);
		
		// ARMORS
		getServer().getPluginManager().registerEvents(new CraftDiamondArmor(), this);
		getServer().getPluginManager().registerEvents(new CraftGoldArmor(), this);
		getServer().getPluginManager().registerEvents(new CraftIronArmor(), this);
		
		// DESTROY BLOCKS EVENTS
		
		getServer().getPluginManager().registerEvents(new treeCut(), this);
		getServer().getPluginManager().registerEvents(new stoneBreak(), this);
		
		// EAT EVENT
		getServer().getPluginManager().registerEvents(new afterEat(), this);

		// DAMAGE EVENT
		
		getServer().getPluginManager().registerEvents(new onDamage(), this);
		
		// BED LEAVE EVENT
		
		getServer().getPluginManager().registerEvents(new onLeaveBed(), this);
		

		


		
		
		

	
	

		
	}
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "RNG Difficulty c'est eteint");
	    
	}

	
	
}



