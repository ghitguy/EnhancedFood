package me.ghit.enhancedfood.init.bases.items;

import me.ghit.enhancedfood.EnhancedFood;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;

public class FoodItemEF extends Item {

    public FoodItemEF(String name, int hunger, float saturation) {
        super(new Properties()
            .group(ItemGroup.FOOD)
            .food(new Food.Builder()
                    .saturation(saturation)
                    .hunger(hunger)
                    .build()
            )
        );

        this.setRegistryName(new ResourceLocation(EnhancedFood.MOD_ID, name));
    }

    public FoodItemEF(String name, int hunger, float saturation, EffectInstance effect, float probability) {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .saturation(saturation)
                        .hunger(hunger)
                        .effect(effect, probability)
                        .build()
                )
        );

        this.setRegistryName(new ResourceLocation(EnhancedFood.MOD_ID, name));
    }
}
