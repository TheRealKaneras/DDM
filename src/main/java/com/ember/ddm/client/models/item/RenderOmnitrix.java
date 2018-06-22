package com.ember.ddm.client.models.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class RenderOmnitrix extends TileEntityItemStackRenderer {

    ModelOmnitrix model = new ModelOmnitrix();
    EntityPlayer player = Minecraft.getMinecraft().player;

    @Override
    public void renderByItem(ItemStack theStack, float partialTicks) {
        GlStateManager.pushMatrix();
        model.render(player,0.045F);
        GlStateManager.popMatrix();
    }
}