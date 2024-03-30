package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;

public class FlyPlus extends Module {
    public FlyPlus() {
        super(Addon.CATEGORY, "Fly+", "Fly+ made for bypassing anticheats or gamemodes.");
    }
    public enum Bypass {
        Grim,
        Vulcan,
        Spartan,
        Intave,
        Verus,
        NoCheatPlus,
        UNCP,
        Matrix,
        AAC,
        Mineblaze,
        Cubecraft,
        BlocksMC,
        Mineplex,
        Kauri,
        PikaNetwork,
        Negativity,
        NegativityV2,
        HawkEye,
        GodsEye,
        Polar,
        Hypixel,
        Watchdog,
        WatchCat,
        Blzesteal,
        Wraith,
        Themis,
        AntiAura,
        LunarGG,
        PVPLand,
        Custom,
    }

     private final SettingGroup sgGeneral = settings.getDefaultGroup();

     private final Setting<Bypass> bypassSetting = sgGeneral.add(new EnumSetting.Builder<Bypass>()
        .name("Bypass")
        .description("Bypass mode.")
        .defaultValue(Bypass.None)
        .build()
   }
}
