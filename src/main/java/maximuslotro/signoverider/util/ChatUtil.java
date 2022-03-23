package maximuslotro.signoverider.util;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

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
	public static void sendCommand(String command) {
        if (command.length() == 0)
            return;


        Minecraft.getMinecraft().thePlayer.sendChatMessage(command);
    }
}
