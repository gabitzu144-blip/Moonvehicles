
package com.carhud.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CarHUDMod.MOD_ID)
public class CarHUDMod {

    public static final String MOD_ID = "carhud";

    public CarHUDMod() {
        IEventBus modEventBus =
            FMLJavaModLoadingContext.get().getModEventBus();

        System.out.println("CarHUD Mod loaded!");
    }
}
