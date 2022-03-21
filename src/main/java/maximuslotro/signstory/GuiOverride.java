package maximuslotro.signstory;
/*
import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.FMLClientHandler;
import maximuslotro.signstory.Compact.CompatC12PacketUpdateSign;
import maximuslotro.signstory.Compact.CompatNetHandlerPlayClient;
import maximuslotro.signstory.Compact.*;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.client.C12PacketUpdateSign;
import net.minecraft.tileentity.TileEntitySign;

public class GuiOverride extends GuiEditSign{

	public GuiOverride(final @Nullable TileEntitySign parent) {
		
		super(parent);
	}

	@Override
	public void onGuiClosed() {
		String s = "Line 1, Line 2, Line 3, Line 4";
        String[] sArr = s.split(",");
        List<String> sList = Arrays.asList(sArr);
        Keyboard.enableRepeatEvents(false);
        NetHandlerPlayClient nethandlerplayclient = FMLClientHandler.instance().getClient().getNetHandler();
        if(nethandlerplayclient != null) 
        {
        	nethandlerplayclient.addToSendQueue(new C12PacketUpdateSign(Registry.SignX, Registry.SignY, Registry.SignZ, sList.toArray(new String[sList.size()])));
        }
	}
}
*/