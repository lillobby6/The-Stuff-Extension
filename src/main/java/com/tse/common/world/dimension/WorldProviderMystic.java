package com.tse.common.world.dimension;

import com.tse.common.core.TheStuffExtension;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderMystic extends WorldProviderSurface{
	public WorldProviderMystic() {
		setDimension(TheStuffExtension.dimensionID);
	}

	@Override
	public Vec3d getFogColor(float f, float f1) {
		float bright = MathHelper.cos(0.25f * 3.141593F * 2.0F) * 2.0F + 0.5F;
		if (bright < 0.0F) {
			bright = 0.0F;
		}
		if (bright > 1.0F) {
			bright = 1.0F;
		}
		float red = 0.7529412F; // 192
		float green = 1.0F; // 255
		float blue = 0.8470588F; // 216
		red *= bright * 0.94F + 0.06F;
		green *= bright * 0.94F + 0.06F;
		blue *= bright * 0.91F + 0.09F;
		return new Vec3d(red, green, blue);
	}

	// Pin the celestial angle at night/evening so things that use it see night
	@Override
	public float calculateCelestialAngle(long worldTime, float partialTicks) {
		return 0.225f;
	}

	@Override
	public void init() {
		biomeProvider = new TSEBiomeProvider();
	}

	@Override
	protected void generateLightBrightnessTable() {
		float f = this.hasSkyLight ? 0.0F : 0.1F;
		for (int i = 0; i <= 15; ++i) {
			float f1 = 1.0F - (float)i / 15.0F;
			this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
		}
	}

	@Override
	public IChunkGenerator createChunkGenerator() {
		return new ChunkGeneratorMystic(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled());
	}

	/**
	 * This seems to be a function checking whether we have an ocean.
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isSkyColored() {
		return false;
	}

	@Override
	public int getAverageGroundLevel() {
		return 30;
	}

	@Override
	public double getVoidFogYFactor() {
		// allow for terrain squashing
		return super.getVoidFogYFactor() * 2.0;
	}

	@Override
	public boolean canRespawnHere() {
		// lie about this until the world is initialized
		// otherwise the server will try to generate enough terrain for a spawn point and that's annoying
		return world.getWorldInfo().isInitialized();
	}

	@Override
	public DimensionType getDimensionType() {
		return TheStuffExtension.dimType;
	}

	@Override
	public boolean isDaytime() {
		return false;
	}

	@Override
	public boolean shouldMapSpin(String entityName, double x, double z, double rotation) {
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getSkyColor(Entity cameraEntity, float partialTicks) {
		// TODO Maybe in the future we can get the return of sky color by biome?
		return new Vec3d(32 / 256.0, 34 / 256.0, 74 / 256.0);
	}

	@Override
	public void getLightmapColors(float partialTicks, float sunBrightness, float skyLight, float blockLight, float[] colors) {
		final float r = 64f / 255f, g = 85f / 255f, b = 72f / 255f;
		if (!hasSkyLight) {
			colors[0] = r + blockLight * (1.0f - r);
			colors[1] = g + blockLight * (1.0f - g);
			colors[2] = b + blockLight * (1.0f - b);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public float getStarBrightness(float partialTicks) {
		return 1.0F;
	}

	@Override
	public double getHorizon() {
		return MysticWorld.SEALEVEL;
	}

	@Override
	public Biome getBiomeForCoords(BlockPos pos) {
		Biome biome = super.getBiomeForCoords(pos);
		return biome;
	}

}
