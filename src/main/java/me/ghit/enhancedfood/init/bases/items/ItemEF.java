package me.ghit.enhancedfood.init.bases.items;

import me.ghit.enhancedfood.EnhancedFood;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class ItemEF extends Item {
    public ItemEF(String name) {
        super(new Properties().group(ItemGroup.TOOLS));
        this.setRegistryName(new ResourceLocation(EnhancedFood.MOD_ID, name));
    }
}
