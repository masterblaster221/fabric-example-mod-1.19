package endio.skills.from.life.util;

import endio.skills.from.life.entity.ModEntities;
import endio.skills.from.life.entity.Pets.Raccoon;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
        public static void registerModStuff() {
    registerAttributes();
}
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, Raccoon.setAttributes());
    }
}

