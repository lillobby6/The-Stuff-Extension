package com.tse.common.integration.tconstruct;

import com.tse.common.core.TheStuffExtension;
import com.tse.common.integration.CompatModule;
import com.tse.common.integration.tconstruct.trait.TSETraits;
import com.tse.common.world.item.ItemManager;

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
import slimeknights.tconstruct.tools.TinkerMaterials;
import slimeknights.tconstruct.tools.TinkerTraits;

public class TConstructHelper extends CompatModule
{
	public static final Material tyionetium = new Material("tyionetium", 0xEA00EA);
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
	public static final Material platinum = new Material("platinum", 0xF2F2F2);
	public static final Material titanium = new Material("titanium", 0xE2E2E2);
	public static final Material pewter = new Material("pewter", 0xD0DBDB);
	public static final Material mnemium = new Material("mnemium", 0xCC00A3);
	public static final Material eternium = new Material("eternium", 0x420099);
	public static final Material fantasium = new Material("fantasium", 0x7241C1);
	public static final Material scornium = new Material("scornium", 0xB25049);
	public static final Material laenium = new Material("laenium", 0xC66300);
	public static final Material magneium = new Material("magneium", 0x88A8D8);
	public static final Material sterlingSilver = new Material("sterling_silver", 0xEDEDED);
	public static final Material roseGold = new Material("rose_gold", 0xD8B1AD);
	public static final Material whiteGold = new Material("white_gold", 0xDBDBDB);
	public static final Material spangold = new Material("spangold", 0xE2C42D);
	public static final Material meteoricIron = new Material("meteoric_iron", 0xCCCCCC);
	public static final Material maduum = new Material("maduum", 0x8E3900);
	public static final Material immortalium = new Material("immortalium", 0x993A00);
	public static final Material dream = new Material("dream", 0xB7A0E5);

	public static Fluid fluidToslotrium;
	public static Fluid fluidDiamond;
	
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
	public static Fluid fluidVividium;
	public static Fluid fluidExtranetium;
	public static Fluid fluidPlatinum;
	public static Fluid fluidTitanium;
	public static Fluid fluidPewter;
	public static Fluid fluidMnemium;
	public static Fluid fluidEternium;
	public static Fluid fluidFantasium;
	public static Fluid fluidScornium;
	public static Fluid fluidLaenium;
	public static Fluid fluidMagneium;
	public static Fluid fluidSterlingSilver;
	public static Fluid fluidRoseGold;
	public static Fluid fluidWhiteGold;
	public static Fluid fluidSpangold;
	public static Fluid fluidMeteoricIron;
	public static Fluid fluidMaduum;
	public static Fluid fluidImmortalium;
	public static Fluid fluidDream;
	
	static
	{
		//(int)(0.5 * RL Melting Point) - Math conversion made Titanium RL = 1668, Iron RL = 1538; Iron TiC Block = 469, Titanium = 508.64 (Block); Iron TiC Reg = 769, Titanium Reg, 469/769  = 508.64/x, x = 834; Modifier = 834/1668 = .5
		fluidToslotrium = setupFluid(new FluidColoredMetal("toslotrium", 0xD38C00, (int)(0.5 * 1000)));
		sendFluidForMelting("Toslotrium", fluidToslotrium);
		
		fluidDiamond = setupFluid(new FluidColoredMetal("diamond", 0x38DAFF, (int)(0.5 * 4000)));
		sendFluidForMelting("Diamond", fluidDiamond);
		
		
		fluidTyionetium = setupFluid(new FluidColoredMetal("tyionetium", 0xFF007C, (int)(0.5 * 1200)));
		sendFluidForMelting("Tyionetium", fluidTyionetium);
		
		fluidBrightflame = setupFluid(new FluidColoredMetal("brightflame", 0xE41408, (int)(0.5 * 1000)));
		sendFluidForMelting("Brightflame", fluidBrightflame);
		
		fluidBrightsteel = setupFluid(new FluidColoredMetal("brightsteel", 0x2F4B4A, (int)(0.5 * 1000)));
		sendFluidForMelting("Brightsteel", fluidBrightsteel);
		
		fluidReforgedGold = setupFluid(new FluidColoredMetal("reforged_gold", 0xBA8259, (int)(0.5 * 1064.18)));
		sendFluidForMelting("GoldReforged", fluidReforgedGold);
		
		fluidMagic = setupFluid(new FluidColoredMetal("magic", 0x955BC6, (int)(0.5 * 1400)));
		sendFluidForMelting("Magic", fluidMagic);
		
		fluidMithril = setupFluid(new FluidColoredMetal("mithril", 0x4C50A9, (int)(0.5 * 2200)));
		sendFluidForMelting("Mithril", fluidMithril);
		
		fluidMortium = setupFluid(new FluidColoredMetal("mortium", 0xA3131C, (int)(0.5 * 1200)));
		sendFluidForMelting("Mortium", fluidMortium);
		
		fluidMysterious = setupFluid(new FluidColoredMetal("mysterious", 0x5535B5, (int)(0.5 * 1100)));
		sendFluidForMelting("Mysterious", fluidMysterious);
		
		fluidMystic = setupFluid(new FluidColoredMetal("mystic", 0x26EE8F, (int)(0.5 * 1600)));
		sendFluidForMelting("Mystic", fluidMystic);
		
		fluidSkyIron = setupFluid(new FluidColoredMetal("sky_iron", 0x9F292A, (int)(0.5 * 1500)));
		sendFluidForMelting("IronSky", fluidSkyIron);
		
		fluidTerrium = setupFluid(new FluidColoredMetal("terrium", 0x55BBD1, (int)(0.5 * 1800)));
		sendFluidForMelting("Terrium", fluidTerrium);
		
		fluidVividium = setupFluid(new FluidColoredMetal("vividium", 0x053700, (int)(0.5 * 1200)));
		sendFluidForMelting("Vividium", fluidVividium);
		
		fluidExtranetium = setupFluid(new FluidColoredMetal("extranetium", 0x652FBC, (int)(0.5 * 1234)));
		sendFluidForMelting("Extranetium", fluidExtranetium);
		
		fluidPlatinum = setupFluid(new FluidColoredMetal("platinum", 0xBA9494, (int)(0.5 * 1768.3)));
		sendFluidForMelting("Platinum", fluidPlatinum);
		
		fluidTitanium = setupFluid(new FluidColoredMetal("titanium", 0xFF5400, (int)(0.5* 1668)));
		sendFluidForMelting("Titanium", fluidTitanium);
		
		fluidPewter = setupFluid(new FluidColoredMetal("pewter", 0x8BBCBC, (int)(0.5 * 1000)));
		sendFluidForMelting("Pewter", fluidPewter);
		
		fluidMnemium = setupFluid(new FluidColoredMetal("mnemium", 0x9300A3, (int)(0.5 * 1531)));
		sendFluidForMelting("Mnemium", fluidMnemium);
		
		fluidEternium = setupFluid(new FluidColoredMetal("eternium", 0xB40099, (int)(0.5 * 2450)));
		sendFluidForMelting("Eternium", fluidEternium);
		
		fluidFantasium = setupFluid(new FluidColoredMetal("fantasium", 0x148AC1, (int)(0.5 * 900)));
		sendFluidForMelting("Fantasium", fluidFantasium);
		
		fluidScornium = setupFluid(new FluidColoredMetal("scornium", 0xE5446E, (int)(0.5 * 1200)));
		sendFluidForMelting("Scornium", fluidScornium);
		
		fluidLaenium = setupFluid(new FluidColoredMetal("laenium", 0xC66352, (int)(0.5 * 1900)));
		sendFluidForMelting("Laenium", fluidLaenium);
		
		fluidMagneium = setupFluid(new FluidColoredMetal("magneium", 0x88A880, (int)(0.5 * 1300)));
		sendFluidForMelting("Magneium", fluidMagneium);
		
		fluidSterlingSilver = setupFluid(new FluidColoredMetal("sterling_silver", 0xCECECE, (int)(0.5 * 1000)));
		sendFluidForMelting("SilverSterling", fluidSterlingSilver);
		
		fluidRoseGold = setupFluid(new FluidColoredMetal("rose_gold", 0xD6746B, (int)(0.5 * 1000)));
		sendFluidForMelting("GoldRose", fluidRoseGold);
		
		fluidWhiteGold = setupFluid(new FluidColoredMetal("white_gold", 0xF2F2DF, (int)(0.5 * 1000)));
		sendFluidForMelting("GoldWhite", fluidWhiteGold);
		
		fluidSpangold = setupFluid(new FluidColoredMetal("spangold", 0xE2A12D, (int)(0.5*1000)));
		sendFluidForMelting("Spangold", fluidSpangold);
		
		fluidMeteoricIron = setupFluid(new FluidColoredMetal("meteoric_iron", 0xA33B3B, (int)(0.5*1538)));
		sendFluidForMelting("IronMeteoric", fluidMeteoricIron);
		
		fluidMaduum = setupFluid(new FluidColoredMetal("maduum", 0x8E8A00, (int)(0.5*2300)));
		sendFluidForMelting("Maduum", fluidMaduum);
		
		fluidImmortalium = setupFluid(new FluidColoredMetal("immortalium", 0x999500, (int)(0.5*2600)));
		sendFluidForMelting("Immortalium", fluidImmortalium);
		
		fluidDream = setupFluid(new FluidColoredMetal("dream", 0xB77E8C, (int)(0.5*1400)));
		sendFluidForMelting("Dream", fluidDream);
	}
	

	public void preInit()
	{
		sendAlloyForMelting(new FluidStack(fluidFantasium, 2), "mysterious", 1, "mystic", 1);
		sendAlloyForMelting(new FluidStack(fluidScornium, 2), "tyionetium", 1, "toslotrium", 1);
		sendAlloyForMelting(new FluidStack(fluidExtranetium, 2), "mithril", 1, "scornium", 1);
		sendAlloyForMelting(new FluidStack(fluidMithril, 2), "fantasium", 1, "magic", 1);
		sendAlloyForMelting(new FluidStack(fluidMystic, 2), "diamond", 1, "toslotrium", 1);
		sendAlloyForMelting(new FluidStack(fluidMysterious, 2), "reforged_gold", 1, "tyionetium", 1);
		sendAlloyForMelting(new FluidStack(fluidMnemium, 2), "titanium", 1, "extranetium", 1);
		sendAlloyForMelting(new FluidStack(fluidLaenium, 2), "brightflame", 1, "platinum", 1);
		sendAlloyForMelting(new FluidStack(fluidLaenium, 2), "brightsteel", 1, "platinum", 1);
		sendAlloyForMelting(new FluidStack(fluidMagneium, 2), "iron", 1, "gold", 1);
		sendAlloyForMelting(new FluidStack(fluidMaduum, 2), "eternium", 1, "immortalium", 1);
		sendAlloyForMelting(new FluidStack(fluidMagic, 2), "toslotrium", 1, "fantasium", 1);
		sendAlloyForMelting(new FluidStack(fluidDream, 2), "manyullyn", 1, "magic", 1);
		
		
		TinkerRegistry.addMaterialStats(tyionetium, 
				new HeadMaterialStats(2600, 12.0F, 4.0F, 5),
				new HandleMaterialStats(1.2F, 200),
				new ExtraMaterialStats(50));
		TinkerRegistry.integrate(tyionetium, fluidTyionetium, "Tyionetium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(brightflame,
				new HeadMaterialStats(7526, 22.0F, 8.2F, 5),
				new HandleMaterialStats(0.1F, 20),
				new ExtraMaterialStats(300));
		TinkerRegistry.integrate(brightflame, fluidBrightflame, "Brightflame").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(brightsteel,
				new HeadMaterialStats(6888, 25.0F, 4.0F, 5),
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
				new HandleMaterialStats(1.3F, -2000),
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
		
		TinkerRegistry.addMaterialStats(platinum,
				new HeadMaterialStats(50, 15.0F, 1.0F, 0),
				new HandleMaterialStats(1.3F, -20),
				new ExtraMaterialStats(20));
		try
		{
			TinkerRegistry.integrate(platinum, fluidPlatinum, "Platinum").toolforge().preInit();
		} 
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'platinum' has already been registered", e);
		}
		
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
		
		TinkerRegistry.addMaterialStats(pewter,
				new HeadMaterialStats(800, 5.0F, 2.4F, 3),
				new HandleMaterialStats(0.7F, 300),
				new ExtraMaterialStats(100));
		try
		{
			TinkerRegistry.integrate(pewter, fluidPewter, "Pewter").toolforge().preInit();
		} 
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'pewter' has already been registered", e);
		}
		
		TinkerRegistry.addMaterialStats(mnemium,
				new HeadMaterialStats(12000, 49.0F, 23.0F, 9),
				new HandleMaterialStats(2.1F, -5000),
				new ExtraMaterialStats(4000));
		TinkerRegistry.integrate(mnemium, fluidMnemium, "Mnemium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(eternium,
				new HeadMaterialStats(2000, 40.0F, 86.0F, 10),
				new HandleMaterialStats(1.5F, 800),
				new ExtraMaterialStats(750));
		TinkerRegistry.integrate(eternium, fluidEternium, "Eternium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(fantasium,
				new HeadMaterialStats(8000, 22.0F, 8.0F, 5),
				new HandleMaterialStats(0.8F, 800),
				new ExtraMaterialStats(500));
		TinkerRegistry.integrate(fantasium, fluidFantasium, "Fantasium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(laenium,
				new HeadMaterialStats(450, 45.0F, 2.0F, 4),
				new HandleMaterialStats(0.9F, -20),
				new ExtraMaterialStats(30));
		TinkerRegistry.integrate(laenium, fluidLaenium, "Laenium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(magneium,
				new HeadMaterialStats(175, 8.0F, 1.0F, 2),
				new HandleMaterialStats(1F, -50),
				new ExtraMaterialStats(25));
		TinkerRegistry.integrate(magneium, fluidMagneium, "Magneium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(sterlingSilver,
				new HeadMaterialStats(90, 8.0F, 0.0F, 1),
				new HandleMaterialStats(1.2F, -50),
				new ExtraMaterialStats(75));
		try
		{
			TinkerRegistry.integrate(sterlingSilver, fluidSterlingSilver, "SilverSterling").toolforge().preInit();
		}
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'sterling_silver' has already been registered", e);
		}
		
		TinkerRegistry.addMaterialStats(roseGold,
				new HeadMaterialStats(20, 12.0F, 0.0F, 0),
				new HandleMaterialStats(1.1F, -30),
				new ExtraMaterialStats(20));
		try
		{
			TinkerRegistry.integrate(roseGold, fluidRoseGold, "GoldRose").toolforge().preInit();
		}
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'rose_gold' has already been registered", e);
		}
		
		TinkerRegistry.addMaterialStats(whiteGold,
				new HeadMaterialStats(11, 13.0F, 0.0F, 0),
				new HandleMaterialStats(0.9F, -20),
				new ExtraMaterialStats(22));
		try
		{
			TinkerRegistry.integrate(whiteGold, fluidWhiteGold, "GoldWhite").toolforge().preInit();
		}
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'white_gold' has already been registered", e);
		}
		
		TinkerRegistry.addMaterialStats(spangold,
				new HeadMaterialStats(33, 13.0F, 0.0F, 0),
				new HandleMaterialStats(0.5F, 5),
				new ExtraMaterialStats(15));
		try
		{
			TinkerRegistry.integrate(spangold, fluidSpangold, "Spangold").toolforge().preInit();
		}
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'spangold' has already been registered", e);
		}
		
		TinkerRegistry.addMaterialStats(meteoricIron,
				new HeadMaterialStats(150, 6.0F, 1.7F, 2),
				new HandleMaterialStats(.75F, 100),
				new ExtraMaterialStats(50));
		try
		{
			TinkerRegistry.integrate(meteoricIron, fluidMeteoricIron, "IronMeteoric").toolforge().preInit();
		}
		catch(Exception e)
		{
			TheStuffExtension.logError("[TCon] Material 'meteoric_iron' has already been registered", e);
		}
		
		TinkerRegistry.addMaterialStats(maduum,
				new HandleMaterialStats(3.0F, -10000));
		TinkerRegistry.integrate(maduum, fluidMaduum, "Maduum").preInit();
		
		TinkerRegistry.addMaterialStats(immortalium,
				new HeadMaterialStats(20000, 86.0F, 40.0F, 10),
				new HandleMaterialStats(1.4F, 200),
				new ExtraMaterialStats(1000));
		TinkerRegistry.integrate(immortalium, fluidImmortalium, "Immortalium").toolforge().preInit();
		
		TinkerRegistry.addMaterialStats(dream,
				new HeadMaterialStats(8451, 12.0F, 13.0F, 7),
				new HandleMaterialStats(1.6F, -3000),
				new ExtraMaterialStats(900));
		TinkerRegistry.integrate(dream, fluidDream, "Dream").toolforge().preInit();
				
		
	}
	public void init()
	{	
		tyionetium.setCastable(true).setCraftable(false);
		tyionetium.addTrait(TinkerTraits.magnetic2);
		tyionetium.addCommonItems("Tyionetium");
		tyionetium.addItem(ItemManager.tyionetiumIngot, 1, 144);
		tyionetium.setRepresentativeItem(ItemManager.tyionetiumIngot);
	
		brightflame.setCastable(true).setCraftable(false);
		brightflame.addTrait(TinkerTraits.autosmelt, MaterialTypes.HEAD);
		brightflame.addTrait(TinkerTraits.flammable, MaterialTypes.EXTRA);
		brightflame.addTrait(TinkerTraits.superheat, MaterialTypes.HANDLE);
		brightflame.addCommonItems("Brightflame");
		brightflame.addItem(ItemManager.brightflameIngot, 1, 144);
		brightflame.setRepresentativeItem(ItemManager.brightflameIngot);
		
		brightsteel.setCastable(true).setCraftable(false);
		brightsteel.addTrait(TinkerTraits.sharp, MaterialTypes.HEAD);
		brightsteel.addTrait(TinkerTraits.dense, MaterialTypes.EXTRA);
		brightsteel.addTrait(TinkerTraits.heavy, MaterialTypes.HANDLE);
		brightsteel.addCommonItems("Brightsteel");
		brightsteel.addItem(ItemManager.brightsteelIngot, 1, 144);
		brightsteel.setRepresentativeItem(ItemManager.brightsteelIngot);
		
		reforgedGold.setCastable(true).setCraftable(false);
		reforgedGold.addTrait(TinkerTraits.shocking);
		reforgedGold.addCommonItems("GoldReforged");
		reforgedGold.addItem(ItemManager.reforgedGoldIngot);
		reforgedGold.setRepresentativeItem(ItemManager.reforgedGoldIngot);
		
		magic.setCastable(true).setCraftable(false);
		magic.addTrait(TinkerTraits.holy);
		magic.addTrait(TinkerTraits.lightweight);
		magic.addCommonItems("Magic");
		magic.addItem(ItemManager.magicIngot, 1, 144);
		magic.setRepresentativeItem(ItemManager.magicIngot);
		
		mithril.setCastable(true).setCraftable(false);
		mithril.addTrait(TinkerTraits.alien);
		mithril.addCommonItems("Mithril");
		mithril.addItem(ItemManager.mithrilIngot, 1, 144);
		mithril.setRepresentativeItem(ItemManager.mithrilIngot);
		
		//TODO Add NuclearCraft compat with Withering
		mortium.setCastable(true).setCraftable(false);
		mortium.addTrait(TinkerTraits.coldblooded);
		mortium.addCommonItems("Mortium");
		mortium.addItem(ItemManager.mortiumIngot, 1, 144);
		mortium.setRepresentativeItem(ItemManager.mortiumIngot);
	
		mysterious.setCastable(true).setCraftable(false);
		mysterious.addTrait(TinkerTraits.petramor);
		mysterious.addCommonItems("Mysterious");
		mysterious.addItem(ItemManager.mysteriousIngot, 1, 144);
		mysterious.setRepresentativeItem(ItemManager.mysteriousIngot);
		
		mystic.setCastable(true).setCraftable(false);
		mystic.addTrait(TinkerTraits.duritos, MaterialTypes.EXTRA);
		mystic.addTrait(TinkerTraits.duritos, MaterialTypes.HEAD);
		mystic.addTrait(TinkerTraits.momentum, MaterialTypes.HANDLE);
		mystic.addCommonItems("Mystic");
		mystic.addItem(ItemManager.mysticIngot, 1, 144);
		mystic.setRepresentativeItem(ItemManager.mysticIngot);
		
		skyIron.setCastable(true).setCraftable(false);
		skyIron.addTrait(TinkerTraits.alien, MaterialTypes.HEAD);
		skyIron.addTrait(TinkerTraits.magnetic, MaterialTypes.HANDLE);
		skyIron.addTrait(TinkerTraits.magnetic, MaterialTypes.EXTRA);
		skyIron.addCommonItems("IronSky");
		skyIron.addItem(ItemManager.skyIronIngot, 1, 144);
		skyIron.setRepresentativeItem(ItemManager.skyIronIngot);
		
		terrium.setCastable(true).setCraftable(false);
		terrium.addTrait(TinkerTraits.duritos, MaterialTypes.HEAD);
		terrium.addTrait(TinkerTraits.dense, MaterialTypes.EXTRA);
		terrium.addTrait(TinkerTraits.heavy, MaterialTypes.HANDLE);
		terrium.addCommonItems("Terrium");
		terrium.addItem(ItemManager.terriumIngot);
		terrium.setRepresentativeItem(ItemManager.terriumIngot);
		
		vividium.setCastable(true).setCraftable(false);
		vividium.addTrait(TSETraits.AMELIORATING);
		vividium.addCommonItems("Vividium");
		vividium.addItem(ItemManager.vividiumIngot);
		vividium.setRepresentativeItem(ItemManager.vividiumIngot);
		
		extranetium.setCastable(true).setCraftable(false);
		extranetium.addTrait(TinkerTraits.insatiable);
		extranetium.addCommonItems("Extranetium");
		extranetium.addItem(ItemManager.extranetiumIngot, 1, 144);
		extranetium.setRepresentativeItem(ItemManager.extranetiumIngot);
		
		platinum.setCastable(true).setCraftable(false);
		platinum.addTrait(TinkerTraits.holy);
		platinum.addCommonItems("Platinum");
		platinum.addItem(ItemManager.platinumIngot);
		platinum.setRepresentativeItem(ItemManager.platinumIngot);
		
		titanium.setCastable(true).setCraftable(false);
		titanium.addTrait(TinkerTraits.lightweight);
		titanium.addCommonItems("Titanium");
		titanium.addItem(ItemManager.titaniumIngot, 1, 144);
		titanium.setRepresentativeItem(ItemManager.titaniumIngot);
		
		pewter.setCastable(true).setCraftable(false);
		pewter.addTrait(TinkerTraits.lightweight);
		pewter.addItem(ItemManager.pewterIngot, 1, 144);
		pewter.addCommonItems("Pewter");
		pewter.setRepresentativeItem(ItemManager.pewterIngot);
		
		mnemium.setCastable(true).setCraftable(false);
		mnemium.addTrait(TinkerTraits.insatiable);
		mnemium.addTrait(TinkerTraits.momentum);
		mnemium.addCommonItems("Mnemium");
		mnemium.addItem(ItemManager.mnemiumIngot, 1, 144);
		mnemium.setRepresentativeItem(ItemManager.mnemiumIngot);
		
		eternium.setCastable(true).setCraftable(false);
		eternium.addTrait(TinkerTraits.established);
		eternium.addTrait(TinkerTraits.unnatural);
		eternium.addCommonItems("Eternium");
		eternium.addItem(ItemManager.eterniumIngot, 1, 144);
		eternium.setRepresentativeItem(ItemManager.eterniumIngot);
		
		fantasium.setCastable(true).setCraftable(false);
		fantasium.addItem(ItemManager.fantasiumIngot, 1, 144);
		fantasium.addCommonItems("Fantasium");
		fantasium.setRepresentativeItem(ItemManager.fantasiumIngot);
		
		laenium.setCastable(true).setCraftable(false);
		laenium.addItem(ItemManager.laeniumIngot, 1, 144);
		laenium.addCommonItems("Laenium");
		laenium.setRepresentativeItem(ItemManager.laeniumIngot);
		
		magneium.setCastable(true).setCraftable(false);
		magneium.addItem(ItemManager.magneiumIngot, 1, 144);
		magneium.addCommonItems("Mangeium");
		magneium.setRepresentativeItem(ItemManager.magneiumIngot);
		
		sterlingSilver.setCastable(true).setCraftable(false);
		sterlingSilver.addTrait(TinkerTraits.holy);
		sterlingSilver.addCommonItems("SilverSterling");
		sterlingSilver.addItem(ItemManager.sterlingSilverIngot, 1, 144);
		sterlingSilver.setRepresentativeItem(ItemManager.sterlingSilverIngot);
		
		roseGold.setCastable(true).setCraftable(false);
		roseGold.addCommonItems("GoldRose");
		roseGold.addItem(ItemManager.roseGoldIngot, 1, 144);
		roseGold.setRepresentativeItem(ItemManager.roseGoldIngot);
		
		whiteGold.setCastable(true).setCraftable(false);
		whiteGold.addCommonItems("GoldWhite");
		whiteGold.addItem(ItemManager.whiteGoldIngot, 1, 144);
		whiteGold.setRepresentativeItem(ItemManager.whiteGoldIngot);
		
		spangold.setCastable(true).setCraftable(false);
		spangold.addCommonItems("Spangold");
		spangold.addItem(ItemManager.spangoldIngot, 1, 144);
		spangold.setRepresentativeItem(ItemManager.spangoldIngot);
		
		meteoricIron.setCastable(true).setCraftable(false);
		meteoricIron.addTrait(TinkerTraits.alien);
		meteoricIron.addCommonItems("IronMeteoric");
		meteoricIron.addItem(ItemManager.meteoricIronShard, 1, 144);
		meteoricIron.addItem(ItemManager.meteoricIronShard, 1, 144);
		meteoricIron.setRepresentativeItem(ItemManager.meteoricIronIngot);
		
		maduum.setCastable(true).setCraftable(true);
		maduum.addItem(ItemManager.maduumIngot, 1, 144);
		maduum.addCommonItems("Maduum");
		maduum.setRepresentativeItem(ItemManager.maduumIngot);
		
		immortalium.setCastable(true).setCraftable(false);
		immortalium.addTrait(TinkerTraits.insatiable);
		immortalium.addTrait(TinkerTraits.unnatural);
		immortalium.addItem(ItemManager.immortaliumIngot, 1, 144);
		immortalium.addCommonItems("Immortalium");
		immortalium.setRepresentativeItem(ItemManager.immortaliumIngot);
		
		dream.setCastable(true).setCraftable(false);
		dream.addItem(ItemManager.dreamIngot);
		dream.addCommonItems("Dream");
		dream.setRepresentativeItem(ItemManager.dreamIngot);
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
