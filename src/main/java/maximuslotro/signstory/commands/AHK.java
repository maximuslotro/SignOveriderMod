package maximuslotro.signstory.commands;

import maximuslotro.signstory.util.ChatUtil;
import net.minecraft.command.ICommandSender;
public class AHK extends BaseCommand {
	@Override
	public String getCommandName() {
		return "ahk";
	}
	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/ahk";
	}
	@Override
	public void processCommand(ICommandSender s, String[] args) {
		ChatUtil.sendCommand("/toplsx");
	}
}

