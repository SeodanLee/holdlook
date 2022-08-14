package cats.holdlook;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;


public class HoldlookKeys // Uses LWJGL Keycodes 
{
	public static KeyBinding keyRearcam = new KeyBinding("Hold Over-sholuder View", 0, "Toggle Look"); // None
    public static KeyBinding keyFrontcam = new KeyBinding("Hold Face View", 56, "Toggle Look"); // L-Alt
      public static KeyBinding keyTest = new KeyBinding("Test", 208, "Test")

    public void init() {
        ClientRegistry.registerKeyBinding(keyRearcam); // Over-Shoulder
        ClientRegistry.registerKeyBinding(keyFrontcam); // Face
        ClientRegistry.registerKeyBinding(keyTest); // Test
        
  }
}