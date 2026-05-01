package com.doctorsid.bosses.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.CreativeModeTabBuildContentsEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = "doctorsidbosses", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "doctorsidbosses");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "doctorsidbosses");

    public static final RegistryObject<Block> CABIN_DOOR = BLOCKS.register("cabin_door", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        // This method can be used to perform actions upon block registration
    }

    @SubscribeEvent
    public static void addCreativeItems(CreativeModeTabBuildContentsEvent event) {
        if (event.getTab() == ItemGroup.BUILDING_BLOCKS) {
            event.getEntries().put(CABIN_DOOR.get(), new BlockItem(CABIN_DOOR.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        }
    }
}