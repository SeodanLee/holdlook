package cats.holdlook;

import net.fabricmc.api.ClientModInitializer;
import net.legacyfabric.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class HoldlookClient implements ClientModInitializer {
    public static HoldlookKeys HoldlookKeys = new HoldlookKeys();

    @Override
    public void onInitializeClient() {
        HoldlookKeys.init();
        ClientTickEvents.END_CLIENT_TICK.register(new HoldlookEvent());
    }
}
