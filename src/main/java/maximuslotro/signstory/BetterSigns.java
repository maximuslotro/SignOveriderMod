package maximuslotro.signstory;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.item.ItemSign;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import maximuslotro.signstory.commands.Settings;
import maximuslotro.signstory.commands.BaseCommand;
import maximuslotro.signstory.util.ChatUtil;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.net.Priority;

import java.util.Objects;

import javax.annotation.Nullable;

@Mod(modid = BetterSigns.MOD_ID, version = "1", name = "Sign Story Mod", acceptedMinecraftVersions = "1.7.10")
public class BetterSigns
{
    public static final String MOD_ID = "signstory";
    public static final Block block_sign = (Block)Block.blockRegistry.getObject("standing_sign");
    public static final Block wall_sign = (Block)Block.blockRegistry.getObject("wall_sign");
    private static final Logger LOGGER = LogManager.getLogger();
	public static @Nullable BaseCommand rootCommand;
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
        try {
        	ClientCommandHandler.instance.registerCommand(new Settings());
        } catch (Exception e) {
        	System.out.println("error");
        }
        Registry.NoGui = false;
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void interact(PlayerInteractEvent e) {
		if (e.action == Action.RIGHT_CLICK_BLOCK) { 
			if (e.world.getBlock(e.x, e.y, e.z) == wall_sign|| e.world.getBlock(e.x, e.y, e.z) == block_sign) {
            final TileEntitySign sign = (TileEntitySign) e.world.getTileEntity(e.x, e.y, e.z);
            ChatUtil.chatError(e.entityPlayer, "Sign Clicked!");
            /*
            BlockEntity tileEntity = event.getWorld().getBlockEntity(event.getPos());
            if(sign instanceof BlockSignEntity) {
                SignBlockEntity signTileEntity = (SignBlockEntity) tileEntity;
                signTileEntity.setEditable(true);
                event.getPlayer().openTextEdit(signTileEntity);
            }
            */
            }
		}
    }
    
    @SubscribeEvent
    public void onRenderGui(GuiOpenEvent event) {
        if(event.gui instanceof GuiEditSign) {
        	if (Registry.NoGui == true) {event.setCanceled(true);}
        	}
    }
}
