package com.ember.ddm.client.models.item;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.item.ItemStack;

public class RenderOmnitrix extends TileEntityItemStackRenderer {

    ModelOmnitrix model = new ModelOmnitrix();

    @Override
    public void renderByItem(ItemStack theStack, float partialTicks) {
        GlStateManager.pushMatrix();
        model.render(1);
        GlStateManager.popMatrix();
    }
}
