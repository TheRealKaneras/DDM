package com.ember.ddm;

import com.ember.ddm.common.DDMItems;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;


import net.minecraftforge.fml.common.Mod.EventHandler;


import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;


import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.Logger;

@Mod(modid = DDMMain.MODID, name = DDMMain.NAME, version = DDMMain.VERSION)
public class DDMMain {

    public static final String MODID = "ddm";
    public static final String NAME = "Disturbed Dimensions Mod";
    public static final String VERSION = "prealpha 0.1";

    @SidedProxy(clientSide = "com.ember.ddm.ClientProxy", serverSide = "com.ember.ddm.CommonProxy")
    public static CommonProxy proxy;

    public static Side side =  FMLCommonHandler.instance().getSide();

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
} 