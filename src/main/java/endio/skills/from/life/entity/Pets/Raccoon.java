package endio.skills.from.life.entity.Pets;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;


public class Raccoon extends AnimalEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public Raccoon(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }


    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }


    public void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new TemptGoal(this, 1.1, Ingredient.ofItems(new ItemConvertible[]{Items.GOLD_NUGGET}), false));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(3, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(4, new LookAroundGoal(this));
    }
    public static DefaultAttributeContainer.Builder setAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.20000000298023224);
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.raccoon.walk", true));
        return PlayState.CONTINUE;
        }
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.raccoon.idle", true));
        return PlayState.CONTINUE;
    }
    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller", 0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
        protected SoundEvent getAmbientSound() {
            return SoundEvents.ENTITY_DOLPHIN_AMBIENT;
        }

        protected SoundEvent getHurtSound(DamageSource source) {
            return SoundEvents.ENTITY_DOLPHIN_HURT;
        }

        protected SoundEvent getDeathSound() {
            return SoundEvents.ENTITY_PIG_DEATH;
        }

        protected void playStepSound(BlockPos pos, BlockState state) {
            this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15F, 1.0F);
    }
}
