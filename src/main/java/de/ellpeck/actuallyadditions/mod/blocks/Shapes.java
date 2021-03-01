package de.ellpeck.actuallyadditions.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

import java.util.Optional;
import java.util.stream.Stream;

public class Shapes {
    static final VoxelShape CANOLA_PRESS_SHAPE = Stream.of(
        Block.makeCuboidShape(13, 0, 1, 15, 15.5, 3), Block.makeCuboidShape(2, 0, 2, 14, 6, 14),
        Block.makeCuboidShape(2, 10, 2, 14, 15, 14), Block.makeCuboidShape(3, 6, 3, 13, 10, 13),
        Block.makeCuboidShape(1, 0, 1, 3, 15.5, 3), Block.makeCuboidShape(1, 0, 13, 3, 15.5, 15),
        Block.makeCuboidShape(13, 0, 13, 15, 15.5, 15), Block.makeCuboidShape(0.9, 0, 0.9, 3.1, 0.5, 3.1),
        Block.makeCuboidShape(0.9, 0, 12.9, 3.1, 0.5, 15.1), Block.makeCuboidShape(0.9, 5, 12.9, 3.1, 6.5, 15.1),
        Block.makeCuboidShape(0.9, 5, 0.9, 3.1, 6.5, 3.1), Block.makeCuboidShape(12.9, 5, 12.9, 15.1, 6.5, 15.1),
        Block.makeCuboidShape(12.9, 5, 0.9, 15.1, 6.5, 3.1), Block.makeCuboidShape(0.9, 9.5, 12.9, 3.1, 11, 15.1),
        Block.makeCuboidShape(0.9, 9.5, 0.9, 3.1, 11, 3.1), Block.makeCuboidShape(12.9, 9.5, 12.9, 15.1, 11, 15.1),
        Block.makeCuboidShape(12.9, 9.5, 0.9, 15.1, 11, 3.1), Block.makeCuboidShape(12.9, 0, 0.9, 15.1, 0.5, 3.1),
        Block.makeCuboidShape(12.9, 0, 12.9, 15.1, 0.5, 15.1), Block.makeCuboidShape(12.9, 15.5, 0.9, 15.1, 16, 3.1),
        Block.makeCuboidShape(12.9, 15.5, 12.9, 15.1, 16, 15.1), Block.makeCuboidShape(0.9, 15.5, 0.9, 3.1, 16, 3.1),
        Block.makeCuboidShape(0.9, 15.5, 12.9, 3.1, 16, 15.1)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    public static final VoxelShape CRYSTAL_CLUSTER_SHAPE = Stream.of(
        Block.makeCuboidShape(5, 4, 5, 10, 19, 10), Block.makeCuboidShape(4, 0, 4, 11, 5, 11),
        Block.makeCuboidShape(3, 0, 3, 5, 4, 5), Block.makeCuboidShape(10, 0, 3, 12, 2, 5),
        Block.makeCuboidShape(12, 0, 4, 13, 1, 5), Block.makeCuboidShape(11, 0, 5, 12, 1, 6),
        Block.makeCuboidShape(10, 0, 10, 12, 3, 12), Block.makeCuboidShape(3, 0, 10, 5, 1, 12),
        Block.makeCuboidShape(9, 0, 3, 10, 3, 4), Block.makeCuboidShape(8, 0, 2, 11, 1, 4),
        Block.makeCuboidShape(4, 0, 2, 5, 2, 3), Block.makeCuboidShape(5, 0, 3, 7, 1, 4),
        Block.makeCuboidShape(2, 0, 4, 4, 1, 6), Block.makeCuboidShape(3, 0, 5, 4, 3, 6.5),
        Block.makeCuboidShape(3, 0, 9, 4, 2, 10), Block.makeCuboidShape(2, 0, 8, 4, 1, 10),
        Block.makeCuboidShape(5, 0, 11, 7, 2, 13), Block.makeCuboidShape(7, 0, 11, 11, 1, 13),
        Block.makeCuboidShape(10, 0, 9, 13, 1, 11), Block.makeCuboidShape(11, 0, 7, 12, 3, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    static final VoxelShape DISPLAY_STAND_SHAPE = Stream.of(
        Block.makeCuboidShape(1, 7, 0, 15, 8, 1), Block.makeCuboidShape(0, 0, 0, 16, 1, 16),
        Block.makeCuboidShape(1, 1, 1, 15, 7, 15), Block.makeCuboidShape(6, 7, 6, 10, 9, 10),
        Block.makeCuboidShape(0, 1, 0, 1, 7, 1), Block.makeCuboidShape(15, 1, 0, 16, 7, 1),
        Block.makeCuboidShape(15, 1, 15, 16, 7, 16), Block.makeCuboidShape(0, 1, 15, 1, 7, 16),
        Block.makeCuboidShape(0, 7, 0, 1, 8, 16), Block.makeCuboidShape(15, 7, 0, 16, 8, 16),
        Block.makeCuboidShape(1, 7, 15, 15, 8, 16), Block.makeCuboidShape(5, 7, 5, 6, 9, 6),
        Block.makeCuboidShape(5, 7, 10, 6, 9, 11), Block.makeCuboidShape(10, 7, 10, 11, 9, 11),
        Block.makeCuboidShape(10, 7, 5, 11, 9, 6)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    static final VoxelShape EMPOWERER_SHAPE = Stream.of(
        Block.makeCuboidShape(0, 0, 0, 16, 1, 16), Block.makeCuboidShape(1, 1, 1, 15, 6, 15),
        Block.makeCuboidShape(1, 6, 1, 15, 7, 15), Block.makeCuboidShape(0, 7, 0, 16, 8, 1),
        Block.makeCuboidShape(0, 7, 15, 16, 8, 16), Block.makeCuboidShape(0, 7, 1, 1, 8, 15),
        Block.makeCuboidShape(15, 7, 1, 16, 8, 15), Block.makeCuboidShape(4, 7, 4, 12, 9, 12),
        Block.makeCuboidShape(0, 1, 0, 1, 7, 1), Block.makeCuboidShape(15, 1, 0, 16, 7, 1),
        Block.makeCuboidShape(15, 1, 15, 16, 7, 16), Block.makeCuboidShape(0, 1, 15, 1, 7, 16),
        Block.makeCuboidShape(3, 7, 4, 4, 8, 5), Block.makeCuboidShape(3, 7, 11, 4, 8, 12),
        Block.makeCuboidShape(4, 7, 12, 5, 8, 13), Block.makeCuboidShape(11, 7, 12, 12, 8, 13),
        Block.makeCuboidShape(12, 7, 11, 13, 8, 12), Block.makeCuboidShape(12, 7, 4, 13, 8, 5),
        Block.makeCuboidShape(11, 7, 3, 12, 8, 4), Block.makeCuboidShape(4, 7, 3, 5, 8, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    static final VoxelShape ENERGIZER_SHAPE = Stream.of(
        Block.makeCuboidShape(0, 15, 0, 1, 16, 16), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
        Block.makeCuboidShape(1, 15, 0, 15, 16, 1), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
        Block.makeCuboidShape(1, 0, 15, 15, 1, 16), Block.makeCuboidShape(1, 0, 0, 15, 1, 1),
        Block.makeCuboidShape(15, 0, 0, 16, 1, 16), Block.makeCuboidShape(0, 0, 0, 1, 1, 16),
        Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
        Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
        Block.makeCuboidShape(1, 14, 1, 15, 15, 15), Block.makeCuboidShape(1, 1, 1, 15, 2, 15),
        Block.makeCuboidShape(14, 2, 1, 15, 14, 15), Block.makeCuboidShape(1, 2, 1, 2, 14, 15),
        Block.makeCuboidShape(2, 2, 14, 14, 14, 15), Block.makeCuboidShape(2, 2, 1, 14, 14, 2),
        Block.makeCuboidShape(9, 3, 0, 13, 4, 1), Block.makeCuboidShape(3, 3, 15, 7, 4, 16),
        Block.makeCuboidShape(9, 12, 0, 13, 13, 1), Block.makeCuboidShape(3, 12, 15, 7, 13, 16),
        Block.makeCuboidShape(10, 4, 0, 12, 12, 1), Block.makeCuboidShape(4, 4, 15, 6, 12, 16),
        Block.makeCuboidShape(0, 3, 3, 1, 4, 7), Block.makeCuboidShape(15, 3, 9, 16, 4, 13),
        Block.makeCuboidShape(0, 12, 3, 1, 13, 7), Block.makeCuboidShape(15, 12, 9, 16, 13, 13),
        Block.makeCuboidShape(0, 4, 4, 1, 12, 6), Block.makeCuboidShape(15, 4, 10, 16, 12, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

    static final VoxelShape BARREL_SHAPE = Stream.of(
        Block.makeCuboidShape(0, 12, 0, 16, 14, 1), Block.makeCuboidShape(1, 0.5, 1, 15, 15, 15),
        Block.makeCuboidShape(0, 2, 15, 16, 4, 16), Block.makeCuboidShape(0, 7, 15, 16, 9, 16),
        Block.makeCuboidShape(0, 12, 15, 16, 14, 16), Block.makeCuboidShape(0, 2, 0, 16, 4, 1),
        Block.makeCuboidShape(0, 7, 0, 16, 9, 1), Block.makeCuboidShape(0, 2, 1, 1, 4, 15),
        Block.makeCuboidShape(0, 7, 1, 1, 9, 15), Block.makeCuboidShape(0, 12, 1, 1, 14, 15),
        Block.makeCuboidShape(15, 12, 1, 16, 14, 15), Block.makeCuboidShape(15, 7, 1, 16, 9, 15),
        Block.makeCuboidShape(15, 2, 1, 16, 4, 15), Block.makeCuboidShape(7, 0, 0.5, 9, 16, 1.5),
        Block.makeCuboidShape(0.5, 0, 7, 1.5, 16, 9), Block.makeCuboidShape(7, 0, 14.5, 9, 16, 15.5),
        Block.makeCuboidShape(14.5, 0, 7, 15.5, 16, 9), Block.makeCuboidShape(2, 0, 0.5, 5, 16, 1.5),
        Block.makeCuboidShape(0.5, 0, 11, 1.5, 16, 14), Block.makeCuboidShape(2, 0, 14.5, 5, 16, 15.5),
        Block.makeCuboidShape(14.5, 0, 11, 15.5, 16, 14), Block.makeCuboidShape(11, 0, 0.5, 14, 16, 1.5),
        Block.makeCuboidShape(0.5, 0, 2, 1.5, 16, 5), Block.makeCuboidShape(11, 0, 14.5, 14, 16, 15.5),
        Block.makeCuboidShape(14.5, 0, 2, 15.5, 16, 5), Block.makeCuboidShape(4, 15, 7, 6, 15.3, 9),
        Block.makeCuboidShape(2, 15, 4, 3, 15.3, 12), Block.makeCuboidShape(4, 15, 13, 12, 15.3, 14),
        Block.makeCuboidShape(4, 15, 2, 12, 15.3, 3), Block.makeCuboidShape(13, 15, 4, 14, 15.3, 12),
        Block.makeCuboidShape(3, 15, 3, 4, 15.3, 4), Block.makeCuboidShape(3, 15, 12, 4, 15.3, 13),
        Block.makeCuboidShape(12, 15, 3, 13, 15.3, 4), Block.makeCuboidShape(12, 15, 12, 13, 15.3, 13)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();
    static final VoxelShape FIREWORKS_BOX_SHAPE = Stream.of(
        Block.makeCuboidShape(0, 0, 0, 1, 1, 16), Block.makeCuboidShape(1, 0, 15, 15, 1, 16),
        Block.makeCuboidShape(15, 0, 0, 16, 1, 16), Block.makeCuboidShape(1, 0, 0, 15, 1, 1),
        Block.makeCuboidShape(0, 15, 0, 1, 16, 16), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
        Block.makeCuboidShape(1, 15, 0, 15, 16, 1), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
        Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
        Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
        Block.makeCuboidShape(10, 14, 9, 12, 15, 10), Block.makeCuboidShape(7, 14, 9, 9, 15, 10),
        Block.makeCuboidShape(4, 14, 9, 6, 15, 10), Block.makeCuboidShape(10, 14, 6, 12, 15, 7),
        Block.makeCuboidShape(7, 14, 6, 9, 15, 7), Block.makeCuboidShape(4, 14, 6, 6, 15, 7),
        Block.makeCuboidShape(6, 14, 4, 7, 15, 12), Block.makeCuboidShape(9, 14, 4, 10, 15, 12),
        Block.makeCuboidShape(4, 14, 12, 12, 15, 14), Block.makeCuboidShape(4, 14, 2, 12, 15, 4),
        Block.makeCuboidShape(12, 14, 2, 14, 15, 14), Block.makeCuboidShape(2, 14, 2, 4, 15, 14),
        Block.makeCuboidShape(2, 13, 2, 14, 14, 14), Block.makeCuboidShape(2, 0, 2, 14, 1, 14),
        Block.makeCuboidShape(1, 0, 2, 2, 15, 14), Block.makeCuboidShape(14, 0, 2, 15, 15, 14),
        Block.makeCuboidShape(1, 0, 1, 15, 15, 2), Block.makeCuboidShape(1, 0, 14, 15, 15, 15)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();


    static final class CoalGeneratorShapes {
        static final VoxelShape NORTH = Stream.of(
            Block.makeCuboidShape(0, 15, 0, 1, 16, 16), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(1, 15, 0, 15, 16, 1), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(2, 0, 2, 14, 1, 14), Block.makeCuboidShape(5, 14, 6, 11, 15, 7),
            Block.makeCuboidShape(5, 14, 8, 11, 15, 9), Block.makeCuboidShape(5, 14, 10, 11, 15, 14),
            Block.makeCuboidShape(5, 14, 2, 11, 15, 5), Block.makeCuboidShape(11, 14, 2, 14, 15, 14),
            Block.makeCuboidShape(2, 14, 2, 5, 15, 14), Block.makeCuboidShape(1, 0, 2, 2, 15, 14),
            Block.makeCuboidShape(14, 0, 2, 15, 15, 14), Block.makeCuboidShape(1, 0, 14, 15, 15, 15),
            Block.makeCuboidShape(3, 11, 0, 13, 12, 1), Block.makeCuboidShape(5, 3, 1, 6, 8, 2),
            Block.makeCuboidShape(10, 3, 1, 11, 8, 2), Block.makeCuboidShape(3, 8, 1, 13, 15, 2),
            Block.makeCuboidShape(3, 0, 1, 13, 3, 2), Block.makeCuboidShape(1, 0, 1, 3, 15, 2),
            Block.makeCuboidShape(13, 0, 1, 15, 15, 2), Block.makeCuboidShape(5, 13, 5, 11, 14, 10),
            Block.makeCuboidShape(2, 3, 2, 14, 8, 3), Block.makeCuboidShape(0, 0, 15, 1, 1, 16),
            Block.makeCuboidShape(15, 0, 15, 16, 1, 16), Block.makeCuboidShape(15, 0, 0, 16, 1, 1),
            Block.makeCuboidShape(0, 0, 0, 1, 1, 1)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape EAST = Stream.of(
            Block.makeCuboidShape(0, 15, 0, 16, 16, 1), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(15, 15, 1, 16, 16, 15), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(2, 0, 2, 14, 1, 14), Block.makeCuboidShape(9, 14, 5, 10, 15, 11),
            Block.makeCuboidShape(7, 14, 5, 8, 15, 11), Block.makeCuboidShape(2, 14, 5, 6, 15, 11),
            Block.makeCuboidShape(11, 14, 5, 14, 15, 11), Block.makeCuboidShape(2, 14, 11, 14, 15, 14),
            Block.makeCuboidShape(2, 14, 2, 14, 15, 5), Block.makeCuboidShape(2, 0, 1, 14, 15, 2),
            Block.makeCuboidShape(2, 0, 14, 14, 15, 15), Block.makeCuboidShape(1, 0, 1, 2, 15, 15),
            Block.makeCuboidShape(15, 11, 3, 16, 12, 13), Block.makeCuboidShape(14, 3, 5, 15, 8, 6),
            Block.makeCuboidShape(14, 3, 10, 15, 8, 11), Block.makeCuboidShape(14, 8, 3, 15, 15, 13),
            Block.makeCuboidShape(14, 0, 3, 15, 3, 13), Block.makeCuboidShape(14, 0, 1, 15, 15, 3),
            Block.makeCuboidShape(14, 0, 13, 15, 15, 15), Block.makeCuboidShape(6, 13, 5, 11, 14, 11),
            Block.makeCuboidShape(13, 3, 2, 14, 8, 14), Block.makeCuboidShape(0, 0, 0, 1, 1, 1),
            Block.makeCuboidShape(0, 0, 15, 1, 1, 16), Block.makeCuboidShape(15, 0, 15, 16, 1, 16),
            Block.makeCuboidShape(15, 0, 0, 16, 1, 1)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape SOUTH = Stream.of(
            Block.makeCuboidShape(15, 15, 0, 16, 16, 16), Block.makeCuboidShape(0, 15, 0, 1, 16, 16),
            Block.makeCuboidShape(1, 15, 15, 15, 16, 16), Block.makeCuboidShape(1, 15, 0, 15, 16, 1),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(2, 0, 2, 14, 1, 14), Block.makeCuboidShape(5, 14, 9, 11, 15, 10),
            Block.makeCuboidShape(5, 14, 7, 11, 15, 8), Block.makeCuboidShape(5, 14, 2, 11, 15, 6),
            Block.makeCuboidShape(5, 14, 11, 11, 15, 14), Block.makeCuboidShape(2, 14, 2, 5, 15, 14),
            Block.makeCuboidShape(11, 14, 2, 14, 15, 14), Block.makeCuboidShape(14, 0, 2, 15, 15, 14),
            Block.makeCuboidShape(1, 0, 2, 2, 15, 14), Block.makeCuboidShape(1, 0, 1, 15, 15, 2),
            Block.makeCuboidShape(3, 11, 15, 13, 12, 16), Block.makeCuboidShape(10, 3, 14, 11, 8, 15),
            Block.makeCuboidShape(5, 3, 14, 6, 8, 15), Block.makeCuboidShape(3, 8, 14, 13, 15, 15),
            Block.makeCuboidShape(3, 0, 14, 13, 3, 15), Block.makeCuboidShape(13, 0, 14, 15, 15, 15),
            Block.makeCuboidShape(1, 0, 14, 3, 15, 15), Block.makeCuboidShape(5, 13, 6, 11, 14, 11),
            Block.makeCuboidShape(2, 3, 13, 14, 8, 14), Block.makeCuboidShape(15, 0, 0, 16, 1, 1),
            Block.makeCuboidShape(0, 0, 0, 1, 1, 1), Block.makeCuboidShape(0, 0, 15, 1, 1, 16),
            Block.makeCuboidShape(15, 0, 15, 16, 1, 16)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape WEST = Stream.of(
            Block.makeCuboidShape(0, 15, 15, 16, 16, 16), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(0, 15, 1, 1, 16, 15), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(2, 0, 2, 14, 1, 14), Block.makeCuboidShape(6, 14, 5, 7, 15, 11),
            Block.makeCuboidShape(8, 14, 5, 9, 15, 11), Block.makeCuboidShape(10, 14, 5, 14, 15, 11),
            Block.makeCuboidShape(2, 14, 5, 5, 15, 11), Block.makeCuboidShape(2, 14, 2, 14, 15, 5),
            Block.makeCuboidShape(2, 14, 11, 14, 15, 14), Block.makeCuboidShape(2, 0, 14, 14, 15, 15),
            Block.makeCuboidShape(2, 0, 1, 14, 15, 2), Block.makeCuboidShape(14, 0, 1, 15, 15, 15),
            Block.makeCuboidShape(0, 11, 3, 1, 12, 13), Block.makeCuboidShape(1, 3, 10, 2, 8, 11),
            Block.makeCuboidShape(1, 3, 5, 2, 8, 6), Block.makeCuboidShape(1, 8, 3, 2, 15, 13),
            Block.makeCuboidShape(1, 0, 3, 2, 3, 13), Block.makeCuboidShape(1, 0, 13, 2, 15, 15),
            Block.makeCuboidShape(1, 0, 1, 2, 15, 3), Block.makeCuboidShape(5, 13, 5, 10, 14, 11),
            Block.makeCuboidShape(2, 3, 2, 3, 8, 14), Block.makeCuboidShape(15, 0, 15, 16, 1, 16),
            Block.makeCuboidShape(15, 0, 0, 16, 1, 1), Block.makeCuboidShape(0, 0, 0, 1, 1, 1),
            Block.makeCuboidShape(0, 0, 15, 1, 1, 16)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    }

    static class CoffeeMachineShapes {
        static final VoxelShape NORTH = Stream.of(
            Block.makeCuboidShape(8, 11, 7, 13, 14, 8), Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(7, 1, 8, 14, 9, 14), Block.makeCuboidShape(6, 9, 3, 15, 11, 15),
            Block.makeCuboidShape(8, 11, 8, 13, 13, 13), Block.makeCuboidShape(10, 8, 3.5, 11, 9, 4.5),
            Block.makeCuboidShape(9, 1, 2, 12, 2, 5), Block.makeCuboidShape(9, 2, 5, 12, 7, 6),
            Block.makeCuboidShape(9, 2, 1, 12, 7, 2), Block.makeCuboidShape(12, 2, 2, 13, 7, 5),
            Block.makeCuboidShape(8, 2, 2, 9, 7, 5), Block.makeCuboidShape(13, 2, 3, 14, 3, 4),
            Block.makeCuboidShape(13, 5, 3, 14, 6, 4), Block.makeCuboidShape(14, 3, 3, 15, 5, 4),
            Block.makeCuboidShape(13, 10.2, 4.2, 14, 11.2, 5.2), Block.makeCuboidShape(11, 10.2, 4.2, 12, 11.2, 5.2),
            Block.makeCuboidShape(13, 11, 7, 14, 14, 14), Block.makeCuboidShape(7, 11, 7, 8, 14, 14),
            Block.makeCuboidShape(8, 11, 13, 13, 14, 14), Block.makeCuboidShape(14, 1, 14, 15, 9, 15),
            Block.makeCuboidShape(6, 1, 14, 7, 9, 15), Block.makeCuboidShape(14, 1, 7, 15, 9, 8),
            Block.makeCuboidShape(6, 1, 7, 7, 9, 8), Block.makeCuboidShape(6.8, 1.9, 11.9, 7, 3.1, 13.1),
            Block.makeCuboidShape(6.8, 1.9, 9.9, 7, 3.1, 11.1), Block.makeCuboidShape(3, 3, 10, 4, 5, 11),
            Block.makeCuboidShape(2.9, 4.8, 9.9, 4.1, 5, 11.1), Block.makeCuboidShape(2.9, 4.8, 11.9, 4.1, 5, 13.1),
            Block.makeCuboidShape(3, 2, 12, 7, 3, 13), Block.makeCuboidShape(3, 2, 10, 7, 3, 11),
            Block.makeCuboidShape(3, 3, 12, 4, 5, 13), Block.makeCuboidShape(2, 5, 9, 5, 11, 14),
            Block.makeCuboidShape(2, 11, 11, 4, 12, 13), Block.makeCuboidShape(1, 1, 11, 2, 12, 13)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape EAST = Stream.of(
            Block.makeCuboidShape(8, 11, 8, 9, 14, 13), Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(2, 1, 7, 8, 9, 14), Block.makeCuboidShape(1, 9, 6, 13, 11, 15),
            Block.makeCuboidShape(3, 11, 8, 8, 13, 13), Block.makeCuboidShape(11.5, 8, 10, 12.5, 9, 11),
            Block.makeCuboidShape(11, 1, 9, 14, 2, 12), Block.makeCuboidShape(10, 2, 9, 11, 7, 12),
            Block.makeCuboidShape(14, 2, 9, 15, 7, 12), Block.makeCuboidShape(11, 2, 12, 14, 7, 13),
            Block.makeCuboidShape(11, 2, 8, 14, 7, 9), Block.makeCuboidShape(12, 2, 13, 13, 3, 14),
            Block.makeCuboidShape(12, 5, 13, 13, 6, 14), Block.makeCuboidShape(12, 3, 14, 13, 5, 15),
            Block.makeCuboidShape(10.8, 10.2, 13, 11.8, 11.2, 14), Block.makeCuboidShape(10.8, 10.2, 11, 11.8, 11.2, 12),
            Block.makeCuboidShape(2, 11, 13, 9, 14, 14), Block.makeCuboidShape(2, 11, 7, 9, 14, 8),
            Block.makeCuboidShape(2, 11, 8, 3, 14, 13), Block.makeCuboidShape(1, 1, 14, 2, 9, 15),
            Block.makeCuboidShape(1, 1, 6, 2, 9, 7), Block.makeCuboidShape(8, 1, 14, 9, 9, 15),
            Block.makeCuboidShape(8, 1, 6, 9, 9, 7), Block.makeCuboidShape(2.9000000000000004, 1.9, 6.8, 4.1, 3.1, 7),
            Block.makeCuboidShape(4.9, 1.9, 6.8, 6.1, 3.1, 7), Block.makeCuboidShape(5, 3, 3, 6, 5, 4),
            Block.makeCuboidShape(4.9, 4.8, 2.9000000000000004, 6.1, 5, 4.1), Block.makeCuboidShape(2.9000000000000004, 4.8, 2.9000000000000004, 4.1, 5, 4.1),
            Block.makeCuboidShape(3, 2, 3, 4, 3, 7), Block.makeCuboidShape(5, 2, 3, 6, 3, 7),
            Block.makeCuboidShape(3, 3, 3, 4, 5, 4), Block.makeCuboidShape(2, 5, 2, 7, 11, 5),
            Block.makeCuboidShape(3, 11, 2, 5, 12, 4), Block.makeCuboidShape(3, 1, 1, 5, 12, 2)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape SOUTH = Stream.of(
            Block.makeCuboidShape(3, 11, 8, 8, 14, 9), Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(2, 1, 2, 9, 9, 8), Block.makeCuboidShape(1, 9, 1, 10, 11, 13),
            Block.makeCuboidShape(3, 11, 3, 8, 13, 8), Block.makeCuboidShape(5, 8, 11.5, 6, 9, 12.5),
            Block.makeCuboidShape(4, 1, 11, 7, 2, 14), Block.makeCuboidShape(4, 2, 10, 7, 7, 11),
            Block.makeCuboidShape(4, 2, 14, 7, 7, 15), Block.makeCuboidShape(3, 2, 11, 4, 7, 14),
            Block.makeCuboidShape(7, 2, 11, 8, 7, 14), Block.makeCuboidShape(2, 2, 12, 3, 3, 13),
            Block.makeCuboidShape(2, 5, 12, 3, 6, 13), Block.makeCuboidShape(1, 3, 12, 2, 5, 13),
            Block.makeCuboidShape(2, 10.2, 10.8, 3, 11.2, 11.8), Block.makeCuboidShape(4, 10.2, 10.8, 5, 11.2, 11.8),
            Block.makeCuboidShape(2, 11, 2, 3, 14, 9), Block.makeCuboidShape(8, 11, 2, 9, 14, 9),
            Block.makeCuboidShape(3, 11, 2, 8, 14, 3), Block.makeCuboidShape(1, 1, 1, 2, 9, 2),
            Block.makeCuboidShape(9, 1, 1, 10, 9, 2), Block.makeCuboidShape(1, 1, 8, 2, 9, 9),
            Block.makeCuboidShape(9, 1, 8, 10, 9, 9), Block.makeCuboidShape(9, 1.9, 2.9000000000000004, 9.2, 3.1, 4.1),
            Block.makeCuboidShape(9, 1.9, 4.9, 9.2, 3.1, 6.1), Block.makeCuboidShape(12, 3, 5, 13, 5, 6),
            Block.makeCuboidShape(11.9, 4.8, 4.9, 13.1, 5, 6.1), Block.makeCuboidShape(11.9, 4.8, 2.9000000000000004, 13.1, 5, 4.1),
            Block.makeCuboidShape(9, 2, 3, 13, 3, 4), Block.makeCuboidShape(9, 2, 5, 13, 3, 6),
            Block.makeCuboidShape(12, 3, 3, 13, 5, 4), Block.makeCuboidShape(11, 5, 2, 14, 11, 7),
            Block.makeCuboidShape(12, 11, 3, 14, 12, 5), Block.makeCuboidShape(14, 1, 3, 15, 12, 5)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape WEST = Stream.of(
            Block.makeCuboidShape(7, 11, 3, 8, 14, 8), Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(8, 1, 2, 14, 9, 9), Block.makeCuboidShape(3, 9, 1, 15, 11, 10),
            Block.makeCuboidShape(8, 11, 3, 13, 13, 8), Block.makeCuboidShape(3.5, 8, 5, 4.5, 9, 6),
            Block.makeCuboidShape(2, 1, 4, 5, 2, 7), Block.makeCuboidShape(5, 2, 4, 6, 7, 7),
            Block.makeCuboidShape(1, 2, 4, 2, 7, 7), Block.makeCuboidShape(2, 2, 3, 5, 7, 4),
            Block.makeCuboidShape(2, 2, 7, 5, 7, 8), Block.makeCuboidShape(3, 2, 2, 4, 3, 3),
            Block.makeCuboidShape(3, 5, 2, 4, 6, 3), Block.makeCuboidShape(3, 3, 1, 4, 5, 2),
            Block.makeCuboidShape(4.199999999999999, 10.2, 2, 5.199999999999999, 11.2, 3), Block.makeCuboidShape(4.199999999999999, 10.2, 4, 5.199999999999999, 11.2, 5),
            Block.makeCuboidShape(7, 11, 2, 14, 14, 3), Block.makeCuboidShape(7, 11, 8, 14, 14, 9),
            Block.makeCuboidShape(13, 11, 3, 14, 14, 8), Block.makeCuboidShape(14, 1, 1, 15, 9, 2),
            Block.makeCuboidShape(14, 1, 9, 15, 9, 10), Block.makeCuboidShape(7, 1, 1, 8, 9, 2),
            Block.makeCuboidShape(7, 1, 9, 8, 9, 10), Block.makeCuboidShape(11.9, 1.9, 9, 13.1, 3.1, 9.2),
            Block.makeCuboidShape(9.9, 1.9, 9, 11.1, 3.1, 9.2), Block.makeCuboidShape(10, 3, 12, 11, 5, 13),
            Block.makeCuboidShape(9.9, 4.8, 11.9, 11.1, 5, 13.1), Block.makeCuboidShape(11.9, 4.8, 11.9, 13.1, 5, 13.1),
            Block.makeCuboidShape(12, 2, 9, 13, 3, 13), Block.makeCuboidShape(10, 2, 9, 11, 3, 13),
            Block.makeCuboidShape(12, 3, 12, 13, 5, 13), Block.makeCuboidShape(9, 5, 11, 14, 11, 14),
            Block.makeCuboidShape(11, 11, 12, 13, 12, 14), Block.makeCuboidShape(11, 1, 14, 13, 12, 15)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    }

    static class DirectionalBlockBreakerShapes {
        static final VoxelShape SHAPE_U = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 1), Block.makeCuboidShape(0, 0, 15, 16, 1, 16),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(0, 0, 1, 1, 1, 15), Block.makeCuboidShape(15, 0, 1, 16, 1, 15),
            Block.makeCuboidShape(15, 15, 1, 16, 16, 15), Block.makeCuboidShape(15, 3, 9, 16, 13, 13),
            Block.makeCuboidShape(15, 3, 3, 16, 13, 7), Block.makeCuboidShape(0, 3, 9, 1, 13, 13),
            Block.makeCuboidShape(0, 3, 3, 1, 13, 7), Block.makeCuboidShape(5, 15, 5, 11, 16, 11),
            Block.makeCuboidShape(3, 15, 6, 5, 16, 10), Block.makeCuboidShape(11, 15, 6, 13, 16, 10)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape SHAPE_D = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 0, 0, 16, 1, 1),
            Block.makeCuboidShape(0, 0, 15, 16, 1, 16), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(0, 15, 15, 16, 16, 16), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(0, 0, 1, 1, 1, 15),
            Block.makeCuboidShape(0, 15, 1, 1, 16, 15), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 15), Block.makeCuboidShape(15, 3, 3, 16, 13, 7),
            Block.makeCuboidShape(15, 3, 9, 16, 13, 13), Block.makeCuboidShape(0, 3, 3, 1, 13, 7),
            Block.makeCuboidShape(0, 3, 9, 1, 13, 13), Block.makeCuboidShape(5, 0, 5, 11, 1, 11),
            Block.makeCuboidShape(3, 0, 6, 5, 1, 10), Block.makeCuboidShape(11, 0, 6, 13, 1, 10)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 1), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(0, 0, 15, 16, 1, 16), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(0, 0, 1, 1, 1, 15), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 15), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(15, 9, 3, 16, 13, 13),
            Block.makeCuboidShape(15, 3, 3, 16, 7, 13), Block.makeCuboidShape(0, 9, 3, 1, 13, 13),
            Block.makeCuboidShape(0, 3, 3, 1, 7, 13), Block.makeCuboidShape(5, 5, 0, 11, 11, 1),
            Block.makeCuboidShape(3, 6, 0, 5, 10, 1), Block.makeCuboidShape(11, 6, 0, 13, 10, 1)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


        static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(15, 0, 0, 16, 1, 16), Block.makeCuboidShape(0, 15, 0, 1, 16, 16),
            Block.makeCuboidShape(0, 0, 0, 1, 1, 16), Block.makeCuboidShape(1, 15, 0, 15, 16, 1),
            Block.makeCuboidShape(1, 0, 0, 15, 1, 1), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
            Block.makeCuboidShape(1, 0, 15, 15, 1, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(3, 9, 15, 13, 13, 16),
            Block.makeCuboidShape(3, 3, 15, 13, 7, 16), Block.makeCuboidShape(3, 9, 0, 13, 13, 1),
            Block.makeCuboidShape(3, 3, 0, 13, 7, 1), Block.makeCuboidShape(15, 5, 5, 16, 11, 11),
            Block.makeCuboidShape(15, 6, 3, 16, 10, 5), Block.makeCuboidShape(15, 6, 11, 16, 10, 13)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(0, 0, 15, 16, 1, 16), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 1), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 15), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(0, 0, 1, 1, 1, 15), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(0, 9, 3, 1, 13, 13),
            Block.makeCuboidShape(0, 3, 3, 1, 7, 13), Block.makeCuboidShape(15, 9, 3, 16, 13, 13),
            Block.makeCuboidShape(15, 3, 3, 16, 7, 13), Block.makeCuboidShape(5, 5, 15, 11, 11, 16),
            Block.makeCuboidShape(11, 6, 15, 13, 10, 16), Block.makeCuboidShape(3, 6, 15, 5, 10, 16)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

        static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 15, 0, 1, 16, 16),
            Block.makeCuboidShape(0, 0, 0, 1, 1, 16), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(15, 0, 0, 16, 1, 16), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
            Block.makeCuboidShape(1, 0, 15, 15, 1, 16), Block.makeCuboidShape(1, 15, 0, 15, 16, 1),
            Block.makeCuboidShape(1, 0, 0, 15, 1, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(3, 9, 0, 13, 13, 1),
            Block.makeCuboidShape(3, 3, 0, 13, 7, 1), Block.makeCuboidShape(3, 9, 15, 13, 13, 16),
            Block.makeCuboidShape(3, 3, 15, 13, 7, 16), Block.makeCuboidShape(0, 5, 5, 1, 11, 11),
            Block.makeCuboidShape(0, 6, 11, 1, 10, 13), Block.makeCuboidShape(0, 6, 3, 1, 10, 5)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
    }

    static class FarmerShapes {
        static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(11, 14, 4, 12, 15, 5), Block.makeCuboidShape(0, 0, 0, 1, 1, 16),
            Block.makeCuboidShape(1, 0, 15, 15, 1, 16), Block.makeCuboidShape(15, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(1, 0, 0, 15, 1, 1), Block.makeCuboidShape(0, 15, 0, 1, 16, 16),
            Block.makeCuboidShape(15, 15, 0, 16, 16, 16), Block.makeCuboidShape(1, 15, 0, 15, 16, 1),
            Block.makeCuboidShape(1, 15, 15, 15, 16, 16), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(4, 11, 4, 12, 12, 12),
            Block.makeCuboidShape(4, 14, 4, 5, 15, 5), Block.makeCuboidShape(3, 12, 5, 4, 14, 11),
            Block.makeCuboidShape(12, 12, 5, 13, 14, 11), Block.makeCuboidShape(5, 12, 3, 11, 14, 4),
            Block.makeCuboidShape(5, 12, 12, 11, 14, 13), Block.makeCuboidShape(11, 12, 11, 12, 14, 12),
            Block.makeCuboidShape(11, 12, 4, 12, 14, 5), Block.makeCuboidShape(4, 12, 4, 5, 14, 5),
            Block.makeCuboidShape(4, 12, 11, 5, 14, 12), Block.makeCuboidShape(4, 14, 11, 5, 15, 12),
            Block.makeCuboidShape(11, 14, 11, 12, 15, 12), Block.makeCuboidShape(2, 14, 2, 4, 15, 14),
            Block.makeCuboidShape(4, 14, 2, 12, 15, 4), Block.makeCuboidShape(4, 14, 12, 12, 15, 14),
            Block.makeCuboidShape(12, 14, 2, 14, 15, 14), Block.makeCuboidShape(2, 0, 2, 14, 1, 14),
            Block.makeCuboidShape(1, 0, 2, 2, 15, 14), Block.makeCuboidShape(14, 0, 2, 15, 15, 14),
            Block.makeCuboidShape(1, 0, 1, 5, 15, 2), Block.makeCuboidShape(5, 5, 2, 11, 11, 3),
            Block.makeCuboidShape(5, 0, 1, 11, 5, 2), Block.makeCuboidShape(5, 11, 1, 11, 15, 2),
            Block.makeCuboidShape(11, 0, 1, 15, 15, 2), Block.makeCuboidShape(1, 0, 14, 15, 15, 15)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(11, 14, 11, 12, 15, 12), Block.makeCuboidShape(0, 0, 0, 16, 1, 1),
            Block.makeCuboidShape(0, 0, 1, 1, 1, 15), Block.makeCuboidShape(0, 0, 15, 16, 1, 16),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 15), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(0, 15, 15, 16, 16, 16), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(0, 15, 1, 1, 16, 15), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(4, 11, 4, 12, 12, 12),
            Block.makeCuboidShape(11, 14, 4, 12, 15, 5), Block.makeCuboidShape(5, 12, 3, 11, 14, 4),
            Block.makeCuboidShape(5, 12, 12, 11, 14, 13), Block.makeCuboidShape(12, 12, 5, 13, 14, 11),
            Block.makeCuboidShape(3, 12, 5, 4, 14, 11), Block.makeCuboidShape(4, 12, 11, 5, 14, 12),
            Block.makeCuboidShape(11, 12, 11, 12, 14, 12), Block.makeCuboidShape(11, 12, 4, 12, 14, 5),
            Block.makeCuboidShape(4, 12, 4, 5, 14, 5), Block.makeCuboidShape(4, 14, 4, 5, 15, 5),
            Block.makeCuboidShape(4, 14, 11, 5, 15, 12), Block.makeCuboidShape(2, 14, 2, 14, 15, 4),
            Block.makeCuboidShape(12, 14, 4, 14, 15, 12), Block.makeCuboidShape(2, 14, 4, 4, 15, 12),
            Block.makeCuboidShape(2, 14, 12, 14, 15, 14), Block.makeCuboidShape(2, 0, 2, 14, 1, 14),
            Block.makeCuboidShape(2, 0, 1, 14, 15, 2), Block.makeCuboidShape(2, 0, 14, 14, 15, 15),
            Block.makeCuboidShape(14, 0, 1, 15, 15, 5), Block.makeCuboidShape(13, 5, 5, 14, 11, 11),
            Block.makeCuboidShape(14, 0, 5, 15, 5, 11), Block.makeCuboidShape(14, 11, 5, 15, 15, 11),
            Block.makeCuboidShape(14, 0, 11, 15, 15, 15), Block.makeCuboidShape(1, 0, 1, 2, 15, 15)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(4, 14, 11, 5, 15, 12), Block.makeCuboidShape(15, 0, 0, 16, 1, 16),
            Block.makeCuboidShape(1, 0, 0, 15, 1, 1), Block.makeCuboidShape(0, 0, 0, 1, 1, 16),
            Block.makeCuboidShape(1, 0, 15, 15, 1, 16), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(0, 15, 0, 1, 16, 16), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
            Block.makeCuboidShape(1, 15, 0, 15, 16, 1), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(4, 11, 4, 12, 12, 12),
            Block.makeCuboidShape(11, 14, 11, 12, 15, 12), Block.makeCuboidShape(12, 12, 5, 13, 14, 11),
            Block.makeCuboidShape(3, 12, 5, 4, 14, 11), Block.makeCuboidShape(5, 12, 12, 11, 14, 13),
            Block.makeCuboidShape(5, 12, 3, 11, 14, 4), Block.makeCuboidShape(4, 12, 4, 5, 14, 5),
            Block.makeCuboidShape(4, 12, 11, 5, 14, 12), Block.makeCuboidShape(11, 12, 11, 12, 14, 12),
            Block.makeCuboidShape(11, 12, 4, 12, 14, 5), Block.makeCuboidShape(11, 14, 4, 12, 15, 5),
            Block.makeCuboidShape(4, 14, 4, 5, 15, 5), Block.makeCuboidShape(12, 14, 2, 14, 15, 14),
            Block.makeCuboidShape(4, 14, 12, 12, 15, 14), Block.makeCuboidShape(4, 14, 2, 12, 15, 4),
            Block.makeCuboidShape(2, 14, 2, 4, 15, 14), Block.makeCuboidShape(2, 0, 2, 14, 1, 14),
            Block.makeCuboidShape(14, 0, 2, 15, 15, 14), Block.makeCuboidShape(1, 0, 2, 2, 15, 14),
            Block.makeCuboidShape(11, 0, 14, 15, 15, 15), Block.makeCuboidShape(5, 5, 13, 11, 11, 14),
            Block.makeCuboidShape(5, 0, 14, 11, 5, 15), Block.makeCuboidShape(5, 11, 14, 11, 15, 15),
            Block.makeCuboidShape(1, 0, 14, 5, 15, 15), Block.makeCuboidShape(1, 0, 1, 15, 15, 2)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(4, 14, 4, 5, 15, 5), Block.makeCuboidShape(0, 0, 15, 16, 1, 16),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 15), Block.makeCuboidShape(0, 0, 0, 16, 1, 1),
            Block.makeCuboidShape(0, 0, 1, 1, 1, 15), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 1), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(15, 15, 1, 16, 16, 15), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(4, 11, 4, 12, 12, 12),
            Block.makeCuboidShape(4, 14, 11, 5, 15, 12), Block.makeCuboidShape(5, 12, 12, 11, 14, 13),
            Block.makeCuboidShape(5, 12, 3, 11, 14, 4), Block.makeCuboidShape(3, 12, 5, 4, 14, 11),
            Block.makeCuboidShape(12, 12, 5, 13, 14, 11), Block.makeCuboidShape(11, 12, 4, 12, 14, 5),
            Block.makeCuboidShape(4, 12, 4, 5, 14, 5), Block.makeCuboidShape(4, 12, 11, 5, 14, 12),
            Block.makeCuboidShape(11, 12, 11, 12, 14, 12), Block.makeCuboidShape(11, 14, 11, 12, 15, 12),
            Block.makeCuboidShape(11, 14, 4, 12, 15, 5), Block.makeCuboidShape(2, 14, 12, 14, 15, 14),
            Block.makeCuboidShape(2, 14, 4, 4, 15, 12), Block.makeCuboidShape(12, 14, 4, 14, 15, 12),
            Block.makeCuboidShape(2, 14, 2, 14, 15, 4), Block.makeCuboidShape(2, 0, 2, 14, 1, 14),
            Block.makeCuboidShape(2, 0, 14, 14, 15, 15), Block.makeCuboidShape(2, 0, 1, 14, 15, 2),
            Block.makeCuboidShape(1, 0, 11, 2, 15, 15), Block.makeCuboidShape(2, 5, 5, 3, 11, 11),
            Block.makeCuboidShape(1, 0, 5, 2, 5, 11), Block.makeCuboidShape(1, 11, 5, 2, 15, 11),
            Block.makeCuboidShape(1, 0, 1, 2, 15, 5), Block.makeCuboidShape(14, 0, 1, 15, 15, 15)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();
    }

    static class FluidCollectorShapes {
        static final VoxelShape SHAPE_U = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(0, 15, 0, 16, 16, 1), Block.makeCuboidShape(0, 0, 15, 16, 1, 16),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(0, 0, 1, 1, 1, 15), Block.makeCuboidShape(15, 0, 1, 16, 1, 15),
            Block.makeCuboidShape(15, 15, 1, 16, 16, 15), Block.makeCuboidShape(15, 3, 6, 16, 13, 10),
            Block.makeCuboidShape(0, 3, 6, 1, 13, 10), Block.makeCuboidShape(5, 15, 5, 11, 16, 11),
            Block.makeCuboidShape(3, 15, 6, 5, 16, 10), Block.makeCuboidShape(11, 15, 6, 13, 16, 10),
            Block.makeCuboidShape(6, 15, 11, 10, 16, 13), Block.makeCuboidShape(6, 15, 3, 10, 16, 5)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_D = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 0, 0, 16, 1, 1),
            Block.makeCuboidShape(0, 0, 15, 16, 1, 16), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(0, 15, 15, 16, 16, 16), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(0, 0, 1, 1, 1, 15),
            Block.makeCuboidShape(0, 15, 1, 1, 16, 15), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 15), Block.makeCuboidShape(15, 3, 6, 16, 13, 10),
            Block.makeCuboidShape(0, 3, 6, 1, 13, 10), Block.makeCuboidShape(5, 0, 5, 11, 1, 11),
            Block.makeCuboidShape(3, 0, 6, 5, 1, 10), Block.makeCuboidShape(11, 0, 6, 13, 1, 10),
            Block.makeCuboidShape(6, 0, 3, 10, 1, 5), Block.makeCuboidShape(6, 0, 11, 10, 1, 13)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 1), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(0, 0, 15, 16, 1, 16), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(0, 0, 1, 1, 1, 15), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 15), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(15, 6, 3, 16, 10, 13),
            Block.makeCuboidShape(0, 6, 3, 1, 10, 13), Block.makeCuboidShape(5, 5, 0, 11, 11, 1),
            Block.makeCuboidShape(3, 6, 0, 5, 10, 1), Block.makeCuboidShape(11, 6, 0, 13, 10, 1),
            Block.makeCuboidShape(6, 11, 0, 10, 13, 1), Block.makeCuboidShape(6, 3, 0, 10, 5, 1)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();


        static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(15, 0, 0, 16, 1, 16), Block.makeCuboidShape(0, 15, 0, 1, 16, 16),
            Block.makeCuboidShape(0, 0, 0, 1, 1, 16), Block.makeCuboidShape(1, 15, 0, 15, 16, 1),
            Block.makeCuboidShape(1, 0, 0, 15, 1, 1), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
            Block.makeCuboidShape(1, 0, 15, 15, 1, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(3, 6, 15, 13, 10, 16),
            Block.makeCuboidShape(3, 6, 0, 13, 10, 1), Block.makeCuboidShape(15, 5, 5, 16, 11, 11),
            Block.makeCuboidShape(15, 6, 3, 16, 10, 5), Block.makeCuboidShape(15, 6, 11, 16, 10, 13),
            Block.makeCuboidShape(15, 11, 6, 16, 13, 10), Block.makeCuboidShape(15, 3, 6, 16, 5, 10)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(0, 0, 15, 16, 1, 16), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 1), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(15, 0, 1, 16, 1, 15), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(0, 0, 1, 1, 1, 15), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(0, 6, 3, 1, 10, 13),
            Block.makeCuboidShape(15, 6, 3, 16, 10, 13), Block.makeCuboidShape(5, 5, 15, 11, 11, 16),
            Block.makeCuboidShape(11, 6, 15, 13, 10, 16), Block.makeCuboidShape(3, 6, 15, 5, 10, 16),
            Block.makeCuboidShape(6, 11, 15, 10, 13, 16), Block.makeCuboidShape(6, 3, 15, 10, 5, 16)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(1, 1, 1, 15, 15, 15), Block.makeCuboidShape(0, 15, 0, 1, 16, 16),
            Block.makeCuboidShape(0, 0, 0, 1, 1, 16), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(15, 0, 0, 16, 1, 16), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
            Block.makeCuboidShape(1, 0, 15, 15, 1, 16), Block.makeCuboidShape(1, 15, 0, 15, 16, 1),
            Block.makeCuboidShape(1, 0, 0, 15, 1, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(3, 6, 0, 13, 10, 1),
            Block.makeCuboidShape(3, 6, 15, 13, 10, 16), Block.makeCuboidShape(0, 5, 5, 1, 11, 11),
            Block.makeCuboidShape(0, 6, 11, 1, 10, 13), Block.makeCuboidShape(0, 6, 3, 1, 10, 5),
            Block.makeCuboidShape(0, 11, 6, 1, 13, 10), Block.makeCuboidShape(0, 3, 6, 1, 5, 10)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();
    }

    static class FurnaceDoubleShapes {
        static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(15, 15, 0, 16, 16, 16), Block.makeCuboidShape(0, 15, 0, 1, 16, 16),
            Block.makeCuboidShape(1, 15, 0, 15, 16, 1), Block.makeCuboidShape(1, 15, 15, 15, 16, 16),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16), Block.makeCuboidShape(5, 14, 6, 11, 15, 7),
            Block.makeCuboidShape(5, 14, 8, 11, 15, 9), Block.makeCuboidShape(5, 14, 10, 11, 15, 14),
            Block.makeCuboidShape(5, 14, 2, 11, 15, 5), Block.makeCuboidShape(11, 14, 2, 14, 15, 14),
            Block.makeCuboidShape(2, 14, 2, 5, 15, 14), Block.makeCuboidShape(1, 1, 2, 2, 15, 14),
            Block.makeCuboidShape(14, 1, 2, 15, 15, 14), Block.makeCuboidShape(1, 1, 14, 15, 15, 15),
            Block.makeCuboidShape(7, 3, 1, 9, 7, 2), Block.makeCuboidShape(3, 7, 1, 13, 15, 2),
            Block.makeCuboidShape(3, 1, 1, 13, 3, 2), Block.makeCuboidShape(1, 1, 1, 3, 15, 2),
            Block.makeCuboidShape(13, 1, 1, 15, 15, 2), Block.makeCuboidShape(5, 13, 5, 11, 14, 10),
            Block.makeCuboidShape(2, 3, 2, 14, 8, 3)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(0, 15, 15, 16, 16, 16), Block.makeCuboidShape(0, 15, 0, 16, 16, 1),
            Block.makeCuboidShape(15, 15, 1, 16, 16, 15), Block.makeCuboidShape(0, 15, 1, 1, 16, 15),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16), Block.makeCuboidShape(9, 14, 5, 10, 15, 11),
            Block.makeCuboidShape(7, 14, 5, 8, 15, 11), Block.makeCuboidShape(2, 14, 5, 6, 15, 11),
            Block.makeCuboidShape(11, 14, 5, 14, 15, 11), Block.makeCuboidShape(2, 14, 11, 14, 15, 14),
            Block.makeCuboidShape(2, 14, 2, 14, 15, 5), Block.makeCuboidShape(2, 1, 1, 14, 15, 2),
            Block.makeCuboidShape(2, 1, 14, 14, 15, 15), Block.makeCuboidShape(1, 1, 1, 2, 15, 15),
            Block.makeCuboidShape(14, 3, 7, 15, 7, 9), Block.makeCuboidShape(14, 7, 3, 15, 15, 13),
            Block.makeCuboidShape(14, 1, 3, 15, 3, 13), Block.makeCuboidShape(14, 1, 1, 15, 15, 3),
            Block.makeCuboidShape(14, 1, 13, 15, 15, 15), Block.makeCuboidShape(6, 13, 5, 11, 14, 11),
            Block.makeCuboidShape(13, 3, 2, 14, 8, 14)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_S = Stream.of(
            Block.makeCuboidShape(0, 15, 0, 1, 16, 16), Block.makeCuboidShape(15, 15, 0, 16, 16, 16),
            Block.makeCuboidShape(1, 15, 15, 15, 16, 16), Block.makeCuboidShape(1, 15, 0, 15, 16, 1),
            Block.makeCuboidShape(15, 1, 0, 16, 15, 1), Block.makeCuboidShape(0, 1, 0, 1, 15, 1),
            Block.makeCuboidShape(0, 1, 15, 1, 15, 16), Block.makeCuboidShape(15, 1, 15, 16, 15, 16),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16), Block.makeCuboidShape(5, 14, 9, 11, 15, 10),
            Block.makeCuboidShape(5, 14, 7, 11, 15, 8), Block.makeCuboidShape(5, 14, 2, 11, 15, 6),
            Block.makeCuboidShape(5, 14, 11, 11, 15, 14), Block.makeCuboidShape(2, 14, 2, 5, 15, 14),
            Block.makeCuboidShape(11, 14, 2, 14, 15, 14), Block.makeCuboidShape(14, 1, 2, 15, 15, 14),
            Block.makeCuboidShape(1, 1, 2, 2, 15, 14), Block.makeCuboidShape(1, 1, 1, 15, 15, 2),
            Block.makeCuboidShape(7, 3, 14, 9, 7, 15), Block.makeCuboidShape(3, 7, 14, 13, 15, 15),
            Block.makeCuboidShape(3, 1, 14, 13, 3, 15), Block.makeCuboidShape(13, 1, 14, 15, 15, 15),
            Block.makeCuboidShape(1, 1, 14, 3, 15, 15), Block.makeCuboidShape(5, 13, 6, 11, 14, 11),
            Block.makeCuboidShape(2, 3, 13, 14, 8, 14)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();

        static final VoxelShape SHAPE_W = Stream.of(
            Block.makeCuboidShape(0, 15, 0, 16, 16, 1), Block.makeCuboidShape(0, 15, 15, 16, 16, 16),
            Block.makeCuboidShape(0, 15, 1, 1, 16, 15), Block.makeCuboidShape(15, 15, 1, 16, 16, 15),
            Block.makeCuboidShape(15, 1, 15, 16, 15, 16), Block.makeCuboidShape(15, 1, 0, 16, 15, 1),
            Block.makeCuboidShape(0, 1, 0, 1, 15, 1), Block.makeCuboidShape(0, 1, 15, 1, 15, 16),
            Block.makeCuboidShape(0, 0, 0, 16, 1, 16), Block.makeCuboidShape(6, 14, 5, 7, 15, 11),
            Block.makeCuboidShape(8, 14, 5, 9, 15, 11), Block.makeCuboidShape(10, 14, 5, 14, 15, 11),
            Block.makeCuboidShape(2, 14, 5, 5, 15, 11), Block.makeCuboidShape(2, 14, 2, 14, 15, 5),
            Block.makeCuboidShape(2, 14, 11, 14, 15, 14), Block.makeCuboidShape(2, 1, 14, 14, 15, 15),
            Block.makeCuboidShape(2, 1, 1, 14, 15, 2), Block.makeCuboidShape(14, 1, 1, 15, 15, 15),
            Block.makeCuboidShape(1, 3, 7, 2, 7, 9), Block.makeCuboidShape(1, 7, 3, 2, 15, 13),
            Block.makeCuboidShape(1, 1, 3, 2, 3, 13), Block.makeCuboidShape(1, 1, 13, 2, 15, 15),
            Block.makeCuboidShape(1, 1, 1, 2, 15, 3), Block.makeCuboidShape(5, 13, 5, 10, 14, 11),
            Block.makeCuboidShape(2, 3, 2, 3, 8, 14)
        ).reduce((v1, v2) -> {
            return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
        }).get();
    }

    public static final VoxelShape FEEDER_SHAPE = ShapeBuilder.get()
        .add(0, 15, 0, 1, 16, 16).add(15, 15, 0, 16, 16, 16)
        .add(1, 15, 0, 15, 16, 1).add(1, 15, 15, 15, 16, 16).add(1, 0, 15, 15, 1, 16)
        .add(1, 0, 0, 15, 1, 1).add(15, 0, 0, 16, 1, 16).add(0, 0, 0, 1, 1, 16)
        .add(0, 1, 15, 1, 15, 16).add(15, 1, 15, 16, 15, 16).add(15, 1, 0, 16, 15, 1)
        .add(0, 1, 0, 1, 15, 1).add(11, 14, 11, 12, 15, 12).add(11, 14, 4, 12, 15, 5)
        .add(4, 14, 11, 5, 15, 12).add(4, 14, 4, 5, 15, 5).add(4, 13, 4, 12, 14, 12)
        .add(4, 14, 12, 12, 15, 15).add(4, 14, 1, 12, 15, 4).add(1, 14, 1, 4, 15, 15)
        .add(12, 14, 1, 15, 15, 15).add(1, 1, 1, 15, 2, 15).add(14, 2, 1, 15, 14, 15)
        .add(1, 2, 1, 2, 14, 15).add(2, 2, 14, 14, 14, 15).add(2, 2, 1, 14, 14, 2)
        .standardReduceBuild().get();

    public static class ShapeBuilder {
        Stream.Builder<VoxelShape> shapes = Stream.builder();

        public ShapeBuilder add(double x1, double y1, double z1, double x2, double y2, double z2) {
            this.shapes.add(Block.makeCuboidShape(x1, y1, z1, x2, y2, z2));
            return this;
        }

        public Stream<VoxelShape> build() {
            return this.shapes.build();
        }

        public Optional<VoxelShape> standardReduceBuild() {
            return this.shapes.build().reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR));
        }

        public static ShapeBuilder get() {
            return new ShapeBuilder();
        }
    }

}
