package endio.skills.from.life;

import endio.skills.from.life.entity.ModEntities;
import endio.skills.from.life.entity.client.RaccoonRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SkillsFromLifeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);
    }
}