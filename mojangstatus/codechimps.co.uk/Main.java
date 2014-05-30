package mojangstatus.codechimps.co.uk;

import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.json.simple.parser.ParseException;

public class Main extends JavaPlugin{
	
	public String Prefix = ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "STATUS" + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW;

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("status")){
			sender.sendMessage(Prefix + "Mojang Server Status");
			try {
	            if (ServerChecker.isOnline("login")) {
	                sender.sendMessage(Prefix + "Login Server is: " + ChatColor.GREEN + "ONLINE");
	            } else {
	                sender.sendMessage(Prefix + "Login Server is: " + ChatColor.RED + "OFFLINE");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
			try {
				if (ServerChecker.isOnline("account")) {
					sender.sendMessage(Prefix + "Account Server is: " + ChatColor.GREEN + "ONLINE");
				} else {
					sender.sendMessage(Prefix + "Account Server is: " + ChatColor.RED + "OFFLINE");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				if (ServerChecker.isOnline("authserver")) {
					sender.sendMessage(Prefix + "Authentication Server is: " + ChatColor.GREEN + "ONLINE");
				} else {
					sender.sendMessage(Prefix + "Authentication Server is: " + ChatColor.RED + "OFFLINE");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				if (ServerChecker.isOnline("skins")) {
					sender.sendMessage(Prefix + "Skin Server is: " + ChatColor.GREEN + "ONLINE");
				} else {
					sender.sendMessage(Prefix + "Skin Server is: " + ChatColor.RED + "OFFLINE");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				if (ServerChecker.isOnline("session")) {
					sender.sendMessage(Prefix + "Session Server is: " + ChatColor.GREEN + "ONLINE");
				} else {
					sender.sendMessage(Prefix + "Session Server is: " + ChatColor.RED + "OFFLINE");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			sender.sendMessage(Prefix + "This data is live data.");
		}
		return false;
	}
}
