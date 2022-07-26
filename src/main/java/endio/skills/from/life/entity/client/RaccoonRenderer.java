package endio.skills.from.life.entity.client;

import endio.skills.from.life.SkillsFromLife;
import endio.skills.from.life.entity.Pets.Raccoon;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RaccoonRenderer extends GeoEntityRenderer<Raccoon> {
    public RaccoonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RaccoonModel());
    }

    @Override
    public Identifier getTextureResource(Raccoon instance) {
        return new Identifier(SkillsFromLife.MOD_ID, "textures/entities/raccoon.png");
    }
    }
