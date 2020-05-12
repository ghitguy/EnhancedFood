package me.ghit.enhancedfood.init.bases.items;

import me.ghit.enhancedfood.EnhancedFood;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import java.util.Random;

public class FoodItemEffectsEF extends Item {

    EffectInstance effect, effect2;
    int probability;
    public FoodItemEffectsEF(String name, int hunger, float saturation, EffectInstance effect, EffectInstance effect2, int probability) {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .saturation(saturation)
                        .hunger(hunger)
                        .build()
                )
        );

        this.setRegistryName(new ResourceLocation(EnhancedFood.MOD_ID, name));

        this.effect = effect;
        this.effect2 = effect2;
        this.probability = probability;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World world, LivingEntity entity) {
        if (!world.isRemote()) {
            entity.playSound(SoundEvents.ENTITY_GENERIC_EAT, 1.0F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.4F);
            world.playSound((PlayerEntity) null, entity.getPosX(), entity.getPosY(), entity.getPosZ(), SoundEvents.ENTITY_GENERIC_EAT, SoundCategory.NEUTRAL, 1.0F, 1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.4F);

            if (!(entity instanceof PlayerEntity) || !((PlayerEntity) entity).isCreative()) stack.shrink(1);

            if (entity instanceof PlayerEntity) {
                PlayerEntity player = ((PlayerEntity) entity);
                player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel() + getFood().getHealing());
                player.getFoodStats().setFoodSaturationLevel(player.getFoodStats().getSaturationLevel() + getFood().getSaturation());

                Random random = new Random();

                if (random.nextDouble() * 100 <= probability) {
                    System.out.println("NUMBER: " + random.nextDouble() * 100);
                    entity.addPotionEffect(new EffectInstance(effect.getPotion(), effect.getDuration()));
                    entity.addPotionEffect(new EffectInstance(effect2.getPotion(), effect2.getDuration()));
                }

                if (getContainerItem() != null && !player.inventory.addItemStackToInventory(new ItemStack(getContainerItem()))) {
                    world.addEntity(new ItemEntity(world, player.getPosX(), player.getPosY(), player.getPosX(), new ItemStack(getContainerItem())));
                }
            }
        }

        return stack;
    }
}
