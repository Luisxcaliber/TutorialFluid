package com.luisxcaliber.tutorialfluid.init;

import java.util.ArrayList;
import java.util.List;

import com.luisxcaliber.tutorialfluid.blocks.BlockFluid;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Fluids
	public static final Block APPLE_JUICE_BLOCK = new BlockFluid("apple_juice_fluid", ModFluids.APPLE_JUICE_FLUID, Material.WATER);
	public static final Block GRAPE_JUICE_BLOCK = new BlockFluid("grape_juice_fluid", ModFluids.GRAPE_JUICE_FLUID, Material.LAVA);
}
