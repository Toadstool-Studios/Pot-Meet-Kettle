package earth.terrarium.potmeetkettle.common.blockentity;

import earth.terrarium.botarium.common.fluid.utils.FluidHooks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class WokBlockEntity extends VesselBlockEntity {
    public WokBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    @Override protected boolean canBeHeated() {
        return true;
    }

    @Override protected int getInventorySize() {
        return 3;
    }

    @Override protected long getFluidCapacity() {
        return FluidHooks.getBucketAmount();
    }
}
