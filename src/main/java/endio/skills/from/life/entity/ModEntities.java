package endio.skills.from.life.entity;

import endio.skills.from.life.SkillsFromLife;
import endio.skills.from.life.entity.Pets.Raccoon;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<Raccoon> RACCOON = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(SkillsFromLife.MOD_ID, "raccoon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, Raccoon::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());
}