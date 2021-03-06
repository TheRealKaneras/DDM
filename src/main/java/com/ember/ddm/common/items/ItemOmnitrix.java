package com.ember.ddm.common.items;

import com.ember.ddm.DDMMain;
import com.ember.ddm.client.models.item.RenderOmnitrix;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemOmnitrix extends Item {

    public ItemOmnitrix(String name) {
        this.setRegistryName(DDMMain.MODID, name);
        this.setUnlocalizedName(name);
        this.setTileEntityItemStackRenderer(new RenderOmnitrix());
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.MISC);
    }
}