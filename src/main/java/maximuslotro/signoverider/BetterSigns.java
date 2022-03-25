package maximuslotro.signoverider;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.GuiScreenEvent.ActionPerformedEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import maximuslotro.signoverider.commands.BaseCommand;
import maximuslotro.signoverider.commands.Settings;

import javax.annotation.Nullable;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;


@Mod(modid = "signoverider", name = "Sign Overider Mod", acceptedMinecraftVersions = "1.7.10")
public class BetterSigns
{
    //public static final Block block_sign = (Block)Block.blockRegistry.getObject("standing_sign");
    //public static final Block wall_sign = (Block)Block.blockRegistry.getObject("wall_sign");
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
/*
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void interact(PlayerInteractEvent e) {
		if (e.action == Action.RIGHT_CLICK_BLOCK) { 
			if (e.world.getBlock(e.x, e.y, e.z) == wall_sign|| e.world.getBlock(e.x, e.y, e.z) == block_sign) {
            final TileEntitySign sign = (TileEntitySign) e.world.getTileEntity(e.x, e.y, e.z);
            ChatUtil.chatError(e.entityPlayer, "Sign Clicked!");
            }
		}
    }
*/
	@SubscribeEvent
    public void onRenderGui(GuiOpenEvent event) {
        if(event.gui instanceof GuiEditSign) {
        	if (Registry.NoGui == true) {event.setCanceled(true);}
        }
    }

}
