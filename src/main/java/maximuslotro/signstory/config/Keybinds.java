package maximuslotro.signstory.config;


import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import maximuslotro.signstory.BetterSigns;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class Keybinds {

    public static KeyBinding noSignGui = new KeyBinding("key.signstory.nosigntext", Keyboard.KEY_I , "key.categories.signstory");

    @SubscribeEvent
    public static void registerKeyBindings(final FMLInitializationEvent event) {
    	ClientRegistry.registerKeyBinding(noSignGui);
    }
}
