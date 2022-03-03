package maximuslotro.signstory.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiEditSign;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import maximuslotro.signstory.BetterSigns;
import maximuslotro.signstory.config.Keybinds;
import cpw.mods.fml.common.Mod;

public class Eventlistener {

    @SubscribeEvent
    public static void onRenderGui(GuiScreen event) {
        if(event instanceof GuiEditSign) {
            if(Keybinds.noSignGui.isPressed()) 
            {
            	Minecraft.getMinecraft().thePlayer.closeScreen();
            }
        }
    }
}
