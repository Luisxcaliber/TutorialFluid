package com.luisxcaliber.tutorialfluid.util.handlers;

import com.luisxcaliber.tutorialfluid.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler 
{
	public static void registerCustomStateMapper()
	{
		ModelLoader.setCustomStateMapper(ModBlocks.APPLE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("tf:apple_juice_fluid", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.GRAPE_JUICE_BLOCK, new StateMapperBase()
		{
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state)
			{
				return new ModelResourceLocation("tf:grape_juice_fluid", "fluid");
			}
		});
	}
}
