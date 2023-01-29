package cats.holdlook;

import net.legacyfabric.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//import net.minecraftforge.fml.common.gameevent.TickEvent;

public class HoldlookEvent implements ClientTickEvents.EndTick {
    public static boolean rearCamHasChecked = false;
    public static boolean frontCamHasChecked = false;

//    @SubscribeEvent
//    public void onClientTick(TickEvent.ClientTickEvent event) {
//        Minecraft mc = Minecraft.getMinecraft();
//
//        if (HoldlookKeys.keyFrontcam.isKeyDown()) { // Hold Over-Shoulder
//            frontCamHasChecked = false;
//            mc.gameSettings.thirdPersonView = 2; // 3rd person (front)
//        } else if (!frontCamHasChecked) {
//            frontCamHasChecked = true;
//            mc.gameSettings.thirdPersonView = 0; // 1st person
//        }
//
//        if (HoldlookKeys.keyRearcam.isKeyDown()) { // Hold Face
//            rearCamHasChecked = false;
//            mc.gameSettings.thirdPersonView = 1; // 3rd person (back)
//        } else if (!rearCamHasChecked) {
//            rearCamHasChecked = true;
//            mc.gameSettings.thirdPersonView = 0; // 1st person
//        }
//
//        if (HoldlookKeys.keyFrontToggle.isPressed()) { // Toggle Over-Shoulder
//            if (mc.gameSettings.thirdPersonView == 0 || mc.gameSettings.thirdPersonView == 1) { // Checks if 1st person if, or 3rd person (back)
//                mc.gameSettings.thirdPersonView = 2; // 3rd person (front)
//            } else {
//                mc.gameSettings.thirdPersonView = 0; // 1st person if 3rd person (front)
//            }
//        }
//
//        if (HoldlookKeys.keyRearToggle.isPressed()) { // Toggle Face
//            if (mc.gameSettings.thirdPersonView == 0 || mc.gameSettings.thirdPersonView == 2) {  // Checks if 1st person if, or 3rd person (front)
//                mc.gameSettings.thirdPersonView = 1; // 3rd person (back)
//            } else {
//                mc.gameSettings.thirdPersonView = 0; // 1st person if 3rd person (back)
//            }
//        }
//    }
    @Override
    public void onEndTick(MinecraftClient client) {
        if (HoldlookKeys.keyFrontcam.isPressed()) { // Hold Over-Shoulder
            frontCamHasChecked = false;
            client.options.perspective = 2;
        } else if (!frontCamHasChecked) {
            frontCamHasChecked = true;
            client.options.perspective = 0;
        }

        if (HoldlookKeys.keyRearcam.isPressed()) { // Hold Face
            rearCamHasChecked = false;
            client.options.perspective = 1;
        } else if (!rearCamHasChecked) {
            rearCamHasChecked = true;
            client.options.perspective = 0;
        }

        if (HoldlookKeys.keyFrontToggle.wasPressed()) { // Toggle Over-Shoulder
            if (client.options.perspective == 0 || client.options.perspective == 1) { // Checks if 1st person if, or 3rd person (back)
                client.options.perspective = 2; // 3rd person (front)
            } else {
                client.options.perspective = 0; // 1st person if 3rd person (front)
            }
        }

        if (HoldlookKeys.keyRearToggle.wasPressed()) { // Toggle Face
            if (client.options.perspective == 0 || client.options.perspective == 2) {  // Checks if 1st person if, or 3rd person (front)
                client.options.perspective = 1; // 3rd person (back)
            } else {
                client.options.perspective = 0; // 1st person if 3rd person (back)
            }
        }
    }
}
