package me.ghit.enhancedfood.init.bases.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class BlockItemEF extends BlockItem {
    public BlockItemEF(Block blockIn) {
        super(blockIn, new Properties().group(ItemGroup.BUILDING_BLOCKS));
        setRegistryName(blockIn.getRegistryName());
    }
}
