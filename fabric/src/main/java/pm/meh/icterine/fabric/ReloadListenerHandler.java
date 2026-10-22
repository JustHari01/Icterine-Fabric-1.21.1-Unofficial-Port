package pm.meh.icterine.fabric;

import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.resources.ResourceLocation;
import pm.meh.icterine.impl.ReloadListenerHandlerBase;

public class ReloadListenerHandler extends ReloadListenerHandlerBase implements IdentifiableResourceReloadListener {
    @Override
    public ResourceLocation getFabricId() {
        return ResourceLocation.fromNamespaceAndPath("icterine", "advancement_thresholds");
    }
}
