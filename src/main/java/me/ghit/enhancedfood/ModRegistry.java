package me.ghit.enhancedfood;

import me.ghit.enhancedfood.init.BlockListEF;
import me.ghit.enhancedfood.init.ItemListEF;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(EnhancedFood.MOD_ID)
@Mod.EventBusSubscriber(modid = EnhancedFood.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {

    @SubscribeEvent
    public static void onBlockRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(BlockListEF.SALT_ORE);
    }

    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> event) {
        // Tools
        event.getRegistry().register(ItemListEF.KNIFE);

        // Foods
        event.getRegistry().register(ItemListEF.SALT);

        // ItemBlocks
        event.getRegistry().register(ItemListEF.SALT_ORE);
    }

}
