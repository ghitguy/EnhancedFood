package me.ghit.enhancedfood.init;

import me.ghit.enhancedfood.init.bases.blocks.BlockItemEF;
import me.ghit.enhancedfood.init.bases.items.FoodItemEffectsEF;
import me.ghit.enhancedfood.init.bases.items.ToolItemEF;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;

public class ItemListEF {
    public static Item KNIFE = new ToolItemEF("knife", 3, 5);

    public static Item SALT = new FoodItemEffectsEF("salt", 1, 0, new EffectInstance(Effect.get(9), 200), new EffectInstance(Effect.get(17), 200), 40);

    public static BlockItem SALT_ORE = new BlockItemEF(BlockListEF.SALT_ORE);
}
