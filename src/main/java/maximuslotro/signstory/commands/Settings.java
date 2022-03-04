package maximuslotro.signstory.commands;

import maximuslotro.signstory.Registry;
import maximuslotro.signstory.util.ChatUtil;
import net.minecraft.command.ICommandSender;
public class Settings extends BaseCommand {
	@Override
	public String getCommandName() {
		return "SignStory";
	}
	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/SignStory";
	}
	@Override
	public void processCommand(ICommandSender s, String[] args) {
		if (Registry.NoGui == false) 
		{
			Registry.NoGui = true;
			ChatUtil.chatNotify(s, "Sign Gui on place DISABLED!");
		}else {Registry.NoGui = false; ChatUtil.chatNotify(s, "Sign Gui on place ENABLED!");}
	}
}

