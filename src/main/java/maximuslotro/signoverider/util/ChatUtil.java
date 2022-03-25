package maximuslotro.signoverider.util;

import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class ChatUtil {



	public static void chatError(final ICommandSender sender, final String msg) {
		final ChatComponentText text = new ChatComponentText(msg);
		text.getChatStyle().setColor(EnumChatFormatting.RED);
		chat(sender, text);
	}

	public static void chatConfirm(final ICommandSender sender, final String msg) {
		final ChatComponentText text = new ChatComponentText(msg);
		text.getChatStyle().setColor(EnumChatFormatting.GREEN);
		chat(sender, text);
	}

	public static void chatNotify(final ICommandSender sender, final String msg) {
		final ChatComponentText text = new ChatComponentText(msg);
		text.getChatStyle().setColor(EnumChatFormatting.GOLD);
		chat(sender, text);
	}


	public static void chat(final ICommandSender sender, final IChatComponent msg) {
		if (sender != null) {
			sender.addChatMessage(msg);
		}
	}
}
