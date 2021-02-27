/*
 * This file ("TileEntityFluidCollector.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2017 Ellpeck
 */

package de.ellpeck.actuallyadditions.mod.tile;

import de.ellpeck.actuallyadditions.mod.util.Util;
import de.ellpeck.actuallyadditions.mod.util.WorldUtil;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.Fluids;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;

import javax.annotation.Nonnull;

public class TileEntityFluidCollector extends TileEntityBase implements ISharingFluidHandler {

    public boolean isPlacer;
    public final FluidTank tank = new FluidTank(8 * Util.BUCKET) {
        @Override
        public int fill(FluidStack resource, FluidAction action) {
            if (!TileEntityFluidCollector.this.isPlacer) {
                return 0;
            }
            return super.fill(resource, action);
        }

        @Nonnull
        @Override
        public FluidStack drain(int maxDrain, FluidAction action) {
            if (!TileEntityFluidCollector.this.isPlacer) {
                return FluidStack.EMPTY;
            }
            return super.drain(maxDrain, action);
        }

        @Nonnull
        @Override
        public FluidStack drain(FluidStack resource, FluidAction action) {
            if (!TileEntityFluidCollector.this.isPlacer) {
                return FluidStack.EMPTY;
            }
            return super.drain(resource, action);
        }
    };
    public final LazyOptional<IFluidHandler> lazyTank = LazyOptional.of(() -> this.tank);
    private int lastTankAmount;
    private int currentTime;
    private int lastCompare;

    public TileEntityFluidCollector(TileEntityType<?> type) {
        super(type);
    }

    public TileEntityFluidCollector() {
        this(ActuallyTiles.FLUIDCOLLECTOR_TILE.get());
        this.isPlacer = false;
    }

    @Override
    public boolean isRedstoneToggle() {
        return true;
    }

    @Override
    public void activateOnPulse() {
        this.doWork();
    }

    // TODO: [port] big old check on this entire functionality, I've not worked with fluids before
    private void doWork() {
        BlockState state = this.world.getBlockState(this.pos);
        Direction sideToManipulate = WorldUtil.getDirectionByPistonRotation(state);
        BlockPos coordsBlock = this.pos.offset(sideToManipulate);

        BlockState stateToBreak = this.world.getBlockState(coordsBlock);
        Block blockToBreak = stateToBreak.getBlock();
        if (!this.isPlacer && Util.BUCKET <= this.tank.getCapacity() - this.tank.getFluidAmount()) {
            if (blockToBreak instanceof IFluidBlock && ((IFluidBlock) blockToBreak).getFluid() != null) {
                if (this.tank.fill(new FluidStack(((IFluidBlock) blockToBreak).getFluid(), Util.BUCKET), IFluidHandler.FluidAction.SIMULATE) >= Util.BUCKET) {
                    this.tank.fill(new FluidStack(((IFluidBlock) blockToBreak).getFluid(), Util.BUCKET), IFluidHandler.FluidAction.EXECUTE);
                    this.world.setBlockState(coordsBlock, Blocks.AIR.getDefaultState());
                }
            } else if (blockToBreak == Blocks.LAVA) {
                if (this.tank.fill(new FluidStack(Fluids.LAVA, Util.BUCKET), IFluidHandler.FluidAction.SIMULATE) >= Util.BUCKET) {
                    this.tank.fill(new FluidStack(Fluids.LAVA, Util.BUCKET), IFluidHandler.FluidAction.EXECUTE);
                    this.world.setBlockState(coordsBlock, Blocks.AIR.getDefaultState());
                }
            } else if (blockToBreak == Blocks.WATER) {
                if (this.tank.fill(new FluidStack(Fluids.WATER, Util.BUCKET), IFluidHandler.FluidAction.SIMULATE) >= Util.BUCKET) {
                    this.tank.fill(new FluidStack(Fluids.WATER, Util.BUCKET), IFluidHandler.FluidAction.EXECUTE);
                    this.world.setBlockState(coordsBlock, Blocks.AIR.getDefaultState());
                }
            }
        } else if (this.isPlacer && blockToBreak.getDefaultState().getMaterial().isReplaceable()) {
            if (this.tank.getFluidAmount() >= Util.BUCKET) {
                FluidStack stack = this.tank.getFluid();
                Block fluid = stack.getFluid().getDefaultState().getBlockState().getBlock();
                if (fluid != null) {
                    BlockPos offsetPos = this.pos.offset(sideToManipulate);
                    boolean placeable = !(blockToBreak instanceof IFluidBlock) && blockToBreak.getDefaultState().getMaterial().isReplaceable();
                    if (placeable) {
                        this.tank.drain(Util.BUCKET, IFluidHandler.FluidAction.EXECUTE);
                        // TODO: [port] validate this check is still valid.
                        if (this.world.getDimensionType().isUltrawarm() && fluid.getDefaultState().getMaterial() == Material.WATER) {
                            this.world.playSound(null, offsetPos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (this.world.rand.nextFloat() - this.world.rand.nextFloat()) * 0.8F);

                            if (this.world instanceof ServerWorld) {
                                for (int l = 0; l < 8; ++l) {
                                    ((ServerWorld) this.world).spawnParticle(ParticleTypes.SMOKE, offsetPos.getX() + Math.random(), offsetPos.getY() + Math.random(), offsetPos.getZ() + Math.random(), 1, 0.0D, 0.0D, 0.0D, 0);
                                }
                            }
                        } else {
                            this.world.setBlockState(offsetPos, fluid.getDefaultState(), 3);
                        }
                    }
                }
            }
        }
    }

    @Override
    public int getComparatorStrength() {
        float calc = (float) this.tank.getFluidAmount() / (float) this.tank.getCapacity() * 15F;
        return (int) calc;
    }

    @Override
    public LazyOptional<IFluidHandler> getFluidHandler(Direction facing) {
        return this.lazyTank;
    }

    @Override
    public void writeSyncableNBT(CompoundNBT compound, NBTType type) {
        super.writeSyncableNBT(compound, type);
        if (type != NBTType.SAVE_BLOCK) {
            compound.putInt("CurrentTime", this.currentTime);
        }
        this.tank.writeToNBT(compound);
    }

    @Override
    public void readSyncableNBT(CompoundNBT compound, NBTType type) {
        super.readSyncableNBT(compound, type);
        if (type != NBTType.SAVE_BLOCK) {
            this.currentTime = compound.getInt("CurrentTime");
        }
        this.tank.readFromNBT(compound);
    }

    @Override
    public void updateEntity() {
        super.updateEntity();
        if (!this.world.isRemote) {
            if (!this.isRedstonePowered && !this.isPulseMode) {
                if (this.currentTime > 0) {
                    this.currentTime--;
                    if (this.currentTime <= 0) {
                        this.doWork();
                    }
                } else {
                    this.currentTime = 15;
                }
            }

            if (this.lastCompare != this.getComparatorStrength()) {
                this.lastCompare = this.getComparatorStrength();

                this.markDirty();
            }

            if (this.lastTankAmount != this.tank.getFluidAmount() && this.sendUpdateWithInterval()) {
                this.lastTankAmount = this.tank.getFluidAmount();
            }
        }
    }

    @Override
    public int getMaxFluidAmountToSplitShare() {
        return this.tank.getFluidAmount();
    }

    @Override
    public boolean doesShareFluid() {
        return !this.isPlacer;
    }

    @Override
    public Direction[] getFluidShareSides() {
        return Direction.values();
    }
}
