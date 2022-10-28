package com.lothrazar.absentbydesign.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class TrapDoorAbsent extends TrapDoorBlock implements IBlockAbsent {

    public boolean doVisibility;

    public TrapDoorAbsent(Properties properties) {
        super(properties);
        this.doVisibility = false;
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
