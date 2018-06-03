package com.ember.ddm.common.items;

import com.ember.ddm.DDMMain;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SonicScrewdriver extends Item {

    public SonicScrewdriver(String name) {
        this.setRegistryName(DDMMain.MODID, name);
        this.setUnlocalizedName(name);

        this.setFull3D();

    }


    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {

        if(worldIn.getBlockState(pos).getBlock() == Blocks.REDSTONE_WIRE) {
            worldIn.setBlockState(pos, Blocks.REDSTONE_WIRE.getDefaultState().withProperty(BlockRedstoneWire.POWER, 15));
        }
        return EnumActionResult.PASS;
    }

}
