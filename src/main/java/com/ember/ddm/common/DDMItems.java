package com.ember.ddm.common;

import com.ember.ddm.DDMMain;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

public class DDMItems {

    public static List<Item> ITEMS = new ArrayList<>();

    public static void init() {



    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        init();

        event.getRegistry().registerAll(ITEMS.toArray(new Item[ITEMS.size()]));

        if(DDMMain.side.isClient()) {
            for(int i = 0; i < ITEMS.size(); i++) {
                Item item = ITEMS.get(i);
                ModelResourceLocation location = new ModelResourceLocation(DDMMain.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory");
                ModelLoader.setCustomModelResourceLocation(item, 0, location);
            }
        }
    }

    public static Item addItem(Item item) {
        ITEMS.add(item);
        return item;
    }

}
