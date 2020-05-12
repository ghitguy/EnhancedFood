package me.ghit.enhancedfood.init.bases.items;

import me.ghit.enhancedfood.EnhancedFood;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;

public class ToolItemEF extends SwordItem {
    public ToolItemEF(String name, int attackDamage, int attackSpeed) {
        super(
                ItemTier.IRON,
                attackDamage - 3 /* For some reason, MC likes adding 3 */,
                attackSpeed - 4 /* MC likes adding 4 here */,
                new Item.Properties()
                    .maxStackSize(1)
                    .group(ItemGroup.TOOLS)
        );
        this.setRegistryName(new ResourceLocation(EnhancedFood.MOD_ID, name));
    }
}
