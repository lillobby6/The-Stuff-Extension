package com.tse.common.client.integration.tconstruct;

import com.tse.common.core.TheStuffExtension;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.client.MaterialRenderInfo;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.materials.MaterialTypes;
import slimeknights.tconstruct.tools.TinkerTraits;

public class TConstructHelper extends CompatModule
{
	public static final Material tyionetium = new Material("tyionetium", 0xEA00EA);
	public static final Material titanium = new Material("titanium", 0xE2E2E2);
	public static final Material brightflame = new Material("brightflame", 0x6C0408);
	public static final Material brightsteel = new Material("brightsteel", 0x2F4B4A);

	public static Fluid fluidTitanium;
	public static Fluid fluidTyionetium;
	public static Fluid fluidBrightflame;
	public static Fluid fluidBrightsteel;
	
	static
	{
		fluidTitanium = setupFluid(new FluidColoredMetal("titanium", 0xFF5400, 1600));
		sendFluidForMelting("Titanium", fluidTitanium);
		
		fluidTyionetium = setupFluid(new FluidColoredMetal("tyionetium", 0xFF007C, 1200));
		sendFluidForMelting("Tyionetium", fluidTyionetium);
		
		fluidBrightflame = setupFluid(new FluidColoredMetal("brightflame", 0xE41408, 1000));
		sendFluidForMelting("Brightflame", fluidBrightflame);
		
		fluidBrightsteel = setupFluid(new FluidColoredMetal("brightsteel", 0x2F4B4A, 1000));
		sendFluidForMelting("Brightsteel", fluidBrightsteel);
		
	}

	public void preInit()
	{
		TinkerRegistry.addMaterialStats(titanium, 
				new HeadMaterialStats(3100, 7.0F, 4.0F, 3),
				new HandleMaterialStats(0.8F, 600),
				new ExtraMaterialStats(400));
		try
		{
			TinkerRegistry.integrate(titanium, fluidTitanium, "Titanium").toolforge().preInit();
		} 
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'titanium' has already been registered", e);
		}
		
		TinkerRegistry.addMaterialStats(tyionetium, 
				new HeadMaterialStats(2600, 12.0F, 4.0F, 5),
				new HandleMaterialStats(1.2F, 200),
				new ExtraMaterialStats(50));
		TinkerRegistry.integrate(tyionetium, fluidTyionetium, "Tyionetium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(brightflame,
				new HeadMaterialStats(7526, 22.0F, 8.2F, 6),
				new HandleMaterialStats(0.1F, 20),
				new ExtraMaterialStats(300));
		TinkerRegistry.integrate(brightflame, fluidBrightflame, "Brightflame").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(brightsteel,
				new HeadMaterialStats(6888, 25.0F, 4.0F, 6),
				new HandleMaterialStats(0.5F, 50),
				new ExtraMaterialStats(230));
		TinkerRegistry.integrate(brightsteel, fluidBrightsteel, "Brightsteel").toolforge().preInit();
	}
	public void init()
	{
		titanium.setCastable(true).setCraftable(false);
		titanium.addTrait(TinkerTraits.lightweight);
		
		tyionetium.setCastable(true).setCraftable(false);
		tyionetium.addTrait(TinkerTraits.magnetic2);
		
		brightflame.setCastable(true).setCraftable(false);
		brightflame.addTrait(TinkerTraits.autosmelt, MaterialTypes.HEAD);
		brightflame.addTrait(TinkerTraits.flammable, MaterialTypes.EXTRA);
		brightflame.addTrait(TinkerTraits.superheat, MaterialTypes.HANDLE);
		
		brightsteel.setCastable(true).setCraftable(false);
		brightsteel.addTrait(TinkerTraits.sharp, MaterialTypes.HEAD);
		brightsteel.addTrait(TinkerTraits.dense, MaterialTypes.EXTRA);
		brightsteel.addTrait(TinkerTraits.heavy, MaterialTypes.HANDLE);
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void clientPostInit()
	{
		//titanium.setRenderInfo(new MaterialRenderInfo.Metal(0xE2E2E2, 0.1F, 0.1F, 0F));
	}
	
	public static Item getBlockItem(Block block)
	{
		return new ItemBlock(block).setRegistryName(block.getUnlocalizedName()).setUnlocalizedName(block.getUnlocalizedName());
	}

	public static Fluid sendFluidForMelting(String ore, Fluid fluid)
	{
		NBTTagCompound tag = new NBTTagCompound();
		tag.setString("fluid", fluid.getName());
		tag.setString("ore", ore);
		tag.setBoolean("toolforge", true);
		FMLInterModComms.sendMessage("tconstruct", "integrateSmeltery", tag);
		return fluid;
	}

	public static void sendAlloyForMelting(FluidStack output, Object... input)
	{
		assert (input.length%2==0);
		FluidStack[] inputStacks = new FluidStack[input.length/2];
		for(int i = 0; i < inputStacks.length; i++)
			if(input[i*2] instanceof String&&input[i*2+1] instanceof Integer)
			{
				Fluid f = FluidRegistry.getFluid((String)input[i*2]);
				if(f!=null)
					inputStacks[i] = new FluidStack(f, (Integer)input[i*2+1]);
			}

		NBTTagList tagList = new NBTTagList();
		tagList.appendTag(output.writeToNBT(new NBTTagCompound()));
		for(FluidStack stack : inputStacks)
			if(stack!=null)
				tagList.appendTag(stack.writeToNBT(new NBTTagCompound()));

		NBTTagCompound message = new NBTTagCompound();
		message.setTag("alloy", tagList);
		TinkerRegistry.registerAlloy(output, inputStacks);
	}


	public static class FluidColoredMetal extends Fluid
	{
		public static ResourceLocation ICON_MetalStill = new ResourceLocation("tconstruct:blocks/fluids/molten_metal");
		public static ResourceLocation ICON_MetalFlowing = new ResourceLocation("tconstruct:blocks/fluids/molten_metal_flow");

		int colour;

		public FluidColoredMetal(String name, int colour, int temp)
		{
			super(name, ICON_MetalStill, ICON_MetalFlowing);
			this.colour = colour;
			this.setTemperature(temp);
			this.setDensity(2000);
			this.setViscosity(10000);
		}

		@Override
		public int getColor()
		{
			return colour|0xff000000;
		}
	}
	
	public static Fluid setupFluid(Fluid fluid)
	{
		FluidRegistry.addBucketForFluid(fluid);
		if(!FluidRegistry.registerFluid(fluid))
			return FluidRegistry.getFluid(fluid.getName());
		return fluid;
	}
	@Override
	public void registerRecipes() {
	}
	@Override
	public void postInit() {
	}
	
	@SideOnly(Side.CLIENT)
	public void clientPreInit()
	{
		//((TSEBlockFluid) blockMoltenTitanium).render();
	}
}
