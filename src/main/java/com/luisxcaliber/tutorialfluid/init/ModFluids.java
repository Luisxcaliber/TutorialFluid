package com.luisxcaliber.tutorialfluid.init;

import com.luisxcaliber.tutorialfluid.fluids.FluidBase;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids 
{
	public static final Fluid APPLE_JUICE_FLUID = new FluidBase("apple_juice_fluid", new ResourceLocation("tf:blocks/apple_juice_still"), new ResourceLocation("tf:blocks/apple_juice_flow"));
	public static final Fluid GRAPE_JUICE_FLUID = new FluidBase("grape_juice_fluid", new ResourceLocation("tf:blocks/grape_juice_still"), new ResourceLocation("tf:blocks/grape_juice_flow"));
	
	public static void registerFluids()
	{
		registerFluid(APPLE_JUICE_FLUID);
		registerFluid(GRAPE_JUICE_FLUID);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
