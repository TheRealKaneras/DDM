package com.ember.ddm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = DDMMain.MODID, name = DDMMain.NAME, version = DDMMain.VERSION)
public class DDMMain
{
    public static final String MODID = "ddm";
    public static final String NAME = "Disturbed Dimensions Mod";
    public static final String VERSION = "pre-alpha 0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }
}
