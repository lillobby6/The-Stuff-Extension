package com.tse.common.integration.tconstruct;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.integration.CompatModule;
import com.tse.common.integration.tconstruct.trait.TSETraits;

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
	public static final Material reforgedGold = new Material("reforgedGold", 0x707035);
	public static final Material magic = new Material("magic", 0x001EBF);
	public static final Material mithril = new Material("mithril", 0x4C8AA9);
	public static final Material mortium = new Material("mortium", 0x29131C);
	public static final Material mysterious = new Material("mysterious", 0x9D35B5);
	public static final Material mystic = new Material("mystic", 0x00C9BF);
	public static final Material skyIron = new Material("sky_iron", 0x28292A);
	public static final Material terrium = new Material("terrium", 0x55BB57);
	public static final Material vividium = new Material("vividium", 0x05B200);
	public static final Material extranetium = new Material("extranetium", 0x65BBBC);
	

	public static Fluid fluidTitanium;
	public static Fluid fluidTyionetium;
	public static Fluid fluidBrightflame;
	public static Fluid fluidBrightsteel;
	public static Fluid fluidReforgedGold;
	public static Fluid fluidMagic;
	public static Fluid fluidMithril;
	public static Fluid fluidMortium;
	public static Fluid fluidMysterious;
	public static Fluid fluidMystic;
	public static Fluid fluidSkyIron;
	public static Fluid fluidTerrium;
	public static Fluid fluidToslotrium;
	public static Fluid fluidVividium;
	public static Fluid fluidExtranetium;
	
	
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
		
		fluidReforgedGold = setupFluid(new FluidColoredMetal("reforged_gold", 0xBA8259, 800));
		sendFluidForMelting("GoldReforged", fluidReforgedGold);
		
		fluidMagic = setupFluid(new FluidColoredMetal("magic", 0x955BC6, 1400));
		sendFluidForMelting("Magic", fluidMagic);
		
		fluidMithril = setupFluid(new FluidColoredMetal("mithril", 0x4C50A9, 900));
		sendFluidForMelting("Mithril", fluidMithril);
		
		fluidMortium = setupFluid(new FluidColoredMetal("mortium", 0xA3131C, 1200));
		sendFluidForMelting("Mortium", fluidMortium);
		
		fluidMysterious = setupFluid(new FluidColoredMetal("mysterious", 0x5535B5, 1100));
		sendFluidForMelting("Mysterious", fluidMysterious);
		
		fluidMystic = setupFluid(new FluidColoredMetal("mystic", 0x26EE8F, 1600));
		sendFluidForMelting("Mystic", fluidMystic);
		
		fluidSkyIron = setupFluid(new FluidColoredMetal("sky_iron", 0x9F292A, 1500));
		sendFluidForMelting("IronSky", fluidSkyIron);
		
		fluidTerrium = setupFluid(new FluidColoredMetal("terrium", 0x55BBD1, 1800));
		sendFluidForMelting("Terrium", fluidTerrium);
		
		fluidToslotrium = setupFluid(new FluidColoredMetal("toslotrium", 0xD38C00, 500));
		sendFluidForMelting("Toslotrium", fluidToslotrium);
		
		fluidVividium = setupFluid(new FluidColoredMetal("vividium", 0x053700, 1200));
		sendFluidForMelting("Vividium", fluidVividium);
		
		fluidExtranetium = setupFluid(new FluidColoredMetal("extranetium", 0x652FBC, 1234));
		sendFluidForMelting("Extranetium", fluidExtranetium);
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
	
		TinkerRegistry.addMaterialStats(reforgedGold,
				new HeadMaterialStats(100, 10.0F, 2.0F, 2),
				new HandleMaterialStats(1.2F, -20),
				new ExtraMaterialStats(25));
		TinkerRegistry.integrate(reforgedGold, fluidReforgedGold, "GoldReforged").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(magic, 
				new HeadMaterialStats(9243, 28.0F, 8.6F, 6),
				new HandleMaterialStats(0.4F, 300),
				new ExtraMaterialStats(1000));
		TinkerRegistry.integrate(magic, fluidMagic, "Magic").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(mithril,
				new HeadMaterialStats(9420, 29.0F, 11.0F, 7),
				new HandleMaterialStats(0.2F, 4000),
				new ExtraMaterialStats(400));
		try
		{
			TinkerRegistry.integrate(mithril, fluidMithril, "Mithril").toolforge().preInit();
		} 
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'mithril' has already been registered", e);
		}
		
		TinkerRegistry.addMaterialStats(mortium,
				new HeadMaterialStats(1984, 7.5F, 4.3F, 4),
				new HandleMaterialStats(0.8F, -250),
				new ExtraMaterialStats(120));
		TinkerRegistry.integrate(mortium, fluidMortium, "Mortium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(mysterious,
				new HeadMaterialStats(7777, 23.0F, 7.7F, 6),
				new HandleMaterialStats(1.1F, 777),
				new ExtraMaterialStats(444));
		TinkerRegistry.integrate(mysterious, fluidMysterious, "Mysterious").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(mystic,
				new HeadMaterialStats(6920, 15.0F, 5.0F, 5),
				new HandleMaterialStats(1.6F, -1000),
				new ExtraMaterialStats(500));
		TinkerRegistry.integrate(mystic, fluidMystic, "Mystic").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(skyIron,
				new HeadMaterialStats(240, 6.5F, 3.0F, 2),
				new HandleMaterialStats(0.7F, 80),
				new ExtraMaterialStats(55));
		TinkerRegistry.integrate(skyIron, fluidSkyIron, "IronSky").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(terrium,
				new HeadMaterialStats(2727, 11.6F, 3.4F, 5),
				new HandleMaterialStats(0.6F, -200),
				new ExtraMaterialStats(500));
		TinkerRegistry.integrate(terrium, fluidTerrium, "Terrium").toolforge().preInit();
		
		TinkerRegistry.integrate(fluidToslotrium, "Toslotrium").preInit();
		
		TinkerRegistry.addMaterialStats(vividium,
				new HeadMaterialStats(1984, 10.3F, 2.1F, 5),
				new HandleMaterialStats(0.9F, -100),
				new ExtraMaterialStats(200));
		TinkerRegistry.integrate(vividium, fluidVividium, "Vividium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(extranetium, 
				new HeadMaterialStats(13100, 30.0F, 10.5F, 8),
				new HandleMaterialStats(1.0F, 1000),
				new ExtraMaterialStats(1000));
		TinkerRegistry.integrate(extranetium, fluidExtranetium, "Extranetium").toolforge().preInit();
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
		
		reforgedGold.setCastable(true).setCraftable(false);
		reforgedGold.addTrait(TinkerTraits.shocking);
		
		magic.setCastable(true).setCraftable(false);
		magic.addTrait(TinkerTraits.holy);
		magic.addTrait(TinkerTraits.lightweight);
		
		mithril.setCastable(true).setCraftable(false);
		mithril.addTrait(TinkerTraits.alien);
		
		//TODO Add NuclearCraft compat with Withering
		mortium.setCastable(true).setCraftable(false);
		mortium.addTrait(TinkerTraits.coldblooded);
		
		mysterious.setCastable(true).setCraftable(false);
		mysterious.addTrait(TinkerTraits.petramor);
		
		mystic.setCastable(true).setCraftable(false);
		mystic.addTrait(TinkerTraits.duritos, MaterialTypes.EXTRA);
		mystic.addTrait(TinkerTraits.duritos, MaterialTypes.HEAD);
		mystic.addTrait(TinkerTraits.momentum, MaterialTypes.HANDLE);
		
		skyIron.setCastable(true).setCraftable(false);
		skyIron.addTrait(TinkerTraits.alien, MaterialTypes.HEAD);
		skyIron.addTrait(TinkerTraits.magnetic, MaterialTypes.HANDLE);
		skyIron.addTrait(TinkerTraits.magnetic, MaterialTypes.EXTRA);
		
		terrium.setCastable(true).setCraftable(false);
		terrium.addTrait(TinkerTraits.duritos, MaterialTypes.HEAD);
		terrium.addTrait(TinkerTraits.dense, MaterialTypes.EXTRA);
		terrium.addTrait(TinkerTraits.heavy, MaterialTypes.HANDLE);
		
		vividium.setCastable(true).setCraftable(false);
		vividium.addTrait(TSETraits.AMELIORATING);
		
		extranetium.setCastable(true).setCraftable(false);
		extranetium.addTrait(TinkerTraits.insatiable);
	}
	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void clientPostInit() {}

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
	public void registerRecipes() {}
	@Override
	public void postInit() {}
	
	@SideOnly(Side.CLIENT)
	public void clientPreInit() {}
}
