/*
 * This file ("BlockBatteryBox.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.blocks;

import de.ellpeck.actuallyadditions.mod.blocks.base.BlockContainerBase;
import de.ellpeck.actuallyadditions.mod.items.ItemBattery;
import de.ellpeck.actuallyadditions.mod.tile.TileEntityBatteryBox;
import de.ellpeck.actuallyadditions.mod.util.StackUtil;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlockBatteryBox extends BlockContainerBase {

    public BlockBatteryBox() {
        super(Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 10.0f).sound(SoundType.STONE));
    }

    //    @Override
    //    public AxisAlignedBB getBoundingBox(BlockState state, IBlockAccess source, BlockPos pos) {
    //        return BlockSlabs.AABB_BOTTOM_HALF;
    //    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new TileEntityBatteryBox();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        TileEntity tile = world.getTileEntity(pos);
        if (tile instanceof TileEntityBatteryBox) {
            TileEntityBatteryBox box = (TileEntityBatteryBox) tile;
            ItemStack stack = player.getHeldItem(hand);

            if (StackUtil.isValid(stack)) {
                if (stack.getItem() instanceof ItemBattery && !StackUtil.isValid(box.inv.getStackInSlot(0))) {
                    box.inv.setStackInSlot(0, stack.copy());
                    player.setHeldItem(hand, StackUtil.getEmpty());
                    return ActionResultType.SUCCESS;
                }
            } else {
                ItemStack inSlot = box.inv.getStackInSlot(0);
                if (StackUtil.isValid(inSlot)) {
                    player.setHeldItem(hand, inSlot.copy());
                    box.inv.setStackInSlot(0, StackUtil.getEmpty());
                    return ActionResultType.SUCCESS;
                }
            }
        }
        return ActionResultType.PASS;
    }
}
