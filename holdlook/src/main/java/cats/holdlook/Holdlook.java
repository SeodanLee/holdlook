package cats.holdlook;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.MOD_VERSION, name = Reference.MOD_NAME)
public class Holdlook {

	public static HoldlookKeys HoldlookKeys = new HoldlookKeys();
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        HoldlookKeys.init();
        MinecraftForge.EVENT_BUS.register(new HoldlookEvent());
    }

}
