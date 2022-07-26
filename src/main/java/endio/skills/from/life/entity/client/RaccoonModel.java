package endio.skills.from.life.entity.client;

import endio.skills.from.life.SkillsFromLife;
import endio.skills.from.life.entity.Pets.Raccoon;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class RaccoonModel extends AnimatedGeoModel<Raccoon> {
    @Override
    public Identifier getModelResource(Raccoon object) {
        return new Identifier(SkillsFromLife.MOD_ID, "geo/entities/raccoon.geo.json");
    }

    @Override
    public Identifier getTextureResource(Raccoon object) {
        return new Identifier(SkillsFromLife.MOD_ID, "textures/entities/raccoon.png");
    }

    @Override
    public Identifier getAnimationResource(Raccoon animatable) {
        return new Identifier(SkillsFromLife.MOD_ID, "animations/entities/raccoon.animation.json");
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(Raccoon entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
