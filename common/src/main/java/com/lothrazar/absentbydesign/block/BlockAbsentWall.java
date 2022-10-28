package com.lothrazar.absentbydesign.block;

import com.lothrazar.absentbydesign.registry.AbsentRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BlockAbsentWall extends WallBlock implements IBlockAbsent {

    public SimpleParticleType part = null;
    public boolean doVisibility;

    public BlockAbsentWall(Properties p) {
        super(p);
        this.doVisibility = false;
    }

    @Override
    public void animateTick(@NotNull BlockState stateIn, @NotNull Level worldIn, @NotNull BlockPos pos, @NotNull RandomSource rand) {
        if (this.part != null && worldIn.random.nextDouble() < 0.2D)
            AbsentRegistry.spawnBlockParticles(this.part, worldIn, pos, rand);
    }

    @Override
    public boolean skipRendering(@NotNull BlockState state, @NotNull BlockState adjacentBlockState, @NotNull Direction side) {
        if (this.doVisibility)
            return (adjacentBlockState.getBlock() == this || adjacentBlockState.is(this));
        return super.skipRendering(state, adjacentBlockState, side);
    }

    @Override
    public void setTransparent() {
        this.doVisibility = true;
    }

}
