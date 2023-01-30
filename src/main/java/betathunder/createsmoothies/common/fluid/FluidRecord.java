package betathunder.createsmoothies.common.fluid;

import net.minecraft.block.FlowingFluidBlock;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;

/*
 Stores relevant information about a fluid
*/
public class FluidRecord {
    public final String name;
    public final RegistryObject<ForgeFlowingFluid> still;
    public final RegistryObject<ForgeFlowingFluid> flowing;
    public final RegistryObject<FlowingFluidBlock> block;

    public FluidRecord(String name, RegistryObject<ForgeFlowingFluid> still, RegistryObject<ForgeFlowingFluid> flowing, RegistryObject<FlowingFluidBlock> block) {
        this.name = name;
        this.still = still;
        this.flowing = flowing;
        this.block = block;
    }
}

