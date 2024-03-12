package com.pvpman.snowdownessentails;

import com.mojang.logging.LogUtils;
import com.pvpman.snowdownessentails.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SnowdownEssentails.MOD_ID)
public class SnowdownEssentails
{
    public static final String MOD_ID = "snowdownessentails";
    public static final Logger LOGGER = LogUtils.getLogger();
    public SnowdownEssentails()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.LEATHER_HAT);
            event.accept(ModItems.LEATHER_CHEST_BELT);
            event.accept(ModItems.LEATHER_BELT);
            event.accept(ModItems.LEATHER_BOOTS);

            event.accept(ModItems.IRON_HAT);
            event.accept(ModItems.IRON_CHEST_BELT);
            event.accept(ModItems.IRON_BELT);
            event.accept(ModItems.IRON_BOOTS);

            event.accept(ModItems.GOLD_HAT);
            event.accept(ModItems.GOLD_CHEST_BELT);
            event.accept(ModItems.GOLD_BELT);
            event.accept(ModItems.GOLD_BOOTS);

            event.accept(ModItems.DIAMOND_HAT);
            event.accept(ModItems.DIAMOND_CHEST_BELT);
            event.accept(ModItems.DIAMOND_BELT);
            event.accept(ModItems.DIAMOND_BOOTS);

            event.accept(ModItems.NETHERITE_HAT);
            event.accept(ModItems.NETHERITE_CHEST_BELT);
            event.accept(ModItems.NETHERITE_BELT);
            event.accept(ModItems.NETHERITE_BOOTS);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}