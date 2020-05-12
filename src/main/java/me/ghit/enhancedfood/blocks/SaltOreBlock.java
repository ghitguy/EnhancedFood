package me.ghit.enhancedfood.blocks;

import me.ghit.enhancedfood.EnhancedFood;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

public class SaltOreBlock extends Block {

    public SaltOreBlock(String name) {
        super(Properties.create(Material.ROCK).hardnessAndResistance(1.5F).sound(SoundType.STONE));
        this.setRegistryName(new ResourceLocation(EnhancedFood.MOD_ID, name));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        int i = 0;
        i = MathHelper.nextInt(RANDOM, 0, 2);
        return i;
    }

    @Override
    public ResourceLocation getLootTable() {
        return super.getLootTable();
    }
}
