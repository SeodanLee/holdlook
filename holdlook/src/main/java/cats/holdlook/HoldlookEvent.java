package cats.holdlook;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;


public class HoldlookEvent
{
    public static boolean rearCamHasChecked = false;
    public static boolean frontCamHasChecked = false;
  
@SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
    Minecraft mc = Minecraft.getMinecraft();
    
    if (HoldlookKeys.keyFrontcam.isKeyDown()) { // Hold Over-Shoulder
        frontCamHasChecked = false;
        mc.gameSettings.thirdPersonView = 2;
    } else if (!frontCamHasChecked) {
        frontCamHasChecked = true;
        mc.gameSettings.thirdPersonView = 0;
        }

    if (HoldlookKeys.keyRearcam.isKeyDown()) { // Hold Face
        rearCamHasChecked = false;
        mc.gameSettings.thirdPersonView = 1;
    } else if (!rearCamHasChecked) {
        rearCamHasChecked = true;
        mc.gameSettings.thirdPersonView = 0;
        } 
    }
}
