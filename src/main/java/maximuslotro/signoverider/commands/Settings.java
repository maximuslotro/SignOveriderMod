package maximuslotro.signoverider.commands;

import maximuslotro.signoverider.Registry;
import maximuslotro.signoverider.util.ChatUtil;
import net.minecraft.command.ICommandSender;
public class Settings extends BaseCommand {
	@Override
	public String getCommandName() {
		return "SignOverider";
	}
	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/SignOverider";
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

