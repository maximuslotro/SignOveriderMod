package maximuslotro.signstory;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.item.ItemSign;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

@Mod(modid = BetterSigns.MOD_ID, version = "1", name = "Sign Story Mod", acceptedMinecraftVersions = "1.7.10")
public class BetterSigns
{
    public static final String MOD_ID = "signstory";
    public static final Block wall_sign = (Block)Block.blockRegistry.getObject("wall_sign");
    private static final Logger LOGGER = LogManager.getLogger();

    public BetterSigns() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onRightClicked(PlayerInteractEvent event) {
        if(event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK && event.world.getBlock(event.x, event.y, event.z) == wall_sign) {
            final TileEntitySign sign = (TileEntitySign) event.world.getTileEntity(event.x, event.y, event.z);
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
