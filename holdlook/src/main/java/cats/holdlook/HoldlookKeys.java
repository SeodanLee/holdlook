package cats.holdlook;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;


public class HoldlookKeys
{
	public static KeyBinding keyRearcam = new KeyBinding("Hold Over-sholuder View", 56, "Toggle Look");
    public static KeyBinding keyFrontcam = new KeyBinding("Hold Face View", 0, "Toggle Look");
    
    public void init() {
        ClientRegistry.registerKeyBinding(keyRearcam); // Over-Shoulder
        ClientRegistry.registerKeyBinding(keyFrontcam); // Face
        
  }
}